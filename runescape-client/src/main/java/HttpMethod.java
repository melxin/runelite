import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 697922389
	)
	int field36;
	@ObfuscatedName("ae")
	@Export("name")
	String name;
	@ObfuscatedName("ax")
	boolean field41;
	@ObfuscatedName("at")
	boolean field42;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field36 = var1;
		this.name = var2;
		this.field41 = var3;
		this.field42 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-65"
	)
	boolean method75() {
		return this.field41;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field36;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-3"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1399283481"
	)
	boolean method68() {
		return this.field42;
	}

	@ObfuscatedName("ay")
	public static final int method82(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	static void method84() {
		if (Login.clearLoginScreen) {
			Login.titleboxSprite = null;
			class454.titlebuttonSprite = null;
			class538.runesSprite = null;
			WorldMapSectionType.leftTitleSprite = null;
			TriBool.rightTitleSprite = null;
			Login.logoSprite = null;
			class169.title_muteSprite = null;
			Login.options_buttons_0Sprite = null;
			FriendLoginUpdate.options_buttons_2Sprite = null;
			UserComparator5.worldSelectBackSprites = null;
			class73.worldSelectFlagSprites = null;
			Script.worldSelectArrows = null;
			class140.worldSelectStars = null;
			class93.field1118 = null;
			HttpHeaders.loginScreenRunesAnimation.method2852();
			UserComparator3.method3347(0, 100);
			UserComparator8.method3320().method7823(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;BII)I",
		garbageValue = "-1622496793"
	)
	static int method65(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "-97"
	)
	static void method81(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = 1.0F + var0[1] * (var0[1] - 2.0F) + var0[0] * (var0[0] - 2.0F + var0[1]);
			if (var1 + class132.field1535 > 0.0F) {
				if (class132.field1535 + var0[0] < 1.3333334F) {
					float var2 = var0[0] - 2.0F;
					float var3 = var0[0] - 1.0F;
					float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * 4.0F * var3));
					float var5 = 0.5F * (-var2 + var4);
					if (class132.field1535 + var0[1] > var5) {
						var0[1] = var5 - class132.field1535;
					} else {
						var5 = 0.5F * (-var2 - var4);
						if (var0[1] < class132.field1535 + var5) {
							var0[1] = class132.field1535 + var5;
						}
					}
				} else {
					var0[0] = 1.3333334F - class132.field1535;
					var0[1] = 0.33333334F - class132.field1535;
				}
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1946123852"
	)
	static int method85(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field854 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "1976579478"
	)
	static void method79(WorldView var0) {
		if (Client.combatTargetPlayerIndex >= 0 && var0.players[Client.combatTargetPlayerIndex] != null) {
			class137.addPlayerToScene(var0, Client.combatTargetPlayerIndex, false);
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "96"
	)
	static final void method83(int var0) {
		if (ClanChannel.widgetDefinition.loadInterface(var0)) {
			GameBuild.drawModelComponents(ClanChannel.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
