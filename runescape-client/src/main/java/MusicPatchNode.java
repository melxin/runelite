import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 591677655
	)
	int field4016;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	MusicPatchNode2 field4022;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 35559339
	)
	int field4021;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1059417007
	)
	int field4019;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 399647583
	)
	int field4018;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1053004281
	)
	int field4023;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1025719767
	)
	int field4024;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1520153051
	)
	int field4025;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 643864511
	)
	int field4026;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1323950597
	)
	int field4020;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1387418467
	)
	int field4033;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2068959101
	)
	int field4017;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 498415289
	)
	int field4030;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1743855771
	)
	int field4031;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1992283931
	)
	int field4032;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1962630943
	)
	int field4029;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 67522799
	)
	int field4035;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 408960161
	)
	int field4036;

	MusicPatchNode() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "198556087"
	)
	void method7595() {
		this.table = null;
		this.rawSound = null;
		this.field4022 = null;
		this.stream = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpf;",
		garbageValue = "40"
	)
	public static class403[] method7598() {
		return new class403[]{class403.field4870, class403.field4874, class403.field4873, class403.field4872};
	}
}
