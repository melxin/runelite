import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("PlayerType")
public enum PlayerType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4577(6, 22, false, false, true),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4587(7, 41, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4579(8, 42, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4580(9, 43, false, false, true),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4582(10, 44, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4584(11, 45, false, false, true),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4591(12, 46, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4583(13, 47, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4588(14, 48, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4571(15, 49, false, false, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4586(16, 52, false, false, true);

	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1949568049
	)
	@Export("id")
	final int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1921166967
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("am")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aq")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lnz;B)Ljava/lang/String;",
		garbageValue = "-62"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (ItemLayer.Widget_unpackTargetMask(class441.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
