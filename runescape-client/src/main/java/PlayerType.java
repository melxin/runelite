import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4865(6, 22, false, false, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4866(7, 41, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4867(8, 42, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4878(9, 43, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4869(10, 44, false, false, true),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4870(11, 45, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4875(12, 46, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4872(13, 47, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4873(14, 48, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4874(15, 49, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4880(16, 52, false, false, true);

	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 546678113
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ao")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ax")
	@Export("isUser")
	public final boolean isUser;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1639800585
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
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
