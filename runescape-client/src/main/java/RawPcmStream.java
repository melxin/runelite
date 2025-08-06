import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("al")
	int field1374;
	@ObfuscatedName("ab")
	int field1368;
	@ObfuscatedName("ac")
	int field1369;
	@ObfuscatedName("av")
	int field1376;
	@ObfuscatedName("au")
	int field1370;
	@ObfuscatedName("as")
	int field1372;
	@ObfuscatedName("ah")
	int field1373;
	@ObfuscatedName("ap")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("am")
	@Export("start")
	int start;
	@ObfuscatedName("aj")
	@Export("end")
	int end;
	@ObfuscatedName("ag")
	boolean field1377;
	@ObfuscatedName("ay")
	int field1378;
	@ObfuscatedName("aa")
	int field1379;
	@ObfuscatedName("ai")
	int field1380;
	@ObfuscatedName("ak")
	int field1371;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class335 field1367;
	@ObfuscatedName("at")
	public long field1382;
	@ObfuscatedName("ax")
	public int field1384;
	@ObfuscatedName("aq")
	public int field1385;
	@ObfuscatedName("ao")
	public int field1386;

	@ObfuscatedSignature(
		descriptor = "(Ldg;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		this.field1367 = class335.field3773;
		this.field1382 = 0L;
		this.field1384 = 0;
		this.field1385 = 0;
		this.field1386 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1377 = var1.field1300;
		this.field1368 = var2;
		this.field1369 = var3;
		this.field1376 = 8192;
		this.field1374 = 0;
		this.method3191();
	}

	@ObfuscatedSignature(
		descriptor = "(Ldg;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		this.field1367 = class335.field3773;
		this.field1382 = 0L;
		this.field1384 = 0;
		this.field1385 = 0;
		this.field1386 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1377 = var1.field1300;
		this.field1368 = var2;
		this.field1369 = var3;
		this.field1376 = var4;
		this.field1374 = 0;
		this.method3191();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ap")
	protected int vmethod7328() {
		return this.field1369 == 0 && this.field1378 == 0 ? 0 : 1;
	}

	@ObfuscatedName("am")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1369 == 0 && this.field1378 == 0) {
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
			if (this.field1374 < 0) {
				if (this.field1368 <= 0) {
					this.method3137();
					this.remove();
					return;
				}

				this.field1374 = 0;
			}

			if (this.field1374 >= var7) {
				if (this.field1368 >= 0) {
					this.method3137();
					this.remove();
					return;
				}

				this.field1374 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1377) {
					if (this.field1368 < 0) {
						var9 = this.method3151(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1374 >= var5) {
							return;
						}

						this.field1374 = var5 + var5 - 1 - this.field1374;
						this.field1368 = -this.field1368;
					}

					while (true) {
						var9 = this.method3150(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1374 < var6) {
							return;
						}

						this.field1374 = var6 + var6 - 1 - this.field1374;
						this.field1368 = -this.field1368;
						var9 = this.method3151(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1374 >= var5) {
							return;
						}

						this.field1374 = var5 + var5 - 1 - this.field1374;
						this.field1368 = -this.field1368;
					}
				} else if (this.field1368 < 0) {
					while (true) {
						var9 = this.method3151(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1374 >= var5) {
							return;
						}

						this.field1374 = var6 - 1 - (var6 - 1 - this.field1374) % var8;
					}
				} else {
					while (true) {
						var9 = this.method3150(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1374 < var6) {
							return;
						}

						this.field1374 = var5 + (this.field1374 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1377) {
						label141: {
							if (this.field1368 < 0) {
								var9 = this.method3151(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1374 >= var5) {
									return;
								}

								this.field1374 = var5 + var5 - 1 - this.field1374;
								this.field1368 = -this.field1368;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method3150(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1374 < var6) {
									return;
								}

								this.field1374 = var6 + var6 - 1 - this.field1374;
								this.field1368 = -this.field1368;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method3151(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1374 >= var5) {
									return;
								}

								this.field1374 = var5 + var5 - 1 - this.field1374;
								this.field1368 = -this.field1368;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1368 < 0) {
							while (true) {
								var9 = this.method3151(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1374 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1374) / var8;
								if (var10 >= this.numLoops) {
									this.field1374 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1374 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method3150(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1374 < var6) {
									return;
								}

								var10 = (this.field1374 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1374 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1374 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1368 < 0) {
					this.method3151(var1, var9, 0, var3, 0);
					if (this.field1374 < 0) {
						this.field1374 = -1;
						this.method3137();
						this.remove();
					}
				} else {
					this.method3150(var1, var9, var7, var3, 0);
					if (this.field1374 >= var7) {
						this.field1374 = var7;
						this.method3137();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ag")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1378 > 0) {
			if (var1 >= this.field1378) {
				if (this.field1369 == Integer.MIN_VALUE) {
					this.field1369 = 0;
					this.field1373 = 0;
					this.field1372 = 0;
					this.field1370 = 0;
					this.remove();
					var1 = this.field1378;
				}

				this.field1378 = 0;
				this.method3191();
			} else {
				this.field1370 += this.field1379 * var1;
				this.field1372 += this.field1380 * var1;
				this.field1373 += this.field1371 * var1;
				this.field1378 -= var1;
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

		if (this.field1374 < 0) {
			if (this.field1368 <= 0) {
				this.method3137();
				this.remove();
				return;
			}

			this.field1374 = 0;
		}

		if (this.field1374 >= var5) {
			if (this.field1368 >= 0) {
				this.method3137();
				this.remove();
				return;
			}

			this.field1374 = var5 - 1;
		}

		this.field1374 += this.field1368 * var1;
		if (this.numLoops < 0) {
			if (!this.field1377) {
				if (this.field1368 < 0) {
					if (this.field1374 >= var3) {
						return;
					}

					this.field1374 = var4 - 1 - (var4 - 1 - this.field1374) % var6;
				} else {
					if (this.field1374 < var4) {
						return;
					}

					this.field1374 = var3 + (this.field1374 - var3) % var6;
				}

			} else {
				if (this.field1368 < 0) {
					if (this.field1374 >= var3) {
						return;
					}

					this.field1374 = var3 + var3 - 1 - this.field1374;
					this.field1368 = -this.field1368;
				}

				while (this.field1374 >= var4) {
					this.field1374 = var4 + var4 - 1 - this.field1374;
					this.field1368 = -this.field1368;
					if (this.field1374 >= var3) {
						return;
					}

					this.field1374 = var3 + var3 - 1 - this.field1374;
					this.field1368 = -this.field1368;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1377) {
					label143: {
						if (this.field1368 < 0) {
							if (this.field1374 >= var3) {
								return;
							}

							this.field1374 = var3 + var3 - 1 - this.field1374;
							this.field1368 = -this.field1368;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field1374 < var4) {
								return;
							}

							this.field1374 = var4 + var4 - 1 - this.field1374;
							this.field1368 = -this.field1368;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1374 >= var3) {
								return;
							}

							this.field1374 = var3 + var3 - 1 - this.field1374;
							this.field1368 = -this.field1368;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1368 < 0) {
						if (this.field1374 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1374) / var6;
						if (var7 < this.numLoops) {
							this.field1374 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1374 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1374 < var4) {
							return;
						}

						var7 = (this.field1374 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1374 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1374 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1368 < 0) {
				if (this.field1374 < 0) {
					this.field1374 = -1;
					this.method3137();
					this.remove();
				}
			} else if (this.field1374 >= var5) {
				this.field1374 = var5;
				this.method3137();
				this.remove();
			}

		}
	}

	@ObfuscatedName("bq")
	void method3191() {
		this.field1370 = this.field1369;
		this.field1372 = method3105(this.field1369, this.field1376);
		this.field1373 = method3245(this.field1369, this.field1376);
	}

	@ObfuscatedName("bv")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bx")
	int vmethod3277() {
		int var1 = this.field1370 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1374 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bl")
	synchronized void method3128(int var1, int var2) {
		this.field1369 = var1;
		this.field1376 = var2;
		this.field1378 = 0;
		this.method3191();
	}

	@ObfuscatedName("bf")
	public synchronized int method3129() {
		return this.field1369 == Integer.MIN_VALUE ? 0 : this.field1369 + 32 >> 6;
	}

	@ObfuscatedName("bc")
	public synchronized void method3214(int var1) {
		this.method3128(var1 << 6, this.method3133());
	}

	@ObfuscatedName("bd")
	public synchronized int method3131() {
		return this.field1369 == Integer.MIN_VALUE ? 0 : this.field1369;
	}

	@ObfuscatedName("br")
	synchronized void method3132(int var1) {
		this.method3128(var1, this.method3133());
	}

	@ObfuscatedName("ba")
	public synchronized int method3133() {
		return this.field1376 < 0 ? -1 : this.field1376;
	}

	@ObfuscatedName("bh")
	public int method3225() {
		RawSound var1 = (RawSound)super.sound;
		return (int)((double)var1.samples.length * 1000.0D / (double)var1.sampleRate);
	}

	@ObfuscatedName("bg")
	public synchronized void method3135(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1374 = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method3136() {
		this.field1368 = (this.field1368 ^ this.field1368 >> 31) + (this.field1368 >>> 31);
		this.field1368 = -this.field1368;
	}

	@ObfuscatedName("bs")
	void method3137() {
		if (this.field1378 != 0) {
			if (this.field1369 == Integer.MIN_VALUE) {
				this.field1369 = 0;
			}

			this.field1378 = 0;
			this.method3191();
		}

	}

	@ObfuscatedName("bu")
	public synchronized void method3138(int var1, int var2) {
		this.method3139(var1, var2, this.method3133());
	}

	@ObfuscatedName("bp")
	public synchronized void method3139(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method3128(var2, var3);
		} else {
			int var4 = method3105(var2, var3);
			int var5 = method3245(var2, var3);
			if (var4 == this.field1372 && var5 == this.field1373) {
				this.field1378 = 0;
			} else {
				int var6 = var2 - this.field1370;
				if (this.field1370 - var2 > var6) {
					var6 = this.field1370 - var2;
				}

				if (var4 - this.field1372 > var6) {
					var6 = var4 - this.field1372;
				}

				if (this.field1372 - var4 > var6) {
					var6 = this.field1372 - var4;
				}

				if (var5 - this.field1373 > var6) {
					var6 = var5 - this.field1373;
				}

				if (this.field1373 - var5 > var6) {
					var6 = this.field1373 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1378 = var1;
				this.field1369 = var2;
				this.field1376 = var3;
				this.field1379 = (var2 - this.field1370) / var1;
				this.field1380 = (var4 - this.field1372) / var1;
				this.field1371 = (var5 - this.field1373) / var1;
			}
		}
	}

	@ObfuscatedName("bz")
	public synchronized void method3173(int var1) {
		if (var1 == 0) {
			this.method3132(0);
			this.remove();
		} else if (this.field1372 == 0 && this.field1373 == 0) {
			this.field1378 = 0;
			this.field1369 = 0;
			this.field1370 = 0;
			this.remove();
		} else {
			int var2 = -this.field1370;
			if (this.field1370 > var2) {
				var2 = this.field1370;
			}

			if (-this.field1372 > var2) {
				var2 = -this.field1372;
			}

			if (this.field1372 > var2) {
				var2 = this.field1372;
			}

			if (-this.field1373 > var2) {
				var2 = -this.field1373;
			}

			if (this.field1373 > var2) {
				var2 = this.field1373;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1378 = var1;
			this.field1369 = Integer.MIN_VALUE;
			this.field1379 = -this.field1370 / var1;
			this.field1380 = -this.field1372 / var1;
			this.field1371 = -this.field1373 / var1;
		}
	}

	@ObfuscatedName("bk")
	public synchronized int method3157() {
		return this.field1368 < 0 ? -this.field1368 : this.field1368;
	}

	@ObfuscatedName("bb")
	public synchronized void method3145(int var1) {
		if (this.field1368 < 0) {
			this.field1368 = -var1;
		} else {
			this.field1368 = var1;
		}

	}

	@ObfuscatedName("by")
	public boolean method3143() {
		return this.field1374 < 0 || this.field1374 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("cg")
	public boolean method3144() {
		return this.field1378 != 0;
	}

	@ObfuscatedName("cs")
	int method3150(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1378 > 0) {
				int var6 = var2 + this.field1378;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1378 += var2;
				if (this.field1368 == 256 && (this.field1374 & 255) == 0) {
					if (class475.PcmPlayer_stereo) {
						var2 = method3210(0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, this.field1380, this.field1371, 0, var6, var3, this);
					} else {
						var2 = method3117(((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, this.field1379, 0, var6, var3, this);
					}
				} else if (class475.PcmPlayer_stereo) {
					var2 = method3122(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, this.field1380, this.field1371, 0, var6, var3, this, this.field1368, var5);
				} else {
					var2 = method3165(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, this.field1379, 0, var6, var3, this, this.field1368, var5);
				}

				this.field1378 -= var2;
				if (this.field1378 != 0) {
					return var2;
				}

				if (!this.method3152()) {
					continue;
				}

				return var4;
			}

			if (this.field1368 == 256 && (this.field1374 & 255) == 0) {
				if (class475.PcmPlayer_stereo) {
					return method3110(0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, 0, var4, var3, this, ((RawSound)super.sound).method2984());
				}

				return method3109(((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, 0, var4, var3, this);
			}

			if (class475.PcmPlayer_stereo) {
				return method3114(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, 0, var4, var3, this, this.field1368, var5);
			}

			return method3180(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, 0, var4, var3, this, this.field1368, var5);
		}
	}

	@ObfuscatedName("ce")
	int method3151(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1378 > 0) {
				int var6 = var2 + this.field1378;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1378 += var2;
				if (this.field1368 == -256 && (this.field1374 & 255) == 0) {
					if (class475.PcmPlayer_stereo) {
						var2 = method3195(0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, this.field1380, this.field1371, 0, var6, var3, this);
					} else {
						var2 = method3130(((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, this.field1379, 0, var6, var3, this);
					}
				} else if (class475.PcmPlayer_stereo) {
					var2 = method3124(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, this.field1380, this.field1371, 0, var6, var3, this, this.field1368, var5);
				} else {
					var2 = method3123(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, this.field1379, 0, var6, var3, this, this.field1368, var5);
				}

				this.field1378 -= var2;
				if (this.field1378 != 0) {
					return var2;
				}

				if (!this.method3152()) {
					continue;
				}

				return var4;
			}

			if (this.field1368 == -256 && (this.field1374 & 255) == 0) {
				if (class475.PcmPlayer_stereo) {
					return method3200(0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, 0, var4, var3, this);
				}

				return method3111(((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, 0, var4, var3, this);
			}

			if (class475.PcmPlayer_stereo) {
				return method3116(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1372, this.field1373, 0, var4, var3, this, this.field1368, var5);
			}

			return method3115(0, 0, ((RawSound)super.sound).samples, var1, this.field1374, var2, this.field1370, 0, var4, var3, this, this.field1368, var5);
		}
	}

	@ObfuscatedName("ci")
	boolean method3152() {
		int var1 = this.field1369;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method3105(var1, this.field1376);
			var3 = method3245(var1, this.field1376);
		}

		if (var1 == this.field1370 && var2 == this.field1372 && var3 == this.field1373) {
			if (this.field1369 == Integer.MIN_VALUE) {
				this.field1369 = 0;
				this.field1373 = 0;
				this.field1372 = 0;
				this.field1370 = 0;
				this.remove();
				return true;
			} else {
				this.method3191();
				return false;
			}
		} else {
			if (this.field1370 < var1) {
				this.field1379 = 1;
				this.field1378 = var1 - this.field1370;
			} else if (this.field1370 > var1) {
				this.field1379 = -1;
				this.field1378 = this.field1370 - var1;
			} else {
				this.field1379 = 0;
			}

			if (this.field1372 < var2) {
				this.field1380 = 1;
				if (this.field1378 == 0 || this.field1378 > var2 - this.field1372) {
					this.field1378 = var2 - this.field1372;
				}
			} else if (this.field1372 > var2) {
				this.field1380 = -1;
				if (this.field1378 == 0 || this.field1378 > this.field1372 - var2) {
					this.field1378 = this.field1372 - var2;
				}
			} else {
				this.field1380 = 0;
			}

			if (this.field1373 < var3) {
				this.field1371 = 1;
				if (this.field1378 == 0 || this.field1378 > var3 - this.field1373) {
					this.field1378 = var3 - this.field1373;
				}
			} else if (this.field1373 > var3) {
				this.field1371 = -1;
				if (this.field1378 == 0 || this.field1378 > this.field1373 - var3) {
					this.field1378 = this.field1373 - var3;
				}
			} else {
				this.field1371 = 0;
			}

			return false;
		}
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("al")
	static int method3105(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ab")
	static int method3245(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldg;II)Ldr;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field1313 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldg;III)Ldr;"
	)
	public static RawPcmStream method3108(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdr;)I"
	)
	static int method3109(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1374 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdr;Z)I"
	)
	static int method3110(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
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

		var10.field1374 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdr;)I"
	)
	static int method3111(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1374 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdr;)I"
	)
	static int method3200(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field1374 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdr;II)I"
	)
	static int method3180(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1374 = var4;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdr;II)I"
	)
	static int method3114(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1374 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdr;II)I"
	)
	static int method3115(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1374 = var4;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdr;II)I"
	)
	static int method3116(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1374 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdr;)I"
	)
	static int method3117(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1372 += var9.field1380 * (var6 - var3);
		var9.field1373 += var9.field1371 * (var6 - var3);

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

		var9.field1370 = var4 >> 2;
		var9.field1374 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdr;)I"
	)
	static int method3210(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1370 += var12.field1379 * (var9 - var4);
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

		var12.field1372 = var5;
		var12.field1373 = var6;
		var12.field1374 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdr;)I"
	)
	static int method3130(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1372 += var9.field1380 * (var6 - var3);
		var9.field1373 += var9.field1371 * (var6 - var3);

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

		var9.field1370 = var4 >> 2;
		var9.field1374 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdr;)I"
	)
	static int method3195(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1370 += var12.field1379 * (var9 - var4);
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

		var12.field1372 = var5;
		var12.field1373 = var6;
		var12.field1374 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdr;II)I"
	)
	static int method3165(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1372 -= var11.field1380 * var5;
		var11.field1373 -= var11.field1371 * var5;
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

		var11.field1372 += var11.field1380 * var5;
		var11.field1373 += var11.field1371 * var5;
		var11.field1370 = var6;
		var11.field1374 = var4;
		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdr;II)I"
	)
	static int method3122(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1370 -= var5 * var13.field1379;
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
		var13.field1370 += var13.field1379 * var5;
		var13.field1372 = var6;
		var13.field1373 = var7;
		var13.field1374 = var4;
		return var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdr;II)I"
	)
	static int method3123(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1372 -= var11.field1380 * var5;
		var11.field1373 -= var11.field1371 * var5;
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

		var11.field1372 += var11.field1380 * var5;
		var11.field1373 += var11.field1371 * var5;
		var11.field1370 = var6;
		var11.field1374 = var4;
		return var5;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdr;II)I"
	)
	static int method3124(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1370 -= var5 * var13.field1379;
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
		var13.field1370 += var13.field1379 * var5;
		var13.field1372 = var6;
		var13.field1373 = var7;
		var13.field1374 = var4;
		return var5;
	}
}
