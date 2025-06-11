import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ww")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("aj")
	final int field5714;
	@ObfuscatedName("an")
	final int field5700;
	@ObfuscatedName("ai")
	final int field5701;
	@ObfuscatedName("al")
	final int field5702;
	@ObfuscatedName("ac")
	final int field5703;
	@ObfuscatedName("aa")
	final int field5710;
	@ObfuscatedName("am")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ah")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ag")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -790991921
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2043220229
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ad")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1875866145
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -254103253
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1587641581
	)
	int field5713;
	@ObfuscatedName("aw")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1507386997
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 117419719
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -947735461
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 725193728
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1150979189
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 693151097
	)
	int field5725;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2001244009
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aq")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1915266697
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ba")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1663515821
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bl")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bi")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bv")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bq")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bm")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("be")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bo")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bw")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bf")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bj")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1634285651
	)
	int field5724;

	BZip2State() {
		this.field5714 = 4096;
		this.field5700 = 16;
		this.field5701 = 258;
		this.field5702 = 6;
		this.field5703 = 50;
		this.field5710 = 18002;
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
