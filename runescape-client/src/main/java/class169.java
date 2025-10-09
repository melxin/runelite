import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class169 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -66577023
	)
	int field1908;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class169(class153 var1) {
		this.this$0 = var1;
		this.field1908 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1908 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3993(this.field1908);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1106694608"
	)
	public static String method4113(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class442.field5175[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class442.field5175[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class442.field5175[(var6 & 15) << 2 | var7 >>> 6]).append(class442.field5175[var7 & 63]);
				} else {
					var3.append(class442.field5175[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class442.field5175[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}
}
