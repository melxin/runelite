import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dh")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("at")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	@Export("Players_regions")
	final class47[] Players_regions;
	@ObfuscatedName("ap")
	final boolean[] field1245;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	final MoveSpeed[] field1246;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	final Buffer field1244;
	@ObfuscatedName("as")
	final String[] field1253;
	@ObfuscatedName("al")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("au")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ai")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1051146723
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1620592231
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1217040787
	)
	int field1248;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1867100379
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class47[2048];
		this.field1245 = new boolean[2048];
		this.field1246 = new MoveSpeed[2048];
		this.field1244 = new Buffer(new byte[5000]);
		this.field1253 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1248 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class47(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwf;I)V",
		garbageValue = "-2021556636"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.clear();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class47 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method1806(-1);
		var3.coord.method7470(var4);
		var3.field676 = 0;
		Player var5 = var3.method1781(var2, class333.topLevelWorldView);
		var3.method1778(var5);
		class333.topLevelWorldView.players.add(var5, (long)var2);
		HealthBarUpdate.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method1806(Coord.method7461(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwf;II)V",
		garbageValue = "-576307041"
	)
	final void method2854(PacketBuffer var1, int var2) {
		int var3 = var1.offset * 1216585693;
		this.Players_pendingUpdateCount = 0;
		this.method2837(var1);
		this.method2841();
		this.method2842();
		this.updatePlayers(var1);
		this.method2844();
		if (var2 != var1.offset * 1216585693 - var3) {
			throw new RuntimeException(var1.offset * 1216585693 - var3 + " " + var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwf;I)V",
		garbageValue = "-1934537235"
	)
	void method2837(PacketBuffer var1) {
		this.field1248 = 0;
		int var2 = 0;
		var1.importIndex();

		class47 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field676 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field676 = (byte)(var10000.field676 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2853(var1);
						var10000 = this.Players_regions[var4];
						var10000.field676 = (byte)(var10000.field676 | 2);
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
				if ((this.Players_regions[var4].field676 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field676 = (byte)(var10000.field676 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2853(var1);
							var10000 = this.Players_regions[var4];
							var10000.field676 = (byte)(var10000.field676 | 2);
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
					if ((this.Players_regions[var4].field676 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field676 = (byte)(var10000.field676 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2853(var1);
								var10000 = this.Players_regions[var4];
								var10000.field676 = (byte)(var10000.field676 | 2);
							} else if (this.method2840(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field676 = (byte)(var10000.field676 | 2);
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
						if ((this.Players_regions[var4].field676 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field676 = (byte)(var10000.field676 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2853(var1);
									var10000 = this.Players_regions[var4];
									var10000.field676 = (byte)(var10000.field676 | 2);
								} else if (this.method2840(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field676 = (byte)(var10000.field676 | 2);
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
							var10000.field676 = (byte)(var10000.field676 >> 1);
							if (this.Players_regions[var3].method1857()) {
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwf;B)I",
		garbageValue = "-113"
	)
	int method2853(PacketBuffer var1) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwf;IB)V",
		garbageValue = "-10"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		class47 var5 = this.Players_regions[var2];
		if (var4 == 0) {
			if (var3) {
				this.field1245[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method1783();
				if (var1.readBits(1) != 0) {
					this.method2840(var1, var2);
				}

				this.Players_targetIndices[++this.field1248 - 1] = var2;
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

				this.field1245[var2] = true;
				this.field1246[var2] = var5.pathTraversed;
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

				this.field1245[var2] = true;
				this.field1246[var2] = var5.pathTraversed;
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
					this.field1245[var2] = true;
					this.field1246[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method7413(var7);
					var9 = Coord.method7424(var7);
					var10 = Coord.method7415(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1245[var2] = true;
					this.field1246[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwf;II)Z",
		garbageValue = "-1394544541"
	)
	boolean method2840(PacketBuffer var1, int var2) {
		class47 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2840(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method1857()) {
				throw new RuntimeException();
			} else {
				var3.method1784(var5, var6);
				this.field1245[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field674;
				var7 = Coord.method7413(var6) + var5 & 3;
				var3.method1819(var7);
				var3.field674 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field674;
					var9 = Coord.method7413(var8) + var6 & 3;
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

					var3.method1819(var9);
					var3.field674 = Coord.method7461(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field674;
					var10 = Coord.method7413(var9) + var6 & 3;
					var3.method1819(var10);
					var11 = Coord.method7424(var9) + var7 & 255;
					int var12 = Coord.method7415(var9) + var8 & 255;
					var3.field674 = Coord.method7461(var3.method1785(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1006641339"
	)
	void method2841() {
		for (int var1 = 0; var1 < this.field1248; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class47 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method1779(var6);
					var6.detach();
				}
			}

			var3.method1805();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	void method2842() {
		Client.currentWorldViewId = -1;

		label69:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class47 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label69;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = (Player)var6.players.get((long)var2);
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.baseX + var6.sizeX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						Client.currentWorldViewId = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method1781(var2, var6);
						var3.method1778(var7);
						var6.players.add(var7, (long)var2);
					} else if (!var8 && var7 != null && var7 != HealthBarUpdate.localPlayer) {
						var3.method1779(var7);
						var7.detach();
					}
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwf;I)V",
		garbageValue = "722011276"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 2) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method2858(var1, var3, var4);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2844() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1245[var2]) {
				class47 var3 = this.Players_regions[var2];
				var3.method1817(this.field1246[var2]);
				this.field1245[var2] = false;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwf;III)V",
		garbageValue = "-290410379"
	)
	void method2858(PacketBuffer var1, int var2, int var3) {
		class47 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		int var7;
		if ((var3 & 1) != 0) {
			var6 = var1.readUnsignedShortAdd();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteSub();
			var4.method1829(var6, var7);
		}

		int var8;
		int var11;
		if ((var3 & 2048) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			var7 = var6 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)class173.findEnumerated(class446.PlayerType_values(), var1.readUnsignedByte());
			boolean var10 = var1.readUnsignedByteNeg() == 1;
			var11 = var1.readUnsignedByteSub();
			this.field1244.offset = 0;
			var1.method11255(this.field1244.array, 0, var11);
			this.field1244.offset = 0;
			String var12 = AbstractFont.escapeBrackets(Calendar.method8130(ScriptEvent.method2145(this.field1244)));
			byte[] var13 = null;
			if (var8 > 0 && var8 <= 8) {
				var13 = new byte[var8];

				for (int var14 = 0; var14 < var8; ++var14) {
					var13[var14] = var1.readByteNeg();
				}
			}

			var4.method1796(var6, var9, var10, var12, var13);
		}

		if ((var3 & 32) != 0) {
			var7 = var1.readUnsignedShortAddLE();
			var7 += var1.readUnsignedByteNeg() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method1790(var7);
		}

		byte var15;
		byte var22;
		if ((var3 & 256) != 0) {
			var6 = Client.cycle + var1.readUnsignedShortAddLE();
			var7 = Client.cycle + var1.readUnsignedShort();
			var22 = var1.readByteAdd();
			var15 = var1.readByteSub();
			byte var23 = var1.readByteNeg();
			byte var27 = (byte)var1.readUnsignedByte();
			var4.method1799(var6, var7, var22, var15, var23, var27);
		}

		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedByte();
			byte[] var16 = new byte[var6];
			Buffer var17 = new Buffer(var16);
			var1.readBytes(var16, 0, var6);
			var4.method1862(var17);
		}

		int var25;
		int var28;
		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByte();

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var1.readUnsignedByteAdd();
				var28 = var1.readUnsignedShortAdd();
				var25 = var1.readUnsignedIntME();
				var4.method1777(var8, var28, var25 >> 16, var25 & 65535);
			}
		}

		if ((var3 & 4096) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1253[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method1798(this.field1253);
		}

		int var19;
		if ((var3 & 4) != 0) {
			var6 = var1.readUnsignedByteNeg();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
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
					var4.method1846(var8, var25, var28, var11, var19);
				}
			}

			var7 = var1.readUnsignedByteSub();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var28 = var1.readUShortSmart();
					var25 = var1.readUShortSmart();
					if (var25 != 32767) {
						var11 = var1.readUShortSmart();
						var19 = var1.readUnsignedByteNeg();
						int var20 = var25 > 0 ? var1.readUnsignedByteNeg() : var19;
						var4.method1789(var28, var25, var11, var19, var20);
					} else {
						var4.method1794(var28);
					}
				}
			}
		}

		if ((var3 & 128) != 0) {
			var1.readUnsignedShortAddLE();
			var1.readUnsignedByteSub();
			var1.readUnsignedByteNeg();
			var6 = var1.readUnsignedByte();
			this.field1244.offset = 0;
			var1.method11255(this.field1244.array, 0, var6);
			this.field1244.offset = 0;
		}

		if ((var3 & 1024) != 0) {
			var4.pathTraversed = (MoveSpeed)class173.findEnumerated(class163.method3999(), var1.readByteSub());
			if (var5 == Integer.MAX_VALUE) {
				this.field1246[var2] = var4.pathTraversed;
			}
		}

		if ((var3 & 8) != 0) {
			String var18 = var1.readStringCp1252NullTerminated();
			var4.method1791(var18);
		}

		if ((var3 & 8192) != 0) {
			byte var21 = var1.readByte();
			if (var21 == 127) {
				this.field1246[var2] = MoveSpeed.field3279;
			} else {
				this.field1246[var2] = (MoveSpeed)class173.findEnumerated(class163.method3999(), var21);
			}
		}

		if ((var3 & 16) != 0) {
			var6 = var1.readUnsignedShortAdd();
			var4.method1795(var6);
		}

		if ((var3 & 512) != 0) {
			byte var24 = var1.readByteAdd();
			byte var26 = var1.readByteSub();
			var22 = var1.readByteSub();
			var15 = var1.readByteAdd();
			var25 = var1.readUnsignedShortAdd() + Client.cycle;
			var11 = var1.readUnsignedShort() + Client.cycle;
			var19 = var1.readUnsignedShortLE();
			var4.method1797(var24, var26, var22, var15, var25, var11, var19);
			this.field1245[var2] = false;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V",
		garbageValue = "-2139402295"
	)
	void method2851(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method1779(var1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1777885476"
	)
	@Export("clear")
	void clear() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method1776();
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1290327159"
	)
	static int method2871(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					if (SongTask.grandExchangeEvents != null) {
						SongTask.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					if (SongTask.grandExchangeEvents != null) {
						SongTask.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1] == 1;
					if (SongTask.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						SongTask.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					if (SongTask.grandExchangeEvents != null) {
						SongTask.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
					if (SongTask.grandExchangeEvents != null) {
						SongTask.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = SongTask.grandExchangeEvents == null ? 0 : SongTask.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						long var5 = class189.method4284() - AbstractByteArrayCopier.field4311 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)SongTask.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
