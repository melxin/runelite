import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("av")
	static boolean[] field4109;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field4102;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field4113;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field4104;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	AbstractArchive field4105;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lof;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("aw")
	Map field4107;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	class498 field4103;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	class498 field4106;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;Lqm;Lqm;Lqm;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field4107 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field4103 = new class498(10, class496.field5433);
		this.field4106 = new class498(10, class496.field5433);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field4113 = var2;
			this.field4104 = var3;
			this.field4105 = var4;
			this.field4102 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field4109 = new boolean[var6];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lof;",
		garbageValue = "-552401114"
	)
	public Widget method7728(int var1) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lof;",
		garbageValue = "-639367068"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method7728(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1746356712"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field4109[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field4109[var1] = true;
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

							if (this.field4102 != null) {
								byte[] var6 = this.field4102.takeFile(var1, var3);
								if (var6 != null && var6.length > 0) {
									var5.method8158(new Buffer(var6));
									this.field4107.put(var5.field4215, var1);
								}
							}
						}
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					Widget var7 = this.Widget_interfaceComponents[var1][var3];
					if (var7 != null && var7.parentId != -1) {
						var5 = this.Widget_interfaceComponents[var1][var7.parentId & 65535];
						if (var3 > var5.field4241) {
							var5.field4241 = var3;
						}

						if (var3 < var5.field4236) {
							var5.field4236 = var3;
						}
					}
				}

				field4109[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-77027406"
	)
	public void method7731(int var1) {
		if (var1 != -1) {
			if (field4109[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field4109[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1258831648"
	)
	public void method7732() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}
}
