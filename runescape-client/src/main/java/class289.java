import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class289 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 43154695
	)
	static int field3175;
	@ObfuscatedName("bq")
	@Export("hasFocus")
	protected static boolean hasFocus;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2032850800"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class417.addChatMessage(var0, var1, var2, (String)null);
	}
}
