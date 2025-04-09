import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class72 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 91149951
	)
	static int field886;
	@ObfuscatedName("ao")
	final ArrayList field879;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 929385457
	)
	int field875;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("af")
	byte field878;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	Buffer field880;
	@ObfuscatedName("av")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 381846483
	)
	int field884;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -362042625
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -109169357
	)
	int field876;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2000950451
	)
	@Export("targetIndex")
	int targetIndex;

	class72(int var1) {
		this.field879 = new ArrayList(1);
		this.field875 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field884 = -1;
		this.orientation = 0;
		this.field876 = -1;
		this.targetIndex = -1;
		this.field884 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-860358594"
	)
	void method2164() {
		this.field880 = null;
		this.field879.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1294276812"
	)
	void method2165(int var1) {
		this.field875 = var1;
		this.orientation = 0;
		this.field876 = -1;
		this.targetIndex = -1;
		this.field878 = 0;
		this.pathTraversed = MoveSpeed.field3126;
		this.field880 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V",
		garbageValue = "850249739"
	)
	void method2173(Player var1) {
		this.field879.add(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V",
		garbageValue = "-2018551980"
	)
	void method2176(Player var1) {
		this.field879.remove(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	void method2211() {
		this.field879.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdj;I)Ldu;",
		garbageValue = "-2059694521"
	)
	Player method2169(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field880 != null) {
			var3.read(this.field880);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2640(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-838786831"
	)
	boolean method2170() {
		return this.field875 == -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8432"
	)
	void method2171() {
		this.field875 = this.coord.method6900();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1875671626"
	)
	void method2172(int var1, int var2) {
		this.coord.method6887(this.field875, var1, var2);
		this.field875 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "510657455"
	)
	int method2181() {
		return this.coord.plane;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2065466702"
	)
	void method2174(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkw;B)V",
		garbageValue = "75"
	)
	void method2175(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			Player var3 = (Player)this.field879.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field884 == Client.field532 && ItemContainer.USERNAME_PASSWORD == class377.field4189 && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3128;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3128) {
				var3.method2640(var5, var6);
			} else {
				var3.method2512(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "100"
	)
	void method2223(Buffer var1) {
		this.field880 = var1;

		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			((Player)this.field879.get(var2)).read(this.field880);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-110116400"
	)
	void method2224(int var1, int var2) {
		for (int var3 = 0; var3 < this.field879.size(); ++var3) {
			class109.performPlayerAnimation((Player)this.field879.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	void method2178(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			((Actor)this.field879.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "808508330"
	)
	void method2179(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field879.size(); ++var4) {
			Player var5 = (Player)this.field879.get(var4);
			var5.field1227 = false;
			var5.field1253 = 0;
			var5.field1254 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field884 == Client.localPlayerIndex) {
				class279.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	void method2180(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field879.size(); ++var6) {
			((Actor)this.field879.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-61128159"
	)
	void method2221(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field879.size(); ++var6) {
			((Actor)this.field879.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1607280233"
	)
	void method2182(int var1) {
		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			((Actor)this.field879.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "106"
	)
	void method2241(int var1) {
		this.field876 = var1;

		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			Player var3 = (Player)this.field879.get(var2);
			var3.field1211 = this.field876;
			if (var3.pathLength == 0) {
				var3.orientation = this.field876;
				var3.method2693();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILou;ZLjava/lang/String;[BB)V",
		garbageValue = "76"
	)
	void method2215(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field879.size(); ++var8) {
			Player var9 = (Player)this.field879.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && class223.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field808 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1253 = var1 >> 8;
					var9.field1254 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class592.field5758.length) {
								var12 = null;
								break;
							}

							var14[var15] = class592.field5758[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1255 = var12;
					var9.field1227 = var3;
					var9.field1251 = var9 != Script.localPlayer && var2.isUser && !Client.field802.isEmpty() && var4.toLowerCase().indexOf(Client.field802) == -1;
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
				class279.addGameMessage(var8, class233.method5030(var2.modIcon) + var7, var4);
			} else {
				class279.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2021339119"
	)
	void method2233(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field879.size(); ++var8) {
			Player var9 = (Player)this.field879.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1256 = var11 + var1;
			var9.field1270 = var12 + var2;
			var9.field1269 = var3 + var11;
			var9.field1229 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1273 = var6;
			var9.field1217 = var7;
			var9.field1284 = 0;
			var9.resetPath(var9.field1269, var9.field1229);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	void method2186(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field879.size(); ++var2) {
			((Player)this.field879.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "-2066635718"
	)
	void method2187(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field879.size(); ++var7) {
			Player var8 = (Player)this.field879.get(var7);
			var8.npcCycle = var1;
			var8.field1226 = var2;
			var8.field1220.method4574(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-25"
	)
	void method2188(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field879.size(); ++var5) {
			((Actor)this.field879.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1391053273"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = UrlRequester.getPreferencesFile("", class496.field5187.name, true);
			Buffer var1 = Renderable.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset * -2066221813);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfe;",
		garbageValue = "-1430171518"
	)
	static class137[] method2194() {
		return new class137[]{class137.field1619, class137.field1639, class137.field1620, class137.field1636, class137.field1622, class137.field1621, class137.field1618, class137.field1625, class137.field1626, class137.field1627, class137.field1628, class137.field1629, class137.field1624, class137.field1631, class137.field1632, class137.field1638, class137.field1634};
	}
}
