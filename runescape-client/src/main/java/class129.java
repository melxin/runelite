import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public enum class129 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1551(3, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1557(2, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1553(1, 3),
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
	public final int field1550;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -733125649
	)
	@Export("packetId")
	final int packetId;

	class129(int var3, int var4) {
		this.field1550 = var3;
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
