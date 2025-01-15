import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class73 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1413723299
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ay")
	final ArrayList field880;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1667597441
	)
	int field868;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 47291785
	)
	int field869;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ad")
	byte field871;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -46035771
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -829208437
	)
	int field873;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1058101899
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field870;
	@ObfuscatedName("au")
	@Export("actions")
	String[] actions;

	class73(int var1) {
		this.field880 = new ArrayList(1);
		this.field868 = -1;
		this.field869 = 0;
		this.coord = new Coord();
		this.orientation = 0;
		this.field873 = -1;
		this.targetIndex = -1;
		this.actions = new String[3];
		this.field868 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1561621827"
	)
	void method2271() {
		this.field870 = null;
		this.field880.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-307331753"
	)
	void method2272(int var1) {
		this.field869 = var1;
		this.orientation = 0;
		this.field873 = -1;
		this.targetIndex = -1;
		this.field871 = 0;
		this.pathTraversed = MoveSpeed.field3045;
		this.field870 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-631911090"
	)
	void method2347(Player var1) {
		this.field880.add(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "1053752896"
	)
	void method2291(Player var1) {
		this.field880.remove(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdz;I)Ldx;",
		garbageValue = "-905733026"
	)
	Player method2275(int var1, WorldView var2) {
		Player var3 = new Player();
		var3.index = var1;
		if (this.field870 != null) {
			var3.read(this.field870);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldView = var2;
		var3.actions = this.actions;
		var3.resetPath(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1150703408"
	)
	boolean method2276() {
		return this.field869 == -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1481701847"
	)
	void method2277() {
		this.field869 = this.coord.method6973();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "76"
	)
	void method2332(int var1, int var2) {
		this.coord.method7009(this.field869, var1, var2);
		this.field869 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-120"
	)
	int method2328() {
		return this.coord.plane;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1837717129"
	)
	void method2326(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "-1396544331"
	)
	void method2297(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			Player var3 = (Player)this.field880.get(var2);
			WorldView var4 = var3.worldView;
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var3 == class53.entity && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3048;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3048) {
				var3.resetPath(var5, var6);
			} else {
				var3.method2694(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "123"
	)
	void method2282(Buffer var1) {
		this.field870 = var1;

		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			((Player)this.field880.get(var2)).read(this.field870);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1568605273"
	)
	void method2283(int var1, int var2) {
		for (int var3 = 0; var3 < this.field880.size(); ++var3) {
			Decimator.performPlayerAnimation((Player)this.field880.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1042863806"
	)
	void method2284(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			((Actor)this.field880.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1038905866"
	)
	void method2285(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field880.size(); ++var4) {
			Player var5 = (Player)this.field880.get(var4);
			var5.field1217 = false;
			var5.field1224 = 0;
			var5.field1215 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field868 == Client.localPlayerIndex) {
				Interpreter.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-35"
	)
	void method2329(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field880.size(); ++var6) {
			((Actor)this.field880.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "2"
	)
	void method2287(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field880.size(); ++var6) {
			((Actor)this.field880.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "97"
	)
	void method2314(int var1) {
		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			((Actor)this.field880.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	void method2288(int var1) {
		this.field873 = var1;

		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			Player var3 = (Player)this.field880.get(var2);
			var3.field1232 = this.field873;
			if (var3.pathLength == 0) {
				var3.orientation = this.field873;
				var3.method2782();
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILod;ZLjava/lang/String;[BB)V",
		garbageValue = "-75"
	)
	void method2289(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field880.size(); ++var8) {
			Player var9 = (Player)this.field880.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && HttpRequest.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field625 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1224 = var1 >> 8;
					var9.field1215 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class580.field5646.length) {
								var12 = null;
								break;
							}

							var14[var15] = class580.field5646[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1222 = var12;
					var9.field1217 = var3;
					var9.field1218 = var9 != ModeWhere.localPlayer && var2.isUser && !Client.field516.isEmpty() && var4.toLowerCase().indexOf(Client.field516) == -1;
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
				Interpreter.addGameMessage(var8, WorldMapElement.method5195(var2.modIcon) + var7, var4);
			} else {
				Interpreter.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZB)V",
		garbageValue = "13"
	)
	void method2290(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		for (int var9 = 0; var9 < this.field880.size(); ++var9) {
			Player var10 = (Player)this.field880.get(var9);
			var10.field1247 = var1;
			var10.field1249 = var2;
			var10.field1248 = var3;
			var10.field1250 = var4;
			var10.spotAnimation = var5;
			var10.field1199 = var6;
			var10.field1253 = var7;
			if (var8) {
				WorldView var11 = var10.worldView;
				int var12 = this.coord.x - var11.baseX;
				int var13 = this.coord.y - var11.baseY;
				var10.field1247 += var12;
				var10.field1249 += var13;
				var10.field1248 += var12;
				var10.field1250 += var13;
				var10.pathLength = 0;
			} else {
				var10.field1247 += var10.pathX[0];
				var10.field1249 += var10.pathY[0];
				var10.field1248 += var10.pathX[0];
				var10.field1250 += var10.pathY[0];
				var10.pathLength = 1;
			}

			var10.field1270 = 0;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "59"
	)
	void method2286(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field880.size(); ++var2) {
			((Player)this.field880.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "781546064"
	)
	void method2292(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field880.size(); ++var7) {
			Player var8 = (Player)this.field880.get(var7);
			var8.field1256 = var1;
			var8.field1252 = var2;
			var8.field1258 = var3;
			var8.field1211 = var4;
			var8.field1261 = var5;
			var8.field1208 = var6;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-67"
	)
	void method2311(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field880.size(); ++var5) {
			((Actor)this.field880.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1177085762"
	)
	static Date method2338() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field922;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				Tiles.method2574("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}
}
