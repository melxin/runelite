import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
final class class145 implements ThreadFactory {
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -1698156661
	)
	static int field1725;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsp;ILsk;I)I",
		garbageValue = "-30338501"
	)
	public static int method3747(AnimationSequence var0, int var1, class468 var2) {
		int var3 = 0;
		if (!var0.isActive()) {
			var0.method9575(0);
			return var3;
		} else {
			SequenceDefinition var4 = var0.getSequenceDefinition();
			if (var4.frameCount == -1) {
				var3 |= 8;
			}

			if (var4.method4791()) {
				var0.method9575(0);
			} else {
				var0.method9575(var0.method9574() + var1);
			}

			if (!var4.isCachedModelIdSet()) {
				var3 |= Interpreter.method1774(var0, var1, var2);
				return var3;
			} else {
				int var7 = var1;
				int var8 = 0;
				SequenceDefinition var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0 && var1 > 0) {
					var7 = var1 - (var1 - 1) / var9.frameCount * var9.frameCount;
				}

				int var10 = var0.getFrame();
				int var11 = var0.method9620();

				while (true) {
					int var12;
					do {
						if (var7 <= 0) {
							var0.method9579(var10, var11);
							var3 |= var8;
							return var3;
						}

						--var7;
						++var10;
						var8 |= 4;
						if ((var8 & 2) == 0 && var2 != null) {
							var2.vmethod10858(var9, var10);
						}

						var12 = var9.getMayaAnimFrame();
					} while(var10 < var12);

					++var11;
					var8 |= 1;
					var10 -= var9.frameCount;
					if (var11 >= var9.field2486) {
						var8 |= 2;
					}

					if (var10 < 0 || var10 >= var12) {
						var8 |= 2;
						var10 = 0;
					}

					if ((var8 & 2) == 0 && var2 != null) {
						var2.vmethod10858(var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "334"
	)
	public static int method3751(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfm;",
		garbageValue = "-36"
	)
	static class147[] method3750() {
		return new class147[]{class147.field1746, class147.field1741, class147.field1742, class147.field1743, class147.field1744, class147.field1747, class147.field1745, class147.field1740, class147.field1748};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "1829254533"
	)
	static final float method3742(float var0) {
		var0 = (var0 - 75.0F) * 1.0100503F;
		return 1.0100503F + 150.75377F / var0;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lmy;B)V",
		garbageValue = "-18"
	)
	static void method3748(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(HorizontalAlignment.field2091.hash);
		var0.packetBuffer.method11250(Friend.archive8.hash);
		var0.packetBuffer.writeIntIME(archive13.hash);
		var0.packetBuffer.writeIntIME(WidgetDefinition.field4042.hash);
		var0.packetBuffer.writeIntIME(class159.field1830.hash);
		var0.packetBuffer.method11250(class115.field1514.hash);
		var0.packetBuffer.method11234(class27.archive10.hash);
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)V",
		garbageValue = "-1162921603"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		if (var0.buttonType == 1) {
			WorldMapLabelSize.method6373(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
		}

		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			String var1 = WorldMapLabelSize.Widget_getSpellActionName(var0);
			if (var1 != null) {
				WorldMapLabelSize.method6373(var1, class134.colorStartTag(65280) + var0.field4298, 25, 0, -1, var0.id, var0.itemId);
			}
		}

		if (var0.buttonType == 3) {
			class151.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class151.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class151.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class151.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (Canvas.method338(DirectByteArrayCopier.getWidgetFlags(var0)) && (class337.selectedSpellFlags & 32) == 32) {
					WorldMapLabelSize.method6373(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex * -217986249, var0.id, var0.itemId);
				}
			} else {
				for (int var8 = 31; var8 >= 0; --var8) {
					String var9;
					if (var8 == var0.targetPriority * 1337113375) {
						var9 = WorldMapLabelSize.Widget_getSpellActionName(var0);
						if (var9 != null) {
							WorldMapLabelSize.method6373(var9, var0.dataText, 25, 0, var0.childIndex * -217986249, var0.id, var0.itemId);
						}
					}

					var9 = WorldMapElement.method4186(var0, var8);
					if (var9 != null) {
						int var3;
						short var4;
						if (var8 > var0.targetPriority * 1337113375) {
							var4 = 1007;
							var3 = WorldMapLabelSize.method6373(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -217986249, var0.id, var0.itemId);
						} else {
							var4 = 57;
							var3 = class423.insertMenuItem(var9, var0.dataText, var4, var8 + 1, var0.childIndex * -217986249, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field4229 != null && var8 < var0.field4229.length && var0.field4229[var8] != null) {
							String[] var5 = var0.field4229[var8];

							for (int var6 = var5.length - 1; var6 >= 0; --var6) {
								int var7 = var6 + 1 << 16 | var8 + 1;
								if (var5[var6] != null && !var5[var6].isEmpty()) {
									Timer.method8247(var3, var5[var6], "", var4, var7, var0.childIndex * -217986249, var0.id, var0.itemId, -1);
								}
							}
						}
					}
				}

				int var2 = DirectByteArrayCopier.getWidgetFlags(var0);
				boolean var10 = (var2 & 1) != 0;
				if (var10) {
					class151.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex * -217986249, var0.id);
				}
			}
		}

	}
}
