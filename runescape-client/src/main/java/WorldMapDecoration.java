import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1508500333
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 774297171
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -945438443
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;J)V"
	)
	static void method7008(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-779358881"
	)
	static void method7010(String var0) {
		class39.field241 = var0;

		try {
			String var1 = SecureUrlRequester.client.getParameter(Integer.toString(18));
			String var2 = SecureUrlRequester.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.isEmpty()) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = ParamComposition.method4708() + 94608000000L;
				class361.field4065.setTime(new Date(var6));
				int var8 = class361.field4065.get(7);
				int var9 = class361.field4065.get(5);
				int var10 = class361.field4065.get(2);
				int var11 = class361.field4065.get(1);
				int var12 = class361.field4065.get(11);
				int var13 = class361.field4065.get(12);
				int var14 = class361.field4065.get(13);
				String var5 = class361.field4064[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class361.field4066[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class26.method411(SecureUrlRequester.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
