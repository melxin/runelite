import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class114 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1294101531
	)
	int field1453;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1856328269
	)
	int field1454;
	@ObfuscatedName("an")
	byte[] field1452;

	class114() {
		this.field1453 = 0;
		this.field1454 = 0;
		this.field1452 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1003007762"
	)
	int method3296(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field1454; var1 -= var4) {
			var4 = 8 - this.field1454;
			int var5 = (1 << var4) - 1;
			var2 += (this.field1452[this.field1453] >> this.field1454 & var5) << var3;
			this.field1454 = 0;
			++this.field1453;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field1452[this.field1453] >> this.field1454 & var4) << var3;
			this.field1454 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1614195635"
	)
	int method3295() {
		int var1 = this.field1452[this.field1453] >> this.field1454 & 1;
		++this.field1454;
		this.field1453 += this.field1454 >> 3;
		this.field1454 &= 7;
		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "2056454847"
	)
	void method3307(byte[] var1, int var2) {
		this.field1452 = var1;
		this.field1453 = var2;
		this.field1454 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3306() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "277847933"
	)
	static int method3308(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_objectStack[class175.Interpreter_objectStackSize - 1] = "";
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
			Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var0.method7778(var1);
			return 1;
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "([Lov;IIIII)V",
		garbageValue = "1452768291"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var2; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var3 == var6.parentId && var4 == var6.field4127 && (!var6.isIf3 || !class171.isComponentHidden(var6))) {
				int var8;
				if (var6.type == 0) {
					if (!var6.isIf3 && class171.isComponentHidden(var6) && var6 != FloorUnderlayDefinition.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var6.field4002, var6.field4003, var6.id, var6.childIndex * -744024149);
					if (var6.children != null) {
						drawModelComponents(var6.children, 0, var6.children.length - 1, var6.id, -1);
					}

					if (var6.childIndex * -744024149 == -1) {
						InterfaceParent var7 = (InterfaceParent)Client.interfaceParents.get((long)var6.id);
						if (var7 != null) {
							var8 = var7.group;
							if (ClientPreferences.widgetDefinition.loadInterface(var8)) {
								drawModelComponents(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var8], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var8].length - 1, -1, -1);
							}
						}
					}
				}

				if (var6.type == 6) {
					if (var6.sequenceId != -1 || var6.sequenceId2 != -1) {
						boolean var11 = SoundSystem.runCs1(var6);
						if (var11) {
							var8 = var6.sequenceId2;
						} else {
							var8 = var6.sequenceId;
						}

						if (var8 != -1) {
							SequenceDefinition var9 = VarpDefinition.SequenceDefinition_get(var8);
							if (!var9.isCachedModelIdSet()) {
								for (var6.modelFrameCycle += Client.graphicsCycle; var6.modelFrameCycle > var9.frameLengths[var6.modelFrame]; ScriptFrame.invalidateWidget(var6)) {
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

								ScriptFrame.invalidateWidget(var6);
							}
						}
					}

					if (var6.field4101 != 0 && !var6.isIf3) {
						int var12 = var6.field4101 >> 16;
						var8 = var6.field4101 << 16 >> 16;
						var12 *= Client.graphicsCycle;
						var8 *= Client.graphicsCycle;
						var6.modelAngleX = var12 + var6.modelAngleX & 2047;
						var6.modelAngleY = var8 + var6.modelAngleY & 2047;
						ScriptFrame.invalidateWidget(var6);
					}
				}
			}
		}

	}
}
