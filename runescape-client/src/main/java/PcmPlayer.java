import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("au")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1694622953
	)
	int field257;
	@ObfuscatedName("ag")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 292651709243809261L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1500169139
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -329411365
	)
	public int field262;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1732822685
	)
	int field263;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -3827437408960176321L
	)
	long field269;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1187634117
	)
	int field256;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1625507999
	)
	int field260;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 960127777
	)
	int field267;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -7502829623985839491L
	)
	long field268;
	@ObfuscatedName("bl")
	boolean field258;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 189581425
	)
	int field270;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field271;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field272;

	public PcmPlayer() {
		this.field257 = 32;
		this.timeMs = class282.method5908();
		this.field269 = 0L;
		this.field256 = 0;
		this.field260 = 0;
		this.field267 = 0;
		this.field268 = 0L;
		this.field258 = true;
		this.field270 = 0;
		this.field271 = new PcmStream[8];
		this.field272 = new PcmStream[8];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "371106903"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2095179300"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "477517260"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("af")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "-2083423702"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class282.method5908();

			try {
				if (0L != this.field269) {
					if (var1 < this.field269) {
						return;
					}

					this.open(this.capacity);
					this.field269 = 0L;
					this.field258 = true;
				}

				int var3 = this.position();
				if (this.field267 - var3 > this.field256) {
					this.field256 = this.field267 - var3;
				}

				int var4 = this.field262 + this.field263;
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
					this.field258 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field263 = var4 - this.field262;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field268) {
					if (!this.field258) {
						if (this.field256 == 0 && this.field260 == 0) {
							this.close();
							this.field269 = 2000L + var1;
							return;
						}

						this.field263 = Math.min(this.field260, this.field256);
						this.field260 = this.field256;
					} else {
						this.field258 = false;
					}

					this.field256 = 0;
					this.field268 = 2000L + var1;
				}

				this.field267 = var3;
			} catch (Exception var7) {
				this.close();
				this.field269 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / (class4.field7 * -70401264));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-339381266"
	)
	public final void method789() {
		this.field258 = true;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103885551"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field258 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field269 = class282.method5908() + 2000L;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-405431179"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Calendar.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == Calendar.soundSystem.players[var2]) {
					Calendar.soundSystem.players[var2] = null;
				}

				if (Calendar.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				FadeOutTask.soundSystemExecutor.shutdownNow();
				FadeOutTask.soundSystemExecutor = null;
				Calendar.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "23625"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field270 -= var1;
		if (this.field270 < 0) {
			this.field270 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bw")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class467.clearIntArray(var1, 0, var3);
		this.field270 -= var2;
		if (this.stream != null && this.field270 <= 0) {
			this.field270 += class4.field7 * -70401264 >> 4;
			GameEngine.PcmStream_disable(this.stream);
			this.method794(this.stream, this.stream.vmethod1046());
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
						PcmStream var11 = this.field271[var7];

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
									int var13 = var11.vmethod6832();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field257) {
										break label110;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field332; var14 != null; var14 = var11.nextSubStream()) {
											this.method794(var14, var15 * var14.vmethod1046() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field271[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field272[var7] = var10;
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
				PcmStream var17 = this.field271[var6];
				PcmStream[] var18 = this.field271;
				this.field272[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field270 < 0) {
			this.field270 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class282.method5908();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lby;IB)V",
		garbageValue = "-12"
	)
	final void method794(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field272[var3];
		if (var4 == null) {
			this.field271[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field272[var3] = var1;
		var1.field332 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1948102363"
	)
	static int method841(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-861203619"
	)
	public static void method842() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1945651119"
	)
	static void method819() {
		Client.field532 = Client.localPlayerIndex;
		ItemContainer.USERNAME_PASSWORD = class377.field4189;
		Client.field668 = -1;
	}
}
