import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class155 extends class151 {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1029458903
	)
	int field1799;
	@ObfuscatedName("aw")
	byte field1800;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class155(class154 var1) {
		this.this$0 = var1;
		this.field1799 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1799 = var1.readUnsignedShort();
		this.field1800 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3926(this.field1799, this.field1800);
	}
}
