import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("DynamicObject")
public class DynamicObject extends Renderable
{
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -498974935
	)
	@Export("id")
	final int id;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2014972783
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1927878197
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -367840549
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -57287525
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1355027883
	)
	@Export("y")
	final int y;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -153031421
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1945509683
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIIIIZLjc;)V"
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
			this.sequenceDefinition = WorldMapData_1.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (var11.sequenceDefinition == this.sequenceDefinition) {
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class177.getObjectDefinition(this.id);
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
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var4][var6] + var8[var5][var6] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (this.sequenceDefinition.frameCount > 0 && this.sequenceDefinition.field2367 > 0) {
					var12 %= this.sequenceDefinition.field2367;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					for (; var12 > this.sequenceDefinition.frameLengths[this.frame]; MusicPatchPcmStream.method6807(this.sequenceDefinition, this.frame, var10, var11, false)) {
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
						MusicPatchPcmStream.method6807(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1906654991"
	)
	public static int method2337() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1889752374"
	)
	static final int method2333(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1659339266"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
