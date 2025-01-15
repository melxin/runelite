import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ay")
	int field318;
	@ObfuscatedName("ah")
	int field309;
	@ObfuscatedName("az")
	int field310;
	@ObfuscatedName("ao")
	int field311;
	@ObfuscatedName("ad")
	int field312;
	@ObfuscatedName("an")
	int field321;
	@ObfuscatedName("ae")
	int field314;
	@ObfuscatedName("ax")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("at")
	@Export("start")
	int start;
	@ObfuscatedName("ac")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	boolean field322;
	@ObfuscatedName("as")
	int field319;
	@ObfuscatedName("aq")
	int field320;
	@ObfuscatedName("af")
	int field308;
	@ObfuscatedName("aa")
	int field316;

	@ObfuscatedSignature(
		descriptor = "(Lbc;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field322 = var1.field244;
		this.field309 = var2;
		this.field310 = var3;
		this.field311 = var4;
		this.field318 = 0;
		this.method912();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field322 = var1.field244;
		this.field309 = var2;
		this.field310 = var3;
		this.field311 = 8192;
		this.field318 = 0;
		this.method912();
	}

	@ObfuscatedName("ad")
	void method912() {
		this.field312 = this.field310;
		this.field321 = method980(this.field310, this.field311);
		this.field314 = method920(this.field310, this.field311);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Lbn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ax")
	protected int vmethod6927() {
		return this.field310 == 0 && this.field319 == 0 ? 0 : 1;
	}

	@ObfuscatedName("at")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field310 == 0 && this.field319 == 0) {
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
			if (this.field318 < 0) {
				if (this.field309 <= 0) {
					this.method909();
					this.remove();
					return;
				}

				this.field318 = 0;
			}

			if (this.field318 >= var7) {
				if (this.field309 >= 0) {
					this.method909();
					this.remove();
					return;
				}

				this.field318 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field322) {
					if (this.field309 < 0) {
						var9 = this.method968(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var5 + var5 - 1 - this.field318;
						this.field309 = -this.field309;
					}

					while (true) {
						var9 = this.method934(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field318 < var6) {
							return;
						}

						this.field318 = var6 + var6 - 1 - this.field318;
						this.field309 = -this.field309;
						var9 = this.method968(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var5 + var5 - 1 - this.field318;
						this.field309 = -this.field309;
					}
				} else if (this.field309 < 0) {
					while (true) {
						var9 = this.method968(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var6 - 1 - (var6 - 1 - this.field318) % var8;
					}
				} else {
					while (true) {
						var9 = this.method934(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field318 < var6) {
							return;
						}

						this.field318 = var5 + (this.field318 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field322) {
						label127: {
							if (this.field309 < 0) {
								var9 = this.method968(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field318 >= var5) {
									return;
								}

								this.field318 = var5 + var5 - 1 - this.field318;
								this.field309 = -this.field309;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method934(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field318 < var6) {
									return;
								}

								this.field318 = var6 + var6 - 1 - this.field318;
								this.field309 = -this.field309;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method968(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field318 >= var5) {
									return;
								}

								this.field318 = var5 + var5 - 1 - this.field318;
								this.field309 = -this.field309;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field309 < 0) {
							while (true) {
								var9 = this.method968(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field318 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field318) / var8;
								if (var10 >= this.numLoops) {
									this.field318 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field318 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method934(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field318 < var6) {
									return;
								}

								var10 = (this.field318 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field318 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field318 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field309 < 0) {
					this.method968(var1, var9, 0, var3, 0);
					if (this.field318 < 0) {
						this.field318 = -1;
						this.method909();
						this.remove();
					}
				} else {
					this.method934(var1, var9, var7, var3, 0);
					if (this.field318 >= var7) {
						this.field318 = var7;
						this.method909();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ac")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("au")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field319 > 0) {
			if (var1 >= this.field319) {
				if (this.field310 == Integer.MIN_VALUE) {
					this.field310 = 0;
					this.field314 = 0;
					this.field321 = 0;
					this.field312 = 0;
					this.remove();
					var1 = this.field319;
				}

				this.field319 = 0;
				this.method912();
			} else {
				this.field312 += this.field320 * var1;
				this.field321 += this.field308 * var1;
				this.field314 += this.field316 * var1;
				this.field319 -= var1;
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

		if (this.field318 < 0) {
			if (this.field309 <= 0) {
				this.method909();
				this.remove();
				return;
			}

			this.field318 = 0;
		}

		if (this.field318 >= var5) {
			if (this.field309 >= 0) {
				this.method909();
				this.remove();
				return;
			}

			this.field318 = var5 - 1;
		}

		this.field318 += this.field309 * var1;
		if (this.numLoops < 0) {
			if (!this.field322) {
				if (this.field309 < 0) {
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var4 - 1 - (var4 - 1 - this.field318) % var6;
				} else {
					if (this.field318 < var4) {
						return;
					}

					this.field318 = var3 + (this.field318 - var3) % var6;
				}

			} else {
				if (this.field309 < 0) {
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var3 + var3 - 1 - this.field318;
					this.field309 = -this.field309;
				}

				while (this.field318 >= var4) {
					this.field318 = var4 + var4 - 1 - this.field318;
					this.field309 = -this.field309;
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var3 + var3 - 1 - this.field318;
					this.field309 = -this.field309;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field322) {
					label129: {
						if (this.field309 < 0) {
							if (this.field318 >= var3) {
								return;
							}

							this.field318 = var3 + var3 - 1 - this.field318;
							this.field309 = -this.field309;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field318 < var4) {
								return;
							}

							this.field318 = var4 + var4 - 1 - this.field318;
							this.field309 = -this.field309;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field318 >= var3) {
								return;
							}

							this.field318 = var3 + var3 - 1 - this.field318;
							this.field309 = -this.field309;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field309 < 0) {
							if (this.field318 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field318) / var6;
							if (var7 >= this.numLoops) {
								this.field318 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field318 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field318 < var4) {
								return;
							}

							var7 = (this.field318 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field318 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field318 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field309 < 0) {
				if (this.field318 < 0) {
					this.field318 = -1;
					this.method909();
					this.remove();
				}
			} else if (this.field318 >= var5) {
				this.field318 = var5;
				this.method909();
				this.remove();
			}

		}
	}

	@ObfuscatedName("as")
	public synchronized void method914(int var1) {
		this.method916(var1 << 6, this.method918());
	}

	@ObfuscatedName("aq")
	synchronized void method915(int var1) {
		this.method916(var1, this.method918());
	}

	@ObfuscatedName("af")
	synchronized void method916(int var1, int var2) {
		this.field310 = var1;
		this.field311 = var2;
		this.field319 = 0;
		this.method912();
	}

	@ObfuscatedName("aa")
	public synchronized int method922() {
		return this.field310 == Integer.MIN_VALUE ? 0 : this.field310;
	}

	@ObfuscatedName("ak")
	public synchronized int method918() {
		return this.field311 < 0 ? -1 : this.field311;
	}

	@ObfuscatedName("al")
	public synchronized void method1050(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field318 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method974() {
		this.field309 = (this.field309 ^ this.field309 >> 31) + (this.field309 >>> 31);
		this.field309 = -this.field309;
	}

	@ObfuscatedName("ag")
	void method909() {
		if (this.field319 != 0) {
			if (this.field310 == Integer.MIN_VALUE) {
				this.field310 = 0;
			}

			this.field319 = 0;
			this.method912();
		}

	}

	@ObfuscatedName("aw")
	public synchronized void method950(int var1, int var2) {
		this.method1008(var1, var2, this.method918());
	}

	@ObfuscatedName("ai")
	public synchronized void method1008(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method916(var2, var3);
		} else {
			int var4 = method980(var2, var3);
			int var5 = method920(var2, var3);
			if (var4 == this.field321 && var5 == this.field314) {
				this.field319 = 0;
			} else {
				int var6 = var2 - this.field312;
				if (this.field312 - var2 > var6) {
					var6 = this.field312 - var2;
				}

				if (var4 - this.field321 > var6) {
					var6 = var4 - this.field321;
				}

				if (this.field321 - var4 > var6) {
					var6 = this.field321 - var4;
				}

				if (var5 - this.field314 > var6) {
					var6 = var5 - this.field314;
				}

				if (this.field314 - var5 > var6) {
					var6 = this.field314 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field319 = var1;
				this.field310 = var2;
				this.field311 = var3;
				this.field320 = (var2 - this.field312) / var1;
				this.field308 = (var4 - this.field321) / var1;
				this.field316 = (var5 - this.field314) / var1;
			}
		}
	}

	@ObfuscatedName("ar")
	public synchronized void method924(int var1) {
		if (var1 == 0) {
			this.method915(0);
			this.remove();
		} else if (this.field321 == 0 && this.field314 == 0) {
			this.field319 = 0;
			this.field310 = 0;
			this.field312 = 0;
			this.remove();
		} else {
			int var2 = -this.field312;
			if (this.field312 > var2) {
				var2 = this.field312;
			}

			if (-this.field321 > var2) {
				var2 = -this.field321;
			}

			if (this.field321 > var2) {
				var2 = this.field321;
			}

			if (-this.field314 > var2) {
				var2 = -this.field314;
			}

			if (this.field314 > var2) {
				var2 = this.field314;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field319 = var1;
			this.field310 = Integer.MIN_VALUE;
			this.field320 = -this.field312 / var1;
			this.field308 = -this.field321 / var1;
			this.field316 = -this.field314 / var1;
		}
	}

	@ObfuscatedName("am")
	public synchronized void method1040(int var1) {
		if (this.field309 < 0) {
			this.field309 = -var1;
		} else {
			this.field309 = var1;
		}

	}

	@ObfuscatedName("bz")
	public synchronized int method926() {
		return this.field309 < 0 ? -this.field309 : this.field309;
	}

	@ObfuscatedName("bt")
	public boolean method927() {
		return this.field318 < 0 || this.field318 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bp")
	public boolean method928() {
		return this.field319 != 0;
	}

	@ObfuscatedName("bg")
	int method934(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field319 > 0) {
				int var6 = var2 + this.field319;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field319 += var2;
				if (this.field309 == 256 && (this.field318 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method946(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, this.field308, this.field316, 0, var6, var3, this);
					} else {
						var2 = method1030(((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, this.field320, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method1033(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, this.field308, this.field316, 0, var6, var3, this, this.field309, var5);
				} else {
					var2 = method1053(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, this.field320, 0, var6, var3, this, this.field309, var5);
				}

				this.field319 -= var2;
				if (this.field319 != 0) {
					return var2;
				}

				if (!this.method936()) {
					continue;
				}

				return var4;
			}

			if (this.field309 == 256 && (this.field318 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method919(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, 0, var4, var3, this);
				}

				return method933(((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method1018(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, 0, var4, var3, this, this.field309, var5);
			}

			return method1043(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, 0, var4, var3, this, this.field309, var5);
		}
	}

	@ObfuscatedName("bk")
	int vmethod1079() {
		int var1 = this.field312 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field318 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bs")
	int method968(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field319 > 0) {
				int var6 = var2 + this.field319;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field319 += var2;
				if (this.field309 == -256 && (this.field318 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method948(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, this.field308, this.field316, 0, var6, var3, this);
					} else {
						var2 = method1015(((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, this.field320, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method952(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, this.field308, this.field316, 0, var6, var3, this, this.field309, var5);
				} else {
					var2 = method951(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, this.field320, 0, var6, var3, this, this.field309, var5);
				}

				this.field319 -= var2;
				if (this.field319 != 0) {
					return var2;
				}

				if (!this.method936()) {
					continue;
				}

				return var4;
			}

			if (this.field309 == -256 && (this.field318 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method1037(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, 0, var4, var3, this);
				}

				return method1029(((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method977(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field321, this.field314, 0, var4, var3, this, this.field309, var5);
			}

			return method943(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field312, 0, var4, var3, this, this.field309, var5);
		}
	}

	@ObfuscatedName("bj")
	boolean method936() {
		int var1 = this.field310;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method980(var1, this.field311);
			var3 = method920(var1, this.field311);
		}

		if (var1 == this.field312 && var2 == this.field321 && var3 == this.field314) {
			if (this.field310 == Integer.MIN_VALUE) {
				this.field310 = 0;
				this.field314 = 0;
				this.field321 = 0;
				this.field312 = 0;
				this.remove();
				return true;
			} else {
				this.method912();
				return false;
			}
		} else {
			if (this.field312 < var1) {
				this.field320 = 1;
				this.field319 = var1 - this.field312;
			} else if (this.field312 > var1) {
				this.field320 = -1;
				this.field319 = this.field312 - var1;
			} else {
				this.field320 = 0;
			}

			if (this.field321 < var2) {
				this.field308 = 1;
				if (this.field319 == 0 || this.field319 > var2 - this.field321) {
					this.field319 = var2 - this.field321;
				}
			} else if (this.field321 > var2) {
				this.field308 = -1;
				if (this.field319 == 0 || this.field319 > this.field321 - var2) {
					this.field319 = this.field321 - var2;
				}
			} else {
				this.field308 = 0;
			}

			if (this.field314 < var3) {
				this.field316 = 1;
				if (this.field319 == 0 || this.field319 > var3 - this.field314) {
					this.field319 = var3 - this.field314;
				}
			} else if (this.field314 > var3) {
				this.field316 = -1;
				if (this.field319 == 0 || this.field319 > this.field314 - var3) {
					this.field319 = this.field314 - var3;
				}
			} else {
				this.field316 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ay")
	static int method980(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ah")
	static int method920(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)Lbe;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field257 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbc;III)Lbe;"
	)
	public static RawPcmStream method911(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbe;)I"
	)
	static int method933(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbe;)I"
	)
	static int method919(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbe;)I"
	)
	static int method1029(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbe;)I"
	)
	static int method1037(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbe;II)I"
	)
	static int method1043(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field318 = var4;
		return var5;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method1018(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field318 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbe;II)I"
	)
	static int method943(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field318 = var4;
		return var5;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method977(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field318 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbe;)I"
	)
	static int method1030(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field321 += var9.field308 * (var6 - var3);
		var9.field314 += var9.field316 * (var6 - var3);

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

		var9.field312 = var4 >> 2;
		var9.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbe;)I"
	)
	static int method946(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field312 += var12.field320 * (var9 - var4);
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

		var12.field321 = var5 >> 2;
		var12.field314 = var6 >> 2;
		var12.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbe;)I"
	)
	static int method1015(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field321 += var9.field308 * (var6 - var3);
		var9.field314 += var9.field316 * (var6 - var3);

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

		var9.field312 = var4 >> 2;
		var9.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbe;)I"
	)
	static int method948(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field312 += var12.field320 * (var9 - var4);
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

		var12.field321 = var5 >> 2;
		var12.field314 = var6 >> 2;
		var12.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method1053(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field321 -= var11.field308 * var5;
		var11.field314 -= var11.field316 * var5;
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

		var11.field321 += var11.field308 * var5;
		var11.field314 += var11.field316 * var5;
		var11.field312 = var6;
		var11.field318 = var4;
		return var5;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbe;II)I"
	)
	static int method1033(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field312 -= var5 * var13.field320;
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
		var13.field312 += var13.field320 * var5;
		var13.field321 = var6;
		var13.field314 = var7;
		var13.field318 = var4;
		return var5;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbe;II)I"
	)
	static int method951(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field321 -= var11.field308 * var5;
		var11.field314 -= var11.field316 * var5;
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

		var11.field321 += var11.field308 * var5;
		var11.field314 += var11.field316 * var5;
		var11.field312 = var6;
		var11.field318 = var4;
		return var5;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbe;II)I"
	)
	static int method952(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field312 -= var5 * var13.field320;
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
		var13.field312 += var13.field320 * var5;
		var13.field321 = var6;
		var13.field314 = var7;
		var13.field318 = var4;
		return var5;
	}
}
