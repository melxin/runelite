import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(4, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(3, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("TOKEN")
	TOKEN(1, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1554(0, 4);

	@ObfuscatedName("aa")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1668492585
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -733125649
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
