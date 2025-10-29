import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class46 {
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 390737907
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("av")
	final ArrayList field633;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 596721571
	)
	int field623;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("an")
	byte field632;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	Buffer field636;
	@ObfuscatedName("ak")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -586128735
	)
	int field629;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 97116033
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2091065039
	)
	int field631;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -844607615
	)
	@Export("targetIndex")
	int targetIndex;

	class46(int var1) {
		this.field633 = new ArrayList(1);
		this.field623 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field629 = -1;
		this.orientation = 0;
		this.field631 = -1;
		this.targetIndex = -1;
		this.field629 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	void method1836() {
		this.field636 = null;
		this.field633.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1817290030"
	)
	void method1837(int var1) {
		this.field623 = var1;
		this.orientation = 0;
		this.field631 = -1;
		this.targetIndex = -1;
		this.field632 = 0;
		this.pathTraversed = MoveSpeed.field3304;
		this.field636 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "2085366366"
	)
	void method1838(Player var1) {
		this.field633.add(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "1260057330"
	)
	void method1847(Player var1) {
		this.field633.remove(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	void method1840() {
		this.field633.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;I)Lci;",
		garbageValue = "1653562717"
	)
	Player method1902(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field636 != null) {
			var3.read(this.field636);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2482(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "334343727"
	)
	boolean method1842() {
		return this.field623 == -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	void method1843() {
		this.field623 = this.coord.method7698();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-250751821"
	)
	void method1844(int var1, int var2) {
		this.coord.method7682(this.field623, var1, var2);
		this.field623 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "831964661"
	)
	int method1845() {
		return this.coord.plane;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2134764171"
	)
	void method1846(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llz;B)V",
		garbageValue = "-32"
	)
	void method1870(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			Player var3 = (Player)this.field633.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field629 == Client.cameraTargetIndex && GrandExchangeOfferUnitPriceComparator.cameraViewMode == CameraViewMode.field4455 && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3300;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3300) {
				var3.method2482(var5, var6);
			} else {
				var3.method2231(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "574338365"
	)
	void method1848(Buffer var1) {
		this.field636 = var1;

		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			((Player)this.field633.get(var2)).read(this.field636);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	void method1849(int var1, int var2) {
		for (int var3 = 0; var3 < this.field633.size(); ++var3) {
			CameraViewMode.performPlayerAnimation((Player)this.field633.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1115713671"
	)
	void method1868(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			((Actor)this.field633.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	void method1851(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field633.size(); ++var4) {
			Player var5 = (Player)this.field633.get(var4);
			var5.field1046 = false;
			var5.field1049 = 0;
			var5.field1050 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field629 == Client.localPlayerIndex) {
				class356.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "36"
	)
	void method1905(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field633.size(); ++var6) {
			((Actor)this.field633.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1738060518"
	)
	void method1853(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field633.size(); ++var6) {
			((Actor)this.field633.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-39093119"
	)
	void method1854(int var1) {
		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			((Actor)this.field633.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-816455450"
	)
	void method1855(int var1) {
		this.field631 = var1;

		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			Player var3 = (Player)this.field633.get(var2);
			var3.field1009 = this.field631;
			if (var3.pathLength == 0) {
				var3.orientation = this.field631;
				var3.method2498();
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILpq;ZLjava/lang/String;[BB)V",
		garbageValue = "3"
	)
	void method1856(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field633.size(); ++var8) {
			Player var9 = (Player)this.field633.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && class320.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field305 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1049 = var1 >> 8;
					var9.field1050 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class623.field6187.length) {
								var12 = null;
								break;
							}

							var14[var15] = class623.field6187[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1051 = var12;
					var9.field1046 = var3;
					var9.field1056 = var9 != class330.localPlayer && var2.isUser && !Client.field448.isEmpty() && var4.toLowerCase().indexOf(Client.field448) == -1;
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
				class356.addGameMessage(var8, SoundSystem.method3226(var2.modIcon) + var7, var4);
			} else {
				class356.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1543563048"
	)
	void method1863(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field633.size(); ++var8) {
			Player var9 = (Player)this.field633.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1059 = var11 + var1;
			var9.field1061 = var12 + var2;
			var9.field1060 = var3 + var11;
			var9.field1062 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1057 = var6;
			var9.field1021 = var7;
			var9.field1075 = 0;
			var9.resetPath(var9.field1060, var9.field1062);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-937676350"
	)
	void method1858(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field633.size(); ++var2) {
			((Player)this.field633.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "-815735561"
	)
	void method1859(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field633.size(); ++var7) {
			Player var8 = (Player)this.field633.get(var7);
			var8.npcCycle = var1;
			var8.field1022 = var2;
			var8.field1065.method6123(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "5"
	)
	void method1860(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field633.size(); ++var5) {
			((Actor)this.field633.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;B)V",
		garbageValue = "2"
	)
	public static void method1918(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field1976 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}
}
