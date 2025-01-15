import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ad")
	@Export("name")
	public final String name;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 185232069
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1767959900"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lna;II)V",
		garbageValue = "-1975296094"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class163.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && class163.isComponentHidden(var3) && var3 != class424.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						HttpMethod.method83(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = class268.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = class33.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; UserComparator8.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.getMayaAnimFrame();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								UserComparator8.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3928 != 0 && !var3.isIf3) {
						int var9 = var3.field3928 >> 16;
						var5 = var3.field3928 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						UserComparator8.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
