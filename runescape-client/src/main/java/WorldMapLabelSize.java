import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 722046335
	)
	final int field3331;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1938465625
	)
	final int field3329;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 310051823
	)
	final int field3333;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 3);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3331 = var1;
		this.field3329 = var2;
		this.field3333 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1638055948"
	)
	boolean method6573(float var1) {
		return var1 >= (float)this.field3333;
	}

	@ObfuscatedName("at")
	public static boolean method6577(long var0) {
		boolean var2 = var0 != 0L;
		if (var2) {
			boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-47"
	)
	static final void method6576(String var0) {
		PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lts;ZB)V",
		garbageValue = "2"
	)
	static void method6575(WorldView var0, WorldEntity var1, boolean var2) {
		boolean var3 = var1.field5538.field2227 && !var2;
		long var4 = 0L;
		boolean var6 = var1.worldView.id == Client.currentWorldViewId;
		class406 var7 = var1.method10496(var6);
		boolean var8;
		if (var7 == class406.field4907) {
			var4 = class236.calculateTag(0, 0, 0, 5, false, 0, 0);
		} else if (var3 && var7 != class406.field4905) {
			var8 = var7 == class406.field4903;
			var4 = class236.calculateTag(var1.getX(), Coord.method7692(var1.getY()), Coord.method7692(var1.getPlane()), 4, !var8, var1.plane, var0.id);
		}

		var1.worldEntityCoord.setZ(NPCComposition.getTileHeight(var0, var1.getY(), var1.getPlane(), var0.plane));
		var1.worldView.scene.cycle = Client.cycle;
		var1.initScenePlane(var2);
		var8 = var0.scene.drawEntity(var0.plane, var1.getY(), var1.getPlane(), var1.getZ(), 60, var1.worldView.scene, var1.method10529(), var4, false);
		if (var8 && !var2) {
			WorldView var9 = var1.worldView;
			if (Client.renderSelf) {
				class31.addPlayerToScene(var9, Client.localPlayerIndex, false);
			}

			WorldView var10 = var1.worldView;
			if (Client.combatTargetPlayerIndex >= 0 && var10.players.get((long)Client.combatTargetPlayerIndex) != null) {
				class31.addPlayerToScene(var10, Client.combatTargetPlayerIndex, false);
			}

			class291.addNpcsToScene(var1.worldView, class201.field2172);
			class234.method5162(var1.worldView);
			class291.addNpcsToScene(var1.worldView, class201.field2168);
			class291.addNpcsToScene(var1.worldView, class201.field2167);
			UserList.method10364(var1.worldView);
		}

	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lcw;I)V",
		garbageValue = "1149527128"
	)
	static final void method6578(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = HorizontalAlignment.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field992 = var6;
		var1.field1007 = var7;
	}
}
