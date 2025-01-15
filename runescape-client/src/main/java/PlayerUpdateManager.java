import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static IndexedSprite field1414;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	@Export("Players_regions")
	final class73[] Players_regions;
	@ObfuscatedName("ao")
	final boolean[] field1399;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	final MoveSpeed[] field1403;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field1407;
	@ObfuscatedName("ae")
	final String[] field1405;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -424710833
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("at")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 354342637
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("au")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -141109869
	)
	int field1410;
	@ObfuscatedName("aq")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 623422135
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("aa")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;

	PlayerUpdateManager() {
		this.Players_regions = new class73[2048];
		this.field1399 = new boolean[2048];
		this.field1403 = new MoveSpeed[2048];
		this.field1407 = new Buffer(new byte[5000]);
		this.field1405 = new String[3];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.field1410 = 0;
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class73(var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvv;B)V",
		garbageValue = "4"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3139();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2272(-1);
		var3.coord.method6967(var4);
		var3.field871 = 0;
		Player var5 = var3.method2275(var2, GameEngine.topLevelWorldView);
		var3.method2347(var5);
		GameEngine.topLevelWorldView.players[var2] = var5;
		ModeWhere.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2272(Coord.method6969(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IB)V",
		garbageValue = "95"
	)
	final void method3144(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method3130(var1);
		this.method3127();
		this.method3135();
		this.updatePlayers(var1);
		this.method3150();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "-1630891958"
	)
	void method3130(PacketBuffer var1) {
		this.field1410 = 0;
		int var2 = 0;
		var1.importIndex();

		class73 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field871 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field871 = (byte)(var10000.field871 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method3134(var1);
						var10000 = this.Players_regions[var4];
						var10000.field871 = (byte)(var10000.field871 | 2);
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
				if ((this.Players_regions[var4].field871 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field871 = (byte)(var10000.field871 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method3134(var1);
							var10000 = this.Players_regions[var4];
							var10000.field871 = (byte)(var10000.field871 | 2);
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
					if ((this.Players_regions[var4].field871 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field871 = (byte)(var10000.field871 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method3134(var1);
								var10000 = this.Players_regions[var4];
								var10000.field871 = (byte)(var10000.field871 | 2);
							} else if (this.method3133(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field871 = (byte)(var10000.field871 | 2);
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
						if ((this.Players_regions[var4].field871 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field871 = (byte)(var10000.field871 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method3134(var1);
									var10000 = this.Players_regions[var4];
									var10000.field871 = (byte)(var10000.field871 | 2);
								} else if (this.method3133(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field871 = (byte)(var10000.field871 | 2);
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
							var10000.field871 = (byte)(var10000.field871 >> 1);
							if (this.Players_regions[var3].method2276()) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvv;B)I",
		garbageValue = "-1"
	)
	int method3134(PacketBuffer var1) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvv;II)V",
		garbageValue = "856013933"
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
				this.field1399[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2277();
				if (var1.readBits(1) != 0) {
					this.method3133(var1, var2);
				}

				this.Players_targetIndices[++this.field1410 - 1] = var2;
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

				this.field1399[var2] = true;
				this.field1403[var2] = var5.pathTraversed;
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

				this.field1399[var2] = true;
				this.field1403[var2] = var5.pathTraversed;
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
					this.field1399[var2] = true;
					this.field1403[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6965(var7);
					var9 = Coord.method6971(var7);
					var10 = Coord.method6972(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1399[var2] = true;
					this.field1403[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvv;II)Z",
		garbageValue = "2008955812"
	)
	boolean method3133(PacketBuffer var1, int var2) {
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method3133(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2276()) {
				throw new RuntimeException();
			} else {
				var3.method2332(var5, var6);
				this.field1399[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field869;
				var7 = Coord.method6965(var6) + var5 & 3;
				var3.method2326(var7);
				var3.field869 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field869;
					var9 = Coord.method6965(var8) + var6 & 3;
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

					var3.method2326(var9);
					var3.field869 = Coord.method6969(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field869;
					var10 = Coord.method6965(var9) + var6 & 3;
					var3.method2326(var10);
					var11 = Coord.method6971(var9) + var7 & 255;
					int var12 = Coord.method6972(var9) + var8 & 255;
					var3.field869 = Coord.method6969(var3.method2328(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082969786"
	)
	void method3127() {
		for (int var1 = 0; var1 < this.field1410; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = var5.players[var2];
				if (var6 != null) {
					var3.method2291(var6);
					var5.players[var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1157490276"
	)
	void method3135() {
		LoginPacket.field1676 = -1;

		label69:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label69;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = var6.players[var2];
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.sizeX + var6.baseX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						LoginPacket.field1676 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2275(var2, var6);
						var3.method2347(var7);
						var6.players[var2] = var7;
					} else if (!var8 && var7 != null && var7 != ModeWhere.localPlayer) {
						var3.method2291(var7);
						var6.players[var2] = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "-1845304357"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 4) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 256) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method3172(var1, var3, var4);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17329"
	)
	void method3150() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1399[var2]) {
				class73 var3 = this.Players_regions[var2];
				var3.method2297(this.field1403[var2]);
				this.field1399[var2] = false;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvv;III)V",
		garbageValue = "1182589201"
	)
	void method3172(PacketBuffer var1, int var2, int var3) {
		class73 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		if ((var3 & 1024) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1405[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method2286(this.field1405);
		}

		int var7;
		if ((var3 & 8) != 0) {
			var7 = var1.readUnsignedShortAddLE();
			var7 += var1.readUnsignedByteAdd() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method2284(var7);
		}

		if ((var3 & 512) != 0) {
			MoveSpeed[] var16 = new MoveSpeed[]{MoveSpeed.field3049, MoveSpeed.field3047, MoveSpeed.field3048, MoveSpeed.field3044, MoveSpeed.field3045, MoveSpeed.field3051, MoveSpeed.field3050, MoveSpeed.field3043, MoveSpeed.field3046};
			var4.pathTraversed = (MoveSpeed)StructComposition.findEnumerated(var16, var1.readByteSub());
			if (var5 == Integer.MAX_VALUE) {
				this.field1403[var2] = var4.pathTraversed;
			}
		}

		if ((var3 & 16) != 0) {
			var6 = var1.readUnsignedByte();
			byte[] var29 = new byte[var6];
			Buffer var8 = new Buffer(var29);
			var1.method10337(var29, 0, var6);
			var4.method2282(var8);
		}

		int var10;
		int var11;
		int var17;
		int var18;
		int var19;
		if ((var3 & 2) != 0) {
			var6 = var1.readUnsignedByte();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var18 = -1;
					var10 = -1;
					var11 = -1;
					var17 = var1.readUShortSmart();
					if (var17 == 32767) {
						var17 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var18 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var17 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var17 = -1;
					}

					var19 = var1.readUShortSmart();
					var4.method2329(var17, var10, var18, var11, var19);
				}
			}

			var7 = var1.readUnsignedByteNeg();
			if (var7 > 0) {
				for (var17 = 0; var17 < var7; ++var17) {
					var18 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var19 = var1.readUnsignedByteAdd();
						int var20 = var10 > 0 ? var1.readUnsignedByteNeg() : var19;
						var4.method2287(var18, var10, var11, var19, var20);
					} else {
						var4.method2314(var18);
					}
				}
			}
		}

		if ((var3 & 32) != 0) {
			var1.readUnsignedShortAddLE();
			var1.readUnsignedByteAdd();
			var1.readUnsignedByteSub();
			var6 = var1.readUnsignedByteAdd();
			this.field1407.offset = 0;
			var1.method10337(this.field1407.array, 0, var6);
			this.field1407.offset = 0;
		}

		if ((var3 & 32768) != 0) {
			var6 = var1.readUnsignedShortAdd();
			var7 = var6 >> 8;
			var17 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), var1.readUnsignedByteAdd());
			boolean var25 = var1.readUnsignedByteAdd() == 1;
			var11 = var1.readUnsignedByteSub();
			this.field1407.offset = 0;
			var1.readBytes(this.field1407.array, 0, var11);
			this.field1407.offset = 0;
			String var12 = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(this.field1407)));
			byte[] var13 = null;
			if (var17 > 0 && var17 <= 8) {
				var13 = new byte[var17];

				for (int var14 = 0; var14 < var17; ++var14) {
					var13[var14] = var1.readByteSub();
				}
			}

			var4.method2289(var6, var9, var25, var12, var13);
		}

		if ((var3 & 2048) != 0) {
			byte var21 = var1.readByteNeg();
			if (var21 == 127) {
				this.field1403[var2] = MoveSpeed.field3048;
			} else {
				MoveSpeed[] var15 = this.field1403;
				MoveSpeed[] var22 = new MoveSpeed[]{MoveSpeed.field3049, MoveSpeed.field3047, MoveSpeed.field3048, MoveSpeed.field3044, MoveSpeed.field3045, MoveSpeed.field3051, MoveSpeed.field3050, MoveSpeed.field3043, MoveSpeed.field3046};
				var15[var2] = (MoveSpeed)StructComposition.findEnumerated(var22, var21);
			}
		}

		byte var30;
		byte var31;
		if ((var3 & 4096) != 0) {
			var6 = Client.cycle + var1.readUnsignedShortAddLE();
			var7 = Client.cycle + var1.readUnsignedShortAdd();
			var30 = var1.readByteSub();
			var31 = var1.readByte();
			byte var26 = var1.readByteAdd();
			byte var27 = (byte)var1.readUnsignedByteAdd();
			var4.method2292(var6, var7, var30, var31, var26, var27);
		}

		if ((var3 & 128) != 0) {
			String var28 = var1.readStringCp1252NullTerminated();
			var4.method2285(var28);
		}

		if ((var3 & 1) != 0) {
			var6 = var1.readUnsignedShortLE();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteAdd();
			var4.method2283(var6, var7);
		}

		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByteSub();

			for (var7 = 0; var7 < var6; ++var7) {
				var17 = var1.readUnsignedByteSub();
				var18 = var1.readUnsignedShortAddLE();
				var10 = var1.readInt();
				var4.method2311(var17, var18, var10 >> 16, var10 & 65535);
			}
		}

		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedShort();
			var4.method2288(var6);
		}

		if ((var3 & 16384) != 0) {
			byte var23 = var1.readByte();
			byte var24 = var1.readByteNeg();
			var30 = var1.readByte();
			var31 = var1.readByteNeg();
			var10 = var1.readUnsignedShortAdd() + Client.cycle;
			var11 = var1.readUnsignedShortLE() + Client.cycle;
			var19 = var1.readUnsignedShortAdd();
			var4.method2290(var23, var24, var30, var31, var10, var11, var19, this.field1399[var2]);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2040127946"
	)
	void method3139() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2271();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "585853899"
	)
	static final int method3152() {
		return ViewportMouse.ViewportMouse_x;
	}
}
