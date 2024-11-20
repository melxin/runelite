import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	AbstractSocket field4616;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -645083327
	)
	int field4602;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -6158876889406648839L
	)
	long field4621;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	NodeHashTable field4604;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1469677851
	)
	int field4605;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	NodeHashTable field4606;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 318539251
	)
	int field4607;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	DualNodeDeque field4608;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	NodeHashTable field4598;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1038530857
	)
	int field4610;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	NodeHashTable field4599;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2116174113
	)
	int field4611;
	@ObfuscatedName("ap")
	boolean field4613;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class390 field4614;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	Buffer field4597;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	Buffer field4601;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -140412493
	)
	int field4617;
	@ObfuscatedName("aq")
	CRC32 field4600;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	Buffer field4619;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	Archive[] field4620;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 16062153
	)
	int field4609;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1890843457
	)
	int field4622;
	@ObfuscatedName("bv")
	byte field4623;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1846965687
	)
	public int field4624;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1670082771
	)
	public int field4625;

	public JagNetThread() {
		this.field4602 = 0;
		this.field4604 = new NodeHashTable(4096);
		this.field4605 = 0;
		this.field4606 = new NodeHashTable(32);
		this.field4607 = 0;
		this.field4608 = new DualNodeDeque();
		this.field4598 = new NodeHashTable(4096);
		this.field4610 = 0;
		this.field4599 = new NodeHashTable(4096);
		this.field4611 = 0;
		this.field4597 = new Buffer(8);
		this.field4617 = 0;
		this.field4600 = new CRC32();
		this.field4620 = new Archive[256];
		this.field4609 = -1;
		this.field4622 = 255;
		this.field4623 = 0;
		this.field4624 = 0;
		this.field4625 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-726062557"
	)
	public boolean method7674() {
		long var1 = class59.method1150();
		int var3 = (int)(var1 - this.field4621);
		this.field4621 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4602 += var3;
		if (this.field4611 == 0 && this.field4607 == 0 && this.field4610 == 0 && this.field4605 == 0) {
			return true;
		} else if (this.field4616 == null) {
			return false;
		} else {
			try {
				if (this.field4602 > 30000) {
					throw new IOException();
				} else {
					class390 var4;
					Buffer var5;
					while (this.field4607 < 200 && this.field4605 > 0) {
						var4 = (class390)this.field4604.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4616.write(var5.array, 0, 4);
						this.field4606.put(var4, var4.key);
						--this.field4605;
						++this.field4607;
					}

					while (this.field4611 < 200 && this.field4610 > 0) {
						var4 = (class390)this.field4608.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4616.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4599.put(var4, var4.key);
						--this.field4610;
						++this.field4611;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4616.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4602 = 0;
						byte var6 = 0;
						if (this.field4614 == null) {
							var6 = 8;
						} else if (this.field4617 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4597.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4616.read(this.field4597.array, this.field4597.offset, var7);
							if (this.field4623 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4597.array;
									var10001 = var8 + this.field4597.offset;
									var10000[var10001] ^= this.field4623;
								}
							}

							var22 = this.field4597;
							var22.offset += var7;
							if (this.field4597.offset < var6) {
								break;
							}

							if (this.field4614 == null) {
								this.field4597.offset = 0;
								var8 = this.field4597.readUnsignedByte();
								var9 = this.field4597.readUnsignedShort();
								int var10 = this.field4597.readUnsignedByte();
								int var11 = this.field4597.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class390 var14 = (class390)this.field4606.get(var12);
								this.field4613 = true;
								if (var14 == null) {
									var14 = (class390)this.field4599.get(var12);
									this.field4613 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4614 = var14;
								this.field4601 = new Buffer(this.field4614.field4573 + var11 + var15);
								this.field4601.writeByte(var10);
								this.field4601.writeInt(var11);
								this.field4617 = 8;
								this.field4597.offset = 0;
							} else if (this.field4617 == 0) {
								if (this.field4597.array[0] == -1) {
									this.field4617 = 1;
									this.field4597.offset = 0;
								} else {
									this.field4614 = null;
								}
							}
						} else {
							var7 = this.field4601.array.length - this.field4614.field4573;
							var8 = 512 - this.field4617;
							if (var8 > var7 - this.field4601.offset) {
								var8 = var7 - this.field4601.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4616.read(this.field4601.array, this.field4601.offset, var8);
							if (this.field4623 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4601.array;
									var10001 = var9 + this.field4601.offset;
									var10000[var10001] ^= this.field4623;
								}
							}

							var22 = this.field4601;
							var22.offset += var8;
							this.field4617 += var8;
							if (this.field4601.offset == var7) {
								if (16711935L == this.field4614.key) {
									this.field4619 = this.field4601;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4620[var9];
										if (var18 != null) {
											this.method7648(var18, var9);
										}
									}
								} else {
									this.field4600.reset();
									this.field4600.update(this.field4601.array, 0, var7);
									var9 = (int)this.field4600.getValue();
									if (this.field4614.field4575 != var9) {
										try {
											this.field4616.close();
										} catch (Exception var20) {
										}

										++this.field4624;
										this.field4616 = null;
										this.field4623 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4624 = 0;
									this.field4625 = 0;
									this.field4614.field4574.write((int)(this.field4614.key & 65535L), this.field4601.array, 16711680L == (this.field4614.key & 16711680L), this.field4613);
								}

								this.field4614.remove();
								if (this.field4613) {
									--this.field4607;
								} else {
									--this.field4611;
								}

								this.field4617 = 0;
								this.field4614 = null;
								this.field4601 = null;
							} else {
								if (this.field4617 != 512) {
									break;
								}

								this.field4617 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4616.close();
				} catch (Exception var19) {
				}

				++this.field4625;
				this.field4616 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-72"
	)
	public void method7669(boolean var1) {
		if (this.field4616 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4616.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4616.close();
				} catch (Exception var4) {
				}

				++this.field4625;
				this.field4616 = null;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsw;ZB)V",
		garbageValue = "-78"
	)
	public void method7657(AbstractSocket var1, boolean var2) {
		if (this.field4616 != null) {
			try {
				this.field4616.close();
			} catch (Exception var7) {
			}

			this.field4616 = null;
		}

		this.field4616 = var1;
		this.method7669(var2);
		this.field4597.offset = 0;
		this.field4614 = null;
		this.field4601 = null;
		this.field4617 = 0;

		while (true) {
			class390 var3 = (class390)this.field4606.first();
			if (var3 == null) {
				while (true) {
					var3 = (class390)this.field4599.first();
					if (var3 == null) {
						if (this.field4623 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4623);
								var8.writeShort(0);
								this.field4616.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4616.close();
								} catch (Exception var5) {
								}

								++this.field4625;
								this.field4616 = null;
							}
						}

						this.field4602 = 0;
						this.field4621 = class59.method1150();
						return;
					}

					this.field4608.method7815(var3);
					this.field4598.put(var3, var3.key);
					++this.field4610;
					--this.field4611;
				}
			}

			this.field4604.put(var3, var3.key);
			++this.field4605;
			--this.field4607;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Loa;II)V",
		garbageValue = "-1337744373"
	)
	void method7646(Archive var1, int var2) {
		if (var1.field4545 && !var1.field4543) {
			if (var2 <= this.field4609) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4622) {
				this.field4622 = var2;
			}
		} else {
			if (var2 >= this.field4622) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4609) {
				this.field4609 = var2;
			}
		}

		if (this.field4619 != null) {
			this.method7648(var1, var2);
		} else {
			this.method7651((Archive)null, class389.field4568.field4548, 255, 0, (byte)0, true);
			this.field4620[var2] = var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loa;II)V",
		garbageValue = "1291290342"
	)
	void method7648(Archive var1, int var2) {
		this.field4619.offset = var2 * 8 + 5;
		if (this.field4619.offset >= this.field4619.array.length) {
			if (var1.field4545) {
				var1.method7516();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4619.readInt();
			int var4 = this.field4619.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Loa;IIIBZI)V",
		garbageValue = "-1566802529"
	)
	void method7651(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class390 var9 = (class390)this.field4604.get(var7);
		if (var9 == null) {
			var9 = (class390)this.field4606.get(var7);
			if (var9 == null) {
				var9 = (class390)this.field4598.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4604.put(var9, var7);
						--this.field4610;
						++this.field4605;
					}

				} else {
					if (!var6) {
						var9 = (class390)this.field4599.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class390();
					var9.field4574 = var1;
					var9.field4575 = var4;
					var9.field4573 = var5;
					if (var6) {
						this.field4604.put(var9, var7);
						++this.field4605;
					} else {
						this.field4608.method7812(var9);
						this.field4598.put(var9, var7);
						++this.field4610;
					}

				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1748984711"
	)
	void method7652(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class390 var5 = (class390)this.field4598.get(var3);
		if (var5 != null) {
			this.field4608.method7815(var5);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "895056112"
	)
	int method7670(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4614 != null && this.field4614.key == var3 ? this.field4601.offset * 99 / (this.field4601.array.length - this.field4614.field4573) + 1 : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-817453426"
	)
	public int method7654(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4607 + this.field4605;
		return var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "834903796"
	)
	public void method7655() {
		if (this.field4616 != null) {
			try {
				this.field4616.close();
			} catch (Exception var2) {
			}

			this.field4616 = null;
		}

	}
}
