import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -187555443
	)
	@Export("id")
	final int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1001500049
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 912708979
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1085819089
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -787205583
	)
	@Export("x")
	final int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 902682213
	)
	@Export("y")
	final int y;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2136771131
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1386060819
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIZLji;)V"
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
			this.sequenceDefinition = HealthBarDefinition.SequenceDefinition_get(var8);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = HttpMethod.getObjectDefinition(this.id);
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
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (var12 > 100 && this.sequenceDefinition.frameCount > 0) {
					var12 = 100;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					label60: {
						do {
							while (true) {
								if (var12 <= this.sequenceDefinition.frameLengths[this.frame]) {
									break label60;
								}

								var12 -= this.sequenceDefinition.frameLengths[this.frame];
								++this.frame;
								if (this.frame >= this.sequenceDefinition.frameIds.length) {
									this.frame -= this.sequenceDefinition.frameCount;
									break;
								}

								class277.method5753(this.sequenceDefinition, this.frame, var10, var11, false);
							}
						} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

						this.sequenceDefinition = null;
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
						class277.method5753(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "-1818784260"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class330.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
