import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public class class291 implements WorldMapSection {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1833679573
	)
	int field3298;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -885299097
	)
	int field3305;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1612833923
	)
	int field3296;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 346121259
	)
	int field3301;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1082020519
	)
	int field3300;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 139500401
	)
	int field3297;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -81513781
	)
	int field3299;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2083013705
	)
	int field3303;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -482836167
	)
	int field3304;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1713610377
	)
	int field3302;

	class291() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llr;B)V",
		garbageValue = "78"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3300) {
			var1.regionLowX = this.field3300;
		}

		if (var1.regionHighX < this.field3300) {
			var1.regionHighX = this.field3300;
		}

		if (var1.regionLowY > this.field3297) {
			var1.regionLowY = this.field3297;
		}

		if (var1.regionHighY < this.field3297) {
			var1.regionHighY = this.field3297;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "828092552"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3298 && var1 < this.field3298 + this.field3305) {
			return var2 >= (this.field3296 << 6) + (this.field3299 << 3) && var2 <= (this.field3296 << 6) + (this.field3299 << 3) + 7 && var3 >= (this.field3301 << 6) + (this.field3303 << 3) && var3 <= (this.field3301 << 6) + (this.field3303 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-29"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3300 << 6) + (this.field3304 << 3) && var1 <= (this.field3300 << 6) + (this.field3304 << 3) + 7 && var2 >= (this.field3297 << 6) + (this.field3302 << 3) && var2 <= (this.field3297 << 6) + (this.field3302 << 3) + 7;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-826920955"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3300 * 64 - this.field3296 * 64 + var2 + (this.field3304 * 8 - this.field3299 * 8), var3 + (this.field3297 * 64 - this.field3301 * 64) + (this.field3302 * 8 - this.field3303 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Lng;",
		garbageValue = "-596761800"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3296 * 64 - this.field3300 * 64 + (this.field3299 * 8 - this.field3304 * 8) + var1;
			int var4 = this.field3301 * 64 - this.field3297 * 64 + var2 + (this.field3303 * 8 - this.field3302 * 8);
			return new Coord(this.field3298, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1001820155"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3298 = var1.readUnsignedByte();
		this.field3305 = var1.readUnsignedByte();
		this.field3296 = var1.readUnsignedShort();
		this.field3299 = var1.readUnsignedByte();
		this.field3301 = var1.readUnsignedShort();
		this.field3303 = var1.readUnsignedByte();
		this.field3300 = var1.readUnsignedShort();
		this.field3304 = var1.readUnsignedByte();
		this.field3297 = var1.readUnsignedShort();
		this.field3302 = var1.readUnsignedByte();
		this.method6679();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "460329320"
	)
	void method6679() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lxs;I)Lmb;",
		garbageValue = "-171372256"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
