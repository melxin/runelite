import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("kd")
public class class265 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class265 field3133;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1669951291
	)
	static int field3150;
	@ObfuscatedName("aq")
	final int field3148;
	@ObfuscatedName("ao")
	final int field3143;
	@ObfuscatedName("as")
	String field3151;
	@ObfuscatedName("al")
	String field3140;
	@ObfuscatedName("au")
	String field3141;
	@ObfuscatedName("ai")
	String field3142;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -6210461170724760517L
	)
	long field3137;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	AsyncRestClient field3144;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	AsyncHttpResponse field3145;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 42669455
	)
	int field3146;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1748111785
	)
	int field3138;
	@ObfuscatedName("ay")
	String field3147;
	@ObfuscatedName("ad")
	boolean field3149;

	static {
		field3133 = new class265();
	}

	class265() {
		this.field3148 = 1;
		this.field3143 = 2;
		this.field3151 = "";
		this.field3140 = "";
		this.field3141 = "";
		this.field3142 = "";
		this.field3137 = -1L;
		this.field3146 = 1;
		this.field3138 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-572065270"
	)
	public void method5962(int var1, String var2) {
		this.field3138 = var1;
		this.field3147 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	public void method5984(boolean var1) {
		this.field3149 = var1;
		this.field3144 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-67"
	)
	void method5964(String var1, String var2, String var3) {
		if (this.field3146 != 2) {
			this.field3151 = var1;
			this.field3140 = var2;
			this.field3141 = var3;
			if (!this.field3151.endsWith("/")) {
				this.field3151 = this.field3151 + "/";
			}

			if (!this.field3140.equals("")) {
				String var4 = this.field3151;
				var4 = var4 + "session/open/" + this.field3140;
				if (this.field3141.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field3141;

				try {
					this.field3145 = this.method5970(var4);
					this.field3137 = class189.method4284();
				} catch (IOException var6) {
					this.field3145 = null;
					this.field3140 = "";
					this.field3141 = "";
				}

			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-484485737"
	)
	public void method5965() {
		if (this.field3145 == null) {
			if (!this.field3142.isEmpty() && this.field3146 == 1) {
				long var1 = class189.method4284();
				long var3 = var1 - this.field3137;
				String var5 = this.field3151;
				var5 = var5 + "session/close/" + this.field3140 + "/" + this.field3142;
				if (this.field3141.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field3141 + "&sessionDuration=" + var3;
				}

				try {
					this.field3145 = this.method5970(var5);
				} catch (IOException var7) {
					this.field3146 = 1;
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1924478622"
	)
	public void method5966() {
		if (this.field3144 != null) {
			this.field3144.shutdown();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	void method5967() {
		if (!this.field3142.isEmpty()) {
			String var1 = "";
			switch(this.field3138) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field3147.isEmpty()) {
				String var2 = this.field3151;
				var2 = var2 + var1 + "/" + this.field3140 + "/" + this.field3142 + "/" + this.field3147 + "?userHash=" + this.field3141;

				try {
					this.field3145 = this.method5970(var2);
				} catch (IOException var4) {
					this.field3146 = 1;
				}

				this.field3146 = 1;
				this.field3138 = 0;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1837175427"
	)
	public void method5968() {
		if (this.field3145 != null && this.field3145.hasFinished()) {
			if (this.field3145.hasFinished() && this.field3145.await().getResponseCode() == 200 && this.field3142.isEmpty()) {
				String var1 = this.field3145.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field3142 = var1;
			}

			if (this.field3138 != 0) {
				this.method5967();
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "260410678"
	)
	public boolean method5992(String var1) {
		this.method5962(2, var1);
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lag;",
		garbageValue = "-239226469"
	)
	AsyncHttpResponse method5970(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3149);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field3144.submitRequest(var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "153328846"
	)
	public static void method5993(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		class4.field8 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)F",
		garbageValue = "2071566318"
	)
	static final float method5963(float var0, float var1, float var2, float var3) {
		return var1 * var2 - var0 * var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-37"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.array = (var0.length - 2) * -290410379;
		class606.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		LoginPacket.SpriteBuffer_xOffsets = new int[class606.SpriteBuffer_spriteCount];
		class191.SpriteBuffer_yOffsets = new int[class606.SpriteBuffer_spriteCount];
		class255.SpriteBuffer_spriteWidths = new int[class606.SpriteBuffer_spriteCount];
		FriendLoginUpdate.field5390 = new int[class606.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[class606.SpriteBuffer_spriteCount][];
		var1.array = (var0.length - 7 - class606.SpriteBuffer_spriteCount * 8) * -290410379;
		class606.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class581.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class606.SpriteBuffer_spriteCount; ++var3) {
			LoginPacket.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class606.SpriteBuffer_spriteCount; ++var3) {
			class191.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class606.SpriteBuffer_spriteCount; ++var3) {
			class255.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class606.SpriteBuffer_spriteCount; ++var3) {
			FriendLoginUpdate.field5390[var3] = var1.readUnsignedShort();
		}

		var1.array = (var0.length - 7 - class606.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3) * -290410379;
		TriBool.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			TriBool.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (TriBool.SpriteBuffer_spritePalette[var3] == 0) {
				TriBool.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.array = 0;

		for (var3 = 0; var3 < class606.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class255.SpriteBuffer_spriteWidths[var3];
			int var5 = FriendLoginUpdate.field5390[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			SpriteBufferProperties.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			boolean var9 = (var8 & 1) == 1;
			boolean var10 = (var8 & 2) == 2;
			int var11;
			if (!var9) {
				for (var11 = 0; var11 < var6; ++var11) {
					var7[var11] = var1.readByte();
				}
			} else {
				for (var11 = 0; var11 < var4; ++var11) {
					for (int var12 = 0; var12 < var5; ++var12) {
						var7[var11 + var12 * var4] = var1.readByte();
					}
				}
			}

			if (var10) {
				var1.array += var6 * -290410379;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class521.client.containsAccessAndRefreshToken() && !class521.client.otlTokenRequesterInitialized() && !class521.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			ClientPreferences.method2677(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.isEmpty()) {
				if (class36.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = class36.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
				Login.currentLoginField = 1;
			} else {
				Login.currentLoginField = 0;
			}

		} else {
			ClientPreferences.method2677(10);
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILna;ZB)V",
		garbageValue = "83"
	)
	static void method5990(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = AABB.getWorldMap().getMapArea(var0);
		int var4 = HealthBarUpdate.localPlayer.plane;
		int var5 = (HealthBarUpdate.localPlayer.x >> 7) + class333.topLevelWorldView.baseX;
		int var6 = (HealthBarUpdate.localPlayer.y >> 7) + class333.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		AABB.getWorldMap().method10800(var3, var7, var1, var2);
	}
}
