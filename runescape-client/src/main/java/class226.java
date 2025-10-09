import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class226 {
	@ObfuscatedName("bp")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	class134[] field2657;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1216321361
	)
	int field2659;

	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V"
	)
	class226(Buffer var1, int var2) {
		this.field2657 = new class134[var2];
		this.field2659 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2657.length; ++var3) {
			class134 var4 = new class134(this.field2659, var1, false);
			this.field2657[var3] = var4;
		}

		this.method5088();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-839706333"
	)
	void method5088() {
		class134[] var1 = this.field2657;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class134 var3 = var1[var2];
			if (var3.field1628 >= 0) {
				var3.field1622 = this.field2657[var3.field1628];
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	public int method5089() {
		return this.field2657.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "87054968"
	)
	public class134 method5090(int var1) {
		return var1 >= this.method5089() ? null : this.field2657[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfa;",
		garbageValue = "-32"
	)
	class134[] method5091() {
		return this.field2657;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfz;II)V",
		garbageValue = "1972224739"
	)
	public void method5103(class145 var1, int var2) {
		this.method5093(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lfz;I[ZZI)V",
		garbageValue = "1035784883"
	)
	void method5093(class145 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3862();
		int var6 = 0;
		class134[] var7 = this.method5091();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class134 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3840(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)Lrt;",
		garbageValue = "1819574022"
	)
	static class451 method5106(class451 var0) {
		synchronized(class451.field5228) {
			if (class451.field5224 == 0) {
				return new class451(var0);
			} else {
				class451.field5228[--class451.field5224].method9145(var0);
				return class451.field5228[class451.field5224];
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrz;IIII)V",
		garbageValue = "1691447583"
	)
	static void method5105(TransformationMatrix var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var4 = 50;
			int var5 = AbstractRasterizer.method5112();
			int var6 = (ViewportMouse.ViewportMouse_x - var1) * var4 / var3;
			int var7 = (ViewportMouse.ViewportMouse_y - var2) * var4 / var3;
			int var8 = (ViewportMouse.ViewportMouse_x - var1) * var5 / var3;
			int var9 = (ViewportMouse.ViewportMouse_y - var2) * var5 / var3;
			TransformationMatrix var10;
			synchronized(TransformationMatrix.field5231) {
				if (TransformationMatrix.field5233 == 0) {
					var10 = new TransformationMatrix(var0);
				} else {
					TransformationMatrix.field5231[--TransformationMatrix.field5233].method9187(var0);
					var10 = TransformationMatrix.field5231[TransformationMatrix.field5233];
				}
			}

			var10.method9174();
			float[] var12 = new float[3];
			var10.transformPoint((float)var6, (float)var7, (float)var4, var12);
			var6 = (int)var12[0];
			var7 = (int)var12[1];
			int var14 = (int)var12[2];
			var10.transformPoint((float)var8, (float)var9, (float)var5, var12);
			var8 = (int)var12[0];
			var9 = (int)var12[1];
			var5 = (int)var12[2];
			var10.method9171();
			AttackOption.method2876(var6, var7, var14, var8, var9, var5);
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-1636445294"
	)
	static final void method5102(Actor var0) {
		int var1 = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1093 = 0;
			var0.method2508(var1);
		} else {
			if (var0.method2447()) {
				SequenceDefinition var2 = var0.animationSequence.getSequenceDefinition();
				if (var0.field1094 > 0 && var2.field2489 == 0) {
					++var0.field1093;
					var0.method2508(var1);
					return;
				}

				if (var0.field1094 <= 0 && var2.field2490 == 0) {
					++var0.field1093;
					var0.method2508(var1);
					return;
				}
			}

			int var10 = var0.x;
			int var3 = var0.y;
			int var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.size * 64;
			int var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.size * 64;
			if (var10 < var4) {
				if (var3 < var5) {
					var0.orientation = 1280;
				} else if (var3 > var5) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var4) {
				if (var3 < var5) {
					var0.orientation = 768;
				} else if (var3 > var5) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var3 < var5) {
				var0.orientation = 1024;
			} else if (var3 > var5) {
				var0.orientation = 0;
			}

			MoveSpeed var6 = var0.pathTraversed[var0.pathLength - 1];
			if (var4 - var10 <= 256 && var4 - var10 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) {
				int var7 = var0.orientation - var0.rotation & 2047;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				var1 = var0.walkBackSequence;
				if (var7 >= -256 && var7 <= 256) {
					var1 = var0.walkSequence;
				} else if (var7 >= 256 && var7 < 768) {
					var1 = var0.walkRightSequence;
				} else if (var7 >= -768 && var7 <= -256) {
					var1 = var0.walkLeftSequence;
				}

				if (var1 == -1) {
					var1 = var0.walkSequence;
				}

				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1088 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1093 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1093;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1093 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1093;
					}
				}

				if (var6 == MoveSpeed.field3274) {
					var8 <<= 1;
				} else if (var6 == MoveSpeed.field3280) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var1 == var0.walkSequence && var0.runSequence != -1) {
						var1 = var0.runSequence;
					} else if (var1 == var0.walkBackSequence && var0.field1079 != -1) {
						var1 = var0.field1079;
					} else if (var1 == var0.walkLeftSequence && var0.field1058 != -1) {
						var1 = var0.field1058;
					} else if (var1 == var0.walkRightSequence && var0.field1059 != -1) {
						var1 = var0.field1059;
					}
				} else if (var8 <= 2) {
					if (var1 == var0.walkSequence && var0.field1060 != -1) {
						var1 = var0.field1060;
					} else if (var1 == var0.walkBackSequence && var0.field1046 != -1) {
						var1 = var0.field1046;
					} else if (var1 == var0.walkLeftSequence && var0.field1062 != -1) {
						var1 = var0.field1062;
					} else if (var1 == var0.walkRightSequence && var0.field1047 != -1) {
						var1 = var0.field1047;
					}
				}

				if (var4 != var10 || var3 != var5) {
					if (var10 < var4) {
						var0.x += var8;
						if (var0.x > var4) {
							var0.x = var4;
						}
					} else if (var10 > var4) {
						var0.x -= var8;
						if (var0.x < var4) {
							var0.x = var4;
						}
					}

					if (var3 < var5) {
						var0.y += var8;
						if (var0.y > var5) {
							var0.y = var5;
						}
					} else if (var3 > var5) {
						var0.y -= var8;
						if (var0.y < var5) {
							var0.y = var5;
						}
					}
				}

				if (var4 == var0.x && var5 == var0.y) {
					--var0.pathLength;
					if (var0.field1094 > 0) {
						--var0.field1094;
					}
				}

				var0.method2508(var1);
			} else {
				var0.x = var4;
				var0.y = var5;
				--var0.pathLength;
				if (var0.field1094 > 0) {
					--var0.field1094;
				}

				var0.method2508(var1);
			}
		}
	}
}
