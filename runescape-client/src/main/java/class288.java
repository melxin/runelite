import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class288 implements WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1775251119
	)
	int field3163;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1575321749
	)
	int field3162;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 947655803
	)
	int field3156;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 277246349
	)
	int field3157;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1654093091
	)
	int field3158;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1951986327
	)
	int field3159;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2112018911
	)
	int field3155;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1050491983
	)
	int field3154;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1031370985
	)
	int field3161;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1683391381
	)
	int field3160;

	class288() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)V",
		garbageValue = "43"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3158) {
			var1.regionLowX = this.field3158;
		}

		if (var1.regionHighX < this.field3158) {
			var1.regionHighX = this.field3158;
		}

		if (var1.regionLowY > this.field3159) {
			var1.regionLowY = this.field3159;
		}

		if (var1.regionHighY < this.field3159) {
			var1.regionHighY = this.field3159;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "53"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3163 && var1 < this.field3162 + this.field3163) {
			return var2 >= (this.field3156 << 6) + (this.field3155 << 3) && var2 <= (this.field3156 << 6) + (this.field3155 << 3) + 7 && var3 >= (this.field3157 << 6) + (this.field3154 << 3) && var3 <= (this.field3157 << 6) + (this.field3154 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-177019651"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3158 << 6) + (this.field3161 << 3) && var1 <= (this.field3158 << 6) + (this.field3161 << 3) + 7 && var2 >= (this.field3159 << 6) + (this.field3160 << 3) && var2 <= (this.field3159 << 6) + (this.field3160 << 3) + 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3158 * 64 - this.field3156 * 64 + var2 + (this.field3161 * 8 - this.field3155 * 8), var3 + (this.field3159 * 64 - this.field3157 * 64) + (this.field3160 * 8 - this.field3154 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lnz;",
		garbageValue = "-425070677"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3156 * 64 - this.field3158 * 64 + (this.field3155 * 8 - this.field3161 * 8) + var1;
			int var4 = this.field3157 * 64 - this.field3159 * 64 + var2 + (this.field3154 * 8 - this.field3160 * 8);
			return new Coord(this.field3163, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1542767096"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3163 = var1.readUnsignedByte();
		this.field3162 = var1.readUnsignedByte();
		this.field3156 = var1.readUnsignedShort();
		this.field3155 = var1.readUnsignedByte();
		this.field3157 = var1.readUnsignedShort();
		this.field3154 = var1.readUnsignedByte();
		this.field3158 = var1.readUnsignedShort();
		this.field3161 = var1.readUnsignedByte();
		this.field3159 = var1.readUnsignedShort();
		this.field3160 = var1.readUnsignedByte();
		this.method6307();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1403113813"
	)
	void method6307() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Lmb;",
		garbageValue = "21848"
	)
	public static PacketBufferNode method6320() {
		PacketBufferNode var0 = HttpRequestTask.method288();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
