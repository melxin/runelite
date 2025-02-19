import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	int field333;
	@ObfuscatedName("ay")
	int field341;
	@ObfuscatedName("au")
	int field328;
	@ObfuscatedName("ad")
	int field330;
	@ObfuscatedName("ah")
	int field331;
	@ObfuscatedName("ac")
	int field332;
	@ObfuscatedName("ao")
	int field339;
	@ObfuscatedName("af")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("aa")
	@Export("start")
	int start;
	@ObfuscatedName("as")
	@Export("end")
	int end;
	@ObfuscatedName("ae")
	boolean field337;
	@ObfuscatedName("ax")
	int field338;
	@ObfuscatedName("ai")
	int field329;
	@ObfuscatedName("ak")
	int field340;
	@ObfuscatedName("aj")
	int field336;

	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field256;
		this.field341 = var2;
		this.field328 = var3;
		this.field330 = var4;
		this.field333 = 0;
		this.method867();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbq;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field256;
		this.field341 = var2;
		this.field328 = var3;
		this.field330 = 8192;
		this.field333 = 0;
		this.method867();
	}

	@ObfuscatedName("ah")
	void method867() {
		this.field331 = this.field328;
		this.field332 = method864(this.field328, this.field330);
		this.field339 = method908(this.field328, this.field330);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("af")
	protected int vmethod6801() {
		return this.field328 == 0 && this.field338 == 0 ? 0 : 1;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field328 == 0 && this.field338 == 0) {
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
			if (this.field333 < 0) {
				if (this.field341 <= 0) {
					this.method876();
					this.remove();
					return;
				}

				this.field333 = 0;
			}

			if (this.field333 >= var7) {
				if (this.field341 >= 0) {
					this.method876();
					this.remove();
					return;
				}

				this.field333 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field337) {
					if (this.field341 < 0) {
						var9 = this.method890(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field333 >= var5) {
							return;
						}

						this.field333 = var5 + var5 - 1 - this.field333;
						this.field341 = -this.field341;
					}

					while (true) {
						var9 = this.method1023(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field333 < var6) {
							return;
						}

						this.field333 = var6 + var6 - 1 - this.field333;
						this.field341 = -this.field341;
						var9 = this.method890(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field333 >= var5) {
							return;
						}

						this.field333 = var5 + var5 - 1 - this.field333;
						this.field341 = -this.field341;
					}
				} else if (this.field341 < 0) {
					while (true) {
						var9 = this.method890(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field333 >= var5) {
							return;
						}

						this.field333 = var6 - 1 - (var6 - 1 - this.field333) % var8;
					}
				} else {
					while (true) {
						var9 = this.method1023(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field333 < var6) {
							return;
						}

						this.field333 = var5 + (this.field333 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field337) {
						label127: {
							if (this.field341 < 0) {
								var9 = this.method890(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field333 >= var5) {
									return;
								}

								this.field333 = var5 + var5 - 1 - this.field333;
								this.field341 = -this.field341;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method1023(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field333 < var6) {
									return;
								}

								this.field333 = var6 + var6 - 1 - this.field333;
								this.field341 = -this.field341;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method890(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field333 >= var5) {
									return;
								}

								this.field333 = var5 + var5 - 1 - this.field333;
								this.field341 = -this.field341;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field341 < 0) {
							while (true) {
								var9 = this.method890(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field333 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field333) / var8;
								if (var10 >= this.numLoops) {
									this.field333 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field333 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method1023(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field333 < var6) {
									return;
								}

								var10 = (this.field333 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field333 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field333 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field341 < 0) {
					this.method890(var1, var9, 0, var3, 0);
					if (this.field333 < 0) {
						this.field333 = -1;
						this.method876();
						this.remove();
					}
				} else {
					this.method1023(var1, var9, var7, var3, 0);
					if (this.field333 >= var7) {
						this.field333 = var7;
						this.method876();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("as")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ae")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field338 > 0) {
			if (var1 >= this.field338) {
				if (this.field328 == Integer.MIN_VALUE) {
					this.field328 = 0;
					this.field339 = 0;
					this.field332 = 0;
					this.field331 = 0;
					this.remove();
					var1 = this.field338;
				}

				this.field338 = 0;
				this.method867();
			} else {
				this.field331 += this.field329 * var1;
				this.field332 += this.field340 * var1;
				this.field339 += this.field336 * var1;
				this.field338 -= var1;
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

		if (this.field333 < 0) {
			if (this.field341 <= 0) {
				this.method876();
				this.remove();
				return;
			}

			this.field333 = 0;
		}

		if (this.field333 >= var5) {
			if (this.field341 >= 0) {
				this.method876();
				this.remove();
				return;
			}

			this.field333 = var5 - 1;
		}

		this.field333 += this.field341 * var1;
		if (this.numLoops < 0) {
			if (!this.field337) {
				if (this.field341 < 0) {
					if (this.field333 >= var3) {
						return;
					}

					this.field333 = var4 - 1 - (var4 - 1 - this.field333) % var6;
				} else {
					if (this.field333 < var4) {
						return;
					}

					this.field333 = var3 + (this.field333 - var3) % var6;
				}

			} else {
				if (this.field341 < 0) {
					if (this.field333 >= var3) {
						return;
					}

					this.field333 = var3 + var3 - 1 - this.field333;
					this.field341 = -this.field341;
				}

				while (this.field333 >= var4) {
					this.field333 = var4 + var4 - 1 - this.field333;
					this.field341 = -this.field341;
					if (this.field333 >= var3) {
						return;
					}

					this.field333 = var3 + var3 - 1 - this.field333;
					this.field341 = -this.field341;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field337) {
					label129: {
						if (this.field341 < 0) {
							if (this.field333 >= var3) {
								return;
							}

							this.field333 = var3 + var3 - 1 - this.field333;
							this.field341 = -this.field341;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field333 < var4) {
								return;
							}

							this.field333 = var4 + var4 - 1 - this.field333;
							this.field341 = -this.field341;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field333 >= var3) {
								return;
							}

							this.field333 = var3 + var3 - 1 - this.field333;
							this.field341 = -this.field341;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field341 < 0) {
							if (this.field333 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field333) / var6;
							if (var7 >= this.numLoops) {
								this.field333 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field333 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field333 < var4) {
								return;
							}

							var7 = (this.field333 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field333 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field333 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field341 < 0) {
				if (this.field333 < 0) {
					this.field333 = -1;
					this.method876();
					this.remove();
				}
			} else if (this.field333 >= var5) {
				this.field333 = var5;
				this.method876();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ax")
	public synchronized void method869(int var1) {
		this.method893(var1 << 6, this.method966());
	}

	@ObfuscatedName("ai")
	synchronized void method870(int var1) {
		this.method893(var1, this.method966());
	}

	@ObfuscatedName("ak")
	synchronized void method893(int var1, int var2) {
		this.field328 = var1;
		this.field330 = var2;
		this.field338 = 0;
		this.method867();
	}

	@ObfuscatedName("aj")
	public synchronized int method872() {
		return this.field328 == Integer.MIN_VALUE ? 0 : this.field328;
	}

	@ObfuscatedName("av")
	public synchronized int method966() {
		return this.field330 < 0 ? -1 : this.field330;
	}

	@ObfuscatedName("ar")
	public synchronized void method874(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field333 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method875() {
		this.field341 = (this.field341 ^ this.field341 >> 31) + (this.field341 >>> 31);
		this.field341 = -this.field341;
	}

	@ObfuscatedName("az")
	void method876() {
		if (this.field338 != 0) {
			if (this.field328 == Integer.MIN_VALUE) {
				this.field328 = 0;
			}

			this.field338 = 0;
			this.method867();
		}

	}

	@ObfuscatedName("am")
	public synchronized void method904(int var1, int var2) {
		this.method957(var1, var2, this.method966());
	}

	@ObfuscatedName("aq")
	public synchronized void method957(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method893(var2, var3);
		} else {
			int var4 = method864(var2, var3);
			int var5 = method908(var2, var3);
			if (var4 == this.field332 && var5 == this.field339) {
				this.field338 = 0;
			} else {
				int var6 = var2 - this.field331;
				if (this.field331 - var2 > var6) {
					var6 = this.field331 - var2;
				}

				if (var4 - this.field332 > var6) {
					var6 = var4 - this.field332;
				}

				if (this.field332 - var4 > var6) {
					var6 = this.field332 - var4;
				}

				if (var5 - this.field339 > var6) {
					var6 = var5 - this.field339;
				}

				if (this.field339 - var5 > var6) {
					var6 = this.field339 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field338 = var1;
				this.field328 = var2;
				this.field330 = var3;
				this.field329 = (var2 - this.field331) / var1;
				this.field340 = (var4 - this.field332) / var1;
				this.field336 = (var5 - this.field339) / var1;
			}
		}
	}

	@ObfuscatedName("aw")
	public synchronized void method879(int var1) {
		if (var1 == 0) {
			this.method870(0);
			this.remove();
		} else if (this.field332 == 0 && this.field339 == 0) {
			this.field338 = 0;
			this.field328 = 0;
			this.field331 = 0;
			this.remove();
		} else {
			int var2 = -this.field331;
			if (this.field331 > var2) {
				var2 = this.field331;
			}

			if (-this.field332 > var2) {
				var2 = -this.field332;
			}

			if (this.field332 > var2) {
				var2 = this.field332;
			}

			if (-this.field339 > var2) {
				var2 = -this.field339;
			}

			if (this.field339 > var2) {
				var2 = this.field339;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field338 = var1;
			this.field328 = Integer.MIN_VALUE;
			this.field329 = -this.field331 / var1;
			this.field340 = -this.field332 / var1;
			this.field336 = -this.field339 / var1;
		}
	}

	@ObfuscatedName("ba")
	public synchronized void method880(int var1) {
		if (this.field341 < 0) {
			this.field341 = -var1;
		} else {
			this.field341 = var1;
		}

	}

	@ObfuscatedName("bg")
	public synchronized int method881() {
		return this.field341 < 0 ? -this.field341 : this.field341;
	}

	@ObfuscatedName("bv")
	public boolean method978() {
		return this.field333 < 0 || this.field333 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bu")
	public boolean method883() {
		return this.field338 != 0;
	}

	@ObfuscatedName("by")
	int method1023(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if (this.field341 == 256 && (this.field333 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method901(0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, this.field340, this.field336, 0, var6, var3, this);
					} else {
						var2 = method900(((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, this.field329, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method949(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, this.field340, this.field336, 0, var6, var3, this, this.field341, var5);
				} else {
					var2 = method989(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, this.field329, 0, var6, var3, this, this.field341, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method915()) {
					continue;
				}

				return var4;
			}

			if (this.field341 == 256 && (this.field333 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method936(0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, 0, var4, var3, this);
				}

				return method892(((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method889(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, 0, var4, var3, this, this.field341, var5);
			}

			return method896(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, 0, var4, var3, this, this.field341, var5);
		}
	}

	@ObfuscatedName("bh")
	int method890(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if (this.field341 == -256 && (this.field333 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method903(0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, this.field340, this.field336, 0, var6, var3, this);
					} else {
						var2 = method902(((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, this.field329, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method976(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, this.field340, this.field336, 0, var6, var3, this, this.field341, var5);
				} else {
					var2 = method906(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, this.field329, 0, var6, var3, this, this.field341, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method915()) {
					continue;
				}

				return var4;
			}

			if (this.field341 == -256 && (this.field333 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method909(0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, 0, var4, var3, this);
				}

				return method894(((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method974(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field332, this.field339, 0, var4, var3, this, this.field341, var5);
			}

			return method882(0, 0, ((RawSound)super.sound).samples, var1, this.field333, var2, this.field331, 0, var4, var3, this, this.field341, var5);
		}
	}

	@ObfuscatedName("bq")
	int vmethod1025() {
		int var1 = this.field331 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field333 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bx")
	boolean method915() {
		int var1 = this.field328;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method864(var1, this.field330);
			var3 = method908(var1, this.field330);
		}

		if (var1 == this.field331 && var2 == this.field332 && var3 == this.field339) {
			if (this.field328 == Integer.MIN_VALUE) {
				this.field328 = 0;
				this.field339 = 0;
				this.field332 = 0;
				this.field331 = 0;
				this.remove();
				return true;
			} else {
				this.method867();
				return false;
			}
		} else {
			if (this.field331 < var1) {
				this.field329 = 1;
				this.field338 = var1 - this.field331;
			} else if (this.field331 > var1) {
				this.field329 = -1;
				this.field338 = this.field331 - var1;
			} else {
				this.field329 = 0;
			}

			if (this.field332 < var2) {
				this.field340 = 1;
				if (this.field338 == 0 || this.field338 > var2 - this.field332) {
					this.field338 = var2 - this.field332;
				}
			} else if (this.field332 > var2) {
				this.field340 = -1;
				if (this.field338 == 0 || this.field338 > this.field332 - var2) {
					this.field338 = this.field332 - var2;
				}
			} else {
				this.field340 = 0;
			}

			if (this.field339 < var3) {
				this.field336 = 1;
				if (this.field338 == 0 || this.field338 > var3 - this.field339) {
					this.field338 = var3 - this.field339;
				}
			} else if (this.field339 > var3) {
				this.field336 = -1;
				if (this.field338 == 0 || this.field338 > this.field339 - var3) {
					this.field338 = this.field339 - var3;
				}
			} else {
				this.field336 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ab")
	static int method864(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ay")
	static int method908(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbq;II)Lbd;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field284 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)Lbd;"
	)
	public static RawPcmStream method866(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbd;)I"
	)
	static int method892(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field333 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbd;)I"
	)
	static int method936(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field333 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbd;)I"
	)
	static int method894(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field333 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbd;)I"
	)
	static int method909(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field333 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbd;II)I"
	)
	static int method896(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
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

		var10.field333 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbd;II)I"
	)
	static int method889(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
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
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field333 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbd;II)I"
	)
	static int method882(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
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

		var10.field333 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbd;II)I"
	)
	static int method974(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
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
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field333 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbd;)I"
	)
	static int method900(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field332 += var9.field340 * (var6 - var3);
		var9.field339 += var9.field336 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field333 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbd;)I"
	)
	static int method901(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field329 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field332 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field333 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbd;)I"
	)
	static int method902(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field332 += var9.field340 * (var6 - var3);
		var9.field339 += var9.field336 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field333 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbd;)I"
	)
	static int method903(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field329 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field332 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field333 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbd;II)I"
	)
	static int method989(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field332 -= var11.field340 * var5;
		var11.field339 -= var11.field336 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
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

		var11.field332 += var11.field340 * var5;
		var11.field339 += var11.field336 * var5;
		var11.field331 = var6;
		var11.field333 = var4;
		return var5;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbd;II)I"
	)
	static int method949(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field329;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
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
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field331 += var13.field329 * var5;
		var13.field332 = var6;
		var13.field339 = var7;
		var13.field333 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbd;II)I"
	)
	static int method906(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field332 -= var11.field340 * var5;
		var11.field339 -= var11.field336 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
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

		var11.field332 += var11.field340 * var5;
		var11.field339 += var11.field336 * var5;
		var11.field331 = var6;
		var11.field333 = var4;
		return var5;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbd;II)I"
	)
	static int method976(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field329;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
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
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field331 += var13.field329 * var5;
		var13.field332 = var6;
		var13.field339 = var7;
		var13.field333 = var4;
		return var5;
	}
}
