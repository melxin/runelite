import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wh")
public class class586 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	public static final class586 field5937;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	public static final class586 field5942;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	public static final class586 field5939;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwh;"
	)
	static final class586 field5940;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 676106613
	)
	public final int field5941;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 50478497
	)
	public final int field5938;
	@ObfuscatedName("ak")
	public final Class field5943;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	final class581 field5944;

	static {
		field5937 = new class586(3, 0, Integer.class, new class582());
		field5942 = new class586(2, 1, Long.class, new class585());
		field5939 = new class586(0, 2, String.class, new class587());
		field5940 = new class586(1, 5, DynamicArray.class, new class583());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lwk;)V"
	)
	class586(int var1, int var2, Class var3, class581 var4) {
		this.field5941 = var1;
		this.field5938 = var2;
		this.field5943 = var3;
		this.field5944 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5938;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)Ljava/lang/Object;",
		garbageValue = "-228349196"
	)
	public Object method11436(Buffer var1) {
		return this.field5944.vmethod11459(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lwh;",
		garbageValue = "23"
	)
	public static class586[] method11449() {
		return new class586[]{field5942, field5937, field5940, field5939};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxa;B)V",
		garbageValue = "-71"
	)
	public static void method11434(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class586[] var5 = method11449();
		int var6 = 0;

		class586 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null;
				break;
			}

			class586 var7 = var5[var6];
			if (var3 == var7.field5943) {
				var4 = var7;
				break;
			}

			++var6;
		}

		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class581 var2 = var4.field5944;
			var2.vmethod11455(var0, var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1053469112"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = class468.clientPreferences.getEULA() >= Client.field330;
		if (!var2) {
			var1 = 12;
		} else if (SecureUrlRequester.client.containsAccessAndRefreshToken() || SecureUrlRequester.client.otlTokenRequesterInitialized() || SecureUrlRequester.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class30.method484(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class28.otpMedium = 0;
			UserComparator6.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (class468.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class468.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		WorldMapDecoration.focusPasswordWhenUsernameFilled();
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILci;I)V",
		garbageValue = "72748354"
	)
	static void method11444(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = AsyncHttpResponse.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = AsyncHttpResponse.worldView.tileHeights[var0];
		int var22 = var21[var18][var20] + var21[var17][var20] + var21[var17][var19] + var21[var18][var19] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			HttpRequest.method89(AsyncHttpResponse.worldView, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field907 = var1 * 128 + var15 * 64;
			var13.field896 = var16 * 64 + var2 * 128;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
