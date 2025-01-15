import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("au")
	public static short[] field5323;
	@ObfuscatedName("gn")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ae")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lun;",
		garbageValue = "-1551767491"
	)
	public static FontName[] method9935() {
		return new FontName[]{FontName_verdana13, FontName_plain12, FontName_verdana11, FontName_verdana15, FontName_bold12, FontName_plain11};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1973306811"
	)
	public static int method9937(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 14 & 3L);
		return var1;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "-127263735"
	)
	static final void method9934(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (AbstractWorldMapIcon.method6465(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-5"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + WorldViewManager.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + WorldViewManager.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + WorldViewManager.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIIILvf;Lnf;B)V",
		garbageValue = "1"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10758(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
