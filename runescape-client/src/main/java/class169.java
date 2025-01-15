import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class169 extends class150 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 875404857
	)
	static int field1804;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aq")
	public static short[] field1805;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static Bounds field1800;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -722365081
	)
	int field1799;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class169(class153 var1) {
		this.this$0 = var1;
		this.field1799 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1799 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3718(this.field1799);
	}
}
