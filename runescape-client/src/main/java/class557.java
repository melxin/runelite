import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
public class class557 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 954857425
	)
	public static int field5665;

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "([Lox;IIIIB)V",
		garbageValue = "-71"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field4117 && (!var6.isIf3 || !class187.isComponentHidden(var6))) {
				if (var6.type == 0) {
					if (!var6.isIf3 && class187.isComponentHidden(var6) && var6 != JagexCache.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field4148, var6.field4090, var6.id, var6.childIndex * -64977777);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * -64977777 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							class107.method3306(var7.group);
						}
					}
				}

				if (var6.type == 6) {
					int var8;
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = class375.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = AsyncHttpResponse.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; ApproximateRouteStrategy.invalidateWidget(var6)) {
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

								ApproximateRouteStrategy.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4127 != 0 && !var6.isIf3) {
						int var12 = var6.field4127 >> 16;
						var8 = var6.field4127 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						ApproximateRouteStrategy.invalidateWidget(var6);
					}
				}
			}
		}

	}
}
