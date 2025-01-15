import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("ah")
	static final int[] field5466;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwr;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -458675841
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field5466 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([II)V",
		garbageValue = "1906157384"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwr;I)V",
		garbageValue = "-1275790681"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-478530350"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "699577370"
	)
	public boolean method10224() {
		int var1 = super.array[super.offset] - this.isaacCipher.method10888() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "367906627"
	)
	public void method10225(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "7"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field5466[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field5466[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field5466[var1];
		}

		return var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "508136829"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-53"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "569639568"
	)
	public int method10230(int var1) {
		return var1 - super.offset;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "28"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field541 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (TextureProvider.getWindowedMode() == 1) {
			Client.client.setMaxCanvasSize(765, 503);
		} else {
			Client.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(TextureProvider.getWindowedMode());
			var1.packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
			var1.packetBuffer.writeShort(Huffman.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
