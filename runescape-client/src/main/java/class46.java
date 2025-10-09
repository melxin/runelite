import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class46 {
	@ObfuscatedName("ab")
	final ArrayList field652;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1485912601
	)
	int field645;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("aj")
	byte field647;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field649;
	@ObfuscatedName("ae")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1103289019
	)
	int field651;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -898954723
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -333350903
	)
	int field653;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1416881641
	)
	@Export("targetIndex")
	int targetIndex;

	class46(int var1) {
		this.field652 = new ArrayList(1);
		this.field645 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field651 = -1;
		this.orientation = 0;
		this.field653 = -1;
		this.targetIndex = -1;
		this.field651 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	void method1814() {
		this.field649 = null;
		this.field652.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	void method1885(int var1) {
		this.field645 = var1;
		this.orientation = 0;
		this.field653 = -1;
		this.targetIndex = -1;
		this.field647 = 0;
		this.pathTraversed = MoveSpeed.field3276;
		this.field649 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "-907826383"
	)
	void method1861(Player var1) {
		this.field652.add(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "-1633067675"
	)
	void method1817(Player var1) {
		this.field652.remove(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "281712203"
	)
	void method1818() {
		this.field652.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdm;I)Lcs;",
		garbageValue = "-903671632"
	)
	Player method1894(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field649 != null) {
			var3.read(this.field649);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2449(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1334536658"
	)
	boolean method1820() {
		return this.field645 == -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1731250955"
	)
	void method1892() {
		this.field645 = this.coord.method7428();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1272837957"
	)
	void method1822(int var1, int var2) {
		this.coord.method7431(this.field645, var1, var2);
		this.field645 = -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-546799937"
	)
	int method1823() {
		return this.coord.plane;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-64"
	)
	void method1824(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-63605139"
	)
	void method1830(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			Player var3 = (Player)this.field652.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field651 == Client.field328 && class381.field4430 == GrandExchangeOffer.USERNAME_PASSWORD && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3278;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3278) {
				var3.method2449(var5, var6);
			} else {
				var3.method2213(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1231484759"
	)
	void method1826(Buffer var1) {
		this.field649 = var1;

		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			((Player)this.field652.get(var2)).read(this.field649);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1244991195"
	)
	void method1883(int var1, int var2) {
		for (int var3 = 0; var3 < this.field652.size(); ++var3) {
			class271.performPlayerAnimation((Player)this.field652.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1810732830"
	)
	void method1828(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			((Actor)this.field652.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	void method1829(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field652.size(); ++var4) {
			Player var5 = (Player)this.field652.get(var4);
			var5.field1096 = false;
			var5.field1042 = 0;
			var5.field1081 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field651 == Client.localPlayerIndex) {
				class292.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-1"
	)
	void method1889(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field652.size(); ++var6) {
			((Actor)this.field652.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-49"
	)
	void method1831(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field652.size(); ++var6) {
			((Actor)this.field652.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	void method1880(int var1) {
		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			((Actor)this.field652.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1909635725"
	)
	void method1833(int var1) {
		this.field653 = var1;

		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			Player var3 = (Player)this.field652.get(var2);
			var3.field1075 = this.field653;
			if (var3.pathLength == 0) {
				var3.orientation = this.field653;
				var3.method2460();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILpn;ZLjava/lang/String;[BI)V",
		garbageValue = "-1866120696"
	)
	void method1834(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field652.size(); ++var8) {
			Player var9 = (Player)this.field652.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && KitDefinition.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field321 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1042 = var1 >> 8;
					var9.field1081 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class611.field6147.length) {
								var12 = null;
								break;
							}

							var14[var15] = class611.field6147[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1070 = var12;
					var9.field1096 = var3;
					var9.field1077 = var9 != class159.localPlayer && var2.isUser && !Client.field427.isEmpty() && var4.toLowerCase().indexOf(Client.field427) == -1;
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
				class292.addGameMessage(var8, class132.method3671(var2.modIcon) + var7, var4);
			} else {
				class292.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "131377838"
	)
	void method1835(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field652.size(); ++var8) {
			Player var9 = (Player)this.field652.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1032 = var11 + var1;
			var9.field1080 = var12 + var2;
			var9.field1061 = var3 + var11;
			var9.field1055 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1083 = var6;
			var9.field1084 = var7;
			var9.field1094 = 0;
			var9.resetPath(var9.field1061, var9.field1055);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "19"
	)
	void method1836(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field652.size(); ++var2) {
			((Player)this.field652.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBS)V",
		garbageValue = "27930"
	)
	void method1827(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field652.size(); ++var7) {
			Player var8 = (Player)this.field652.get(var7);
			var8.npcCycle = var1;
			var8.field1041 = var2;
			var8.field1071.method5729(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "199543521"
	)
	void method1838(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field652.size(); ++var5) {
			((Actor)this.field652.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IZI)V",
		garbageValue = "-1531378961"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = (Player)var0.players.get((long)var1);
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.method2442() == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = ClanChannelMember.calculateTag(0, 0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = VerticalAlignment.method4455(var0, var3.x, var3.y, var4, var3.vmethod2813());
					var3.tileHeight -= var3.method2444();
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = VerticalAlignment.method4455(var0, var3.x, var3.y, var4, var3.vmethod2813());
					var3.tileHeight -= var3.method2444();
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "31"
	)
	static void method1844(int var0, int var1, int var2, int var3, int var4) {
		AsyncHttpResponse.method275(class32.worldView, var0, var1, var2, var3, var4);
	}
}
