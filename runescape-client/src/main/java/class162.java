import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class162 extends class166 {
	@ObfuscatedName("ay")
	String field1763;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1131253487
	)
	int field1765;
	@ObfuscatedName("az")
	byte field1764;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	class162(class167 var1) {
		this.this$0 = var1;
		this.field1763 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	void vmethod3869(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1763 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1765 = var1.readUnsignedShort();
		this.field1764 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	void vmethod3870(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1763);
		var2.world = this.field1765;
		var2.rank = this.field1764;
		var1.addMember(var2);
	}
}
