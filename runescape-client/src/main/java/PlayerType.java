import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4514(6, 22, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4502(7, 41, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4503(8, 42, false, false, true),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4495(9, 43, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4505(10, 44, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4506(11, 45, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4507(12, 46, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4499(13, 47, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4509(14, 48, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4510(15, 49, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4511(16, 52, false, false, true);

	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1100515343
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 821425033
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ad")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("ay")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-52"
	)
	static void method7494(int var0) {
		TransformationMatrix.field4776 = var0;
		TransformationMatrix.field4775 = new TransformationMatrix[var0];
		TransformationMatrix.field4774 = 0;
	}
}
