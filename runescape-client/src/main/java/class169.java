import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class169 extends class151 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1689769993
	)
	static int field1909;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -494510753
	)
	int field1906;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -339511271
	)
	int field1905;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class169(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1906 = var1.readShortSmart();
		this.field1905 = var1.readShortSmart();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3981(this.field1906, this.field1905);
	}
}
