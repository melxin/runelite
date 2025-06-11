import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1195(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1192(4);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -33859249
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lbg;",
		garbageValue = "-2122497663"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class70.getNextWorldListWorld();
	}
}
