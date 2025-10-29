import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xk")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("av")
	boolean field6167;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1759446067
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("ag")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("an")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ae")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("aj")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("ak")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("aw")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("ap")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ay")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lxk;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("az")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 121140035
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1308492019
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1653973263
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("ac")
	@Export("menuHeight")
	@ObfuscatedGetter(
		intValue = 399255337
	)
	int menuHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 180456857
	)
	int field6170;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1161052669
	)
	int field6156;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1468454876987467673L
	)
	long field6172;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field6167 = var1;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "33616119"
	)
	public final String method12288(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	void method12289() {
		this.menuWidth = class234.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = class234.fontBold12.stringWidth(this.method12288(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 1543564407 + -447376284;
		if (this.field6167) {
			this.menuHeight += 134290370;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1477002946"
	)
	public final void method12290(int var1, int var2) {
		this.method12289();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > class489.canvasWidth) {
			this.menuX = class489.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuHeight * 399255337 + this.menuY > class374.canvasHeight) {
			this.menuY = class374.canvasHeight - this.menuHeight * 399255337;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field6170 != -1 && this.subMenus[this.field6170] != null) {
			this.subMenus[this.field6170].method12291(this);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxk;I)V",
		garbageValue = "219952160"
	)
	final void method12291(Menu var1) {
		this.method12289();
		this.menuX = var1.menuX + var1.menuWidth;
		if (this.menuX + this.menuWidth > class489.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field6170 * 15 + var1.menuY;
		if (var1.field6167) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuHeight * 399255337 + this.menuY > class374.canvasHeight) {
			this.menuY = var3 - this.menuHeight * 399255337;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1164141805"
	)
	final int method12322(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field6167) {
				var4 += 17;
			}

			if (var1 > this.menuX && var1 < this.menuWidth + this.menuX && var2 > var4 - 13 && var2 < var4 + 3) {
				return var3;
			}
		}

		return -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "26"
	)
	public final void method12293(int var1) {
		if (var1 >= 0) {
			class101.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "15"
	)
	public final boolean method12294(int var1, int var2) {
		if (this.field6170 != -1 && this.subMenus[this.field6170] != null && this.subMenus[this.field6170].method12294(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuX + this.menuWidth + 10 && var2 >= this.menuY - 10 && var2 <= this.menuHeight * 399255337 + this.menuY + 10) {
			int var3 = this.method12322(var1, var2);
			if (var3 != -1 && var3 != this.field6170) {
				if (var3 != this.field6156) {
					this.field6156 = var3;
					this.field6172 = ParamComposition.method4708();
					if (this.field6170 != -1) {
						this.field6172 += 300L;
					}
				}

				if (this.field6172 <= ParamComposition.method4708()) {
					this.field6156 = -1;
					this.method12292();
					if (this.subMenus[var3] != null) {
						this.field6170 = var3;
						this.subMenus[var3].method12291(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-89164335"
	)
	public final boolean method12312(int var1, int var2) {
		if (this.field6170 != -1 && this.subMenus[this.field6170] != null && this.subMenus[this.field6170].method12312(var1, var2)) {
			return true;
		} else {
			int var3 = this.method12322(var1, var2);
			if (var3 != -1) {
				this.method12293(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1490780514"
	)
	public final void method12296() {
		this.field6170 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method12296();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1278814647"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		class31.method489(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 399255337);
		this.method12292();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "200"
	)
	final void method12292() {
		if (this.field6170 != -1) {
			if (this.subMenus[this.field6170] != null) {
				this.subMenus[this.field6170].invalidateWidgetsUnder();
			}

			this.field6170 = -1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "-2034748584"
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
		descriptor = "(I)V",
		garbageValue = "-907430317"
	)
	public final void method12287() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight * 399255337, var3);
		if (this.field6167) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight * 399255337 - 19, 0);
			class234.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight * 399255337 - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		for (int var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			int var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field6167) {
				var7 += 17;
			}

			int var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field6170 || var6 == this.field6156 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			class234.fontBold12.draw(this.method12288(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				class234.fontBold12.method9793(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		class408.method8493(this.menuX, this.menuY, this.menuWidth, this.menuHeight * 399255337);
		if (this.field6170 != -1 && this.subMenus[this.field6170] != null) {
			this.subMenus[this.field6170].method12287();
		}

	}
}
