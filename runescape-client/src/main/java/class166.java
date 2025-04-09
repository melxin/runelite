import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class166 extends class148 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("al")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static WorldView field1847;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1631334281
	)
	int field1842;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1241144525
	)
	int field1844;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class166(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1842 = var1.readInt();
		this.field1844 = var1.readInt();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3587(this.field1842, this.field1844);
	}
}
