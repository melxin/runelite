import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class81 extends TileItem {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	final WorldView field1033;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -498974935
	)
	final int field1037;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2014972783
	)
	final int field1031;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1927878197
	)
	final int field1035;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -367840549
	)
	final int field1032;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -57287525
	)
	final int field1034;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1355027883
	)
	final int field1029;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	SequenceDefinition field1036;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -153031421
	)
	int field1030;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1945509683
	)
	int field1038;

	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIIIIZLjc;)V"
	)
	class81(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, TileItem var10) {
		this.field1033 = var1;
		this.field1037 = var2;
		this.field1031 = var3;
		this.field1035 = var4;
		this.field1032 = var5;
		this.field1034 = var6;
		this.field1029 = var7;
		if (var8 != -1) {
			this.field1036 = WorldMapData_1.SequenceDefinition_get(var8);
			this.field1030 = 0;
			this.field1038 = Client.cycle - 1;
			if (this.field1036.restartMode == 0 && var10 instanceof class81) {
				class81 var11 = (class81)var10;
				if (var11.field1036 == this.field1036) {
					this.field1030 = var11.field1030;
					this.field1038 = var11.field1038;
					return;
				}
			}

			if (var9 && this.field1036.frameCount != -1) {
				if (!this.field1036.isCachedModelIdSet()) {
					this.field1030 = (int)(Math.random() * (double)this.field1036.frameIds.length);
					this.field1038 -= (int)(Math.random() * (double)this.field1036.frameLengths[this.field1030]);
				} else {
					this.field1030 = (int)(Math.random() * (double)this.field1036.getMayaAnimFrame());
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
		ObjectComposition var1 = class177.getObjectDefinition(this.field1037);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.field1035 != 1 && this.field1035 != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.field1034;
			int var5 = (var2 + 1 >> 1) + this.field1034;
			int var6 = (var3 >> 1) + this.field1029;
			int var7 = (var3 + 1 >> 1) + this.field1029;
			int[][] var8 = this.field1033.tileHeights[this.field1032];
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var4][var6] + var8[var5][var6] >> 2;
			int var10 = (this.field1034 << 7) + (var2 << 6);
			int var11 = (this.field1029 << 7) + (var3 << 6);
			if (this.field1036 != null) {
				int var12 = Client.cycle - this.field1038;
				if (this.field1036.frameCount > 0 && this.field1036.field2367 > 0) {
					var12 %= this.field1036.field2367;
				}

				if (!this.field1036.isCachedModelIdSet()) {
					for (; var12 > this.field1036.frameLengths[this.field1030]; MusicPatchPcmStream.method6807(this.field1036, this.field1030, var10, var11, false)) {
						var12 -= this.field1036.frameLengths[this.field1030];
						++this.field1030;
						if (this.field1030 >= this.field1036.frameIds.length) {
							this.field1030 -= this.field1036.frameCount;
							if (this.field1030 < 0 || this.field1030 >= this.field1036.frameIds.length) {
								this.field1036 = null;
								break;
							}
						}
					}
				} else {
					int var13 = this.field1036.getMayaAnimFrame();
					this.field1030 += var12;
					var12 = 0;
					if (this.field1030 >= var13) {
						this.field1030 = var13 - this.field1036.frameCount;
						if (this.field1030 < 0 || this.field1030 > var13) {
							this.field1036 = null;
						}
					}

					if (this.field1036 != null) {
						MusicPatchPcmStream.method6807(this.field1036, this.field1030, var10, var11, false);
					}
				}

				this.field1038 = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.field1031, this.field1035, var8, var10, var9, var11, this.field1036, this.field1030);
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
