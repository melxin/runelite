import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1654372449
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
