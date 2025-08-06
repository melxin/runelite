import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class163 extends class149 {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	static IndexedSprite field1854;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1721481471
	)
	int field1853;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class163(class152 var1) {
		this.this$0 = var1;
		this.field1853 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1853 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3901(this.field1853);
	}
}
