import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class8 {
	@ObfuscatedName("av")
	final int field28;
	@ObfuscatedName("at")
	final int field27;
	@ObfuscatedName("ag")
	final String field29;

	@ObfuscatedSignature(
		descriptor = "(Lxa;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field28 = var1;
		this.field27 = var2;
		this.field29 = var3;
	}

	@ObfuscatedName("av")
	String method61() {
		return Integer.toHexString(this.field28) + Integer.toHexString(this.field27) + this.field29;
	}

	@ObfuscatedName("at")
	int method60() {
		return this.field27;
	}
}
