import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vd")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ao")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("an")
	final int field5606;
	@ObfuscatedName("ae")
	final int field5618;
	@ObfuscatedName("af")
	final int field5608;
	@ObfuscatedName("as")
	final int field5609;
	@ObfuscatedName("aq")
	final int field5610;
	@ObfuscatedName("av")
	final int field5611;
	@ObfuscatedName("am")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("aa")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ap")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1665034593
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2147216371
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("ar")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -587275841
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2128840697
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -618203433
	)
	int field5620;
	@ObfuscatedName("ac")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1737949765
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 761695223
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1201369595
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1896256512
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1425961213
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1021139413
	)
	int field5605;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1791213417
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("at")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1594459273
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("br")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -126514109
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bz")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bb")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("bl")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bw")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bh")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ba")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bk")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bd")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bu")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("bc")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1021856385
	)
	int field5643;

	BZip2State() {
		this.field5606 = 4096;
		this.field5618 = 16;
		this.field5608 = 258;
		this.field5609 = 6;
		this.field5610 = 50;
		this.field5611 = 18002;
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
