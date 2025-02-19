import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class167 extends class149 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2141259845
	)
	int field1849;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2057185671
	)
	int field1850;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class167(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1849 = var1.readInt();
		this.field1850 = var1.readInt();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3562(this.field1849, this.field1850);
	}
}
