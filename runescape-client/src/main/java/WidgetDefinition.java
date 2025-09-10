import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("af")
	static boolean[] field4033;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field4042;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field4030;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field4031;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field4034;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field4039;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Loi;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("as")
	Map field4035;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	class490 field4040;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	class490 field4041;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lpx;Lpx;Lpx;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field4035 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field4040 = new class490(10, class488.field5351);
		this.field4041 = new class490(10, class488.field5351);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field4031 = var2;
			this.field4034 = var3;
			this.field4039 = var4;
			this.field4030 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field4033 = new boolean[var6];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Loi;",
		garbageValue = "-1043661195"
	)
	public Widget method7476(int var1) {
		int var2 = var1 >> 16;
		int var3 = var1 & 65535;
		if (this.Widget_interfaceComponents[var2] == null || this.Widget_interfaceComponents[var2][var3] == null) {
			boolean var4 = this.loadInterface(var2);
			if (!var4) {
				return null;
			}
		}

		return this.Widget_interfaceComponents[var2][var3];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Loi;",
		garbageValue = "-18"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method7476(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "55"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field4033[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field4033[var1] = true;
				return true;
			} else {
				if (this.Widget_interfaceComponents[var1] == null) {
					this.Widget_interfaceComponents[var1] = new Widget[var2];
				}

				int var3;
				Widget var5;
				for (var3 = 0; var3 < var2; ++var3) {
					if (this.Widget_interfaceComponents[var1][var3] == null) {
						byte[] var4 = this.widgetArchive.takeFile(var1, var3);
						if (var4 != null) {
							var5 = new Widget();
							this.Widget_interfaceComponents[var1][var3] = var5;
							var5.id = var3 + (var1 << 16);
							if (var4[0] == -1) {
								var5.decode(new Buffer(var4));
							} else {
								var5.decodeLegacy(new Buffer(var4));
							}

							if (this.field4030 != null) {
								byte[] var6 = this.field4030.takeFile(var1, var3);
								if (var6 != null && var6.length > 0) {
									var5.method7935(new Buffer(var6));
									this.field4035.put(var5.field4257, var1);
								}
							}
						}
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					Widget var7 = this.Widget_interfaceComponents[var1][var3];
					if (var7 != null && var7.parentId != -1) {
						var5 = this.Widget_interfaceComponents[var1][var7.parentId & 65535];
						if (var3 > var5.field4214) {
							var5.field4214 = var3;
						}

						if (var3 < var5.field4248) {
							var5.field4248 = var3;
						}
					}
				}

				field4033[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "37"
	)
	public void method7479(int var1) {
		if (var1 != -1) {
			if (field4033[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field4033[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-416347178"
	)
	public void method7480() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "26"
	)
	public static int method7496(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
