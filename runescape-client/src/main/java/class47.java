import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class47 {
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -1546236753
	)
	static int field687;
	@ObfuscatedName("af")
	final ArrayList field678;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1784853113
	)
	int field674;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ac")
	byte field676;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	Buffer field680;
	@ObfuscatedName("ao")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -48116131
	)
	int field682;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2075945551
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2019959715
	)
	int field681;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1774552581
	)
	@Export("targetIndex")
	int targetIndex;

	class47(int var1) {
		this.field678 = new ArrayList(1);
		this.field674 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field682 = -1;
		this.orientation = 0;
		this.field681 = -1;
		this.targetIndex = -1;
		this.field682 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	void method1776() {
		this.field680 = null;
		this.field678.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-668868862"
	)
	void method1806(int var1) {
		this.field674 = var1;
		this.orientation = 0;
		this.field681 = -1;
		this.targetIndex = -1;
		this.field676 = 0;
		this.pathTraversed = MoveSpeed.field3281;
		this.field680 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "74"
	)
	void method1778(Player var1) {
		this.field678.add(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcv;B)V",
		garbageValue = "54"
	)
	void method1779(Player var1) {
		this.field678.remove(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	void method1805() {
		this.field678.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdr;I)Lcv;",
		garbageValue = "-154351301"
	)
	Player method1781(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field680 != null) {
			var3.read(this.field680);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2422(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1999186646"
	)
	boolean method1857() {
		return this.field674 == -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-993536765"
	)
	void method1783() {
		this.field674 = this.coord.method7426();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1420442183"
	)
	void method1784(int var1, int var2) {
		this.coord.method7422(this.field674, var1, var2);
		this.field674 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "326594181"
	)
	int method1785() {
		return this.coord.plane;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-293144984"
	)
	void method1819(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "-1349422484"
	)
	void method1817(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			Player var3 = (Player)this.field678.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field682 == Client.field348 && class4.field7 == class384.USERNAME_PASSWORD && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3279;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3279) {
				var3.method2422(var5, var6);
			} else {
				var3.method2211(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1366769806"
	)
	void method1862(Buffer var1) {
		this.field680 = var1;

		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			((Player)this.field678.get(var2)).read(this.field680);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "405256797"
	)
	void method1829(int var1, int var2) {
		for (int var3 = 0; var3 < this.field678.size(); ++var3) {
			class163.performPlayerAnimation((Player)this.field678.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1431458295"
	)
	void method1790(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			((Actor)this.field678.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "597278258"
	)
	void method1791(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field678.size(); ++var4) {
			Player var5 = (Player)this.field678.get(var4);
			var5.field1101 = false;
			var5.field1079 = 0;
			var5.field1080 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field682 == Client.localPlayerIndex) {
				Varcs.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	void method1846(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field678.size(); ++var6) {
			((Actor)this.field678.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "2002160283"
	)
	void method1789(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field678.size(); ++var6) {
			((Actor)this.field678.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	void method1794(int var1) {
		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			((Actor)this.field678.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2022467880"
	)
	void method1795(int var1) {
		this.field681 = var1;

		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			Player var3 = (Player)this.field678.get(var2);
			var3.field1049 = this.field681;
			if (var3.pathLength == 0) {
				var3.orientation = this.field681;
				var3.method2432();
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILpg;ZLjava/lang/String;[BS)V",
		garbageValue = "-6543"
	)
	void method1796(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field678.size(); ++var8) {
			Player var9 = (Player)this.field678.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field341 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1079 = var1 >> 8;
					var9.field1080 = var1 & 255;
					var9.overheadTextCyclesRemaining = 150;
					var9.field1081 = IsaacCipher.method11838(var5);
					var9.field1101 = var3;
					var9.field1077 = var9 != HealthBarUpdate.localPlayer && var2.isUser && !Client.field441.isEmpty() && var4.toLowerCase().indexOf(Client.field441) == -1;
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
				Varcs.addGameMessage(var8, ChatChannel.method2014(var2.modIcon) + var7, var4);
			} else {
				Varcs.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1126882622"
	)
	void method1797(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field678.size(); ++var8) {
			Player var9 = (Player)this.field678.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1089 = var11 + var1;
			var9.field1091 = var12 + var2;
			var9.field1072 = var3 + var11;
			var9.field1084 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1094 = var6;
			var9.field1095 = var7;
			var9.field1040 = 0;
			var9.resetPath(var9.field1072, var9.field1084);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method1798(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field678.size(); ++var2) {
			((Player)this.field678.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBB)V",
		garbageValue = "-3"
	)
	void method1799(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field678.size(); ++var7) {
			Player var8 = (Player)this.field678.get(var7);
			var8.npcCycle = var1;
			var8.field1052 = var2;
			var8.field1076.method5649(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2111748992"
	)
	void method1777(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field678.size(); ++var5) {
			((Actor)this.field678.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lbz;",
		garbageValue = "-2133911364"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}
}
