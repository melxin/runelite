import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;S)I",
		garbageValue = "5007"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;I)V",
		garbageValue = "724094962"
	)
	public static void method3537(DynamicArray var0, DynamicArray var1) {
		if (var0 != null && var0.method10322() > 1) {
			class374.method8144(var0);
			if (var1 != null) {
				class374.method8144(var1);
			}

			int var2 = var0.method10322();
			if (var1 != null && var1.method10322() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.field5504 == class574.field5820) {
					if (var1 == null) {
						ModelData0.method5777(var0.method10318(), class520.field5509, 0, var2 - 1);
					} else if (class574.field5820 == var1.field5504) {
						ModelData0.method5777(var0.method10318(), var1.method10318(), 0, var2 - 1);
					} else if (class574.field5816 == var1.field5504) {
						class199.method4400(var0.method10318(), var1.method10320(), 0, var2 - 1);
					} else {
						class367.method7899(var0.method10318(), var1.method10321(), 0, var2 - 1);
					}
				} else if (var0.field5504 == class574.field5816) {
					if (var1 == null) {
						Arrays.sort(var0.method10320(), 0, var2);
					} else if (class574.field5820 == var1.field5504) {
						class536.method10531(var0.method10320(), var1.method10318(), 0, var2 - 1);
					} else if (class574.field5816 == var1.field5504) {
						GrandExchangeEvent.method8509(var0.method10320(), var1.method10320(), 0, var2 - 1);
					} else {
						World.method1533(var0.method10320(), var1.method10321(), 0, var2 - 1);
					}
				} else {
					if (var0.field5504 != class574.field5824) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort(var0.method10321(), 0, var2);
					} else if (class574.field5820 == var1.field5504) {
						class567.quicksortStringsWithCorrespondingIntegers((String[])((String[])var0.method10321()), var1.method10318(), 0, var2 - 1);
					} else if (class574.field5816 == var1.field5504) {
						class272.method6111((String[])((String[])var0.method10321()), var1.method10320(), 0, var2 - 1);
					} else {
						class164.method4008((String[])((String[])var0.method10321()), var1.method10321(), 0, var2 - 1);
					}
				}

			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ILtj;Ldr;I)I",
		garbageValue = "-403843777"
	)
	static int method3535(int var0, WorldEntity var1, WorldView var2) {
		int var3 = -1;
		if (var0 == Client.field346) {
			var3 = var2.plane;
		} else if (Client.field346 == -1) {
			var3 = var1.field5425.method4452();
		} else {
			WorldEntity var4 = Client.worldViewManager.method2347();
			WorldView var5 = var4.worldView;
			if (var5.plane == var4.field5425.method4452()) {
				if (var0 == -1) {
					var3 = var4.getX();
				} else {
					var3 = var1.field5425.method4452();
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "([Loi;IIIII)V",
		garbageValue = "-1402844009"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field4165 && (!var6.isIf3 || !class364.isComponentHidden(var6))) {
				if (var6.type == 0) {
					if (!var6.isIf3 && class364.isComponentHidden(var6) && var6 != class343.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field4248, var6.field4214, var6.id, var6.childIndex * -217986249);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * -217986249 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							VarcInt.method4215(var7.group);
						}
					}
				}

				if (var6.type == 6) {
					int var8;
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = FileSystem.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = InvDefinition.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; class89.invalidateWidget(var6)) {
									var6.modelFrameCycle -= var9.frameLengths[var6.modelFrame];
									++var6.modelFrame;
									if (var6.modelFrame >= var9.frameIds.length) {
										var6.modelFrame -= var9.frameCount;
										if (var6.modelFrame < 0 || var6.modelFrame >= var9.frameIds.length) {
											var6.modelFrame = 0;
										}
									}
								}
							} else {
								var6.modelFrame += Client.graphicsCycle;
								int var10 = var9.getMayaAnimFrame();
								if (var6.modelFrame >= var10) {
									var6.modelFrame -= var9.frameCount;
									if (var6.modelFrame < 0 || var6.modelFrame >= var10) {
										var6.modelFrame = 0;
									}
								}

								class89.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4205 != 0 && !var6.isIf3) {
						int var12 = var6.field4205 >> 16;
						var8 = var6.field4205 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						class89.invalidateWidget(var6);
					}
				}
			}
		}

	}
}
