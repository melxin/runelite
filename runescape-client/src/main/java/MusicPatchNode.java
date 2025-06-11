import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1968669737
	)
	int field3784;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	MusicPatchNode2 field3787;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 378013839
	)
	int field3788;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1408115263
	)
	int field3789;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 296524513
	)
	int field3791;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -306849179
	)
	int field3801;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1293769207
	)
	int field3786;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 859449435
	)
	int field3793;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1834476335
	)
	int field3799;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1292821123
	)
	int field3795;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1723395239
	)
	int field3796;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1191774798
	)
	int field3797;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2063857771
	)
	int field3798;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1703808465
	)
	int field3783;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1267098585
	)
	int field3790;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1863995301
	)
	int field3794;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1638674219
	)
	int field3803;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1474220555
	)
	int field3804;

	MusicPatchNode() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7146() {
		this.table = null;
		this.rawSound = null;
		this.field3787 = null;
		this.stream = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1007476321"
	)
	static final int method7149(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}
}
