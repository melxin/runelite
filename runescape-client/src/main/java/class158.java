import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class158 extends class166 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	static ClanSettings field1725;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 172579547
	)
	int field1723;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class158(class167 var1) {
		this.this$0 = var1;
		this.field1723 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	void vmethod3691(Buffer var1) {
		this.field1723 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	void vmethod3688(ClanChannel var1) {
		var1.removeMember(this.field1723);
	}
}
