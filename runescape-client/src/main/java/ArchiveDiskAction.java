import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2008589591
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljk;",
		garbageValue = "-874653325"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Lkl;",
		garbageValue = "4"
	)
	public static IndexCheck method7614() {
		return Client.indexCheck;
	}
}
