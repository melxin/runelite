import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2077965391
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("an")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("ae")
	final Map field76;
	@ObfuscatedName("af")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field76 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field76 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-625414176"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1134016041"
	)
	public String method299() {
		return this.headerFields;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-954069567"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field76;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-231116231"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-53"
	)
	static final int method305(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V",
		garbageValue = "-11"
	)
	static void method306(WorldView var0) {
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
						if ((Varps.field3836[var9][var11][var10] & var5) != 0) {
							var12 = var10;
							var13 = var10;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (Varps.field3836[var9][var11][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < var2 && (Varps.field3836[var9][var11][var13 + 1] & var5) != 0) {
								++var13;
							}

							label189:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((Varps.field3836[var14 - 1][var11][var16] & var5) == 0) {
										break label189;
									}
								}

								--var14;
							}

							label178:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((Varps.field3836[var15 + 1][var11][var16] & var5) == 0) {
										break label178;
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
										var10000 = Varps.field3836[var20][var11];
										var10000[var21] &= ~var5;
									}
								}
							}
						}

						if ((Varps.field3836[var9][var11][var10] & var6) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (Varps.field3836[var9][var12 - 1][var10] & var6) != 0; --var12) {
							}

							while (var13 < var1 && (Varps.field3836[var9][var13 + 1][var10] & var6) != 0) {
								++var13;
							}

							label242:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((Varps.field3836[var14 - 1][var16][var10] & var6) == 0) {
										break label242;
									}
								}

								--var14;
							}

							label231:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((Varps.field3836[var15 + 1][var16][var10] & var6) == 0) {
										break label231;
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
										var10000 = Varps.field3836[var20][var21];
										var10000[var10] &= ~var6;
									}
								}
							}
						}

						if ((Varps.field3836[var9][var11][var10] & var7) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var10;

							for (var15 = var10; var14 > 0 && (Varps.field3836[var9][var11][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (Varps.field3836[var9][var11][var15 + 1] & var7) != 0) {
								++var15;
							}

							label295:
							while (var12 > 0) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((Varps.field3836[var9][var12 - 1][var16] & var7) == 0) {
										break label295;
									}
								}

								--var12;
							}

							label284:
							while (var13 < var1) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((Varps.field3836[var9][var13 + 1][var16] & var7) == 0) {
										break label284;
									}
								}

								++var13;
							}

							if ((var15 - var14 + 1) * (var13 - var12 + 1) >= 4) {
								var16 = var3[var9][var12][var14];
								var4.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

								for (int var22 = var12; var22 <= var13; ++var22) {
									for (var18 = var14; var18 <= var15; ++var18) {
										var10000 = Varps.field3836[var9][var22];
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

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2043823537"
	)
	static void method302(int var0, int var1, int var2, int var3) {
		Widget var4 = class232.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class60.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		AABB.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class31.selectedSpellFlags = var2;
		class139.invalidateWidget(var4);
	}
}
