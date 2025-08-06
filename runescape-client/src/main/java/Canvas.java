import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("pm")
	static byte[][] field100;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	static Widget field102;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "[Lox;"
	)
	static Widget[] field104;
	@ObfuscatedName("al")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1768047860"
	)
	static void method346(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		Scene var4 = var0.scene;
		int var5 = 1;
		int var6 = 2;
		int var7 = 4;

		for (int var8 = 0; var8 < 4; ++var8) {
			if (var8 > 0) {
				var5 <<= 3;
				var6 <<= 3;
				var7 <<= 3;
			}

			for (int var9 = 0; var9 <= var8; ++var9) {
				for (int var10 = 0; var10 <= var2; ++var10) {
					for (int var11 = 0; var11 <= var1; ++var11) {
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int[] var10000;
						short var17;
						int var18;
						int var19;
						int var20;
						int var21;
						if ((class81.field1179[var9][var11][var10] & var5) != 0) {
							var12 = var10;
							var13 = var10;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (class81.field1179[var9][var11][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < var2 && (class81.field1179[var9][var11][var13 + 1] & var5) != 0) {
								++var13;
							}

							label191:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class81.field1179[var14 - 1][var11][var16] & var5) == 0) {
										break label191;
									}
								}

								--var14;
							}

							label180:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class81.field1179[var15 + 1][var11][var16] & var5) == 0) {
										break label180;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var11][var12] - var17;
								var19 = var3[var14][var11][var12];
								var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = class81.field1179[var20][var11];
										var10000[var21] &= ~var5;
									}
								}
							}
						}

						if ((class81.field1179[var9][var11][var10] & var6) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (class81.field1179[var9][var12 - 1][var10] & var6) != 0; --var12) {
							}

							while (var13 < var1 && (class81.field1179[var9][var13 + 1][var10] & var6) != 0) {
								++var13;
							}

							label244:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class81.field1179[var14 - 1][var16][var10] & var6) == 0) {
										break label244;
									}
								}

								--var14;
							}

							label233:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((class81.field1179[var15 + 1][var16][var10] & var6) == 0) {
										break label233;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var12][var10] - var17;
								var19 = var3[var14][var12][var10];
								var4.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = class81.field1179[var20][var21];
										var10000[var10] &= ~var6;
									}
								}
							}
						}

						if ((class81.field1179[var9][var11][var10] & var7) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var10;

							for (var15 = var10; var14 > 0 && (class81.field1179[var9][var11][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (class81.field1179[var9][var11][var15 + 1] & var7) != 0) {
								++var15;
							}

							label297:
							while (var12 > 0) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((class81.field1179[var9][var12 - 1][var16] & var7) == 0) {
										break label297;
									}
								}

								--var12;
							}

							label286:
							while (var13 < var1) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((class81.field1179[var9][var13 + 1][var16] & var7) == 0) {
										break label286;
									}
								}

								++var13;
							}

							if ((var15 - var14 + 1) * (var13 - var12 + 1) >= 4) {
								var16 = var3[var9][var12][var14];
								var4.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

								for (int var22 = var12; var22 <= var13; ++var22) {
									for (var18 = var14; var18 <= var15; ++var18) {
										var10000 = class81.field1179[var9][var22];
										var10000[var18] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1334175492"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
