import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("WidgetDefinition")
public class WidgetDefinition {
	@ObfuscatedName("al")
	static boolean[] field3946;
	@ObfuscatedName("jn")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("widgetArchive")
	AbstractArchive widgetArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field3954;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field3942;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field3943;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field3944;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lox;"
	)
	@Export("Widget_interfaceComponents")
	public Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ap")
	Map field3939;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("Widget_cachedSprites")
	EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("Widget_cachedModels")
	EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("Widget_cachedFonts")
	EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("Widget_cachedSpriteMasks")
	EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	class486 field3952;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	class486 field3940;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lpx;Lpx;Lpx;)V"
	)
	public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3939 = new HashMap();
		this.Widget_cachedSprites = new EvictingDualNodeHashTable(200);
		this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
		this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
		this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
		this.field3952 = new class486(10, class484.field5241);
		this.field3940 = new class486(10, class484.field5241);
		int var6 = 0;
		if (var1 != null) {
			this.widgetArchive = var1;
			this.field3942 = var2;
			this.field3943 = var3;
			this.field3944 = var4;
			this.field3954 = var5;
			var6 = this.widgetArchive.getGroupCount();
		}

		this.Widget_interfaceComponents = new Widget[var6][];
		field3946 = new boolean[var6];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lox;",
		garbageValue = "-883855507"
	)
	public Widget method7456(int var1) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lox;",
		garbageValue = "944478040"
	)
	@Export("getWidgetChild")
	public Widget getWidgetChild(int var1, int var2) {
		Widget var3 = this.method7456(var1);
		if (var2 == -1) {
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1068039244"
	)
	@Export("loadInterface")
	public boolean loadInterface(int var1) {
		if (field3946[var1]) {
			return true;
		} else if (!this.widgetArchive.tryLoadGroup(var1)) {
			return false;
		} else {
			int var2 = this.widgetArchive.getGroupFileCount(var1);
			if (var2 == 0) {
				field3946[var1] = true;
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

							if (this.field3954 != null) {
								byte[] var6 = this.field3954.takeFile(var1, var3);
								if (var6 != null && var6.length > 0) {
									var5.method7892(new Buffer(var6));
									this.field3939.put(var5.field4206, var1);
								}
							}
						}
					}
				}

				for (var3 = 0; var3 < var2; ++var3) {
					Widget var7 = this.Widget_interfaceComponents[var1][var3];
					if (var7 != null && var7.parentId != -1) {
						var5 = this.Widget_interfaceComponents[var1][var7.parentId & 65535];
						if (var3 > var5.field4090) {
							var5.field4090 = var3;
						}

						if (var3 < var5.field4148) {
							var5.field4148 = var3;
						}
					}
				}

				field3946[var1] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-597601887"
	)
	public void method7460(int var1) {
		if (var1 != -1) {
			if (field3946[var1]) {
				this.widgetArchive.clearFilesGroup(var1);
				if (this.Widget_interfaceComponents[var1] != null) {
					for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; ++var2) {
						if (this.Widget_interfaceComponents[var1][var2] != null) {
							this.Widget_interfaceComponents[var1][var2] = null;
						}
					}

					this.Widget_interfaceComponents[var1] = null;
					field3946[var1] = false;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2088673665"
	)
	public void method7455() {
		this.Widget_cachedSprites.clear();
		this.Widget_cachedModels.clear();
		this.Widget_cachedFonts.clear();
		this.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[JIII)V",
		garbageValue = "-1808123669"
	)
	public static void method7473(String[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var6 == null || var0[var9] != null && var0[var9].compareTo(var6) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					long var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method7473(var0, var1, var2, var5 - 1);
			method7473(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1230271547"
	)
	static String method7471() {
		StringBuilder var0 = new StringBuilder();

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = (Message)var1.next();
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}

		return var0.toString();
	}
}
