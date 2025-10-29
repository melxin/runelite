import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 806043863
	)
	public int field5044;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -670632807
	)
	public int field5045;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	AbstractSocket field5046;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -695875905
	)
	int field5068;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 7245199905198616269L
	)
	long field5063;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	NodeHashTable field5049;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1350052665
	)
	int field5050;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	NodeHashTable field5051;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2050000033
	)
	int field5052;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	DualNodeDeque field5048;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	NodeHashTable field5054;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1274357739
	)
	int field5055;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	NodeHashTable field5056;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2003362371
	)
	int field5057;
	@ObfuscatedName("al")
	boolean field5047;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	class419 field5059;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	Buffer field5060;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	Buffer field5061;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1218851699
	)
	int field5062;
	@ObfuscatedName("aq")
	CRC32 field5039;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	Buffer field5053;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	Archive[] field5065;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 680976127
	)
	int field5058;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1854300211
	)
	int field5067;
	@ObfuscatedName("bz")
	byte field5040;

	public JagNetThread() {
		this.field5044 = 0;
		this.field5045 = 0;
		this.field5068 = 0;
		this.field5049 = new NodeHashTable(4096);
		this.field5050 = 0;
		this.field5051 = new NodeHashTable(32);
		this.field5052 = 0;
		this.field5048 = new DualNodeDeque();
		this.field5054 = new NodeHashTable(4096);
		this.field5055 = 0;
		this.field5056 = new NodeHashTable(4096);
		this.field5057 = 0;
		this.field5060 = new Buffer(8);
		this.field5062 = 0;
		this.field5039 = new CRC32();
		this.field5065 = new Archive[256];
		this.field5058 = -1;
		this.field5067 = 255;
		this.field5040 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2144995509"
	)
	public boolean method8711() {
		long var1 = ParamComposition.method4708();
		int var3 = (int)(var1 - this.field5063);
		this.field5063 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field5068 += var3;
		if (this.field5057 == 0 && this.field5052 == 0 && this.field5055 == 0 && this.field5050 == 0) {
			return true;
		} else if (this.field5046 == null) {
			return false;
		} else {
			try {
				if (this.field5068 > 30000) {
					throw new IOException();
				} else {
					class419 var4;
					Buffer var5;
					while (this.field5052 < 200 && this.field5050 > 0) {
						var4 = (class419)this.field5049.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field5046.write(var5.array, 0, 4);
						this.field5051.put(var4, var4.key);
						--this.field5050;
						++this.field5052;
					}

					while (this.field5057 < 200 && this.field5055 > 0) {
						var4 = (class419)this.field5048.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field5046.write(var5.array, 0, 4);
						var4.removeDual();
						this.field5056.put(var4, var4.key);
						--this.field5055;
						++this.field5057;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field5046.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field5068 = 0;
						byte var6 = 0;
						if (this.field5059 == null) {
							var6 = 8;
						} else if (this.field5062 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field5060.offset * 2108391709;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field5046.read(this.field5060.array, this.field5060.offset * 2108391709, var7);
							if (this.field5040 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field5060.array;
									var10001 = var8 + this.field5060.offset * 2108391709;
									var10000[var10001] ^= this.field5040;
								}
							}

							var22 = this.field5060;
							var22.offset += 1741769013 * var7;
							if (this.field5060.offset * 2108391709 < var6) {
								break;
							}

							if (this.field5059 == null) {
								this.field5060.offset = 0;
								var8 = this.field5060.readUnsignedByte();
								var9 = this.field5060.readUnsignedShort();
								int var10 = this.field5060.readUnsignedByte();
								int var11 = this.field5060.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class419 var14 = (class419)this.field5051.get(var12);
								this.field5047 = true;
								if (var14 == null) {
									var14 = (class419)this.field5056.get(var12);
									this.field5047 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field5059 = var14;
								this.field5061 = new Buffer(this.field5059.field5014 + var15 + var11);
								this.field5061.writeByte(var10);
								this.field5061.writeInt(var11);
								this.field5062 = 8;
								this.field5060.offset = 0;
							} else if (this.field5062 == 0) {
								if (this.field5060.array[0] == -1) {
									this.field5062 = 1;
									this.field5060.offset = 0;
								} else {
									this.field5059 = null;
								}
							}
						} else {
							var7 = this.field5061.array.length - this.field5059.field5014;
							var8 = 512 - this.field5062;
							if (var8 > var7 - this.field5061.offset * 2108391709) {
								var8 = var7 - this.field5061.offset * 2108391709;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field5046.read(this.field5061.array, this.field5061.offset * 2108391709, var8);
							if (this.field5040 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field5061.array;
									var10001 = this.field5061.offset * 2108391709 + var9;
									var10000[var10001] ^= this.field5040;
								}
							}

							var22 = this.field5061;
							var22.offset += var8 * 1741769013;
							this.field5062 += var8;
							if (this.field5061.offset * 2108391709 == var7) {
								if (this.field5059.key == 16711935L) {
									this.field5053 = this.field5061;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field5065[var9];
										if (var18 != null) {
											this.method8688(var18, var9);
										}
									}
								} else {
									this.field5039.reset();
									this.field5039.update(this.field5061.array, 0, var7);
									var9 = (int)this.field5039.getValue();
									if (this.field5059.field5015 != var9) {
										try {
											this.field5046.close();
										} catch (Exception var20) {
										}

										++this.field5044;
										this.field5046 = null;
										this.field5040 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field5044 = 0;
									this.field5045 = 0;
									this.field5059.field5013.write((int)(this.field5059.key & 65535L), this.field5061.array, 16711680L == (this.field5059.key & 16711680L), this.field5047);
								}

								this.field5059.remove();
								if (this.field5047) {
									--this.field5052;
								} else {
									--this.field5057;
								}

								this.field5062 = 0;
								this.field5059 = null;
								this.field5061 = null;
							} else {
								if (this.field5062 != 512) {
									break;
								}

								this.field5062 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field5046.close();
				} catch (Exception var19) {
				}

				++this.field5045;
				this.field5046 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-993857280"
	)
	public void method8679(boolean var1) {
		if (this.field5046 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field5046.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field5046.close();
				} catch (Exception var4) {
				}

				++this.field5045;
				this.field5046 = null;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltd;ZI)V",
		garbageValue = "-896488872"
	)
	public void method8691(AbstractSocket var1, boolean var2) {
		if (this.field5046 != null) {
			try {
				this.field5046.close();
			} catch (Exception var7) {
			}

			this.field5046 = null;
		}

		this.field5046 = var1;
		this.method8679(var2);
		this.field5060.offset = 0;
		this.field5059 = null;
		this.field5061 = null;
		this.field5062 = 0;

		while (true) {
			class419 var3 = (class419)this.field5051.first();
			if (var3 == null) {
				while (true) {
					var3 = (class419)this.field5056.first();
					if (var3 == null) {
						if (this.field5040 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field5040);
								var8.writeShort(0);
								this.field5046.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field5046.close();
								} catch (Exception var5) {
								}

								++this.field5045;
								this.field5046 = null;
							}
						}

						this.field5068 = 0;
						this.field5063 = ParamComposition.method4708();
						return;
					}

					this.field5048.method8946(var3);
					this.field5054.put(var3, var3.key);
					++this.field5055;
					--this.field5057;
				}
			}

			this.field5049.put(var3, var3.key);
			++this.field5050;
			--this.field5052;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqn;IB)V",
		garbageValue = "0"
	)
	void method8682(Archive var1, int var2) {
		if (var1.field4974) {
			if (!var1.field4983) {
				if (var2 <= this.field5058) {
					throw new RuntimeException("");
				}

				if (var2 < this.field5067) {
					this.field5067 = var2;
				}
			}
		} else {
			if (var2 >= this.field5067) {
				throw new RuntimeException("");
			}

			if (var2 > this.field5058) {
				this.field5058 = var2;
			}
		}

		if (this.field5053 != null) {
			this.method8688(var1, var2);
		} else {
			this.method8684((Archive)null, class418.field4996.field5012, 255, 0, (byte)0, true);
			this.field5065[var2] = var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqn;IB)V",
		garbageValue = "-1"
	)
	void method8688(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field5053.array.length - 8) {
			this.field5053.offset = var3 * 1741769013;
			var4 = this.field5053.readInt();
			var5 = this.field5053.readInt();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4974) {
				var1.method8536();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqn;IIIBZI)V",
		garbageValue = "-1600943359"
	)
	void method8684(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class419 var9 = (class419)this.field5049.get(var7);
		if (var9 == null) {
			var9 = (class419)this.field5051.get(var7);
			if (var9 == null) {
				var9 = (class419)this.field5054.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field5049.put(var9, var7);
						--this.field5055;
						++this.field5050;
					}

				} else {
					if (!var6) {
						var9 = (class419)this.field5056.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class419();
					var9.field5013 = var1;
					var9.field5015 = var4;
					var9.field5014 = var5;
					if (var6) {
						this.field5049.put(var9, var7);
						++this.field5050;
					} else {
						this.field5048.method8951(var9);
						this.field5054.put(var9, var7);
						++this.field5055;
					}

				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "762552045"
	)
	void method8685(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class419 var5 = (class419)this.field5054.get(var3);
		if (var5 != null) {
			this.field5048.method8946(var5);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1916961151"
	)
	int method8686(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field5059 != null && this.field5059.key == var3 ? this.field5061.offset * -1722618313 / (this.field5061.array.length - this.field5059.field5014) + 1 : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "1631254210"
	)
	public int method8687(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field5052 + this.field5050;
		return var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "402700537"
	)
	public void method8715() {
		if (this.field5046 != null) {
			try {
				this.field5046.close();
			} catch (Exception var2) {
			}

			this.field5046 = null;
		}

	}
}
