import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class134 {
	@ObfuscatedName("ac")
	public static final float field1620;
	@ObfuscatedName("ap")
	public static final float field1617;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static Widget field1624;

	static {
		field1620 = Math.ulp(1.0F);
		field1617 = 2.0F * field1620;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1823309984"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Lpw;",
		garbageValue = "1784249341"
	)
	static Archive method3618(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, Actor.masterDisk, WorldMapSectionType.field3418, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Loi;IIIIIII)V",
		garbageValue = "-120078607"
	)
	static final void method3620(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field343) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field343 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class89.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class89.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class89.invalidateWidget(var0);
				Client.field343 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * 469894397;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class89.invalidateWidget(var0);
			}
		}

	}
}
