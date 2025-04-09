import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("pc")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ao")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 839181059
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}
}
