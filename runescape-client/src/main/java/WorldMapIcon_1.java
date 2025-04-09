import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("cp")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1588387937
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 922235231
	)
	@Export("element")
	int element;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1530274509
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 903122851
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;ILla;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1284851473"
	)
	@Export("init")
	void init() {
		this.element = class162.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(ArchiveDiskAction.WorldMapElement_get(this.element));
		WorldMapElement var1 = ArchiveDiskAction.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1723335551"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Llw;",
		garbageValue = "115"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "747885801"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1535434695"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "18"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZS)[B",
		garbageValue = "-31804"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5056) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5059 > 0) {
				var3 = ByteArrayPool.field5068[--ByteArrayPool.field5059];
				ByteArrayPool.field5068[ByteArrayPool.field5059] = null;
				return var3;
			}

			int var6;
			if (class240.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < WorldEntityCoord.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((WorldEntityCoord.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < WorldEntityCoord.ByteArrayPool_alternativeSizes[var6] && var1) && class149.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class240.ByteArrayPool_arrays[var6][--class149.ByteArrayPool_altSizeArrayCounts[var6]];
						class240.ByteArrayPool_arrays[var6][class149.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && WorldEntityCoord.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < WorldEntityCoord.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= WorldEntityCoord.ByteArrayPool_alternativeSizes[var6] && class149.ByteArrayPool_altSizeArrayCounts[var6] < class240.ByteArrayPool_arrays[var6].length) {
						return new byte[WorldEntityCoord.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2120704028"
	)
	public static boolean method5940(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1482421850"
	)
	static void method5942() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (class433.mouseRecorder != null) {
			class433.mouseRecorder.index = 0;
		}

		class231.hasFocus = true;
		Client.hadFocus = true;
		Client.field564 = -1L;
		class94.method2564();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1471 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1461 = null;
		Client.packetWriter.field1474 = null;
		Client.packetWriter.field1463 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1475 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		WorldMapIcon_0.method6266();
		class256.method5322(0);
		Interpreter.method2161();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class224.field2524 = null;
		Client.minimapState = 0;
		Client.field761 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.field530 = -1;
		Client.playerUpdateManager.method3011();
		class223.friendSystem.clear();
		if (VarpDefinition.field2569 > 5000) {
		}

		int var0;
		if (Client.field639) {
			Arrays.fill(Varps.Varps_temp, 0);
			Arrays.fill(Varps.Varps_main, 0);
		} else {
			for (var0 = 0; var0 < VarpDefinition.field2569; ++var0) {
				VarpDefinition var1 = class139.VarpDefinition_get(var0);
				if (var1 != null) {
					Varps.Varps_temp[var0] = 0;
					Varps.Varps_main[var0] = 0;
				}
			}
		}

		if (NPCComposition.varcs != null) {
			NPCComposition.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class232.widgetDefinition.method6954(Client.rootInterface);
		}

		for (InterfaceParent var2 = (InterfaceParent)Client.interfaceParents.first(); var2 != null; var2 = (InterfaceParent)Client.interfaceParents.next()) {
			class220.closeInterface(var2, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		WorldMapIcon_0.method6266();
		Client.playerAppearance.method6990((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		class267.method5632();
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var3.packetBuffer.writeByte(class171.getWindowedMode());
			var3.packetBuffer.writeShort(GameEngine.canvasWidth);
			var3.packetBuffer.writeShort(class141.canvasHeight);
			Client.packetWriter.addNode(var3);
		}

		SoundCache.friendsChat = null;
		class331.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class92.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		VarcInt.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}
}
