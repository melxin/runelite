import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class168 extends class149 {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1911563409
	)
	static int field1846;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 997150031
	)
	int field1847;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class168(class152 var1) {
		this.this$0 = var1;
		this.field1847 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1847 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3753(this.field1847);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltv;",
		garbageValue = "-744024149"
	)
	public static class506[] method3866() {
		return new class506[]{class506.field5272, class506.field5264, class506.field5265, class506.field5263};
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)Ljava/lang/String;",
		garbageValue = "250730910"
	)
	static String method3872(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class351.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = KeyHandler.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}
}
