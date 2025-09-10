import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wf")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("af")
	static final int[] field5912;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lxj;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1488236839
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5912 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("releaseArray")
	public void releaseArray() {
		super.releaseArray();
		this.isaacCipher = null;
		this.bitIndex = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "39"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V",
		garbageValue = "1930015"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1261406242"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[(super.offset += -290410379) * 1216585693 - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "898450700"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[(super.offset += -290410379) * 1216585693 - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-37"
	)
	public boolean method11142() {
		int var1 = super.array[super.offset * 1216585693] - this.isaacCipher.method11832() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1651101195"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[(super.offset += -290410379) * 1216585693 - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[(super.offset += -290410379) * 1216585693 - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "872104041"
	)
	public void method11137(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[(super.offset += -290410379) * 1216585693 - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 1142750952;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2060660998"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field5912[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field5912[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5912[var1];
		}

		return var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1774101019"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8 * -290410379;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-231673324"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "85688322"
	)
	public int method11149(int var1) {
		return var1 - super.offset * 1216585693;
	}
}
