import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ax")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 522434629
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "659202401"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1952497567"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "450752558"
	)
	public static void method5120(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-728355894"
	)
	static final void method5121(String var0, int var1) {
		PacketBufferNode var2 = ScriptEvent.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(MouseRecorder.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-1228848950"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (class30.worldView.groundItems[var0][var1][var2] == null) {
			class30.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class30.worldView.groundItems[var0][var1][var2].addFirst(var10);
		ByteArrayPool.updateItemPile(var0, var1, var2);
	}
}
