import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(3, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("TOKEN")
	TOKEN(2, 3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1663(0, 4);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1834694195
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 274014195
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lej;",
		garbageValue = "1748459436"
	)
	static AttackOption[] method3561() {
		return new AttackOption[]{AttackOption.field1378, AttackOption.field1379, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden};
	}
}
