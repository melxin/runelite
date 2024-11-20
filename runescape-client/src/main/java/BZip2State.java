import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vo")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ab")
	final int field5507;
	@ObfuscatedName("aw")
	final int field5477;
	@ObfuscatedName("at")
	final int field5478;
	@ObfuscatedName("ae")
	final int field5502;
	@ObfuscatedName("ao")
	final int field5480;
	@ObfuscatedName("ac")
	final int field5476;
	@ObfuscatedName("aj")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -600979807
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2071303827
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("an")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1640400397
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1194477385
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -158719599
	)
	int field5488;
	@ObfuscatedName("ar")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 212454487
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 426514311
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1588610905
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1217217536
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -7058017
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 680707379
	)
	int field5495;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1483886293
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ax")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1781436413
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("aq")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1435738999
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bw")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bm")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bv")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bt")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bk")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bb")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ba")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bp")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bo")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bu")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bj")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bh")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1898759737
	)
	int field5487;

	BZip2State() {
		this.field5507 = 4096;
		this.field5477 = 16;
		this.field5478 = 258;
		this.field5502 = 6;
		this.field5480 = 50;
		this.field5476 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
