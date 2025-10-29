import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("TOKEN")
	TOKEN(3, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1586(0, 4);

	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 1785142049
	)
	static int field1589;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1472523271
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1597795409
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
