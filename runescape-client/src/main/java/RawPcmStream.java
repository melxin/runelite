import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ap")
	static boolean field1363;
	@ObfuscatedName("aj")
	int field1371;
	@ObfuscatedName("an")
	int field1358;
	@ObfuscatedName("ai")
	int field1359;
	@ObfuscatedName("al")
	int field1370;
	@ObfuscatedName("ac")
	int field1368;
	@ObfuscatedName("aa")
	int field1362;
	@ObfuscatedName("am")
	int field1360;
	@ObfuscatedName("ah")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ag")
	@Export("start")
	int start;
	@ObfuscatedName("au")
	@Export("end")
	int end;
	@ObfuscatedName("ar")
	boolean field1367;
	@ObfuscatedName("ad")
	int field1357;
	@ObfuscatedName("af")
	int field1369;
	@ObfuscatedName("ak")
	int field1361;
	@ObfuscatedName("az")
	int field1365;

	static {
		field1363 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lds;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1367 = var1.field1292;
		this.field1358 = var2;
		this.field1359 = var3;
		this.field1370 = var4;
		this.field1371 = 0;
		this.method3012();
	}

	@ObfuscatedSignature(
		descriptor = "(Lds;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field1367 = var1.field1292;
		this.field1358 = var2;
		this.field1359 = var3;
		this.field1370 = 8192;
		this.field1371 = 0;
		this.method3012();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("am")
	protected int vmethod7122() {
		return this.field1359 == 0 && this.field1357 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ah")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field1359 == 0 && this.field1357 == 0) {
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
			if (this.field1371 < 0) {
				if (this.field1358 <= 0) {
					this.method3045();
					this.remove();
					return;
				}

				this.field1371 = 0;
			}

			if (this.field1371 >= var7) {
				if (this.field1358 >= 0) {
					this.method3045();
					this.remove();
					return;
				}

				this.field1371 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field1367) {
					if (this.field1358 < 0) {
						var9 = this.method3059(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field1371 >= var5) {
							return;
						}

						this.field1371 = var5 + var5 - 1 - this.field1371;
						this.field1358 = -this.field1358;
					}

					while (true) {
						var9 = this.method3042(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field1371 < var6) {
							return;
						}

						this.field1371 = var6 + var6 - 1 - this.field1371;
						this.field1358 = -this.field1358;
						var9 = this.method3059(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field1371 >= var5) {
							return;
						}

						this.field1371 = var5 + var5 - 1 - this.field1371;
						this.field1358 = -this.field1358;
					}
				} else if (this.field1358 < 0) {
					while (true) {
						var9 = this.method3059(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field1371 >= var5) {
							return;
						}

						this.field1371 = var6 - 1 - (var6 - 1 - this.field1371) % var8;
					}
				} else {
					while (true) {
						var9 = this.method3042(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field1371 < var6) {
							return;
						}

						this.field1371 = var5 + (this.field1371 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field1367) {
						label141: {
							if (this.field1358 < 0) {
								var9 = this.method3059(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field1371 >= var5) {
									return;
								}

								this.field1371 = var5 + var5 - 1 - this.field1371;
								this.field1358 = -this.field1358;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method3042(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field1371 < var6) {
									return;
								}

								this.field1371 = var6 + var6 - 1 - this.field1371;
								this.field1358 = -this.field1358;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method3059(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field1371 >= var5) {
									return;
								}

								this.field1371 = var5 + var5 - 1 - this.field1371;
								this.field1358 = -this.field1358;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field1358 < 0) {
							while (true) {
								var9 = this.method3059(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field1371 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field1371) / var8;
								if (var10 >= this.numLoops) {
									this.field1371 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1371 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method3042(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field1371 < var6) {
									return;
								}

								var10 = (this.field1371 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field1371 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field1371 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field1358 < 0) {
					this.method3059(var1, var9, 0, var3, 0);
					if (this.field1371 < 0) {
						this.field1371 = -1;
						this.method3045();
						this.remove();
					}
				} else {
					this.method3042(var1, var9, var7, var3, 0);
					if (this.field1371 >= var7) {
						this.field1371 = var7;
						this.method3045();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field1357 > 0) {
			if (var1 >= this.field1357) {
				if (this.field1359 == Integer.MIN_VALUE) {
					this.field1359 = 0;
					this.field1360 = 0;
					this.field1362 = 0;
					this.field1368 = 0;
					this.remove();
					var1 = this.field1357;
				}

				this.field1357 = 0;
				this.method3012();
			} else {
				this.field1368 += this.field1369 * var1;
				this.field1362 += this.field1361 * var1;
				this.field1360 += this.field1365 * var1;
				this.field1357 -= var1;
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

		if (this.field1371 < 0) {
			if (this.field1358 <= 0) {
				this.method3045();
				this.remove();
				return;
			}

			this.field1371 = 0;
		}

		if (this.field1371 >= var5) {
			if (this.field1358 >= 0) {
				this.method3045();
				this.remove();
				return;
			}

			this.field1371 = var5 - 1;
		}

		this.field1371 += this.field1358 * var1;
		if (this.numLoops < 0) {
			if (!this.field1367) {
				if (this.field1358 < 0) {
					if (this.field1371 >= var3) {
						return;
					}

					this.field1371 = var4 - 1 - (var4 - 1 - this.field1371) % var6;
				} else {
					if (this.field1371 < var4) {
						return;
					}

					this.field1371 = var3 + (this.field1371 - var3) % var6;
				}

			} else {
				if (this.field1358 < 0) {
					if (this.field1371 >= var3) {
						return;
					}

					this.field1371 = var3 + var3 - 1 - this.field1371;
					this.field1358 = -this.field1358;
				}

				while (this.field1371 >= var4) {
					this.field1371 = var4 + var4 - 1 - this.field1371;
					this.field1358 = -this.field1358;
					if (this.field1371 >= var3) {
						return;
					}

					this.field1371 = var3 + var3 - 1 - this.field1371;
					this.field1358 = -this.field1358;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field1367) {
					label143: {
						if (this.field1358 < 0) {
							if (this.field1371 >= var3) {
								return;
							}

							this.field1371 = var3 + var3 - 1 - this.field1371;
							this.field1358 = -this.field1358;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field1371 < var4) {
								return;
							}

							this.field1371 = var4 + var4 - 1 - this.field1371;
							this.field1358 = -this.field1358;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field1371 >= var3) {
								return;
							}

							this.field1371 = var3 + var3 - 1 - this.field1371;
							this.field1358 = -this.field1358;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field1358 < 0) {
						if (this.field1371 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field1371) / var6;
						if (var7 < this.numLoops) {
							this.field1371 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1371 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field1371 < var4) {
							return;
						}

						var7 = (this.field1371 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field1371 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field1371 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field1358 < 0) {
				if (this.field1371 < 0) {
					this.field1371 = -1;
					this.method3045();
					this.remove();
				}
			} else if (this.field1371 >= var5) {
				this.field1371 = var5;
				this.method3045();
				this.remove();
			}

		}
	}

	@ObfuscatedName("bf")
	void method3012() {
		this.field1368 = this.field1359;
		this.field1362 = method3076(this.field1359, this.field1370);
		this.field1360 = method3015(this.field1359, this.field1370);
	}

	@ObfuscatedName("bj")
	int vmethod3179() {
		int var1 = this.field1368 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field1371 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bt")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bd")
	synchronized void method3038(int var1, int var2) {
		this.field1359 = var1;
		this.field1370 = var2;
		this.field1357 = 0;
		this.method3012();
	}

	@ObfuscatedName("bs")
	public synchronized void method3039(int var1) {
		this.method3038(var1 << 6, this.method3152());
	}

	@ObfuscatedName("bn")
	public synchronized int method3040() {
		return this.field1359 == Integer.MIN_VALUE ? 0 : this.field1359;
	}

	@ObfuscatedName("bc")
	synchronized void method3071(int var1) {
		this.method3038(var1, this.method3152());
	}

	@ObfuscatedName("bg")
	public synchronized int method3152() {
		return this.field1370 < 0 ? -1 : this.field1370;
	}

	@ObfuscatedName("bb")
	public synchronized void method3043(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field1371 = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method3044() {
		this.field1358 = (this.field1358 ^ this.field1358 >> 31) + (this.field1358 >>> 31);
		this.field1358 = -this.field1358;
	}

	@ObfuscatedName("bz")
	void method3045() {
		if (this.field1357 != 0) {
			if (this.field1359 == Integer.MIN_VALUE) {
				this.field1359 = 0;
			}

			this.field1357 = 0;
			this.method3012();
		}

	}

	@ObfuscatedName("by")
	public synchronized void method3046(int var1, int var2) {
		this.method3047(var1, var2, this.method3152());
	}

	@ObfuscatedName("br")
	public synchronized void method3047(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method3038(var2, var3);
		} else {
			int var4 = method3076(var2, var3);
			int var5 = method3015(var2, var3);
			if (var4 == this.field1362 && var5 == this.field1360) {
				this.field1357 = 0;
			} else {
				int var6 = var2 - this.field1368;
				if (this.field1368 - var2 > var6) {
					var6 = this.field1368 - var2;
				}

				if (var4 - this.field1362 > var6) {
					var6 = var4 - this.field1362;
				}

				if (this.field1362 - var4 > var6) {
					var6 = this.field1362 - var4;
				}

				if (var5 - this.field1360 > var6) {
					var6 = var5 - this.field1360;
				}

				if (this.field1360 - var5 > var6) {
					var6 = this.field1360 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field1357 = var1;
				this.field1359 = var2;
				this.field1370 = var3;
				this.field1369 = (var2 - this.field1368) / var1;
				this.field1361 = (var4 - this.field1362) / var1;
				this.field1365 = (var5 - this.field1360) / var1;
			}
		}
	}

	@ObfuscatedName("bk")
	public synchronized void method3123(int var1) {
		if (var1 == 0) {
			this.method3071(0);
			this.remove();
		} else if (this.field1362 == 0 && this.field1360 == 0) {
			this.field1357 = 0;
			this.field1359 = 0;
			this.field1368 = 0;
			this.remove();
		} else {
			int var2 = -this.field1368;
			if (this.field1368 > var2) {
				var2 = this.field1368;
			}

			if (-this.field1362 > var2) {
				var2 = -this.field1362;
			}

			if (this.field1362 > var2) {
				var2 = this.field1362;
			}

			if (-this.field1360 > var2) {
				var2 = -this.field1360;
			}

			if (this.field1360 > var2) {
				var2 = this.field1360;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field1357 = var1;
			this.field1359 = Integer.MIN_VALUE;
			this.field1369 = -this.field1368 / var1;
			this.field1361 = -this.field1362 / var1;
			this.field1365 = -this.field1360 / var1;
		}
	}

	@ObfuscatedName("bh")
	public synchronized int method3049() {
		return this.field1358 < 0 ? -this.field1358 : this.field1358;
	}

	@ObfuscatedName("bp")
	public synchronized void method3053(int var1) {
		if (this.field1358 < 0) {
			this.field1358 = -var1;
		} else {
			this.field1358 = var1;
		}

	}

	@ObfuscatedName("ck")
	public boolean method3176() {
		return this.field1371 < 0 || this.field1371 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("cy")
	public boolean method3052() {
		return this.field1357 != 0;
	}

	@ObfuscatedName("ca")
	int method3042(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1357 > 0) {
				int var6 = var2 + this.field1357;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1357 += var2;
				if (this.field1358 == 256 && (this.field1371 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method3055(0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, this.field1361, this.field1365, 0, var6, var3, this);
					} else {
						var2 = method3026(((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, this.field1369, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method3035(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, this.field1361, this.field1365, 0, var6, var3, this, this.field1358, var5);
				} else {
					var2 = method3030(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, this.field1369, 0, var6, var3, this, this.field1358, var5);
				}

				this.field1357 -= var2;
				if (this.field1357 != 0) {
					return var2;
				}

				if (!this.method3060()) {
					continue;
				}

				return var4;
			}

			if (this.field1358 == 256 && (this.field1371 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method3019(0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, 0, var4, var3, this, ((RawSound)super.sound).method2890());
				}

				return method3135(((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method3023(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, 0, var4, var3, this, this.field1358, var5);
			}

			return method3022(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, 0, var4, var3, this, this.field1358, var5);
		}
	}

	@ObfuscatedName("cr")
	int method3059(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field1357 > 0) {
				int var6 = var2 + this.field1357;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field1357 += var2;
				if (this.field1358 == -256 && (this.field1371 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method3131(0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, this.field1361, this.field1365, 0, var6, var3, this);
					} else {
						var2 = method3028(((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, this.field1369, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method3033(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, this.field1361, this.field1365, 0, var6, var3, this, this.field1358, var5);
				} else {
					var2 = method3032(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, this.field1369, 0, var6, var3, this, this.field1358, var5);
				}

				this.field1357 -= var2;
				if (this.field1357 != 0) {
					return var2;
				}

				if (!this.method3060()) {
					continue;
				}

				return var4;
			}

			if (this.field1358 == -256 && (this.field1371 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method3021(0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, 0, var4, var3, this);
				}

				return method3020(((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method3025(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1362, this.field1360, 0, var4, var3, this, this.field1358, var5);
			}

			return method3170(0, 0, ((RawSound)super.sound).samples, var1, this.field1371, var2, this.field1368, 0, var4, var3, this, this.field1358, var5);
		}
	}

	@ObfuscatedName("cu")
	boolean method3060() {
		int var1 = this.field1359;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method3076(var1, this.field1370);
			var3 = method3015(var1, this.field1370);
		}

		if (var1 == this.field1368 && var2 == this.field1362 && var3 == this.field1360) {
			if (this.field1359 == Integer.MIN_VALUE) {
				this.field1359 = 0;
				this.field1360 = 0;
				this.field1362 = 0;
				this.field1368 = 0;
				this.remove();
				return true;
			} else {
				this.method3012();
				return false;
			}
		} else {
			if (this.field1368 < var1) {
				this.field1369 = 1;
				this.field1357 = var1 - this.field1368;
			} else if (this.field1368 > var1) {
				this.field1369 = -1;
				this.field1357 = this.field1368 - var1;
			} else {
				this.field1369 = 0;
			}

			if (this.field1362 < var2) {
				this.field1361 = 1;
				if (this.field1357 == 0 || this.field1357 > var2 - this.field1362) {
					this.field1357 = var2 - this.field1362;
				}
			} else if (this.field1362 > var2) {
				this.field1361 = -1;
				if (this.field1357 == 0 || this.field1357 > this.field1362 - var2) {
					this.field1357 = this.field1362 - var2;
				}
			} else {
				this.field1361 = 0;
			}

			if (this.field1360 < var3) {
				this.field1365 = 1;
				if (this.field1357 == 0 || this.field1357 > var3 - this.field1360) {
					this.field1357 = var3 - this.field1360;
				}
			} else if (this.field1360 > var3) {
				this.field1365 = -1;
				if (this.field1357 == 0 || this.field1357 > this.field1360 - var3) {
					this.field1357 = this.field1360 - var3;
				}
			} else {
				this.field1365 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ap")
	static int method3076(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aj")
	static int method3015(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lds;II)Ldw;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(UserComparator3.field1521 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lds;III)Ldw;"
	)
	public static RawPcmStream method3017(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdw;)I"
	)
	static int method3135(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		if (field1363) {
			method3034("wave_stream.doMixForwards1To1Mono");
		}

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

		var8.field1371 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdw;Z)I"
	)
	static int method3019(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
		if (field1363) {
			method3034("wave_stream.doMixForwards1To1Stereo");
		}

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

		var10.field1371 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILdw;)I"
	)
	static int method3020(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		if (field1363) {
			method3034("wave_stream.doMixBackwards1To1Mono");
		}

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

		var8.field1371 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILdw;)I"
	)
	static int method3021(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		if (field1363) {
			method3034("wave_stream.doMixBackwards1To1Stereo");
		}

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

		var10.field1371 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdw;II)I"
	)
	static int method3022(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (field1363) {
			method3034("wave_stream.doMixForwardsMono");
		}

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

		var10.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdw;II)I"
	)
	static int method3023(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field1363) {
			method3034("wave_stream.doMixForwardsStereo");
		}

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

		var11.field1371 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILdw;II)I"
	)
	static int method3170(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (field1363) {
			method3034("wave_stream.doMixBackwardsMono");
		}

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

		var10.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdw;II)I"
	)
	static int method3025(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field1363) {
			method3034("wave_stream.doMixBackwardsStereo");
		}

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

		var11.field1371 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdw;)I"
	)
	static int method3026(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		if (field1363) {
			method3034("wave_stream.doMixForwards1To1RampMono");
		}

		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field1362 += var9.field1361 * (var6 - var3);
		var9.field1360 += var9.field1365 * (var6 - var3);

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
		var9.field1371 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdw;)I"
	)
	static int method3055(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		if (field1363) {
			method3034("wave_stream.doMixForwards1To1RampStereo");
		}

		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field1368 += var12.field1369 * (var9 - var4);
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

		var12.field1362 = var5;
		var12.field1360 = var6;
		var12.field1371 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILdw;)I"
	)
	static int method3028(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		if (field1363) {
			method3034("wave_stream.doMixBackwards1To1RampMono");
		}

		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field1362 += var9.field1361 * (var6 - var3);
		var9.field1360 += var9.field1365 * (var6 - var3);

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
		var9.field1371 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILdw;)I"
	)
	static int method3131(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		if (field1363) {
			method3034("wave_stream.doMixBackwards1To1RampStereo");
		}

		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field1368 += var12.field1369 * (var9 - var4);
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

		var12.field1362 = var5;
		var12.field1360 = var6;
		var12.field1371 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdw;II)I"
	)
	static int method3030(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field1363) {
			method3034("wave_stream.doMixForwardsRampMono");
		}

		var11.field1362 -= var11.field1361 * var5;
		var11.field1360 -= var11.field1365 * var5;
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

		var11.field1362 += var11.field1361 * var5;
		var11.field1360 += var11.field1365 * var5;
		var11.field1368 = var6;
		var11.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdw;II)I"
	)
	static int method3035(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		if (field1363) {
			method3034("wave_stream.doMixForwardsRampStereo");
		}

		var13.field1368 -= var5 * var13.field1369;
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
		var13.field1368 += var13.field1369 * var5;
		var13.field1362 = var6;
		var13.field1360 = var7;
		var13.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILdw;II)I"
	)
	static int method3032(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field1363) {
			method3034("wave_stream.doMixBackwardsRampMono");
		}

		var11.field1362 -= var11.field1361 * var5;
		var11.field1360 -= var11.field1365 * var5;
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

		var11.field1362 += var11.field1361 * var5;
		var11.field1360 += var11.field1365 * var5;
		var11.field1368 = var6;
		var11.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILdw;II)I"
	)
	static int method3033(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		if (field1363) {
			method3034("wave_stream.doMixBackwardsRampStereo");
		}

		var13.field1368 -= var5 * var13.field1369;
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
		var13.field1368 += var13.field1369 * var5;
		var13.field1362 = var6;
		var13.field1360 = var7;
		var13.field1371 = var4;
		return var5;
	}

	@ObfuscatedName("bw")
	static void method3034(String var0) {
		System.out.println(var0);
	}
}
