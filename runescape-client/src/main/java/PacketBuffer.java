import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vu")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("ao")
	static final int[] field5592;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2105980967
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5592 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "596402047"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V",
		garbageValue = "1042408868"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "61"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[(super.offset += 29699747) * -2066221813 - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1780665955"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[(super.offset += 29699747) * -2066221813 - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "318410168"
	)
	public boolean method10251() {
		int var1 = super.array[super.offset * -2066221813] - this.isaacCipher.method10918() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1989732549"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[(super.offset += 29699747) * -2066221813 - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[(super.offset += 29699747) * -2066221813 - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "2"
	)
	public void method10253(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[(super.offset += 29699747) * -2066221813 - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1087489312"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 650094680;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "783788571"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field5592[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field5592[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5592[var1];
		}

		return var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8 * 29699747;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-359921516"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "31"
	)
	public int method10246(int var1) {
		return var1 - super.offset * -2066221813;
	}
}
