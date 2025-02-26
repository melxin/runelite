import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class72 {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ab")
	final ArrayList field897;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 984932519
	)
	int field887;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -492345419
	)
	int field888;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ah")
	byte field896;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1271820095
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 967791731
	)
	int field892;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1401288635
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field895;
	@ObfuscatedName("ae")
	@Export("actions")
	String[] actions;

	class72(int var1) {
		this.field897 = new ArrayList(1);
		this.field887 = -1;
		this.field888 = 0;
		this.coord = new Coord();
		this.orientation = 0;
		this.field892 = -1;
		this.targetIndex = -1;
		this.actions = new String[3];
		this.field887 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1578150887"
	)
	void method2113() {
		this.field895 = null;
		this.field897.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1122924193"
	)
	void method2114(int var1) {
		this.field888 = var1;
		this.orientation = 0;
		this.field892 = -1;
		this.targetIndex = -1;
		this.field896 = 0;
		this.pathTraversed = MoveSpeed.field3122;
		this.field895 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-539421394"
	)
	void method2158(Player var1) {
		this.field897.add(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-2068673497"
	)
	void method2116(Player var1) {
		this.field897.remove(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	void method2117() {
		this.field897.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdp;I)Ldt;",
		garbageValue = "1443327797"
	)
	Player method2118(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field895 != null) {
			var3.read(this.field895);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2623(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	boolean method2119() {
		return this.field888 == -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "760211916"
	)
	void method2120() {
		this.field888 = this.coord.method6867();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "50"
	)
	void method2173(int var1, int var2) {
		this.coord.method6868(this.field888, var1, var2);
		this.field888 = -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-885219041"
	)
	int method2122() {
		return this.coord.plane;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1006610245"
	)
	void method2123(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "-16"
	)
	void method2176(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			Player var3 = (Player)this.field897.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field887 == Client.field646 && class377.USERNAME_PASSWORD == SoundCache.field311 && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3124;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3124) {
				var3.method2623(var5, var6);
			} else {
				var3.method2479(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1726757038"
	)
	void method2200(Buffer var1) {
		this.field895 = var1;

		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			((Player)this.field897.get(var2)).read(this.field895);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1108169330"
	)
	void method2126(int var1, int var2) {
		for (int var3 = 0; var3 < this.field897.size(); ++var3) {
			RestClientThreadFactory.performPlayerAnimation((Player)this.field897.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1062277081"
	)
	void method2127(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			((Actor)this.field897.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	void method2128(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field897.size(); ++var4) {
			Player var5 = (Player)this.field897.get(var4);
			var5.field1242 = false;
			var5.field1245 = 0;
			var5.field1246 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field887 == Client.localPlayerIndex) {
				LoginPacket.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-436735398"
	)
	void method2129(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field897.size(); ++var6) {
			((Actor)this.field897.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "82"
	)
	void method2188(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field897.size(); ++var6) {
			((Actor)this.field897.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-866209249"
	)
	void method2131(int var1) {
		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			((Actor)this.field897.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2138807476"
	)
	void method2112(int var1) {
		this.field892 = var1;

		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			Player var3 = (Player)this.field897.get(var2);
			var3.field1271 = this.field892;
			if (var3.pathLength == 0) {
				var3.orientation = this.field892;
				var3.method2601();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILoc;ZLjava/lang/String;[BI)V",
		garbageValue = "-1005781806"
	)
	void method2133(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field897.size(); ++var8) {
			Player var9 = (Player)this.field897.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && SoundCache.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field637 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1245 = var1 >> 8;
					var9.field1246 = var1 & 255;
					var9.overheadTextCyclesRemaining = 150;
					byte[] var13 = var5;
					int[] var12;
					if (var5 != null && var5.length != 0 && var5.length <= 8) {
						int[] var14 = new int[var5.length];
						int var15 = 0;

						while (true) {
							if (var15 >= var13.length) {
								var12 = var14;
								break;
							}

							if (var13[var15] < 0 || var13[var15] >= class592.field5732.length) {
								var12 = null;
								break;
							}

							var14[var15] = class592.field5732[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1247 = var12;
					var9.field1242 = var3;
					var9.field1293 = var9 != class132.localPlayer && var2.isUser && !Client.field745.isEmpty() && var4.toLowerCase().indexOf(Client.field745) == -1;
				}
			}
		}

		if (var6 && var7 != null) {
			if (var2.isPrivileged) {
				var8 = var3 ? 91 : 1;
			} else {
				var8 = var3 ? 90 : 2;
			}

			if (var2.modIcon != -1) {
				LoginPacket.addGameMessage(var8, BZip2State.method10506(var2.modIcon) + var7, var4);
			} else {
				LoginPacket.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "908612016"
	)
	void method2134(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field897.size(); ++var8) {
			Player var9 = (Player)this.field897.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1221 = var11 + var1;
			var9.field1274 = var12 + var2;
			var9.field1273 = var3 + var11;
			var9.field1275 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1239 = var6;
			var9.field1278 = var7;
			var9.field1291 = 0;
			var9.resetPath(var9.field1273, var9.field1275);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-131224806"
	)
	void method2194(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field897.size(); ++var2) {
			((Player)this.field897.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBB)V",
		garbageValue = "2"
	)
	void method2136(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field897.size(); ++var7) {
			Player var8 = (Player)this.field897.get(var7);
			var8.npcCycle = var1;
			var8.field1281 = var2;
			var8.field1286.method5435(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	void method2163(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field897.size(); ++var5) {
			((Actor)this.field897.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Lpl;Ljava/util/ArrayList;B)Z",
		garbageValue = "1"
	)
	public static boolean method2199(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class335.field3686 = var0;
		AbstractByteArrayCopier.field4097 = var1;
		class335.field3685 = var2;
		class335.field3696 = var3;
		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1077041957"
	)
	public static int method2202(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldh;III)V",
		garbageValue = "-776739513"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (FadeOutTask.isWorldMapEvent(var0.type)) {
			class454.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = Canvas.WorldMapElement_get(class454.worldMapEvent.mapElement);
			var4 = class173.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = Widget.getScript(var5);
		}

		if (var4 != null) {
			NPC.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lnz;III)V",
		garbageValue = "-774198312"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7308(class376.widgetDefinition, true);
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
					int var9 = var8 * var4 + var7 * var5 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + Client.field647 >> 7;
					int var12 = Client.field532 - var10 >> 7;
					class505 var13 = Client.worldViewManager.method2536(-1);
					if (var13 == class505.field5212) {
						PacketBufferNode var24 = class272.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
						var24.packetBuffer.writeByte(18);
						var24.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
						var24.packetBuffer.writeShort(var12 + class200.topLevelWorldView.baseY);
						var24.packetBuffer.writeShortLE(var11 + class200.topLevelWorldView.baseX);
						var24.packetBuffer.writeByte(var4);
						var24.packetBuffer.writeByte(var5);
						var24.packetBuffer.writeShort(Client.camAngleY);
						var24.packetBuffer.writeByte(57);
						var24.packetBuffer.writeByte(0);
						var24.packetBuffer.writeByte(0);
						var24.packetBuffer.writeByte(89);
						var24.packetBuffer.writeShort(class132.localPlayer.x);
						var24.packetBuffer.writeShort(class132.localPlayer.y);
						var24.packetBuffer.writeByte(63);
						Client.packetWriter.addNode(var24);
						Client.destinationX = var11;
						Client.destinationY = var12;
					} else if (var13 == class505.field5213) {
						int var15 = var3.width / 2 + var1;
						int var16 = var3.height / 2 + var2;
						int var17 = MouseHandler.MouseHandler_x - var15;
						int var18 = MouseHandler.MouseHandler_y - var16;
						int var19 = (int)Math.round(Math.atan2((double)var18, (double)var17) * 325.94932345220167D) - 512 & 2047;
						int var20 = var19 - Client.camAngleY;
						var20 &= 2047;
						int var22 = var20 + 64;
						int var21 = (var22 & 2047) / 128;
						Client.field742 = var21;
						Client.field790 = 30;
						PacketBufferNode var23 = class272.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
						var23.packetBuffer.writeByteNeg(Client.field742);
						Client.packetWriter.addNode(var23);
					}
				}
			}

		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lms;I)V",
		garbageValue = "-1164507010"
	)
	static final void method2185(class325 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var8;
		int var10;
		int var29;
		int var30;
		if (class325.field3493 == var0) {
			var2 = var1.readShortLE();
			var3 = var1.readUnsignedByteNeg();
			var4 = (var3 >> 4 & 7) + WorldMapSection0.field3263;
			var5 = (var3 & 7) + class477.field5082;
			short var25 = (short)var1.readShort();
			var7 = var1.readSignedShort();
			var8 = var1.readUnsignedShortAdd();
			short var27 = (short)var1.readSignedShort();
			var10 = var1.readUnsignedIntME();
			var29 = var1.readUnsignedShortAddLE();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var30 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
				class447.method8503(var30, var4, var5, var29, var10, var25, var7, var27, var2, var8);
			}

		} else {
			int var6;
			int var9;
			int var13;
			int var16;
			int var32;
			if (class325.field3494 == var0) {
				var2 = var1.method10324();
				var3 = var1.readUnsignedShort();
				byte var24 = var1.readByteAdd();
				var5 = var1.readUnsignedByteSub() * 4;
				var6 = var1.readUnsignedByte();
				var7 = var1.readUnsignedShortLE();
				var8 = var1.method10282();
				var9 = var1.readUnsignedShortLE();
				byte var28 = var1.readByteAdd();
				var29 = var1.readUnsignedShort();
				var30 = var1.readUnsignedByteSub() * 4;
				var13 = var1.readUnsignedByteAdd();
				var32 = (var13 >> 4 & 7) + WorldMapSection0.field3263;
				int var33 = (var13 & 7) + class477.field5082;
				var4 = var24 + var32;
				var10 = var28 + var33;
				if (var32 >= 0 && var33 >= 0 && var32 < class376.worldView.sizeX && var33 < class376.worldView.sizeY && var4 >= 0 && var10 >= 0 && var4 < class376.worldView.sizeX && var10 < class376.worldView.sizeY && var29 != 65535) {
					var16 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
					class110.method2985(var16, var32, var33, var4, var10, var2, var29, var30, var5, var7, var3, var6, var9, var8);
				}

			} else if (class325.field3485 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field509[var3];
				var6 = var1.readUnsignedShortLE();
				var7 = var1.readUnsignedByteSub();
				var8 = (var7 >> 4 & 7) + WorldMapSection0.field3263;
				var9 = (var7 & 7) + class477.field5082;
				if (0 <= var8 && var8 < 103 && 0 <= var9 && var9 < 103) {
					var10 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
					PendingSpawn var23 = ModelData0.method5540(class376.worldView, var10, var8, var9, var5);
					if (var23 != null) {
						ObjectComposition var35 = class177.getObjectDefinition(var23.field1206);
						if (var35.field2270) {
							UserComparator8.method3186(var10, var8, var9, var3, var4, var5, var6);
							var23.field1210 = var6;
							return;
						}
					}

					boolean var31 = UserComparator8.method3186(var10, var8, var9, var3, var4, var5, var6);
					if (var31) {
						return;
					}

					if (var23 != null) {
						var23.field1210 = var6;
					}
				}

			} else if (class325.field3489 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = (var2 >> 4 & 7) + WorldMapSection0.field3263;
				var4 = (var2 & 7) + class477.field5082;
				var5 = var1.readInt();
				var6 = var1.readUnsignedShort();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					var7 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
					class168.method3660(var7, var3, var4, var6, var5);
				}

			} else if (class325.field3488 == var0) {
				var2 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByteSub();
				var4 = (var3 >> 4 & 7) + WorldMapSection0.field3263;
				var5 = (var3 & 7) + class477.field5082;
				var6 = var1.readUnsignedByteNeg();
				var7 = var1.readUnsignedByteNeg();
				var8 = var1.readUnsignedShortLE();
				var9 = var1.readUnsignedByteAdd() & 31;
				if (var4 >= 0 && var5 >= 0 && var4 < class376.worldView.sizeX && var5 < class376.worldView.sizeY) {
					var10 = var9 + 1;
					if (class132.localPlayer.pathX[0] >= var4 - var10 && class132.localPlayer.pathX[0] <= var10 + var4 && class132.localPlayer.pathY[0] >= var5 - var10 && class132.localPlayer.pathY[0] <= var10 + var5 && AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume() != 0 && var2 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var8;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var9 + (var5 << 8) + (var4 << 16);
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var2;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6;
						Client.field772[Client.soundEffectCount] = var7;
						++Client.soundEffectCount;
					}
				}

			} else if (class325.field3492 == var0) {
				var2 = var1.readUnsignedByte();
				var3 = (var2 >> 4 & 7) + WorldMapSection0.field3263;
				var4 = (var2 & 7) + class477.field5082;
				var5 = var1.readInt();
				var6 = var1.readUnsignedShortAddLE();
				var7 = class376.worldView.plane;
				if (0 <= var3 && var3 < 104 && 0 <= var4 && var4 < 104) {
					var8 = Client.field591 == -1 ? var7 : Client.field591;
					FriendSystem.method1955(var8, var3, var4, var6, var5);
				}

			} else if (class325.field3486 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = (var2 >> 4 & 7) + WorldMapSection0.field3263;
				var4 = (var2 & 7) + class477.field5082;
				var5 = var1.readUnsignedShort();
				var6 = var1.readUnsignedIntLE();
				var7 = var1.readUnsignedIntLE();
				if (var3 >= 0 && var4 >= 0 && var3 < class376.worldView.sizeX && var4 < class376.worldView.sizeY) {
					var8 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
					class59.method1132(var8, var3, var4, var5, var6, var7);
				}

			} else {
				if (class325.field3491 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedShortAdd();
					var4 = var1.readUnsignedByteNeg();
					var5 = (var4 >> 4 & 7) + WorldMapSection0.field3263;
					var6 = (var4 & 7) + class477.field5082;
					var7 = var1.readUnsignedByteSub();
					var8 = var7 >> 2;
					var9 = var7 & 3;
					var10 = Client.field509[var8];
					byte var11 = var1.readByteSub();
					byte var12 = var1.readByteSub();
					var13 = var1.readUnsignedShortLE();
					byte var14 = var1.readByteNeg();
					byte var15 = var1.readByte();
					var16 = var1.readUnsignedShort();
					Player var17;
					if (var13 == Client.localPlayerIndex) {
						var17 = class132.localPlayer;
					} else {
						var17 = (Player)class376.worldView.players.get((long)var13);
					}

					if (var17 != null) {
						int var18 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
						SecureRandomFuture.method2307(var18, var5, var6, var8, var9, var10, var2, var3, var16, var14, var12, var15, var11, var17);
					}
				}

				if (class325.field3482 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByte();
					var4 = (var3 >> 4 & 7) + WorldMapSection0.field3263;
					var5 = (var3 & 7) + class477.field5082;
					var6 = var1.readUnsignedByte();
					var7 = var1.readUnsignedByteSub();
					var8 = var7 >> 2;
					var9 = var7 & 3;
					var10 = Client.field509[var8];
					var29 = var1.readUnsignedByteNeg();
					String[] var21 = null;
					if (var29 > 0) {
						var21 = new String[5];

						for (var13 = 0; var13 < var29; ++var13) {
							var32 = var1.readUnsignedByteSub();
							String var22 = var1.readStringCp1252NullTerminated();
							if (var32 >= 0 && var32 < 5) {
								var21[var32] = var22;
							}
						}
					}

					if (var4 >= 0 && var5 >= 0 && var4 < class376.worldView.sizeX && var5 < class376.worldView.sizeY) {
						var13 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
						ObjectSound.method1959(class376.worldView, var13, var4, var5, var10, var2, var8, var9, var6, var21, 0, -1);
					}

				} else if (class325.field3487 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedByteNeg();
					var4 = (var3 >> 4 & 7) + WorldMapSection0.field3263;
					var5 = (var3 & 7) + class477.field5082;
					var6 = var1.readUnsignedShortAddLE();
					var7 = var1.readUnsignedByteNeg();
					if (var4 >= 0 && var5 >= 0 && var4 < class376.worldView.sizeX && var5 < class376.worldView.sizeY) {
						var4 = Coord.method6905(var4);
						var5 = Coord.method6905(var5);
						var8 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
						GraphicsObject var34 = new GraphicsObject(var6, var8, var4, var5, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var4, var5, var8) - var7, var2, Client.cycle);
						class376.worldView.graphicsObjects.addFirst(var34);
					}

				} else if (class325.field3484 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field509[var3];
					var6 = var1.readUnsignedByte();
					var7 = (var6 >> 4 & 7) + WorldMapSection0.field3263;
					var8 = (var6 & 7) + class477.field5082;
					if (var7 >= 0 && var8 >= 0 && var7 < class376.worldView.sizeX && var8 < class376.worldView.sizeY) {
						var9 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
						ObjectSound.method1959(class376.worldView, var9, var7, var8, var5, -1, var3, var4, 31, (String[])null, 0, -1);
					}

				} else {
					if (class325.field3490 == var0) {
						var2 = var1.readUnsignedByteNeg();
						var3 = (var2 >> 4 & 7) + WorldMapSection0.field3263;
						var4 = (var2 & 7) + class477.field5082;
						var5 = var1.readUnsignedByteNeg();
						var6 = var1.readUnsignedShortAdd();
						var7 = class376.worldView.plane;
						if (var3 >= 0 && var4 >= 0 && var3 < class376.worldView.sizeX && var4 < class376.worldView.sizeY) {
							NodeDeque var19 = class376.worldView.groundItems[var7][var3][var4];
							if (var19 != null) {
								for (TileItem var20 = (TileItem)var19.last(); var20 != null; var20 = (TileItem)var19.previous()) {
									if ((var6 & 32767) == var20.id) {
										var20.setFlag(var5);
										break;
									}
								}
							}

							if (var3 >= 0 && var4 >= 0 && var3 < class376.worldView.sizeX && var4 < class376.worldView.sizeY) {
								var9 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
								class562.method10158(var9, var3, var4, var6, var5);
							}

							return;
						}
					}

					if (class325.field3495 == var0) {
						var2 = var1.readInt();
						var3 = var1.readUnsignedByte();
						var4 = (var3 >> 4 & 7) + WorldMapSection0.field3263;
						var5 = (var3 & 7) + class477.field5082;
						var6 = var1.readUnsignedShortAddLE();
						var7 = var1.readUnsignedByteSub();
						var8 = var1.readUnsignedByte();
						var9 = var1.readUnsignedShortAddLE();
						var10 = var1.readUnsignedShortAddLE();
						boolean var26 = var1.readUnsignedByteAdd() == 1;
						if (var4 >= 0 && var5 >= 0 && var4 < class376.worldView.sizeX && var5 < class376.worldView.sizeY) {
							var30 = Client.field591 == -1 ? class376.worldView.plane : Client.field591;
							class186.addTileItemToGroundItems(var30, var4, var5, var9, var2, var7, var10, var6, var8, var26);
						}

					}
				}
			}
		}
	}
}
