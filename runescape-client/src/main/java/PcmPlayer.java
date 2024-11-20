import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 345218527
	)
	static int field290;
	@ObfuscatedName("ar")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 687257311
	)
	int field271;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -8650428406053831991L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 956781583
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2111148145
	)
	int field272;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1556577559
	)
	int field278;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -5829524424537205441L
	)
	long field270;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1177381797
	)
	int field280;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1393462973
	)
	int field288;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -545036419
	)
	int field282;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 7630540625139156427L
	)
	long field283;
	@ObfuscatedName("ag")
	boolean field284;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -270802039
	)
	int field286;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field287;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field274;

	protected PcmPlayer() {
		this.field271 = 32;
		this.timeMs = class59.method1150();
		this.field270 = 0L;
		this.field280 = 0;
		this.field288 = 0;
		this.field282 = 0;
		this.field283 = 0L;
		this.field284 = true;
		this.field286 = 0;
		this.field287 = new PcmStream[8];
		this.field274 = new PcmStream[8];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "379101543"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1474606388"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ae")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2140754315"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "-39583368"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-967936067"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class59.method1150();

			try {
				if (this.field270 != 0L) {
					if (var1 < this.field270) {
						return;
					}

					this.open(this.capacity);
					this.field270 = 0L;
					this.field284 = true;
				}

				int var3 = this.position();
				if (this.field282 - var3 > this.field280) {
					this.field280 = this.field282 - var3;
				}

				int var4 = this.field272 + this.field278;
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
					this.field284 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field278 = var4 - this.field272;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field283) {
					if (!this.field284) {
						if (this.field280 == 0 && this.field288 == 0) {
							this.close();
							this.field270 = 2000L + var1;
							return;
						}

						this.field278 = Math.min(this.field288, this.field280);
						this.field288 = this.field280;
					} else {
						this.field284 = false;
					}

					this.field280 = 0;
					this.field283 = 2000L + var1;
				}

				this.field282 = var3;
			} catch (Exception var7) {
				this.close();
				this.field270 = 2000L + var1;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / (DbTableType.field5406 * 1168272912));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	public final void method775() {
		this.field284 = true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1098615431"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field284 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field270 = class59.method1150() + 2000L;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (ApproximateRouteStrategy.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == ApproximateRouteStrategy.soundSystem.players[var2]) {
					ApproximateRouteStrategy.soundSystem.players[var2] = null;
				}

				if (ApproximateRouteStrategy.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class506.soundSystemExecutor.shutdownNow();
				class506.soundSystemExecutor = null;
				ApproximateRouteStrategy.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1416088123"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field286 -= var1;
		if (this.field286 < 0) {
			this.field286 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("bm")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (ItemContainer.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class451.clearIntArray(var1, 0, var3);
		this.field286 -= var2;
		if (this.stream != null && this.field286 <= 0) {
			this.field286 += DbTableType.field5406 * 1168272912 >> 4;
			GameEngine.PcmStream_disable(this.stream);
			this.method766(this.stream, this.stream.vmethod1032());
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
						PcmStream var11 = this.field287[var7];

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
									int var13 = var11.vmethod6753();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field271) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field341; var14 != null; var14 = var11.nextSubStream()) {
											this.method766(var14, var15 * var14.vmethod1032() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field287[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field274[var7] = var10;
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
				PcmStream var16 = this.field287[var6];
				PcmStream[] var17 = this.field287;
				this.field274[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field286 < 0) {
			this.field286 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class59.method1150();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lby;II)V",
		garbageValue = "1567688062"
	)
	final void method766(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field274[var3];
		if (var4 == null) {
			this.field287[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field274[var3] = var1;
		var1.field341 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "609180697"
	)
	public static boolean method815(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "255"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1143147486"
	)
	static final void method773() {
		if (Client.logoutTimer > 0) {
			GrandExchangeOfferOwnWorldComparator.logOut();
		} else {
			Client.timer.method8783();
			class31.updateGameState(40);
			class228.field2462 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
