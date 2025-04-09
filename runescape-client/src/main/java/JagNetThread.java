import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -112249209
	)
	public int field4739;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1108322479
	)
	public int field4740;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	AbstractSocket field4736;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -735472701
	)
	int field4742;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -9089829962290153559L
	)
	long field4741;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeHashTable field4754;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1564712929
	)
	int field4745;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeHashTable field4746;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 737985829
	)
	int field4747;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	DualNodeDeque field4748;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeHashTable field4749;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1960102249
	)
	int field4750;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeHashTable field4744;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -995410041
	)
	int field4752;
	@ObfuscatedName("ai")
	boolean field4760;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	class401 field4743;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	Buffer field4755;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	Buffer field4756;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -799394209
	)
	int field4757;
	@ObfuscatedName("ab")
	CRC32 field4753;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	Buffer field4759;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lpx;"
	)
	Archive[] field4761;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1139978161
	)
	int field4758;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -861448963
	)
	int field4762;
	@ObfuscatedName("bl")
	byte field4763;

	public JagNetThread() {
		this.field4739 = 0;
		this.field4740 = 0;
		this.field4742 = 0;
		this.field4754 = new NodeHashTable(4096);
		this.field4745 = 0;
		this.field4746 = new NodeHashTable(32);
		this.field4747 = 0;
		this.field4748 = new DualNodeDeque();
		this.field4749 = new NodeHashTable(4096);
		this.field4750 = 0;
		this.field4744 = new NodeHashTable(4096);
		this.field4752 = 0;
		this.field4755 = new Buffer(8);
		this.field4757 = 0;
		this.field4753 = new CRC32();
		this.field4761 = new Archive[256];
		this.field4758 = -1;
		this.field4762 = 255;
		this.field4763 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public boolean method7785() {
		long var1 = class282.method5908();
		int var3 = (int)(var1 - this.field4741);
		this.field4741 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4742 += var3;
		if (this.field4752 == 0 && this.field4747 == 0 && this.field4750 == 0 && this.field4745 == 0) {
			return true;
		} else if (this.field4736 == null) {
			return false;
		} else {
			try {
				if (this.field4742 > 30000) {
					throw new IOException();
				} else {
					class401 var4;
					Buffer var5;
					while (this.field4747 < 200 && this.field4745 > 0) {
						var4 = (class401)this.field4754.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4736.write(var5.array, 0, 4);
						this.field4746.put(var4, var4.key);
						--this.field4745;
						++this.field4747;
					}

					while (this.field4752 < 200 && this.field4750 > 0) {
						var4 = (class401)this.field4748.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4736.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4744.put(var4, var4.key);
						--this.field4750;
						++this.field4752;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4736.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4742 = 0;
						byte var6 = 0;
						if (this.field4743 == null) {
							var6 = 8;
						} else if (this.field4757 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4755.offset * -2066221813;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4736.read(this.field4755.array, this.field4755.offset * -2066221813, var7);
							if (this.field4763 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4755.array;
									var10001 = var8 + this.field4755.offset * -2066221813;
									var10000[var10001] ^= this.field4763;
								}
							}

							var22 = this.field4755;
							var22.offset += var7 * 29699747;
							if (this.field4755.offset * -2066221813 < var6) {
								break;
							}

							if (this.field4743 == null) {
								this.field4755.offset = 0;
								var8 = this.field4755.readUnsignedByte();
								var9 = this.field4755.readUnsignedShort();
								int var10 = this.field4755.readUnsignedByte();
								int var11 = this.field4755.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class401 var14 = (class401)this.field4746.get(var12);
								this.field4760 = true;
								if (var14 == null) {
									var14 = (class401)this.field4744.get(var12);
									this.field4760 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4743 = var14;
								this.field4756 = new Buffer(this.field4743.field4715 + var11 + var15);
								this.field4756.writeByte(var10);
								this.field4756.writeInt(var11);
								this.field4757 = 8;
								this.field4755.offset = 0;
							} else if (this.field4757 == 0) {
								if (this.field4755.array[0] == -1) {
									this.field4757 = 1;
									this.field4755.offset = 0;
								} else {
									this.field4743 = null;
								}
							}
						} else {
							var7 = this.field4756.array.length - this.field4743.field4715;
							var8 = 512 - this.field4757;
							if (var8 > var7 - this.field4756.offset * -2066221813) {
								var8 = var7 - this.field4756.offset * -2066221813;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4736.read(this.field4756.array, this.field4756.offset * -2066221813, var8);
							if (this.field4763 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4756.array;
									var10001 = var9 + this.field4756.offset * -2066221813;
									var10000[var10001] ^= this.field4763;
								}
							}

							var22 = this.field4756;
							var22.offset += var8 * 29699747;
							this.field4757 += var8;
							if (var7 == this.field4756.offset * -2066221813) {
								if (this.field4743.key == 16711935L) {
									this.field4759 = this.field4756;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4761[var9];
										if (var18 != null) {
											this.method7789(var18, var9);
										}
									}
								} else {
									this.field4753.reset();
									this.field4753.update(this.field4756.array, 0, var7);
									var9 = (int)this.field4753.getValue();
									if (this.field4743.field4714 != var9) {
										try {
											this.field4736.close();
										} catch (Exception var20) {
										}

										++this.field4739;
										this.field4736 = null;
										this.field4763 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4739 = 0;
									this.field4740 = 0;
									this.field4743.field4713.write((int)(this.field4743.key & 65535L), this.field4756.array, 16711680L == (this.field4743.key & 16711680L), this.field4760);
								}

								this.field4743.remove();
								if (this.field4760) {
									--this.field4747;
								} else {
									--this.field4752;
								}

								this.field4757 = 0;
								this.field4743 = null;
								this.field4756 = null;
							} else {
								if (this.field4757 != 512) {
									break;
								}

								this.field4757 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4736.close();
				} catch (Exception var19) {
				}

				++this.field4740;
				this.field4736 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-49853517"
	)
	public void method7787(boolean var1) {
		if (this.field4736 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4736.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4736.close();
				} catch (Exception var4) {
				}

				++this.field4740;
				this.field4736 = null;
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZI)V",
		garbageValue = "-1944791955"
	)
	public void method7798(AbstractSocket var1, boolean var2) {
		if (this.field4736 != null) {
			try {
				this.field4736.close();
			} catch (Exception var7) {
			}

			this.field4736 = null;
		}

		this.field4736 = var1;
		this.method7787(var2);
		this.field4755.offset = 0;
		this.field4743 = null;
		this.field4756 = null;
		this.field4757 = 0;

		while (true) {
			class401 var3 = (class401)this.field4746.first();
			if (var3 == null) {
				while (true) {
					var3 = (class401)this.field4744.first();
					if (var3 == null) {
						if (this.field4763 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4763);
								var8.writeShort(0);
								this.field4736.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4736.close();
								} catch (Exception var5) {
								}

								++this.field4740;
								this.field4736 = null;
							}
						}

						this.field4742 = 0;
						this.field4741 = class282.method5908();
						return;
					}

					this.field4748.method8029(var3);
					this.field4749.put(var3, var3.key);
					++this.field4750;
					--this.field4752;
				}
			}

			this.field4754.put(var3, var3.key);
			++this.field4745;
			--this.field4747;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "1743319486"
	)
	void method7788(Archive var1, int var2) {
		if (var1.field4669) {
			if (!var1.field4672) {
				if (var2 <= this.field4758) {
					throw new RuntimeException("");
				}

				if (var2 < this.field4762) {
					this.field4762 = var2;
				}
			}
		} else {
			if (var2 >= this.field4762) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4758) {
				this.field4758 = var2;
			}
		}

		if (this.field4759 != null) {
			this.method7789(var1, var2);
		} else {
			this.method7790((Archive)null, class400.field4706.field4712, 255, 0, (byte)0, true);
			this.field4761[var2] = var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-2016103724"
	)
	void method7789(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field4759.array.length - 8) {
			this.field4759.offset = var3 * 29699747;
			var4 = this.field4759.readInt();
			var5 = this.field4759.readInt();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4669) {
				var1.method7633();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IIIBZI)V",
		garbageValue = "-1255739505"
	)
	void method7790(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class401 var9 = (class401)this.field4754.get(var7);
		if (var9 == null) {
			var9 = (class401)this.field4746.get(var7);
			if (var9 == null) {
				var9 = (class401)this.field4749.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4754.put(var9, var7);
						--this.field4750;
						++this.field4745;
					}

				} else {
					if (!var6) {
						var9 = (class401)this.field4744.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class401();
					var9.field4713 = var1;
					var9.field4714 = var4;
					var9.field4715 = var5;
					if (var6) {
						this.field4754.put(var9, var7);
						++this.field4745;
					} else {
						this.field4748.method8032(var9);
						this.field4749.put(var9, var7);
						++this.field4750;
					}

				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-25"
	)
	void method7791(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class401 var5 = (class401)this.field4749.get(var3);
		if (var5 != null) {
			this.field4748.method8029(var5);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "70100410"
	)
	int method7817(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4743 != null && this.field4743.key == var3 ? this.field4756.offset * 1602470721 / (this.field4756.array.length - this.field4743.field4715) + 1 : 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-888481756"
	)
	public int method7820(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4745 + this.field4747;
		return var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1778"
	)
	public void method7794() {
		if (this.field4736 != null) {
			try {
				this.field4736.close();
			} catch (Exception var2) {
			}

			this.field4736 = null;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "51"
	)
	public static int method7793(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	static final void method7815() {
		PacketBufferNode var0 = FloorDecoration.getPacketBufferNode(ClientPacket.field3479, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field868 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class220.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class139.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field868 = false;
	}
}
