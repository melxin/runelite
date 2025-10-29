import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xj")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("av")
	static final int[] field6013;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxo;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1996081443
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field6013 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("releaseArray")
	public void releaseArray() {
		super.releaseArray();
		this.isaacCipher = null;
		this.bitIndex = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "-492176979"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxo;I)V",
		garbageValue = "2029445353"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "326"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[(super.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "246"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[(super.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "12609"
	)
	public boolean method11590() {
		int var1 = super.array[super.offset * 2108391709] - this.isaacCipher.method12263() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1056631563"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[(super.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[(super.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "180"
	)
	public void method11575(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[(super.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1537483682"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * -312735512;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1333712909"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field6013[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field6013[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field6013[var1];
		}

		return var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8 * 1741769013;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1549766289"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1731200045"
	)
	public int method11567(int var1) {
		return var1 - super.offset * 2108391709;
	}
}
