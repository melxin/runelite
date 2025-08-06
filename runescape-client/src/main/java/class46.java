import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class46 {
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field666;
	@ObfuscatedName("al")
	final ArrayList field655;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1771319689
	)
	int field654;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("av")
	byte field662;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field659;
	@ObfuscatedName("ah")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1224497059
	)
	int field661;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2127711195
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1083755939
	)
	int field663;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -461963575
	)
	@Export("targetIndex")
	int targetIndex;

	class46(int var1) {
		this.field655 = new ArrayList(1);
		this.field654 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field661 = -1;
		this.orientation = 0;
		this.field663 = -1;
		this.targetIndex = -1;
		this.field661 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2091576973"
	)
	void method1764() {
		this.field659 = null;
		this.field655.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "935855017"
	)
	void method1765(int var1) {
		this.field654 = var1;
		this.orientation = 0;
		this.field663 = -1;
		this.targetIndex = -1;
		this.field662 = 0;
		this.pathTraversed = MoveSpeed.field3194;
		this.field659 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcr;S)V",
		garbageValue = "24411"
	)
	void method1766(Player var1) {
		this.field655.add(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "1304389404"
	)
	void method1767(Player var1) {
		this.field655.remove(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	void method1768() {
		this.field655.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdj;B)Lcr;",
		garbageValue = "122"
	)
	Player method1769(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field659 != null) {
			var3.read(this.field659);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2462(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2089305803"
	)
	boolean method1819() {
		return this.field654 == -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	void method1771() {
		this.field654 = this.coord.method7441();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-25284"
	)
	void method1772(int var1, int var2) {
		this.coord.method7439(this.field654, var1, var2);
		this.field654 = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "818164254"
	)
	int method1773() {
		return this.coord.plane;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "65535"
	)
	void method1825(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lke;B)V",
		garbageValue = "-55"
	)
	void method1826(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			Player var3 = (Player)this.field655.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field661 == Client.field328 && BuddyRankComparator.field1571 == class381.USERNAME_PASSWORD && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3195;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3195) {
				var3.method2462(var5, var6);
			} else {
				var3.method2161(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1192868449"
	)
	void method1776(Buffer var1) {
		this.field659 = var1;

		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			((Player)this.field655.get(var2)).read(this.field659);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "776882298"
	)
	void method1838(int var1, int var2) {
		for (int var3 = 0; var3 < this.field655.size(); ++var3) {
			class399.performPlayerAnimation((Player)this.field655.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-846211743"
	)
	void method1778(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			((Actor)this.field655.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1826635472"
	)
	void method1779(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field655.size(); ++var4) {
			Player var5 = (Player)this.field655.get(var4);
			var5.field1054 = false;
			var5.field1060 = 0;
			var5.field1078 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field661 == Client.localPlayerIndex) {
				AuthenticationScheme.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "97"
	)
	void method1808(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field655.size(); ++var6) {
			((Actor)this.field655.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "939764361"
	)
	void method1781(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field655.size(); ++var6) {
			((Actor)this.field655.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "111"
	)
	void method1763(int var1) {
		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			((Actor)this.field655.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1824302540"
	)
	void method1783(int var1) {
		this.field663 = var1;

		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			Player var3 = (Player)this.field655.get(var2);
			var3.field1062 = this.field663;
			if (var3.pathLength == 0) {
				var3.orientation = this.field663;
				var3.method2397();
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILpj;ZLjava/lang/String;[BI)V",
		garbageValue = "867207329"
	)
	void method1784(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field655.size(); ++var8) {
			Player var9 = (Player)this.field655.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && class137.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field432 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1060 = var1 >> 8;
					var9.field1078 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class610.field5981.length) {
								var12 = null;
								break;
							}

							var14[var15] = class610.field5981[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1030 = var12;
					var9.field1054 = var3;
					var9.field1058 = var9 != class27.localPlayer && var2.isUser && !Client.field420.isEmpty() && var4.toLowerCase().indexOf(Client.field420) == -1;
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
				AuthenticationScheme.addGameMessage(var8, class82.method2754(var2.modIcon) + var7, var4);
			} else {
				AuthenticationScheme.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1134070693"
	)
	void method1774(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field655.size(); ++var8) {
			Player var9 = (Player)this.field655.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1070 = var11 + var1;
			var9.field1072 = var12 + var2;
			var9.field1071 = var3 + var11;
			var9.field1073 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1075 = var6;
			var9.field1076 = var7;
			var9.field1086 = 0;
			var9.resetPath(var9.field1071, var9.field1073);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-908747232"
	)
	void method1830(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field655.size(); ++var2) {
			((Player)this.field655.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBB)V",
		garbageValue = "-122"
	)
	void method1787(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field655.size(); ++var7) {
			Player var8 = (Player)this.field655.get(var7);
			var8.npcCycle = var1;
			var8.field1026 = var2;
			var8.field1066.method5658(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "238998260"
	)
	void method1788(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field655.size(); ++var5) {
			((Actor)this.field655.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lqq;II)Lmb;",
		garbageValue = "-1088032740"
	)
	public static PacketBufferNode method1841(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.MESSAGE_PUBLIC, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = Message.method790(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		PcmPlayer.method3049(var4.packetBuffer, var1);
		if (var0 == class375.field4256.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-241375547"
	)
	public static int method1840(int var0) {
		return class70.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIILkp;Liq;Liq;B)V",
		garbageValue = "-32"
	)
	static final void method1839(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9, Renderable var10, Renderable var11) {
		ObjectComposition var12 = SpriteMask.getObjectDefinition(var5);
		int var13 = var8 >= 0 ? var8 : var12.animationId;
		int var14;
		int var15;
		if (var6 != 1 && var6 != 3) {
			var14 = var12.sizeX;
			var15 = var12.sizeY;
		} else {
			var14 = var12.sizeY;
			var15 = var12.sizeX;
		}

		int var16;
		int var17;
		if (var3 + var14 <= var0.sizeX) {
			var16 = var3 + (var14 >> 1);
			var17 = var3 + (var14 + 1 >> 1);
		} else {
			var16 = var3;
			var17 = var3 + 1;
		}

		int var18;
		int var19;
		if (var15 + var4 <= var0.sizeY) {
			var18 = (var15 >> 1) + var4;
			var19 = var4 + (var15 + 1 >> 1);
		} else {
			var18 = var4;
			var19 = var4 + 1;
		}

		int[][] var20 = var0.tileHeights[var2];
		int var21 = var20[var16][var18] + var20[var17][var18] + var20[var16][var19] + var20[var17][var19] >> 2;
		int var22 = (var3 << 7) + (var14 << 6);
		int var23 = (var4 << 7) + (var15 << 6);
		Scene var24 = var0.scene;
		long var25 = Skills.calculateTag(var1, var3, var4, 2, var12.int1 == 0, var5, var0.id);
		int var27 = (var6 << 6) + var7;
		if (var12.int3 == 1) {
			var27 += 256;
		}

		Object var35;
		if (var7 == 22) {
			if (var13 == -1 && var12.transforms == null) {
				var35 = var12.getModel(22, var6, var20, var22, var21, var23);
			} else {
				var35 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var13, var12.boolean3, var10);
			}

			var24.newFloorDecoration(var1, var3, var4, var21, (Renderable)var35, var25, var27);
			if (var12.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(var7, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.method5181(var1, var3, var4, var21, 1, 1, (Renderable)var35, 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
				}

			} else if (var7 == 0) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(0, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field823[var6], 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.method6140(var3, var4, var7, var6, var12.boolean1);
				}

			} else if (var7 == 1) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(1, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field824[var6], 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.method6140(var3, var4, var7, var6, var12.boolean1);
				}

			} else {
				int var28;
				if (var7 == 2) {
					var28 = var6 + 1 & 3;
					Object var30;
					Object var36;
					if (var13 == -1 && var12.transforms == null) {
						var36 = var12.getModel(2, var6 + 4, var20, var22, var21, var23);
						var30 = var12.getModel(2, var28, var20, var22, var21, var23);
					} else {
						var36 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						var30 = new DynamicObject(var0, var5, 2, var28, var2, var3, var4, var13, var12.boolean3, var11);
					}

					var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var36, (Renderable)var30, Tiles.field823[var6], Tiles.field823[var28], var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.method6140(var3, var4, var7, var6, var12.boolean1);
					}

				} else if (var7 == 3) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(3, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field824[var6], 0, var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.method6140(var3, var4, var7, var6, var12.boolean1);
					}

				} else if (var7 == 9) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(var7, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.method5181(var1, var3, var4, var21, 1, 1, (Renderable)var35, 0, var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
					}

				} else if (var7 == 4) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(4, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field823[var6], 0, 0, 0, var25, var27);
				} else {
					long var29;
					Object var31;
					if (var7 == 5) {
						var28 = 16;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var29) {
							var28 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var29)).int2;
						}

						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)null, Tiles.field823[var6], 0, Tiles.field835[var6] * var28, Tiles.field826[var6] * var28, var25, var27);
					} else if (var7 == 6) {
						var28 = 8;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (var29 != 0L) {
							var28 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var29)).int2 / 2;
						}

						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6 + 4, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)null, 256, var6, Tiles.field827[var6] * var28, Tiles.field828[var6] * var28, var25, var27);
					} else if (var7 == 7) {
						int var34 = var6 + 2 & 3;
						if (var13 == -1 && var12.transforms == null) {
							var35 = var12.getModel(4, var34 + 4, var20, var22, var21, var23);
						} else {
							var35 = new DynamicObject(var0, var5, 4, var34 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, 256, var34, 0, 0, var25, var27);
					} else if (var7 == 8) {
						var28 = 8;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (var29 != 0L) {
							var28 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var29)).int2 / 2;
						}

						int var33 = var6 + 2 & 3;
						Object var32;
						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6 + 4, var20, var22, var21, var23);
							var32 = var12.getModel(4, var33 + 4, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
							var32 = new DynamicObject(var0, var5, 4, var33 + 4, var2, var3, var4, var13, var12.boolean3, var11);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)var32, 256, var6, Tiles.field827[var6] * var28, Tiles.field828[var6] * var28, var25, var27);
					}
				}
			}
		} else {
			if (var13 == -1 && var12.transforms == null) {
				var35 = var12.getModel(10, var6, var20, var22, var21, var23);
			} else {
				var35 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var13, var12.boolean3, var10);
			}

			if (var35 != null) {
				var24.method5181(var1, var3, var4, var21, var14, var15, (Renderable)var35, var7 == 11 ? 256 : 0, var25, var27);
			}

			if (var12.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
			}

		}
	}
}
