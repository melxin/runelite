import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class113 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	VorbisFloor field1447;
	@ObfuscatedName("aj")
	boolean field1445;
	@ObfuscatedName("an")
	int[] field1446;
	@ObfuscatedName("ai")
	int[] field1448;
	@ObfuscatedName("al")
	boolean[] field1449;

	@ObfuscatedSignature(
		descriptor = "(Ldq;Z[I[I[Z)V"
	)
	class113(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field1447 = var1;
		this.field1445 = var2;
		this.field1446 = var3;
		this.field1448 = var4;
		this.field1449 = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "796489741"
	)
	void method3282(float[] var1, int var2) {
		int var3 = this.field1447.field1296.length;
		VorbisFloor var10000 = this.field1447;
		int var4 = VorbisFloor.field1299[this.field1447.multiplier - 1];
		boolean[] var5 = this.field1449;
		this.field1449[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field1447.method2901(this.field1446, var6);
			var8 = this.field1447.method2908(this.field1446, var6);
			var9 = this.field1447.method2895(this.field1446[var7], this.field1448[var7], this.field1446[var8], this.field1448[var8], this.field1446[var6]);
			var10 = this.field1448[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field1449;
				this.field1449[var8] = true;
				var14[var7] = true;
				this.field1449[var6] = true;
				if (var10 >= var13) {
					this.field1448[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field1448[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field1449[var6] = false;
				this.field1448[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field1447.multiplier * this.field1448[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field1449[var8]) {
				var9 = this.field1446[var8];
				var10 = this.field1447.multiplier * this.field1448[var8];
				this.field1447.method2894(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field1447;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	boolean method3291() {
		return this.field1445;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "734391722"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field1446[var1];
			int var5 = this.field1448[var1];
			boolean var6 = this.field1449[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field1446[var7];
				if (var8 < var4) {
					this.field1446[var3] = var8;
					this.field1448[var3] = this.field1448[var7];
					this.field1449[var3] = this.field1449[var7];
					++var3;
					this.field1446[var7] = this.field1446[var3];
					this.field1448[var7] = this.field1448[var3];
					this.field1449[var7] = this.field1449[var3];
				}
			}

			this.field1446[var3] = var4;
			this.field1448[var3] = var5;
			this.field1449[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	static void method3292(String var0, String var1, String var2) {
		class85.method2689(7);
		MenuAction.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lwx;I)V",
		garbageValue = "-1626412502"
	)
	static void method3284(WorldView var0, PacketBuffer var1) {
		WorldView var2 = class330.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field463[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field463[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class7.field26 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				class7.field26[var6][var7] = var1.readInt();
			}
		}

		HttpRequest.field53 = new int[var5];
		FriendSystem.field634 = new int[var5];
		class228.field2491 = new int[var5];
		Fonts.field5525 = new byte[var5][];
		WorldMapCacheName.field3329 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field463[var6][var7][var8];
					if (var9 != -1) {
						int var10 = SpriteMask.method7212(var9);
						int var11 = WorldMapRegion.method6426(var9);
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (HttpRequest.field53[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							HttpRequest.field53[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							FriendSystem.field634[var5] = VerticalAlignment.archive9.getGroupId("m" + var13 + "_" + var14);
							class228.field2491[var5] = VerticalAlignment.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		HealthBarConfig.updateGameState(25);
		Client.field442 = true;
		PlayerCompositionColorTextureOverride.field3434 = var2;
		class148.method3653(var2);
	}
}
