import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class155 extends class150 {
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1315825767
	)
	int field1703;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1080477081
	)
	int field1705;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 131804473
	)
	int field1704;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -321006807
	)
	int field1702;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class155(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1703 = var1.readInt();
		this.field1702 = var1.readInt();
		this.field1705 = var1.readUnsignedByte();
		this.field1704 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3731(this.field1703, this.field1702, this.field1705, this.field1704);
	}
}
