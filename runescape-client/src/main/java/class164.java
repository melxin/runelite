import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class164 extends class149 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 7822213305044393103L
	)
	long field1831;
	@ObfuscatedName("ay")
	String field1827;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -166402173
	)
	int field1828;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class164(class152 var1) {
		this.this$0 = var1;
		this.field1831 = -1L;
		this.field1827 = null;
		this.field1828 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1831 = var1.readLong();
		}

		this.field1827 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1828 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3553(this.field1831, this.field1827, this.field1828);
	}
}
