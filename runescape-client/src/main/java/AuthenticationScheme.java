import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field1602(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(4, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field1597(0, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field1595(3, 4);

	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -607610533
	)
	static int field1601;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1008594243
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 728538409
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
