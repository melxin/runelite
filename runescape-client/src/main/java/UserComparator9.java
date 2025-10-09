import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;B)I",
		garbageValue = "-45"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static final void method3637() {
		Frames.method5459("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "([Lok;IIIII)V",
		garbageValue = "716059432"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field4173 && (!var6.isIf3 || !class30.isComponentHidden(var6))) {
				if (var6.type == 0) {
					if (!var6.isIf3 && class30.isComponentHidden(var6) && var6 != class280.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field4228, var6.field4195, var6.id, var6.childIndex * -2066937045);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * -2066937045 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							class394.method8274(var7.group);
						}
					}
				}

				if (var6.type == 6) {
					int var8;
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = WorldMapIcon_1.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = class171.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; class154.invalidateWidget(var6)) {
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

								class154.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4241 != 0 && !var6.isIf3) {
						int var12 = var6.field4241 >> 16;
						var8 = var6.field4241 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						class154.invalidateWidget(var6);
					}
				}
			}
		}

	}
}
