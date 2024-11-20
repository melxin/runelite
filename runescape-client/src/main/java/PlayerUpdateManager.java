import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lcp;"
	)
	@Export("Players_regions")
	final class73[] Players_regions;
	@ObfuscatedName("ae")
	final boolean[] field1406;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	final MoveSpeed[] field1407;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	final Buffer field1403;
	@ObfuscatedName("aj")
	final String[] field1411;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -840037745
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("au")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 982923093
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("af")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -612400991
	)
	int field1414;
	@ObfuscatedName("al")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1330871365
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("as")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;

	PlayerUpdateManager() {
		this.Players_regions = new class73[2048];
		this.field1406 = new boolean[2048];
		this.field1407 = new MoveSpeed[2048];
		this.field1403 = new Buffer(new byte[5000]);
		this.field1411 = new String[3];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.field1414 = 0;
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class73(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "717071884"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3037();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2160(-1);
		var3.coord.method6811(var4);
		var3.field883 = 0;
		Player var5 = var3.method2163(var2, HttpRequest.topLevelWorldView);
		var3.method2161(var5);
		HttpRequest.topLevelWorldView.players[var2] = var5;
		AsyncHttpResponse.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var2 != var6) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2160(Coord.method6812(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-402841369"
	)
	final void method3027(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method3042(var1);
		this.method3041();
		this.method3033();
		this.updatePlayers(var1);
		this.method3047();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-2117547747"
	)
	void method3042(PacketBuffer var1) {
		this.field1414 = 0;
		int var2 = 0;
		var1.importIndex();

		class73 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field883 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field883 = (byte)(var10000.field883 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method3029(var1);
						var10000 = this.Players_regions[var4];
						var10000.field883 = (byte)(var10000.field883 | 2);
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
				if ((this.Players_regions[var4].field883 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field883 = (byte)(var10000.field883 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method3029(var1);
							var10000 = this.Players_regions[var4];
							var10000.field883 = (byte)(var10000.field883 | 2);
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
					if ((this.Players_regions[var4].field883 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field883 = (byte)(var10000.field883 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method3029(var1);
								var10000 = this.Players_regions[var4];
								var10000.field883 = (byte)(var10000.field883 | 2);
							} else if (this.method3030(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field883 = (byte)(var10000.field883 | 2);
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
						if ((this.Players_regions[var4].field883 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field883 = (byte)(var10000.field883 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method3029(var1);
									var10000 = this.Players_regions[var4];
									var10000.field883 = (byte)(var10000.field883 | 2);
								} else if (this.method3030(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field883 = (byte)(var10000.field883 | 2);
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
							var10000.field883 = (byte)(var10000.field883 >> 1);
							if (this.Players_regions[var3].method2171()) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)I",
		garbageValue = "1"
	)
	int method3029(PacketBuffer var1) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-740461984"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		class73 var5 = this.Players_regions[var2];
		if (var4 == 0) {
			if (var3) {
				this.field1406[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2165();
				if (var1.readBits(1) != 0) {
					this.method3030(var1, var2);
				}

				this.Players_targetIndices[++this.field1414 - 1] = var2;
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

				this.field1406[var2] = true;
				this.field1407[var2] = var5.pathTraversed;
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

				this.field1406[var2] = true;
				this.field1407[var2] = var5.pathTraversed;
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
					this.field1406[var2] = true;
					this.field1407[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6813(var7);
					var9 = Coord.method6814(var7);
					var10 = Coord.method6815(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1406[var2] = true;
					this.field1407[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IB)Z",
		garbageValue = "-76"
	)
	boolean method3030(PacketBuffer var1, int var2) {
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method3030(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2171()) {
				throw new RuntimeException();
			} else {
				var3.method2166(var5, var6);
				this.field1406[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field878;
				var7 = Coord.method6813(var6) + var5 & 3;
				var3.method2168(var7);
				var3.field878 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field878;
					var9 = Coord.method6813(var8) + var6 & 3;
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

					var3.method2168(var9);
					var3.field878 = Coord.method6812(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field878;
					var10 = Coord.method6813(var9) + var6 & 3;
					var3.method2168(var10);
					var11 = Coord.method6814(var9) + var7 & 255;
					int var12 = Coord.method6815(var9) + var8 & 255;
					var3.field878 = Coord.method6812(var3.method2167(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3041() {
		for (int var1 = 0; var1 < this.field1414; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = var5.players[var2];
				if (var6 != null) {
					var3.method2162(var6);
					var5.players[var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "74039015"
	)
	void method3033() {
		class31.field153 = -1;

		label68:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label68;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = var6.players[var2];
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.baseX + var6.sizeX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						class31.field153 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2163(var2, var6);
						var3.method2161(var7);
						var6.players[var2] = var7;
					} else if (!var8 && var7 != null && var7 != AsyncHttpResponse.localPlayer) {
						var3.method2162(var7);
						var6.players[var2] = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "337128724"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 128) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 256) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method3036(var1, var3, var4);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	void method3047() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1406[var2]) {
				class73 var3 = this.Players_regions[var2];
				var3.method2204(this.field1407[var2]);
				this.field1406[var2] = false;
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvg;III)V",
		garbageValue = "-1918386407"
	)
	void method3036(PacketBuffer var1, int var2, int var3) {
		class73 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		int var7;
		int var8;
		int var11;
		if ((var3 & 1024) != 0) {
			var6 = var1.readUnsignedShortLE();
			var7 = var6 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)ScriptEvent.findEnumerated(ObjectComposition.PlayerType_values(), var1.readUnsignedByteSub());
			boolean var10 = var1.readUnsignedByte() == 1;
			var11 = var1.readUnsignedByteAdd();
			this.field1403.offset = 0;
			var1.method10170(this.field1403.array, 0, var11);
			this.field1403.offset = 0;
			String var12 = AbstractFont.escapeBrackets(class383.method7486(class53.method1069(this.field1403)));
			byte[] var13 = null;
			if (var8 > 0 && var8 <= 8) {
				var13 = new byte[var8];

				for (int var14 = 0; var14 < var8; ++var14) {
					var13[var14] = var1.readByte();
				}
			}

			var4.method2178(var6, var9, var10, var12, var13);
		}

		if ((var3 & 8192) != 0) {
			var5 = var1.readByteAdd();
			if (var5 == 127) {
				this.field1407[var2] = MoveSpeed.field3074;
			} else {
				this.field1407[var2] = (MoveSpeed)ScriptEvent.findEnumerated(WorldEntityCoord.method5731(), var5);
			}
		}

		if ((var3 & 16) != 0) {
			var7 = var1.readUnsignedShortAddLE();
			var7 += var1.readUnsignedByte() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method2172(var7);
		}

		if ((var3 & 8) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByte();
			var1.readUnsignedByte();
			var6 = var1.readUnsignedByteSub();
			this.field1403.offset = 0;
			var1.readBytes(this.field1403.array, 0, var6);
			this.field1403.offset = 0;
		}

		if ((var3 & 2048) != 0) {
			var4.pathTraversed = (MoveSpeed)ScriptEvent.findEnumerated(WorldEntityCoord.method5731(), var1.readByteSub());
			if (var5 == Integer.MAX_VALUE) {
				this.field1407[var2] = var4.pathTraversed;
			}
		}

		int var18;
		int var19;
		int var22;
		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedByteNeg();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var18 = -1;
					var22 = -1;
					var11 = -1;
					var8 = var1.readUShortSmart();
					if (var8 == 32767) {
						var8 = var1.readUShortSmart();
						var22 = var1.readUShortSmart();
						var18 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var8 != 32766) {
						var22 = var1.readUShortSmart();
					} else {
						var8 = -1;
					}

					var19 = var1.readUShortSmart();
					var4.method2174(var8, var22, var18, var11, var19);
				}
			}

			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var18 = var1.readUShortSmart();
					var22 = var1.readUShortSmart();
					if (var22 != 32767) {
						var11 = var1.readUShortSmart();
						var19 = var1.readUnsignedByte();
						int var20 = var22 > 0 ? var1.readUnsignedByteSub() : var19;
						var4.method2240(var18, var22, var11, var19, var20);
					} else {
						var4.method2193(var18);
					}
				}
			}
		}

		if ((var3 & 2) != 0) {
			String var15 = var1.readStringCp1252NullTerminated();
			var4.method2173(var15);
		}

		if ((var3 & 32) != 0) {
			var6 = var1.readUnsignedShortAdd();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteAdd();
			var4.method2187(var6, var7);
		}

		if ((var3 & 512) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1411[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method2179(this.field1411);
		}

		if ((var3 & 1) != 0) {
			var6 = var1.readUnsignedByteNeg();
			byte[] var16 = new byte[var6];
			Buffer var17 = new Buffer(var16);
			var1.readBytes(var16, 0, var6);
			var4.method2188(var17);
		}

		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByteNeg();

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var1.readUnsignedByte();
				var18 = var1.readUnsignedShortAddLE();
				var22 = var1.readUnsignedIntIME();
				var4.method2181(var8, var18, var22 >> 16, var22 & 65535);
			}
		}

		byte var23;
		byte var27;
		if ((var3 & 32768) != 0) {
			var6 = Client.cycle + var1.readUnsignedShort();
			var7 = Client.cycle + var1.readUnsignedShort();
			var23 = var1.readByteNeg();
			var27 = var1.readByteAdd();
			byte var25 = var1.readByte();
			byte var26 = (byte)var1.readUnsignedByteAdd();
			var4.method2180(var6, var7, var23, var27, var25, var26);
		}

		if ((var3 & 4096) != 0) {
			byte var21 = var1.readByte();
			byte var24 = var1.readByteSub();
			var23 = var1.readByte();
			var27 = var1.readByte();
			var22 = var1.readUnsignedShortAddLE() + Client.cycle;
			var11 = var1.readUnsignedShortAddLE() + Client.cycle;
			var19 = var1.readUnsignedShortLE();
			var4.method2164(var21, var24, var23, var27, var22, var11, var19, this.field1406[var2]);
		}

		if ((var3 & 4) != 0) {
			var6 = var1.readUnsignedShort();
			var4.method2203(var6);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3037() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2159();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	static void method3067() {
		try {
			File var0 = new File(class4.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < class354.field3790.length; ++var1) {
					for (var2 = 0; var2 < DevicePcmPlayerProvider.field107.length; ++var2) {
						File var3 = new File(DevicePcmPlayerProvider.field107[var2] + class354.field3790[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}
}
