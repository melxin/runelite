import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class163 extends class166 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -577657383
	)
	int field1775;
	@ObfuscatedName("aw")
	byte field1773;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1364545893
	)
	int field1774;
	@ObfuscatedName("ae")
	String field1772;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class163(class167 var1) {
		this.this$0 = var1;
		this.field1775 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	void vmethod3691(Buffer var1) {
		var1.readUnsignedByte();
		this.field1775 = var1.readUnsignedShort();
		this.field1773 = var1.readByte();
		this.field1774 = var1.readUnsignedShort();
		var1.readLong();
		this.field1772 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	void vmethod3688(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1775);
		var2.rank = this.field1773;
		var2.world = this.field1774;
		var2.username = new Username(this.field1772);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1394813269"
	)
	static void method3617() {
		for (class268 var0 = (class268)Client.field719.last(); var0 != null; var0 = (class268)Client.field719.previous()) {
			var0.remove();
		}

	}
}
