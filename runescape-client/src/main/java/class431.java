import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class431 extends RuntimeException {
	public class431(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "-137584385"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0) {
		String var1;
		int var3;
		if (var0.buttonType == 1) {
			var1 = var0.buttonText;
			int var2 = var0.id;
			var3 = var0.itemId;
			LoginScreenAnimation.insertMenuItem(var1, "", 24, 0, 0, var2, var3, false, -1);
		}

		int var4;
		String var20;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var1 = Fonts.Widget_getSpellActionName(var0);
			if (var1 != null) {
				var20 = class438.colorStartTag(65280) + var0.field3997;
				var3 = var0.id;
				var4 = var0.itemId;
				LoginScreenAnimation.insertMenuItem(var1, var20, 25, 0, -1, var3, var4, false, -1);
			}
		}

		if (var0.buttonType == 3) {
			class327.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			class327.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			class327.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			class327.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		if (var0.isIf3) {
			int var5;
			if (Client.isSpellSelected) {
				if (NPC.method2956(Renderable.getWidgetFlags(var0)) && (class202.selectedSpellFlags & 32) == 32) {
					var1 = Client.selectedSpellActionName;
					var20 = Client.selectedSpellName + " " + "->" + " " + var0.dataText;
					var3 = var0.childIndex;
					var4 = var0.id;
					var5 = var0.itemId;
					LoginScreenAnimation.insertMenuItem(var1, var20, 58, 0, var3, var4, var5, false, -1);
				}
			} else {
				for (int var21 = 9; var21 >= 0; --var21) {
					int var6;
					if (var0.field3949 * 1334861409 == var21) {
						var20 = Fonts.Widget_getSpellActionName(var0);
						if (var20 != null) {
							String var22 = var0.dataText;
							var4 = var0.childIndex;
							var5 = var0.id;
							var6 = var0.itemId;
							LoginScreenAnimation.insertMenuItem(var20, var22, 25, 0, var4, var5, var6, false, -1);
						}
					}

					var4 = Renderable.getWidgetFlags(var0);
					boolean var27 = (var4 >> var21 + 1 & 1) != 0;
					if (!var27 && var0.onOp == null) {
						var20 = null;
					} else if (var0.actions != null && var0.actions.length > var21 && var0.actions[var21] != null && var0.actions[var21].trim().length() != 0) {
						var20 = var0.actions[var21];
					} else {
						var20 = null;
					}

					if (var20 != null) {
						int var8;
						int var10;
						int var11;
						short var28;
						if (var21 > var0.field3949 * 1334861409) {
							var28 = 1007;
							String var7 = var0.dataText;
							var8 = var21 + 1;
							int var9 = var0.childIndex;
							var10 = var0.id;
							var11 = var0.itemId;
							var6 = LoginScreenAnimation.insertMenuItem(var20, var7, var28, var8, var9, var10, var11, false, -1);
							var4 = var6;
						} else {
							var28 = 57;
							var4 = LoginScreenAnimation.insertMenuItem(var20, var0.dataText, var28, var21 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry, -1);
						}

						if (var0.field3948 != null && var21 < var0.field3948.length && var0.field3948[var21] != null) {
							String[] var23 = var0.field3948[var21];

							for (int var24 = var23.length - 1; var24 >= 0; --var24) {
								var8 = var24 + 1 << 16 | var21 + 1;
								if (var23[var24] != null && !var23[var24].isEmpty()) {
									String var25 = var23[var24];
									var10 = var0.childIndex;
									var11 = var0.id;
									int var12 = var0.itemId;
									if (!Client.isMenuOpen) {
										int var15 = var28;
										if (var28 >= 2000) {
											var15 = var28 - 2000;
										}

										if (class31.field153 != -1) {
										}

										boolean var16 = true;
										boolean var17;
										if (!var16) {
											var17 = var15 == 14 || var15 == 15 || var15 >= 44 && var15 <= 51;
											var16 = var17;
										}

										boolean var14 = var16 || class95.method2586(var15);
										boolean var13;
										if (!var14) {
											var13 = false;
										} else {
											label344: {
												var17 = AttackOption.method2989(var28) || WorldMapLabelSize.method5795(var28);
												boolean var18;
												if (!var17) {
													var18 = var28 == 7 || var28 == 8 || var28 >= 9 && var28 <= 13;
													var17 = var18;
												}

												var18 = var17;
												if (!var17) {
													boolean var19 = var28 == 16 || var28 == 17 || var28 >= 18 && var28 <= 22;
													var18 = var19;
												}

												var16 = var18 || class95.method2586(var28);
												if (var16) {
													class491 var26 = Client.worldViewManager.method2599(-1);
													if (var26 == class491.field5083) {
														var13 = false;
														break label344;
													}

													if (var26 == class491.field5085 && !class95.method2586(var28)) {
														var13 = false;
														break label344;
													}
												}

												var13 = true;
											}
										}

										if (var13 && var4 >= 0 && var4 < Client.menu.subMenus.length) {
											if (Client.menu.subMenus[var4] == null) {
												Client.menu.subMenus[var4] = new Menu(false);
											}

											Client.menu.subMenus[var4].insertMenuItem(var25, "", var28, var8, var10, var11, var12, false, -1);
										}
									}
								}
							}
						}
					}
				}

				if (LoginState.method1231(Renderable.getWidgetFlags(var0))) {
					class327.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
