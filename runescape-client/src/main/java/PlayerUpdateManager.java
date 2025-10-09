import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ag")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("Players_regions")
	final class46[] Players_regions;
	@ObfuscatedName("ah")
	final boolean[] field1243;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lkj;"
	)
	final MoveSpeed[] field1244;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field1245;
	@ObfuscatedName("aq")
	final String[] field1246;
	@ObfuscatedName("ac")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("aa")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ap")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1188562551
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1616255043
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1093635509
	)
	int field1248;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1327686669
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class46[2048];
		this.field1243 = new boolean[2048];
		this.field1244 = new MoveSpeed[2048];
		this.field1245 = new Buffer(new byte[5000]);
		this.field1246 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1248 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class46(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwn;I)V",
		garbageValue = "1433383719"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.clear();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method1885(-1);
		var3.coord.method7426(var4);
		var3.field647 = 0;
		Player var5 = var3.method1894(var2, class547.topLevelWorldView);
		var3.method1861(var5);
		class547.topLevelWorldView.players.add(var5, (long)var2);
		class159.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method1885(Coord.method7419(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwn;II)V",
		garbageValue = "-469250073"
	)
	final void method2933(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2973(var1);
		this.method2939();
		this.method2941();
		this.updatePlayers(var1);
		this.method2942();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwn;I)V",
		garbageValue = "-320504109"
	)
	void method2973(PacketBuffer var1) {
		this.field1248 = 0;
		int var2 = 0;
		var1.importIndex();

		class46 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field647 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field647 = (byte)(var10000.field647 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2935(var1);
						var10000 = this.Players_regions[var4];
						var10000.field647 = (byte)(var10000.field647 | 2);
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
				if ((this.Players_regions[var4].field647 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field647 = (byte)(var10000.field647 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2935(var1);
							var10000 = this.Players_regions[var4];
							var10000.field647 = (byte)(var10000.field647 | 2);
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
					if ((this.Players_regions[var4].field647 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field647 = (byte)(var10000.field647 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2935(var1);
								var10000 = this.Players_regions[var4];
								var10000.field647 = (byte)(var10000.field647 | 2);
							} else if (this.method2937(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field647 = (byte)(var10000.field647 | 2);
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
						if ((this.Players_regions[var4].field647 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field647 = (byte)(var10000.field647 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2935(var1);
									var10000 = this.Players_regions[var4];
									var10000.field647 = (byte)(var10000.field647 | 2);
								} else if (this.method2937(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field647 = (byte)(var10000.field647 | 2);
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
							var10000.field647 = (byte)(var10000.field647 >> 1);
							if (this.Players_regions[var3].method1820()) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwn;I)I",
		garbageValue = "-864866605"
	)
	int method2935(PacketBuffer var1) {
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
		descriptor = "(Lwn;II)V",
		garbageValue = "-1969847097"
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
				this.field1243[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method1892();
				if (var1.readBits(1) != 0) {
					this.method2937(var1, var2);
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

				this.field1243[var2] = true;
				this.field1244[var2] = var5.pathTraversed;
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

				this.field1243[var2] = true;
				this.field1244[var2] = var5.pathTraversed;
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
					this.field1243[var2] = true;
					this.field1244[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method7460(var7);
					var9 = Coord.method7421(var7);
					var10 = Coord.method7469(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1243[var2] = true;
					this.field1244[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwn;IB)Z",
		garbageValue = "1"
	)
	boolean method2937(PacketBuffer var1, int var2) {
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2937(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method1820()) {
				throw new RuntimeException();
			} else {
				var3.method1822(var5, var6);
				this.field1243[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field645;
				var7 = Coord.method7460(var6) + var5 & 3;
				var3.method1824(var7);
				var3.field645 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field645;
					var9 = Coord.method7460(var8) + var6 & 3;
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

					var3.method1824(var9);
					var3.field645 = Coord.method7419(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field645;
					var10 = Coord.method7460(var9) + var6 & 3;
					var3.method1824(var10);
					var11 = Coord.method7421(var9) + var7 & 255;
					int var12 = Coord.method7469(var9) + var8 & 255;
					var3.field645 = Coord.method7419(var3.method1823(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-154508597"
	)
	void method2939() {
		for (int var1 = 0; var1 < this.field1248; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class46 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method1817(var6);
					var6.detach();
				}
			}

			var3.method1818();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	void method2941() {
		Client.currentWorldViewId = -1;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.method2940(var2);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "1416956488"
	)
	void method2940(WorldView var1) {
		for (int var2 = 0; var2 < this.playerCount; ++var2) {
			int var3 = this.playerIndices[var2];
			class46 var4 = this.Players_regions[var3];
			Coord var5 = var4.coord;
			Player var6 = (Player)var1.players.get((long)var3);
			boolean var7 = var5.x > var1.baseX && var5.y > var1.baseY && var5.x < var1.baseX + var1.sizeX && var5.y < var1.baseY + var1.sizeY;
			if (var3 == Client.localPlayerIndex && var7 && var1.id != -1) {
				Client.currentWorldViewId = var1.id;
			}

			if (var7 && var6 == null) {
				var6 = var4.method1894(var3, var1);
				var4.method1861(var6);
				var1.players.add(var6, (long)var3);
			} else if (!var7 && var6 != null && var6 != class159.localPlayer) {
				var4.method1817(var6);
				var6.detach();
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwn;I)V",
		garbageValue = "-1526579411"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 4) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 512) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method2943(var1, var3, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	void method2942() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1243[var2]) {
				class46 var3 = this.Players_regions[var2];
				var3.method1830(this.field1244[var2]);
				this.field1243[var2] = false;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lwn;III)V",
		garbageValue = "-1128526971"
	)
	void method2943(PacketBuffer var1, int var2, int var3) {
		class46 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		if ((var3 & 16384) != 0) {
			MoveSpeed[] var7 = new MoveSpeed[]{MoveSpeed.field3280, MoveSpeed.field3278, MoveSpeed.field3276, MoveSpeed.field3274};
			var4.pathTraversed = (MoveSpeed)ScriptFrame.findEnumerated(var7, var1.readByteNeg());
			if (var5 == Integer.MAX_VALUE) {
				this.field1244[var2] = var4.pathTraversed;
			}
		}

		int var15;
		int var16;
		if ((var3 & 2) != 0) {
			var15 = var1.readUnsignedShortAddLE();
			var15 += var1.readUnsignedByteNeg() << 16;
			var16 = 16777215;
			if (var15 == var16) {
				var15 = -1;
			}

			var4.method1828(var15);
		}

		byte var8;
		byte var9;
		int var10;
		int var11;
		int var12;
		if ((var3 & 8192) != 0) {
			byte var29 = var1.readByteNeg();
			byte var30 = var1.readByteNeg();
			var8 = var1.readByteSub();
			var9 = var1.readByte();
			var10 = var1.readUnsignedShortAddLE() + Client.cycle;
			var11 = var1.readUnsignedShortAdd() + Client.cycle;
			var12 = var1.readUnsignedShortAddLE();
			var4.method1835(var29, var30, var8, var9, var10, var11, var12);
			this.field1243[var2] = false;
		}

		if ((var3 & 1024) != 0) {
			var16 = Client.cycle + var1.readUnsignedShortAddLE();
			var15 = Client.cycle + var1.readUnsignedShortAdd();
			var8 = var1.readByteAdd();
			var9 = var1.readByteSub();
			byte var26 = var1.readByte();
			byte var28 = (byte)var1.readUnsignedByteNeg();
			var4.method1827(var16, var15, var8, var9, var26, var28);
		}

		if ((var3 & 16) != 0) {
			var16 = var1.readUnsignedShortLE();
			byte[] var23 = new byte[var16];
			Buffer var17 = new Buffer(var23);
			var1.readBytes(var23, 0, var16);
			var4.method1826(var17);
		}

		if ((var3 & 2048) != 0) {
			byte var21 = var1.readByteSub();
			if (var21 == 127) {
				this.field1244[var2] = MoveSpeed.field3278;
			} else {
				MoveSpeed[] var6 = this.field1244;
				MoveSpeed[] var31 = new MoveSpeed[]{MoveSpeed.field3280, MoveSpeed.field3278, MoveSpeed.field3276, MoveSpeed.field3274};
				var6[var2] = (MoveSpeed)ScriptFrame.findEnumerated(var31, var21);
			}
		}

		if ((var3 & 1) != 0) {
			var1.readUnsignedShortAdd();
			var1.readUnsignedByte();
			var1.readUnsignedShortLE();
			var16 = var1.readUnsignedByteNeg();
			this.field1245.offset = 0;
			var1.readBytes(this.field1245.array, 0, var16);
			this.field1245.offset = 0;
		}

		if ((var3 & 128) != 0) {
			var16 = var1.readUnsignedIntIME();
			if (var16 == 65535) {
				var16 = -1;
			}

			var15 = var1.readUnsignedShortLE();
			var4.method1883(var16, var15);
		}

		if ((var3 & 256) != 0) {
			for (var16 = 0; var16 < 3; ++var16) {
				this.field1246[var16] = var1.readStringCp1252NullTerminated();
			}

			var4.method1836(this.field1246);
		}

		int var24;
		if ((var3 & 4096) != 0) {
			var16 = var1.readUnsignedShortAddLE();
			var15 = var16 >> 8;
			var24 = var15 >= 13 && var15 <= 20 ? var15 - 12 : 0;
			PlayerType var18 = (PlayerType)ScriptFrame.findEnumerated(class113.PlayerType_values(), var1.readUnsignedShortLE());
			boolean var27 = var1.readUnsignedByteNeg() == 1;
			var11 = var1.readUnsignedByte();
			this.field1245.offset = 0;
			var1.method11475(this.field1245.array, 0, var11);
			this.field1245.offset = 0;
			String var19 = AbstractFont.escapeBrackets(Calendar.method8178(FloorOverlayDefinition.method4815(this.field1245)));
			byte[] var13 = null;
			if (var24 > 0 && var24 <= 8) {
				var13 = new byte[var24];

				for (int var14 = 0; var14 < var24; ++var14) {
					var13[var14] = var1.readByteNeg();
				}
			}

			var4.method1834(var16, var18, var27, var19, var13);
		}

		int var25;
		if ((var3 & 64) != 0) {
			var16 = var1.readUnsignedByte();
			if (var16 > 0) {
				for (var15 = 0; var15 < var16; ++var15) {
					var25 = -1;
					var10 = -1;
					var11 = -1;
					var24 = var1.readUShortSmart();
					if (var24 == 32767) {
						var24 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var25 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var24 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var24 = -1;
					}

					var12 = var1.readUShortSmart();
					var4.method1889(var24, var10, var25, var11, var12);
				}
			}

			var15 = var1.readUnsignedByte();
			if (var15 > 0) {
				for (var24 = 0; var24 < var15; ++var24) {
					var25 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var12 = var1.readUnsignedIntLE();
						int var20 = var10 > 0 ? var1.readUnsignedShortLE() : var12;
						var4.method1831(var25, var10, var11, var12, var20);
					} else {
						var4.method1880(var25);
					}
				}
			}
		}

		if ((var3 & 8) != 0) {
			String var22 = var1.readStringCp1252NullTerminated();
			var4.method1829(var22);
		}

		if ((var3 & 65536) != 0) {
			var16 = var1.readUnsignedByte();

			for (var15 = 0; var15 < var16; ++var15) {
				var24 = var1.readUnsignedByteNeg();
				var25 = var1.readUnsignedShort();
				var10 = var1.method11575();
				var4.method1838(var24, var25, var10 >> 16, var10 & 65535);
			}
		}

		if ((var3 & 32) != 0) {
			var16 = var1.readUnsignedShortAddLE();
			var4.method1833(var16);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "1927673390"
	)
	void method2944(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method1817(var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "187773543"
	)
	@Export("clear")
	void clear() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method1814();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1847113053"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class604.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class604.SpriteBuffer_xOffsets = new int[class604.SpriteBuffer_spriteCount];
		class604.SpriteBuffer_yOffsets = new int[class604.SpriteBuffer_spriteCount];
		class604.SpriteBuffer_spriteWidths = new int[class604.SpriteBuffer_spriteCount];
		ItemContainer.SpriteBuffer_spriteHeights = new int[class604.SpriteBuffer_spriteCount];
		class604.SpriteBuffer_pixels = new byte[class604.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class604.SpriteBuffer_spriteCount * 8;
		class604.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class604.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class604.SpriteBuffer_spriteCount; ++var3) {
			class604.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class604.SpriteBuffer_spriteCount; ++var3) {
			class604.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class604.SpriteBuffer_spriteCount; ++var3) {
			class604.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class604.SpriteBuffer_spriteCount; ++var3) {
			ItemContainer.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class604.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class604.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class604.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class604.SpriteBuffer_spritePalette[var3] == 0) {
				class604.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class604.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class604.SpriteBuffer_spriteWidths[var3];
			int var5 = ItemContainer.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class604.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			boolean var9 = (var8 & 1) == 1;
			boolean var10 = (var8 & 2) == 2;
			int var11;
			if (!var9) {
				for (var11 = 0; var11 < var6; ++var11) {
					var7[var11] = var1.readByte();
				}
			} else {
				for (var11 = 0; var11 < var4; ++var11) {
					for (int var12 = 0; var12 < var5; ++var12) {
						var7[var11 + var4 * var12] = var1.readByte();
					}
				}
			}

			if (var10) {
				var1.offset += var6;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-829476636"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lhy;I)V",
		garbageValue = "-1159437390"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, class196 var1) {
		for (int var2 = 0; var2 < var0.field1169.method9887(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1169.method9886(var2));
			if (var3 != null && var3.isVisible() && var3.definition.field2100 == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = ClanChannelMember.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = VerticalAlignment.method4455(var0, var3.x, var3.y, var4, var3.vmethod2813());
					var9 -= var3.method2444();
					int var10 = var3.size * 64 - 64 + 60;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
