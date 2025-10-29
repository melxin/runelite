import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class173 extends class151 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field1921;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2004517516642582981L
	)
	long field1920;
	@ObfuscatedName("at")
	String field1918;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class173(class154 var1) {
		this.this$0 = var1;
		this.field1920 = -1L;
		this.field1918 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1741769013;
			this.field1920 = var1.readLong();
		}

		this.field1918 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4104(this.field1920, this.field1918);
	}
}
