import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ab")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -316237065
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIZIIB)J",
		garbageValue = "117"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}
}
