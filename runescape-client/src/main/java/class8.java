import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class8 {
	@ObfuscatedName("ay")
	final int field32;
	@ObfuscatedName("ah")
	final int field33;
	@ObfuscatedName("az")
	final String field31;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field32 = var1;
		this.field33 = var2;
		this.field31 = var3;
	}

	@ObfuscatedName("ay")
	String method60() {
		return Integer.toHexString(this.field32) + Integer.toHexString(this.field33) + this.field31;
	}

	@ObfuscatedName("ah")
	int method61() {
		return this.field33;
	}
}
