import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class460 {
	@ObfuscatedName("al")
	public char field5125;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 124027795
	)
	public int field5124;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -796858237
	)
	public int field5126;

	class460() {
		this.field5124 = 0;
		this.field5126 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "86"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
