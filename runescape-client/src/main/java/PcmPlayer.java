import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field1328;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1117250359
	)
	int field1322;
	@ObfuscatedName("al")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -578378229844875927L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -570055171
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1880300539
	)
	int field1316;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1941825805
	)
	int field1317;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = -8512824579973741295L
	)
	long field1318;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1794557445
	)
	int field1307;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -616751957
	)
	int field1324;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1593537969
	)
	int field1321;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 2365771317891820805L
	)
	long field1320;
	@ObfuscatedName("bk")
	boolean field1319;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -710098677
	)
	int field1311;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	PcmStream[] field1325;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	PcmStream[] field1326;

	protected PcmPlayer() {
		this.field1322 = 32;
		this.timeMs = ParamComposition.method4708();
		this.field1318 = 0L;
		this.field1307 = 0;
		this.field1324 = 0;
		this.field1321 = 0;
		this.field1320 = 0L;
		this.field1319 = true;
		this.field1311 = 0;
		this.field1325 = new PcmStream[8];
		this.field1326 = new PcmStream[8];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2147101588"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2034132374"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("an")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "1699658450"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "327716789"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = ParamComposition.method4708();

			try {
				if (this.field1318 != 0L) {
					if (var1 < this.field1318) {
						return;
					}

					this.open(this.capacity);
					this.field1318 = 0L;
					this.field1319 = true;
				}

				int var3 = this.position();
				if (this.field1321 - var3 > this.field1307) {
					this.field1307 = this.field1321 - var3;
				}

				int var4 = this.field1316 + this.field1317;
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
					this.field1319 = true;
					if (var4 + 512 > this.capacity) {
						var4 = this.capacity - 512;
						this.field1317 = var4 - this.field1316;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 512);
					this.write();
					var3 += 512;
				}

				if (var1 > this.field1320) {
					if (!this.field1319) {
						if (this.field1307 == 0 && this.field1324 == 0) {
							this.close();
							this.field1318 = 2000L + var1;
							return;
						}

						this.field1317 = Math.min(this.field1324, this.field1307);
						this.field1324 = this.field1307;
					} else {
						this.field1319 = false;
					}

					this.field1307 = 0;
					this.field1320 = 2000L + var1;
				}

				this.field1321 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1318 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(512);
					this.timeMs += (long)(512000 / (EnumComposition.field2063 * 1063377631));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2146577896"
	)
	public final void method3154() {
		this.field1319 = true;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1797961472"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1319 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1318 = ParamComposition.method4708() + 2000L;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403576355"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class372.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class372.soundSystem.players[var2]) {
					class372.soundSystem.players[var2] = null;
				}

				if (class372.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				Script.soundSystemExecutor.shutdownNow();
				Script.soundSystemExecutor = null;
				class372.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2124002911"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1311 -= var1;
		if (this.field1311 < 0) {
			this.field1311 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bb")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (FaceNormal.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class488.clearIntArray(var1, 0, var3);
		this.field1311 -= var2;
		if (this.stream != null && this.field1311 <= 0) {
			this.field1311 += EnumComposition.field2063 * 1063377631 >> 4;
			UrlRequest.PcmStream_disable(this.stream);
			this.method3159(this.stream, this.stream.vmethod3432());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label109:
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
						PcmStream var11 = this.field1325[var7];

						label103:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label103;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod7569();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1322) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1385; var14 != null; var14 = var11.nextSubStream()) {
											this.method3159(var14, var15 * var14.vmethod3432() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1325[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field1326[var7] = var10;
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
				PcmStream var17 = this.field1325[var6];
				PcmStream[] var18 = this.field1325;
				this.field1326[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field1311 < 0) {
			this.field1311 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ParamComposition.method4708();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ldn;II)V",
		garbageValue = "-390683352"
	)
	final void method3159(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1326[var3];
		if (var4 == null) {
			this.field1325[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1326[var3] = var1;
		var1.field1385 = var2;
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-722766257"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			class545.updateInterface(class226.widgetDefinition.Widget_interfaceComponents[var0], 0, class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
