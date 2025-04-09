import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wm")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ao")
	boolean field5742;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -676541019
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ae")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("af")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("as")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("aq")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("av")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("am")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("aa")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ap")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lwm;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("aw")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1315380751
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2020272363
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 498698363
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2062874599
	)
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 520210867
	)
	int field5747;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 873041581
	)
	int field5748;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6802277698651102921L
	)
	long field5749;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5742 = var1;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1458904157"
	)
	public final String method10936(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1464488834"
	)
	void method10938() {
		this.menuWidth = class440.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = class440.fontBold12.stringWidth(this.method10936(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 1516072551 + 2122272932;
		if (this.field5742) {
			this.menuHeight += 960293602;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1618527891"
	)
	public final void method10939(int var1, int var2) {
		this.method10938();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuWidth + this.menuX > GameEngine.canvasWidth) {
			this.menuX = GameEngine.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuY + this.menuHeight * -2062874599 > class141.canvasHeight) {
			this.menuY = class141.canvasHeight - this.menuHeight * -2062874599;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5747 != -1 && this.subMenus[this.field5747] != null) {
			this.subMenus[this.field5747].method10940(this);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwm;I)V",
		garbageValue = "1335199790"
	)
	final void method10940(Menu var1) {
		this.method10938();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5747 * 15 + var1.menuY;
		if (var1.field5742) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuY + this.menuHeight * -2062874599 > class141.canvasHeight) {
			this.menuY = var3 - this.menuHeight * -2062874599;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-199788765"
	)
	final int method10958(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5742) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "15502"
	)
	public final void method10942(int var1) {
		if (var1 >= 0) {
			class76.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "28"
	)
	public final boolean method10943(int var1, int var2) {
		if (this.field5747 != -1 && this.subMenus[this.field5747] != null && this.subMenus[this.field5747].method10943(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight * -2062874599 + this.menuY + 10) {
			int var3 = this.method10958(var1, var2);
			if (var3 != -1 && var3 != this.field5747) {
				if (var3 != this.field5748) {
					this.field5748 = var3;
					this.field5749 = class282.method5908();
					if (this.field5747 != -1) {
						this.field5749 += 300L;
					}
				}

				if (this.field5749 <= class282.method5908()) {
					this.field5748 = -1;
					this.method10951();
					if (this.subMenus[var3] != null) {
						this.field5747 = var3;
						this.subMenus[var3].method10940(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1452608903"
	)
	public final boolean method10970(int var1, int var2) {
		if (this.field5747 != -1 && this.subMenus[this.field5747] != null && this.subMenus[this.field5747].method10970(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10958(var1, var2);
			if (var3 != -1) {
				this.method10942(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	public final void method10945() {
		this.field5747 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10945();
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30360"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight * -2062874599;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetXs[var5] + Client.rootWidgetWidths[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var4 + var2) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10951();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1342351555"
	)
	final void method10951() {
		if (this.field5747 != -1) {
			if (this.subMenus[this.field5747] != null) {
				this.subMenus[this.field5747].invalidateWidgetsUnder();
			}

			this.field5747 = -1;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "41"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-912707519"
	)
	public final void method10937() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * -2062874599, var3);
		if (this.field5742) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * -2062874599 - 19, 0);
			class440.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * -2062874599 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5742) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5747 || var6 == this.field5748 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			class440.fontBold12.draw(this.method10936(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				class440.fontBold12.method8756(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		class225.method4972(this.menuX, this.menuY, this.menuWidth, this.menuHeight * -2062874599);
		if (this.field5747 != -1 && this.subMenus[this.field5747] != null) {
			this.subMenus[this.field5747].method10937();
		}

	}
}
