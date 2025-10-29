import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1892501129
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
