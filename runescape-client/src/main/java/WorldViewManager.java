import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("an")
	final HashMap field1181;
	@ObfuscatedName("ae")
	final HashMap field1183;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	class505 field1180;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	class503 field1184;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2048726951
	)
	int field1186;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field1181 = new HashMap(16);
		this.field1183 = new HashMap(16);
		this.field1186 = 0;
		this.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldj;",
		garbageValue = "-80792733"
	)
	WorldView method2569(int var1, int var2, int var3) {
		this.worldView = this.method2591(-1, var1, var2, var3, class173.field1877);
		return this.worldView;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIILgx;I)Ldj;",
		garbageValue = "213130435"
	)
	WorldView method2591(int var1, int var2, int var3, int var4, class173 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field1186;
		return var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "61567570"
	)
	void method2571(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.method2606(var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "65280"
	)
	void method2606(WorldView var1) {
		if (var1 != null) {
			this.field1181.remove(var1.id);
			this.field1183.remove(var1.id);
			var1.remove();
			--this.field1186;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ldj;",
		garbageValue = "-298365227"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ldj;",
		garbageValue = "-1230964274"
	)
	WorldView method2574() {
		return this.worldView;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "507329996"
	)
	int method2575() {
		return this.field1186;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltt;Lte;I)V",
		garbageValue = "-1149352594"
	)
	void method2608(class505 var1, class503 var2) {
		this.field1180 = var1;
		this.field1184 = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILtt;Lte;S)V",
		garbageValue = "17443"
	)
	void method2577(int var1, class505 var2, class503 var3) {
		this.field1181.put(var1, var2);
		this.field1183.put(var1, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-17"
	)
	void method2611(int var1) {
		this.field1181.remove(var1);
		this.field1183.remove(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ltt;",
		garbageValue = "412427792"
	)
	class505 method2578(int var1) {
		class505 var2 = (class505)this.field1181.get(var1);
		return var2 != null ? var2 : this.field1180;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lte;",
		garbageValue = "-123"
	)
	class503 method2579(int var1) {
		class503 var2 = (class503)this.field1183.get(var1);
		return var2 != null ? var2 : this.field1184;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1557955238"
	)
	@Export("clear")
	void clear() {
		this.worldViews.clear();
		this.field1186 = 0;
		this.field1181.clear();
		this.field1183.clear();
		this.field1180 = class505.field5237;
		this.field1184 = class503.field5223;
		if (this.worldView != null) {
			this.worldView.method2869();
			this.worldViews.put(this.worldView, -1L);
			this.field1186 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "([Lnh;IIIII)V",
		garbageValue = "-1961184731"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field3960 && (!var6.isIf3 || !DynamicObject.isComponentHidden(var6))) {
				if (var6.type == 0) {
					if (!var6.isIf3 && DynamicObject.isComponentHidden(var6) && var6 != AbstractUserComparator.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field3962, var6.field3968, var6.id, var6.childIndex * -1626125685);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * -1626125685 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							class153.method3511(var7.group);
						}
					}
				}

				if (var6.type == 6) {
					int var8;
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = class370.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = class91.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; class139.invalidateWidget(var6)) {
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

								class139.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4021 != 0 && !var6.isIf3) {
						int var12 = var6.field4021 >> 16;
						var8 = var6.field4021 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						class139.invalidateWidget(var6);
					}
				}
			}
		}

	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IILne;I)I",
		garbageValue = "2075729080"
	)
	static int method2616(int var0, int var1, SpriteMask var2) {
		int var3 = var2.width / 2 + var0;
		int var4 = var2.height / 2 + var1;
		int var5 = MouseHandler.MouseHandler_x - var3;
		int var6 = MouseHandler.MouseHandler_y - var4;
		int var7 = class300.method6349(var6, var5);
		var7 -= Client.camAngleY;
		var7 &= 2047;
		return NPC.method2949(var7);
	}
}
