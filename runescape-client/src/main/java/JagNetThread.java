import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	AbstractSocket field4598;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1096464379
	)
	int field4607;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 4500052521144206431L
	)
	long field4600;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	NodeHashTable field4608;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -315141703
	)
	int field4602;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	NodeHashTable field4603;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1574586861
	)
	int field4604;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	DualNodeDeque field4605;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	NodeHashTable field4621;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 578012545
	)
	int field4612;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	NodeHashTable field4601;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -150234431
	)
	int field4609;
	@ObfuscatedName("av")
	boolean field4610;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	class390 field4611;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4596;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4613;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1583644273
	)
	int field4614;
	@ObfuscatedName("ap")
	CRC32 field4615;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field4616;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lok;"
	)
	Archive[] field4594;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1230184665
	)
	int field4599;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1123849549
	)
	int field4619;
	@ObfuscatedName("bw")
	byte field4620;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 94194841
	)
	public int field4617;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 794022525
	)
	public int field4622;

	public JagNetThread() {
		this.field4607 = 0;
		this.field4608 = new NodeHashTable(4096);
		this.field4602 = 0;
		this.field4603 = new NodeHashTable(32);
		this.field4604 = 0;
		this.field4605 = new DualNodeDeque();
		this.field4621 = new NodeHashTable(4096);
		this.field4612 = 0;
		this.field4601 = new NodeHashTable(4096);
		this.field4609 = 0;
		this.field4596 = new Buffer(8);
		this.field4614 = 0;
		this.field4615 = new CRC32();
		this.field4594 = new Archive[256];
		this.field4599 = -1;
		this.field4619 = 255;
		this.field4620 = 0;
		this.field4617 = 0;
		this.field4622 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public boolean method7822() {
		long var1 = ReflectionCheck.method724();
		int var3 = (int)(var1 - this.field4600);
		this.field4600 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4607 += var3;
		if (this.field4609 == 0 && this.field4604 == 0 && this.field4612 == 0 && this.field4602 == 0) {
			return true;
		} else if (this.field4598 == null) {
			return false;
		} else {
			try {
				if (this.field4607 > 30000) {
					throw new IOException();
				} else {
					class390 var4;
					Buffer var5;
					while (this.field4604 < 200 && this.field4602 > 0) {
						var4 = (class390)this.field4608.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4598.write(var5.array, 0, 4);
						this.field4603.put(var4, var4.key);
						--this.field4602;
						++this.field4604;
					}

					while (this.field4609 < 200 && this.field4612 > 0) {
						var4 = (class390)this.field4605.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4598.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4601.put(var4, var4.key);
						--this.field4612;
						++this.field4609;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4598.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4607 = 0;
						byte var6 = 0;
						if (this.field4611 == null) {
							var6 = 8;
						} else if (this.field4614 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4596.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4598.read(this.field4596.array, this.field4596.offset, var7);
							if (this.field4620 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4596.array;
									var10001 = var8 + this.field4596.offset;
									var10000[var10001] ^= this.field4620;
								}
							}

							var22 = this.field4596;
							var22.offset += var7;
							if (this.field4596.offset < var6) {
								break;
							}

							if (this.field4611 == null) {
								this.field4596.offset = 0;
								var8 = this.field4596.readUnsignedByte();
								var9 = this.field4596.readUnsignedShort();
								int var10 = this.field4596.readUnsignedByte();
								int var11 = this.field4596.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class390 var14 = (class390)this.field4603.get(var12);
								this.field4610 = true;
								if (var14 == null) {
									var14 = (class390)this.field4601.get(var12);
									this.field4610 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4611 = var14;
								this.field4613 = new Buffer(this.field4611.field4572 + var11 + var15);
								this.field4613.writeByte(var10);
								this.field4613.writeInt(var11);
								this.field4614 = 8;
								this.field4596.offset = 0;
							} else if (this.field4614 == 0) {
								if (this.field4596.array[0] == -1) {
									this.field4614 = 1;
									this.field4596.offset = 0;
								} else {
									this.field4611 = null;
								}
							}
						} else {
							var7 = this.field4613.array.length - this.field4611.field4572;
							var8 = 512 - this.field4614;
							if (var8 > var7 - this.field4613.offset) {
								var8 = var7 - this.field4613.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4598.read(this.field4613.array, this.field4613.offset, var8);
							if (this.field4620 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4613.array;
									var10001 = var9 + this.field4613.offset;
									var10000[var10001] ^= this.field4620;
								}
							}

							var22 = this.field4613;
							var22.offset += var8;
							this.field4614 += var8;
							if (this.field4613.offset == var7) {
								if (this.field4611.key == 16711935L) {
									this.field4616 = this.field4613;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4594[var9];
										if (var18 != null) {
											this.method7826(var18, var9);
										}
									}
								} else {
									this.field4615.reset();
									this.field4615.update(this.field4613.array, 0, var7);
									var9 = (int)this.field4615.getValue();
									if (this.field4611.field4575 != var9) {
										try {
											this.field4598.close();
										} catch (Exception var20) {
										}

										++this.field4617;
										this.field4598 = null;
										this.field4620 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4617 = 0;
									this.field4622 = 0;
									this.field4611.field4573.write((int)(this.field4611.key & 65535L), this.field4613.array, (this.field4611.key & 16711680L) == 16711680L, this.field4610);
								}

								this.field4611.remove();
								if (this.field4610) {
									--this.field4604;
								} else {
									--this.field4609;
								}

								this.field4614 = 0;
								this.field4611 = null;
								this.field4613 = null;
							} else {
								if (this.field4614 != 512) {
									break;
								}

								this.field4614 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4598.close();
				} catch (Exception var19) {
				}

				++this.field4622;
				this.field4598 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1932547567"
	)
	public void method7823(boolean var1) {
		if (this.field4598 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4598.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4598.close();
				} catch (Exception var4) {
				}

				++this.field4622;
				this.field4598 = null;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ZI)V",
		garbageValue = "231801779"
	)
	public void method7835(AbstractSocket var1, boolean var2) {
		if (this.field4598 != null) {
			try {
				this.field4598.close();
			} catch (Exception var7) {
			}

			this.field4598 = null;
		}

		this.field4598 = var1;
		this.method7823(var2);
		this.field4596.offset = 0;
		this.field4611 = null;
		this.field4613 = null;
		this.field4614 = 0;

		while (true) {
			class390 var3 = (class390)this.field4603.first();
			if (var3 == null) {
				while (true) {
					var3 = (class390)this.field4601.first();
					if (var3 == null) {
						if (this.field4620 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4620);
								var8.writeShort(0);
								this.field4598.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4598.close();
								} catch (Exception var5) {
								}

								++this.field4622;
								this.field4598 = null;
							}
						}

						this.field4607 = 0;
						this.field4600 = ReflectionCheck.method724();
						return;
					}

					this.field4605.method7990(var3);
					this.field4621.put(var3, var3.key);
					++this.field4612;
					--this.field4609;
				}
			}

			this.field4608.put(var3, var3.key);
			++this.field4602;
			--this.field4604;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lok;IB)V",
		garbageValue = "0"
	)
	void method7825(Archive var1, int var2) {
		if (var1.field4544 && !var1.field4545) {
			if (var2 <= this.field4599) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4619) {
				this.field4619 = var2;
			}
		} else {
			if (var2 >= this.field4619) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4599) {
				this.field4599 = var2;
			}
		}

		if (this.field4616 != null) {
			this.method7826(var1, var2);
		} else {
			this.method7827((Archive)null, class389.field4550.field4567, 255, 0, (byte)0, true);
			this.field4594[var2] = var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "6968583"
	)
	void method7826(Archive var1, int var2) {
		this.field4616.offset = var2 * 8 + 5;
		if (this.field4616.offset >= this.field4616.array.length) {
			if (var1.field4544) {
				var1.method7678();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4616.readInt();
			int var4 = this.field4616.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIBZI)V",
		garbageValue = "-1674923453"
	)
	void method7827(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class390 var9 = (class390)this.field4608.get(var7);
		if (var9 == null) {
			var9 = (class390)this.field4603.get(var7);
			if (var9 == null) {
				var9 = (class390)this.field4621.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4608.put(var9, var7);
						--this.field4612;
						++this.field4602;
					}

				} else {
					if (!var6) {
						var9 = (class390)this.field4601.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class390();
					var9.field4573 = var1;
					var9.field4575 = var4;
					var9.field4572 = var5;
					if (var6) {
						this.field4608.put(var9, var7);
						++this.field4602;
					} else {
						this.field4605.method7987(var9);
						this.field4621.put(var9, var7);
						++this.field4612;
					}

				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "72025246"
	)
	void method7828(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class390 var5 = (class390)this.field4621.get(var3);
		if (var5 != null) {
			this.field4605.method7990(var5);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1504854630"
	)
	int method7831(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4611 != null && var3 == this.field4611.key ? this.field4613.offset * 99 / (this.field4613.array.length - this.field4611.field4572) + 1 : 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZS)I",
		garbageValue = "129"
	)
	public int method7836(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4604 + this.field4602;
		return var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22957"
	)
	public void method7855() {
		if (this.field4598 != null) {
			try {
				this.field4598.close();
			} catch (Exception var2) {
			}

			this.field4598 = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "92155993"
	)
	public static void method7840(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field2505 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}
}
