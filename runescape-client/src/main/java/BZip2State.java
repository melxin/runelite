import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wp")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ab")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("at")
	final int field5987;
	@ObfuscatedName("ag")
	final int field5988;
	@ObfuscatedName("aj")
	final int field5989;
	@ObfuscatedName("ah")
	final int field5990;
	@ObfuscatedName("af")
	final int field5993;
	@ObfuscatedName("ae")
	final int field5992;
	@ObfuscatedName("aq")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ac")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("aa")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1758987413
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -455899227
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("av")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -275171289
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1083746275
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -268843365
	)
	int field6001;
	@ObfuscatedName("au")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 456513501
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2040406813
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 439215197
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -577557504
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 930544033
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 331267111
	)
	int field6008;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1527087481
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("al")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1080348163
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("be")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1966583063
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bj")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bb")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bn")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("by")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bm")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bg")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bu")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bs")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bq")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bo")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1487259629
	)
	int field6024;

	BZip2State() {
		this.field5987 = 4096;
		this.field5988 = 16;
		this.field5989 = 258;
		this.field5990 = 6;
		this.field5993 = 50;
		this.field5992 = 18002;
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
