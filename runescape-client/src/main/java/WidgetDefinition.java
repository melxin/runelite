import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("aj")
	static boolean[] field3771;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field3772;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field3775;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field3784;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field3776;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[Lnp;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("av")
	Map field3778;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	class465 field3783;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	class465 field3777;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;Lpi;Lpi;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3778 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3783 = new class465(10, class463.field4954);
		this.field3777 = new class465(10, class463.field4954);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3775 = var2;
			this.field3784 = var3;
			this.field3776 = var4;
			this.field3772 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field3771 = new boolean[var6];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lnp;",
		garbageValue = "-2063328194"
	)
	public Widget method6875(int var1) {
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
		descriptor = "(IIB)Lnp;",
		garbageValue = "120"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method6875(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2009565481"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field3771[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field3771[var1] = true;
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

							if (this.field3772 != null) {
								byte[] var5 = this.field3772.takeFile(var1, var3);
								if (var5 != null && var5.length > 0) {
									this.Widget_interfaceComponents[var1][var3].method7246(new Buffer(var5));
									this.field3778.put(this.Widget_interfaceComponents[var1][var3].field3862, var1);
								}
							}
						}
					}
				}

				field3771[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-126"
	)
	public void method6872(int var1) {
		if (var1 != -1) {
			if (field3771[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field3771[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1246078106"
	)
	public void method6873() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1516390984"
	)
	static final void method6885(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (float)var0 / 200.0F + 0.5F;
		Rasterizer3D.buildPalette((double)var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness((double)var1);
		if (class158.worldMap != null) {
			class158.worldMap.method9546();
		}

		class416.method7985();
		SecureUrlRequester.clientPreferences.updateBrightness((double)var1);
	}
}
