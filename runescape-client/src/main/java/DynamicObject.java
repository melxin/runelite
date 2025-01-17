import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1150913177
	)
	@Export("id")
	final int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 977106559
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -839326733
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -551069187
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1717963547
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1479527589
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1151289759
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1354187807
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIIIIZLhs;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = class33.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (this.sequenceDefinition == var11.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.getMayaAnimFrame());
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class142.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var7] + var8[var4][var6] + var8[var5][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (this.sequenceDefinition.frameCount > 0 && this.sequenceDefinition.field2931 > 0) {
					var12 %= this.sequenceDefinition.field2931;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					for (; var12 > this.sequenceDefinition.frameLengths[this.frame]; class271.method5839(this.sequenceDefinition, this.frame, var10, var11, false)) {
						var12 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
						if (this.frame >= this.sequenceDefinition.frameIds.length) {
							this.frame -= this.sequenceDefinition.frameCount;
							if (this.frame < 0 || this.frame >= this.sequenceDefinition.frameIds.length) {
								this.sequenceDefinition = null;
								break;
							}
						}
					}
				} else {
					int var13 = this.sequenceDefinition.getMayaAnimFrame();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						class271.method5839(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1465461977"
	)
	static void method2494(int var0, int var1) {
		if (class544.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(WorldMapSection2.field3102, var0, 0, class544.clientPreferences.getMusicVolume(), false));
			class1.method9(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	static final void method2491() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.npcCount; ++var2) {
				int var3 = var1.npcIndices[var2];
				NPC var4 = var1.npcs[var3];
				if (var4 != null) {
					MoveSpeed.updateActorSequence(var1, var4, var4.definition.size);
				}
			}
		}

	}
}
