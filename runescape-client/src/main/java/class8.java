import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class8 {
	@ObfuscatedName("ap")
	final int field31;
	@ObfuscatedName("aj")
	final int field30;
	@ObfuscatedName("an")
	final String field29;

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field31 = var1;
		this.field30 = var2;
		this.field29 = var3;
	}

	@ObfuscatedName("ap")
	String method62() {
		return Integer.toHexString(this.field31) + Integer.toHexString(this.field30) + this.field29;
	}

	@ObfuscatedName("aj")
	int method63() {
		return this.field30;
	}
}
