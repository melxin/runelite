import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1927366931
	)
	public int field4873;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1310625425
	)
	public int field4877;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	AbstractSocket field4878;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1737752625
	)
	int field4879;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 2927676804776044803L
	)
	long field4880;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	NodeHashTable field4881;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1140572727
	)
	int field4882;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	NodeHashTable field4883;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 991597677
	)
	int field4872;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	DualNodeDeque field4885;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	NodeHashTable field4894;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -188889591
	)
	int field4900;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	NodeHashTable field4888;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 640253697
	)
	int field4889;
	@ObfuscatedName("az")
	boolean field4890;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class407 field4891;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field4887;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field4893;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 632496179
	)
	int field4884;
	@ObfuscatedName("ae")
	CRC32 field4895;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field4896;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Lpo;"
	)
	Archive[] field4892;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1094116587
	)
	int field4875;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1354653807
	)
	int field4899;
	@ObfuscatedName("bo")
	byte field4886;

	public JagNetThread() {
		this.field4873 = 0;
		this.field4877 = 0;
		this.field4879 = 0;
		this.field4881 = new NodeHashTable(4096);
		this.field4882 = 0;
		this.field4883 = new NodeHashTable(32);
		this.field4872 = 0;
		this.field4885 = new DualNodeDeque();
		this.field4894 = new NodeHashTable(4096);
		this.field4900 = 0;
		this.field4888 = new NodeHashTable(4096);
		this.field4889 = 0;
		this.field4887 = new Buffer(8);
		this.field4884 = 0;
		this.field4895 = new CRC32();
		this.field4892 = new Archive[256];
		this.field4875 = -1;
		this.field4899 = 255;
		this.field4886 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1613195402"
	)
	public boolean method8446() {
		long var1 = UserComparator7.method3496();
		int var3 = (int)(var1 - this.field4880);
		this.field4880 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4879 += var3;
		if (this.field4889 == 0 && this.field4872 == 0 && this.field4900 == 0 && this.field4882 == 0) {
			return true;
		} else if (this.field4878 == null) {
			return false;
		} else {
			try {
				if (this.field4879 > 30000) {
					throw new IOException();
				} else {
					class407 var4;
					Buffer var5;
					while (this.field4872 < 200 && this.field4882 > 0) {
						var4 = (class407)this.field4881.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4878.write(var5.array, 0, 4);
						this.field4883.put(var4, var4.key);
						--this.field4882;
						++this.field4872;
					}

					while (this.field4889 < 200 && this.field4900 > 0) {
						var4 = (class407)this.field4885.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4878.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4888.put(var4, var4.key);
						--this.field4900;
						++this.field4889;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4878.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4879 = 0;
						byte var6 = 0;
						if (this.field4891 == null) {
							var6 = 8;
						} else if (this.field4884 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4887.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4878.read(this.field4887.array, this.field4887.offset, var7);
							if (this.field4886 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4887.array;
									var10001 = var8 + this.field4887.offset;
									var10000[var10001] ^= this.field4886;
								}
							}

							var22 = this.field4887;
							var22.offset += var7;
							if (this.field4887.offset < var6) {
								break;
							}

							if (this.field4891 == null) {
								this.field4887.offset = 0;
								var8 = this.field4887.readUnsignedByte();
								var9 = this.field4887.readUnsignedShort();
								int var10 = this.field4887.readUnsignedByte();
								int var11 = this.field4887.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class407 var14 = (class407)this.field4883.get(var12);
								this.field4890 = true;
								if (var14 == null) {
									var14 = (class407)this.field4888.get(var12);
									this.field4890 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4891 = var14;
								this.field4893 = new Buffer(this.field4891.field4847 + var15 + var11);
								this.field4893.writeByte(var10);
								this.field4893.writeInt(var11);
								this.field4884 = 8;
								this.field4887.offset = 0;
							} else if (this.field4884 == 0) {
								if (this.field4887.array[0] == -1) {
									this.field4884 = 1;
									this.field4887.offset = 0;
								} else {
									this.field4891 = null;
								}
							}
						} else {
							var7 = this.field4893.array.length - this.field4891.field4847;
							var8 = 512 - this.field4884;
							if (var8 > var7 - this.field4893.offset) {
								var8 = var7 - this.field4893.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4878.read(this.field4893.array, this.field4893.offset, var8);
							if (this.field4886 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4893.array;
									var10001 = var9 + this.field4893.offset;
									var10000[var10001] ^= this.field4886;
								}
							}

							var22 = this.field4893;
							var22.offset += var8;
							this.field4884 += var8;
							if (this.field4893.offset == var7) {
								if (16711935L == this.field4891.key) {
									this.field4896 = this.field4893;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4892[var9];
										if (var18 != null) {
											this.method8450(var18, var9);
										}
									}
								} else {
									this.field4895.reset();
									this.field4895.update(this.field4893.array, 0, var7);
									var9 = (int)this.field4895.getValue();
									if (this.field4891.field4846 != var9) {
										try {
											this.field4878.close();
										} catch (Exception var20) {
										}

										++this.field4873;
										this.field4878 = null;
										this.field4886 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4873 = 0;
									this.field4877 = 0;
									this.field4891.field4849.write((int)(this.field4891.key & 65535L), this.field4893.array, 16711680L == (this.field4891.key & 16711680L), this.field4890);
								}

								this.field4891.remove();
								if (this.field4890) {
									--this.field4872;
								} else {
									--this.field4889;
								}

								this.field4884 = 0;
								this.field4891 = null;
								this.field4893 = null;
							} else {
								if (this.field4884 != 512) {
									break;
								}

								this.field4884 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4878.close();
				} catch (Exception var19) {
				}

				++this.field4877;
				this.field4878 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "107"
	)
	public void method8447(boolean var1) {
		if (this.field4878 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4878.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4878.close();
				} catch (Exception var4) {
				}

				++this.field4877;
				this.field4878 = null;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ZI)V",
		garbageValue = "26154436"
	)
	public void method8448(AbstractSocket var1, boolean var2) {
		if (this.field4878 != null) {
			try {
				this.field4878.close();
			} catch (Exception var7) {
			}

			this.field4878 = null;
		}

		this.field4878 = var1;
		this.method8447(var2);
		this.field4887.offset = 0;
		this.field4891 = null;
		this.field4893 = null;
		this.field4884 = 0;

		while (true) {
			class407 var3 = (class407)this.field4883.first();
			if (var3 == null) {
				while (true) {
					var3 = (class407)this.field4888.first();
					if (var3 == null) {
						if (this.field4886 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4886);
								var8.writeShort(0);
								this.field4878.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4878.close();
								} catch (Exception var5) {
								}

								++this.field4877;
								this.field4878 = null;
							}
						}

						this.field4879 = 0;
						this.field4880 = UserComparator7.method3496();
						return;
					}

					this.field4885.method8724(var3);
					this.field4894.put(var3, var3.key);
					++this.field4900;
					--this.field4889;
				}
			}

			this.field4881.put(var3, var3.key);
			++this.field4882;
			--this.field4872;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpo;II)V",
		garbageValue = "935197658"
	)
	void method8449(Archive var1, int var2) {
		if (var1.field4804) {
			if (!var1.field4812) {
				if (var2 <= this.field4875) {
					throw new RuntimeException("");
				}

				if (var2 < this.field4899) {
					this.field4899 = var2;
				}
			}
		} else {
			if (var2 >= this.field4899) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4875) {
				this.field4875 = var2;
			}
		}

		if (this.field4896 != null) {
			this.method8450(var1, var2);
		} else {
			this.method8451((Archive)null, class406.field4821.field4820, 255, 0, (byte)0, true);
			this.field4892[var2] = var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpo;IS)V",
		garbageValue = "16384"
	)
	void method8450(Archive var1, int var2) {
		int var3 = var2 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field4896.array.length - 8) {
			this.field4896.offset = var3;
			var4 = this.field4896.readInt();
			var5 = this.field4896.readInt();
		}

		if (var4 == 0 && var5 == 0) {
			if (var1.field4804) {
				var1.method8289();
			} else {
				throw new RuntimeException("");
			}
		} else {
			var1.loadIndex(var4, var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpo;IIIBZB)V",
		garbageValue = "104"
	)
	void method8451(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class407 var9 = (class407)this.field4881.get(var7);
		if (var9 == null) {
			var9 = (class407)this.field4883.get(var7);
			if (var9 == null) {
				var9 = (class407)this.field4894.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4881.put(var9, var7);
						--this.field4900;
						++this.field4882;
					}

				} else {
					if (!var6) {
						var9 = (class407)this.field4888.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class407();
					var9.field4849 = var1;
					var9.field4846 = var4;
					var9.field4847 = var5;
					if (var6) {
						this.field4881.put(var9, var7);
						++this.field4882;
					} else {
						this.field4885.method8723(var9);
						this.field4894.put(var9, var7);
						++this.field4900;
					}

				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "2"
	)
	void method8452(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class407 var5 = (class407)this.field4894.get(var3);
		if (var5 != null) {
			this.field4885.method8724(var5);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	int method8482(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4891 != null && var3 == this.field4891.key ? this.field4893.offset * 99 / (this.field4893.array.length - this.field4891.field4847) + 1 : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-13"
	)
	public int method8454(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4872 + this.field4882;
		return var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	public void method8455() {
		if (this.field4878 != null) {
			try {
				this.field4878.close();
			} catch (Exception var2) {
			}

			this.field4878 = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lij;",
		garbageValue = "-93"
	)
	public static FloorOverlayDefinition method8476(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class238.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1789259984"
	)
	public static void method8484() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "65"
	)
	static float method8467(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIILkp;I)V",
		garbageValue = "-195435359"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = SpriteMask.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var12][var14] + var15[var11][var13] + var15[var12][var13] + var15[var11][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = Skills.calculateTag(var1, var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				var0.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method5181(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = class81.field1179[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field823[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								Script.Tiles_underlays2[var1][var2][var3] = 50;
								Script.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class81.field1179[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								Script.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								Script.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class81.field1179[var1][var2];
								var10000[1 + var3] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								Script.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								Script.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class81.field1179[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								Script.Tiles_underlays2[var1][var2][var3] = 50;
								Script.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class81.field1179[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method6140(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method5314(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field824[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								Script.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								Script.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								Script.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								Script.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method6140(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field823[var5], Tiles.field823[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = class81.field1179[var1][var2];
									var10000[var3] |= 585;
									var10000 = class81.field1179[var1][var2];
									var10000[var3 + 1] |= 1170;
								} else if (var5 == 1) {
									var10000 = class81.field1179[var1][var2];
									var10000[1 + var3] |= 1170;
									var10000 = class81.field1179[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = class81.field1179[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = class81.field1179[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = class81.field1179[var1][var2];
									var10000[var3] |= 1170;
									var10000 = class81.field1179[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method6140(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method5314(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field824[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									Script.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									Script.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									Script.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									Script.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method6140(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method5181(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method5314(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field823[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field823[var5], 0, var23 * Tiles.field835[var5], var23 * Tiles.field826[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (var24 != 0L) {
									var23 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field827[var5], var23 * Tiles.field828[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = SpriteMask.getObjectDefinition(class70.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field827[var5], var23 * Tiles.field828[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method5181(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method5441() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > Script.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									Script.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1065817560"
	)
	public static String method8471(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}
}
