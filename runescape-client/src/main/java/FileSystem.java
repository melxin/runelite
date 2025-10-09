import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ab")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("at")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ag")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1568127149
	)
	static int field3123;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lkk;",
		garbageValue = "-965265730"
	)
	static class268 method5953() {
		return class268.field3190;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "-1954909993"
	)
	static void method5960(GameEngine var0) {
		IndexCheck var1 = SpriteBufferProperties.method52();

		while (var1.method6130()) {
			if (var1.field3213 == 13) {
				class462.method9467();
				return;
			}

			if (var1.field3213 == 96) {
				if (Login.worldSelectPage > 0 && class349.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var1.field3213 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && WorldMap.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var2 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(0, 1);
				return;
			}

			int var3 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(1, 1);
				return;
			}

			int var4 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(2, 1);
				return;
			}

			int var5 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				class174.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class462.method9467();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var6 = World.World_worlds[Login.hoveredWorldIndex];
				int var8 = Client.worldProperties;
				class580 var9 = class580.field5929;
				boolean var7 = (var8 & var9.rsOrdinal()) != 0;
				boolean var11 = var6.isDeadman();
				MenuAction.field687 = var11;
				var6.field596 = var11 ? "beta" : var6.field596;
				class489.changeWorld(var6);
				class462.method9467();
				if (var7 != var11) {
					Occluder.method5462();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && class349.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class349.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class558.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class558.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && WorldMap.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class4.canvasWidth - WorldMap.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class4.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class558.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class558.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "-467067076"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return class162.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
