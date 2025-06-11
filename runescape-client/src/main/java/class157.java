import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class157 extends class165 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1763793601
	)
	int field1770;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class157(class166 var1) {
		this.this$0 = var1;
		this.field1770 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-830685594"
	)
	void vmethod3902(Buffer var1) {
		this.field1770 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;B)V",
		garbageValue = "0"
	)
	void vmethod3908(ClanChannel var1) {
		var1.removeMember(this.field1770);
	}
}
