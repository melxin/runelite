import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class172 extends class165 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field1904;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1653011411
	)
	static int field1901;
	@ObfuscatedName("al")
	String field1907;
	@ObfuscatedName("ab")
	byte field1902;
	@ObfuscatedName("ac")
	byte field1903;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	class172(class166 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	void vmethod4076(Buffer var1) {
		this.field1907 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1907 != null) {
			var1.readUnsignedByte();
			this.field1902 = var1.readByte();
			this.field1903 = var1.readByte();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	void vmethod4077(ClanChannel var1) {
		var1.name = this.field1907;
		if (this.field1907 != null) {
			var1.field1880 = this.field1902;
			var1.field1883 = this.field1903;
		}

	}
}
