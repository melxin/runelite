import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class277 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;S)V",
		garbageValue = "-13520"
	)
	public static void method5805(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.field2034 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public static void method5803() {
		class178.field1915.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1498833816"
	)
	static final void method5798(String var0) {
		AsyncRestClient.method146(var0 + " is already on your friend list");
	}
}
