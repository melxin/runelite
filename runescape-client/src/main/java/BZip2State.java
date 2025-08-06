import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wv")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("al")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ab")
	final int field5824;
	@ObfuscatedName("ac")
	final int field5825;
	@ObfuscatedName("av")
	final int field5826;
	@ObfuscatedName("au")
	final int field5844;
	@ObfuscatedName("as")
	final int field5828;
	@ObfuscatedName("ah")
	final int field5858;
	@ObfuscatedName("ap")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("am")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("aj")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -218945105
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1246634273
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("aa")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -311200543
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1904747699
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1711031359
	)
	int field5838;
	@ObfuscatedName("at")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -984259673
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -773317041
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1441303115
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1029676032
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1764372569
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 636562831
	)
	int field5845;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1012671975
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("an")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1367439087
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("bj")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2046280979
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bi")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bw")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bo")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("be")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bm")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bq")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bv")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bx")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bl")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bf")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1428086587
	)
	int field5827;

	BZip2State() {
		this.field5824 = 4096;
		this.field5825 = 16;
		this.field5826 = 258;
		this.field5844 = 6;
		this.field5828 = 50;
		this.field5858 = 18002;
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}
}
