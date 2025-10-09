import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class165 extends class150 {
	@ObfuscatedName("ao")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1084155925
	)
	static int field1886;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 9951221469293291L
	)
	long field1889;
	@ObfuscatedName("at")
	String field1885;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 392074717
	)
	int field1887;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class165(class153 var1) {
		this.this$0 = var1;
		this.field1889 = -1L;
		this.field1885 = null;
		this.field1887 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1889 = var1.readLong();
		}

		this.field1885 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1887 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3987(this.field1889, this.field1885, this.field1887);
	}
}
