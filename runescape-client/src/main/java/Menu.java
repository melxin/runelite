import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xx")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ab")
	boolean field6121;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1139806751
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ag")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("aj")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ah")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("af")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ae")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("aq")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("ac")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aa")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lxx;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ad")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2014104731
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 196608353
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1330943111
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("az")
	@Export("menuHeight")
	@ObfuscatedGetter(
		intValue = -1310202087
	)
	int menuHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1934732173
	)
	int field6133;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -4151853
	)
	int field6134;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 7109446646821642471L
	)
	long field6128;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field6121 = var1;
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
		garbageValue = "14"
	)
	public final String method12043(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-585279455"
	)
	void method12026() {
		this.menuWidth = class70.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = class70.fontBold12.stringWidth(this.method12043(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 404475239 + 1253184676;
		if (this.field6121) {
			this.menuHeight += 1344363746;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1063414417"
	)
	public final void method12027(int var1, int var2) {
		this.method12026();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > class4.canvasWidth) {
			this.menuX = class4.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight * -1310202087 + this.menuY > class558.canvasHeight) {
			this.menuY = class558.canvasHeight - this.menuHeight * -1310202087;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field6133 != -1 && this.subMenus[this.field6133] != null) {
			this.subMenus[this.field6133].method12028(this);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxx;I)V",
		garbageValue = "-131564483"
	)
	final void method12028(Menu var1) {
		this.method12026();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuWidth + this.menuX > class4.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field6133 * 15 + var1.menuY;
		if (var1.field6121) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight * -1310202087 + this.menuY > class558.canvasHeight) {
			this.menuY = var3 - this.menuHeight * -1310202087;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1383786381"
	)
	final int method12029(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field6121) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuX + this.menuWidth && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "286990163"
	)
	public final void method12030(int var1) {
		if (var1 >= 0) {
			HttpRequestTask.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public final boolean method12031(int var1, int var2) {
		if (this.field6133 != -1 && this.subMenus[this.field6133] != null && this.subMenus[this.field6133].method12031(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuX + this.menuWidth + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight * -1310202087 + this.menuY + 10) {
			int var3 = this.method12029(var1, var2);
			if (var3 != -1 && var3 != this.field6133) {
				if (var3 != this.field6134) {
					this.field6134 = var3;
					this.field6128 = class281.method6373();
					if (this.field6133 != -1) {
						this.field6128 += 300L;
					}
				}

				if (this.field6128 <= class281.method6373()) {
					this.field6134 = -1;
					this.method12057();
					if (this.subMenus[var3] != null) {
						this.field6133 = var3;
						this.subMenus[var3].method12028(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "73"
	)
	public final boolean method12050(int var1, int var2) {
		if (this.field6133 != -1 && this.subMenus[this.field6133] != null && this.subMenus[this.field6133].method12050(var1, var2)) {
			return true;
		} else {
			int var3 = this.method12029(var1, var2);
			if (var3 != -1) {
				this.method12030(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-113253885"
	)
	public final void method12033() {
		this.field6133 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method12033();
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1665633423"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = this.menuWidth;
		int var4 = this.menuHeight * -1310202087;

		for (int var5 = 0; var5 < Client.rootWidgetCount; ++var5) {
			if (Client.rootWidgetXs[var5] + Client.rootWidgetWidths[var5] > var1 && Client.rootWidgetXs[var5] < var1 + var3 && Client.rootWidgetHeights[var5] + Client.rootWidgetYs[var5] > var2 && Client.rootWidgetYs[var5] < var2 + var4) {
				Client.validRootWidgets[var5] = true;
			}
		}

		this.method12057();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "362779892"
	)
	final void method12057() {
		if (this.field6133 != -1) {
			if (this.subMenus[this.field6133] != null) {
				this.subMenus[this.field6133].invalidateWidgetsUnder();
			}

			this.field6133 = -1;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "-1754840576"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1921993194"
	)
	public final void method12037() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * -1310202087, var3);
		if (this.field6121) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * -1310202087 - 19, 0);
			class70.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * -1310202087 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field6121) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field6133 || var6 == this.field6134 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			class70.fontBold12.draw(this.method12043(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				class70.fontBold12.method9495(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		ScriptFrame.method738(this.menuX, this.menuY, this.menuWidth, this.menuHeight * -1310202087);
		if (this.field6133 != -1 && this.subMenus[this.field6133] != null) {
			this.subMenus[this.field6133].method12037();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lxz;",
		garbageValue = "-1576055122"
	)
	public static PrivateChatMode method12069(int var0) {
		PrivateChatMode[] var1 = class342.method7334();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field6139) {
				return var3;
			}
		}

		return null;
	}
}
