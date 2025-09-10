import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 693833959
	)
	public static int field1356;
	@ObfuscatedName("an")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ar")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1355482381
	)
	int field1336;
	@ObfuscatedName("av")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2794022698036299117L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 571666051
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -490672071
	)
	public int field1345;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -845807563
	)
	int field1342;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 7196506120071067069L
	)
	long field1348;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -983132915
	)
	int field1349;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1896259297
	)
	int field1347;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2049147503
	)
	int field1351;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = 5148925342675147023L
	)
	long field1352;
	@ObfuscatedName("bd")
	boolean field1353;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1002055695
	)
	int field1354;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	PcmStream[] field1355;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	PcmStream[] field1343;

	static {
		field1356 = 44100;
	}

	public PcmPlayer() {
		this.field1336 = 32;
		this.timeMs = class189.method4284();
		this.field1348 = 0L;
		this.field1349 = 0;
		this.field1347 = 0;
		this.field1351 = 0;
		this.field1352 = 0L;
		this.field1353 = true;
		this.field1354 = 0;
		this.field1355 = new PcmStream[8];
		this.field1343 = new PcmStream[8];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1247260340"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-6"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ac")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1150401319"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1549248030"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lef;I)V",
		garbageValue = "-632427995"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26984"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class189.method4284();

			try {
				if (this.field1348 != 0L) {
					if (var1 < this.field1348) {
						return;
					}

					this.open(this.capacity);
					this.field1348 = 0L;
					this.field1353 = true;
				}

				int var3 = this.position();
				if (this.field1351 - var3 > this.field1349) {
					this.field1349 = this.field1351 - var3;
				}

				int var4 = this.field1342 + this.field1345;
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
					this.field1353 = true;
					if (var4 + 512 > this.capacity) {
						var4 = this.capacity - 512;
						this.field1342 = var4 - this.field1345;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 512);
					this.write();
					var3 += 512;
				}

				if (var1 > this.field1352) {
					if (!this.field1353) {
						if (this.field1349 == 0 && this.field1347 == 0) {
							this.close();
							this.field1348 = 2000L + var1;
							return;
						}

						this.field1342 = Math.min(this.field1347, this.field1349);
						this.field1347 = this.field1349;
					} else {
						this.field1353 = false;
					}

					this.field1349 = 0;
					this.field1352 = var1 + 2000L;
				}

				this.field1351 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1348 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(512);
					this.timeMs += (long)(512000 / field1356);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	public final void method3049() {
		this.field1353 = true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1093865024"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1353 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1348 = class189.method4284() + 2000L;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1799762007"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (FloorDecoration.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == FloorDecoration.soundSystem.players[var2]) {
					FloorDecoration.soundSystem.players[var2] = null;
				}

				if (FloorDecoration.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				FloorDecoration.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1045776317"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1354 -= var1;
		if (this.field1354 < 0) {
			this.field1354 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bt")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class480.clearIntArray(var1, 0, var3);
		this.field1354 -= var2;
		if (this.stream != null && this.field1354 <= 0) {
			this.field1354 += field1356 >> 4;
			class1.PcmStream_disable(this.stream);
			this.method3093(this.stream, this.stream.vmethod3324());
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
						PcmStream var11 = this.field1355[var7];

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
									int var13 = var11.vmethod7364();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1336) {
										break label110;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1413; var14 != null; var14 = var11.nextSubStream()) {
											this.method3093(var14, var15 * var14.vmethod3324() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1355[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field1343[var7] = var10;
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
				PcmStream var17 = this.field1355[var6];
				PcmStream[] var18 = this.field1355;
				this.field1343[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field1354 < 0) {
			this.field1354 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class189.method4284();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lef;II)V",
		garbageValue = "1048424017"
	)
	final void method3093(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1343[var3];
		if (var4 == null) {
			this.field1355[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1343[var3] = var1;
		var1.field1413 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lim;",
		garbageValue = "1437975445"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
