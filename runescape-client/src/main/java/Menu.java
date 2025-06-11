import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xy")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ap")
	boolean field5838;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1865588633
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("an")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("ai")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("al")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("ac")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("aa")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("am")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("ah")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ag")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lxy;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ar")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1301670589
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 724523633
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1769924391
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("az")
	@Export("menuHeight")
	@ObfuscatedGetter(
		intValue = 616023513
	)
	int menuHeight;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1117482013
	)
	int field5852;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1104675387
	)
	int field5853;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -709831425284264677L
	)
	long field5854;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5838 = var1;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2024165433"
	)
	public final String method11495(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1239408697"
	)
	void method11524() {
		this.menuWidth = Friend.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = Friend.fontBold12.stringWidth(this.method11495(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 863124519 + -1487820380;
		if (this.field5838) {
			this.menuHeight += 1894742882;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	public final void method11497(int var1, int var2) {
		this.method11524();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = GameEngine.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight * 616023513 + this.menuY > GameEngine.canvasHeight) {
			this.menuY = GameEngine.canvasHeight - this.menuHeight * 616023513;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5852 != -1 && this.subMenus[this.field5852] != null) {
			this.subMenus[this.field5852].method11498(this);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxy;B)V",
		garbageValue = "-35"
	)
	final void method11498(Menu var1) {
		this.method11524();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuX + this.menuWidth > GameEngine.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5852 * 15 + var1.menuY;
		if (var1.field5838) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight * 616023513 + this.menuY > GameEngine.canvasHeight) {
			this.menuY = var3 - this.menuHeight * 616023513;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1544411135"
	)
	final int method11499(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5838) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuX + this.menuWidth && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-999331594"
	)
	public final void method11500(int var1) {
		if (var1 >= 0) {
			PlayerType.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1501846937"
	)
	public final boolean method11501(int var1, int var2) {
		if (this.field5852 != -1 && this.subMenus[this.field5852] != null && this.subMenus[this.field5852].method11501(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight * 616023513 + this.menuY + 10) {
			int var3 = this.method11499(var1, var2);
			if (var3 != -1 && var3 != this.field5852) {
				if (var3 != this.field5853) {
					this.field5853 = var3;
					this.field5854 = class180.method3973();
					if (this.field5852 != -1) {
						this.field5854 += 300L;
					}
				}

				if (this.field5854 <= class180.method3973()) {
					this.field5853 = -1;
					this.method11505();
					if (this.subMenus[var3] != null) {
						this.field5852 = var3;
						this.subMenus[var3].method11498(this);
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
		garbageValue = "-1405174667"
	)
	public final boolean method11531(int var1, int var2) {
		if (this.field5852 != -1 && this.subMenus[this.field5852] != null && this.subMenus[this.field5852].method11531(var1, var2)) {
			return true;
		} else {
			int var3 = this.method11499(var1, var2);
			if (var3 != -1) {
				this.method11500(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-97"
	)
	public final void method11503() {
		this.field5852 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method11503();
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2040807655"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		Language.method8379(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 616023513);
		this.method11505();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-418478840"
	)
	final void method11505() {
		if (this.field5852 != -1) {
			if (this.subMenus[this.field5852] != null) {
				this.subMenus[this.field5852].invalidateWidgetsUnder();
			}

			this.field5852 = -1;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "1522871067"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public final void method11507() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * 616023513, var3);
		if (this.field5838) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * 616023513 - 19, 0);
			Friend.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * 616023513 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		int var6;
		int var7;
		int var8;
		for (var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5838) {
				var7 += 17;
			}

			var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5852 || var6 == this.field5853 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			Friend.fontBold12.draw(this.method11495(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				Friend.fontBold12.method9129(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		var6 = this.menuX;
		var7 = this.menuY;
		var8 = this.menuWidth;
		int var9 = this.menuHeight * 616023513;

		for (int var10 = 0; var10 < Client.rootWidgetCount; ++var10) {
			if (Client.rootWidgetXs[var10] + Client.rootWidgetWidths[var10] > var6 && Client.rootWidgetXs[var10] < var6 + var8 && Client.rootWidgetHeights[var10] + Client.rootWidgetYs[var10] > var7 && Client.rootWidgetYs[var10] < var7 + var9) {
				Client.field558[var10] = true;
			}
		}

		if (this.field5852 != -1 && this.subMenus[this.field5852] != null) {
			this.subMenus[this.field5852].method11507();
		}

	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "-1109800401"
	)
	static void method11496(WorldView var0) {
		if (Client.field312 > 0) {
			int var1 = Client.field485 * 128;
			Model var2 = class107.field1390;
			boolean var3 = true;
			int var4 = Math.max(384, 2000 - Client.viewportZoom * 2);
			int var5 = Client.field527 - (int)(class517.method10079(var1) * (double)var4);
			int var6 = Client.field387;
			double var7 = (double)VertexNormal.method5706(var1) / 65536.0D;
			int var9 = var6 - (int)(var7 * (double)var4);
			int var10 = var0.plane;
			int var11 = var5 >> 7;
			int var14 = var9 >> 7;
			long var15 = class275.calculateTag(var10, var11, var14, 5, false, -1, var0.id);
			var0.scene.drawEntity(var0.plane, var5, var9, Client.field429, 60, var2, var1, var15, false);
		}

	}
}
