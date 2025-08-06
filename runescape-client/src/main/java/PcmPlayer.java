import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 405979319
	)
	public static int field1313;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -1427849025
	)
	static int field1311;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1997908315
	)
	int field1314;
	@ObfuscatedName("ao")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -5498612937847284459L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 606524669
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1188978037
	)
	int field1319;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1538564025
	)
	int field1320;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 967286903019296417L
	)
	long field1318;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 266698677
	)
	int field1326;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1102872521
	)
	int field1323;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1559945147
	)
	int field1324;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -2507252187871305559L
	)
	long field1325;
	@ObfuscatedName("bo")
	boolean field1330;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1572276131
	)
	int field1327;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ldy;"
	)
	PcmStream[] field1328;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "[Ldy;"
	)
	PcmStream[] field1329;

	static {
		field1313 = 44100;
	}

	protected PcmPlayer() {
		this.field1314 = 32;
		this.timeMs = UserComparator7.method3496();
		this.field1318 = 0L;
		this.field1326 = 0;
		this.field1323 = 0;
		this.field1324 = 0;
		this.field1325 = 0L;
		this.field1330 = true;
		this.field1327 = 0;
		this.field1328 = new PcmStream[8];
		this.field1329 = new PcmStream[8];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1599861933"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1746572570"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-246176665"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("av")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1070831652"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1846245164"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "39"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1564064627"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = UserComparator7.method3496();

			try {
				if (this.field1318 != 0L) {
					if (var1 < this.field1318) {
						return;
					}

					this.open(this.capacity);
					this.field1318 = 0L;
					this.field1330 = true;
				}

				int var3 = this.position();
				if (this.field1324 - var3 > this.field1326) {
					this.field1326 = this.field1324 - var3;
				}

				int var4 = this.field1319 + this.field1320;
				if (var4 + 512 > 32768) {
					var4 = 32256;
				}

				if (var4 + 512 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 32768) {
						this.capacity = 32768;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field1330 = true;
					if (var4 + 512 > this.capacity) {
						var4 = this.capacity - 512;
						this.field1320 = var4 - this.field1319;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 512);
					this.write();
					var3 += 512;
				}

				if (var1 > this.field1325) {
					if (!this.field1330) {
						if (this.field1326 == 0 && this.field1323 == 0) {
							this.close();
							this.field1318 = 2000L + var1;
							return;
						}

						this.field1320 = Math.min(this.field1323, this.field1326);
						this.field1323 = this.field1326;
					} else {
						this.field1330 = false;
					}

					this.field1326 = 0;
					this.field1325 = 2000L + var1;
				}

				this.field1324 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1318 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(512);
					this.timeMs += (long)(512000 / field1313);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	public final void method3003() {
		this.field1330 = true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-205925847"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1330 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1318 = UserComparator7.method3496() + 2000L;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (MusicPatchPcmStream.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == MusicPatchPcmStream.soundSystem.players[var2]) {
					MusicPatchPcmStream.soundSystem.players[var2] = null;
				}

				if (MusicPatchPcmStream.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class359.soundSystemExecutor.shutdownNow();
				class359.soundSystemExecutor = null;
				MusicPatchPcmStream.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1327 -= var1;
		if (this.field1327 < 0) {
			this.field1327 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bn")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (class475.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class476.clearIntArray(var1, 0, var3);
		this.field1327 -= var2;
		if (this.stream != null && this.field1327 <= 0) {
			this.field1327 += field1313 >> 4;
			Canvas.PcmStream_disable(this.stream);
			this.method3029(this.stream, this.stream.vmethod3277());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label110:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field1328[var7];

						label104:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label104;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod7328();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1314) {
										break label110;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1390; var14 != null; var14 = var11.nextSubStream()) {
											this.method3029(var14, var15 * var14.vmethod3277() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1328[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field1329[var7] = var10;
									}

									var11 = var16;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var17 = this.field1328[var6];
				PcmStream[] var18 = this.field1328;
				this.field1329[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field1327 < 0) {
			this.field1327 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = UserComparator7.method3496();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ldy;II)V",
		garbageValue = "905435754"
	)
	final void method3029(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1329[var3];
		if (var4 == null) {
			this.field1328[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1329[var3] = var1;
		var1.field1390 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;Ljava/lang/String;I)I",
		garbageValue = "-1742411845"
	)
	public static int method3049(Buffer var0, String var1) {
		int var2 = var0.offset;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var5[var6] = -128;
				} else if (var7 == 8218) {
					var5[var6] = -126;
				} else if (var7 == 402) {
					var5[var6] = -125;
				} else if (var7 == 8222) {
					var5[var6] = -124;
				} else if (var7 == 8230) {
					var5[var6] = -123;
				} else if (var7 == 8224) {
					var5[var6] = -122;
				} else if (var7 == 8225) {
					var5[var6] = -121;
				} else if (var7 == 710) {
					var5[var6] = -120;
				} else if (var7 == 8240) {
					var5[var6] = -119;
				} else if (var7 == 352) {
					var5[var6] = -118;
				} else if (var7 == 8249) {
					var5[var6] = -117;
				} else if (var7 == 338) {
					var5[var6] = -116;
				} else if (var7 == 381) {
					var5[var6] = -114;
				} else if (var7 == 8216) {
					var5[var6] = -111;
				} else if (var7 == 8217) {
					var5[var6] = -110;
				} else if (var7 == 8220) {
					var5[var6] = -109;
				} else if (var7 == 8221) {
					var5[var6] = -108;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (var7 == 8211) {
					var5[var6] = -106;
				} else if (var7 == 8212) {
					var5[var6] = -105;
				} else if (var7 == 732) {
					var5[var6] = -104;
				} else if (var7 == 8482) {
					var5[var6] = -103;
				} else if (var7 == 353) {
					var5[var6] = -102;
				} else if (var7 == 8250) {
					var5[var6] = -101;
				} else if (var7 == 339) {
					var5[var6] = -100;
				} else if (var7 == 382) {
					var5[var6] = -98;
				} else if (var7 == 376) {
					var5[var6] = -97;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class374.huffman.compress(var5, 0, var5.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([F[IIIB)V",
		garbageValue = "101"
	)
	public static void method3052(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3052(var0, var1, var2, var5 - 1);
			method3052(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "([Lox;IIIIIIZB)V",
		garbageValue = "44"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		for (int var8 = var1; var8 <= var2; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var3 == var9.parentId && var4 == var9.field4117) {
				ModelData0.alignWidgetSize(var9, var5, var6, var7);
				AddRequestTask.alignWidgetPosition(var9, var5, var6);
				if (var9.scrollX > var9.scrollWidth - var9.width) {
					var9.scrollX = var9.scrollWidth - var9.width;
				}

				if (var9.scrollX < 0) {
					var9.scrollX = 0;
				}

				if (var9.scrollY > var9.scrollHeight - var9.height * -1326764757) {
					var9.scrollY = var9.scrollHeight - var9.height * -1326764757;
				}

				if (var9.scrollY < 0) {
					var9.scrollY = 0;
				}

				if (var9.type == 0) {
					Tiles.revalidateWidgetScroll(var0, var9, var7);
				}
			}
		}

	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1054681020"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static final void method3045(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		FriendSystem.clientPreferences.updateSoundEffectVolume(var0);
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-63"
	)
	public static void method3004(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntIME(var3 ? Client.field429 : 0);
		var4.packetBuffer.writeShortLE(var1);
		var4.packetBuffer.writeByteAdd(var2);
		var4.packetBuffer.writeShort(var0);
		Client.packetWriter.addNode(var4);
	}
}
