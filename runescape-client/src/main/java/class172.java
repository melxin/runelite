import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class172 extends class150 {
	@ObfuscatedName("ge")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -8487368226984193099L
	)
	long field1817;
	@ObfuscatedName("aw")
	String field1816;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class172(class153 var1) {
		this.this$0 = var1;
		this.field1817 = -1L;
		this.field1816 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1817 = var1.readLong();
		}

		this.field1816 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3543(this.field1817, this.field1816);
	}
}
