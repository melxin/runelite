import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("av")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("an")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	@Export("Players_regions")
	final class47[] Players_regions;
	@ObfuscatedName("al")
	final boolean[] field1218;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lkt;"
	)
	final MoveSpeed[] field1219;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	final Buffer field1220;
	@ObfuscatedName("am")
	final String[] field1221;
	@ObfuscatedName("ah")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ag")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("au")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2126448481
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -396474707
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1458080759
	)
	int field1227;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -664872917
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class47[2048];
		this.field1218 = new boolean[2048];
		this.field1219 = new MoveSpeed[2048];
		this.field1220 = new Buffer(new byte[5000]);
		this.field1221 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1227 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class47(var1);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)V",
		garbageValue = "-51952950"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.clear();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class47 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method1761(-1);
		var3.coord.method7241(var4);
		var3.field686 = 0;
		Player var5 = var3.method1765(var2, Sound.topLevelWorldView);
		var3.method1762(var5);
		Sound.topLevelWorldView.players.add(var5, (long)var2);
		class152.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var2 != var6) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method1761(Coord.method7221(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwx;IB)V",
		garbageValue = "9"
	)
	final void method2733(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2701(var1);
		this.method2722();
		this.method2704();
		this.updatePlayers(var1);
		this.method2706();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)V",
		garbageValue = "-1751480283"
	)
	void method2701(PacketBuffer var1) {
		this.field1227 = 0;
		int var2 = 0;
		var1.importIndex();

		class47 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field686 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field686 = (byte)(var10000.field686 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2725(var1);
						var10000 = this.Players_regions[var4];
						var10000.field686 = (byte)(var10000.field686 | 2);
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
				if ((this.Players_regions[var4].field686 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field686 = (byte)(var10000.field686 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2725(var1);
							var10000 = this.Players_regions[var4];
							var10000.field686 = (byte)(var10000.field686 | 2);
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
					if ((this.Players_regions[var4].field686 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field686 = (byte)(var10000.field686 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2725(var1);
								var10000 = this.Players_regions[var4];
								var10000.field686 = (byte)(var10000.field686 | 2);
							} else if (this.method2702(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field686 = (byte)(var10000.field686 | 2);
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
						if ((this.Players_regions[var4].field686 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field686 = (byte)(var10000.field686 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2725(var1);
									var10000 = this.Players_regions[var4];
									var10000.field686 = (byte)(var10000.field686 | 2);
								} else if (this.method2702(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field686 = (byte)(var10000.field686 | 2);
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
							var10000.field686 = (byte)(var10000.field686 >> 1);
							if (this.Players_regions[var3].method1766()) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)I",
		garbageValue = "1599829009"
	)
	int method2725(PacketBuffer var1) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwx;II)V",
		garbageValue = "776433284"
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
				this.field1218[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method1838();
				if (var1.readBits(1) != 0) {
					this.method2702(var1, var2);
				}

				this.Players_targetIndices[++this.field1227 - 1] = var2;
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

				this.field1218[var2] = true;
				this.field1219[var2] = var5.pathTraversed;
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

				this.field1218[var2] = true;
				this.field1219[var2] = var5.pathTraversed;
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
					this.field1218[var2] = true;
					this.field1219[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method7222(var7);
					var9 = Coord.method7223(var7);
					var10 = Coord.method7224(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1218[var2] = true;
					this.field1219[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwx;II)Z",
		garbageValue = "-1481773061"
	)
	boolean method2702(PacketBuffer var1, int var2) {
		class47 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2702(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method1766()) {
				throw new RuntimeException();
			} else {
				var3.method1768(var5, var6);
				this.field1218[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field682;
				var7 = Coord.method7222(var6) + var5 & 3;
				var3.method1770(var7);
				var3.field682 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field682;
					var9 = Coord.method7222(var8) + var6 & 3;
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

					var3.method1770(var9);
					var3.field682 = Coord.method7221(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field682;
					var10 = Coord.method7222(var9) + var6 & 3;
					var3.method1770(var10);
					var11 = Coord.method7223(var9) + var7 & 255;
					int var12 = Coord.method7224(var9) + var8 & 255;
					var3.field682 = Coord.method7221(var3.method1769(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "38"
	)
	void method2722() {
		for (int var1 = 0; var1 < this.field1227; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class47 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method1763(var6);
					var6.detach();
				}
			}

			var3.method1764();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "564385355"
	)
	void method2704() {
		Client.field337 = -1;

		label68:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class47 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label68;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = (Player)var6.players.get((long)var2);
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.baseX + var6.sizeX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						Client.field337 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method1765(var2, var6);
						var3.method1762(var7);
						var6.players.add(var7, (long)var2);
					} else if (!var8 && var7 != null && var7 != class152.localPlayer) {
						var3.method1763(var7);
						var7.detach();
					}
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwx;S)V",
		garbageValue = "-5828"
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

			this.method2720(var1, var3, var4);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1076560461"
	)
	void method2706() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1218[var2]) {
				class47 var3 = this.Players_regions[var2];
				var3.method1817(this.field1219[var2]);
				this.field1218[var2] = false;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwx;III)V",
		garbageValue = "1606059252"
	)
	void method2720(PacketBuffer var1, int var2, int var3) {
		class47 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		int var7;
		int var8;
		int var11;
		if ((var3 & 1024) != 0) {
			var6 = var1.readUnsignedShortAdd();
			var7 = var6 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)class175.findEnumerated(MusicPatchNode2.PlayerType_values(), var1.readUnsignedByte());
			boolean var10 = var1.readUnsignedByteNeg() == 1;
			var11 = var1.readUnsignedByte();
			this.field1220.offset = 0;
			var1.method10913(this.field1220.array, 0, var11);
			this.field1220.offset = 0;
			String var12 = AbstractFont.escapeBrackets(MoveSpeed.method6102(class162.method3825(this.field1220)));
			byte[] var13 = null;
			if (var8 > 0 && var8 <= 8) {
				var13 = new byte[var8];

				for (int var14 = 0; var14 < var8; ++var14) {
					var13[var14] = var1.readByteSub();
				}
			}

			var4.method1780(var6, var9, var10, var12, var13);
		}

		if ((var3 & 1) != 0) {
			String var15 = var1.readStringCp1252NullTerminated();
			var4.method1775(var15);
		}

		int var18;
		int var23;
		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByteSub();

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var1.readUnsignedByteAdd();
				var18 = var1.readUnsignedShortLE();
				var23 = var1.readUnsignedIntLE();
				var4.method1806(var8, var18, var23 >> 16, var23 & 65535);
			}
		}

		int var19;
		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedByteSub();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var18 = -1;
					var23 = -1;
					var11 = -1;
					var8 = var1.readUShortSmart();
					if (var8 == 32767) {
						var8 = var1.readUShortSmart();
						var23 = var1.readUShortSmart();
						var18 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var8 != 32766) {
						var23 = var1.readUShortSmart();
					} else {
						var8 = -1;
					}

					var19 = var1.readUShortSmart();
					var4.method1831(var8, var23, var18, var11, var19);
				}
			}

			var7 = var1.readUnsignedByteNeg();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var18 = var1.readUShortSmart();
					var23 = var1.readUShortSmart();
					if (var23 != 32767) {
						var11 = var1.readUShortSmart();
						var19 = var1.readUnsignedByteSub();
						int var20 = var23 > 0 ? var1.readUnsignedByte() : var19;
						var4.method1777(var18, var23, var11, var19, var20);
					} else {
						var4.method1778(var18);
					}
				}
			}
		}

		if ((var3 & 16384) != 0) {
			var4.pathTraversed = (MoveSpeed)class175.findEnumerated(ClientPreferences.method2525(), var1.readByteAdd());
			if (var5 == Integer.MAX_VALUE) {
				this.field1219[var2] = var4.pathTraversed;
			}
		}

		if ((var3 & 128) != 0) {
			var6 = var1.readUnsignedByteNeg();
			byte[] var16 = new byte[var6];
			Buffer var17 = new Buffer(var16);
			var1.readBytes(var16, 0, var6);
			var4.method1774(var17);
		}

		if ((var3 & 8192) != 0) {
			byte var21 = var1.readByte();
			if (var21 == 127) {
				this.field1219[var2] = MoveSpeed.field3121;
			} else {
				this.field1219[var2] = (MoveSpeed)class175.findEnumerated(ClientPreferences.method2525(), var21);
			}
		}

		if ((var3 & 2) != 0) {
			var7 = var1.readUnsignedShortLE();
			var7 += var1.readUnsignedByteAdd() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method1828(var7);
		}

		byte var25;
		byte var28;
		if ((var3 & 32768) != 0) {
			byte var22 = var1.readByteAdd();
			byte var24 = var1.readByte();
			var25 = var1.readByteNeg();
			var28 = var1.readByteAdd();
			var23 = var1.readUnsignedShort() + Client.cycle;
			var11 = var1.readUnsignedShort() + Client.cycle;
			var19 = var1.readUnsignedShortLE();
			var4.method1826(var22, var24, var25, var28, var23, var11, var19);
			this.field1218[var2] = false;
		}

		if ((var3 & 2048) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1221[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method1782(this.field1221);
		}

		if ((var3 & 8) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			var4.method1794(var6);
		}

		if ((var3 & 4096) != 0) {
			var6 = Client.cycle + var1.readUnsignedShort();
			var7 = Client.cycle + var1.readUnsignedShortAdd();
			var25 = var1.readByteSub();
			var28 = var1.readByteNeg();
			byte var26 = var1.readByteAdd();
			byte var27 = (byte)var1.readUnsignedByte();
			var4.method1783(var6, var7, var25, var28, var26, var27);
		}

		if ((var3 & 32) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByteNeg();
			var1.readUnsignedByteSub();
			var6 = var1.readUnsignedByteNeg();
			this.field1220.offset = 0;
			var1.method10913(this.field1220.array, 0, var6);
			this.field1220.offset = 0;
		}

		if ((var3 & 16) != 0) {
			var6 = var1.readUnsignedShortAdd();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByte();
			var4.method1773(var6, var7);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lcp;B)V",
		garbageValue = "25"
	)
	void method2708(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method1763(var1);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-759356320"
	)
	@Export("clear")
	void clear() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method1760();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-148647852"
	)
	public static void method2739() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "438565293"
	)
	static final float method2740(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "324490847"
	)
	static void method2741() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.field1159.method9429(); ++var2) {
				int var3 = var1.field1159.method9430(var2);
				WorldEntity var4 = (WorldEntity)var1.worldEntities.get((long)var3);
				if (var4 != null) {
					var4.method9701(Client.cycle);
				}
			}
		}

	}
}
