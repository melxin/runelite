import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ae")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcz;"
	)
	@Export("Players_regions")
	final class72[] Players_regions;
	@ObfuscatedName("as")
	final boolean[] field1416;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lkw;"
	)
	final MoveSpeed[] field1417;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	final Buffer field1412;
	@ObfuscatedName("am")
	final String[] field1419;
	@ObfuscatedName("aa")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ap")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 470906577
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -415557867
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1838075797
	)
	int field1415;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1926606827
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;

	PlayerUpdateManager() {
		this.playerIndices = new int[2048];
		this.Players_regions = new class72[2048];
		this.field1416 = new boolean[2048];
		this.field1417 = new MoveSpeed[2048];
		this.field1412 = new Buffer(new byte[5000]);
		this.field1419 = new String[3];
		this.Players_emptyIndices = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateIndices = new int[2048];
		this.playerCount = 0;
		this.Players_emptyIdxCount = 0;
		this.field1415 = 0;
		this.Players_pendingUpdateCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class72(var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvu;B)V",
		garbageValue = "6"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3011();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class72 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2165(-1);
		var3.coord.method6938(var4);
		var3.field878 = 0;
		Player var5 = var3.method2169(var2, class509.topLevelWorldView);
		var3.method2173(var5);
		class509.topLevelWorldView.players.add(var5, (long)var2);
		Script.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2165(Coord.method6902(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IB)V",
		garbageValue = "-63"
	)
	final void method3005(PacketBuffer var1, int var2) {
		int var3 = var1.offset * -2066221813;
		this.Players_pendingUpdateCount = 0;
		this.method3035(var1);
		this.method3029();
		this.method3006();
		this.updatePlayers(var1);
		this.method3008();
		if (var2 != var1.offset * -2066221813 - var3) {
			throw new RuntimeException(var1.offset * -2066221813 - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvu;S)V",
		garbageValue = "11609"
	)
	void method3035(PacketBuffer var1) {
		this.field1415 = 0;
		int var2 = 0;
		var1.importIndex();

		class72 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field878 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field878 = (byte)(var10000.field878 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method3002(var1);
						var10000 = this.Players_regions[var4];
						var10000.field878 = (byte)(var10000.field878 | 2);
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
				if ((this.Players_regions[var4].field878 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field878 = (byte)(var10000.field878 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method3002(var1);
							var10000 = this.Players_regions[var4];
							var10000.field878 = (byte)(var10000.field878 | 2);
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
					if ((this.Players_regions[var4].field878 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field878 = (byte)(var10000.field878 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method3002(var1);
								var10000 = this.Players_regions[var4];
								var10000.field878 = (byte)(var10000.field878 | 2);
							} else if (this.method3026(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field878 = (byte)(var10000.field878 | 2);
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
						if ((this.Players_regions[var4].field878 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field878 = (byte)(var10000.field878 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method3002(var1);
									var10000 = this.Players_regions[var4];
									var10000.field878 = (byte)(var10000.field878 | 2);
								} else if (this.method3026(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field878 = (byte)(var10000.field878 | 2);
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
							var10000.field878 = (byte)(var10000.field878 >> 1);
							if (this.Players_regions[var3].method2170()) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvu;I)I",
		garbageValue = "-195713886"
	)
	int method3002(PacketBuffer var1) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IB)V",
		garbageValue = "41"
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
				this.field1416[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2171();
				if (var1.readBits(1) != 0) {
					this.method3026(var1, var2);
				}

				this.Players_targetIndices[++this.field1415 - 1] = var2;
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

				this.field1416[var2] = true;
				this.field1417[var2] = var5.pathTraversed;
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

				this.field1416[var2] = true;
				this.field1417[var2] = var5.pathTraversed;
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
					this.field1416[var2] = true;
					this.field1417[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6891(var7);
					var9 = Coord.method6892(var7);
					var10 = Coord.method6903(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1416[var2] = true;
					this.field1417[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IB)Z",
		garbageValue = "89"
	)
	boolean method3026(PacketBuffer var1, int var2) {
		class72 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method3026(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2170()) {
				throw new RuntimeException();
			} else {
				var3.method2172(var5, var6);
				this.field1416[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field875;
				var7 = Coord.method6891(var6) + var5 & 3;
				var3.method2174(var7);
				var3.field875 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field875;
					var9 = Coord.method6891(var8) + var6 & 3;
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

					var3.method2174(var9);
					var3.field875 = Coord.method6902(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field875;
					var10 = Coord.method6891(var9) + var6 & 3;
					var3.method2174(var10);
					var11 = Coord.method6892(var9) + var7 & 255;
					int var12 = Coord.method6903(var9) + var8 & 255;
					var3.field875 = Coord.method6902(var3.method2181(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "563483644"
	)
	void method3029() {
		for (int var1 = 0; var1 < this.field1415; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class72 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = (Player)var5.players.get((long)var2);
				if (var6 != null) {
					var3.method2176(var6);
					var6.detach();
				}
			}

			var3.method2211();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "287842290"
	)
	void method3006() {
		Client.field530 = -1;

		label69:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class72 var3 = this.Players_regions[var2];
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
						Client.field530 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2169(var2, var6);
						var3.method2173(var7);
						var6.players.add(var7, (long)var2);
					} else if (!var8 && var7 != null && var7 != Script.localPlayer) {
						var3.method2176(var7);
						var7.detach();
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvu;I)V",
		garbageValue = "-1080784052"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 4) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 1024) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method3009(var1, var3, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "825208223"
	)
	void method3008() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1416[var2]) {
				class72 var3 = this.Players_regions[var2];
				var3.method2175(this.field1417[var2]);
				this.field1416[var2] = false;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvu;III)V",
		garbageValue = "-2049769438"
	)
	void method3009(PacketBuffer var1, int var2, int var3) {
		class72 var4 = this.Players_regions[var2];
		int var5 = Integer.MAX_VALUE;
		if ((var3 & 16384) != 0) {
			var4.pathTraversed = (MoveSpeed)ArchiveDiskActionHandler.findEnumerated(class7.method47(), var1.readByteNeg());
			if (var5 == Integer.MAX_VALUE) {
				this.field1417[var2] = var4.pathTraversed;
			}
		}

		int var6;
		int var7;
		if ((var3 & 128) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteSub();
			var4.method2224(var6, var7);
		}

		int var9;
		int var10;
		int var16;
		if ((var3 & 65536) != 0) {
			var6 = var1.readUnsignedByteNeg();

			for (var7 = 0; var7 < var6; ++var7) {
				var16 = var1.readUnsignedByteNeg();
				var9 = var1.readUnsignedShort();
				var10 = var1.method10352();
				var4.method2188(var16, var9, var10 >> 16, var10 & 65535);
			}
		}

		if ((var3 & 256) != 0) {
			byte var21 = var1.readByteSub();
			if (var21 == 127) {
				this.field1417[var2] = MoveSpeed.field3128;
			} else {
				this.field1417[var2] = (MoveSpeed)ArchiveDiskActionHandler.findEnumerated(class7.method47(), var21);
			}
		}

		if ((var3 & 64) != 0) {
			var6 = var1.readUnsignedByteNeg();
			byte[] var15 = new byte[var6];
			Buffer var8 = new Buffer(var15);
			var1.method10526(var15, 0, var6);
			var4.method2223(var8);
		}

		if ((var3 & 32768) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				this.field1419[var6] = var1.readStringCp1252NullTerminated();
			}

			var4.method2186(this.field1419);
		}

		int var11;
		int var12;
		if ((var3 & 2) != 0) {
			var6 = var1.readUnsignedByteAdd();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var16 = var1.readUShortSmart();
					if (var16 == 32767) {
						var16 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var9 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var16 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var16 = -1;
					}

					var12 = var1.readUShortSmart();
					var4.method2180(var16, var10, var9, var11, var12);
				}
			}

			var7 = var1.readUnsignedByteSub();
			if (var7 > 0) {
				for (var16 = 0; var16 < var7; ++var16) {
					var9 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var12 = var1.readUnsignedByteNeg();
						int var20 = var10 > 0 ? var1.readUnsignedByte() : var12;
						var4.method2221(var9, var10, var11, var12, var20);
					} else {
						var4.method2182(var9);
					}
				}
			}
		}

		if ((var3 & 1) != 0) {
			var1.readUnsignedShortLE();
			var1.readUnsignedByteNeg();
			var1.readUnsignedByteSub();
			var6 = var1.readUnsignedByte();
			this.field1412.offset = 0;
			var1.method10353(this.field1412.array, 0, var6);
			this.field1412.offset = 0;
		}

		if ((var3 & 32) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			var4.method2241(var6);
		}

		byte var24;
		byte var28;
		if ((var3 & 2048) != 0) {
			var6 = Client.cycle + var1.readUnsignedShortAddLE();
			var7 = Client.cycle + var1.readUnsignedShortLE();
			var28 = var1.readByteSub();
			var24 = var1.readByteAdd();
			byte var25 = var1.readByteSub();
			byte var26 = (byte)var1.readUnsignedByteNeg();
			var4.method2187(var6, var7, var28, var24, var25, var26);
		}

		if ((var3 & 8192) != 0) {
			byte var23 = var1.readByteSub();
			byte var22 = var1.readByte();
			var28 = var1.readByte();
			var24 = var1.readByteAdd();
			var10 = var1.readUnsignedShortAdd() + Client.cycle;
			var11 = var1.readUnsignedShortLE() + Client.cycle;
			var12 = var1.readUnsignedShortAdd();
			var4.method2233(var23, var22, var28, var24, var10, var11, var12);
			this.field1416[var2] = false;
		}

		if ((var3 & 16) != 0) {
			String var17 = var1.readStringCp1252NullTerminated();
			var4.method2179(var17);
		}

		if ((var3 & 4096) != 0) {
			var6 = var1.readUnsignedShort();
			var7 = var6 >> 8;
			var16 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var18 = (PlayerType)ArchiveDiskActionHandler.findEnumerated(ClientPreferences.PlayerType_values(), var1.readUnsignedByte());
			boolean var27 = var1.readUnsignedByte() == 1;
			var11 = var1.readUnsignedByte();
			this.field1412.offset = 0;
			var1.readBytes(this.field1412.array, 0, var11);
			this.field1412.offset = 0;
			String var19 = AbstractFont.escapeBrackets(HorizontalAlignment.method5170(Script.method2354(this.field1412)));
			byte[] var13 = null;
			if (var16 > 0 && var16 <= 8) {
				var13 = new byte[var16];

				for (int var14 = 0; var14 < var16; ++var14) {
					var13[var14] = var1.readByteSub();
				}
			}

			var4.method2215(var6, var18, var27, var19, var13);
		}

		if ((var3 & 8) != 0) {
			var7 = var1.readUnsignedShortAddLE();
			var7 += var1.readUnsignedByteAdd() << 16;
			var6 = 16777215;
			if (var7 == var6) {
				var7 = -1;
			}

			var4.method2178(var7);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldu;B)V",
		garbageValue = "-128"
	)
	void method3010(Player var1) {
		if (var1 != null) {
			this.Players_regions[var1.index].method2176(var1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	void method3011() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2164();
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1687817692"
	)
	static int method3043() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field794;
		} else {
			return 10000;
		}
	}
}
