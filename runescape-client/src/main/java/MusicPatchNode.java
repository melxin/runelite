import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 760781403
	)
	int field3976;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	MusicPatchNode2 field3990;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1429702665
	)
	int field3980;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1956043795
	)
	int field3981;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1159355823
	)
	int field3982;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -775564609
	)
	int field3983;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 485990017
	)
	int field3984;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1794535337
	)
	int field3985;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -857880315
	)
	int field3986;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 913960865
	)
	int field3987;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 161384757
	)
	int field3993;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1836000389
	)
	int field3975;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1518610583
	)
	int field3988;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1339043287
	)
	int field3997;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 282399253
	)
	int field3992;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 826068645
	)
	int field3989;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1379239075
	)
	int field3995;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1034569253
	)
	int field3996;

	MusicPatchNode() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method7374() {
		this.table = null;
		this.rawSound = null;
		this.field3990 = null;
		this.stream = null;
	}
}
