import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	@Export("Players_regions")
	final class72[] Players_regions;
	@ObfuscatedName("ad")
	final boolean[] field1439;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	final MoveSpeed[] field1432;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field1441;
	@ObfuscatedName("ao")
	final String[] field1434;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 52790219
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("aa")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1599507791
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("ae")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1800232637
	)
	int field1431;
	@ObfuscatedName("ai")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 295978515
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("aj")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;

	PlayerUpdateManager() {
		this.Players_regions = new class72[2048];
		this.field1439 = new boolean[2048];
		this.field1432 = new MoveSpeed[2048];
		this.field1441 = new Buffer(new byte[5000]);
		this.field1434 = new String[3];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.field1431 = 0;
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class72(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvu;B)V",
		garbageValue = "122"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3020();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class72 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2114(-1);
		var3.coord.method6907(var4);
		var3.field896 = 0;
		Player var5 = var3.method2118(var2, class200.topLevelWorldView);
		var3.method2158(var5);
		class200.topLevelWorldView.players.add(var5, (long)var2);
		class132.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var2 != var6) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2114(Coord.method6863(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvu;II)V",
		garbageValue = "600662344"
	)
	final void method2988(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2989(var1);
		this.method2999();
		this.method2994();
		this.updatePlayers(var1);
		this.method3023();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvu;I)V",
		garbageValue = "-1532124562"
	)
	void method2989(PacketBuffer var1) {
		this.field1431 = 0;
		int var2 = 0;
		var1.importIndex();

		class72 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field896 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field896 = (byte)(var10000.field896 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2990(var1);
						var10000 = this.Players_regions[var4];
						var10000.field896 = (byte)(var10000.field896 | 2);
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
				if ((this.Players_regions[var4].field896 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field896 = (byte)(var10000.field896 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2990(var1);
							var10000 = this.Players_regions[var4];
							var10000.field896 = (byte)(var10000.field896 | 2);
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
					if ((this.Players_regions[var4].field896 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field896 = (byte)(var10000.field896 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2990(var1);
								var10000 = this.Players_regions[var4];
								var10000.field896 = (byte)(var10000.field896 | 2);
							} else if (this.method2992(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field896 = (byte)(var10000.field896 | 2);
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
						if ((this.Players_regions[var4].field896 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field896 = (byte)(var10000.field896 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2990(var1);
									var10000 = this.Players_regions[var4];
									var10000.field896 = (byte)(var10000.field896 | 2);
								} else if (this.method2992(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field896 = (byte)(var10000.field896 | 2);
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
							var10000.field896 = (byte)(var10000.field896 >> 1);
							if (this.Players_regions[var3].method2119()) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvu;I)I",
		garbageValue = "-1274918820"
	)
	int method2990(PacketBuffer var1) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvu;II)V",
		garbageValue = "-2035790593"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		class72 var5 = this.Players_regions[var2];
		if (var4 == 0) {
			if (var3) {
				this.field1439[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2120();
				if (var1.readBits(1) != 0) {
					this.method2992(var1, var2);
				}

				this.Players_targetIndices[++this.field1431 - 1] = var2;
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

				this.field1439[var2] = true;
				this.field1432[var2] = var5.pathTraversed;
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

				this.field1439[var2] = true;
				this.field1432[var2] = var5.pathTraversed;
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
					this.field1439[var2] = true;
					this.field1432[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6864(var7);
					var9 = Coord.method6865(var7);
					var10 = Coord.method6861(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1439[var2] = true;
					this.field1432[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvu;II)Z",
		garbageValue = "-2112521442"
	)
	boolean method2992(PacketBuffer var1, int var2) {
		class72 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2992(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2119()) {
				throw new RuntimeException();
			} else {
				var3.method2173(var5, var6);
				this.field1439[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field888;
				var7 = Coord.method6864(var6) + var5 & 3;
				var3.method2123(var7);
				var3.field888 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field888;
					var9 = Coord.method6864(var8) + var6 & 3;
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

					var3.method2123(var9);
					var3.field888 = Coord.method6863(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field888;
					var10 = Coord.method6864(var9) + var6 & 3;
					var3.method2123(var10);
					var11 = Coord.method6865(var9) + var7 & 255;
					int var12 = Coord.method6861(var9) + var8 & 255;
					var3.field888 = Coord.method6863(var3.method2122(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2086267692"
	)
	void method2999() {
		for (int var1 = 0; var1 < this.field1431; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class72 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method2116(var6);
					var6.detach();
				}
			}

			var3.method2117();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1705697164"
	)
	void method2994() {
		Client.field780 = -1;

		label68:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class72 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label68;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = (Player)var6.players.get((long)var2);
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.sizeX + var6.baseX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						Client.field780 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2118(var2, var6);
						var3.method2158(var7);
						var6.players.add(var7, (long)var2);
					} else if (!var8 && var7 != null && var7 != class132.localPlayer) {
						var3.method2116(var7);
						var7.detach();
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvu;S)V",
		garbageValue = "-22497"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 64) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 8192) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method2997(var1, var3, var4);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-998650676"
	)
	void method3023() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1439[var2]) {
				class72 var3 = this.Players_regions[var2];
				var3.method2176(this.field1432[var2]);
				this.field1439[var2] = false;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IIB)V",
		garbageValue = "106"
	)
	void method2997(PacketBuffer var1, int var2, int var3) {
		class72 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		if ((var3 & 32768) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1434[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method2194(this.field1434);
		}

		int var7;
		if ((var3 & 2) != 0) {
			var7 = var1.readUnsignedShortAdd();
			var7 += var1.readUnsignedByteAdd() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method2127(var7);
		}

		if ((var3 & 512) != 0) {
			var4.pathTraversed = (MoveSpeed)class454.findEnumerated(class268.method5587(), var1.readByteSub());
			if (var5 == Integer.MAX_VALUE) {
				this.field1432[var2] = var4.pathTraversed;
			}
		}

		byte var8;
		byte var9;
		if ((var3 & 1024) != 0) {
			var6 = Client.cycle + var1.readUnsignedShortAddLE();
			var7 = Client.cycle + var1.readUnsignedShortAdd();
			var8 = var1.readByte();
			var9 = var1.readByteAdd();
			byte var10 = var1.readByteAdd();
			byte var11 = (byte)var1.readUnsignedByte();
			var4.method2136(var6, var7, var8, var9, var10, var11);
		}

		if ((var3 & 32) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByteAdd();
			var1.readUnsignedByteSub();
			var6 = var1.readUnsignedByte();
			this.field1441.offset = 0;
			var1.method10291(this.field1441.array, 0, var6);
			this.field1441.offset = 0;
		}

		int var22;
		int var28;
		if ((var3 & 256) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			var7 = var6 >> 8;
			var22 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var15 = (PlayerType)class454.findEnumerated(SpriteMask.PlayerType_values(), var1.readUnsignedByte());
			boolean var26 = var1.readUnsignedByte() == 1;
			var28 = var1.readUnsignedByteSub();
			this.field1441.offset = 0;
			var1.method10272(this.field1441.array, 0, var28);
			this.field1441.offset = 0;
			String var12 = AbstractFont.escapeBrackets(FloorDecoration.method4731(FloorOverlayDefinition.method4294(this.field1441)));
			byte[] var13 = null;
			if (var22 > 0 && var22 <= 8) {
				var13 = new byte[var22];

				for (int var14 = 0; var14 < var22; ++var14) {
					var13[var14] = var1.readByteAdd();
				}
			}

			var4.method2133(var6, var15, var26, var12, var13);
		}

		if ((var3 & 8) != 0) {
			var6 = var1.readUnsignedShortAdd();
			var4.method2112(var6);
		}

		if ((var3 & 1) != 0) {
			String var16 = var1.readStringCp1252NullTerminated();
			var4.method2128(var16);
		}

		int var17;
		int var27;
		if ((var3 & 4096) != 0) {
			byte var23 = var1.readByteAdd();
			byte var24 = var1.readByte();
			var8 = var1.readByteNeg();
			var9 = var1.readByteSub();
			var27 = var1.readUnsignedShortLE() + Client.cycle;
			var28 = var1.readUnsignedShortAdd() + Client.cycle;
			var17 = var1.readUnsignedShort();
			var4.method2134(var23, var24, var8, var9, var27, var28, var17);
			this.field1439[var2] = false;
		}

		int var25;
		if ((var3 & 16) != 0) {
			var6 = var1.readUnsignedByteAdd();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var25 = -1;
					var27 = -1;
					var28 = -1;
					var22 = var1.readUShortSmart();
					if (var22 == 32767) {
						var22 = var1.readUShortSmart();
						var27 = var1.readUShortSmart();
						var25 = var1.readUShortSmart();
						var28 = var1.readUShortSmart();
					} else if (var22 != 32766) {
						var27 = var1.readUShortSmart();
					} else {
						var22 = -1;
					}

					var17 = var1.readUShortSmart();
					var4.method2129(var22, var27, var25, var28, var17);
				}
			}

			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				for (var22 = 0; var22 < var7; ++var22) {
					var25 = var1.readUShortSmart();
					var27 = var1.readUShortSmart();
					if (var27 != 32767) {
						var28 = var1.readUShortSmart();
						var17 = var1.readUnsignedByteSub();
						int var20 = var27 > 0 ? var1.readUnsignedByteNeg() : var17;
						var4.method2188(var25, var27, var28, var17, var20);
					} else {
						var4.method2131(var25);
					}
				}
			}
		}

		if ((var3 & 128) != 0) {
			var6 = var1.readUnsignedByteNeg();
			byte[] var18 = new byte[var6];
			Buffer var19 = new Buffer(var18);
			var1.method10272(var18, 0, var6);
			var4.method2200(var19);
		}

		if ((var3 & 4) != 0) {
			var6 = var1.readUnsignedShortAdd();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteAdd();
			var4.method2126(var6, var7);
		}

		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByteSub();

			for (var7 = 0; var7 < var6; ++var7) {
				var22 = var1.readUnsignedByte();
				var25 = var1.readUnsignedShortLE();
				var27 = var1.readInt();
				var4.method2163(var22, var25, var27 >> 16, var27 & 65535);
			}
		}

		if ((var3 & 2048) != 0) {
			byte var21 = var1.readByteSub();
			if (var21 == 127) {
				this.field1432[var2] = MoveSpeed.field3124;
			} else {
				this.field1432[var2] = (MoveSpeed)class454.findEnumerated(class268.method5587(), var21);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "603481097"
	)
	void method2987(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method2116(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-615453800"
	)
	void method3020() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2113();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-19"
	)
	public static byte[] method2996(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? Skeleton.method4903(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Lkq;",
		garbageValue = "-2"
	)
	public static IndexCheck method2991() {
		return Client.indexCheck;
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-358723326"
	)
	static final void method3027() {
		Client.field750 = Client.cycleCntr;
		FloatProjection.field2787 = true;
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(II)Lvp;",
		garbageValue = "612424825"
	)
	static DbTable method3028(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AsyncHttpResponse.field76, var0);
		}

		return var1;
	}
}
