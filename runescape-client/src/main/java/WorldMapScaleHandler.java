import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1360223459
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ay")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-338107038"
	)
	void method6392(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
			var8 = this.method6387(var8, var7);
			var7 = this.method6388(var7);
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1739387380"
	)
	int method6387(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2139094912"
	)
	int method6388(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-411746752"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) {
			this.tileTemplates = new byte[8][4][];
			this.init0();
			this.init1();
			this.init2();
			this.init3();
			this.init4();
			this.init5();
			this.init6();
			this.init7();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	@Export("init0")
	void init0() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][3] = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("init1")
	void init1() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var2 >= 0 && var2 < var1.length) {
					if (var4 >= var3 << 1) {
						var1[var2] = -1;
					}

					++var2;
				} else {
					++var2;
				}
			}
		}

		this.tileTemplates[1][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][3] = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "427810999"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][3] = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2140867332"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][3] = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-259506982"
	)
	@Export("init4")
	void init4() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][3] = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1505139357"
	)
	@Export("init5")
	void init5() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var3 <= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var3 >= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][3] = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "953801542"
	)
	@Export("init6")
	void init6() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][3] = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2366"
	)
	@Export("init7")
	void init7() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][3] = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lrf;Lrf;I)V",
		garbageValue = "2137366778"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			class321.method6491(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				AbstractWorldMapIcon.clientPreferences.updateTitleMusicDisabled(!AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled());
				if (!AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MidiRequest(EnumComposition.field2011, "scape main", "", 255, false));
					UserComparator3.method3219(var3, 0, 0, 0, 100, false);
				} else {
					class177.method3764(0, 0);
				}

				class47.method860();
			}

			if (Client.gameState != 5) {
				if (Login.field975 == -1L) {
					Login.field975 = InterfaceParent.method2434() + 1000L;
				}

				long var21 = InterfaceParent.method2434();
				if (class278.method5815() && Login.field976 == -1L) {
					Login.field976 = var21;
					if (Login.field976 > Login.field975) {
						Login.field975 = Login.field976;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var5;
					if (Language.Language_EN == class144.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) {
								if (class521.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (World.World_request != null) {
							class171.method3693();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var37 = MouseHandler.MouseHandler_lastPressedX;
					int var38 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var37 = MouseHandler.MouseHandler_x;
						var38 = MouseHandler.MouseHandler_y;
					}

					if (!class466.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var23 = PlayerUpdateManager.method2991();
					short var40;
					int var41;
					if (Login.loginIndex == 0) {
						boolean var46 = false;

						while (var23.method5597()) {
							if (var23.field3064 == 84) {
								var46 = true;
							}
						}

						var41 = class73.loginBoxCenter - 80;
						var40 = 291;
						if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
							class91.openURL(World.method1887("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var41 = class73.loginBoxCenter + 80;
						if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20 || var46) {
							if ((Client.worldProperties & class563.field5533.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								ObjectComposition.method4206(1);
								NPC.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class563.field5549.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class563.field5530.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								ObjectComposition.method4206(1);
								NPC.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class563.field5530.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								ObjectComposition.method4206(1);
								NPC.focusPasswordWhenUsernameFilled();
							} else {
								class280.Login_promptCredentials(false);
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var23.method5597()) {
									var9 = class73.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
										class280.Login_promptCredentials(false);
									}

									var9 = class73.loginBoxCenter + 80;
									if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
										ObjectComposition.method4206(0);
									}
									break;
								}

								if (var23.field3064 == 84) {
									class280.Login_promptCredentials(false);
								} else if (var23.field3064 == 13) {
									ObjectComposition.method4206(0);
								}
							}
						} else {
							boolean var18;
							short var39;
							boolean var42;
							if (Login.loginIndex == 2) {
								var39 = 201;
								var9 = var39 + 52;
								if (var5 == 1 && var38 >= var9 - 12 && var38 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var38 >= var9 - 12 && var38 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var39 = 361;
								if (PlayerCompositionColorTextureOverride.field1897 != null) {
									var41 = PlayerCompositionColorTextureOverride.field1897.highX / 2;
									if (var5 == 1 && var37 >= PlayerCompositionColorTextureOverride.field1897.lowX - var41 && var37 <= var41 + PlayerCompositionColorTextureOverride.field1897.lowX && var38 >= var39 - 15 && var38 < var39) {
										switch(Login.field954) {
										case 1:
											class91.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class91.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var41 = class73.loginBoxCenter - 80;
								var40 = 321;
								if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
									ReflectionCheck.method670();
									return;
								}

								var41 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
									ObjectComposition.method4206(0);
									Login.Login_username = "";
									Login.Login_password = "";
									Language.otpMedium = 0;
									Language.otp = "";
									Login.rememberUsername = true;
								}

								var41 = class73.loginBoxCenter + -117;
								var40 = 277;
								Login.field968 = var37 >= var41 && var37 < var41 + class241.field2658 && var38 >= var40 && var38 < var40 + class133.field1592;
								if (var5 == 1 && Login.field968) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && AbstractWorldMapIcon.clientPreferences.getRememberedUsername() != null) {
										AbstractWorldMapIcon.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var41 = class73.loginBoxCenter + 24;
								var40 = 277;
								Login.field969 = var37 >= var41 && var37 < var41 + class241.field2658 && var38 >= var40 && var38 < var40 + class133.field1592;
								if (var5 == 1 && Login.field969) {
									AbstractWorldMapIcon.clientPreferences.updateHideUsername(!AbstractWorldMapIcon.clientPreferences.isUsernameHidden());
									if (!AbstractWorldMapIcon.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										AbstractWorldMapIcon.clientPreferences.updateRememberedUsername((String)null);
										NPC.focusPasswordWhenUsernameFilled();
									}
								}

								label1316:
								while (true) {
									int var44;
									Transferable var48;
									do {
										while (true) {
											char var43;
											label1280:
											do {
												while (true) {
													while (var23.method5597()) {
														if (var23.field3064 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1280;
															}

															class362.method7292(var23.field3068);
															if (var23.field3064 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var23.field3064 == 84 || var23.field3064 == 80) {
																Login.currentLoginField = 1;
															}

															var43 = var23.field3068;
															var42 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var43) != -1;
															if (var42 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var23.field3068;
															}
														} else {
															ObjectComposition.method4206(0);
															Login.Login_username = "";
															Login.Login_password = "";
															Language.otpMedium = 0;
															Language.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var23.field3064 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var23.field3064 == 84 || var23.field3064 == 80) {
												Login.currentLoginField = 0;
												if (var23.field3064 == 84) {
													ReflectionCheck.method670();
													return;
												}
											}

											if ((var23.isValidIndexInRange(82) || var23.isValidIndexInRange(87)) && var23.field3064 == 67) {
												Clipboard var47 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var48 = var47.getContents(class569.client);
												var44 = 20 - Login.Login_password.length();
												break;
											}

											if (class321.method6492(var23.field3068)) {
												var43 = var23.field3068;
												var42 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var43) != -1;
												if (var42 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var23.field3068;
												}
											}
										}
									} while(var44 <= 0);

									try {
										String var15 = (String)var48.getTransferData(DataFlavor.stringFlavor);
										int var16 = Math.min(var44, var15.length());
										int var45 = 0;

										while (true) {
											if (var45 >= var16) {
												Login.Login_password = Login.Login_password + var15.substring(0, var16);
												continue label1316;
											}

											if (!class321.method6492(var15.charAt(var45))) {
												break;
											}

											char var19 = var15.charAt(var45);
											var18 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var19) != -1;
											if (!var18) {
												break;
											}

											++var45;
										}

										ObjectComposition.method4206(3);
										return;
									} catch (UnsupportedFlavorException var35) {
									} catch (IOException var36) {
									}
								}
							} else {
								Bounds var26;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var26 = var1.method8690(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var26.method8260(var37, var38)) {
										class91.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
										MusicPatchNode2.updateLoginStatusUsernameRemembered(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
										class91.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
											WorldMapRegion.method6100();
											return;
										}

										if (var5 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var38 >= 263 && var38 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var38 >= 351 && var38 <= 363) {
											class91.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
											ObjectComposition.method4206(0);
											Login.Login_username = "";
											Login.Login_password = "";
											Language.otpMedium = 0;
											Language.otp = "";
										}

										while (var23.method5597()) {
											boolean var11 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var23.field3068 == "1234567890".charAt(var12)) {
													var11 = true;
													break;
												}
											}

											if (var23.field3064 == 13) {
												ObjectComposition.method4206(0);
												Login.Login_username = "";
												Login.Login_password = "";
												Language.otpMedium = 0;
												Language.otp = "";
											} else {
												if (var23.field3064 == 85 && Language.otp.length() > 0) {
													Language.otp = Language.otp.substring(0, Language.otp.length() - 1);
												}

												if (var23.field3064 == 84) {
													WorldMapRegion.method6100();
													return;
												}

												if (var11 && Language.otp.length() < 6) {
													Language.otp = Language.otp + var23.field3068;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
												SecureRandomCallable.method2398();
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
												class280.Login_promptCredentials(true);
											}

											var40 = 361;
											if (ClientPreferences.field1325 != null) {
												var12 = ClientPreferences.field1325.highX / 2;
												if (var5 == 1 && var37 >= ClientPreferences.field1325.lowX - var12 && var37 <= var12 + ClientPreferences.field1325.lowX && var38 >= var40 - 15 && var38 < var40) {
													class91.openURL(World.method1887("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var23.method5597()) {
												var42 = false;

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
													if (var23.field3068 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
														var42 = true;
														break;
													}
												}

												if (var23.field3064 == 13) {
													class280.Login_promptCredentials(true);
												} else {
													if (var23.field3064 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var23.field3064 == 84) {
														SecureRandomCallable.method2398();
														return;
													}

													if (var42 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var23.field3068;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (Client.field524 && !Client.onMobile) {
													var9 = class73.loginBoxCenter - 150;
													var41 = var9 + 40 + 240 + 25;
													var40 = 231;
													var12 = var40 + 40;
													if (var5 == 1 && var37 >= var9 && var37 <= var41 && var38 >= var40 && var38 <= var12) {
														Login.field940 = class521.method9615(var9, var37);
													}

													var13 = Login.loginBoxX + 180 - 80;
													short var14 = 321;
													boolean var17;
													java.util.Calendar var20;
													Date var27;
													boolean var29;
													Date var30;
													if (var5 == 1 && var37 >= var13 - 75 && var37 <= var13 + 75 && var38 >= var14 - 20 && var38 <= var14 + 20) {
														label1183: {
															try {
																var27 = BoundaryObject.method5543();
															} catch (ParseException var34) {
																ObjectComposition.method4206(7);
																class401.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var29 = false;
																break label1183;
															}

															if (var27 == null) {
																var29 = false;
															} else {
																var17 = Client.method1831(var27);
																var20 = java.util.Calendar.getInstance();
																var20.set(2, 0);
																var20.set(5, 1);
																var20.set(1, 1900);
																var30 = var20.getTime();
																var18 = var27.after(var30);
																if (!var18) {
																	ObjectComposition.method4206(7);
																	class401.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var29 = false;
																} else {
																	if (!var17) {
																		class456.field5001 = 8388607;
																	} else {
																		class456.field5001 = (int)(var27.getTime() / 86400000L - 11745L);
																	}

																	var29 = true;
																}
															}
														}

														if (var29) {
															class511.updateGameState(50);
															return;
														}
													}

													var13 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var37 >= var13 - 75 && var37 <= var13 + 75 && var38 >= var14 - 20 && var38 <= var14 + 20) {
														Login.field963 = new String[8];
														class280.Login_promptCredentials(true);
													}

													while (var23.method5597()) {
														if (var23.field3064 == 101) {
															Login.field963[Login.field940] = null;
														}

														if (var23.field3064 == 85) {
															if (Login.field963[Login.field940] == null && Login.field940 > 0) {
																--Login.field940;
															}

															Login.field963[Login.field940] = null;
														}

														if (var23.field3068 >= '0' && var23.field3068 <= '9') {
															Login.field963[Login.field940] = "" + var23.field3068;
															if (Login.field940 < 7) {
																++Login.field940;
															}
														}

														if (var23.field3064 == 84) {
															label1119: {
																try {
																	var27 = BoundaryObject.method5543();
																} catch (ParseException var33) {
																	ObjectComposition.method4206(7);
																	class401.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var29 = false;
																	break label1119;
																}

																if (var27 == null) {
																	var29 = false;
																} else {
																	var17 = Client.method1831(var27);
																	var20 = java.util.Calendar.getInstance();
																	var20.set(2, 0);
																	var20.set(5, 1);
																	var20.set(1, 1900);
																	var30 = var20.getTime();
																	var18 = var27.after(var30);
																	if (!var18) {
																		ObjectComposition.method4206(7);
																		class401.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var29 = false;
																	} else {
																		if (!var17) {
																			class456.field5001 = 8388607;
																		} else {
																			class456.field5001 = (int)(var27.getTime() / 86400000L - 11745L);
																		}

																		var29 = true;
																	}
																}
															}

															if (var29) {
																class511.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80;
													var10 = 321;
													if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
														class91.openURL(World.method1887("secure", true) + "m=dob/set_dob.ws", true, false);
														class401.setLoginResponseString("", "Page has opened in the browser.", "");
														ObjectComposition.method4206(6);
														return;
													}

													var9 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
														class280.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class91.openURL("https://www.jagex.com/terms/privacy", true, false);
													class401.setLoginResponseString("", "Page has opened in the browser.", "");
													ObjectComposition.method4206(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class280.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var9 = Login.loginBoxX + 180;
												var10 = 311;
												if (var23.field3064 == 84 || var23.field3064 == 13 || var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													MusicPatchNode2.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 10) {
												var9 = Login.loginBoxX + 180;
												var10 = 209;
												if (var23.field3064 == 84 || var5 == 1 && var37 >= var9 - 109 && var37 <= var9 + 109 && var38 >= var10 && var38 <= var10 + 68) {
													class401.setLoginResponseString("", "Connecting to server...", "");
													Client.field554 = class573.field5626;
													Projection.method5234(false);
													class511.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var9 = class73.loginBoxCenter;
												var10 = 233;
												var26 = var2.method8690(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var24 = var2.method8690(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var25 = var2.method8690(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												var41 = var10 + 17;
												Bounds var31 = var2.method8690(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var41);
												if (var5 == 1) {
													if (var26.method8260(var37, var38)) {
														class91.openURL("https://www.jagex.com/terms", true, false);
													} else if (var24.method8260(var37, var38)) {
														class91.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var25.method8260(var37, var38) || var31.method8260(var37, var38)) {
														class91.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var9 = class73.loginBoxCenter - 80;
												var10 = 311;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													AbstractWorldMapIcon.clientPreferences.updateEULA(Client.field515);
													MusicPatchNode2.updateLoginStatusUsernameRemembered(true);
												}

												var9 = class73.loginBoxCenter + 80;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var9 = class73.loginBoxCenter;
												var10 = 321;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													MusicPatchNode2.updateLoginStatusUsernameRemembered(true);
												}
											} else if (Login.loginIndex == 14) {
												String var32 = "";
												switch(Login.Login_banType) {
												case 0:
													var32 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													class280.Login_promptCredentials(false);
												}

												var41 = Login.loginBoxX + 180;
												var40 = 276;
												if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
													class91.openURL(var32, true, false);
													class401.setLoginResponseString("", "Page has opened in the browser.", "");
													ObjectComposition.method4206(6);
													return;
												}

												var41 = Login.loginBoxX + 180;
												var40 = 326;
												if (var5 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
													class280.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var9 = Login.loginBoxX + 180;
												var10 = 301;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													MusicPatchNode2.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 32) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class91.openURL(World.method1887("secure", true) + "m=dob/set_dob.ws", true, false);
													class401.setLoginResponseString("", "Page has opened in the browser.", "");
													ObjectComposition.method4206(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class280.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class91.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class280.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 34) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class171.method3693();
													return;
												}

												if (World.World_request != null && class521.loadWorlds()) {
													Login.worldSelectOpen = true;
													Login.worldSelectPage = 0;
													Login.worldSelectPagesCount = 0;
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var37 >= var9 - 75 && var37 <= var9 + 75 && var38 >= var10 - 20 && var38 <= var10 + 20) {
													class280.Login_promptCredentials(false);
												}
											}
										} else {
											while (true) {
												do {
													if (!var23.method5597()) {
														var39 = 321;
														if (var5 == 1 && var38 >= var39 - 20 && var38 <= var39 + 20) {
															class280.Login_promptCredentials(true);
														}

														return;
													}
												} while(var23.field3064 != 84 && var23.field3064 != 13);

												class280.Login_promptCredentials(true);
											}
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}
}
