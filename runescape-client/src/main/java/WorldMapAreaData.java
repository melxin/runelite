import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("au")
	HashSet field3341;
	@ObfuscatedName("aj")
	HashSet field3342;
	@ObfuscatedName("al")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lve;IZI)V",
		garbageValue = "-2127506204"
	)
	void method6433(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method5971(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3341 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3341.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3342 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3342.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lve;ZI)V",
		garbageValue = "-1830303755"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1783177534"
	)
	public static void method6436() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static void method6441(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = FloorDecoration.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeShortAdd(var0 + class509.topLevelWorldView.baseX);
		var4.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeShortAdd(var1 + class509.topLevelWorldView.baseY);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(Script.localPlayer.x);
		var4.packetBuffer.writeShort(Script.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}
}
