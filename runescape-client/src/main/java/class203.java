import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class203 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "([Lof;IIIII)V",
		garbageValue = "789799005"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field4234 && (!var6.isIf3 || !class330.isComponentHidden(var6))) {
				if (var6.type == 0) {
					if (!var6.isIf3 && class330.isComponentHidden(var6) && var6 != class330.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field4236, var6.field4241, var6.id, var6.childIndex * 2077538819);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * 2077538819 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							class497.method10123(var7.group);
						}
					}
				}

				if (var6.type == 6) {
					int var8;
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = class556.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = ClientPacket.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; class376.invalidateWidget(var6)) {
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

								class376.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4274 != 0 && !var6.isIf3) {
						int var12 = var6.field4274 >> 16;
						var8 = var6.field4274 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						class376.invalidateWidget(var6);
					}
				}
			}
		}

	}
}
