import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Lxe;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -49433637
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("al")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1315999179
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}
}
