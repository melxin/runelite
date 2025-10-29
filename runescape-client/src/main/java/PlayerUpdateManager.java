import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ns")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("ag")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lbh;"
	)
	@Export("Players_regions")
	final class46[] Players_regions;
	@ObfuscatedName("ae")
	final boolean[] field1219;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Llz;"
	)
	final MoveSpeed[] field1218;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	final Buffer field1217;
	@ObfuscatedName("aw")
	final String[] field1222;
	@ObfuscatedName("ap")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ay")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("au")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1320060371
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1752371791
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1555789145
	)
	int field1226;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1318902831
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class46[2048];
		this.field1219 = new boolean[2048];
		this.field1218 = new MoveSpeed[2048];
		this.field1217 = new Buffer(new byte[5000]);
		this.field1222 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1226 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class46(var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V",
		garbageValue = "-204499863"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.clear();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method1837(-1);
		var3.coord.method7697(var4);
		var3.field632 = 0;
		Player var5 = var3.method1902(var2, Occluder.topLevelWorldView);
		var3.method1838(var5);
		Occluder.topLevelWorldView.players.add(var5, (long)var2);
		class330.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method1837(Coord.method7672(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxj;II)V",
		garbageValue = "-1788819960"
	)
	final void method2936(PacketBuffer var1, int var2) {
		int var3 = var1.offset * 2108391709;
		this.Players_pendingUpdateCount = 0;
		this.method2972(var1);
		this.method2952();
		this.method2942();
		this.updatePlayers(var1);
		this.method2963();
		if (var1.offset * 2108391709 - var3 != var2) {
			throw new RuntimeException(var1.offset * 2108391709 - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V",
		garbageValue = "-1358888795"
	)
	void method2972(PacketBuffer var1) {
		this.field1226 = 0;
		int var2 = 0;
		var1.importIndex();

		class46 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field632 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field632 = (byte)(var10000.field632 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2938(var1);
						var10000 = this.Players_regions[var4];
						var10000.field632 = (byte)(var10000.field632 | 2);
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
				if ((this.Players_regions[var4].field632 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field632 = (byte)(var10000.field632 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2938(var1);
							var10000 = this.Players_regions[var4];
							var10000.field632 = (byte)(var10000.field632 | 2);
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
					if ((this.Players_regions[var4].field632 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field632 = (byte)(var10000.field632 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2938(var1);
								var10000 = this.Players_regions[var4];
								var10000.field632 = (byte)(var10000.field632 | 2);
							} else if (this.method2950(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field632 = (byte)(var10000.field632 | 2);
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
						if ((this.Players_regions[var4].field632 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field632 = (byte)(var10000.field632 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2938(var1);
									var10000 = this.Players_regions[var4];
									var10000.field632 = (byte)(var10000.field632 | 2);
								} else if (this.method2950(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field632 = (byte)(var10000.field632 | 2);
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
							var10000.field632 = (byte)(var10000.field632 >> 1);
							if (this.Players_regions[var3].method1842()) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)I",
		garbageValue = "-733785204"
	)
	int method2938(PacketBuffer var1) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IB)V",
		garbageValue = "67"
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
				this.field1219[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method1843();
				if (var1.readBits(1) != 0) {
					this.method2950(var1, var2);
				}

				this.Players_targetIndices[++this.field1226 - 1] = var2;
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

				this.field1219[var2] = true;
				this.field1218[var2] = var5.pathTraversed;
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

				this.field1219[var2] = true;
				this.field1218[var2] = var5.pathTraversed;
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
					this.field1219[var2] = true;
					this.field1218[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method7673(var7);
					var9 = Coord.method7674(var7);
					var10 = Coord.method7675(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1219[var2] = true;
					this.field1218[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxj;IB)Z",
		garbageValue = "-40"
	)
	boolean method2950(PacketBuffer var1, int var2) {
		class46 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2950(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method1842()) {
				throw new RuntimeException();
			} else {
				var3.method1844(var5, var6);
				this.field1219[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field623;
				var7 = Coord.method7673(var6) + var5 & 3;
				var3.method1846(var7);
				var3.field623 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field623;
					var9 = Coord.method7673(var8) + var6 & 3;
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

					var3.method1846(var9);
					var3.field623 = Coord.method7672(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field623;
					var10 = Coord.method7673(var9) + var6 & 3;
					var3.method1846(var10);
					var11 = Coord.method7674(var9) + var7 & 255;
					int var12 = Coord.method7675(var9) + var8 & 255;
					var3.field623 = Coord.method7672(var3.method1845(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2952() {
		for (int var1 = 0; var1 < this.field1226; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class46 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method1847(var6);
					var6.detach();
				}
			}

			var3.method1840();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-696846496"
	)
	void method2942() {
		Client.currentWorldViewId = -1;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.method2943(var2);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "-46"
	)
	void method2943(WorldView var1) {
		for (int var2 = 0; var2 < this.playerCount; ++var2) {
			int var3 = this.playerIndices[var2];
			class46 var4 = this.Players_regions[var3];
			Coord var5 = var4.coord;
			Player var6 = (Player)var1.players.get((long)var3);
			boolean var7 = var5.x > var1.baseX && var5.y > var1.baseY && var5.x < var1.sizeX + var1.baseX && var5.y < var1.sizeY + var1.baseY;
			if (var3 == Client.localPlayerIndex && var7 && var1.id != -1) {
				Client.currentWorldViewId = var1.id;
			}

			if (var7 && var6 == null) {
				var6 = var4.method1902(var3, var1);
				var4.method1838(var6);
				var1.players.add(var6, (long)var3);
			} else if (!var7 && var6 != null && var6 != class330.localPlayer) {
				var4.method1847(var6);
				var6.detach();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V",
		garbageValue = "-181582075"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 1) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 256) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method2946(var1, var3, var4);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	void method2963() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1219[var2]) {
				class46 var3 = this.Players_regions[var2];
				var3.method1870(this.field1218[var2]);
				this.field1219[var2] = false;
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxj;III)V",
		garbageValue = "-1465216876"
	)
	void method2946(PacketBuffer var1, int var2, int var3) {
		class46 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		int var6;
		if ((var3 & 4) != 0) {
			var6 = var1.readUnsignedByteAdd();
			byte[] var7 = new byte[var6];
			Buffer var8 = new Buffer(var7);
			var1.method11697(var7, 0, var6);
			var4.method1848(var8);
		}

		if ((var3 & 16384) != 0) {
			var5 = var1.readByteNeg();
			if (var5 == 127) {
				this.field1218[var2] = MoveSpeed.field3300;
			} else {
				this.field1218[var2] = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3894(), var5);
			}
		}

		byte var9;
		int var15;
		byte var16;
		if ((var3 & 8192) != 0) {
			var6 = Client.cycle + var1.readUnsignedShortAdd();
			var15 = Client.cycle + var1.readUnsignedShortAdd();
			var16 = var1.readByteSub();
			var9 = var1.readByteAdd();
			byte var10 = var1.readByteSub();
			byte var11 = (byte)var1.readUnsignedByteAdd();
			var4.method1859(var6, var15, var16, var9, var10, var11);
		}

		if ((var3 & 128) != 0) {
			var6 = var1.readUnsignedShort();
			var4.method1855(var6);
		}

		if ((var3 & 16) != 0) {
			var6 = var1.readUnsignedShortLE();
			if (var6 == 65535) {
				var6 = -1;
			}

			var15 = var1.readUnsignedByteAdd();
			var4.method1849(var6, var15);
		}

		if ((var3 & 32) != 0) {
			String var17 = var1.readStringCp1252NullTerminated();
			var4.method1851(var17);
		}

		int var25;
		int var26;
		if ((var3 & 4096) != 0) {
			var6 = var1.readUnsignedShortAdd();
			var15 = var6 >> 8;
			var26 = var15 >= 13 && var15 <= 20 ? var15 - 12 : 0;
			PlayerType var18 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(), var1.readUnsignedByteNeg());
			boolean var23 = var1.readUnsignedByteNeg() == 1;
			var25 = var1.readUnsignedByteSub();
			this.field1217.offset = 0;
			var1.method11695(this.field1217.array, 0, var25);
			this.field1217.offset = 0;
			String var12 = AbstractFont.escapeBrackets(ClanChannelMember.method3986(ObjectSound.method2380(this.field1217)));
			byte[] var13 = null;
			if (var26 > 0 && var26 <= 8) {
				var13 = new byte[var26];

				for (int var14 = 0; var14 < var26; ++var14) {
					var13[var14] = var1.readByteAdd();
				}
			}

			var4.method1856(var6, var18, var23, var12, var13);
		}

		int var19;
		int var21;
		int var24;
		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedByteNeg();
			if (var6 > 0) {
				for (var15 = 0; var15 < var6; ++var15) {
					var21 = -1;
					var24 = -1;
					var25 = -1;
					var26 = var1.readUShortSmart();
					if (var26 == 32767) {
						var26 = var1.readUShortSmart();
						var24 = var1.readUShortSmart();
						var21 = var1.readUShortSmart();
						var25 = var1.readUShortSmart();
					} else if (var26 != 32766) {
						var24 = var1.readUShortSmart();
					} else {
						var26 = -1;
					}

					var19 = var1.readUShortSmart();
					var4.method1905(var26, var24, var21, var25, var19);
				}
			}

			var15 = var1.readUnsignedByteNeg();
			if (var15 > 0) {
				for (var26 = 0; var26 < var15; ++var26) {
					var21 = var1.readUShortSmart();
					var24 = var1.readUShortSmart();
					if (var24 != 32767) {
						var25 = var1.readUShortSmart();
						var19 = var1.readUnsignedByte();
						int var20 = var24 > 0 ? var1.readUnsignedByteAdd() : var19;
						var4.method1853(var21, var24, var25, var19, var20);
					} else {
						var4.method1854(var21);
					}
				}
			}
		}

		if ((var3 & 2048) != 0) {
			var4.pathTraversed = (MoveSpeed)GrandExchangeOffer.findEnumerated(class144.method3894(), var1.readByteAdd());
			if (var5 == Integer.MAX_VALUE) {
				this.field1218[var2] = var4.pathTraversed;
			}
		}

		if ((var3 & 2) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByteNeg();
			var1.readUnsignedByte();
			var6 = var1.readUnsignedByteSub();
			this.field1217.offset = 0;
			var1.method11694(this.field1217.array, 0, var6);
			this.field1217.offset = 0;
		}

		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByte();

			for (var15 = 0; var15 < var6; ++var15) {
				var26 = var1.readUnsignedByte();
				var21 = var1.readUnsignedShortAddLE();
				var24 = var1.method11858();
				var4.method1860(var26, var21, var24 >> 16, var24 & 65535);
			}
		}

		if ((var3 & 1024) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1222[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method1858(this.field1222);
		}

		if ((var3 & 512) != 0) {
			byte var22 = var1.readByteSub();
			byte var27 = var1.readByte();
			var16 = var1.readByte();
			var9 = var1.readByteAdd();
			var24 = var1.readUnsignedShortAdd() + Client.cycle;
			var25 = var1.readUnsignedShort() + Client.cycle;
			var19 = var1.readUnsignedShortAddLE();
			var4.method1863(var22, var27, var16, var9, var24, var25, var19);
			this.field1219[var2] = false;
		}

		if ((var3 & 8) != 0) {
			var15 = var1.readUnsignedShort();
			var15 += var1.readUnsignedByteSub() << 16;
			var6 = 16777215;
			if (var6 == var15) {
				var15 = -1;
			}

			var4.method1868(var15);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "-541736768"
	)
	void method2947(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method1847(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "823202538"
	)
	@Export("clear")
	void clear() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method1836();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfi;",
		garbageValue = "0"
	)
	static class137[] method2982() {
		return new class137[]{class137.field1637, class137.field1631, class137.field1632, class137.field1633, class137.field1634};
	}
}
