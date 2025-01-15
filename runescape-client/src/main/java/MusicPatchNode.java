import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 235415007
	)
	int field3731;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	MusicPatchNode2 field3716;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -704590895
	)
	int field3717;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -194910087
	)
	int field3718;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1003848571
	)
	int field3720;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1141112663
	)
	int field3719;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -953989779
	)
	int field3721;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1792906037
	)
	int field3722;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -725892359
	)
	int field3723;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -447266816
	)
	int field3724;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1526091663
	)
	int field3715;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 127574610
	)
	int field3726;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 819626183
	)
	int field3727;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1900319778
	)
	int field3714;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1384021765
	)
	int field3729;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -516360731
	)
	int field3730;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1943828455
	)
	int field3728;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -372044067
	)
	int field3733;

	MusicPatchNode() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	void method6931() {
		this.table = null;
		this.rawSound = null;
		this.field3716 = null;
		this.stream = null;
	}
}
