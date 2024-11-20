import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class8 {
	@ObfuscatedName("ab")
	final int field32;
	@ObfuscatedName("aw")
	final int field31;
	@ObfuscatedName("at")
	final String field33;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
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
	String method67() {
		return Integer.toHexString(this.field32) + Integer.toHexString(this.field31) + this.field33;
	}

	@ObfuscatedName("aw")
	int method68() {
		return this.field31;
	}
}
