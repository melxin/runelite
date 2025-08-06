import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class8 {
	@ObfuscatedName("al")
	final int field29;
	@ObfuscatedName("ab")
	final int field28;
	@ObfuscatedName("ac")
	final String field27;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field29 = var1;
		this.field28 = var2;
		this.field27 = var3;
	}

	@ObfuscatedName("al")
	String method63() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field27;
	}

	@ObfuscatedName("ab")
	int method60() {
		return this.field28;
	}
}
