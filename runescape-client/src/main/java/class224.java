import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class224 extends class230 {
	@ObfuscatedName("ab")
	String field2453;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lix;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class224(class227 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2453 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-112"
	)
	public int vmethod4622() {
		return 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1978748075"
	)
	public String vmethod4620() {
		return this.field2453;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;BIB)I",
		garbageValue = "-105"
	)
	public static int method4512(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}
}
