import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -991701221
	)
	static int field724;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -72210831
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1118476265
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -550876181
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1920339353
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1589067211
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1147961811
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("aa")
	@Export("action")
	String action;
	@ObfuscatedName("am")
	@Export("target")
	String target;
	@ObfuscatedName("ah")
	boolean field723;

	MenuAction() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfg;FI)F",
		garbageValue = "-701902442"
	)
	static float method1866(class136 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1600 == var1) {
				var2 = 0.0F;
			} else if (var0.field1597 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1600) / (var0.field1597 - var0.field1600);
			}

			float var3;
			if (var0.field1592) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1595 - var2, var0.field1601, var0.field1602, var0.field1603};
				float[] var5 = new float[5];
				int var6 = class444.method8685(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var3 * (var0.field1605 + (var0.field1607 * var3 + var0.field1594) * var3) + var0.field1612;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static void method1865() {
		class82.otp.trim();
		if (class82.otp.length() != 6) {
			setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			PcmPlayer.otpMedium = Integer.parseInt(class82.otp);
			class82.otp = "";
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
			setLoginResponseString("", "Connecting to server...", "");
			HealthBarConfig.updateGameState(20);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1269986009"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "66"
	)
	static void method1863(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeShortLE(var0 + Sound.topLevelWorldView.baseX);
		var4.packetBuffer.writeShortAdd(var1 + Sound.topLevelWorldView.baseY);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(class152.localPlayer.x);
		var4.packetBuffer.writeShort(class152.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}
}
