import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class173 extends class166 {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -188441259
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ay")
	String field1828;
	@ObfuscatedName("ah")
	byte field1826;
	@ObfuscatedName("az")
	byte field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	class173(class167 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	void vmethod3869(Buffer var1) {
		this.field1828 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1828 != null) {
			var1.readUnsignedByte();
			this.field1826 = var1.readByte();
			this.field1827 = var1.readByte();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	void vmethod3870(ClanChannel var1) {
		var1.name = this.field1828;
		if (this.field1828 != null) {
			var1.field1812 = this.field1826;
			var1.field1813 = this.field1827;
		}

	}
}
