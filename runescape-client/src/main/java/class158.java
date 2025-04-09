import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class158 extends class148 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -758358327
	)
	int field1772;
	@ObfuscatedName("an")
	String field1770;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class158(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1772 = var1.readInt();
		this.field1770 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3604(this.field1772, this.field1770);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "574580513"
	)
	public static void method3553() {
		VarpDefinition.VarpDefinition_cached.clear();
	}
}
