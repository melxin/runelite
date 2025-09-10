import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class51 {
	@ObfuscatedName("af")
	static final BigInteger field725;
	@ObfuscatedName("aw")
	static final BigInteger field723;

	static {
		field725 = new BigInteger("10001", 16);
		field723 = new BigInteger("8b3a6290fcfe8f8d0752bfd815158328bf43b89e91356380968f51465f29f689dde6c169375e12dd28a43633b619a48f71c539c9f1f4e59aadd5e2ad681f3e1270313ef044889faee740f641ea0f8b341d44f388758e12b893f46fb7515ed8dc9b6ded076f1a621cf0d6f2157a32434e5f3028e3baf3ff2f08ab86de8776638f", 16);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-15"
	)
	public static float method1894(int var0) {
		var0 &= 2047;
		return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "435603815"
	)
	static void method1893(String var0, String var1, String var2) {
		ClientPreferences.method2677(7);
		MouseRecorder.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "8081"
	)
	static void method1895(int var0, int var1, int var2, int var3, int var4, int var5) {
		NPC.method2771(HttpHeaders.worldView, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIILxt;I)V",
		garbageValue = "189896629"
	)
	static void method1892(int var0, int var1, int var2, SpritePixels var3) {
		int var4 = var2 * 128;
		var4 += Client.camAngleY;
		var4 &= 2047;
		byte var5 = 30;
		int var6 = var0 - (int)(SequenceDefinition.method4817(var4) * (double)var5);
		int var10 = class536.field5571[var4 & 2047];
		double var8 = (double)var10 / 65536.0D;
		var10 = var1 + (int)((double)var5 * var8);
		int var11 = Math.max(var3.subWidth, var3.subHeight);
		int var12 = var11 / 2;
		var3.method11727(var6 - var12, var10 - var12, var3.subWidth, var3.subHeight, var3.subWidth / 2, var3.subHeight / 2, (double)method1894(var4), 256);
	}
}
