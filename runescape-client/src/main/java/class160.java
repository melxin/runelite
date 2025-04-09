import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class160 extends class164 {
	@ObfuscatedName("lw")
	static String field1805;
	@ObfuscatedName("ao")
	String field1806;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 565962103
	)
	int field1804;
	@ObfuscatedName("ae")
	byte field1808;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgo;)V"
	)
	class160(class165 var1) {
		this.this$0 = var1;
		this.field1806 = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1341652344"
	)
	void vmethod3736(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 29699747;
			var1.readLong();
		}

		this.field1806 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1804 = var1.readUnsignedShort();
		this.field1808 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "992088037"
	)
	void vmethod3737(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1806);
		var2.world = this.field1804;
		var2.rank = this.field1808;
		var1.addMember(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1660118830"
	)
	public static int method3638(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}
}
