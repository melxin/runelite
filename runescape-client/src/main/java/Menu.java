import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xx")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("af")
	boolean field6053;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 437518483
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("at")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("ac")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ap")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("aq")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ao")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("as")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("al")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("au")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lxx;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("aa")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1699925617
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1983324149
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -46345949
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("ae")
	@Export("menuHeight")
	@ObfuscatedGetter(
		intValue = 758988865
	)
	int menuHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1240416743
	)
	int field6059;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 440763903
	)
	int field6068;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -1340367106229341551L
	)
	long field6069;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field6053 = var1;
		this.menuArguments1 = new int[var2];
		this.menuArguments2 = new int[var2];
		this.menuOpcodes = new int[var2];
		this.menuIdentifiers = new int[var2];
		this.menuItemIds = new int[var2];
		this.menuWorldViewIds = new int[var2];
		this.menuActions = new String[var2];
		this.menuTargets = new String[var2];
		this.subMenus = new Menu[var2];
		this.menuShiftClick = new boolean[var2];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-69720355"
	)
	public final String method11859(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-131495321"
	)
	void method11861() {
		this.menuWidth = class333.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = class333.fontBold12.stringWidth(this.method11859(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 529411151 + 427507460;
		if (this.field6053) {
			this.menuHeight += -223700078;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "934996814"
	)
	public final void method11868(int var1, int var2) {
		this.method11861();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = GameEngine.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight * 758988865 + this.menuY > class396.canvasHeight) {
			this.menuY = class396.canvasHeight - this.menuHeight * 758988865;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field6059 != -1 && this.subMenus[this.field6059] != null) {
			this.subMenus[this.field6059].method11869(this);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lxx;B)V",
		garbageValue = "-4"
	)
	final void method11869(Menu var1) {
		this.method11861();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuWidth + this.menuX > GameEngine.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field6059 * 15 + var1.menuY;
		if (var1.field6053) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight * 758988865 + this.menuY > class396.canvasHeight) {
			this.menuY = var3 - this.menuHeight * 758988865;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "34334073"
	)
	final int method11885(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field6053) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuX + this.menuWidth && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-89740103"
	)
	public final void method11863(int var1) {
		if (var1 >= 0) {
			ByteArrayPool.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "901420117"
	)
	public final boolean method11900(int var1, int var2) {
		if (this.field6059 != -1 && this.subMenus[this.field6059] != null && this.subMenus[this.field6059].method11900(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuY + this.menuHeight * 758988865 + 10) {
			int var3 = this.method11885(var1, var2);
			if (var3 != -1 && var3 != this.field6059) {
				if (var3 != this.field6068) {
					this.field6068 = var3;
					this.field6069 = class189.method4284();
					if (this.field6059 != -1) {
						this.field6069 += 300L;
					}
				}

				if (this.field6069 <= class189.method4284()) {
					this.field6068 = -1;
					this.method11866();
					if (this.subMenus[var3] != null) {
						this.field6059 = var3;
						this.subMenus[var3].method11869(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "683822367"
	)
	public final boolean method11865(int var1, int var2) {
		if (this.field6059 != -1 && this.subMenus[this.field6059] != null && this.subMenus[this.field6059].method11865(var1, var2)) {
			return true;
		} else {
			int var3 = this.method11885(var1, var2);
			if (var3 != -1) {
				this.method11863(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1474329272"
	)
	public final void method11888() {
		this.field6059 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method11888();
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1273790628"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		RouteStrategy.method6236(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 758988865);
		this.method11866();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	final void method11866() {
		if (this.field6059 != -1) {
			if (this.subMenus[this.field6059] != null) {
				this.subMenus[this.field6059].invalidateWidgetsUnder();
			}

			this.field6059 = -1;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "0"
	)
	@Export("insertMenuItem")
	public final int insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.menuOptionsCount < this.menuActions.length) {
			this.menuActions[this.menuOptionsCount] = var1;
			this.menuTargets[this.menuOptionsCount] = var2;
			this.menuOpcodes[this.menuOptionsCount] = var3;
			this.menuIdentifiers[this.menuOptionsCount] = var4;
			this.menuArguments1[this.menuOptionsCount] = var5;
			this.menuArguments2[this.menuOptionsCount] = var6;
			this.menuItemIds[this.menuOptionsCount] = var7;
			this.menuWorldViewIds[this.menuOptionsCount] = var9;
			this.menuShiftClick[this.menuOptionsCount] = var8;
			this.subMenus[this.menuOptionsCount] = null;
			return ++this.menuOptionsCount - 1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1841306569"
	)
	public final void method11877() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * 758988865, var3);
		if (this.field6053) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * 758988865 - 19, 0);
			class333.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * 758988865 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field6053) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field6059 || var6 == this.field6068 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			class333.fontBold12.draw(this.method11859(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				class333.fontBold12.method9434(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		HttpRequest.method103(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 758988865);
		if (this.field6059 != -1 && this.subMenus[this.field6059] != null) {
			this.subMenus[this.field6059].method11877();
		}

	}
}
