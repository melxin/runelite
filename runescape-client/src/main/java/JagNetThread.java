import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2135729601
	)
	public int field4783;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1497446533
	)
	public int field4774;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	AbstractSocket field4778;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 120578065
	)
	int field4779;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -3444609004346570039L
	)
	long field4780;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	NodeHashTable field4773;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1143012625
	)
	int field4782;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	NodeHashTable field4791;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2041838861
	)
	int field4777;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	DualNodeDeque field4785;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	NodeHashTable field4786;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2004348249
	)
	int field4772;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	NodeHashTable field4788;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1167804307
	)
	int field4789;
	@ObfuscatedName("ao")
	boolean field4790;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	class404 field4787;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	Buffer field4792;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	Buffer field4784;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 940967045
	)
	int field4794;
	@ObfuscatedName("ay")
	CRC32 field4795;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	Buffer field4796;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "[Lpu;"
	)
	Archive[] field4797;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1111991185
	)
	int field4798;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1641887113
	)
	int field4781;
	@ObfuscatedName("bv")
	byte field4799;

	public JagNetThread() {
		this.field4783 = 0;
		this.field4774 = 0;
		this.field4779 = 0;
		this.field4773 = new NodeHashTable(4096);
		this.field4782 = 0;
		this.field4791 = new NodeHashTable(32);
		this.field4777 = 0;
		this.field4785 = new DualNodeDeque();
		this.field4786 = new NodeHashTable(4096);
		this.field4772 = 0;
		this.field4788 = new NodeHashTable(4096);
		this.field4789 = 0;
		this.field4792 = new Buffer(8);
		this.field4794 = 0;
		this.field4795 = new CRC32();
		this.field4797 = new Archive[256];
		this.field4798 = -1;
		this.field4781 = 255;
		this.field4799 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-81"
	)
	public boolean method8166() {
		long var1 = class180.method3973();
		int var3 = (int)(var1 - this.field4780);
		this.field4780 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4779 += var3;
		if (this.field4789 == 0 && this.field4777 == 0 && this.field4772 == 0 && this.field4782 == 0) {
			return true;
		} else if (this.field4778 == null) {
			return false;
		} else {
			try {
				if (this.field4779 > 30000) {
					throw new IOException();
				} else {
					class404 var4;
					Buffer var5;
					while (this.field4777 < 200 && this.field4782 > 0) {
						var4 = (class404)this.field4773.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4778.write(var5.array, 0, 4);
						this.field4791.put(var4, var4.key);
						--this.field4782;
						++this.field4777;
					}

					while (this.field4789 < 200 && this.field4772 > 0) {
						var4 = (class404)this.field4785.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4778.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4788.put(var4, var4.key);
						--this.field4772;
						++this.field4789;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4778.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4779 = 0;
						byte var6 = 0;
						if (this.field4787 == null) {
							var6 = 8;
						} else if (this.field4794 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4792.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4778.read(this.field4792.array, this.field4792.offset, var7);
							if (this.field4799 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4792.array;
									var10001 = var8 + this.field4792.offset;
									var10000[var10001] ^= this.field4799;
								}
							}

							var22 = this.field4792;
							var22.offset += var7;
							if (this.field4792.offset < var6) {
								break;
							}

							if (this.field4787 == null) {
								this.field4792.offset = 0;
								var8 = this.field4792.readUnsignedByte();
								var9 = this.field4792.readUnsignedShort();
								int var10 = this.field4792.readUnsignedByte();
								int var11 = this.field4792.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class404 var14 = (class404)this.field4791.get(var12);
								this.field4790 = true;
								if (var14 == null) {
									var14 = (class404)this.field4788.get(var12);
									this.field4790 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4787 = var14;
								this.field4784 = new Buffer(this.field4787.field4748 + var15 + var11);
								this.field4784.writeByte(var10);
								this.field4784.writeInt(var11);
								this.field4794 = 8;
								this.field4792.offset = 0;
							} else if (this.field4794 == 0) {
								if (this.field4792.array[0] == -1) {
									this.field4794 = 1;
									this.field4792.offset = 0;
								} else {
									this.field4787 = null;
								}
							}
						} else {
							var7 = this.field4784.array.length - this.field4787.field4748;
							var8 = 512 - this.field4794;
							if (var8 > var7 - this.field4784.offset) {
								var8 = var7 - this.field4784.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4778.read(this.field4784.array, this.field4784.offset, var8);
							if (this.field4799 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4784.array;
									var10001 = var9 + this.field4784.offset;
									var10000[var10001] ^= this.field4799;
								}
							}

							var22 = this.field4784;
							var22.offset += var8;
							this.field4794 += var8;
							if (this.field4784.offset == var7) {
								if (16711935L == this.field4787.key) {
									this.field4796 = this.field4784;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4797[var9];
										if (var18 != null) {
											this.method8200(var18, var9);
										}
									}
								} else {
									this.field4795.reset();
									this.field4795.update(this.field4784.array, 0, var7);
									var9 = (int)this.field4795.getValue();
									if (this.field4787.field4747 != var9) {
										try {
											this.field4778.close();
										} catch (Exception var20) {
										}

										++this.field4783;
										this.field4778 = null;
										this.field4799 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4783 = 0;
									this.field4774 = 0;
									this.field4787.field4750.write((int)(this.field4787.key & 65535L), this.field4784.array, (this.field4787.key & 16711680L) == 16711680L, this.field4790);
								}

								this.field4787.remove();
								if (this.field4790) {
									--this.field4777;
								} else {
									--this.field4789;
								}

								this.field4794 = 0;
								this.field4787 = null;
								this.field4784 = null;
							} else {
								if (this.field4794 != 512) {
									break;
								}

								this.field4794 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4778.close();
				} catch (Exception var19) {
				}

				++this.field4774;
				this.field4778 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "20"
	)
	public void method8187(boolean var1) {
		if (this.field4778 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4778.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4778.close();
				} catch (Exception var4) {
				}

				++this.field4774;
				this.field4778 = null;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltg;ZI)V",
		garbageValue = "-2142317007"
	)
	public void method8184(AbstractSocket var1, boolean var2) {
		if (this.field4778 != null) {
			try {
				this.field4778.close();
			} catch (Exception var7) {
			}

			this.field4778 = null;
		}

		this.field4778 = var1;
		this.method8187(var2);
		this.field4792.offset = 0;
		this.field4787 = null;
		this.field4784 = null;
		this.field4794 = 0;

		while (true) {
			class404 var3 = (class404)this.field4791.first();
			if (var3 == null) {
				while (true) {
					var3 = (class404)this.field4788.first();
					if (var3 == null) {
						if (this.field4799 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4799);
								var8.writeShort(0);
								this.field4778.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4778.close();
								} catch (Exception var5) {
								}

								++this.field4774;
								this.field4778 = null;
							}
						}

						this.field4779 = 0;
						this.field4780 = class180.method3973();
						return;
					}

					this.field4785.method8400(var3);
					this.field4786.put(var3, var3.key);
					++this.field4772;
					--this.field4789;
				}
			}

			this.field4773.put(var3, var3.key);
			++this.field4782;
			--this.field4777;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpu;IS)V",
		garbageValue = "23898"
	)
	void method8182(Archive var1, int var2) {
		if (var1.field4705) {
			if (!var1.field4713) {
				if (var2 <= this.field4798) {
					throw new RuntimeException("");
				}

				if (var2 < this.field4781) {
					this.field4781 = var2;
				}
			}
		} else {
			if (var2 >= this.field4781) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4798) {
				this.field4798 = var2;
			}
		}

		if (this.field4796 != null) {
			this.method8200(var1, var2);
		} else {
			this.method8169((Archive)null, class403.field4734.field4743, 255, 0, (byte)0, true);
			this.field4797[var2] = var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpu;IB)V",
		garbageValue = "108"
	)
	void method8200(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field4796.array.length - 8) {
			this.field4796.offset = var3;
			var4 = this.field4796.readInt();
			var5 = this.field4796.readInt();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4705) {
				var1.method8025();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpu;IIIBZI)V",
		garbageValue = "-520162904"
	)
	void method8169(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class404 var9 = (class404)this.field4773.get(var7);
		if (var9 == null) {
			var9 = (class404)this.field4791.get(var7);
			if (var9 == null) {
				var9 = (class404)this.field4786.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4773.put(var9, var7);
						--this.field4772;
						++this.field4782;
					}

				} else {
					if (!var6) {
						var9 = (class404)this.field4788.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class404();
					var9.field4750 = var1;
					var9.field4747 = var4;
					var9.field4748 = var5;
					if (var6) {
						this.field4773.put(var9, var7);
						++this.field4782;
					} else {
						this.field4785.method8391(var9);
						this.field4786.put(var9, var7);
						++this.field4772;
					}

				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "83"
	)
	void method8171(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class404 var5 = (class404)this.field4786.get(var3);
		if (var5 != null) {
			this.field4785.method8400(var5);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-61"
	)
	int method8172(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4787 != null && var3 == this.field4787.key ? this.field4784.offset * 99 / (this.field4784.array.length - this.field4787.field4748) + 1 : 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "1765106447"
	)
	public int method8170(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4782 + this.field4777;
		return var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1611663291"
	)
	public void method8174() {
		if (this.field4778 != null) {
			try {
				this.field4778.close();
			} catch (Exception var2) {
			}

			this.field4778 = null;
		}

	}

	@ObfuscatedName("ah")
	static final void method8173(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}
}
