import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xz")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("al")
	boolean field5959;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1208434705
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ac")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("av")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("au")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("as")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ah")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("ap")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("am")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aj")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lxz;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ay")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1162419305
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1851249883
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1856030931
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("ar")
	@Export("menuHeight")
	@ObfuscatedGetter(
		intValue = 45702685
	)
	int menuHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 737729121
	)
	int field5953;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 569260995
	)
	int field5968;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -6848148775745776405L
	)
	long field5960;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5959 = var1;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1108205502"
	)
	public final String method11858(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "53756451"
	)
	void method11859() {
		this.menuWidth = HttpJsonRequestBody.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = HttpJsonRequestBody.fontBold12.stringWidth(this.method11858(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * -368120037 + 760828116;
		if (this.field5959) {
			this.menuHeight += 1276242874;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "249461983"
	)
	public final void method11877(int var1, int var2) {
		this.method11859();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuWidth + this.menuX > RestClientThreadFactory.canvasWidth) {
			this.menuX = RestClientThreadFactory.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuY + this.menuHeight * 45702685 > GameEngine.canvasHeight) {
			this.menuY = GameEngine.canvasHeight - this.menuHeight * 45702685;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5953 != -1 && this.subMenus[this.field5953] != null) {
			this.subMenus[this.field5953].method11861(this);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxz;I)V",
		garbageValue = "1627972630"
	)
	final void method11861(Menu var1) {
		this.method11859();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuWidth + this.menuX > RestClientThreadFactory.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5953 * 15 + var1.menuY;
		if (var1.field5959) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuY + this.menuHeight * 45702685 > GameEngine.canvasHeight) {
			this.menuY = var3 - this.menuHeight * 45702685;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1777824375"
	)
	final int method11862(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5959) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuX + this.menuWidth && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1760389010"
	)
	public final void method11863(int var1) {
		if (var1 >= 0) {
			class141.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1494996897"
	)
	public final boolean method11885(int var1, int var2) {
		if (this.field5953 != -1 && this.subMenus[this.field5953] != null && this.subMenus[this.field5953].method11885(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuX + this.menuWidth + 10 && var2 >= this.menuY - 10 && var2 <= this.menuY + this.menuHeight * 45702685 + 10) {
			int var3 = this.method11862(var1, var2);
			if (var3 != -1 && var3 != this.field5953) {
				if (var3 != this.field5968) {
					this.field5968 = var3;
					this.field5960 = UserComparator7.method3496();
					if (this.field5953 != -1) {
						this.field5960 += 300L;
					}
				}

				if (this.field5960 <= UserComparator7.method3496()) {
					this.field5968 = -1;
					this.method11868();
					if (this.subMenus[var3] != null) {
						this.field5953 = var3;
						this.subMenus[var3].method11861(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "48"
	)
	public final boolean method11865(int var1, int var2) {
		if (this.field5953 != -1 && this.subMenus[this.field5953] != null && this.subMenus[this.field5953].method11865(var1, var2)) {
			return true;
		} else {
			int var3 = this.method11862(var1, var2);
			if (var3 != -1) {
				this.method11863(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	public final void method11866() {
		this.field5953 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method11866();
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1132438939"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		AsyncHttpResponse.method297(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 45702685);
		this.method11868();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	final void method11868() {
		if (this.field5953 != -1) {
			if (this.subMenus[this.field5953] != null) {
				this.subMenus[this.field5953].invalidateWidgetsUnder();
			}

			this.field5953 = -1;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "323732941"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-423306473"
	)
	public final void method11902() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * 45702685, var3);
		if (this.field5959) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * 45702685 - 19, 0);
			HttpJsonRequestBody.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * 45702685 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		int var6;
		int var7;
		int var8;
		for (var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5959) {
				var7 += 17;
			}

			var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5953 || var6 == this.field5968 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			HttpJsonRequestBody.fontBold12.draw(this.method11858(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				HttpJsonRequestBody.fontBold12.method9441(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		var6 = this.menuX;
		var7 = this.menuY;
		var8 = this.menuWidth;
		int var9 = this.menuHeight * 45702685;

		for (int var10 = 0; var10 < Client.rootWidgetCount; ++var10) {
			if (Client.rootWidgetXs[var10] + Client.rootWidgetWidths[var10] > var6 && Client.rootWidgetXs[var10] < var6 + var8 && Client.rootWidgetHeights[var10] + Client.rootWidgetYs[var10] > var7 && Client.rootWidgetYs[var10] < var9 + var7) {
				Client.field545[var10] = true;
			}
		}

		if (this.field5953 != -1 && this.subMenus[this.field5953] != null) {
			this.subMenus[this.field5953].method11902();
		}

	}
}
