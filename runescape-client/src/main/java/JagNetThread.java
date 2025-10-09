import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1098580513
	)
	public int field5014;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1762786355
	)
	public int field5027;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	AbstractSocket field5016;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1582283175
	)
	int field5018;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3205585874038752789L
	)
	long field5012;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeHashTable field5023;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1002391133
	)
	int field5020;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeHashTable field5021;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1380443617
	)
	int field5019;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	DualNodeDeque field5011;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeHashTable field5024;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -53995757
	)
	int field5025;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	NodeHashTable field5026;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 602099291
	)
	int field5017;
	@ObfuscatedName("an")
	boolean field5028;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	class409 field5030;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field5010;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field5031;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2025384907
	)
	int field5032;
	@ObfuscatedName("ay")
	CRC32 field5033;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field5034;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	Archive[] field5035;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -247250969
	)
	int field5036;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -171047837
	)
	int field5037;
	@ObfuscatedName("bn")
	byte field5038;

	public JagNetThread() {
		this.field5014 = 0;
		this.field5027 = 0;
		this.field5018 = 0;
		this.field5023 = new NodeHashTable(4096);
		this.field5020 = 0;
		this.field5021 = new NodeHashTable(32);
		this.field5019 = 0;
		this.field5011 = new DualNodeDeque();
		this.field5024 = new NodeHashTable(4096);
		this.field5025 = 0;
		this.field5026 = new NodeHashTable(4096);
		this.field5017 = 0;
		this.field5010 = new Buffer(8);
		this.field5032 = 0;
		this.field5033 = new CRC32();
		this.field5035 = new Archive[256];
		this.field5036 = -1;
		this.field5037 = 255;
		this.field5038 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2035776463"
	)
	public boolean method8502() {
		long var1 = class281.method6373();
		int var3 = (int)(var1 - this.field5012);
		this.field5012 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field5018 += var3;
		if (this.field5017 == 0 && this.field5019 == 0 && this.field5025 == 0 && this.field5020 == 0) {
			return true;
		} else if (this.field5016 == null) {
			return false;
		} else {
			try {
				if (this.field5018 > 30000) {
					throw new IOException();
				} else {
					class409 var4;
					Buffer var5;
					while (this.field5019 < 200 && this.field5020 > 0) {
						var4 = (class409)this.field5023.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field5016.write(var5.array, 0, 4);
						this.field5021.put(var4, var4.key);
						--this.field5020;
						++this.field5019;
					}

					while (this.field5017 < 200 && this.field5025 > 0) {
						var4 = (class409)this.field5011.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field5016.write(var5.array, 0, 4);
						var4.removeDual();
						this.field5026.put(var4, var4.key);
						--this.field5025;
						++this.field5017;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field5016.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field5018 = 0;
						byte var6 = 0;
						if (this.field5030 == null) {
							var6 = 8;
						} else if (this.field5032 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field5010.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field5016.read(this.field5010.array, this.field5010.offset, var7);
							if (this.field5038 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field5010.array;
									var10001 = var8 + this.field5010.offset;
									var10000[var10001] ^= this.field5038;
								}
							}

							var22 = this.field5010;
							var22.offset += var7;
							if (this.field5010.offset < var6) {
								break;
							}

							if (this.field5030 == null) {
								this.field5010.offset = 0;
								var8 = this.field5010.readUnsignedByte();
								var9 = this.field5010.readUnsignedShort();
								int var10 = this.field5010.readUnsignedByte();
								int var11 = this.field5010.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class409 var14 = (class409)this.field5021.get(var12);
								this.field5028 = true;
								if (var14 == null) {
									var14 = (class409)this.field5026.get(var12);
									this.field5028 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field5030 = var14;
								this.field5031 = new Buffer(this.field5030.field4984 + var11 + var15);
								this.field5031.writeByte(var10);
								this.field5031.writeInt(var11);
								this.field5032 = 8;
								this.field5010.offset = 0;
							} else if (this.field5032 == 0) {
								if (this.field5010.array[0] == -1) {
									this.field5032 = 1;
									this.field5010.offset = 0;
								} else {
									this.field5030 = null;
								}
							}
						} else {
							var7 = this.field5031.array.length - this.field5030.field4984;
							var8 = 512 - this.field5032;
							if (var8 > var7 - this.field5031.offset) {
								var8 = var7 - this.field5031.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field5016.read(this.field5031.array, this.field5031.offset, var8);
							if (this.field5038 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field5031.array;
									var10001 = this.field5031.offset + var9;
									var10000[var10001] ^= this.field5038;
								}
							}

							var22 = this.field5031;
							var22.offset += var8;
							this.field5032 += var8;
							if (this.field5031.offset == var7) {
								if (16711935L == this.field5030.key) {
									this.field5034 = this.field5031;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field5035[var9];
										if (var18 != null) {
											this.method8492(var18, var9);
										}
									}
								} else {
									this.field5033.reset();
									this.field5033.update(this.field5031.array, 0, var7);
									var9 = (int)this.field5033.getValue();
									if (this.field5030.field4985 != var9) {
										try {
											this.field5016.close();
										} catch (Exception var20) {
										}

										++this.field5014;
										this.field5016 = null;
										this.field5038 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field5014 = 0;
									this.field5027 = 0;
									this.field5030.field4986.write((int)(this.field5030.key & 65535L), this.field5031.array, 16711680L == (this.field5030.key & 16711680L), this.field5028);
								}

								this.field5030.remove();
								if (this.field5028) {
									--this.field5019;
								} else {
									--this.field5017;
								}

								this.field5032 = 0;
								this.field5030 = null;
								this.field5031 = null;
							} else {
								if (this.field5032 != 512) {
									break;
								}

								this.field5032 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field5016.close();
				} catch (Exception var19) {
				}

				++this.field5027;
				this.field5016 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "83"
	)
	public void method8489(boolean var1) {
		if (this.field5016 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field5016.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field5016.close();
				} catch (Exception var4) {
				}

				++this.field5027;
				this.field5016 = null;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltf;ZI)V",
		garbageValue = "-255333963"
	)
	public void method8490(AbstractSocket var1, boolean var2) {
		if (this.field5016 != null) {
			try {
				this.field5016.close();
			} catch (Exception var7) {
			}

			this.field5016 = null;
		}

		this.field5016 = var1;
		this.method8489(var2);
		this.field5010.offset = 0;
		this.field5030 = null;
		this.field5031 = null;
		this.field5032 = 0;

		while (true) {
			class409 var3 = (class409)this.field5021.first();
			if (var3 == null) {
				while (true) {
					var3 = (class409)this.field5026.first();
					if (var3 == null) {
						if (this.field5038 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field5038);
								var8.writeShort(0);
								this.field5016.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field5016.close();
								} catch (Exception var5) {
								}

								++this.field5027;
								this.field5016 = null;
							}
						}

						this.field5018 = 0;
						this.field5012 = class281.method6373();
						return;
					}

					this.field5011.method8734(var3);
					this.field5024.put(var3, var3.key);
					++this.field5025;
					--this.field5017;
				}
			}

			this.field5023.put(var3, var3.key);
			++this.field5020;
			--this.field5019;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpg;IB)V",
		garbageValue = "-74"
	)
	void method8491(Archive var1, int var2) {
		if (var1.field4952) {
			if (!var1.field4937) {
				if (var2 <= this.field5036) {
					throw new RuntimeException("");
				}

				if (var2 < this.field5037) {
					this.field5037 = var2;
				}
			}
		} else {
			if (var2 >= this.field5037) {
				throw new RuntimeException("");
			}

			if (var2 > this.field5036) {
				this.field5036 = var2;
			}
		}

		if (this.field5034 != null) {
			this.method8492(var1, var2);
		} else {
			this.method8493((Archive)null, class408.field4957.field4982, 255, 0, (byte)0, true);
			this.field5035[var2] = var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpg;II)V",
		garbageValue = "-1691248798"
	)
	void method8492(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field5034.array.length - 8) {
			this.field5034.offset = var3;
			var4 = this.field5034.readInt();
			var5 = this.field5034.readInt();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4952) {
				var1.method8348();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpg;IIIBZI)V",
		garbageValue = "-1962182369"
	)
	void method8493(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class409 var9 = (class409)this.field5023.get(var7);
		if (var9 == null) {
			var9 = (class409)this.field5021.get(var7);
			if (var9 == null) {
				var9 = (class409)this.field5024.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field5023.put(var9, var7);
						--this.field5025;
						++this.field5020;
					}

				} else {
					if (!var6) {
						var9 = (class409)this.field5026.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class409();
					var9.field4986 = var1;
					var9.field4985 = var4;
					var9.field4984 = var5;
					if (var6) {
						this.field5023.put(var9, var7);
						++this.field5020;
					} else {
						this.field5011.method8733(var9);
						this.field5024.put(var9, var7);
						++this.field5025;
					}

				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1313800812"
	)
	void method8494(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class409 var5 = (class409)this.field5024.get(var3);
		if (var5 != null) {
			this.field5011.method8734(var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-53"
	)
	int method8495(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field5030 != null && var3 == this.field5030.key ? this.field5031.offset * 99 / (this.field5031.array.length - this.field5030.field4984) + 1 : 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "29"
	)
	public int method8496(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field5020 + this.field5019;
		return var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	public void method8497() {
		if (this.field5016 != null) {
			try {
				this.field5016.close();
			} catch (Exception var2) {
			}

			this.field5016 = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1553435382"
	)
	public static int method8517(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
