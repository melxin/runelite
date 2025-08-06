import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ac")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("Players_regions")
	final class46[] Players_regions;
	@ObfuscatedName("au")
	final boolean[] field1223;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lke;"
	)
	final MoveSpeed[] field1224;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field1225;
	@ObfuscatedName("ap")
	final String[] field1226;
	@ObfuscatedName("am")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("aj")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ag")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 79798673
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -323864791
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 31989983
	)
	int field1232;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -745835957
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class46[2048];
		this.field1223 = new boolean[2048];
		this.field1224 = new MoveSpeed[2048];
		this.field1225 = new Buffer(new byte[5000]);
		this.field1226 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1232 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class46(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwk;I)V",
		garbageValue = "-821509782"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.clear();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method1765(-1);
		var3.coord.method7397(var4);
		var3.field662 = 0;
		Player var5 = var3.method1769(var2, class7.topLevelWorldView);
		var3.method1766(var5);
		class7.topLevelWorldView.players.add(var5, (long)var2);
		class27.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method1765(Coord.method7408(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwk;II)V",
		garbageValue = "-74800516"
	)
	final void method2796(PacketBuffer var1, int var2) {
		int var3 = var1.field5818;
		this.Players_pendingUpdateCount = 0;
		this.method2828(var1);
		this.method2801();
		this.method2802();
		this.updatePlayers(var1);
		this.method2805();
		if (var2 != var1.field5818 - var3) {
			throw new RuntimeException(var1.field5818 - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwk;I)V",
		garbageValue = "1744050553"
	)
	void method2828(PacketBuffer var1) {
		this.field1232 = 0;
		int var2 = 0;
		var1.importIndex();

		class46 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field662 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field662 = (byte)(var10000.field662 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2835(var1);
						var10000 = this.Players_regions[var4];
						var10000.field662 = (byte)(var10000.field662 | 2);
					} else {
						this.readPlayerUpdate(var1, var4);
					}
				}
			}
		}

		var1.exportIndex();
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.importIndex();

			for (var3 = 0; var3 < this.playerCount; ++var3) {
				var4 = this.playerIndices[var3];
				if ((this.Players_regions[var4].field662 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field662 = (byte)(var10000.field662 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2835(var1);
							var10000 = this.Players_regions[var4];
							var10000.field662 = (byte)(var10000.field662 | 2);
						} else {
							this.readPlayerUpdate(var1, var4);
						}
					}
				}
			}

			var1.exportIndex();
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.importIndex();

				for (var3 = 0; var3 < this.Players_emptyIdxCount; ++var3) {
					var4 = this.Players_emptyIndices[var3];
					if ((this.Players_regions[var4].field662 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field662 = (byte)(var10000.field662 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2835(var1);
								var10000 = this.Players_regions[var4];
								var10000.field662 = (byte)(var10000.field662 | 2);
							} else if (this.method2800(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field662 = (byte)(var10000.field662 | 2);
							}
						}
					}
				}

				var1.exportIndex();
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.importIndex();

					for (var3 = 0; var3 < this.Players_emptyIdxCount; ++var3) {
						var4 = this.Players_emptyIndices[var3];
						if ((this.Players_regions[var4].field662 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field662 = (byte)(var10000.field662 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2835(var1);
									var10000 = this.Players_regions[var4];
									var10000.field662 = (byte)(var10000.field662 | 2);
								} else if (this.method2800(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field662 = (byte)(var10000.field662 | 2);
								}
							}
						}
					}

					var1.exportIndex();
					if (var2 != 0) {
						throw new RuntimeException();
					} else {
						this.playerCount = 0;
						this.Players_emptyIdxCount = 0;

						for (var3 = 1; var3 < 2048; ++var3) {
							var10000 = this.Players_regions[var3];
							var10000.field662 = (byte)(var10000.field662 >> 1);
							if (this.Players_regions[var3].method1819()) {
								this.playerIndices[++this.playerCount - 1] = var3;
							} else {
								this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwk;I)I",
		garbageValue = "428171668"
	)
	int method2835(PacketBuffer var1) {
		int var2 = var1.readBits(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var1.readBits(5);
		} else if (var2 == 2) {
			var3 = var1.readBits(8);
		} else {
			var3 = var1.readBits(11);
		}

		return var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwk;II)V",
		garbageValue = "1950542495"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		class46 var5 = this.Players_regions[var2];
		if (var4 == 0) {
			if (var3) {
				this.field1223[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method1771();
				if (var1.readBits(1) != 0) {
					this.method2800(var1, var2);
				}

				this.Players_targetIndices[++this.field1232 - 1] = var2;
			}
		} else {
			int var6;
			Coord var12;
			if (var4 == 1) {
				var6 = var1.readBits(3);
				var12 = var5.coord;
				if (var6 == 0) {
					--var12.x;
					--var12.y;
				} else if (var6 == 1) {
					--var12.y;
				} else if (var6 == 2) {
					++var12.x;
					--var12.y;
				} else if (var6 == 3) {
					--var12.x;
				} else if (var6 == 4) {
					++var12.x;
				} else if (var6 == 5) {
					--var12.x;
					++var12.y;
				} else if (var6 == 6) {
					++var12.y;
				} else if (var6 == 7) {
					++var12.x;
					++var12.y;
				}

				this.field1223[var2] = true;
				this.field1224[var2] = var5.pathTraversed;
			} else if (var4 == 2) {
				var6 = var1.readBits(4);
				var12 = var5.coord;
				if (var6 == 0) {
					var12.x -= 2;
					var12.y -= 2;
				} else if (var6 == 1) {
					--var12.x;
					var12.y -= 2;
				} else if (var6 == 2) {
					var12.y -= 2;
				} else if (var6 == 3) {
					++var12.x;
					var12.y -= 2;
				} else if (var6 == 4) {
					var12.x += 2;
					var12.y -= 2;
				} else if (var6 == 5) {
					var12.x -= 2;
					--var12.y;
				} else if (var6 == 6) {
					var12.x += 2;
					--var12.y;
				} else if (var6 == 7) {
					var12.x -= 2;
				} else if (var6 == 8) {
					var12.x += 2;
				} else if (var6 == 9) {
					var12.x -= 2;
					++var12.y;
				} else if (var6 == 10) {
					var12.x += 2;
					++var12.y;
				} else if (var6 == 11) {
					var12.x -= 2;
					var12.y += 2;
				} else if (var6 == 12) {
					--var12.x;
					var12.y += 2;
				} else if (var6 == 13) {
					var12.y += 2;
				} else if (var6 == 14) {
					++var12.x;
					var12.y += 2;
				} else if (var6 == 15) {
					var12.x += 2;
					var12.y += 2;
				}

				this.field1223[var2] = true;
				this.field1224[var2] = var5.pathTraversed;
			} else {
				var6 = var1.readBits(1);
				int var7;
				int var8;
				int var9;
				int var10;
				Coord var11;
				if (var6 == 0) {
					var7 = var1.readBits(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x += var9;
					var11.y += var10;
					this.field1223[var2] = true;
					this.field1224[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method7426(var7);
					var9 = Coord.method7392(var7);
					var10 = Coord.method7451(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1223[var2] = true;
					this.field1224[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwk;IB)Z",
		garbageValue = "0"
	)
	boolean method2800(PacketBuffer var1, int var2) {
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2800(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method1819()) {
				throw new RuntimeException();
			} else {
				var3.method1772(var5, var6);
				this.field1223[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field654;
				var7 = Coord.method7426(var6) + var5 & 3;
				var3.method1825(var7);
				var3.field654 = (var6 & 268435455) + (var7 << 28);
				return false;
			} else {
				int var8;
				int var9;
				int var10;
				int var11;
				if (var4 == 2) {
					var5 = var1.readBits(5);
					var6 = var5 >> 3;
					var7 = var5 & 7;
					var8 = var3.field654;
					var9 = Coord.method7426(var8) + var6 & 3;
					var10 = var8 >> 14 & 255;
					var11 = var8 & 255;
					if (var7 == 0) {
						--var10;
						--var11;
					}

					if (var7 == 1) {
						--var11;
					}

					if (var7 == 2) {
						++var10;
						--var11;
					}

					if (var7 == 3) {
						--var10;
					}

					if (var7 == 4) {
						++var10;
					}

					if (var7 == 5) {
						--var10;
						++var11;
					}

					if (var7 == 6) {
						++var11;
					}

					if (var7 == 7) {
						++var10;
						++var11;
					}

					var3.method1825(var9);
					var3.field654 = Coord.method7408(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field654;
					var10 = Coord.method7426(var9) + var6 & 3;
					var3.method1825(var10);
					var11 = Coord.method7392(var9) + var7 & 255;
					int var12 = Coord.method7451(var9) + var8 & 255;
					var3.field654 = Coord.method7408(var3.method1773(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-506808457"
	)
	void method2801() {
		for (int var1 = 0; var1 < this.field1232; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class46 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method1767(var6);
					var6.detach();
				}
			}

			var3.method1768();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1267512885"
	)
	void method2802() {
		Client.field326 = -1;

		label68:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class46 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label68;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = (Player)var6.players.get((long)var2);
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.sizeX + var6.baseX && var4.y < var6.sizeY + var6.baseY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						Client.field326 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method1769(var2, var6);
						var3.method1766(var7);
						var6.players.add(var7, (long)var2);
					} else if (!var8 && var7 != null && var7 != class27.localPlayer) {
						var3.method1767(var7);
						var7.detach();
					}
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwk;I)V",
		garbageValue = "259503228"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 32) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 1024) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method2830(var1, var3, var4);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1935921853"
	)
	void method2805() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1223[var2]) {
				class46 var3 = this.Players_regions[var2];
				var3.method1826(this.field1224[var2]);
				this.field1223[var2] = false;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwk;III)V",
		garbageValue = "-1412376217"
	)
	void method2830(PacketBuffer var1, int var2, int var3) {
		class46 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		if ((var3 & 1) != 0) {
			String var6 = var1.readStringCp1252NullTerminated();
			var4.method1779(var6);
		}

		int var7;
		int var8;
		int var11;
		int var15;
		if ((var3 & 8192) != 0) {
			var15 = var1.readUnsignedShortAddLE();
			var7 = var15 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)HealthBarConfig.findEnumerated(WorldMapAreaData.PlayerType_values(), var1.readUnsignedByteAdd());
			boolean var10 = var1.readUnsignedByteSub() == 1;
			var11 = var1.readUnsignedByteSub();
			this.field1225.field5818 = 0;
			var1.method11286(this.field1225.offset, 0, var11);
			this.field1225.field5818 = 0;
			String var12 = AbstractFont.escapeBrackets(class379.method8155(WorldMapIcon_0.method6722(this.field1225)));
			byte[] var13 = null;
			if (var8 > 0 && var8 <= 8) {
				var13 = new byte[var8];

				for (int var14 = 0; var14 < var8; ++var14) {
					var13[var14] = var1.readByteAdd();
				}
			}

			var4.method1784(var15, var9, var10, var12, var13);
		}

		if ((var3 & 4) != 0) {
			var15 = var1.readUnsignedByteNeg();
			byte[] var16 = new byte[var15];
			Buffer var17 = new Buffer(var16);
			var1.method11309(var16, 0, var15);
			var4.method1776(var17);
		}

		if ((var3 & 2048) != 0) {
			for (var15 = 0; var15 < 3; ++var15) {
				this.field1226[var15] = var1.readStringCp1252NullTerminated();
			}

			var4.method1830(this.field1226);
		}

		if ((var3 & 64) != 0) {
			var15 = var1.readUnsignedShortAdd();
			if (var15 == 65535) {
				var15 = -1;
			}

			var7 = var1.readUnsignedByteSub();
			var4.method1838(var15, var7);
		}

		byte var18;
		byte var22;
		if ((var3 & 32768) != 0) {
			var15 = Client.cycle + var1.readUnsignedShort();
			var7 = Client.cycle + var1.readUnsignedShort();
			var22 = var1.readByteNeg();
			var18 = var1.readByteSub();
			byte var24 = var1.readByteSub();
			byte var26 = (byte)var1.readUnsignedByteSub();
			var4.method1787(var15, var7, var22, var18, var24, var26);
		}

		int var25;
		int var28;
		if ((var3 & 65536) != 0) {
			var15 = var1.readUnsignedByteNeg();

			for (var7 = 0; var7 < var15; ++var7) {
				var8 = var1.readUnsignedByteSub();
				var28 = var1.readUnsignedShortAdd();
				var25 = var1.readUnsignedIntIME();
				var4.method1788(var8, var28, var25 >> 16, var25 & 65535);
			}
		}

		if ((var3 & 16384) != 0) {
			var4.pathTraversed = (MoveSpeed)HealthBarConfig.findEnumerated(Actor.method2472(), var1.readByteAdd());
			if (var5 == Integer.MAX_VALUE) {
				this.field1224[var2] = var4.pathTraversed;
			}
		}

		int var19;
		if ((var3 & 4096) != 0) {
			byte var27 = var1.readByteAdd();
			byte var23 = var1.readByte();
			var22 = var1.readByteSub();
			var18 = var1.readByteNeg();
			var25 = var1.readUnsignedShortAdd() + Client.cycle;
			var11 = var1.readUnsignedShort() + Client.cycle;
			var19 = var1.readUnsignedShort();
			var4.method1774(var27, var23, var22, var18, var25, var11, var19);
			this.field1223[var2] = false;
		}

		if ((var3 & 2) != 0) {
			var15 = var1.readUnsignedByteSub();
			if (var15 > 0) {
				for (var7 = 0; var7 < var15; ++var7) {
					var28 = -1;
					var25 = -1;
					var11 = -1;
					var8 = var1.readUShortSmart();
					if (var8 == 32767) {
						var8 = var1.readUShortSmart();
						var25 = var1.readUShortSmart();
						var28 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var8 != 32766) {
						var25 = var1.readUShortSmart();
					} else {
						var8 = -1;
					}

					var19 = var1.readUShortSmart();
					var4.method1808(var8, var25, var28, var11, var19);
				}
			}

			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var28 = var1.readUShortSmart();
					var25 = var1.readUShortSmart();
					if (var25 != 32767) {
						var11 = var1.readUShortSmart();
						var19 = var1.readUnsignedByte();
						int var20 = var25 > 0 ? var1.readUnsignedByteNeg() : var19;
						var4.method1781(var28, var25, var11, var19, var20);
					} else {
						var4.method1763(var28);
					}
				}
			}
		}

		if ((var3 & 16) != 0) {
			var15 = var1.readUnsignedShortAdd();
			var4.method1783(var15);
		}

		if ((var3 & 128) != 0) {
			var7 = var1.readUnsignedShortAddLE();
			var7 += var1.readUnsignedByteNeg() << 16;
			var15 = 16777215;
			if (var7 == var15) {
				var7 = -1;
			}

			var4.method1778(var7);
		}

		if ((var3 & 8) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByteNeg();
			var1.readUnsignedByteSub();
			var15 = var1.readUnsignedByteSub();
			this.field1225.field5818 = 0;
			var1.method11286(this.field1225.offset, 0, var15);
			this.field1225.field5818 = 0;
		}

		if ((var3 & 512) != 0) {
			byte var21 = var1.readByteSub();
			if (var21 == 127) {
				this.field1224[var2] = MoveSpeed.field3195;
			} else {
				this.field1224[var2] = (MoveSpeed)HealthBarConfig.findEnumerated(Actor.method2472(), var21);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "-674279425"
	)
	void method2807(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method1767(var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	@Export("clear")
	void clear() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method1764();
		}

	}
}
