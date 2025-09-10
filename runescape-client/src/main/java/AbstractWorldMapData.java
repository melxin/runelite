import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ap")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -447406656
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1893584896
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1165886975
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -652642295
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 779834073
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -595421445
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1103265139
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 48813851
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("an")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ar")
	byte[][][] field3435;
	@ObfuscatedName("ae")
	byte[][][] field3436;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[[[Llm;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ad")
	boolean field3438;
	@ObfuscatedName("ag")
	boolean field3439;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		this.field3438 = false;
		this.field3439 = false;
		new LinkedList();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1975102326"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1653194642"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3438 && this.field3439;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1936364964"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3438 = true;
				this.field3439 = true;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1336987502"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3435 = null;
		this.field3436 = null;
		this.decorations = null;
		this.field3438 = false;
		this.field3439 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILwb;I)V",
		garbageValue = "2055219320"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method6810(var1, var2, var3, var4);
			} else {
				this.method6790(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILwb;II)V",
		garbageValue = "-107402450"
	)
	void method6810(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILwb;II)V",
		garbageValue = "-1861650605"
	)
	void method6790(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3435[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3436[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readVarInt();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1620016669"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZB)V",
		garbageValue = "61"
	)
	static void method6819(ArrayList var0, boolean var1) {
		if (!var1) {
			class339.field3889.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MidiRequest var3 = (MidiRequest)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class339.field3889.add(var3);
				}

				class339.field3895.add(var3);
			}
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	static void method6784() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1289 = 0;
		Client.packetWriter.packetBuffer.array = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1295 = null;
		Client.packetWriter.field1302 = null;
		Client.packetWriter.field1306 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1297 = 0;
		Client.rebootTimer = 0;
		Widget.method8102();
		Client.minimapState = 0;
		Client.destinationX = 0;
		class333.topLevelWorldView.method2680();
		class557.method10856();
		UrlRequest.updateGameState(30);

		for (int var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(MouseHandler.getWindowedMode());
			var1.packetBuffer.writeShort(GameEngine.canvasWidth);
			var1.packetBuffer.writeShort(class396.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
