import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1257452427
	)
	int field1339;
	@ObfuscatedName("an")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -5822858535774240801L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -146500833
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 659462219
	)
	public int field1347;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -703509567
	)
	int field1345;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = -5681891283777824583L
	)
	long field1346;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1051017555
	)
	int field1348;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 126538265
	)
	int field1357;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1384381411
	)
	int field1337;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = 384285537490111735L
	)
	long field1350;
	@ObfuscatedName("by")
	boolean field1353;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1581403357
	)
	int field1352;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Ldw;"
	)
	PcmStream[] field1344;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[Ldw;"
	)
	PcmStream[] field1358;

	public PcmPlayer() {
		this.field1339 = 32;
		this.timeMs = class281.method6373();
		this.field1346 = 0L;
		this.field1348 = 0;
		this.field1357 = 0;
		this.field1337 = 0;
		this.field1350 = 0L;
		this.field1353 = true;
		this.field1352 = 0;
		this.field1344 = new PcmStream[8];
		this.field1358 = new PcmStream[8];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1092358971"
	)
	@Export("init")
	public void init() throws Exception {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "219"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "57"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)V",
		garbageValue = "-10"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100049450"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class281.method6373();

			try {
				if (0L != this.field1346) {
					if (var1 < this.field1346) {
						return;
					}

					this.open(this.capacity);
					this.field1346 = 0L;
					this.field1353 = true;
				}

				int var3 = this.position();
				if (this.field1337 - var3 > this.field1348) {
					this.field1348 = this.field1337 - var3;
				}

				int var4 = this.field1345 + this.field1347;
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
						this.field1345 = var4 - this.field1347;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 512);
					this.write();
					var3 += 512;
				}

				if (var1 > this.field1350) {
					if (!this.field1353) {
						if (this.field1348 == 0 && this.field1357 == 0) {
							this.close();
							this.field1346 = 2000L + var1;
							return;
						}

						this.field1345 = Math.min(this.field1357, this.field1348);
						this.field1357 = this.field1348;
					} else {
						this.field1353 = false;
					}

					this.field1348 = 0;
					this.field1350 = 2000L + var1;
				}

				this.field1337 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1346 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(512);
					this.timeMs += (long)(512000 / (class349.field4014 * -304735216));
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	public final void method3142() {
		this.field1353 = true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1083235953"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1353 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1346 = class281.method6373() + 2000L;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2135672301"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class454.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class454.soundSystem.players[var2]) {
					class454.soundSystem.players[var2] = null;
				}

				if (class454.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class146.soundSystemExecutor.shutdownNow();
				class146.soundSystemExecutor = null;
				class454.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-127"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1352 -= var1;
		if (this.field1352 < 0) {
			this.field1352 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ba")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (DelayFadeTask.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class478.clearIntArray(var1, 0, var3);
		this.field1352 -= var2;
		if (this.stream != null && this.field1352 <= 0) {
			this.field1352 += class349.field4014 * -304735216 >> 4;
			PlayerUpdateManager.PcmStream_disable(this.stream);
			this.method3184(this.stream, this.stream.vmethod3401());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label112:
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
						PcmStream var11 = this.field1344[var7];

						label106:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label106;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod7359();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1339) {
										break label112;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1413; var14 != null; var14 = var11.nextSubStream()) {
											this.method3184(var14, var15 * var14.vmethod3401() >> 8);
										}
									}

									PcmStream var16 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1344[var7] = var16;
									} else {
										var10.after = var16;
									}

									if (var16 == null) {
										this.field1358[var7] = var10;
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
				PcmStream var17 = this.field1344[var6];
				PcmStream[] var18 = this.field1344;
				this.field1358[var6] = null;

				for (var18[var6] = null; var17 != null; var17 = var10) {
					var10 = var17.after;
					var17.after = null;
				}
			}
		}

		if (this.field1352 < 0) {
			this.field1352 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class281.method6373();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ldw;II)V",
		garbageValue = "684883677"
	)
	final void method3184(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1358[var3];
		if (var4 == null) {
			this.field1344[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1358[var3] = var1;
		var1.field1413 = var2;
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "319658096"
	)
	static final void method3149(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class341.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method4121()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + WorldMapArea.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
