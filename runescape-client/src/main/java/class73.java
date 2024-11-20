import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class73 {
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		longValue = -1177323313473747195L
	)
	static long field885;
	@ObfuscatedName("ab")
	final ArrayList field882;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 311236793
	)
	int field877;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1026933669
	)
	int field878;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ao")
	byte field883;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -987355449
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 907708503
	)
	int field888;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1680065513
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	Buffer field876;
	@ObfuscatedName("af")
	@Export("actions")
	String[] actions;

	class73(int var1) {
		this.field882 = new ArrayList(1);
		this.field877 = -1;
		this.field878 = 0;
		this.coord = new Coord();
		this.orientation = 0;
		this.field888 = -1;
		this.targetIndex = -1;
		this.actions = new String[3];
		this.field877 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	void method2159() {
		this.field876 = null;
		this.field882.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-127"
	)
	void method2160(int var1) {
		this.field878 = var1;
		this.orientation = 0;
		this.field888 = -1;
		this.targetIndex = -1;
		this.field883 = 0;
		this.pathTraversed = MoveSpeed.field3067;
		this.field876 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "14"
	)
	void method2161(Player var1) {
		this.field882.add(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldy;S)V",
		garbageValue = "-16253"
	)
	void method2162(Player var1) {
		this.field882.remove(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdm;B)Ldy;",
		garbageValue = "102"
	)
	Player method2163(int var1, WorldView var2) {
		Player var3 = new Player();
		var3.index = var1;
		if (this.field876 != null) {
			var3.read(this.field876);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1889274203"
	)
	boolean method2171() {
		return this.field878 == -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2165() {
		this.field878 = this.coord.method6816();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1502814201"
	)
	void method2166(int var1, int var2) {
		this.coord.method6817(this.field878, var1, var2);
		this.field878 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	int method2167() {
		return this.coord.plane;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2116431864"
	)
	void method2168(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lkq;B)V",
		garbageValue = "20"
	)
	void method2204(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			Player var3 = (Player)this.field882.get(var2);
			WorldView var4 = var3.worldView;
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var3 == HttpResponse.entity && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3074;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3074) {
				var3.resetPath(var5, var6);
			} else {
				var3.method2533(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "943400634"
	)
	void method2188(Buffer var1) {
		this.field876 = var1;

		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			((Player)this.field882.get(var2)).read(this.field876);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-26"
	)
	void method2187(int var1, int var2) {
		for (int var3 = 0; var3 < this.field882.size(); ++var3) {
			class150.performPlayerAnimation((Player)this.field882.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1813413604"
	)
	void method2172(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			((Actor)this.field882.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "407899886"
	)
	void method2173(String var1) {
		Username var2 = null;

		for (int var3 = 0; var3 < this.field882.size(); ++var3) {
			Player var4 = (Player)this.field882.get(var3);
			var4.field1217 = false;
			var4.field1223 = 0;
			var4.field1211 = 0;
			var4.overheadTextCyclesRemaining = 150;
			var4.overheadText = var1;
			var2 = var4.username;
		}

		if (var2 != null) {
			if (var1.charAt(0) == '~') {
				var1 = var1.substring(1);
				class289.addGameMessage(2, var2.getName(), var1);
			} else if (this.field877 == Client.localPlayerIndex) {
				class289.addGameMessage(2, var2.getName(), var1);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-318620343"
	)
	void method2174(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field882.size(); ++var6) {
			((Actor)this.field882.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "125"
	)
	void method2240(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field882.size(); ++var6) {
			((Actor)this.field882.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-724631633"
	)
	void method2193(int var1) {
		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			((Actor)this.field882.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	void method2203(int var1) {
		this.field888 = var1;

		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			Player var3 = (Player)this.field882.get(var2);
			var3.field1242 = this.field888;
			if (var3.pathLength == 0) {
				var3.orientation = this.field888;
				var3.method2650();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILof;ZLjava/lang/String;[BI)V",
		garbageValue = "-2133597304"
	)
	void method2178(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field882.size(); ++var8) {
			Player var9 = (Player)this.field882.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && InterfaceParent.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field635 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1223 = var1 >> 8;
					var9.field1211 = var1 & 255;
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

							if (var13[var15] < 0 || var13[var15] >= class580.field5638.length) {
								var12 = null;
								break;
							}

							var14[var15] = class580.field5638[var13[var15]];
							++var15;
						}
					} else {
						var12 = null;
					}

					var9.field1222 = var12;
					var9.field1217 = var3;
					var9.field1218 = var9 != AsyncHttpResponse.localPlayer && var2.isUser && !Client.field787.isEmpty() && var4.toLowerCase().indexOf(Client.field787) == -1;
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
				class289.addGameMessage(var8, class153.method3479(var2.modIcon) + var7, var4);
			} else {
				class289.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZB)V",
		garbageValue = "39"
	)
	void method2164(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		for (int var9 = 0; var9 < this.field882.size(); ++var9) {
			Player var10 = (Player)this.field882.get(var9);
			var10.field1247 = var1;
			var10.field1249 = var2;
			var10.field1248 = var3;
			var10.field1250 = var4;
			var10.spotAnimation = var5;
			var10.field1252 = var6;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "1114519279"
	)
	void method2179(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field882.size(); ++var2) {
			((Player)this.field882.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBB)V",
		garbageValue = "1"
	)
	void method2180(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field882.size(); ++var7) {
			Player var8 = (Player)this.field882.get(var7);
			var8.field1256 = var1;
			var8.field1264 = var2;
			var8.field1224 = var3;
			var8.field1235 = var4;
			var8.field1240 = var5;
			var8.field1233 = var6;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2023409873"
	)
	void method2181(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field882.size(); ++var5) {
			((Actor)this.field882.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpw;I)I",
		garbageValue = "-2068219067"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = (char)var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = PacketWriter.standardizeChar(var9, var2);
			var10 = PacketWriter.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var9 != var10) {
					return World.lowercaseChar(var9, var2) - World.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6);
			if (var18 != var20 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var18 != var20) {
					return World.lowercaseChar(var18, var2) - World.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var13 != var20) {
					return World.lowercaseChar(var20, var2) - World.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-165632274"
	)
	public static int method2234(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1685623813"
	)
	static void method2238() {
		Client.otp.trim();
		if (Client.otp.length() != 6) {
			class106.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			Bounds.otpMedium = Integer.parseInt(Client.otp);
			Client.otp = "";
			MusicSong.method6796(true);
			class106.setLoginResponseString("", "Connecting to server...", "");
			class31.updateGameState(20);
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "123"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != SecureUrlRequester.clientPreferences.getMusicVolume()) {
			if (SecureUrlRequester.clientPreferences.getMusicVolume() == 0 && class443.method8679()) {
				WorldMapSection0.method6185(FontName.archive6, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				WorldMapSprite.method6235(0, 0);
				Client.playingJingle = false;
			} else if (!class333.musicSongs.isEmpty()) {
				Iterator var1 = class333.musicSongs.iterator();

				while (var1.hasNext()) {
					MusicSong var2 = (MusicSong)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MusicSong var3 = (MusicSong)class333.musicSongs.get(0);
				if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3742) {
					var3.midiPcmStream.setPcmStreamVolume(var0);
					var3.field3739 = (float)var0;
				}
			}

			SecureUrlRequester.clientPreferences.updateMusicVolume(var0);
		}

	}
}
