import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class191 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2026")
	public static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Laj;",
		garbageValue = "30"
	)
	public static class6[] method3890() {
		return new class6[]{class6.field18};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "568427732"
	)
	public static void method3889() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "321"
	)
	static final int method3888(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "403555616"
	)
	static final void method3886(String var0) {
		HttpRequestTask.method269(var0 + " is already on your ignore list");
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-11055"
	)
	static final void method3887() {
		Client.field635 = 0;
		int var0 = (AsyncHttpResponse.localPlayer.x >> 7) + HttpRequest.topLevelWorldView.baseX;
		int var1 = (AsyncHttpResponse.localPlayer.y >> 7) + HttpRequest.topLevelWorldView.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field635 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field635 = 1;
		}

		if (Client.field635 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field635 = 0;
		}

	}
}
