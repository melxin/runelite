import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class145 extends class148 {
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field1696;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 483577527
	)
	int field1691;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1551015643
	)
	int field1690;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1885815103
	)
	int field1692;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1354719737
	)
	int field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class145(class151 var1) {
		this.this$0 = var1;
		this.field1691 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1691 = var1.readUnsignedShort();
		this.field1690 = var1.readInt();
		this.field1692 = var1.readUnsignedByte();
		this.field1693 = var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3569(this.field1691, this.field1690, this.field1692, this.field1693);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
