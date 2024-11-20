import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("TOKEN")
	TOKEN(2, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1517(3, 4);

	@ObfuscatedName("jh")
	static int[][] field1523;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1520029109
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1607210699
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldm;III)V",
		garbageValue = "-1472125526"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class92.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
