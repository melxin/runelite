import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("af")
	int field1407;
	@ObfuscatedName("aw")
	int field1391;
	@ObfuscatedName("at")
	int field1390;
	@ObfuscatedName("ac")
	int field1398;
	@ObfuscatedName("ap")
	int field1394;
	@ObfuscatedName("aq")
	int field1395;
	@ObfuscatedName("ao")
	int field1396;
	@ObfuscatedName("as")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("al")
	@Export("start")
	int start;
	@ObfuscatedName("au")
	@Export("end")
	int end;
	@ObfuscatedName("ai")
	boolean field1408;
	@ObfuscatedName("aa")
	int field1406;
	@ObfuscatedName("am")
	int field1401;
	@ObfuscatedName("an")
	int field1402;
	@ObfuscatedName("ar")
	int field1404;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class337 field1405;
	@ObfuscatedName("ay")
	public long field1393;
	@ObfuscatedName("ad")
	public int field1392;
	@ObfuscatedName("ag")
	public int field1403;
	@ObfuscatedName("av")
	public int field1409;

	@ObfuscatedSignature(
		descriptor = "(Ldv;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		this.field1405 = class337.field3853;
		this.field1393 = 0L;
		this.field1392 = 0;
		this.field1403 = 0;
		this.field1409 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1408 = var1.field1321;
		this.field1391 = var2;
		this.field1390 = var3;
		this.field1398 = 8192;
		this.field1407 = 0;
		this.method3172();
	}

	@ObfuscatedSignature(
		descriptor = "(Ldv;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		this.field1405 = class337.field3853;
		this.field1393 = 0L;
		this.field1392 = 0;
		this.field1403 = 0;
		this.field1409 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1408 = var1.field1321;
		this.field1391 = var2;
		this.field1390 = var3;
		this.field1398 = var4;
		this.field1407 = 0;
		this.method3172();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("as")
	protected int vmethod7364() {
		return this.field1390 == 0 && this.field1406 == 0 ? 0 : 1;
	}

	@ObfuscatedName("al")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1390 == 0 && this.field1406 == 0) {
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
			if (this.field1407 < 0) {
				if (this.field1391 <= 0) {
					this.method3214();
					this.remove();
					return;
				}

				this.field1407 = 0;
			}

			if (this.field1407 >= var7) {
				if (this.field1391 >= 0) {
					this.method3214();
					this.remove();
					return;
				}

				this.field1407 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1408) {
					if (this.field1391 < 0) {
						var9 = this.method3197(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1407 >= var5) {
							return;
						}

						this.field1407 = var5 + var5 - 1 - this.field1407;
						this.field1391 = -this.field1391;
					}

					while (true) {
						var9 = this.method3196(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1407 < var6) {
							return;
						}

						this.field1407 = var6 + var6 - 1 - this.field1407;
						this.field1391 = -this.field1391;
						var9 = this.method3197(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1407 >= var5) {
							return;
						}

						this.field1407 = var5 + var5 - 1 - this.field1407;
						this.field1391 = -this.field1391;
					}
				} else if (this.field1391 < 0) {
					while (true) {
						var9 = this.method3197(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1407 >= var5) {
							return;
						}

						this.field1407 = var6 - 1 - (var6 - 1 - this.field1407) % var8;
					}
				} else {
					while (true) {
						var9 = this.method3196(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1407 < var6) {
							return;
						}

						this.field1407 = var5 + (this.field1407 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1408) {
						label141: {
							if (this.field1391 < 0) {
								var9 = this.method3197(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1407 >= var5) {
									return;
								}

								this.field1407 = var5 + var5 - 1 - this.field1407;
								this.field1391 = -this.field1391;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method3196(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1407 < var6) {
									return;
								}

								this.field1407 = var6 + var6 - 1 - this.field1407;
								this.field1391 = -this.field1391;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method3197(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1407 >= var5) {
									return;
								}

								this.field1407 = var5 + var5 - 1 - this.field1407;
								this.field1391 = -this.field1391;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1391 < 0) {
							while (true) {
								var9 = this.method3197(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1407 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1407) / var8;
								if (var10 >= this.numLoops) {
									this.field1407 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1407 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method3196(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1407 < var6) {
									return;
								}

								var10 = (this.field1407 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1407 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1407 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1391 < 0) {
					this.method3197(var1, var9, 0, var3, 0);
					if (this.field1407 < 0) {
						this.field1407 = -1;
						this.method3214();
						this.remove();
					}
				} else {
					this.method3196(var1, var9, var7, var3, 0);
					if (this.field1407 >= var7) {
						this.field1407 = var7;
						this.method3214();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ai")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1406 > 0) {
			if (var1 >= this.field1406) {
				if (this.field1390 == Integer.MIN_VALUE) {
					this.field1390 = 0;
					this.field1396 = 0;
					this.field1395 = 0;
					this.field1394 = 0;
					this.remove();
					var1 = this.field1406;
				}

				this.field1406 = 0;
				this.method3172();
			} else {
				this.field1394 += this.field1401 * var1;
				this.field1395 += this.field1402 * var1;
				this.field1396 += this.field1404 * var1;
				this.field1406 -= var1;
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

		if (this.field1407 < 0) {
			if (this.field1391 <= 0) {
				this.method3214();
				this.remove();
				return;
			}

			this.field1407 = 0;
		}

		if (this.field1407 >= var5) {
			if (this.field1391 >= 0) {
				this.method3214();
				this.remove();
				return;
			}

			this.field1407 = var5 - 1;
		}

		this.field1407 += this.field1391 * var1;
		if (this.numLoops < 0) {
			if (!this.field1408) {
				if (this.field1391 < 0) {
					if (this.field1407 >= var3) {
						return;
					}

					this.field1407 = var4 - 1 - (var4 - 1 - this.field1407) % var6;
				} else {
					if (this.field1407 < var4) {
						return;
					}

					this.field1407 = var3 + (this.field1407 - var3) % var6;
				}

			} else {
				if (this.field1391 < 0) {
					if (this.field1407 >= var3) {
						return;
					}

					this.field1407 = var3 + var3 - 1 - this.field1407;
					this.field1391 = -this.field1391;
				}

				while (this.field1407 >= var4) {
					this.field1407 = var4 + var4 - 1 - this.field1407;
					this.field1391 = -this.field1391;
					if (this.field1407 >= var3) {
						return;
					}

					this.field1407 = var3 + var3 - 1 - this.field1407;
					this.field1391 = -this.field1391;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1408) {
					label143: {
						if (this.field1391 < 0) {
							if (this.field1407 >= var3) {
								return;
							}

							this.field1407 = var3 + var3 - 1 - this.field1407;
							this.field1391 = -this.field1391;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field1407 < var4) {
								return;
							}

							this.field1407 = var4 + var4 - 1 - this.field1407;
							this.field1391 = -this.field1391;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1407 >= var3) {
								return;
							}

							this.field1407 = var3 + var3 - 1 - this.field1407;
							this.field1391 = -this.field1391;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1391 < 0) {
						if (this.field1407 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1407) / var6;
						if (var7 < this.numLoops) {
							this.field1407 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1407 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1407 < var4) {
							return;
						}

						var7 = (this.field1407 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1407 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1407 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1391 < 0) {
				if (this.field1407 < 0) {
					this.field1407 = -1;
					this.method3214();
					this.remove();
				}
			} else if (this.field1407 >= var5) {
				this.field1407 = var5;
				this.method3214();
				this.remove();
			}

		}
	}

	@ObfuscatedName("bn")
	int vmethod3324() {
		int var1 = this.field1394 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1407 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("be")
	void method3172() {
		this.field1394 = this.field1390;
		this.field1395 = method3151(this.field1390, this.field1398);
		this.field1396 = method3169(this.field1390, this.field1398);
	}

	@ObfuscatedName("bh")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bk")
	synchronized void method3174(int var1, int var2) {
		this.field1390 = var1;
		this.field1398 = var2;
		this.field1406 = 0;
		this.method3172();
	}

	@ObfuscatedName("bp")
	public synchronized int method3175() {
		return this.field1390 == Integer.MIN_VALUE ? 0 : this.field1390 + 32 >> 6;
	}

	@ObfuscatedName("br")
	public synchronized void method3282(int var1) {
		this.method3174(var1 << 6, this.method3280());
	}

	@ObfuscatedName("bv")
	public synchronized int method3177() {
		return this.field1390 == Integer.MIN_VALUE ? 0 : this.field1390;
	}

	@ObfuscatedName("bj")
	synchronized void method3225(int var1) {
		this.method3174(var1, this.method3280());
	}

	@ObfuscatedName("bm")
	public synchronized int method3280() {
		return this.field1398 < 0 ? -1 : this.field1398;
	}

	@ObfuscatedName("bf")
	public int method3155() {
		RawSound var1 = (RawSound)super.sound;
		return (int)((double)var1.samples.length * 1000.0D / (double)var1.sampleRate);
	}

	@ObfuscatedName("bw")
	public synchronized void method3158(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1407 = var1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method3182() {
		this.field1391 = (this.field1391 ^ this.field1391 >> 31) + (this.field1391 >>> 31);
		this.field1391 = -this.field1391;
	}

	@ObfuscatedName("cw")
	void method3214() {
		if (this.field1406 != 0) {
			if (this.field1390 == Integer.MIN_VALUE) {
				this.field1390 = 0;
			}

			this.field1406 = 0;
			this.method3172();
		}

	}

	@ObfuscatedName("cz")
	public synchronized void method3184(int var1, int var2) {
		this.method3185(var1, var2, this.method3280());
	}

	@ObfuscatedName("cf")
	public synchronized void method3185(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method3174(var2, var3);
		} else {
			int var4 = method3151(var2, var3);
			int var5 = method3169(var2, var3);
			if (var4 == this.field1395 && var5 == this.field1396) {
				this.field1406 = 0;
			} else {
				int var6 = var2 - this.field1394;
				if (this.field1394 - var2 > var6) {
					var6 = this.field1394 - var2;
				}

				if (var4 - this.field1395 > var6) {
					var6 = var4 - this.field1395;
				}

				if (this.field1395 - var4 > var6) {
					var6 = this.field1395 - var4;
				}

				if (var5 - this.field1396 > var6) {
					var6 = var5 - this.field1396;
				}

				if (this.field1396 - var5 > var6) {
					var6 = this.field1396 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1406 = var1;
				this.field1390 = var2;
				this.field1398 = var3;
				this.field1401 = (var2 - this.field1394) / var1;
				this.field1402 = (var4 - this.field1395) / var1;
				this.field1404 = (var5 - this.field1396) / var1;
			}
		}
	}

	@ObfuscatedName("cg")
	public synchronized void method3186(int var1) {
		if (var1 == 0) {
			this.method3225(0);
			this.remove();
		} else if (this.field1395 == 0 && this.field1396 == 0) {
			this.field1406 = 0;
			this.field1390 = 0;
			this.field1394 = 0;
			this.remove();
		} else {
			int var2 = -this.field1394;
			if (this.field1394 > var2) {
				var2 = this.field1394;
			}

			if (-this.field1395 > var2) {
				var2 = -this.field1395;
			}

			if (this.field1395 > var2) {
				var2 = this.field1395;
			}

			if (-this.field1396 > var2) {
				var2 = -this.field1396;
			}

			if (this.field1396 > var2) {
				var2 = this.field1396;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1406 = var1;
			this.field1390 = Integer.MIN_VALUE;
			this.field1401 = -this.field1394 / var1;
			this.field1402 = -this.field1395 / var1;
			this.field1404 = -this.field1396 / var1;
		}
	}

	@ObfuscatedName("ci")
	public synchronized int method3187() {
		return this.field1391 < 0 ? -this.field1391 : this.field1391;
	}

	@ObfuscatedName("cp")
	public synchronized void method3188(int var1) {
		if (this.field1391 < 0) {
			this.field1391 = -var1;
		} else {
			this.field1391 = var1;
		}

	}

	@ObfuscatedName("cm")
	public boolean method3189() {
		return this.field1407 < 0 || this.field1407 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("cc")
	public boolean method3190() {
		return this.field1406 != 0;
	}

	@ObfuscatedName("cj")
	int method3196(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1406 > 0) {
				int var6 = var2 + this.field1406;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1406 += var2;
				if (this.field1391 == 256 && (this.field1407 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method3267(0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, this.field1402, this.field1404, 0, var6, var3, this);
					} else {
						var2 = method3206(((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, this.field1401, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method3241(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, this.field1402, this.field1404, 0, var6, var3, this, this.field1391, var5);
				} else {
					var2 = method3167(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, this.field1401, 0, var6, var3, this, this.field1391, var5);
				}

				this.field1406 -= var2;
				if (this.field1406 != 0) {
					return var2;
				}

				if (!this.method3168()) {
					continue;
				}

				return var4;
			}

			if (this.field1391 == 256 && (this.field1407 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method3156(0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, 0, var4, var3, this, ((RawSound)super.sound).method3026());
				}

				return method3316(((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method3286(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, 0, var4, var3, this, this.field1391, var5);
			}

			return method3159(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, 0, var4, var3, this, this.field1391, var5);
		}
	}

	@ObfuscatedName("ce")
	int method3197(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1406 > 0) {
				int var6 = var2 + this.field1406;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1406 += var2;
				if (this.field1391 == -256 && (this.field1407 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method3229(0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, this.field1402, this.field1404, 0, var6, var3, this);
					} else {
						var2 = method3165(((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, this.field1401, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method3170(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, this.field1402, this.field1404, 0, var6, var3, this, this.field1391, var5);
				} else {
					var2 = method3205(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, this.field1401, 0, var6, var3, this, this.field1391, var5);
				}

				this.field1406 -= var2;
				if (this.field1406 != 0) {
					return var2;
				}

				if (!this.method3168()) {
					continue;
				}

				return var4;
			}

			if (this.field1391 == -256 && (this.field1407 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method3157(0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, 0, var4, var3, this);
				}

				return method3179(((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method3162(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1395, this.field1396, 0, var4, var3, this, this.field1391, var5);
			}

			return method3161(0, 0, ((RawSound)super.sound).samples, var1, this.field1407, var2, this.field1394, 0, var4, var3, this, this.field1391, var5);
		}
	}

	@ObfuscatedName("cr")
	boolean method3168() {
		int var1 = this.field1390;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method3151(var1, this.field1398);
			var3 = method3169(var1, this.field1398);
		}

		if (var1 == this.field1394 && var2 == this.field1395 && var3 == this.field1396) {
			if (this.field1390 == Integer.MIN_VALUE) {
				this.field1390 = 0;
				this.field1396 = 0;
				this.field1395 = 0;
				this.field1394 = 0;
				this.remove();
				return true;
			} else {
				this.method3172();
				return false;
			}
		} else {
			if (this.field1394 < var1) {
				this.field1401 = 1;
				this.field1406 = var1 - this.field1394;
			} else if (this.field1394 > var1) {
				this.field1401 = -1;
				this.field1406 = this.field1394 - var1;
			} else {
				this.field1401 = 0;
			}

			if (this.field1395 < var2) {
				this.field1402 = 1;
				if (this.field1406 == 0 || this.field1406 > var2 - this.field1395) {
					this.field1406 = var2 - this.field1395;
				}
			} else if (this.field1395 > var2) {
				this.field1402 = -1;
				if (this.field1406 == 0 || this.field1406 > this.field1395 - var2) {
					this.field1406 = this.field1395 - var2;
				}
			} else {
				this.field1402 = 0;
			}

			if (this.field1396 < var3) {
				this.field1404 = 1;
				if (this.field1406 == 0 || this.field1406 > var3 - this.field1396) {
					this.field1406 = var3 - this.field1396;
				}
			} else if (this.field1396 > var3) {
				this.field1404 = -1;
				if (this.field1406 == 0 || this.field1406 > this.field1396 - var3) {
					this.field1406 = this.field1396 - var3;
				}
			} else {
				this.field1404 = 0;
			}

			return false;
		}
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("af")
	static int method3151(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aw")
	static int method3169(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldv;II)Ldo;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field1356 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldv;III)Ldo;"
	)
	public static RawPcmStream method3154(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdo;)I"
	)
	static int method3316(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1407 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdo;Z)I"
	)
	static int method3156(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
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

		var10.field1407 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdo;)I"
	)
	static int method3179(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1407 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdo;)I"
	)
	static int method3157(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field1407 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdo;II)I"
	)
	static int method3159(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1407 = var4;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdo;II)I"
	)
	static int method3286(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1407 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdo;II)I"
	)
	static int method3161(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1407 = var4;
		return var5;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdo;II)I"
	)
	static int method3162(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1407 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdo;)I"
	)
	static int method3206(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1395 += var9.field1402 * (var6 - var3);
		var9.field1396 += var9.field1404 * (var6 - var3);

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

		var9.field1394 = var4 >> 2;
		var9.field1407 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdo;)I"
	)
	static int method3267(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1394 += var12.field1401 * (var9 - var4);
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

		var12.field1395 = var5;
		var12.field1396 = var6;
		var12.field1407 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdo;)I"
	)
	static int method3165(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1395 += var9.field1402 * (var6 - var3);
		var9.field1396 += var9.field1404 * (var6 - var3);

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

		var9.field1394 = var4 >> 2;
		var9.field1407 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdo;)I"
	)
	static int method3229(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1394 += var12.field1401 * (var9 - var4);
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

		var12.field1395 = var5;
		var12.field1396 = var6;
		var12.field1407 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdo;II)I"
	)
	static int method3167(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1395 -= var11.field1402 * var5;
		var11.field1396 -= var11.field1404 * var5;
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

		var11.field1395 += var11.field1402 * var5;
		var11.field1396 += var11.field1404 * var5;
		var11.field1394 = var6;
		var11.field1407 = var4;
		return var5;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdo;II)I"
	)
	static int method3241(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1394 -= var5 * var13.field1401;
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
		var13.field1394 += var13.field1401 * var5;
		var13.field1395 = var6;
		var13.field1396 = var7;
		var13.field1407 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdo;II)I"
	)
	static int method3205(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1395 -= var11.field1402 * var5;
		var11.field1396 -= var11.field1404 * var5;
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

		var11.field1395 += var11.field1402 * var5;
		var11.field1396 += var11.field1404 * var5;
		var11.field1394 = var6;
		var11.field1407 = var4;
		return var5;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdo;II)I"
	)
	static int method3170(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1394 -= var5 * var13.field1401;
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
		var13.field1394 += var13.field1401 * var5;
		var13.field1395 = var6;
		var13.field1396 = var7;
		var13.field1407 = var4;
		return var5;
	}
}
