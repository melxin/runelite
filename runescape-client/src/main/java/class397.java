import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class397 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)Ljava/lang/String;",
		garbageValue = "1910468617"
	)
	static String method7712(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class364.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = ScriptEvent.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method7713() {
		SecureUrlRequester.clientPreferences.updateEULA(Client.field788);
	}
}
