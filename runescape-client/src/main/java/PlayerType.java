import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4821(6, 22, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4817(7, 41, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4834(8, 42, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4824(9, 43, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4823(10, 44, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4826(11, 45, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4827(12, 46, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4828(13, 47, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4829(14, 48, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4830(15, 49, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4832(16, 52, false, false, true);

	@ObfuscatedName("ab")
	static int[][][] field4837;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1172079231
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ag")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("av")
	@Export("isUser")
	public final boolean isUser;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -542261939
	)
	@Export("id")
	final int id;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
