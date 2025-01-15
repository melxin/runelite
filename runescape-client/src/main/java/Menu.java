import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wl")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ay")
	boolean field5611;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -851609407
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("az")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("ao")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ad")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("an")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ae")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("ax")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("at")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ac")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lwl;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("as")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -724915389
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1384065801
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 413062201
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1569719871
	)
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 458338547
	)
	int field5626;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1361570705
	)
	int field5627;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -787465256797306685L
	)
	long field5621;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5611 = var1;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1002229274"
	)
	public final String method10916(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	void method10917() {
		this.menuWidth = GraphicsObject.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = GraphicsObject.fontBold12.stringWidth(this.method10916(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 1294578225 + 345220860;
		if (this.field5611) {
			this.menuHeight += 1553493870;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-173935892"
	)
	public final void method10920(int var1, int var2) {
		this.method10917();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > BuddyRankComparator.canvasWidth) {
			this.menuX = BuddyRankComparator.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight + this.menuY > Huffman.canvasHeight) {
			this.menuY = Huffman.canvasHeight - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5626 != -1 && this.subMenus[this.field5626] != null) {
			this.subMenus[this.field5626].method10915(this);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwl;I)V",
		garbageValue = "1740521715"
	)
	final void method10915(Menu var1) {
		this.method10917();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuWidth + this.menuX > BuddyRankComparator.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5626 * 15 + var1.menuY;
		if (var1.field5611) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight + this.menuY > Huffman.canvasHeight) {
			this.menuY = var3 - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "97"
	)
	final int method10940(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5611) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuX + this.menuWidth && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	public final void method10921(int var1) {
		if (var1 >= 0) {
			class508.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "11274"
	)
	public final boolean method10922(int var1, int var2) {
		if (this.field5626 != -1 && this.subMenus[this.field5626] != null && this.subMenus[this.field5626].method10922(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight + this.menuY + 10) {
			int var3 = this.method10940(var1, var2);
			if (var3 != -1 && var3 != this.field5626) {
				if (var3 != this.field5627) {
					this.field5627 = var3;
					this.field5621 = ReflectionCheck.method724();
					if (this.field5626 != -1) {
						this.field5621 += 300L;
					}
				}

				if (this.field5621 <= ReflectionCheck.method724()) {
					this.field5627 = -1;
					this.method10926();
					if (this.subMenus[var3] != null) {
						this.field5626 = var3;
						this.subMenus[var3].method10915(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1510688622"
	)
	public final boolean method10923(int var1, int var2) {
		if (this.field5626 != -1 && this.subMenus[this.field5626] != null && this.subMenus[this.field5626].method10923(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10940(var1, var2);
			if (var3 != -1) {
				this.method10921(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1799312768"
	)
	public final void method10924() {
		this.field5626 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10924();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetWidths[var5] + Client.rootWidgetXs[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetYs[var5] + Client.rootWidgetHeights[var5] > var2 && Client.rootWidgetYs[var5] < var4 + var2) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method10926();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-339514510"
	)
	final void method10926() {
		if (this.field5626 != -1) {
			if (this.subMenus[this.field5626] != null) {
				this.subMenus[this.field5626].invalidateWidgetsUnder();
			}

			this.field5626 = -1;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "-397039727"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "28586"
	)
	public final void method10928() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight, var3);
		if (this.field5611) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight - 19, 0);
			GraphicsObject.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5611) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5626 || var6 == this.field5627 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			GraphicsObject.fontBold12.draw(this.method10916(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				GraphicsObject.fontBold12.method8674(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		FadeOutTask.method8847(this.menuX, this.menuY, this.menuWidth, this.menuHeight);
		if (this.field5626 != -1 && this.subMenus[this.field5626] != null) {
			this.subMenus[this.field5626].method10928();
		}

	}
}
