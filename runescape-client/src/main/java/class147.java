import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class147 extends class150 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1977526603
	)
	int field1671;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 473158071
	)
	int field1668;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1330833969
	)
	int field1670;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1943120069
	)
	int field1667;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class147(class153 var1) {
		this.this$0 = var1;
		this.field1671 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1671 = var1.readUnsignedShort();
		this.field1668 = var1.readInt();
		this.field1670 = var1.readUnsignedByte();
		this.field1667 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3697(this.field1671, this.field1668, this.field1670, this.field1667);
	}
}
