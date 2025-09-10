import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1846051789
	)
	public int field4990;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1242064413
	)
	public int field4986;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	AbstractSocket field4988;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 255957077
	)
	int field5001;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 6764870398327980591L
	)
	long field4983;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	NodeHashTable field4991;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -114532645
	)
	int field4992;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	NodeHashTable field5010;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1031124571
	)
	int field5005;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	DualNodeDeque field5004;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	NodeHashTable field4996;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2125892579
	)
	int field4982;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	NodeHashTable field4998;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1316090941
	)
	int field4999;
	@ObfuscatedName("ah")
	boolean field5000;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	class411 field4995;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	Buffer field5002;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	Buffer field5003;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1282135649
	)
	int field4993;
	@ObfuscatedName("az")
	CRC32 field4994;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	Buffer field5006;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lpw;"
	)
	Archive[] field5007;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1124589425
	)
	int field5008;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1821212321
	)
	int field4997;
	@ObfuscatedName("bd")
	byte field4987;

	public JagNetThread() {
		this.field4990 = 0;
		this.field4986 = 0;
		this.field5001 = 0;
		this.field4991 = new NodeHashTable(4096);
		this.field4992 = 0;
		this.field5010 = new NodeHashTable(32);
		this.field5005 = 0;
		this.field5004 = new DualNodeDeque();
		this.field4996 = new NodeHashTable(4096);
		this.field4982 = 0;
		this.field4998 = new NodeHashTable(4096);
		this.field4999 = 0;
		this.field5002 = new Buffer(8);
		this.field4993 = 0;
		this.field4994 = new CRC32();
		this.field5007 = new Archive[256];
		this.field5008 = -1;
		this.field4997 = 255;
		this.field4987 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1654226636"
	)
	public boolean method8445() {
		long var1 = class189.method4284();
		int var3 = (int)(var1 - this.field4983);
		this.field4983 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field5001 += var3;
		if (this.field4999 == 0 && this.field5005 == 0 && this.field4982 == 0 && this.field4992 == 0) {
			return true;
		} else if (this.field4988 == null) {
			return false;
		} else {
			try {
				if (this.field5001 > 30000) {
					throw new IOException();
				} else {
					class411 var4;
					Buffer var5;
					while (this.field5005 < 200 && this.field4992 > 0) {
						var4 = (class411)this.field4991.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4988.write(var5.field5916, 0, 4);
						this.field5010.put(var4, var4.key);
						--this.field4992;
						++this.field5005;
					}

					while (this.field4999 < 200 && this.field4982 > 0) {
						var4 = (class411)this.field5004.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4988.write(var5.field5916, 0, 4);
						var4.removeDual();
						this.field4998.put(var4, var4.key);
						--this.field4982;
						++this.field4999;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4988.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field5001 = 0;
						byte var6 = 0;
						if (this.field4995 == null) {
							var6 = 8;
						} else if (this.field4993 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field5002.array * 1216585693;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4988.read(this.field5002.field5916, this.field5002.array * 1216585693, var7);
							if (this.field4987 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field5002.field5916;
									var10001 = 1216585693 * this.field5002.array + var8;
									var10000[var10001] ^= this.field4987;
								}
							}

							var22 = this.field5002;
							var22.array += var7 * -290410379;
							if (this.field5002.array * 1216585693 < var6) {
								break;
							}

							if (this.field4995 == null) {
								this.field5002.array = 0;
								var8 = this.field5002.readUnsignedByte();
								var9 = this.field5002.readUnsignedShort();
								int var10 = this.field5002.readUnsignedByte();
								int var11 = this.field5002.readShortSmart();
								long var12 = (long)(var9 + (var8 << 16));
								class411 var14 = (class411)this.field5010.get(var12);
								this.field5000 = true;
								if (var14 == null) {
									var14 = (class411)this.field4998.get(var12);
									this.field5000 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4995 = var14;
								this.field5003 = new Buffer(this.field4995.field4955 + var11 + var15);
								this.field5003.writeByte(var10);
								this.field5003.writeInt(var11);
								this.field4993 = 8;
								this.field5002.array = 0;
							} else if (this.field4993 == 0) {
								if (this.field5002.field5916[0] == -1) {
									this.field4993 = 1;
									this.field5002.array = 0;
								} else {
									this.field4995 = null;
								}
							}
						} else {
							var7 = this.field5003.field5916.length - this.field4995.field4955;
							var8 = 512 - this.field4993;
							if (var8 > var7 - this.field5003.array * 1216585693) {
								var8 = var7 - this.field5003.array * 1216585693;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4988.read(this.field5003.field5916, this.field5003.array * 1216585693, var8);
							if (this.field4987 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field5003.field5916;
									var10001 = var9 + 1216585693 * this.field5003.array;
									var10000[var10001] ^= this.field4987;
								}
							}

							var22 = this.field5003;
							var22.array += var8 * -290410379;
							this.field4993 += var8;
							if (var7 == this.field5003.array * 1216585693) {
								if (16711935L == this.field4995.key) {
									this.field5006 = this.field5003;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field5007[var9];
										if (var18 != null) {
											this.method8439(var18, var9);
										}
									}
								} else {
									this.field4994.reset();
									this.field4994.update(this.field5003.field5916, 0, var7);
									var9 = (int)this.field4994.getValue();
									if (this.field4995.field4956 != var9) {
										try {
											this.field4988.close();
										} catch (Exception var20) {
										}

										++this.field4990;
										this.field4988 = null;
										this.field4987 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4990 = 0;
									this.field4986 = 0;
									this.field4995.field4958.write((int)(this.field4995.key & 65535L), this.field5003.field5916, (this.field4995.key & 16711680L) == 16711680L, this.field5000);
								}

								this.field4995.remove();
								if (this.field5000) {
									--this.field5005;
								} else {
									--this.field4999;
								}

								this.field4993 = 0;
								this.field4995 = null;
								this.field5003 = null;
							} else {
								if (this.field4993 != 512) {
									break;
								}

								this.field4993 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4988.close();
				} catch (Exception var19) {
				}

				++this.field4986;
				this.field4988 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1600181323"
	)
	public void method8436(boolean var1) {
		if (this.field4988 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4988.write(var2.field5916, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4988.close();
				} catch (Exception var4) {
				}

				++this.field4986;
				this.field4988 = null;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltf;ZI)V",
		garbageValue = "-129918506"
	)
	public void method8451(AbstractSocket var1, boolean var2) {
		if (this.field4988 != null) {
			try {
				this.field4988.close();
			} catch (Exception var7) {
			}

			this.field4988 = null;
		}

		this.field4988 = var1;
		this.method8436(var2);
		this.field5002.array = 0;
		this.field4995 = null;
		this.field5003 = null;
		this.field4993 = 0;

		while (true) {
			class411 var3 = (class411)this.field5010.first();
			if (var3 == null) {
				while (true) {
					var3 = (class411)this.field4998.first();
					if (var3 == null) {
						if (this.field4987 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4987);
								var8.writeShort(0);
								this.field4988.write(var8.field5916, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4988.close();
								} catch (Exception var5) {
								}

								++this.field4986;
								this.field4988 = null;
							}
						}

						this.field5001 = 0;
						this.field4983 = class189.method4284();
						return;
					}

					this.field5004.method8672(var3);
					this.field4996.put(var3, var3.key);
					++this.field4982;
					--this.field4999;
				}
			}

			this.field4991.put(var3, var3.key);
			++this.field4992;
			--this.field5005;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpw;II)V",
		garbageValue = "1427558759"
	)
	void method8438(Archive var1, int var2) {
		if (var1.field4916) {
			if (!var1.field4915) {
				if (var2 <= this.field5008) {
					throw new RuntimeException("");
				}

				if (var2 < this.field4997) {
					this.field4997 = var2;
				}
			}
		} else {
			if (var2 >= this.field4997) {
				throw new RuntimeException("");
			}

			if (var2 > this.field5008) {
				this.field5008 = var2;
			}
		}

		if (this.field5006 != null) {
			this.method8439(var1, var2);
		} else {
			this.method8437((Archive)null, class410.field4947.field4954, 255, 0, (byte)0, true);
			this.field5007[var2] = var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpw;IB)V",
		garbageValue = "82"
	)
	void method8439(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field5006.field5916.length - 8) {
			this.field5006.array = var3 * -290410379;
			var4 = this.field5006.readShortSmart();
			var5 = this.field5006.readShortSmart();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4916) {
				var1.method8290();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpw;IIIBZI)V",
		garbageValue = "1463804395"
	)
	void method8437(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class411 var9 = (class411)this.field4991.get(var7);
		if (var9 == null) {
			var9 = (class411)this.field5010.get(var7);
			if (var9 == null) {
				var9 = (class411)this.field4996.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4991.put(var9, var7);
						--this.field4982;
						++this.field4992;
					}

				} else {
					if (!var6) {
						var9 = (class411)this.field4998.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class411();
					var9.field4958 = var1;
					var9.field4956 = var4;
					var9.field4955 = var5;
					if (var6) {
						this.field4991.put(var9, var7);
						++this.field4992;
					} else {
						this.field5004.method8671(var9);
						this.field4996.put(var9, var7);
						++this.field4982;
					}

				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-542682410"
	)
	void method8440(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class411 var5 = (class411)this.field4996.get(var3);
		if (var5 != null) {
			this.field5004.method8672(var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1307548155"
	)
	int method8442(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4995 != null && this.field4995.key == var3 ? this.field5003.array * 182899319 / (this.field5003.field5916.length - this.field4995.field4955) + 1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "85"
	)
	public int method8443(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4992 + this.field5005;
		return var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1289631183"
	)
	public void method8454() {
		if (this.field4988 != null) {
			try {
				this.field4988.close();
			} catch (Exception var2) {
			}

			this.field4988 = null;
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIII)I",
		garbageValue = "-745852708"
	)
	static final int method8434(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var10 * var8 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}
}
