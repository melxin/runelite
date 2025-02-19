import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	AbstractSocket field4713;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2097236737
	)
	int field4714;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8136404226193912305L
	)
	long field4715;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeHashTable field4716;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 557963829
	)
	int field4717;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeHashTable field4718;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -694790515
	)
	int field4719;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	DualNodeDeque field4732;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeHashTable field4712;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -328071035
	)
	int field4722;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeHashTable field4725;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1410395591
	)
	int field4724;
	@ObfuscatedName("ag")
	boolean field4737;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	class401 field4723;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4727;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4728;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1555122699
	)
	int field4729;
	@ObfuscatedName("at")
	CRC32 field4731;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4730;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lpn;"
	)
	Archive[] field4726;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 60648059
	)
	int field4733;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1664604509
	)
	int field4734;
	@ObfuscatedName("bs")
	byte field4735;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1206201757
	)
	public int field4736;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 752566343
	)
	public int field4721;

	public JagNetThread() {
		this.field4714 = 0;
		this.field4716 = new NodeHashTable(4096);
		this.field4717 = 0;
		this.field4718 = new NodeHashTable(32);
		this.field4719 = 0;
		this.field4732 = new DualNodeDeque();
		this.field4712 = new NodeHashTable(4096);
		this.field4722 = 0;
		this.field4725 = new NodeHashTable(4096);
		this.field4724 = 0;
		this.field4727 = new Buffer(8);
		this.field4729 = 0;
		this.field4731 = new CRC32();
		this.field4726 = new Archive[256];
		this.field4733 = -1;
		this.field4734 = 255;
		this.field4735 = 0;
		this.field4736 = 0;
		this.field4721 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	public boolean method7770() {
		long var1 = InterfaceParent.method2434();
		int var3 = (int)(var1 - this.field4715);
		this.field4715 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4714 += var3;
		if (this.field4724 == 0 && this.field4719 == 0 && this.field4722 == 0 && this.field4717 == 0) {
			return true;
		} else if (this.field4713 == null) {
			return false;
		} else {
			try {
				if (this.field4714 > 30000) {
					throw new IOException();
				} else {
					class401 var4;
					Buffer var5;
					while (this.field4719 < 200 && this.field4717 > 0) {
						var4 = (class401)this.field4716.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4713.write(var5.field5573, 0, 4);
						this.field4718.put(var4, var4.key);
						--this.field4717;
						++this.field4719;
					}

					while (this.field4724 < 200 && this.field4722 > 0) {
						var4 = (class401)this.field4732.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4713.write(var5.field5573, 0, 4);
						var4.removeDual();
						this.field4725.put(var4, var4.key);
						--this.field4722;
						++this.field4724;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4713.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4714 = 0;
						byte var6 = 0;
						if (this.field4723 == null) {
							var6 = 8;
						} else if (this.field4729 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4727.field5570;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4713.read(this.field4727.field5573, this.field4727.field5570, var7);
							if (this.field4735 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4727.field5573;
									var10001 = this.field4727.field5570 + var8;
									var10000[var10001] ^= this.field4735;
								}
							}

							var22 = this.field4727;
							var22.field5570 += var7;
							if (this.field4727.field5570 < var6) {
								break;
							}

							if (this.field4723 == null) {
								this.field4727.field5570 = 0;
								var8 = this.field4727.readUnsignedByte();
								var9 = this.field4727.readUnsignedShort();
								int var10 = this.field4727.readUnsignedByte();
								int var11 = this.field4727.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class401 var14 = (class401)this.field4718.get(var12);
								this.field4737 = true;
								if (var14 == null) {
									var14 = (class401)this.field4725.get(var12);
									this.field4737 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4723 = var14;
								this.field4728 = new Buffer(this.field4723.field4687 + var15 + var11);
								this.field4728.writeByte(var10);
								this.field4728.writeInt(var11);
								this.field4729 = 8;
								this.field4727.field5570 = 0;
							} else if (this.field4729 == 0) {
								if (this.field4727.field5573[0] == -1) {
									this.field4729 = 1;
									this.field4727.field5570 = 0;
								} else {
									this.field4723 = null;
								}
							}
						} else {
							var7 = this.field4728.field5573.length - this.field4723.field4687;
							var8 = 512 - this.field4729;
							if (var8 > var7 - this.field4728.field5570) {
								var8 = var7 - this.field4728.field5570;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4713.read(this.field4728.field5573, this.field4728.field5570, var8);
							if (this.field4735 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4728.field5573;
									var10001 = var9 + this.field4728.field5570;
									var10000[var10001] ^= this.field4735;
								}
							}

							var22 = this.field4728;
							var22.field5570 += var8;
							this.field4729 += var8;
							if (this.field4728.field5570 == var7) {
								if (16711935L == this.field4723.key) {
									this.field4730 = this.field4728;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4726[var9];
										if (var18 != null) {
											this.method7761(var18, var9);
										}
									}
								} else {
									this.field4731.reset();
									this.field4731.update(this.field4728.field5573, 0, var7);
									var9 = (int)this.field4731.getValue();
									if (this.field4723.field4688 != var9) {
										try {
											this.field4713.close();
										} catch (Exception var20) {
										}

										++this.field4736;
										this.field4713 = null;
										this.field4735 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4736 = 0;
									this.field4721 = 0;
									this.field4723.field4689.write((int)(this.field4723.key & 65535L), this.field4728.field5573, 16711680L == (this.field4723.key & 16711680L), this.field4737);
								}

								this.field4723.remove();
								if (this.field4737) {
									--this.field4719;
								} else {
									--this.field4724;
								}

								this.field4729 = 0;
								this.field4723 = null;
								this.field4728 = null;
							} else {
								if (this.field4729 != 512) {
									break;
								}

								this.field4729 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4713.close();
				} catch (Exception var19) {
				}

				++this.field4721;
				this.field4713 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "82"
	)
	public void method7744(boolean var1) {
		if (this.field4713 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4713.write(var2.field5573, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4713.close();
				} catch (Exception var4) {
				}

				++this.field4721;
				this.field4713 = null;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltj;ZI)V",
		garbageValue = "557497052"
	)
	public void method7745(AbstractSocket var1, boolean var2) {
		if (this.field4713 != null) {
			try {
				this.field4713.close();
			} catch (Exception var7) {
			}

			this.field4713 = null;
		}

		this.field4713 = var1;
		this.method7744(var2);
		this.field4727.field5570 = 0;
		this.field4723 = null;
		this.field4728 = null;
		this.field4729 = 0;

		while (true) {
			class401 var3 = (class401)this.field4718.first();
			if (var3 == null) {
				while (true) {
					var3 = (class401)this.field4725.first();
					if (var3 == null) {
						if (this.field4735 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4735);
								var8.writeShort(0);
								this.field4713.write(var8.field5573, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4713.close();
								} catch (Exception var5) {
								}

								++this.field4721;
								this.field4713 = null;
							}
						}

						this.field4714 = 0;
						this.field4715 = InterfaceParent.method2434();
						return;
					}

					this.field4732.method7988(var3);
					this.field4712.put(var3, var3.key);
					++this.field4722;
					--this.field4724;
				}
			}

			this.field4716.put(var3, var3.key);
			++this.field4717;
			--this.field4719;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpn;II)V",
		garbageValue = "-2003823457"
	)
	void method7766(Archive var1, int var2) {
		if (var1.field4657) {
			if (!var1.field4643) {
				if (var2 <= this.field4733) {
					throw new RuntimeException("");
				}

				if (var2 < this.field4734) {
					this.field4734 = var2;
				}
			}
		} else {
			if (var2 >= this.field4734) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4733) {
				this.field4733 = var2;
			}
		}

		if (this.field4730 != null) {
			this.method7761(var1, var2);
		} else {
			this.method7748((Archive)null, class400.field4680.field4685, 255, 0, (byte)0, true);
			this.field4726[var2] = var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpn;IB)V",
		garbageValue = "15"
	)
	void method7761(Archive var1, int var2) {
		this.field4730.field5570 = var2 * 8 + 5;
		if (this.field4730.field5570 >= this.field4730.field5573.length) {
			if (var1.field4657) {
				var1.method7589();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4730.readInt();
			int var4 = this.field4730.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpn;IIIBZS)V",
		garbageValue = "-8338"
	)
	void method7748(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class401 var9 = (class401)this.field4716.get(var7);
		if (var9 == null) {
			var9 = (class401)this.field4718.get(var7);
			if (var9 == null) {
				var9 = (class401)this.field4712.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4716.put(var9, var7);
						--this.field4722;
						++this.field4717;
					}

				} else {
					if (!var6) {
						var9 = (class401)this.field4725.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class401();
					var9.field4689 = var1;
					var9.field4688 = var4;
					var9.field4687 = var5;
					if (var6) {
						this.field4716.put(var9, var7);
						++this.field4717;
					} else {
						this.field4732.method7994(var9);
						this.field4712.put(var9, var7);
						++this.field4722;
					}

				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1255227023"
	)
	void method7749(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class401 var5 = (class401)this.field4712.get(var3);
		if (var5 != null) {
			this.field4732.method7988(var5);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1696737791"
	)
	int method7750(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4723 != null && var3 == this.field4723.key ? this.field4728.field5570 * 99 / (this.field4728.field5573.length - this.field4723.field4687) + 1 : 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-41"
	)
	public int method7751(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4719 + this.field4717;
		return var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method7743() {
		if (this.field4713 != null) {
			try {
				this.field4713.close();
			} catch (Exception var2) {
			}

			this.field4713 = null;
		}

	}
}
