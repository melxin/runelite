import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("av")
	int field1365;
	@ObfuscatedName("at")
	int field1383;
	@ObfuscatedName("ag")
	int field1366;
	@ObfuscatedName("an")
	int field1367;
	@ObfuscatedName("ae")
	int field1368;
	@ObfuscatedName("aj")
	int field1377;
	@ObfuscatedName("ak")
	int field1370;
	@ObfuscatedName("aw")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ap")
	@Export("start")
	int start;
	@ObfuscatedName("ay")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	boolean field1374;
	@ObfuscatedName("az")
	int field1375;
	@ObfuscatedName("ad")
	int field1376;
	@ObfuscatedName("ai")
	int field1378;
	@ObfuscatedName("as")
	int field1382;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public class343 field1379;
	@ObfuscatedName("ab")
	public long field1364;
	@ObfuscatedName("ax")
	public int field1381;
	@ObfuscatedName("ar")
	public int field1380;
	@ObfuscatedName("ah")
	public int field1369;

	@ObfuscatedSignature(
		descriptor = "(Ldq;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		this.field1379 = class343.field3891;
		this.field1364 = 0L;
		this.field1381 = 0;
		this.field1380 = 0;
		this.field1369 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1374 = var1.field1297;
		this.field1383 = var2;
		this.field1366 = var3;
		this.field1367 = 8192;
		this.field1365 = 0;
		this.method3381();
	}

	@ObfuscatedSignature(
		descriptor = "(Ldq;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		this.field1379 = class343.field3891;
		this.field1364 = 0L;
		this.field1381 = 0;
		this.field1380 = 0;
		this.field1369 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1374 = var1.field1297;
		this.field1383 = var2;
		this.field1366 = var3;
		this.field1367 = var4;
		this.field1365 = 0;
		this.method3381();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aw")
	protected int vmethod7569() {
		return this.field1366 == 0 && this.field1375 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ap")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1366 == 0 && this.field1375 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field1365 < 0) {
				if (this.field1383 <= 0) {
					this.method3295();
					this.remove();
					return;
				}

				this.field1365 = 0;
			}

			if (this.field1365 >= var7) {
				if (this.field1383 >= 0) {
					this.method3295();
					this.remove();
					return;
				}

				this.field1365 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1374) {
					if (this.field1383 < 0) {
						var9 = this.method3309(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1365 >= var5) {
							return;
						}

						this.field1365 = var5 + var5 - 1 - this.field1365;
						this.field1383 = -this.field1383;
					}

					while (true) {
						var9 = this.method3419(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1365 < var6) {
							return;
						}

						this.field1365 = var6 + var6 - 1 - this.field1365;
						this.field1383 = -this.field1383;
						var9 = this.method3309(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1365 >= var5) {
							return;
						}

						this.field1365 = var5 + var5 - 1 - this.field1365;
						this.field1383 = -this.field1383;
					}
				} else if (this.field1383 < 0) {
					while (true) {
						var9 = this.method3309(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1365 >= var5) {
							return;
						}

						this.field1365 = var6 - 1 - (var6 - 1 - this.field1365) % var8;
					}
				} else {
					while (true) {
						var9 = this.method3419(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1365 < var6) {
							return;
						}

						this.field1365 = var5 + (this.field1365 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1374) {
						label141: {
							if (this.field1383 < 0) {
								var9 = this.method3309(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1365 >= var5) {
									return;
								}

								this.field1365 = var5 + var5 - 1 - this.field1365;
								this.field1383 = -this.field1383;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method3419(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1365 < var6) {
									return;
								}

								this.field1365 = var6 + var6 - 1 - this.field1365;
								this.field1383 = -this.field1383;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method3309(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1365 >= var5) {
									return;
								}

								this.field1365 = var5 + var5 - 1 - this.field1365;
								this.field1383 = -this.field1383;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1383 < 0) {
							while (true) {
								var9 = this.method3309(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1365 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1365) / var8;
								if (var10 >= this.numLoops) {
									this.field1365 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1365 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method3419(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1365 < var6) {
									return;
								}

								var10 = (this.field1365 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1365 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1365 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1383 < 0) {
					this.method3309(var1, var9, 0, var3, 0);
					if (this.field1365 < 0) {
						this.field1365 = -1;
						this.method3295();
						this.remove();
					}
				} else {
					this.method3419(var1, var9, var7, var3, 0);
					if (this.field1365 >= var7) {
						this.field1365 = var7;
						this.method3295();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1375 > 0) {
			if (var1 >= this.field1375) {
				if (this.field1366 == Integer.MIN_VALUE) {
					this.field1366 = 0;
					this.field1370 = 0;
					this.field1377 = 0;
					this.field1368 = 0;
					this.remove();
					var1 = this.field1375;
				}

				this.field1375 = 0;
				this.method3381();
			} else {
				this.field1368 += this.field1376 * var1;
				this.field1377 += this.field1378 * var1;
				this.field1370 += this.field1382 * var1;
				this.field1375 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field1365 < 0) {
			if (this.field1383 <= 0) {
				this.method3295();
				this.remove();
				return;
			}

			this.field1365 = 0;
		}

		if (this.field1365 >= var5) {
			if (this.field1383 >= 0) {
				this.method3295();
				this.remove();
				return;
			}

			this.field1365 = var5 - 1;
		}

		this.field1365 += this.field1383 * var1;
		if (this.numLoops < 0) {
			if (!this.field1374) {
				if (this.field1383 < 0) {
					if (this.field1365 >= var3) {
						return;
					}

					this.field1365 = var4 - 1 - (var4 - 1 - this.field1365) % var6;
				} else {
					if (this.field1365 < var4) {
						return;
					}

					this.field1365 = var3 + (this.field1365 - var3) % var6;
				}

			} else {
				if (this.field1383 < 0) {
					if (this.field1365 >= var3) {
						return;
					}

					this.field1365 = var3 + var3 - 1 - this.field1365;
					this.field1383 = -this.field1383;
				}

				while (this.field1365 >= var4) {
					this.field1365 = var4 + var4 - 1 - this.field1365;
					this.field1383 = -this.field1383;
					if (this.field1365 >= var3) {
						return;
					}

					this.field1365 = var3 + var3 - 1 - this.field1365;
					this.field1383 = -this.field1383;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1374) {
					label143: {
						if (this.field1383 < 0) {
							if (this.field1365 >= var3) {
								return;
							}

							this.field1365 = var3 + var3 - 1 - this.field1365;
							this.field1383 = -this.field1383;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field1365 < var4) {
								return;
							}

							this.field1365 = var4 + var4 - 1 - this.field1365;
							this.field1383 = -this.field1383;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1365 >= var3) {
								return;
							}

							this.field1365 = var3 + var3 - 1 - this.field1365;
							this.field1383 = -this.field1383;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1383 < 0) {
						if (this.field1365 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1365) / var6;
						if (var7 < this.numLoops) {
							this.field1365 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1365 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1365 < var4) {
							return;
						}

						var7 = (this.field1365 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1365 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1365 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1383 < 0) {
				if (this.field1365 < 0) {
					this.field1365 = -1;
					this.method3295();
					this.remove();
				}
			} else if (this.field1365 >= var5) {
				this.field1365 = var5;
				this.method3295();
				this.remove();
			}

		}
	}

	@ObfuscatedName("aq")
	void method3381() {
		this.field1368 = this.field1366;
		this.field1377 = method3264(this.field1366, this.field1367);
		this.field1370 = method3310(this.field1366, this.field1367);
	}

	@ObfuscatedName("be")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bm")
	synchronized void method3286(int var1, int var2) {
		this.field1366 = var1;
		this.field1367 = var2;
		this.field1375 = 0;
		this.method3381();
	}

	@ObfuscatedName("bp")
	public synchronized int method3287() {
		return this.field1366 == Integer.MIN_VALUE ? 0 : this.field1366 + 32 >> 6;
	}

	@ObfuscatedName("bt")
	public synchronized void method3288(int var1) {
		this.method3286(var1 << 6, this.method3291());
	}

	@ObfuscatedName("ba")
	public synchronized int method3293() {
		return this.field1366 == Integer.MIN_VALUE ? 0 : this.field1366;
	}

	@ObfuscatedName("bi")
	synchronized void method3328(int var1) {
		this.method3286(var1, this.method3291());
	}

	@ObfuscatedName("by")
	public synchronized int method3291() {
		return this.field1367 < 0 ? -1 : this.field1367;
	}

	@ObfuscatedName("bn")
	int vmethod3432() {
		int var1 = this.field1368 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1365 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bd")
	public int method3292() {
		RawSound var1 = (RawSound)super.sound;
		return (int)((double)var1.samples.length * 1000.0D / (double)var1.sampleRate);
	}

	@ObfuscatedName("br")
	public synchronized void method3425(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1365 = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method3407() {
		this.field1383 = (this.field1383 ^ this.field1383 >> 31) + (this.field1383 >>> 31);
		this.field1383 = -this.field1383;
	}

	@ObfuscatedName("bl")
	void method3295() {
		if (this.field1375 != 0) {
			if (this.field1366 == Integer.MIN_VALUE) {
				this.field1366 = 0;
			}

			this.field1375 = 0;
			this.method3381();
		}

	}

	@ObfuscatedName("bc")
	public synchronized void method3296(int var1, int var2) {
		this.method3297(var1, var2, this.method3291());
	}

	@ObfuscatedName("bq")
	public synchronized void method3297(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method3286(var2, var3);
		} else {
			int var4 = method3264(var2, var3);
			int var5 = method3310(var2, var3);
			if (var4 == this.field1377 && var5 == this.field1370) {
				this.field1375 = 0;
			} else {
				int var6 = var2 - this.field1368;
				if (this.field1368 - var2 > var6) {
					var6 = this.field1368 - var2;
				}

				if (var4 - this.field1377 > var6) {
					var6 = var4 - this.field1377;
				}

				if (this.field1377 - var4 > var6) {
					var6 = this.field1377 - var4;
				}

				if (var5 - this.field1370 > var6) {
					var6 = var5 - this.field1370;
				}

				if (this.field1370 - var5 > var6) {
					var6 = this.field1370 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1375 = var1;
				this.field1366 = var2;
				this.field1367 = var3;
				this.field1376 = (var2 - this.field1368) / var1;
				this.field1378 = (var4 - this.field1377) / var1;
				this.field1382 = (var5 - this.field1370) / var1;
			}
		}
	}

	@ObfuscatedName("bx")
	public synchronized void method3298(int var1) {
		if (var1 == 0) {
			this.method3328(0);
			this.remove();
		} else if (this.field1377 == 0 && this.field1370 == 0) {
			this.field1375 = 0;
			this.field1366 = 0;
			this.field1368 = 0;
			this.remove();
		} else {
			int var2 = -this.field1368;
			if (this.field1368 > var2) {
				var2 = this.field1368;
			}

			if (-this.field1377 > var2) {
				var2 = -this.field1377;
			}

			if (this.field1377 > var2) {
				var2 = this.field1377;
			}

			if (-this.field1370 > var2) {
				var2 = -this.field1370;
			}

			if (this.field1370 > var2) {
				var2 = this.field1370;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1375 = var1;
			this.field1366 = Integer.MIN_VALUE;
			this.field1376 = -this.field1368 / var1;
			this.field1378 = -this.field1377 / var1;
			this.field1382 = -this.field1370 / var1;
		}
	}

	@ObfuscatedName("bv")
	public synchronized int method3388() {
		return this.field1383 < 0 ? -this.field1383 : this.field1383;
	}

	@ObfuscatedName("ch")
	public synchronized void method3300(int var1) {
		if (this.field1383 < 0) {
			this.field1383 = -var1;
		} else {
			this.field1383 = var1;
		}

	}

	@ObfuscatedName("ce")
	public boolean method3301() {
		return this.field1365 < 0 || this.field1365 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("cu")
	public boolean method3382() {
		return this.field1375 != 0;
	}

	@ObfuscatedName("ct")
	int method3419(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1375 > 0) {
				int var6 = var2 + this.field1375;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1375 += var2;
				if (this.field1383 == 256 && (this.field1365 & 255) == 0) {
					if (FaceNormal.PcmPlayer_stereo) {
						var2 = method3276(0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, this.field1378, this.field1382, 0, var6, var3, this);
					} else {
						var2 = method3275(((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, this.field1376, 0, var6, var3, this);
					}
				} else if (FaceNormal.PcmPlayer_stereo) {
					var2 = method3289(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, this.field1378, this.field1382, 0, var6, var3, this, this.field1383, var5);
				} else {
					var2 = method3353(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, this.field1376, 0, var6, var3, this, this.field1383, var5);
				}

				this.field1375 -= var2;
				if (this.field1375 != 0) {
					return var2;
				}

				if (!this.method3402()) {
					continue;
				}

				return var4;
			}

			if (this.field1383 == 256 && (this.field1365 & 255) == 0) {
				if (FaceNormal.PcmPlayer_stereo) {
					return method3269(0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, 0, var4, var3, this, ((RawSound)super.sound).method3138());
				}

				return method3268(((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, 0, var4, var3, this);
			}

			if (FaceNormal.PcmPlayer_stereo) {
				return method3422(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, 0, var4, var3, this, this.field1383, var5);
			}

			return method3272(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, 0, var4, var3, this, this.field1383, var5);
		}
	}

	@ObfuscatedName("cm")
	int method3309(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1375 > 0) {
				int var6 = var2 + this.field1375;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1375 += var2;
				if (this.field1383 == -256 && (this.field1365 & 255) == 0) {
					if (FaceNormal.PcmPlayer_stereo) {
						var2 = method3404(0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, this.field1378, this.field1382, 0, var6, var3, this);
					} else {
						var2 = method3277(((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, this.field1376, 0, var6, var3, this);
					}
				} else if (FaceNormal.PcmPlayer_stereo) {
					var2 = method3263(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, this.field1378, this.field1382, 0, var6, var3, this, this.field1383, var5);
				} else {
					var2 = method3323(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, this.field1376, 0, var6, var3, this, this.field1383, var5);
				}

				this.field1375 -= var2;
				if (this.field1375 != 0) {
					return var2;
				}

				if (!this.method3402()) {
					continue;
				}

				return var4;
			}

			if (this.field1383 == -256 && (this.field1365 & 255) == 0) {
				if (FaceNormal.PcmPlayer_stereo) {
					return method3271(0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, 0, var4, var3, this);
				}

				return method3270(((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, 0, var4, var3, this);
			}

			if (FaceNormal.PcmPlayer_stereo) {
				return method3274(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1377, this.field1370, 0, var4, var3, this, this.field1383, var5);
			}

			return method3279(0, 0, ((RawSound)super.sound).samples, var1, this.field1365, var2, this.field1368, 0, var4, var3, this, this.field1383, var5);
		}
	}

	@ObfuscatedName("cb")
	boolean method3402() {
		int var1 = this.field1366;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method3264(var1, this.field1367);
			var3 = method3310(var1, this.field1367);
		}

		if (var1 == this.field1368 && var2 == this.field1377 && var3 == this.field1370) {
			if (this.field1366 == Integer.MIN_VALUE) {
				this.field1366 = 0;
				this.field1370 = 0;
				this.field1377 = 0;
				this.field1368 = 0;
				this.remove();
				return true;
			} else {
				this.method3381();
				return false;
			}
		} else {
			if (this.field1368 < var1) {
				this.field1376 = 1;
				this.field1375 = var1 - this.field1368;
			} else if (this.field1368 > var1) {
				this.field1376 = -1;
				this.field1375 = this.field1368 - var1;
			} else {
				this.field1376 = 0;
			}

			if (this.field1377 < var2) {
				this.field1378 = 1;
				if (this.field1375 == 0 || this.field1375 > var2 - this.field1377) {
					this.field1375 = var2 - this.field1377;
				}
			} else if (this.field1377 > var2) {
				this.field1378 = -1;
				if (this.field1375 == 0 || this.field1375 > this.field1377 - var2) {
					this.field1375 = this.field1377 - var2;
				}
			} else {
				this.field1378 = 0;
			}

			if (this.field1370 < var3) {
				this.field1382 = 1;
				if (this.field1375 == 0 || this.field1375 > var3 - this.field1370) {
					this.field1375 = var3 - this.field1370;
				}
			} else if (this.field1370 > var3) {
				this.field1382 = -1;
				if (this.field1375 == 0 || this.field1375 > this.field1370 - var3) {
					this.field1375 = this.field1370 - var3;
				}
			} else {
				this.field1382 = 0;
			}

			return false;
		}
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("av")
	static int method3264(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("at")
	static int method3310(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldq;II)Ldk;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(EnumComposition.field2063 * -1036419300)), var2 << 6) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldq;III)Ldk;"
	)
	public static RawPcmStream method3267(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdk;)I"
	)
	static int method3268(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field1365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdk;Z)I"
	)
	static int method3269(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;
		var7 -= 6;
		short var12;
		int var10001;
		if (var11) {
			while (var4 < var7) {
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 << 2;
				var10001 = var4++;
				var2[var10001] += var12 * var6 << 2;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 << 2;
				var10001 = var4++;
				var2[var10001] += var12 * var6 << 2;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 << 2;
				var10001 = var4++;
				var2[var10001] += var12 * var6 << 2;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 << 2;
				var10001 = var4++;
				var2[var10001] += var12 * var6 << 2;
			}

			for (var7 += 6; var4 < var7; var2[var10001] += var12 * var6 << 2) {
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 << 2;
				var10001 = var4++;
			}
		} else {
			while (var4 < var7) {
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 >> 6;
				var10001 = var4++;
				var2[var10001] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 >> 6;
				var10001 = var4++;
				var2[var10001] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 >> 6;
				var10001 = var4++;
				var2[var10001] += var12 * var6 >> 6;
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 >> 6;
				var10001 = var4++;
				var2[var10001] += var12 * var6 >> 6;
			}

			for (var7 += 6; var4 < var7; var2[var10001] += var12 * var6 >> 6) {
				var12 = var1[var3++];
				var10001 = var4++;
				var2[var10001] += var12 * var5 >> 6;
				var10001 = var4++;
			}
		}

		var10.field1365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdk;)I"
	)
	static int method3270(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field1365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdk;)I"
	)
	static int method3271(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		short var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6 >> 6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5 >> 6;
			var10001 = var4++;
			var2[var10001] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5 >> 6;
			var10001 = var4++;
			var2[var10001] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5 >> 6;
			var10001 = var4++;
			var2[var10001] += var11 * var6 >> 6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5 >> 6;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6 >> 6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5 >> 6;
			var10001 = var4++;
		}

		var10.field1365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdk;II)I"
	)
	static int method3272(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		short var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1365 = var4;
		return var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdk;II)I"
	)
	static int method3422(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		short var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = var14 + ((var2[var1 + 1] - var14) * (var4 & 255) >> 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = var14 + ((var1 - var14) * (var4 & 255) >> 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1365 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdk;II)I"
	)
	static int method3279(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			short var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field1365 = var4;
		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdk;II)I"
	)
	static int method3274(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			var0 = ((var2[var1] - var14) * (var4 & 255) >> 8) + var14;
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = ((var2[var4 >> 8] - var1) * (var4 & 255) >> 8) + var1;
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field1365 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdk;)I"
	)
	static int method3275(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1377 += var9.field1378 * (var6 - var3);
		var9.field1370 += var9.field1382 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field1368 = var4 >> 2;
		var9.field1365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdk;)I"
	)
	static int method3276(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1368 += var12.field1376 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		short var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
		}

		var12.field1377 = var5;
		var12.field1370 = var6;
		var12.field1365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdk;)I"
	)
	static int method3277(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1377 += var9.field1378 * (var6 - var3);
		var9.field1370 += var9.field1382 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field1368 = var4 >> 2;
		var9.field1365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdk;)I"
	)
	static int method3404(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1368 += var12.field1376 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		short var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5 >> 6;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6 >> 6;
		}

		var12.field1377 = var5;
		var12.field1370 = var6;
		var12.field1365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdk;II)I"
	)
	static int method3353(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1377 -= var11.field1378 * var5;
		var11.field1370 -= var11.field1382 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		short var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1377 += var11.field1378 * var5;
		var11.field1370 += var11.field1382 * var5;
		var11.field1368 = var6;
		var11.field1365 = var4;
		return var5;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdk;II)I"
	)
	static int method3289(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1368 -= var5 * var13.field1376;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		short var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = var16 + ((var2[var1 + 1] - var16) * (var4 & 255) >> 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = var16 + ((var1 - var16) * (var4 & 255) >> 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1368 += var13.field1376 * var5;
		var13.field1377 = var6;
		var13.field1370 = var7;
		var13.field1365 = var4;
		return var5;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdk;II)I"
	)
	static int method3323(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1377 -= var11.field1378 * var5;
		var11.field1370 -= var11.field1382 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			short var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field1377 += var11.field1378 * var5;
		var11.field1370 += var11.field1382 * var5;
		var11.field1368 = var6;
		var11.field1365 = var4;
		return var5;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdk;II)I"
	)
	static int method3263(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1368 -= var5 * var13.field1376;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			short var16 = var2[var1 - 1];
			var0 = ((var2[var1] - var16) * (var4 & 255) >> 8) + var16;
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = ((var2[var4 >> 8] - var1) * (var4 & 255) >> 8) + var1;
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field1368 += var13.field1376 * var5;
		var13.field1377 = var6;
		var13.field1370 = var7;
		var13.field1365 = var4;
		return var5;
	}
}
