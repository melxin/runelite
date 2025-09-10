import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class8 {
	@ObfuscatedName("af")
	final int field28;
	@ObfuscatedName("aw")
	final int field26;
	@ObfuscatedName("at")
	final String field27;

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field28 = var1;
		this.field26 = var2;
		this.field27 = var3;
	}

	@ObfuscatedName("af")
	String method60() {
		return Integer.toHexString(this.field28) + Integer.toHexString(this.field26) + this.field27;
	}

	@ObfuscatedName("aw")
	int method59() {
		return this.field26;
	}
}
