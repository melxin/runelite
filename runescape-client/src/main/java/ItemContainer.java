import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ac")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("aw")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("at")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1567323622"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class169.World_request == null) {
				class169.World_request = class167.urlRequester.request(new URL(BuddyRankComparator.field1509));
			} else if (class169.World_request.isDone()) {
				byte[] var0 = class169.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class142.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class142.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class168.sortWorlds(class142.World_worlds, 0, class142.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class169.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class169.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "11"
	)
	public static void method2454(String[] var0, int[] var1) {
		HealthBarDefinition.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-470983508"
	)
	public static final void method2466() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-92"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		if (!Script.method2367()) {
			var1 = 12;
		} else if (NpcOverrides.client.containsAccessAndRefreshToken() || NpcOverrides.client.otlTokenRequesterInitialized() || NpcOverrides.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class329.updateLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			Bounds.otpMedium = 0;
			Client.otp = "";
		}

		FriendSystem.method1964();
		class499.focusPasswordWhenUsernameFilled();
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lvg;IB)V",
		garbageValue = "0"
	)
	@Export("updateWorldEntitiesFromPacketBuffer")
	static void updateWorldEntitiesFromPacketBuffer(WorldView var0, PacketBuffer var1, int var2) {
		int var3 = var1.readUnsignedByte();
		if (var3 < var0.worldEntityCount) {
			throw new RuntimeException("dang");
		} else if (var3 > var0.worldEntityCount) {
			throw new RuntimeException("dang!");
		} else {
			var0.worldEntityCount = 0;
			WorldEntityCoord var4 = new WorldEntityCoord();

			int var5;
			int var6;
			int var8;
			int var13;
			for (var5 = 0; var5 < var3; ++var5) {
				var6 = var0.worldEntityIndices[var5];
				WorldEntity var18 = var0.worldEntities[var6];
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					Client.worldViewManager.method2592(var18.worldView);
					var0.worldEntities[var6] = null;
				} else {
					var0.worldEntityIndices[++var0.worldEntityCount - 1] = var6;
					if (var8 != 1) {
						var4.method5695(var18.method9141());
						byte var9 = var1.readByte();
						if (var9 != 0) {
							int var19 = AABB.method5139(var1, var9, 0);
							int var20 = AABB.method5139(var1, var9, 2);
							int var21 = AABB.method5139(var1, var9, 4);
							var13 = AABB.method5139(var1, var9, 6);
							var4.method5689(var19, var20, var21, var13);
						}

						if (var8 == 2) {
							var18.method9146(var4);
						} else {
							var18.method9147(var4);
						}
					}
				}
			}

			while (var1.method10067(Client.packetWriter.serverPacketLength) >= 10) {
				var5 = var1.readUnsignedShort();
				var0.worldEntityIndices[++var0.worldEntityCount - 1] = var5;
				var6 = var1.readUnsignedByte();
				int var7 = var1.readUnsignedByte();
				var8 = var6 * 8;
				int var22 = var7 * 8;
				WorldView var10 = Client.worldViewManager.method2591(var5, var8, var22, SecureUrlRequester.clientPreferences.getDrawDistance(), class232.field2480);
				WorldEntity var11 = new WorldEntity(var5, var10);
				var0.worldEntities[var5] = var11;
				var11.field5028 = var1.readByte();
				WorldEntityCoord var12 = var11.worldEntityCoord;
				var12.method5697(0, 0);
				var12.setZ(0);
				var12.setCurrentRotationAngle(0);
				byte var23 = var1.readByte();
				int var14;
				if (var23 != 0) {
					var14 = AABB.method5139(var1, var23, 0);
					int var15 = AABB.method5139(var1, var23, 2);
					int var16 = AABB.method5139(var1, var23, 4);
					int var17 = AABB.method5139(var1, var23, 6);
					var12.method5689(var14, var15, var16, var17);
				}

				var11.method9146(var11.worldEntityCoord);
				if (var2 >= 4) {
					var13 = var1.readShort();
					var14 = var1.readShort();
					var11.method9187(var13, var14);
				}
			}

		}
	}
}
