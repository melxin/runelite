import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("aw")
	static final int[] field5464;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1822041583
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5464 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "2104179666"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwu;I)V",
		garbageValue = "-119897160"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1971927608"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "854394020"
	)
	public boolean method10060() {
		int var1 = super.array[super.offset] - this.isaacCipher.method10718() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1882370492"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "2125590081"
	)
	public void method10062(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2128382663"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field5464[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field5464[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5464[var1];
		}

		return var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2118193712"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-665032512"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1487465178"
	)
	public int method10067(int var1) {
		return var1 - super.offset;
	}
}
