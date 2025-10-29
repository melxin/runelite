import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class170 extends class151 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1849507685
	)
	int field1896;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class170(class154 var1) {
		this.this$0 = var1;
		this.field1896 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1896 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4067(this.field1896);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpn;",
		garbageValue = "-94"
	)
	public static class406[] method4189() {
		return new class406[]{class406.field4903, class406.field4905, class406.field4904, class406.field4907};
	}
}
