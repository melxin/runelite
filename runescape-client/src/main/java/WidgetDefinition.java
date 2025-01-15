import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("ae")
	static boolean[] field3778;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field3768;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field3769;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field3770;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	AbstractArchive field3767;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lna;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ax")
	Map field3773;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	class465 field3779;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	class465 field3780;

	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;Lpq;Lpq;Lpq;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3773 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3779 = new class465(10, class463.field4954);
		this.field3780 = new class465(10, class463.field4954);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3769 = var2;
			this.field3770 = var3;
			this.field3767 = var4;
			this.field3768 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field3778 = new boolean[var6];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lna;",
		garbageValue = "1962524701"
	)
	public Widget method7031(int var1) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lna;",
		garbageValue = "-1107392999"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method7031(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-87937638"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field3778[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field3778[var1] = true;
				return true;
			} else {
				if (this.Widget_interfaceComponents[var1] == null) {
					this.Widget_interfaceComponents[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) {
					if (this.Widget_interfaceComponents[var1][var3] == null) {
						byte[] var4 = this.widgetArchive.takeFile(var1, var3);
						if (var4 != null) {
							this.Widget_interfaceComponents[var1][var3] = new Widget();
							this.Widget_interfaceComponents[var1][var3].id = var3 + (var1 << 16);
							if (var4[0] == -1) {
								this.Widget_interfaceComponents[var1][var3].decode(new Buffer(var4));
							} else {
								this.Widget_interfaceComponents[var1][var3].decodeLegacy(new Buffer(var4));
							}

							if (this.field3768 != null) {
								byte[] var5 = this.field3768.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method7552(new Buffer(var5));
									this.field3773.put(this.Widget_interfaceComponents[var1][var3].field3872, var1);
								}
							}
						}
					}
				}

				field3778[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-59723310"
	)
	public void method7021(int var1) {
		if (var1 != -1) {
			if (field3778[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field3778[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	public void method7026() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}
}
