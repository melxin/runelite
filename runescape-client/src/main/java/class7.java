import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class7 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 34294947
	)
	static int field30;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -968645131
	)
	static int field24;
	@ObfuscatedName("ab")
	ExecutorService field29;
	@ObfuscatedName("aw")
	Future field26;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	final Buffer field25;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final class3 field23;

	@ObfuscatedSignature(
		descriptor = "(Lvj;Lae;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field29 = Executors.newSingleThreadExecutor();
		this.field25 = var1;
		this.field23 = var2;
		this.method53();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1804255793"
	)
	public boolean method50() {
		return this.field26.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1586415272"
	)
	public void method51() {
		this.field29.shutdown();
		this.field29 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lvj;",
		garbageValue = "-23"
	)
	public Buffer method52() {
		try {
			return (Buffer)this.field26.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1702507763"
	)
	void method53() {
		this.field26 = this.field29.submit(new class1(this, this.field25, this.field23));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1640250455"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfv;",
		garbageValue = "-1198677482"
	)
	static class139[] method63() {
		return new class139[]{class139.field1615, class139.field1619, class139.field1607, class139.field1608, class139.field1624, class139.field1613, class139.field1623, class139.field1612, class139.field1609, class139.field1614, class139.field1606, class139.field1616, class139.field1617, class139.field1618, class139.field1605, class139.field1620, class139.field1621};
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "1973306435"
	)
	static final void method49(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1269 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = HealthBarDefinition.SequenceDefinition_get(var0.sequence);
				if (var0.field1270 > 0 && var1.field2320 == 0) {
					++var0.field1269;
					return;
				}

				if (var0.field1270 <= 0 && var1.field2312 == 0) {
					++var0.field1269;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.field1199 * -742859456 + var0.pathX[var0.pathLength - 1] * 128;
			int var4 = var0.field1199 * -742859456 + var0.pathY[var0.pathLength - 1] * 128;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			MoveSpeed var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1241 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1269 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1269;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1269 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1269;
					}
				}

				if (var5 == MoveSpeed.field3073) {
					var8 <<= 1;
				} else if (var5 == MoveSpeed.field3066) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1209 != -1) {
						var0.movementSequence = var0.field1209;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1228 != -1) {
						var0.movementSequence = var0.field1228;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1266 != -1) {
						var0.movementSequence = var0.field1266;
					}
				} else if (var8 <= 2) {
					if (var0.walkSequence == var0.movementSequence && var0.field1212 != -1) {
						var0.movementSequence = var0.field1212;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1213 != -1) {
						var0.movementSequence = var0.field1213;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1214 != -1) {
						var0.movementSequence = var0.field1214;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1215 != -1) {
						var0.movementSequence = var0.field1215;
					}
				}

				if (var3 != var10 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1270 > 0) {
						--var0.field1270;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1270 > 0) {
					--var0.field1270;
				}

			}
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lda;I)V",
		garbageValue = "-1428242924"
	)
	static final void method65(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = class137.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1185 = var6;
		var1.field1184 = var7;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "16"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class379.widgetDefinition.loadInterface(var0)) {
			StudioGame.updateInterface(class379.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
