import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 371316575
	)
	int field3802;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	MusicPatchNode2 field3797;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 674291743
	)
	int field3791;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1351071459
	)
	int field3792;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1700892903
	)
	int field3793;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1625629313
	)
	int field3794;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1350334545
	)
	int field3790;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1872463607
	)
	int field3796;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1635951139
	)
	int field3803;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1216135168
	)
	int field3798;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1440743613
	)
	int field3799;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1260029855
	)
	int field3800;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1649023893
	)
	int field3801;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1826014337
	)
	int field3807;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1702921519
	)
	int field3788;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2097232839
	)
	int field3804;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2102920231
	)
	int field3806;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 751173153
	)
	int field3787;

	MusicPatchNode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	void method6855() {
		this.table = null;
		this.rawSound = null;
		this.field3797 = null;
		this.stream = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CLqa;I)I",
		garbageValue = "1016435732"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2011244903"
	)
	static boolean method6858(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
