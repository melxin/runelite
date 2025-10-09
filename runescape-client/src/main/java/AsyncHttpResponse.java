import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field76;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ab")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("at")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method260(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1332602771"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2023470045"
	)
	void method260(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1718799629"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-68"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lan;",
		garbageValue = "1233802171"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method260(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1487547134"
	)
	public static int method278(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lbx;",
		garbageValue = "8598"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([J[JIII)V",
		garbageValue = "-1200921626"
	)
	public static void method259(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

			for (int var12 = var2; var12 < var3; ++var12) {
				if (var0[var12] < var6 + ((long)var12 & var10)) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method259(var0, var1, var2, var5 - 1);
			method259(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-1667987006"
	)
	static void method280(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		Scene var4 = var0.scene;
		int var5 = 1;
		int var6 = 2;
		int var7 = 4;

		for (int var8 = 0; var8 < 4; ++var8) {
			if (var8 > 0) {
				var5 <<= 3;
				var6 <<= 3;
				var7 <<= 3;
			}

			for (int var9 = 0; var9 <= var8; ++var9) {
				for (int var10 = 0; var10 <= var2; ++var10) {
					for (int var11 = 0; var11 <= var1; ++var11) {
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int[] var10000;
						short var17;
						int var18;
						int var19;
						int var20;
						int var21;
						if ((MusicPatch.field3967[var9][var11][var10] & var5) != 0) {
							var12 = var10;
							var13 = var10;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (MusicPatch.field3967[var9][var11][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < var2 && (MusicPatch.field3967[var9][var11][var13 + 1] & var5) != 0) {
								++var13;
							}

							label189:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((MusicPatch.field3967[var14 - 1][var11][var16] & var5) == 0) {
										break label189;
									}
								}

								--var14;
							}

							label178:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((MusicPatch.field3967[var15 + 1][var11][var16] & var5) == 0) {
										break label178;
									}
								}

								++var15;
							}

							var16 = (var15 + 1 - var14) * (var13 - var12 + 1);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var11][var12] - var17;
								var19 = var3[var14][var11][var12];
								var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = MusicPatch.field3967[var20][var11];
										var10000[var21] &= ~var5;
									}
								}
							}
						}

						if ((MusicPatch.field3967[var9][var11][var10] & var6) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (MusicPatch.field3967[var9][var12 - 1][var10] & var6) != 0; --var12) {
							}

							while (var13 < var1 && (MusicPatch.field3967[var9][var13 + 1][var10] & var6) != 0) {
								++var13;
							}

							label242:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((MusicPatch.field3967[var14 - 1][var16][var10] & var6) == 0) {
										break label242;
									}
								}

								--var14;
							}

							label231:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((MusicPatch.field3967[var15 + 1][var16][var10] & var6) == 0) {
										break label231;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var12][var10] - var17;
								var19 = var3[var14][var12][var10];
								var4.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = MusicPatch.field3967[var20][var21];
										var10000[var10] &= ~var6;
									}
								}
							}
						}

						if ((MusicPatch.field3967[var9][var11][var10] & var7) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var10;

							for (var15 = var10; var14 > 0 && (MusicPatch.field3967[var9][var11][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (MusicPatch.field3967[var9][var11][var15 + 1] & var7) != 0) {
								++var15;
							}

							label295:
							while (var12 > 0) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((MusicPatch.field3967[var9][var12 - 1][var16] & var7) == 0) {
										break label295;
									}
								}

								--var12;
							}

							label284:
							while (var13 < var1) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((MusicPatch.field3967[var9][var13 + 1][var16] & var7) == 0) {
										break label284;
									}
								}

								++var13;
							}

							if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) {
								var16 = var3[var9][var12][var14];
								var4.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

								for (int var22 = var12; var22 <= var13; ++var22) {
									for (var18 = var14; var18 <= var15; ++var18) {
										var10000 = MusicPatch.field3967[var9][var22];
										var10000[var18] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIB)V",
		garbageValue = "44"
	)
	static void method275(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.remove();
					break;
				}
			}

			if (var6.last() == null) {
				var0.groundItems[var1][var2][var3] = null;
			}

			class263.updateItemPile2(var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2008015941"
	)
	static final void method276(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4121()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + WorldMapArea.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
