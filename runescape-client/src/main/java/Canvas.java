import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("av")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "1528583797"
	)
	static final void method334(Actor var0) {
		int var1 = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1074 = 0;
			var0.method2548(var1);
		} else {
			if (var0.method2484()) {
				SequenceDefinition var2 = var0.animationSequence.getSequenceDefinition();
				if (var0.field1075 > 0 && var2.field2498 == 0) {
					++var0.field1074;
					var0.method2548(var1);
					return;
				}

				if (var0.field1075 <= 0 && var2.field2517 == 0) {
					++var0.field1074;
					var0.method2548(var1);
					return;
				}
			}

			int var10 = var0.x;
			int var3 = var0.y;
			int var4 = var0.size * -767295488 + var0.pathX[var0.pathLength - 1] * 128;
			int var5 = var0.size * -767295488 + var0.pathY[var0.pathLength - 1] * 128;
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
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1069 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1074 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1074;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1074 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1074;
					}
				}

				if (var6 == MoveSpeed.field3301) {
					var8 <<= 1;
				} else if (var6 == MoveSpeed.field3299) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var1 == var0.walkSequence && var0.runSequence != -1) {
						var1 = var0.runSequence;
					} else if (var1 == var0.walkBackSequence && var0.field1038 != -1) {
						var1 = var0.field1038;
					} else if (var1 == var0.walkLeftSequence && var0.field1027 != -1) {
						var1 = var0.field1027;
					} else if (var1 == var0.walkRightSequence && var0.field1012 != -1) {
						var1 = var0.field1012;
					}
				} else if (var8 <= 2) {
					if (var1 == var0.walkSequence && var0.field1041 != -1) {
						var1 = var0.field1041;
					} else if (var1 == var0.walkBackSequence && var0.field1042 != -1) {
						var1 = var0.field1042;
					} else if (var1 == var0.walkLeftSequence && var0.field1040 != -1) {
						var1 = var0.field1040;
					} else if (var1 == var0.walkRightSequence && var0.field1043 != -1) {
						var1 = var0.field1043;
					}
				}

				if (var10 != var4 || var5 != var3) {
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
					if (var0.field1075 > 0) {
						--var0.field1075;
					}
				}

				var0.method2548(var1);
			} else {
				var0.x = var4;
				var0.y = var5;
				--var0.pathLength;
				if (var0.field1075 > 0) {
					--var0.field1075;
				}

				var0.method2548(var1);
			}
		}
	}
}
