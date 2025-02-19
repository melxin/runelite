import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wn")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ab")
	boolean field5718;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1142993951
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("au")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("ad")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ah")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("ac")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ao")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("af")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("aa")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("as")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lwn;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ax")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1196520739
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1325270167
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -40025367
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("av")
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 840932453
	)
	int field5720;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1274866335
	)
	int field5721;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -3345587880987723059L
	)
	long field5713;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5718 = var1;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-9"
	)
	public final String method10867(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	void method10868() {
		this.menuWidth = UserComparator7.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = UserComparator7.fontBold12.stringWidth(this.method10867(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * -980829229 + 24776692;
		if (this.field5718) {
			this.menuHeight += -2035988534;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-88"
	)
	public final void method10871(int var1, int var2) {
		this.method10868();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = GameEngine.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuY + this.menuHeight * -907939499 > SwapSongTask.canvasHeight) {
			this.menuY = SwapSongTask.canvasHeight - this.menuHeight * -907939499;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5720 != -1 && this.subMenus[this.field5720] != null) {
			this.subMenus[this.field5720].method10883(this);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lwn;B)V",
		garbageValue = "88"
	)
	final void method10883(Menu var1) {
		this.method10868();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5720 * 15 + var1.menuY;
		if (var1.field5718) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuY + this.menuHeight * -907939499 > SwapSongTask.canvasHeight) {
			this.menuY = var3 - this.menuHeight * -907939499;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-18318"
	)
	final int method10870(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5718) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1369006850"
	)
	public final void method10888(int var1) {
		if (var1 >= 0) {
			ItemComposition.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1768866868"
	)
	public final boolean method10873(int var1, int var2) {
		if (this.field5720 != -1 && this.subMenus[this.field5720] != null && this.subMenus[this.field5720].method10873(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuX + this.menuWidth + 10 && var2 >= this.menuY - 10 && var2 <= this.menuY + this.menuHeight * -907939499 + 10) {
			int var3 = this.method10870(var1, var2);
			if (var3 != -1 && var3 != this.field5720) {
				if (var3 != this.field5721) {
					this.field5721 = var3;
					this.field5713 = InterfaceParent.method2434();
					if (this.field5720 != -1) {
						this.field5713 += 300L;
					}
				}

				if (this.field5713 <= InterfaceParent.method2434()) {
					this.field5721 = -1;
					this.method10877();
					if (this.subMenus[var3] != null) {
						this.field5720 = var3;
						this.subMenus[var3].method10883(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-779104212"
	)
	public final boolean method10874(int var1, int var2) {
		if (this.field5720 != -1 && this.subMenus[this.field5720] != null && this.subMenus[this.field5720].method10874(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10870(var1, var2);
			if (var3 != -1) {
				this.method10888(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	public final void method10875() {
		this.field5720 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10875();
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1954061035"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight * -907939499;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetWidths[var5] + Client.rootWidgetXs[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var4 + var2) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10877();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19441"
	)
	final void method10877() {
		if (this.field5720 != -1) {
			if (this.subMenus[this.field5720] != null) {
				this.subMenus[this.field5720].invalidateWidgetsUnder();
			}

			this.field5720 = -1;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "114"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-514285890"
	)
	public final void method10879() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * -907939499, var3);
		if (this.field5718) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * -907939499 - 19, 0);
			UserComparator7.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * -907939499 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5718) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5720 || var6 == this.field5721 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			UserComparator7.fontBold12.draw(this.method10867(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				UserComparator7.fontBold12.method8720(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		class78.method2303(this.menuX, this.menuY, this.menuWidth, this.menuHeight * -907939499);
		if (this.field5720 != -1 && this.subMenus[this.field5720] != null) {
			this.subMenus[this.field5720].method10879();
		}

	}
}
