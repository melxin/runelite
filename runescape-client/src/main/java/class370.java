import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class370 extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 841739245
	)
	final int field3968;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1616303513
	)
	final int field3969;

	public class370(int var1, int var2) {
		this.field3968 = var1;
		this.field3969 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "290260604"
	)
	public int method7725() {
		return this.field3968;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	public int method7726() {
		return this.field3969;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;ZLrf;B)V",
		garbageValue = "23"
	)
	public static void method7730(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		Decimator.ItemDefinition_archive = var0;
		FadeInTask.ItemDefinition_modelArchive = var1;
		Script.ItemDefinition_inMembersWorld = var2;
		class550.ItemDefinition_fileCount = Decimator.ItemDefinition_archive.getGroupFileCount(10);
		class603.ItemDefinition_fontPlain11 = var3;
	}
}
