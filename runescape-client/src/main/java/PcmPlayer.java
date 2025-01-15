import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 323263577
	)
	public static int field257;
	@ObfuscatedName("an")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ax")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1930587711
	)
	static int field275;
	@ObfuscatedName("af")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1358623715
	)
	int field261;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -9098802176499279333L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1048911801
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -474399613
	)
	int field263;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1729245287
	)
	int field265;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -3167251829314267789L
	)
	long field266;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1007287475
	)
	int field259;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 310071645
	)
	int field268;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 905456165
	)
	int field269;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 205761756168129153L
	)
	long field270;
	@ObfuscatedName("aj")
	boolean field271;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 940450061
	)
	int field272;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[Lbn;"
	)
	PcmStream[] field273;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lbn;"
	)
	PcmStream[] field274;

	protected PcmPlayer() {
		this.field261 = 32;
		this.timeMs = ReflectionCheck.method724();
		this.field266 = 0L;
		this.field259 = 0;
		this.field268 = 0;
		this.field269 = 0;
		this.field270 = 0L;
		this.field271 = true;
		this.field272 = 0;
		this.field273 = new PcmStream[8];
		this.field274 = new PcmStream[8];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-934813238"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2008767536"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1560665771"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("ao")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-376770394"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbn;I)V",
		garbageValue = "238570419"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = ReflectionCheck.method724();

			try {
				if (0L != this.field266) {
					if (var1 < this.field266) {
						return;
					}

					this.open(this.capacity);
					this.field266 = 0L;
					this.field271 = true;
				}

				int var3 = this.position();
				if (this.field269 - var3 > this.field259) {
					this.field259 = this.field269 - var3;
				}

				int var4 = this.field265 + this.field263;
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
					this.field271 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field265 = var4 - this.field263;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field270) {
					if (!this.field271) {
						if (this.field259 == 0 && this.field268 == 0) {
							this.close();
							this.field266 = 2000L + var1;
							return;
						}

						this.field265 = Math.min(this.field268, this.field259);
						this.field268 = this.field259;
					} else {
						this.field271 = false;
					}

					this.field259 = 0;
					this.field270 = 2000L + var1;
				}

				this.field269 = var3;
			} catch (Exception var7) {
				this.close();
				this.field266 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / field257);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1874859943"
	)
	public final void method807() {
		this.field271 = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19562"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field271 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field266 = ReflectionCheck.method724() + 2000L;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (DefaultsGroup.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == DefaultsGroup.soundSystem.players[var2]) {
					DefaultsGroup.soundSystem.players[var2] = null;
				}

				if (DefaultsGroup.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				DefaultsGroup.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-4852237"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field272 -= var1;
		if (this.field272 < 0) {
			this.field272 = 0;
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

		class451.clearIntArray(var1, 0, var3);
		this.field272 -= var2;
		if (this.stream != null && this.field272 <= 0) {
			this.field272 += field257 >> 4;
			class220.PcmStream_disable(this.stream);
			this.method812(this.stream, this.stream.vmethod1079());
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
						PcmStream var11 = this.field273[var7];

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
									int var13 = var11.vmethod6927();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field261) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field323; var14 != null; var14 = var11.nextSubStream()) {
											this.method812(var14, var15 * var14.vmethod1079() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field273[var7] = var18;
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
				PcmStream var16 = this.field273[var6];
				PcmStream[] var17 = this.field273;
				this.field274[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field272 < 0) {
			this.field272 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ReflectionCheck.method724();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lbn;II)V",
		garbageValue = "705422506"
	)
	final void method812(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field274[var3];
		if (var4 == null) {
			this.field273[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field274[var3] = var1;
		var1.field323 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "817321018"
	)
	public static String method857(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class232.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1488118055"
	)
	static final int method804(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIIIIILku;I)V",
		garbageValue = "-1915575984"
	)
	static final void method823(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9) {
		ObjectComposition var10 = class142.getObjectDefinition(var5);
		int var11 = var8 >= 0 ? var8 : var10.animationId;
		int var12;
		int var13;
		if (var6 != 1 && var6 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var3 + var12 <= var0.sizeX) {
			var14 = var3 + (var12 >> 1);
			var15 = var3 + (var12 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int var16;
		int var17;
		if (var13 + var4 <= var0.sizeY) {
			var16 = (var13 >> 1) + var4;
			var17 = var4 + (var13 + 1 >> 1);
		} else {
			var16 = var4;
			var17 = var4 + 1;
		}

		int[][] var18 = var0.tileHeights[var2];
		int var19 = var18[var15][var17] + var18[var14][var17] + var18[var14][var16] + var18[var15][var16] >> 2;
		int var20 = (var3 << 7) + (var12 << 6);
		int var21 = (var4 << 7) + (var13 << 6);
		Scene var22 = var0.scene;
		long var23 = Projectile.calculateTag(var3, var4, 2, var10.int1 == 0, var5, var0.id);
		int var25 = (var6 << 6) + var7;
		if (var10.int3 == 1) {
			var25 += 256;
		}

		Object var33;
		if (var7 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(22, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			var22.newFloorDecoration(var1, var3, var4, var19, (Renderable)var33, var23, var25);
			if (var10.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.method4184(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
				}

			} else if (var7 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(0, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1028[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5797(var3, var4, var7, var6, var10.boolean1);
				}

			} else if (var7 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(1, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1034[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5797(var3, var4, var7, var6, var10.boolean1);
				}

			} else {
				int var26;
				if (var7 == 2) {
					var26 = var6 + 1 & 3;
					Object var28;
					Object var34;
					if (var11 == -1 && var10.transforms == null) {
						var34 = var10.getModel(2, var6 + 4, var18, var20, var19, var21);
						var28 = var10.getModel(2, var26, var18, var20, var19, var21);
					} else {
						var34 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						var28 = new DynamicObject(var0, var5, 2, var26, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var34, (Renderable)var28, Tiles.field1028[var6], Tiles.field1028[var26], var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5797(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(3, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1034[var6], 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5797(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.method4184(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
					}

				} else if (var7 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(4, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1028[var6], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var7 == 5) {
						var26 = 16;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = class142.getObjectDefinition(class360.Entity_unpackID(var27)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, Tiles.field1028[var6], 0, Tiles.field1031[var6] * var26, Tiles.field1036[var6] * var26, var23, var25);
					} else if (var7 == 6) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = class142.getObjectDefinition(class360.Entity_unpackID(var27)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, 256, var6, Tiles.field1037[var6] * var26, Tiles.field1038[var6] * var26, var23, var25);
					} else if (var7 == 7) {
						int var32 = var6 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var33 = var10.getModel(4, var32 + 4, var18, var20, var19, var21);
						} else {
							var33 = new DynamicObject(var0, var5, 4, var32 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, 256, var32, 0, 0, var23, var25);
					} else if (var7 == 8) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (var27 != 0L) {
							var26 = class142.getObjectDefinition(class360.Entity_unpackID(var27)).int2 / 2;
						}

						int var31 = var6 + 2 & 3;
						Object var30;
						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
							var30 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
							var30 = new DynamicObject(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)var30, 256, var6, Tiles.field1037[var6] * var26, Tiles.field1038[var6] * var26, var23, var25);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(10, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			if (var33 != null) {
				var22.method4184(var1, var3, var4, var19, var12, var13, (Renderable)var33, var7 == 11 ? 256 : 0, var23, var25);
			}

			if (var10.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
			}

		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIII)V",
		garbageValue = "218938967"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = FaceNormal.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var8.id != var15.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = Projectile.calculateTag(var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, Canvas.getTileHeight(var0, Coord.method6980(var2), Coord.method6980(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
