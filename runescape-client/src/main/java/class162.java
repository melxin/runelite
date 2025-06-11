import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class162 extends class165 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1393182613
	)
	int field1817;
	@ObfuscatedName("aj")
	byte field1816;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1615171389
	)
	int field1818;
	@ObfuscatedName("ai")
	String field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class162(class166 var1) {
		this.this$0 = var1;
		this.field1817 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-830685594"
	)
	void vmethod3902(Buffer var1) {
		var1.readUnsignedByte();
		this.field1817 = var1.readUnsignedShort();
		this.field1816 = var1.readByte();
		this.field1818 = var1.readUnsignedShort();
		var1.readLong();
		this.field1819 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;B)V",
		garbageValue = "0"
	)
	void vmethod3908(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1817);
		var2.rank = this.field1816;
		var2.world = this.field1818;
		var2.username = new Username(this.field1819);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "534799523"
	)
	static float[] method3826(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1114820666"
	)
	public static void method3823() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/String;",
		garbageValue = "96"
	)
	public static String method3825(Buffer var0) {
		return class168.method3872(var0, 32767);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	static void method3816() {
		MenuAction.setLoginResponseString("", "Connecting to server...", "");
		Client.field438 = class584.field5748;
		Client.authenticationScheme = ClientPacket.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		HealthBarConfig.updateGameState(20);
	}
}
