import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 659066549
	)
	@Export("type")
	int type;
	@ObfuscatedName("ah")
	@Export("data")
	byte[] data;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}
}
