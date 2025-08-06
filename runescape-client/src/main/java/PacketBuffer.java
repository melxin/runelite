import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wk")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("al")
	static final int[] field5810;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxs;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1169773809
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5810 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "170"
	)
	@Export("releaseArray")
	public void releaseArray() {
		super.releaseArray();
		this.isaacCipher = null;
		this.bitIndex = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([IB)V",
		garbageValue = "-14"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxs;B)V",
		garbageValue = "33"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1470079969"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.offset[++super.field5818 - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1754566930"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.offset[++super.field5818 - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "93283288"
	)
	public boolean method11182() {
		int var1 = super.offset[super.field5818] - this.isaacCipher.method11837() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "54267719"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.offset[++super.field5818 - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.offset[++super.field5818 - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1793851189"
	)
	public void method11174(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.offset[++super.field5818 - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.field5818 * 8;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-634122065"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.offset[var2++] & field5810[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.offset[var2] & field5810[var3];
		} else {
			var4 += super.offset[var2] >> var3 - var1 & field5810[var1];
		}

		return var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-107"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.field5818 = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2050415761"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-945525384"
	)
	public int method11179(int var1) {
		return var1 - super.field5818;
	}
}
