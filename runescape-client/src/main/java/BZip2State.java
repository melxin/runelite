import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wy")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("aw")
	final int field5953;
	@ObfuscatedName("at")
	final int field5952;
	@ObfuscatedName("ac")
	final int field5934;
	@ObfuscatedName("ap")
	final int field5926;
	@ObfuscatedName("aq")
	final int field5931;
	@ObfuscatedName("ao")
	final int field5928;
	@ObfuscatedName("as")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("al")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("au")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 165919671
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -811899719
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("am")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2002647975
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 48925521
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1855910913
	)
	int field5937;
	@ObfuscatedName("ay")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1400946077
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -397965385
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -862688861
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -5485568
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 760146419
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 892012033
	)
	int field5944;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1253397001
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("aj")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1424994717
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("bt")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1852862433
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bu")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bi")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bd")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ba")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bb")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bo")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bl")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("by")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bg")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bx")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -848659903
	)
	int field5960;

	BZip2State() {
		this.field5953 = 4096;
		this.field5952 = 16;
		this.field5934 = 258;
		this.field5926 = 6;
		this.field5931 = 50;
		this.field5928 = 18002;
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
