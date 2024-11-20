import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	int field328;
	@ObfuscatedName("aw")
	int field327;
	@ObfuscatedName("at")
	int field336;
	@ObfuscatedName("ae")
	int field329;
	@ObfuscatedName("ao")
	int field330;
	@ObfuscatedName("ac")
	int field331;
	@ObfuscatedName("aj")
	int field332;
	@ObfuscatedName("av")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("au")
	@Export("start")
	int start;
	@ObfuscatedName("an")
	@Export("end")
	int end;
	@ObfuscatedName("af")
	boolean field338;
	@ObfuscatedName("ai")
	int field337;
	@ObfuscatedName("al")
	int field335;
	@ObfuscatedName("ar")
	int field339;
	@ObfuscatedName("as")
	int field340;

	@ObfuscatedSignature(
		descriptor = "(Lbi;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field338 = var1.field256;
		this.field327 = var2;
		this.field336 = var3;
		this.field329 = var4;
		this.field328 = 0;
		this.method873();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field338 = var1.field256;
		this.field327 = var2;
		this.field336 = var3;
		this.field329 = 8192;
		this.field328 = 0;
		this.method873();
	}

	@ObfuscatedName("ao")
	void method873() {
		this.field330 = this.field336;
		this.field331 = method985(this.field336, this.field329);
		this.field332 = method868(this.field336, this.field329);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("av")
	protected int vmethod6753() {
		return this.field336 == 0 && this.field337 == 0 ? 0 : 1;
	}

	@ObfuscatedName("au")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field336 == 0 && this.field337 == 0) {
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
			if (this.field328 < 0) {
				if (this.field327 <= 0) {
					this.method882();
					this.remove();
					return;
				}

				this.field328 = 0;
			}

			if (this.field328 >= var7) {
				if (this.field327 >= 0) {
					this.method882();
					this.remove();
					return;
				}

				this.field328 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field338) {
					if (this.field327 < 0) {
						var9 = this.method867(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field328 >= var5) {
							return;
						}

						this.field328 = var5 + var5 - 1 - this.field328;
						this.field327 = -this.field327;
					}

					while (true) {
						var9 = this.method909(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field328 < var6) {
							return;
						}

						this.field328 = var6 + var6 - 1 - this.field328;
						this.field327 = -this.field327;
						var9 = this.method867(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field328 >= var5) {
							return;
						}

						this.field328 = var5 + var5 - 1 - this.field328;
						this.field327 = -this.field327;
					}
				} else if (this.field327 < 0) {
					while (true) {
						var9 = this.method867(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field328 >= var5) {
							return;
						}

						this.field328 = var6 - 1 - (var6 - 1 - this.field328) % var8;
					}
				} else {
					while (true) {
						var9 = this.method909(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field328 < var6) {
							return;
						}

						this.field328 = var5 + (this.field328 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field338) {
						label127: {
							if (this.field327 < 0) {
								var9 = this.method867(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field328 >= var5) {
									return;
								}

								this.field328 = var5 + var5 - 1 - this.field328;
								this.field327 = -this.field327;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method909(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field328 < var6) {
									return;
								}

								this.field328 = var6 + var6 - 1 - this.field328;
								this.field327 = -this.field327;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method867(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field328 >= var5) {
									return;
								}

								this.field328 = var5 + var5 - 1 - this.field328;
								this.field327 = -this.field327;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field327 < 0) {
							while (true) {
								var9 = this.method867(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field328 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field328) / var8;
								if (var10 >= this.numLoops) {
									this.field328 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field328 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method909(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field328 < var6) {
									return;
								}

								var10 = (this.field328 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field328 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field328 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field327 < 0) {
					this.method867(var1, var9, 0, var3, 0);
					if (this.field328 < 0) {
						this.field328 = -1;
						this.method882();
						this.remove();
					}
				} else {
					this.method909(var1, var9, var7, var3, 0);
					if (this.field328 >= var7) {
						this.field328 = var7;
						this.method882();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("an")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("af")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field337 > 0) {
			if (var1 >= this.field337) {
				if (this.field336 == Integer.MIN_VALUE) {
					this.field336 = 0;
					this.field332 = 0;
					this.field331 = 0;
					this.field330 = 0;
					this.remove();
					var1 = this.field337;
				}

				this.field337 = 0;
				this.method873();
			} else {
				this.field330 += this.field335 * var1;
				this.field331 += this.field339 * var1;
				this.field332 += this.field340 * var1;
				this.field337 -= var1;
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

		if (this.field328 < 0) {
			if (this.field327 <= 0) {
				this.method882();
				this.remove();
				return;
			}

			this.field328 = 0;
		}

		if (this.field328 >= var5) {
			if (this.field327 >= 0) {
				this.method882();
				this.remove();
				return;
			}

			this.field328 = var5 - 1;
		}

		this.field328 += this.field327 * var1;
		if (this.numLoops < 0) {
			if (!this.field338) {
				if (this.field327 < 0) {
					if (this.field328 >= var3) {
						return;
					}

					this.field328 = var4 - 1 - (var4 - 1 - this.field328) % var6;
				} else {
					if (this.field328 < var4) {
						return;
					}

					this.field328 = var3 + (this.field328 - var3) % var6;
				}

			} else {
				if (this.field327 < 0) {
					if (this.field328 >= var3) {
						return;
					}

					this.field328 = var3 + var3 - 1 - this.field328;
					this.field327 = -this.field327;
				}

				while (this.field328 >= var4) {
					this.field328 = var4 + var4 - 1 - this.field328;
					this.field327 = -this.field327;
					if (this.field328 >= var3) {
						return;
					}

					this.field328 = var3 + var3 - 1 - this.field328;
					this.field327 = -this.field327;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field338) {
					label129: {
						if (this.field327 < 0) {
							if (this.field328 >= var3) {
								return;
							}

							this.field328 = var3 + var3 - 1 - this.field328;
							this.field327 = -this.field327;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field328 < var4) {
								return;
							}

							this.field328 = var4 + var4 - 1 - this.field328;
							this.field327 = -this.field327;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field328 >= var3) {
								return;
							}

							this.field328 = var3 + var3 - 1 - this.field328;
							this.field327 = -this.field327;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field327 < 0) {
							if (this.field328 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field328) / var6;
							if (var7 >= this.numLoops) {
								this.field328 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field328 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field328 < var4) {
								return;
							}

							var7 = (this.field328 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field328 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field328 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field327 < 0) {
				if (this.field328 < 0) {
					this.field328 = -1;
					this.method882();
					this.remove();
				}
			} else if (this.field328 >= var5) {
				this.field328 = var5;
				this.method882();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ai")
	public synchronized void method875(int var1) {
		this.method1008(var1 << 6, this.method898());
	}

	@ObfuscatedName("al")
	synchronized void method876(int var1) {
		this.method1008(var1, this.method898());
	}

	@ObfuscatedName("ar")
	synchronized void method1008(int var1, int var2) {
		this.field336 = var1;
		this.field329 = var2;
		this.field337 = 0;
		this.method873();
	}

	@ObfuscatedName("as")
	public synchronized int method878() {
		return this.field336 == Integer.MIN_VALUE ? 0 : this.field336;
	}

	@ObfuscatedName("az")
	public synchronized int method898() {
		return this.field329 < 0 ? -1 : this.field329;
	}

	@ObfuscatedName("ak")
	public synchronized void method967(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field328 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method941() {
		this.field327 = (this.field327 ^ this.field327 >> 31) + (this.field327 >>> 31);
		this.field327 = -this.field327;
	}

	@ObfuscatedName("ah")
	void method882() {
		if (this.field337 != 0) {
			if (this.field336 == Integer.MIN_VALUE) {
				this.field336 = 0;
			}

			this.field337 = 0;
			this.method873();
		}

	}

	@ObfuscatedName("ad")
	public synchronized void method872(int var1, int var2) {
		this.method884(var1, var2, this.method898());
	}

	@ObfuscatedName("ay")
	public synchronized void method884(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1008(var2, var3);
		} else {
			int var4 = method985(var2, var3);
			int var5 = method868(var2, var3);
			if (var4 == this.field331 && var5 == this.field332) {
				this.field337 = 0;
			} else {
				int var6 = var2 - this.field330;
				if (this.field330 - var2 > var6) {
					var6 = this.field330 - var2;
				}

				if (var4 - this.field331 > var6) {
					var6 = var4 - this.field331;
				}

				if (this.field331 - var4 > var6) {
					var6 = this.field331 - var4;
				}

				if (var5 - this.field332 > var6) {
					var6 = var5 - this.field332;
				}

				if (this.field332 - var5 > var6) {
					var6 = this.field332 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field337 = var1;
				this.field336 = var2;
				this.field329 = var3;
				this.field335 = (var2 - this.field330) / var1;
				this.field339 = (var4 - this.field331) / var1;
				this.field340 = (var5 - this.field332) / var1;
			}
		}
	}

	@ObfuscatedName("ax")
	public synchronized void method885(int var1) {
		if (var1 == 0) {
			this.method876(0);
			this.remove();
		} else if (this.field331 == 0 && this.field332 == 0) {
			this.field337 = 0;
			this.field336 = 0;
			this.field330 = 0;
			this.remove();
		} else {
			int var2 = -this.field330;
			if (this.field330 > var2) {
				var2 = this.field330;
			}

			if (-this.field331 > var2) {
				var2 = -this.field331;
			}

			if (this.field331 > var2) {
				var2 = this.field331;
			}

			if (-this.field332 > var2) {
				var2 = -this.field332;
			}

			if (this.field332 > var2) {
				var2 = this.field332;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field337 = var1;
			this.field336 = Integer.MIN_VALUE;
			this.field335 = -this.field330 / var1;
			this.field339 = -this.field331 / var1;
			this.field340 = -this.field332 / var1;
		}
	}

	@ObfuscatedName("aa")
	public synchronized void method886(int var1) {
		if (this.field327 < 0) {
			this.field327 = -var1;
		} else {
			this.field327 = var1;
		}

	}

	@ObfuscatedName("aq")
	public synchronized int method887() {
		return this.field327 < 0 ? -this.field327 : this.field327;
	}

	@ObfuscatedName("am")
	public boolean method953() {
		return this.field328 < 0 || this.field328 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ag")
	public boolean method889() {
		return this.field337 != 0;
	}

	@ObfuscatedName("bw")
	int method909(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field337 > 0) {
				int var6 = var2 + this.field337;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field337 += var2;
				if (this.field327 == 256 && (this.field328 & 255) == 0) {
					if (ItemContainer.PcmPlayer_stereo) {
						var2 = method907(0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, this.field339, this.field340, 0, var6, var3, this);
					} else {
						var2 = method881(((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, this.field335, 0, var6, var3, this);
					}
				} else if (ItemContainer.PcmPlayer_stereo) {
					var2 = method1000(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, this.field339, this.field340, 0, var6, var3, this, this.field327, var5);
				} else {
					var2 = method956(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, this.field335, 0, var6, var3, this, this.field327, var5);
				}

				this.field337 -= var2;
				if (this.field337 != 0) {
					return var2;
				}

				if (!this.method897()) {
					continue;
				}

				return var4;
			}

			if (this.field327 == 256 && (this.field328 & 255) == 0) {
				if (ItemContainer.PcmPlayer_stereo) {
					return method880(0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, 0, var4, var3, this);
				}

				return method934(((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, 0, var4, var3, this);
			}

			if (ItemContainer.PcmPlayer_stereo) {
				return method919(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, 0, var4, var3, this, this.field327, var5);
			}

			return method1002(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, 0, var4, var3, this, this.field327, var5);
		}
	}

	@ObfuscatedName("bl")
	int method867(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field337 > 0) {
				int var6 = var2 + this.field337;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field337 += var2;
				if (this.field327 == -256 && (this.field328 & 255) == 0) {
					if (ItemContainer.PcmPlayer_stereo) {
						var2 = method1004(0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, this.field339, this.field340, 0, var6, var3, this);
					} else {
						var2 = method908(((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, this.field335, 0, var6, var3, this);
					}
				} else if (ItemContainer.PcmPlayer_stereo) {
					var2 = method976(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, this.field339, this.field340, 0, var6, var3, this, this.field327, var5);
				} else {
					var2 = method877(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, this.field335, 0, var6, var3, this, this.field327, var5);
				}

				this.field337 -= var2;
				if (this.field337 != 0) {
					return var2;
				}

				if (!this.method897()) {
					continue;
				}

				return var4;
			}

			if (this.field327 == -256 && (this.field328 & 255) == 0) {
				if (ItemContainer.PcmPlayer_stereo) {
					return method901(0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, 0, var4, var3, this);
				}

				return method900(((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, 0, var4, var3, this);
			}

			if (ItemContainer.PcmPlayer_stereo) {
				return method905(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field331, this.field332, 0, var4, var3, this, this.field327, var5);
			}

			return method994(0, 0, ((RawSound)super.sound).samples, var1, this.field328, var2, this.field330, 0, var4, var3, this, this.field327, var5);
		}
	}

	@ObfuscatedName("bi")
	boolean method897() {
		int var1 = this.field336;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method985(var1, this.field329);
			var3 = method868(var1, this.field329);
		}

		if (var1 == this.field330 && var2 == this.field331 && var3 == this.field332) {
			if (this.field336 == Integer.MIN_VALUE) {
				this.field336 = 0;
				this.field332 = 0;
				this.field331 = 0;
				this.field330 = 0;
				this.remove();
				return true;
			} else {
				this.method873();
				return false;
			}
		} else {
			if (this.field330 < var1) {
				this.field335 = 1;
				this.field337 = var1 - this.field330;
			} else if (this.field330 > var1) {
				this.field335 = -1;
				this.field337 = this.field330 - var1;
			} else {
				this.field335 = 0;
			}

			if (this.field331 < var2) {
				this.field339 = 1;
				if (this.field337 == 0 || this.field337 > var2 - this.field331) {
					this.field337 = var2 - this.field331;
				}
			} else if (this.field331 > var2) {
				this.field339 = -1;
				if (this.field337 == 0 || this.field337 > this.field331 - var2) {
					this.field337 = this.field331 - var2;
				}
			} else {
				this.field339 = 0;
			}

			if (this.field332 < var3) {
				this.field340 = 1;
				if (this.field337 == 0 || this.field337 > var3 - this.field332) {
					this.field337 = var3 - this.field332;
				}
			} else if (this.field332 > var3) {
				this.field340 = -1;
				if (this.field337 == 0 || this.field337 > this.field332 - var3) {
					this.field337 = this.field332 - var3;
				}
			} else {
				this.field340 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("be")
	int vmethod1032() {
		int var1 = this.field330 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field328 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ab")
	static int method985(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aw")
	static int method868(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)Lbe;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(DbTableType.field5406 * 863174208)), var2 << 6) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbi;III)Lbe;"
	)
	public static RawPcmStream method913(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbe;)I"
	)
	static int method934(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field328 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbe;)I"
	)
	static int method880(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field328 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbe;)I"
	)
	static int method900(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field328 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbe;)I"
	)
	static int method901(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field328 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbe;II)I"
	)
	static int method1002(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field328 = var4;
		return var5;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method919(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field328 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbe;II)I"
	)
	static int method994(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field328 = var4;
		return var5;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method905(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field328 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbe;)I"
	)
	static int method881(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field331 += var9.field339 * (var6 - var3);
		var9.field332 += var9.field340 * (var6 - var3);

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

		var9.field330 = var4 >> 2;
		var9.field328 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbe;)I"
	)
	static int method907(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field330 += var12.field335 * (var9 - var4);
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

		var12.field331 = var5 >> 2;
		var12.field332 = var6 >> 2;
		var12.field328 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbe;)I"
	)
	static int method908(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field331 += var9.field339 * (var6 - var3);
		var9.field332 += var9.field340 * (var6 - var3);

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

		var9.field330 = var4 >> 2;
		var9.field328 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbe;)I"
	)
	static int method1004(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field330 += var12.field335 * (var9 - var4);
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

		var12.field331 = var5 >> 2;
		var12.field332 = var6 >> 2;
		var12.field328 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method956(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field331 -= var11.field339 * var5;
		var11.field332 -= var11.field340 * var5;
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

		var11.field331 += var11.field339 * var5;
		var11.field332 += var11.field340 * var5;
		var11.field330 = var6;
		var11.field328 = var4;
		return var5;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbe;II)I"
	)
	static int method1000(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field330 -= var5 * var13.field335;
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
		var13.field330 += var13.field335 * var5;
		var13.field331 = var6;
		var13.field332 = var7;
		var13.field328 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method877(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field331 -= var11.field339 * var5;
		var11.field332 -= var11.field340 * var5;
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

		var11.field331 += var11.field339 * var5;
		var11.field332 += var11.field340 * var5;
		var11.field330 = var6;
		var11.field328 = var4;
		return var5;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbe;II)I"
	)
	static int method976(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field330 -= var5 * var13.field335;
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
		var13.field330 += var13.field335 * var5;
		var13.field331 = var6;
		var13.field332 = var7;
		var13.field328 = var4;
		return var5;
	}
}
