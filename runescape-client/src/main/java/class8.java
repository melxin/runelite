import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class8 {
	@ObfuscatedName("ab")
	final int field32;
	@ObfuscatedName("ay")
	final int field31;
	@ObfuscatedName("au")
	final String field33;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field32 = var1;
		this.field31 = var2;
		this.field33 = var3;
	}

	@ObfuscatedName("ab")
	String method55() {
		return Integer.toHexString(this.field32) + Integer.toHexString(this.field31) + this.field33;
	}

	@ObfuscatedName("ay")
	int method56() {
		return this.field31;
	}
}
