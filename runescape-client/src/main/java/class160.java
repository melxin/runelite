import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class160 extends class150 {
	@ObfuscatedName("en")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -980335487
	)
	int field1734;
	@ObfuscatedName("aw")
	String field1731;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class160(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1734 = var1.readInt();
		this.field1731 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3549(this.field1734, this.field1731);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "112"
	)
	public static void method3529(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}
}
