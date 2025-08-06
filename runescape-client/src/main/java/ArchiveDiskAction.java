import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("jl")
	static String field4784;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1915325405
	)
	@Export("type")
	int type;
	@ObfuscatedName("ab")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}
}
