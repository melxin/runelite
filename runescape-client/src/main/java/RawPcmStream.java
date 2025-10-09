import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	int field1398;
	@ObfuscatedName("at")
	int field1406;
	@ObfuscatedName("ag")
	int field1392;
	@ObfuscatedName("aj")
	int field1393;
	@ObfuscatedName("ah")
	int field1396;
	@ObfuscatedName("af")
	int field1395;
	@ObfuscatedName("ae")
	int field1390;
	@ObfuscatedName("aq")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ac")
	@Export("start")
	int start;
	@ObfuscatedName("aa")
	@Export("end")
	int end;
	@ObfuscatedName("ap")
	boolean field1400;
	@ObfuscatedName("ad")
	int field1401;
	@ObfuscatedName("av")
	int field1402;
	@ObfuscatedName("as")
	int field1404;
	@ObfuscatedName("ar")
	int field1391;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public class336 field1394;
	@ObfuscatedName("au")
	public long field1408;
	@ObfuscatedName("ak")
	public int field1407;
	@ObfuscatedName("ao")
	public int field1405;
	@ObfuscatedName("ax")
	public int field1409;

	@ObfuscatedSignature(
		descriptor = "(Ldi;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		this.field1394 = class336.field3851;
		this.field1408 = 0L;
		this.field1407 = 0;
		this.field1405 = 0;
		this.field1409 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1400 = var1.field1326;
		this.field1406 = var2;
		this.field1392 = var3;
		this.field1393 = 8192;
		this.field1398 = 0;
		this.method3306();
	}

	@ObfuscatedSignature(
		descriptor = "(Ldi;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		this.field1394 = class336.field3851;
		this.field1408 = 0L;
		this.field1407 = 0;
		this.field1405 = 0;
		this.field1409 = 0;
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1400 = var1.field1326;
		this.field1406 = var2;
		this.field1392 = var3;
		this.field1393 = var4;
		this.field1398 = 0;
		this.method3306();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aq")
	protected int vmethod7359() {
		return this.field1392 == 0 && this.field1401 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1392 == 0 && this.field1401 == 0) {
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
			if (this.field1398 < 0) {
				if (this.field1406 <= 0) {
					this.method3325();
					this.remove();
					return;
				}

				this.field1398 = 0;
			}

			if (this.field1398 >= var7) {
				if (this.field1406 >= 0) {
					this.method3325();
					this.remove();
					return;
				}

				this.field1398 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1400) {
					if (this.field1406 < 0) {
						var9 = this.method3279(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1398 >= var5) {
							return;
						}

						this.field1398 = var5 + var5 - 1 - this.field1398;
						this.field1406 = -this.field1406;
					}

					while (true) {
						var9 = this.method3305(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1398 < var6) {
							return;
						}

						this.field1398 = var6 + var6 - 1 - this.field1398;
						this.field1406 = -this.field1406;
						var9 = this.method3279(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1398 >= var5) {
							return;
						}

						this.field1398 = var5 + var5 - 1 - this.field1398;
						this.field1406 = -this.field1406;
					}
				} else if (this.field1406 < 0) {
					while (true) {
						var9 = this.method3279(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1398 >= var5) {
							return;
						}

						this.field1398 = var6 - 1 - (var6 - 1 - this.field1398) % var8;
					}
				} else {
					while (true) {
						var9 = this.method3305(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1398 < var6) {
							return;
						}

						this.field1398 = var5 + (this.field1398 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1400) {
						label141: {
							if (this.field1406 < 0) {
								var9 = this.method3279(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1398 >= var5) {
									return;
								}

								this.field1398 = var5 + var5 - 1 - this.field1398;
								this.field1406 = -this.field1406;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method3305(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1398 < var6) {
									return;
								}

								this.field1398 = var6 + var6 - 1 - this.field1398;
								this.field1406 = -this.field1406;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method3279(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1398 >= var5) {
									return;
								}

								this.field1398 = var5 + var5 - 1 - this.field1398;
								this.field1406 = -this.field1406;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1406 < 0) {
							while (true) {
								var9 = this.method3279(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1398 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1398) / var8;
								if (var10 >= this.numLoops) {
									this.field1398 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1398 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method3305(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1398 < var6) {
									return;
								}

								var10 = (this.field1398 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1398 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1398 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1406 < 0) {
					this.method3279(var1, var9, 0, var3, 0);
					if (this.field1398 < 0) {
						this.field1398 = -1;
						this.method3325();
						this.remove();
					}
				} else {
					this.method3305(var1, var9, var7, var3, 0);
					if (this.field1398 >= var7) {
						this.field1398 = var7;
						this.method3325();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ap")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1401 > 0) {
			if (var1 >= this.field1401) {
				if (this.field1392 == Integer.MIN_VALUE) {
					this.field1392 = 0;
					this.field1390 = 0;
					this.field1395 = 0;
					this.field1396 = 0;
					this.remove();
					var1 = this.field1401;
				}

				this.field1401 = 0;
				this.method3306();
			} else {
				this.field1396 += this.field1402 * var1;
				this.field1395 += this.field1404 * var1;
				this.field1390 += this.field1391 * var1;
				this.field1401 -= var1;
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

		if (this.field1398 < 0) {
			if (this.field1406 <= 0) {
				this.method3325();
				this.remove();
				return;
			}

			this.field1398 = 0;
		}

		if (this.field1398 >= var5) {
			if (this.field1406 >= 0) {
				this.method3325();
				this.remove();
				return;
			}

			this.field1398 = var5 - 1;
		}

		this.field1398 += this.field1406 * var1;
		if (this.numLoops < 0) {
			if (!this.field1400) {
				if (this.field1406 < 0) {
					if (this.field1398 >= var3) {
						return;
					}

					this.field1398 = var4 - 1 - (var4 - 1 - this.field1398) % var6;
				} else {
					if (this.field1398 < var4) {
						return;
					}

					this.field1398 = var3 + (this.field1398 - var3) % var6;
				}

			} else {
				if (this.field1406 < 0) {
					if (this.field1398 >= var3) {
						return;
					}

					this.field1398 = var3 + var3 - 1 - this.field1398;
					this.field1406 = -this.field1406;
				}

				while (this.field1398 >= var4) {
					this.field1398 = var4 + var4 - 1 - this.field1398;
					this.field1406 = -this.field1406;
					if (this.field1398 >= var3) {
						return;
					}

					this.field1398 = var3 + var3 - 1 - this.field1398;
					this.field1406 = -this.field1406;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1400) {
					label143: {
						if (this.field1406 < 0) {
							if (this.field1398 >= var3) {
								return;
							}

							this.field1398 = var3 + var3 - 1 - this.field1398;
							this.field1406 = -this.field1406;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field1398 < var4) {
								return;
							}

							this.field1398 = var4 + var4 - 1 - this.field1398;
							this.field1406 = -this.field1406;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1398 >= var3) {
								return;
							}

							this.field1398 = var3 + var3 - 1 - this.field1398;
							this.field1406 = -this.field1406;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1406 < 0) {
						if (this.field1398 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1398) / var6;
						if (var7 < this.numLoops) {
							this.field1398 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1398 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1398 < var4) {
							return;
						}

						var7 = (this.field1398 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1398 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1398 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1406 < 0) {
				if (this.field1398 < 0) {
					this.field1398 = -1;
					this.method3325();
					this.remove();
				}
			} else if (this.field1398 >= var5) {
				this.field1398 = var5;
				this.method3325();
				this.remove();
			}

		}
	}

	@ObfuscatedName("bb")
	void method3306() {
		this.field1396 = this.field1392;
		this.field1395 = method3233(this.field1392, this.field1393);
		this.field1390 = method3280(this.field1392, this.field1393);
	}

	@ObfuscatedName("bu")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bs")
	synchronized void method3339(int var1, int var2) {
		this.field1392 = var1;
		this.field1393 = var2;
		this.field1401 = 0;
		this.method3306();
	}

	@ObfuscatedName("bo")
	int vmethod3401() {
		int var1 = this.field1396 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1398 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bx")
	public synchronized int method3257() {
		return this.field1392 == Integer.MIN_VALUE ? 0 : this.field1392 + 32 >> 6;
	}

	@ObfuscatedName("bp")
	public synchronized void method3251(int var1) {
		this.method3339(var1 << 6, this.method3261());
	}

	@ObfuscatedName("bz")
	public synchronized int method3259() {
		return this.field1392 == Integer.MIN_VALUE ? 0 : this.field1392;
	}

	@ObfuscatedName("bh")
	synchronized void method3348(int var1) {
		this.method3339(var1, this.method3261());
	}

	@ObfuscatedName("bc")
	public synchronized int method3261() {
		return this.field1393 < 0 ? -1 : this.field1393;
	}

	@ObfuscatedName("bv")
	public int method3262() {
		RawSound var1 = (RawSound)super.sound;
		return (int)((double)var1.samples.length * 1000.0D / (double)var1.sampleRate);
	}

	@ObfuscatedName("bi")
	public synchronized void method3263(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1398 = var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method3232() {
		this.field1406 = (this.field1406 ^ this.field1406 >> 31) + (this.field1406 >>> 31);
		this.field1406 = -this.field1406;
	}

	@ObfuscatedName("br")
	void method3325() {
		if (this.field1401 != 0) {
			if (this.field1392 == Integer.MIN_VALUE) {
				this.field1392 = 0;
			}

			this.field1401 = 0;
			this.method3306();
		}

	}

	@ObfuscatedName("bf")
	public synchronized void method3265(int var1, int var2) {
		this.method3240(var1, var2, this.method3261());
	}

	@ObfuscatedName("bl")
	public synchronized void method3240(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method3339(var2, var3);
		} else {
			int var4 = method3233(var2, var3);
			int var5 = method3280(var2, var3);
			if (var4 == this.field1395 && var5 == this.field1390) {
				this.field1401 = 0;
			} else {
				int var6 = var2 - this.field1396;
				if (this.field1396 - var2 > var6) {
					var6 = this.field1396 - var2;
				}

				if (var4 - this.field1395 > var6) {
					var6 = var4 - this.field1395;
				}

				if (this.field1395 - var4 > var6) {
					var6 = this.field1395 - var4;
				}

				if (var5 - this.field1390 > var6) {
					var6 = var5 - this.field1390;
				}

				if (this.field1390 - var5 > var6) {
					var6 = this.field1390 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1401 = var1;
				this.field1392 = var2;
				this.field1393 = var3;
				this.field1402 = (var2 - this.field1396) / var1;
				this.field1404 = (var4 - this.field1395) / var1;
				this.field1391 = (var5 - this.field1390) / var1;
			}
		}
	}

	@ObfuscatedName("bd")
	public synchronized void method3260(int var1) {
		if (var1 == 0) {
			this.method3348(0);
			this.remove();
		} else if (this.field1395 == 0 && this.field1390 == 0) {
			this.field1401 = 0;
			this.field1392 = 0;
			this.field1396 = 0;
			this.remove();
		} else {
			int var2 = -this.field1396;
			if (this.field1396 > var2) {
				var2 = this.field1396;
			}

			if (-this.field1395 > var2) {
				var2 = -this.field1395;
			}

			if (this.field1395 > var2) {
				var2 = this.field1395;
			}

			if (-this.field1390 > var2) {
				var2 = -this.field1390;
			}

			if (this.field1390 > var2) {
				var2 = this.field1390;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1401 = var1;
			this.field1392 = Integer.MIN_VALUE;
			this.field1402 = -this.field1396 / var1;
			this.field1404 = -this.field1395 / var1;
			this.field1391 = -this.field1390 / var1;
		}
	}

	@ObfuscatedName("bt")
	public synchronized int method3234() {
		return this.field1406 < 0 ? -this.field1406 : this.field1406;
	}

	@ObfuscatedName("bk")
	public synchronized void method3270(int var1) {
		if (this.field1406 < 0) {
			this.field1406 = -var1;
		} else {
			this.field1406 = var1;
		}

	}

	@ObfuscatedName("ca")
	public boolean method3271() {
		return this.field1398 < 0 || this.field1398 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("cy")
	public boolean method3269() {
		return this.field1401 != 0;
	}

	@ObfuscatedName("cj")
	int method3305(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1401 > 0) {
				int var6 = var2 + this.field1401;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1401 += var2;
				if (this.field1406 == 256 && (this.field1398 & 255) == 0) {
					if (DelayFadeTask.PcmPlayer_stereo) {
						var2 = method3256(0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, this.field1404, this.field1391, 0, var6, var3, this);
					} else {
						var2 = method3245(((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, this.field1402, 0, var6, var3, this);
					}
				} else if (DelayFadeTask.PcmPlayer_stereo) {
					var2 = method3250(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, this.field1404, this.field1391, 0, var6, var3, this, this.field1406, var5);
				} else {
					var2 = method3249(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, this.field1402, 0, var6, var3, this, this.field1406, var5);
				}

				this.field1401 -= var2;
				if (this.field1401 != 0) {
					return var2;
				}

				if (!this.method3326()) {
					continue;
				}

				return var4;
			}

			if (this.field1406 == 256 && (this.field1398 & 255) == 0) {
				if (DelayFadeTask.PcmPlayer_stereo) {
					return method3238(0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, 0, var4, var3, this, ((RawSound)super.sound).method3125());
				}

				return method3344(((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, 0, var4, var3, this);
			}

			if (DelayFadeTask.PcmPlayer_stereo) {
				return method3242(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, 0, var4, var3, this, this.field1406, var5);
			}

			return method3277(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, 0, var4, var3, this, this.field1406, var5);
		}
	}

	@ObfuscatedName("ce")
	int method3279(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1401 > 0) {
				int var6 = var2 + this.field1401;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1401 += var2;
				if (this.field1406 == -256 && (this.field1398 & 255) == 0) {
					if (DelayFadeTask.PcmPlayer_stereo) {
						var2 = method3248(0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, this.field1404, this.field1391, 0, var6, var3, this);
					} else {
						var2 = method3247(((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, this.field1402, 0, var6, var3, this);
					}
				} else if (DelayFadeTask.PcmPlayer_stereo) {
					var2 = method3258(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, this.field1404, this.field1391, 0, var6, var3, this, this.field1406, var5);
				} else {
					var2 = method3307(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, this.field1402, 0, var6, var3, this, this.field1406, var5);
				}

				this.field1401 -= var2;
				if (this.field1401 != 0) {
					return var2;
				}

				if (!this.method3326()) {
					continue;
				}

				return var4;
			}

			if (this.field1406 == -256 && (this.field1398 & 255) == 0) {
				if (DelayFadeTask.PcmPlayer_stereo) {
					return method3241(0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, 0, var4, var3, this);
				}

				return method3239(((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, 0, var4, var3, this);
			}

			if (DelayFadeTask.PcmPlayer_stereo) {
				return method3381(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1395, this.field1390, 0, var4, var3, this, this.field1406, var5);
			}

			return method3243(0, 0, ((RawSound)super.sound).samples, var1, this.field1398, var2, this.field1396, 0, var4, var3, this, this.field1406, var5);
		}
	}

	@ObfuscatedName("cl")
	boolean method3326() {
		int var1 = this.field1392;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method3233(var1, this.field1393);
			var3 = method3280(var1, this.field1393);
		}

		if (var1 == this.field1396 && var2 == this.field1395 && var3 == this.field1390) {
			if (this.field1392 == Integer.MIN_VALUE) {
				this.field1392 = 0;
				this.field1390 = 0;
				this.field1395 = 0;
				this.field1396 = 0;
				this.remove();
				return true;
			} else {
				this.method3306();
				return false;
			}
		} else {
			if (this.field1396 < var1) {
				this.field1402 = 1;
				this.field1401 = var1 - this.field1396;
			} else if (this.field1396 > var1) {
				this.field1402 = -1;
				this.field1401 = this.field1396 - var1;
			} else {
				this.field1402 = 0;
			}

			if (this.field1395 < var2) {
				this.field1404 = 1;
				if (this.field1401 == 0 || this.field1401 > var2 - this.field1395) {
					this.field1401 = var2 - this.field1395;
				}
			} else if (this.field1395 > var2) {
				this.field1404 = -1;
				if (this.field1401 == 0 || this.field1401 > this.field1395 - var2) {
					this.field1401 = this.field1395 - var2;
				}
			} else {
				this.field1404 = 0;
			}

			if (this.field1390 < var3) {
				this.field1391 = 1;
				if (this.field1401 == 0 || this.field1401 > var3 - this.field1390) {
					this.field1401 = var3 - this.field1390;
				}
			} else if (this.field1390 > var3) {
				this.field1391 = -1;
				if (this.field1401 == 0 || this.field1401 > this.field1390 - var3) {
					this.field1401 = this.field1390 - var3;
				}
			} else {
				this.field1391 = 0;
			}

			return false;
		}
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("ab")
	static int method3233(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("at")
	static int method3280(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)Ldp;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class349.field4014 * -408750528)), var2 << 6) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldi;III)Ldp;"
	)
	public static RawPcmStream method3236(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdp;)I"
	)
	static int method3344(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1398 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdp;Z)I"
	)
	static int method3238(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
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

		var10.field1398 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdp;)I"
	)
	static int method3239(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field1398 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdp;)I"
	)
	static int method3241(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field1398 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdp;II)I"
	)
	static int method3277(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1398 = var4;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdp;II)I"
	)
	static int method3242(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1398 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdp;II)I"
	)
	static int method3243(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field1398 = var4;
		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdp;II)I"
	)
	static int method3381(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field1398 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdp;)I"
	)
	static int method3245(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1395 += var9.field1404 * (var6 - var3);
		var9.field1390 += var9.field1391 * (var6 - var3);

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

		var9.field1396 = var4 >> 2;
		var9.field1398 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdp;)I"
	)
	static int method3256(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1396 += var12.field1402 * (var9 - var4);
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
		var12.field1390 = var6;
		var12.field1398 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdp;)I"
	)
	static int method3247(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1395 += var9.field1404 * (var6 - var3);
		var9.field1390 += var9.field1391 * (var6 - var3);

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

		var9.field1396 = var4 >> 2;
		var9.field1398 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdp;)I"
	)
	static int method3248(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1396 += var12.field1402 * (var9 - var4);
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
		var12.field1390 = var6;
		var12.field1398 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdp;II)I"
	)
	static int method3249(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1395 -= var11.field1404 * var5;
		var11.field1390 -= var11.field1391 * var5;
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

		var11.field1395 += var11.field1404 * var5;
		var11.field1390 += var11.field1391 * var5;
		var11.field1396 = var6;
		var11.field1398 = var4;
		return var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdp;II)I"
	)
	static int method3250(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1396 -= var5 * var13.field1402;
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
		var13.field1396 += var13.field1402 * var5;
		var13.field1395 = var6;
		var13.field1390 = var7;
		var13.field1398 = var4;
		return var5;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdp;II)I"
	)
	static int method3307(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field1395 -= var11.field1404 * var5;
		var11.field1390 -= var11.field1391 * var5;
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

		var11.field1395 += var11.field1404 * var5;
		var11.field1390 += var11.field1391 * var5;
		var11.field1396 = var6;
		var11.field1398 = var4;
		return var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdp;II)I"
	)
	static int method3258(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field1396 -= var5 * var13.field1402;
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
		var13.field1396 += var13.field1402 * var5;
		var13.field1395 = var6;
		var13.field1390 = var7;
		var13.field1398 = var4;
		return var5;
	}
}
