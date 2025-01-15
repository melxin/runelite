import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class355 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("al")
	static String[] field3789;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1982481347"
	)
	static boolean method7042() {
		Date var0;
		try {
			var0 = class73.method2338();
		} catch (ParseException var6) {
			Varcs.method3212(7);
			class150.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var4 = class139.method3500(var0);
			Date var3 = Script.method2490();
			boolean var2 = var0.after(var3);
			if (!var2) {
				Tiles.method2574("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var4) {
					UserComparator4.field1481 = 8388607;
				} else {
					UserComparator4.field1481 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIB)V",
		garbageValue = "25"
	)
	static final void method7041(WorldView var0, int var1, int var2) {
		if (Client.hintArrowType == 2) {
			int var3 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var0.baseX << 7);
			int var4 = Client.hintArrowSubY * 4096 + (Client.hintArrowY - var0.baseY << 7);
			class4.worldToScreen(var0, var3, var4, var3, var4, Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				SoundSystem.headIconHintSprites[0].drawTransBgAt(Client.viewportTempX + var1 - 12, var2 + Client.viewportTempY - 28);
			}

		}
	}
}
