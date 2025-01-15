import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("va")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ab")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ay")
	final int field5514;
	@ObfuscatedName("ah")
	final int field5481;
	@ObfuscatedName("az")
	final int field5479;
	@ObfuscatedName("ao")
	final int field5478;
	@ObfuscatedName("ad")
	final int field5490;
	@ObfuscatedName("an")
	final int field5495;
	@ObfuscatedName("ae")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -668067143
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1025267483
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ac")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1074383035
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1139853263
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -693670423
	)
	int field5489;
	@ObfuscatedName("af")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1474045503
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1176679573
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1903625127
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -945492992
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 676582951
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1870435271
	)
	int field5496;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1295603033
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("ar")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 490755121
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ap")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -294999815
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bu")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bh")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bw")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bb")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bx")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bd")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bi")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bz")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bt")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bf")
	@Export("base")
	int[][] base;
	@ObfuscatedName("by")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bm")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2065114951
	)
	int field5493;

	BZip2State() {
		this.field5514 = 4096;
		this.field5481 = 16;
		this.field5479 = 258;
		this.field5478 = 6;
		this.field5490 = 50;
		this.field5495 = 18002;
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
