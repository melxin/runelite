import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public enum class6 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	field16(0, 0);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		longValue = -8488376298118017843L
	)
	static long field12;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1902216119
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1177345123
	)
	public final int field13;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -97929993
	)
	final int field14;

	class6(int var3, int var4) {
		this.field13 = var3;
		this.field14 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field14;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578249264"
	)
	public static void method33() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CLqt;I)C",
		garbageValue = "-888727155"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1551218912"
	)
	static void method40() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (class328.mouseRecorder != null) {
			class328.mouseRecorder.index = 0;
		}

		GameEngine.hasFocus = true;
		Client.hadFocus = true;
		Client.field435 = -1L;
		ObjectSound.method1583();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1272 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1262 = null;
		Client.packetWriter.field1266 = null;
		Client.packetWriter.field1276 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1270 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		class47.method1767(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		class58.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class448.field5001 = null;
		Client.minimapState = 0;
		Client.field347 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.field337 = -1;
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		Actor.friendSystem.method1523();
		if (VarpDefinition.field1910 > 5000) {
		}

		int var0;
		if (Client.field444) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field1910; ++var0) {
				VarpDefinition var1 = FriendSystem.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (class339.varcs != null) {
			class339.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			ClientPreferences.widgetDefinition.method7289(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			ApproximateRouteStrategy.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.playerAppearance.method7318((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		UserComparator10.method3440();
		class187.friendsChat = null;
		HorizontalAlignment.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		PendingSpawn.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class143.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lcn;IB)V",
		garbageValue = "0"
	)
	static void method44(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2308(var0);
		int var5 = var1.x;
		int var6 = var1.size * -5369856 - 1;
		int var4 = var5 + (var6 << 6);
		int var9 = var1.y;
		int var10 = var1.size * -5369856 - 1;
		int var8 = var9 + (var10 << 6);
		GraphicsObject.worldToScreen(var0, var3.x, var3.y, var4, var8, var2);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ldl;ZLwx;I)V",
		garbageValue = "501417068"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field506 = 0;
		Client.npcCount = 0;
		class228.method4794(var0, var2);
		ClanSettings.method3799(var0, var1, var2);
		FloorUnderlayDefinition.method4251(var0, var2);

		for (int var3 = 0; var3 < Client.field506; ++var3) {
			int var4 = Client.field507[var3];
			NPC var5 = (NPC)var0.npcs.get((long)var4);
			if (var5.field1168) {
				var5.definition = null;
				var5.detach();
			}
		}

		if (var2.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
		}
	}

	@ObfuscatedName("nv")
	static final void method35(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (class338.worldMap != null) {
			class338.worldMap.method10408();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		ClientPacket.clientPreferences.updateBrightness(var0);
	}
}
