import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4716(6, 22, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4721(7, 41, false, false, true),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4725(8, 42, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4723(9, 43, false, false, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4724(10, 44, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4720(11, 45, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4726(12, 46, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4727(13, 47, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4728(14, 48, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4729(15, 49, false, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	field4730(16, 52, false, false, true);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 365626603
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("aq")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ao")
	@Export("isUser")
	public final boolean isUser;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1357138919
	)
	@Export("id")
	final int id;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
