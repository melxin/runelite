import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ao")
	static boolean field319;
	@ObfuscatedName("an")
	int field316;
	@ObfuscatedName("ae")
	int field317;
	@ObfuscatedName("af")
	int field321;
	@ObfuscatedName("as")
	int field315;
	@ObfuscatedName("aq")
	int field328;
	@ObfuscatedName("av")
	int field325;
	@ObfuscatedName("am")
	int field322;
	@ObfuscatedName("aa")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ap")
	@Export("start")
	int start;
	@ObfuscatedName("ax")
	@Export("end")
	int end;
	@ObfuscatedName("aw")
	boolean field318;
	@ObfuscatedName("ar")
	int field327;
	@ObfuscatedName("au")
	int field320;
	@ObfuscatedName("aj")
	int field329;
	@ObfuscatedName("al")
	int field330;

	static {
		field319 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbj;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field318 = var1.field243;
		this.field317 = var2;
		this.field321 = var3;
		this.field315 = var4;
		this.field316 = 0;
		this.method915();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbj;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field318 = var1.field243;
		this.field317 = var2;
		this.field321 = var3;
		this.field315 = 8192;
		this.field316 = 0;
		this.method915();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("am")
	protected int vmethod6832() {
		return this.field321 == 0 && this.field327 == 0 ? 0 : 1;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field321 == 0 && this.field327 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.field240.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field316 < 0) {
				if (this.field317 <= 0) {
					this.method962();
					this.remove();
					return;
				}

				this.field316 = 0;
			}

			if (this.field316 >= var7) {
				if (this.field317 >= 0) {
					this.method962();
					this.remove();
					return;
				}

				this.field316 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field318) {
					if (this.field317 < 0) {
						var9 = this.method965(var1, var2, var5, var3, var4.field240[this.start]);
						if (this.field316 >= var5) {
							return;
						}

						this.field316 = var5 + var5 - 1 - this.field316;
						this.field317 = -this.field317;
					}

					while (true) {
						var9 = this.method941(var1, var9, var6, var3, var4.field240[this.end - 1]);
						if (this.field316 < var6) {
							return;
						}

						this.field316 = var6 + var6 - 1 - this.field316;
						this.field317 = -this.field317;
						var9 = this.method965(var1, var9, var5, var3, var4.field240[this.start]);
						if (this.field316 >= var5) {
							return;
						}

						this.field316 = var5 + var5 - 1 - this.field316;
						this.field317 = -this.field317;
					}
				} else if (this.field317 < 0) {
					while (true) {
						var9 = this.method965(var1, var9, var5, var3, var4.field240[this.end - 1]);
						if (this.field316 >= var5) {
							return;
						}

						this.field316 = var6 - 1 - (var6 - 1 - this.field316) % var8;
					}
				} else {
					while (true) {
						var9 = this.method941(var1, var9, var6, var3, var4.field240[this.start]);
						if (this.field316 < var6) {
							return;
						}

						this.field316 = var5 + (this.field316 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field318) {
						label141: {
							if (this.field317 < 0) {
								var9 = this.method965(var1, var2, var5, var3, var4.field240[this.start]);
								if (this.field316 >= var5) {
									return;
								}

								this.field316 = var5 + var5 - 1 - this.field316;
								this.field317 = -this.field317;
								if (--this.numLoops == 0) {
									break label141;
								}
							}

							do {
								var9 = this.method941(var1, var9, var6, var3, var4.field240[this.end - 1]);
								if (this.field316 < var6) {
									return;
								}

								this.field316 = var6 + var6 - 1 - this.field316;
								this.field317 = -this.field317;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method965(var1, var9, var5, var3, var4.field240[this.start]);
								if (this.field316 >= var5) {
									return;
								}

								this.field316 = var5 + var5 - 1 - this.field316;
								this.field317 = -this.field317;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field317 < 0) {
							while (true) {
								var9 = this.method965(var1, var9, var5, var3, var4.field240[this.end - 1]);
								if (this.field316 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field316) / var8;
								if (var10 >= this.numLoops) {
									this.field316 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field316 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method941(var1, var9, var6, var3, var4.field240[this.start]);
								if (this.field316 < var6) {
									return;
								}

								var10 = (this.field316 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field316 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field316 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field317 < 0) {
					this.method965(var1, var9, 0, var3, 0);
					if (this.field316 < 0) {
						this.field316 = -1;
						this.method962();
						this.remove();
					}
				} else {
					this.method941(var1, var9, var7, var3, 0);
					if (this.field316 >= var7) {
						this.field316 = var7;
						this.method962();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field327 > 0) {
			if (var1 >= this.field327) {
				if (this.field321 == Integer.MIN_VALUE) {
					this.field321 = 0;
					this.field322 = 0;
					this.field325 = 0;
					this.field328 = 0;
					this.remove();
					var1 = this.field327;
				}

				this.field327 = 0;
				this.method915();
			} else {
				this.field328 += this.field320 * var1;
				this.field325 += this.field329 * var1;
				this.field322 += this.field330 * var1;
				this.field327 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.field240.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field316 < 0) {
			if (this.field317 <= 0) {
				this.method962();
				this.remove();
				return;
			}

			this.field316 = 0;
		}

		if (this.field316 >= var5) {
			if (this.field317 >= 0) {
				this.method962();
				this.remove();
				return;
			}

			this.field316 = var5 - 1;
		}

		this.field316 += this.field317 * var1;
		if (this.numLoops < 0) {
			if (!this.field318) {
				if (this.field317 < 0) {
					if (this.field316 >= var3) {
						return;
					}

					this.field316 = var4 - 1 - (var4 - 1 - this.field316) % var6;
				} else {
					if (this.field316 < var4) {
						return;
					}

					this.field316 = var3 + (this.field316 - var3) % var6;
				}

			} else {
				if (this.field317 < 0) {
					if (this.field316 >= var3) {
						return;
					}

					this.field316 = var3 + var3 - 1 - this.field316;
					this.field317 = -this.field317;
				}

				while (this.field316 >= var4) {
					this.field316 = var4 + var4 - 1 - this.field316;
					this.field317 = -this.field317;
					if (this.field316 >= var3) {
						return;
					}

					this.field316 = var3 + var3 - 1 - this.field316;
					this.field317 = -this.field317;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field318) {
					label143: {
						if (this.field317 < 0) {
							if (this.field316 >= var3) {
								return;
							}

							this.field316 = var3 + var3 - 1 - this.field316;
							this.field317 = -this.field317;
							if (--this.numLoops == 0) {
								break label143;
							}
						}

						do {
							if (this.field316 < var4) {
								return;
							}

							this.field316 = var4 + var4 - 1 - this.field316;
							this.field317 = -this.field317;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field316 >= var3) {
								return;
							}

							this.field316 = var3 + var3 - 1 - this.field316;
							this.field317 = -this.field317;
						} while(--this.numLoops != 0);
					}
				} else {
					int var7;
					if (this.field317 < 0) {
						if (this.field316 >= var3) {
							return;
						}

						var7 = (var4 - 1 - this.field316) / var6;
						if (var7 < this.numLoops) {
							this.field316 += var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field316 += var6 * this.numLoops;
						this.numLoops = 0;
					} else {
						if (this.field316 < var4) {
							return;
						}

						var7 = (this.field316 - var3) / var6;
						if (var7 < this.numLoops) {
							this.field316 -= var6 * var7;
							this.numLoops -= var7;
							return;
						}

						this.field316 -= var6 * this.numLoops;
						this.numLoops = 0;
					}
				}
			}

			if (this.field317 < 0) {
				if (this.field316 < 0) {
					this.field316 = -1;
					this.method962();
					this.remove();
				}
			} else if (this.field316 >= var5) {
				this.field316 = var5;
				this.method962();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ba")
	void method915() {
		this.field328 = this.field321;
		this.field325 = method893(this.field321, this.field315);
		this.field322 = method894(this.field321, this.field315);
	}

	@ObfuscatedName("bk")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("bu")
	synchronized void method917(int var1, int var2) {
		this.field321 = var1;
		this.field315 = var2;
		this.field327 = 0;
		this.method915();
	}

	@ObfuscatedName("bc")
	int vmethod1046() {
		int var1 = this.field328 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field316 / (((RawSound)super.sound).field240.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).field240.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bs")
	public synchronized void method918(int var1) {
		this.method917(var1 << 6, this.method921());
	}

	@ObfuscatedName("bx")
	public synchronized int method983() {
		return this.field321 == Integer.MIN_VALUE ? 0 : this.field321;
	}

	@ObfuscatedName("bj")
	synchronized void method920(int var1) {
		this.method917(var1, this.method921());
	}

	@ObfuscatedName("bv")
	public synchronized int method921() {
		return this.field315 < 0 ? -1 : this.field315;
	}

	@ObfuscatedName("be")
	public synchronized void method922(int var1) {
		int var2 = ((RawSound)super.sound).field240.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field316 = var1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method923() {
		this.field317 = (this.field317 ^ this.field317 >> 31) + (this.field317 >>> 31);
		this.field317 = -this.field317;
	}

	@ObfuscatedName("bq")
	void method962() {
		if (this.field327 != 0) {
			if (this.field321 == Integer.MIN_VALUE) {
				this.field321 = 0;
			}

			this.field327 = 0;
			this.method915();
		}

	}

	@ObfuscatedName("bt")
	public synchronized void method925(int var1, int var2) {
		this.method926(var1, var2, this.method921());
	}

	@ObfuscatedName("bn")
	public synchronized void method926(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method917(var2, var3);
		} else {
			int var4 = method893(var2, var3);
			int var5 = method894(var2, var3);
			if (var4 == this.field325 && var5 == this.field322) {
				this.field327 = 0;
			} else {
				int var6 = var2 - this.field328;
				if (this.field328 - var2 > var6) {
					var6 = this.field328 - var2;
				}

				if (var4 - this.field325 > var6) {
					var6 = var4 - this.field325;
				}

				if (this.field325 - var4 > var6) {
					var6 = this.field325 - var4;
				}

				if (var5 - this.field322 > var6) {
					var6 = var5 - this.field322;
				}

				if (this.field322 - var5 > var6) {
					var6 = this.field322 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field327 = var1;
				this.field321 = var2;
				this.field315 = var3;
				this.field320 = (var2 - this.field328) / var1;
				this.field329 = (var4 - this.field325) / var1;
				this.field330 = (var5 - this.field322) / var1;
			}
		}
	}

	@ObfuscatedName("bo")
	public synchronized void method927(int var1) {
		if (var1 == 0) {
			this.method920(0);
			this.remove();
		} else if (this.field325 == 0 && this.field322 == 0) {
			this.field327 = 0;
			this.field321 = 0;
			this.field328 = 0;
			this.remove();
		} else {
			int var2 = -this.field328;
			if (this.field328 > var2) {
				var2 = this.field328;
			}

			if (-this.field325 > var2) {
				var2 = -this.field325;
			}

			if (this.field325 > var2) {
				var2 = this.field325;
			}

			if (-this.field322 > var2) {
				var2 = -this.field322;
			}

			if (this.field322 > var2) {
				var2 = this.field322;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field327 = var1;
			this.field321 = Integer.MIN_VALUE;
			this.field320 = -this.field328 / var1;
			this.field329 = -this.field325 / var1;
			this.field330 = -this.field322 / var1;
		}
	}

	@ObfuscatedName("bg")
	public synchronized int method928() {
		return this.field317 < 0 ? -this.field317 : this.field317;
	}

	@ObfuscatedName("by")
	public synchronized void method1043(int var1) {
		if (this.field317 < 0) {
			this.field317 = -var1;
		} else {
			this.field317 = var1;
		}

	}

	@ObfuscatedName("bf")
	public boolean method930() {
		return this.field316 < 0 || this.field316 >= ((RawSound)super.sound).field240.length << 8;
	}

	@ObfuscatedName("bi")
	public boolean method1011() {
		return this.field327 != 0;
	}

	@ObfuscatedName("ci")
	int method941(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field327 > 0) {
				int var6 = var2 + this.field327;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field327 += var2;
				if (this.field317 == 256 && (this.field316 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method914(0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, this.field329, this.field330, 0, var6, var3, this);
					} else {
						var2 = method1027(((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, this.field320, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method998(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, this.field329, this.field330, 0, var6, var3, this, this.field317, var5);
				} else {
					var2 = method909(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, this.field320, 0, var6, var3, this, this.field317, var5);
				}

				this.field327 -= var2;
				if (this.field327 != 0) {
					return var2;
				}

				if (!this.method939()) {
					continue;
				}

				return var4;
			}

			if (this.field317 == 256 && (this.field316 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method898(0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, 0, var4, var3, this, ((RawSound)super.sound).method769());
				}

				return method960(((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method969(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, 0, var4, var3, this, this.field317, var5);
			}

			return method901(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, 0, var4, var3, this, this.field317, var5);
		}
	}

	@ObfuscatedName("cg")
	int method965(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field327 > 0) {
				int var6 = var2 + this.field327;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field327 += var2;
				if (this.field317 == -256 && (this.field316 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method897(0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, this.field329, this.field330, 0, var6, var3, this);
					} else {
						var2 = method1039(((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, this.field320, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method912(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, this.field329, this.field330, 0, var6, var3, this, this.field317, var5);
				} else {
					var2 = method911(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, this.field320, 0, var6, var3, this, this.field317, var5);
				}

				this.field327 -= var2;
				if (this.field327 != 0) {
					return var2;
				}

				if (!this.method939()) {
					continue;
				}

				return var4;
			}

			if (this.field317 == -256 && (this.field316 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method1037(0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, 0, var4, var3, this);
				}

				return method899(((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method908(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field325, this.field322, 0, var4, var3, this, this.field317, var5);
			}

			return method903(0, 0, ((RawSound)super.sound).field240, var1, this.field316, var2, this.field328, 0, var4, var3, this, this.field317, var5);
		}
	}

	@ObfuscatedName("cq")
	boolean method939() {
		int var1 = this.field321;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method893(var1, this.field315);
			var3 = method894(var1, this.field315);
		}

		if (var1 == this.field328 && var2 == this.field325 && var3 == this.field322) {
			if (this.field321 == Integer.MIN_VALUE) {
				this.field321 = 0;
				this.field322 = 0;
				this.field325 = 0;
				this.field328 = 0;
				this.remove();
				return true;
			} else {
				this.method915();
				return false;
			}
		} else {
			if (this.field328 < var1) {
				this.field320 = 1;
				this.field327 = var1 - this.field328;
			} else if (this.field328 > var1) {
				this.field320 = -1;
				this.field327 = this.field328 - var1;
			} else {
				this.field320 = 0;
			}

			if (this.field325 < var2) {
				this.field329 = 1;
				if (this.field327 == 0 || this.field327 > var2 - this.field325) {
					this.field327 = var2 - this.field325;
				}
			} else if (this.field325 > var2) {
				this.field329 = -1;
				if (this.field327 == 0 || this.field327 > this.field325 - var2) {
					this.field327 = this.field325 - var2;
				}
			} else {
				this.field329 = 0;
			}

			if (this.field322 < var3) {
				this.field330 = 1;
				if (this.field327 == 0 || this.field327 > var3 - this.field322) {
					this.field327 = var3 - this.field322;
				}
			} else if (this.field322 > var3) {
				this.field330 = -1;
				if (this.field327 == 0 || this.field327 > this.field322 - var3) {
					this.field327 = this.field322 - var3;
				}
			} else {
				this.field330 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ao")
	static int method893(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("an")
	static int method894(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbj;II)Lbg;"
	)
	public static RawPcmStream method895(RawSound var0, int var1, int var2) {
		return var0.field240 != null && var0.field240.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class4.field7 * 1549808192)), var2 << 6) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbj;III)Lbg;"
	)
	public static RawPcmStream method896(RawSound var0, int var1, int var2, int var3) {
		return var0.field240 != null && var0.field240.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILbg;)I"
	)
	static int method960(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		if (field319) {
			method913("wave_stream.doMixForwards1To1Mono");
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

		var8.field316 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILbg;Z)I"
	)
	static int method898(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, boolean var11) {
		if (field319) {
			method913("wave_stream.doMixForwards1To1Stereo");
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

		var10.field316 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIILbg;)I"
	)
	static int method899(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		if (field319) {
			method913("wave_stream.doMixBackwards1To1Mono");
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

		var8.field316 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIILbg;)I"
	)
	static int method1037(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		if (field319) {
			method913("wave_stream.doMixBackwards1To1Stereo");
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

		var10.field316 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILbg;II)I"
	)
	static int method901(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (field319) {
			method913("wave_stream.doMixForwardsMono");
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

		var10.field316 = var4;
		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILbg;II)I"
	)
	static int method969(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field319) {
			method913("wave_stream.doMixForwardsStereo");
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

		var11.field316 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIILbg;II)I"
	)
	static int method903(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (field319) {
			method913("wave_stream.doMixBackwardsMono");
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

		var10.field316 = var4;
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILbg;II)I"
	)
	static int method908(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field319) {
			method913("wave_stream.doMixBackwardsStereo");
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

		var11.field316 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILbg;)I"
	)
	static int method1027(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		if (field319) {
			method913("wave_stream.doMixForwards1To1RampMono");
		}

		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field325 += var9.field329 * (var6 - var3);
		var9.field322 += var9.field330 * (var6 - var3);

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

		var9.field328 = var4 >> 2;
		var9.field316 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILbg;)I"
	)
	static int method914(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		if (field319) {
			method913("wave_stream.doMixForwards1To1RampStereo");
		}

		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field328 += var12.field320 * (var9 - var4);
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

		var12.field325 = var5;
		var12.field322 = var6;
		var12.field316 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([S[IIIIIIIILbg;)I"
	)
	static int method1039(short[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		if (field319) {
			method913("wave_stream.doMixBackwards1To1RampMono");
		}

		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field325 += var9.field329 * (var6 - var3);
		var9.field322 += var9.field330 * (var6 - var3);

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

		var9.field328 = var4 >> 2;
		var9.field316 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I[S[IIIIIIIIIILbg;)I"
	)
	static int method897(int var0, short[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		if (field319) {
			method913("wave_stream.doMixBackwards1To1RampStereo");
		}

		var3 >>= 8;
		var11 >>= 8;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field328 += var12.field320 * (var9 - var4);
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

		var12.field325 = var5;
		var12.field322 = var6;
		var12.field316 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILbg;II)I"
	)
	static int method909(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field319) {
			method913("wave_stream.doMixForwardsRampMono");
		}

		var11.field325 -= var11.field329 * var5;
		var11.field322 -= var11.field330 * var5;
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

		var11.field325 += var11.field329 * var5;
		var11.field322 += var11.field330 * var5;
		var11.field328 = var6;
		var11.field316 = var4;
		return var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILbg;II)I"
	)
	static int method998(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		if (field319) {
			method913("wave_stream.doMixForwardsRampStereo");
		}

		var13.field328 -= var5 * var13.field320;
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
		var13.field328 += var13.field320 * var5;
		var13.field325 = var6;
		var13.field322 = var7;
		var13.field316 = var4;
		return var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIILbg;II)I"
	)
	static int method911(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (field319) {
			method913("wave_stream.doMixBackwardsRampMono");
		}

		var11.field325 -= var11.field329 * var5;
		var11.field322 -= var11.field330 * var5;
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

		var11.field325 += var11.field329 * var5;
		var11.field322 += var11.field330 * var5;
		var11.field328 = var6;
		var11.field316 = var4;
		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II[S[IIIIIIIIIILbg;II)I"
	)
	static int method912(int var0, int var1, short[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		if (field319) {
			method913("wave_stream.doMixBackwardsRampStereo");
		}

		var13.field328 -= var5 * var13.field320;
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
		var13.field328 += var13.field320 * var5;
		var13.field325 = var6;
		var13.field322 = var7;
		var13.field316 = var4;
		return var5;
	}

	@ObfuscatedName("bh")
	static void method913(String var0) {
		System.out.println(var0);
	}
}
