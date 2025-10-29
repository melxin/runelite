import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class174 extends class167 {
	@ObfuscatedName("av")
	String field1924;
	@ObfuscatedName("at")
	byte field1922;
	@ObfuscatedName("ag")
	byte field1923;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class174(class168 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "23"
	)
	void vmethod4228(Buffer var1) {
		this.field1924 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1924 != null) {
			var1.readUnsignedByte();
			this.field1922 = var1.readByte();
			this.field1923 = var1.readByte();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-24"
	)
	void vmethod4229(ClanChannel var1) {
		var1.name = this.field1924;
		if (this.field1924 != null) {
			var1.field1901 = this.field1922;
			var1.field1909 = this.field1923;
		}

	}
}
