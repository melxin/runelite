import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class33 {
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1027343517
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1927105713
	)
	int field147;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1996685255
	)
	int field144;

	class33(int var1, int var2) {
		this.field147 = var1;
		this.field144 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbb;I)Z",
		garbageValue = "2126273148"
	)
	boolean method519(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field147) {
			case 1:
				return var1.vmethod5756(this.field144);
			case 2:
				return var1.vmethod5757(this.field144);
			case 3:
				return var1.vmethod5758((char)this.field144);
			case 4:
				return var1.vmethod5764(this.field144 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lkb;",
		garbageValue = "1208084405"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)F",
		garbageValue = "86"
	)
	static float method521(int var0, int var1, int var2) {
		return (float)(var0 - var1) / (float)(var2 - var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "38"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!Client.client.containsAccessAndRefreshToken() && !Client.client.otlTokenRequesterInitialized() && !Client.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			Varcs.method3212(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (class544.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = class544.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			HealthBarUpdate.focusPasswordWhenUsernameFilled();
		} else {
			Varcs.method3212(10);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lda;II)V",
		garbageValue = "1603163751"
	)
	static void method523(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2785(var0);
		int var5 = var1.x;
		int var6 = var1.field1268 * -2132848751 - 1;
		int var4 = var5 + (var6 << 6);
		int var9 = var1.y;
		int var10 = var1.field1268 * -2132848751 - 1;
		int var8 = var9 + (var10 << 6);
		class4.worldToScreen(var0, var3.x, var3.y, var4, var8, var2);
	}

	@ObfuscatedName("ni")
	static final void method522(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (class420.worldMap != null) {
			class420.worldMap.method9843();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		class544.clientPreferences.updateBrightness(var0);
	}
}
