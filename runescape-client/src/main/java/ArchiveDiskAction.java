import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("bg")
	static Image field4631;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 75168507
	)
	@Export("type")
	int type;
	@ObfuscatedName("ay")
	@Export("data")
	byte[] data;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	public static void method7568() {
		class204.field1909.clear();
	}
}
