import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(3, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(4, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("TOKEN")
	TOKEN(2, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	field1686(1, 4);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1426398969
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1898117253
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
