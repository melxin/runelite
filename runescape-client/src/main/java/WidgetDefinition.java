import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -775104593
	)
	static int field3856;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field3844;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field3845;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field3850;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	AbstractArchive field3847;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Lnh;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("am")
	Map field3849;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	class477 field3852;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	class477 field3855;

	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;Lph;Lph;Lph;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3849 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3852 = new class477(10, class475.field5090);
		this.field3855 = new class477(10, class475.field5090);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3845 = var2;
			this.field3850 = var3;
			this.field3847 = var4;
			this.field3844 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		class240.field2652 = new boolean[var6];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lnh;",
		garbageValue = "593588450"
	)
	public Widget method6951(int var1) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lnh;",
		garbageValue = "1557974935"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6951(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-22"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (class240.field2652[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				class240.field2652[var1] = true;
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

							if (this.field3844 != null) {
								byte[] var6 = this.field3844.takeFile(var1, var3);
								if (var6 != null && var6.length > 0) {
									var5.method7344(new Buffer(var6));
									this.field3849.put(var5.field3941, var1);
								}
							}
						}
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					Widget var7 = this.Widget_interfaceComponents[var1][var3];
					if (var7 != null && var7.parentId != -1) {
						var5 = this.Widget_interfaceComponents[var1][var7.parentId & 65535];
						if (var3 > var5.field3968) {
							var5.field3968 = var3;
						}

						if (var3 < var5.field3962) {
							var5.field3962 = var3;
						}
					}
				}

				class240.field2652[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1311307707"
	)
	public void method6954(int var1) {
		if (var1 != -1) {
			if (class240.field2652[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					class240.field2652[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	public void method6955() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)[I",
		garbageValue = "-1834899507"
	)
	static int[] method6971(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class441.method8336(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class441.method8336(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class441.method8336(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class441.method8336(var3, var4, var6);
		}

		return var5;
	}
}
