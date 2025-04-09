import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("bx")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("bn")
	static String field1063;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("USERNAME_PASSWORD")
	static class377 USERNAME_PASSWORD;
	@ObfuscatedName("an")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ae")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1594638460"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 == 8222) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (var0 == 8225) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (var0 == 352) {
				var1 = -118;
			} else if (var0 == 8249) {
				var1 = -117;
			} else if (var0 == 338) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (var0 == 8211) {
				var1 = -106;
			} else if (var0 == 8212) {
				var1 = -105;
			} else if (var0 == 732) {
				var1 = -104;
			} else if (var0 == 8482) {
				var1 = -103;
			} else if (var0 == 353) {
				var1 = -102;
			} else if (var0 == 8250) {
				var1 = -101;
			} else if (var0 == 339) {
				var1 = -100;
			} else if (var0 == 382) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;I)V",
		garbageValue = "-1693464355"
	)
	public static void method2458(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489081691"
	)
	public static final void method2457() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-230450541"
	)
	static final int method2459() {
		if (Renderable.clientPreferences.isRoofsHidden()) {
			return class509.topLevelWorldView.plane;
		} else {
			int var0 = MusicPatchNode2.cameraX >> 7;
			int var1 = SceneTilePaint.cameraZ >> 7;
			if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
				int var2 = GraphicsObject.getTileHeight(class509.topLevelWorldView, MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, class509.topLevelWorldView.plane);
				return var2 - TaskHandler.cameraY < 800 && (class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var0][var1] & 4) != 0 ? class509.topLevelWorldView.plane : 3;
			} else {
				return class509.topLevelWorldView.plane;
			}
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)I",
		garbageValue = "80"
	)
	static final int method2448(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return UserComparator6.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}
}
