import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("ab")
	static boolean[] field4048;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4055;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4049;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4050;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	AbstractArchive field4051;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lok;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("aq")
	Map field4053;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class488 field4046;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class488 field4059;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;Lpe;Lpe;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field4053 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field4046 = new class488(10, class486.field5404);
		this.field4059 = new class488(10, class486.field5404);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field4049 = var2;
			this.field4050 = var3;
			this.field4051 = var4;
			this.field4055 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field4048 = new boolean[var6];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lok;",
		garbageValue = "-1884609767"
	)
	public Widget method7496(int var1) {
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
		descriptor = "(IIB)Lok;",
		garbageValue = "-78"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method7496(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1763132277"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field4048[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field4048[var1] = true;
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

							if (this.field4055 != null) {
								byte[] var6 = this.field4055.takeFile(var1, var3);
								if (var6 != null && var6.length > 0) {
									var5.method8089(new Buffer(var6));
									this.field4053.put(var5.field4249, var1);
								}
							}
						}
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					Widget var7 = this.Widget_interfaceComponents[var1][var3];
					if (var7 != null && var7.parentId != -1) {
						var5 = this.Widget_interfaceComponents[var1][var7.parentId & 65535];
						if (var3 > var5.field4195) {
							var5.field4195 = var3;
						}

						if (var3 < var5.field4228) {
							var5.field4228 = var3;
						}
					}
				}

				field4048[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "708044614"
	)
	public void method7485(int var1) {
		if (var1 != -1) {
			if (field4048[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field4048[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public void method7488() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "818785204"
	)
	public static void method7492() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method7504() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
