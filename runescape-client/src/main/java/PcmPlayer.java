import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -500997329
	)
	public static int field284;
	@ObfuscatedName("ac")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ak")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1534333207
	)
	int field278;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -5611652952088623753L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2141083595
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2045880779
	)
	int field281;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 251325185
	)
	int field276;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 2753549089867696485L
	)
	long field283;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -734447677
	)
	int field270;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -14446123
	)
	int field288;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1895303233
	)
	int field273;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5279302234725720239L
	)
	long field286;
	@ObfuscatedName("al")
	boolean field285;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2027757779
	)
	int field290;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	PcmStream[] field291;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	PcmStream[] field292;

	protected PcmPlayer() {
		this.field278 = 32;
		this.timeMs = InterfaceParent.method2434();
		this.field283 = 0L;
		this.field270 = 0;
		this.field288 = 0;
		this.field273 = 0;
		this.field286 = 0L;
		this.field285 = true;
		this.field290 = 0;
		this.field291 = new PcmStream[8];
		this.field292 = new PcmStream[8];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "245"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "861527567"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ad")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1363359635"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "848421867"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lbr;B)V",
		garbageValue = "109"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = InterfaceParent.method2434();

			try {
				if (this.field283 != 0L) {
					if (var1 < this.field283) {
						return;
					}

					this.open(this.capacity);
					this.field283 = 0L;
					this.field285 = true;
				}

				int var3 = this.position();
				if (this.field273 - var3 > this.field270) {
					this.field270 = this.field273 - var3;
				}

				int var4 = this.field281 + this.field276;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field285 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field276 = var4 - this.field281;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field286) {
					if (!this.field285) {
						if (this.field270 == 0 && this.field288 == 0) {
							this.close();
							this.field283 = 2000L + var1;
							return;
						}

						this.field276 = Math.min(this.field288, this.field270);
						this.field288 = this.field270;
					} else {
						this.field285 = false;
					}

					this.field270 = 0;
					this.field286 = 2000L + var1;
				}

				this.field273 = var3;
			} catch (Exception var7) {
				this.close();
				this.field283 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / field284);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	public final void method754() {
		this.field285 = true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "535755660"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field285 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field283 = InterfaceParent.method2434() + 2000L;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-302071928"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (NpcOverrides.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == NpcOverrides.soundSystem.players[var2]) {
					NpcOverrides.soundSystem.players[var2] = null;
				}

				if (NpcOverrides.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class7.soundSystemExecutor.shutdownNow();
				class7.soundSystemExecutor = null;
				NpcOverrides.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1324860690"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field290 -= var1;
		if (this.field290 < 0) {
			this.field290 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bo")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class467.clearIntArray(var1, 0, var3);
		this.field290 -= var2;
		if (this.stream != null && this.field290 <= 0) {
			this.field290 += field284 >> 4;
			FloatProjection.PcmStream_disable(this.stream);
			this.method814(this.stream, this.stream.vmethod1025());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field291[var7];

						label102:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod6801();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field278) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field343; var14 != null; var14 = var11.nextSubStream()) {
											this.method814(var14, var15 * var14.vmethod1025() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field291[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field292[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field291[var6];
				PcmStream[] var17 = this.field291;
				this.field292[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field290 < 0) {
			this.field290 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = InterfaceParent.method2434();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lbr;II)V",
		garbageValue = "-1921349760"
	)
	final void method814(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field292[var3];
		if (var4 == null) {
			this.field291[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field292[var3] = var1;
		var1.field343 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1661990349"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1948662373"
	)
	public static final boolean method789(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}
}
