import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -774877491
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 619029883
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1814724795
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1118517245
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 593224731
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("af")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -858281711
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -885550693
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("av")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ag")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1214984083
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 243927097
	)
	int field1947;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1869939313
	)
	int field1946;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -64519713
	)
	int field1949;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIB)V",
		garbageValue = "119"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7446(ClanChannel.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var8 * var4 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = class53.entity.getX() + var9 >> 7;
					int var12 = class53.entity.getY() - var10 >> 7;
					PacketBufferNode var13 = ScriptEvent.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShort(var12 + GameEngine.topLevelWorldView.baseY);
					var13.packetBuffer.writeShortAddLE(var11 + GameEngine.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(ModeWhere.localPlayer.x);
					var13.packetBuffer.writeShort(ModeWhere.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
