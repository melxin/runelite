import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class8 {
	@ObfuscatedName("ab")
	final int field29;
	@ObfuscatedName("at")
	final int field30;
	@ObfuscatedName("ag")
	final String field31;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field29 = var1;
		this.field30 = var2;
		this.field31 = var3;
	}

	@ObfuscatedName("ab")
	String method61() {
		return Integer.toHexString(this.field29) + Integer.toHexString(this.field30) + this.field31;
	}

	@ObfuscatedName("at")
	int method57() {
		return this.field30;
	}
}
