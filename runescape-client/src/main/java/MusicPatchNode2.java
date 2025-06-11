import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("ap")
	byte[] field3686;
	@ObfuscatedName("aj")
	byte[] field3684;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1695994771
	)
	int field3688;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1121377499
	)
	int field3683;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -176750197
	)
	int field3690;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -54241573
	)
	int field3687;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1325714389
	)
	int field3689;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -853720111
	)
	int field3685;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 769291693
	)
	int field3691;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpn;",
		garbageValue = "-2"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4636, PlayerType.PlayerType_ultimateIronman, PlayerType.field4630, PlayerType.field4639, PlayerType.field4633, PlayerType.field4631, PlayerType.field4632, PlayerType.field4626, PlayerType.field4624, PlayerType.PlayerType_normal, PlayerType.PlayerType_jagexModerator, PlayerType.field4628, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field4634, PlayerType.field4635};
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static final void method6884() {
		if (ClientPreferences.pcmPlayer1 != null) {
			ClientPreferences.pcmPlayer1.run();
		}

	}
}
