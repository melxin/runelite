import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xh")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("av")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("at")
	final int field6056;
	@ObfuscatedName("ag")
	final int field6025;
	@ObfuscatedName("an")
	final int field6043;
	@ObfuscatedName("ae")
	final int field6027;
	@ObfuscatedName("aj")
	final int field6028;
	@ObfuscatedName("ak")
	final int field6029;
	@ObfuscatedName("aw")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ap")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ay")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2024289487
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 898939947
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ad")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -702324125
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1270918355
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1116340389
	)
	int field6038;
	@ObfuscatedName("ab")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -433006017
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1565757723
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1065960537
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1799746560
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1770922585
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1873987455
	)
	int field6045;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -849818967
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aa")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 981823545
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("be")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1542765527
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bg")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bs")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bz")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bk")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bb")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bj")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bm")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bp")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bt")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bu")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1735634051
	)
	int field6061;

	BZip2State() {
		this.field6056 = 4096;
		this.field6025 = 16;
		this.field6043 = 258;
		this.field6027 = 6;
		this.field6028 = 50;
		this.field6029 = 18002;
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
