import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class114 {
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = -1961960705
	)
	static int field1510;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	VorbisFloor field1505;
	@ObfuscatedName("aw")
	boolean field1511;
	@ObfuscatedName("at")
	int[] field1504;
	@ObfuscatedName("ac")
	int[] field1502;
	@ObfuscatedName("ap")
	boolean[] field1506;

	@ObfuscatedSignature(
		descriptor = "(Ldk;Z[I[I[Z)V"
	)
	class114(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field1505 = var1;
		this.field1511 = var2;
		this.field1504 = var3;
		this.field1502 = var4;
		this.field1506 = var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "74"
	)
	void method3451(float[] var1, int var2) {
		int var3 = this.field1505.field1329.length;
		VorbisFloor var10000 = this.field1505;
		int var4 = VorbisFloor.field1330[this.field1505.multiplier - 1];
		boolean[] var5 = this.field1506;
		this.field1506[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field1505.method3029(this.field1504, var6);
			var8 = this.field1505.method3030(this.field1504, var6);
			var9 = this.field1505.method3040(this.field1504[var7], this.field1502[var7], this.field1504[var8], this.field1502[var8], this.field1504[var6]);
			var10 = this.field1502[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field1506;
				this.field1506[var8] = true;
				var14[var7] = true;
				this.field1506[var6] = true;
				if (var10 >= var13) {
					this.field1502[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field1502[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field1506[var6] = false;
				this.field1502[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field1505.multiplier * this.field1502[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field1506[var8]) {
				var9 = this.field1504[var8];
				var10 = this.field1505.multiplier * this.field1502[var8];
				this.field1505.method3028(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field1505;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1533498860"
	)
	boolean method3453() {
		return this.field1511;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1396201942"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field1504[var1];
			int var5 = this.field1502[var1];
			boolean var6 = this.field1506[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field1504[var7];
				if (var8 < var4) {
					this.field1504[var3] = var8;
					this.field1502[var3] = this.field1502[var7];
					this.field1506[var3] = this.field1506[var7];
					++var3;
					this.field1504[var7] = this.field1504[var3];
					this.field1502[var7] = this.field1502[var3];
					this.field1506[var7] = this.field1506[var3];
				}
			}

			this.field1504[var3] = var4;
			this.field1502[var3] = var5;
			this.field1506[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIISISIII)V",
		garbageValue = "-765038711"
	)
	static void method3459(WorldView var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10) {
		NodeDeque var11 = var0.groundItems[var1][var2][var3];
		if (var11 != null) {
			for (TileItem var12 = (TileItem)var11.last(); var12 != null; var12 = (TileItem)var11.previous()) {
				if ((var4 & 32767) == var12.id && var5 == var12.quantity) {
					PlayerCompositionColorTextureOverride var13 = var12.method2805();
					if (var13 == null) {
						var13 = new PlayerCompositionColorTextureOverride(var4);
					}

					if (var13.method4121() && var7 > -1 && var7 < var13.playerCompositionRecolorTo.length) {
						var13.playerCompositionRecolorTo[var7] = var6;
					}

					if (var13.method4122() && var9 > -1 && var9 < var13.playerCompositionRetextureTo.length) {
						var13.playerCompositionRetextureTo[var9] = var8;
					}

					if (var10 > -1) {
						var13.field1953 = var10;
						var13.field1955 = null;
					}

					var12.method2812(var13);
					break;
				}
			}

			EnumComposition.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "356777708"
	)
	static void method3454(int var0, int var1, int var2, int var3, int var4) {
		ClientPacket.method7040(HttpHeaders.worldView, var0, var1, var2, var3, var4);
	}
}
