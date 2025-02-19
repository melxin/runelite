import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class401 extends DualNode {
	@ObfuscatedName("jk")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	Archive field4689;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -691154335
	)
	int field4688;
	@ObfuscatedName("au")
	byte field4687;

	class401() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
