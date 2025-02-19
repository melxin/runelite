import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vl")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ab")
	final int field5597;
	@ObfuscatedName("ay")
	final int field5589;
	@ObfuscatedName("au")
	final int field5580;
	@ObfuscatedName("ad")
	final int field5581;
	@ObfuscatedName("ah")
	final int field5590;
	@ObfuscatedName("ac")
	final int field5583;
	@ObfuscatedName("ao")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -957102311
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2075993383
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("as")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 490913511
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1391828329
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -519697365
	)
	int field5578;
	@ObfuscatedName("ak")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 789697895
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1375912885
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 824206413
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -272399360
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2017435101
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1789639429
	)
	int field5585;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 359210129
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aw")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1053218627
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("at")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1857637575
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bw")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bo")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bs")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bz")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bt")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ba")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bg")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bv")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bk")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bu")
	@Export("base")
	int[][] base;
	@ObfuscatedName("by")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bh")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -198335469
	)
	int field5598;

	BZip2State() {
		this.field5597 = 4096;
		this.field5589 = 16;
		this.field5580 = 258;
		this.field5581 = 6;
		this.field5590 = 50;
		this.field5583 = 18002;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "494144507"
	)
	static String method10506(int var0) {
		return "<img=" + var0 + ">";
	}
}
