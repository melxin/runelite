import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wv")
@Implements("Menu")
public class Menu {
	@ObfuscatedName("ab")
	boolean field5615;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1449400177
	)
	@Export("menuOptionsCount")
	public int menuOptionsCount;
	@ObfuscatedName("at")
	@Export("menuArguments1")
	public int[] menuArguments1;
	@ObfuscatedName("ae")
	@Export("menuArguments2")
	public int[] menuArguments2;
	@ObfuscatedName("ao")
	@Export("menuOpcodes")
	public int[] menuOpcodes;
	@ObfuscatedName("ac")
	@Export("menuIdentifiers")
	public int[] menuIdentifiers;
	@ObfuscatedName("aj")
	@Export("menuItemIds")
	public int[] menuItemIds;
	@ObfuscatedName("av")
	@Export("menuWorldViewIds")
	public int[] menuWorldViewIds;
	@ObfuscatedName("au")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("an")
	@Export("menuTargets")
	public String[] menuTargets;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lwv;"
	)
	@Export("subMenus")
	public Menu[] subMenus;
	@ObfuscatedName("ai")
	@Export("menuShiftClick")
	public boolean[] menuShiftClick;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 48012133
	)
	@Export("menuX")
	int menuX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1712281119
	)
	@Export("menuY")
	int menuY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 578575945
	)
	@Export("menuWidth")
	int menuWidth;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -806997879
	)
	@Export("menuHeight")
	int menuHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1438575127
	)
	int field5620;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -219064037
	)
	int field5622;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 1078566351832627587L
	)
	long field5613;

	public Menu(boolean var1) {
		this.menuOptionsCount = 0;
		int var2 = var1 ? 500 : 20;
		this.field5615 = var1;
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
		garbageValue = "1"
	)
	public final String method10744(int var1) {
		if (var1 < 0) {
			return "";
		} else {
			return !this.menuTargets[var1].isEmpty() ? this.menuActions[var1] + " " + this.menuTargets[var1] : this.menuActions[var1];
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1391110160"
	)
	void method10731() {
		this.menuWidth = PacketWriter.fontBold12.stringWidth("Choose Option");

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			int var2 = PacketWriter.fontBold12.stringWidth(this.method10744(var1));
			if (this.subMenus[var1] != null) {
				var2 += 15;
			}

			if (var2 > this.menuWidth) {
				this.menuWidth = var2;
			}
		}

		this.menuWidth += 8;
		this.menuHeight = this.menuOptionsCount * 631379415 + 168367844;
		if (this.field5615) {
			this.menuHeight += 757655298;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-227700886"
	)
	public final void method10732(int var1, int var2) {
		this.method10731();
		this.menuX = var1 - this.menuWidth / 2;
		if (this.menuX + this.menuWidth > class329.canvasWidth) {
			this.menuX = class329.canvasWidth - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		this.menuY = var2;
		if (this.menuY + this.menuHeight > class535.canvasHeight) {
			this.menuY = class535.canvasHeight - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

		if (this.field5620 != -1 && this.subMenus[this.field5620] != null) {
			this.subMenus[this.field5620].method10733(this);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lwv;I)V",
		garbageValue = "-883196385"
	)
	final void method10733(Menu var1) {
		this.method10731();
		this.menuX = var1.menuWidth + var1.menuX;
		if (this.menuX + this.menuWidth > class329.canvasWidth) {
			this.menuX = var1.menuX - this.menuWidth;
		}

		if (this.menuX < 0) {
			this.menuX = 0;
		}

		int var2 = var1.menuOptionsCount * 15 - 15 - var1.field5620 * 15 + var1.menuY;
		if (var1.field5615) {
			var2 += 17;
		}

		int var3 = var2 + 19;
		this.menuY = var2;
		if (this.menuY + this.menuHeight > class535.canvasHeight) {
			this.menuY = var3 - this.menuHeight;
		}

		if (this.menuY < 0) {
			this.menuY = 0;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	final int method10747(int var1, int var2) {
		for (int var3 = 0; var3 < this.menuOptionsCount; ++var3) {
			int var4 = this.menuY + (this.menuOptionsCount - 1 - var3) * 15 + 14;
			if (this.field5615) {
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
		garbageValue = "-1631772153"
	)
	public final void method10735(int var1) {
		if (var1 >= 0) {
			SecureRandomFuture.menuAction(this.menuArguments1[var1], this.menuArguments2[var1], this.menuOpcodes[var1], this.menuIdentifiers[var1], this.menuItemIds[var1], this.menuWorldViewIds[var1], this.menuActions[var1], this.menuTargets[var1], MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-95"
	)
	public final boolean method10736(int var1, int var2) {
		if (this.field5620 != -1 && this.subMenus[this.field5620] != null && this.subMenus[this.field5620].method10736(var1, var2)) {
			return true;
		} else if (var1 >= this.menuX - 10 && var1 <= this.menuWidth + this.menuX + 10 && var2 >= this.menuY - 10 && var2 <= this.menuY + this.menuHeight + 10) {
			int var3 = this.method10747(var1, var2);
			if (var3 != -1 && var3 != this.field5620) {
				if (var3 != this.field5622) {
					this.field5622 = var3;
					this.field5613 = class59.method1150();
					if (this.field5620 != -1) {
						this.field5613 += 300L;
					}
				}

				if (this.field5613 <= class59.method1150()) {
					this.field5622 = -1;
					this.method10740();
					if (this.subMenus[var3] != null) {
						this.field5620 = var3;
						this.subMenus[var3].method10733(this);
					}
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "126"
	)
	public final boolean method10757(int var1, int var2) {
		if (this.field5620 != -1 && this.subMenus[this.field5620] != null && this.subMenus[this.field5620].method10757(var1, var2)) {
			return true;
		} else {
			int var3 = this.method10747(var1, var2);
			if (var3 != -1) {
				this.method10735(var3);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	public final void method10738() {
		this.field5620 = -1;

		for (int var1 = 0; var1 < this.menuOptionsCount; ++var1) {
			if (this.subMenus[var1] != null) {
				this.subMenus[var1].method10738();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1415840135"
	)
	@Export("invalidateWidgetsUnder")
	public final void invalidateWidgetsUnder() {
		Canvas.method311(this.menuX, this.menuY, this.menuWidth, this.menuHeight);
		this.method10740();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-144598822"
	)
	final void method10740() {
		if (this.field5620 != -1) {
			if (this.subMenus[this.field5620] != null) {
				this.subMenus[this.field5620].invalidateWidgetsUnder();
			}

			this.field5620 = -1;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "1435642625"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2145389354"
	)
	public final void method10742() {
		int var1 = this.menuX;
		int var2 = this.menuY;
		int var3 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, this.menuWidth, this.menuHeight, var3);
		if (this.field5615) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, this.menuWidth - 2, this.menuHeight - 19, 0);
			PacketWriter.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var3, -1);
		} else {
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 1, this.menuWidth - 2, this.menuHeight - 2, 0);
		}

		int var4 = MouseHandler.MouseHandler_x;
		int var5 = MouseHandler.MouseHandler_y;

		int var6;
		int var7;
		int var8;
		for (var6 = 0; var6 < this.menuOptionsCount; ++var6) {
			var7 = var2 + (this.menuOptionsCount - 1 - var6) * 15 + 14;
			if (this.field5615) {
				var7 += 17;
			}

			var8 = 16777215;
			if (var4 > var1 && var4 < var1 + this.menuWidth && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}

			if (var6 == this.field5620 || var6 == this.field5622 && this.subMenus[var6] != null) {
				Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 2, var7 - 12, this.menuWidth - 4, 15, 7496785);
			}

			PacketWriter.fontBold12.draw(this.method10744(var6), var1 + 3, var7, var8, 0);
			if (this.subMenus[var6] != null) {
				PacketWriter.fontBold12.method8539(62, var1 + this.menuWidth - 10, var7, 16777215);
			}
		}

		var6 = this.menuX;
		var7 = this.menuY;
		var8 = this.menuWidth;
		int var9 = this.menuHeight;

		for (int var10 = 0; var10 < Client.rootWidgetCount; ++var10) {
			if (Client.rootWidgetWidths[var10] + Client.rootWidgetXs[var10] > var6 && Client.rootWidgetXs[var10] < var6 + var8 && Client.rootWidgetHeights[var10] + Client.rootWidgetYs[var10] > var7 && Client.rootWidgetYs[var10] < var9 + var7) {
				Client.field724[var10] = true;
			}
		}

		if (this.field5620 != -1 && this.subMenus[this.field5620] != null) {
			this.subMenus[this.field5620].method10742();
		}

	}
}
