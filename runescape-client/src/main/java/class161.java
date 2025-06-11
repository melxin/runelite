import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class161 extends class165 {
	@ObfuscatedName("ap")
	String field1811;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 307467737
	)
	int field1812;
	@ObfuscatedName("an")
	byte field1813;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class161(class166 var1) {
		this.this$0 = var1;
		this.field1811 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-830685594"
	)
	void vmethod3902(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1811 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1812 = var1.readUnsignedShort();
		this.field1813 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;B)V",
		garbageValue = "0"
	)
	void vmethod3908(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1811);
		var2.world = this.field1812;
		var2.rank = this.field1813;
		var1.addMember(var2);
	}
}
