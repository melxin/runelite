import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class49 {
	@ObfuscatedName("au")
	static final BigInteger field713;
	@ObfuscatedName("ar")
	static final BigInteger field710;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -496824645
	)
	static int field709;

	static {
		field713 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field710 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-239653335"
	)
	public static int method1862(int var0) {
		return class525.field5353[var0 & 16383];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbo;I)V",
		garbageValue = "-803681993"
	)
	static void method1861(GameEngine var0) {
		IndexCheck var1 = Client.indexCheck;
		IndexCheck var2 = var1;

		while (var2.method5890()) {
			if (var2.field3063 == 13) {
				class328.method6844();
				return;
			}

			if (var2.field3063 == 96) {
				if (Login.worldSelectPage > 0 && class205.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (var2.field3063 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && FontName.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var3 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(0, 1);
				return;
			}

			int var4 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(1, 1);
				return;
			}

			int var5 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(2, 1);
				return;
			}

			int var6 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				HttpHeaders.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class328.method6844();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var7 = class547.World_worlds[Login.hoveredWorldIndex];
				boolean var8 = UrlRequest.method3377(Client.worldProperties, class571.field5627);
				boolean var9 = var7.isDeadman();
				MusicPatch.field3774 = var9;
				var7.field626 = var9 ? "beta" : var7.field626;
				class291.changeWorld(var7);
				class328.method6844();
				if (var9 != var8) {
					HttpAuthenticationHeader.method9362();
				}

				return;
			}

			if (Login.worldSelectPage > 0 && class205.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class205.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && FontName.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - FontName.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
