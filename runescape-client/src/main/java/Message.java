import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ai")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1963197515
	)
	@Export("count")
	int count;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1640141009
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -318176463
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@Export("sender")
	String sender;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aq")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("ao")
	@Export("text")
	String text;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "340789753"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5;
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035643980"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1316710240"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = ApproximateRouteStrategy.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1948955035"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1434731987"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = ApproximateRouteStrategy.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1215758128"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class6.method38(this.sender), PacketWriter.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "1999277197"
	)
	static int method766(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				UserComparator7.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				UserComparator7.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class164.method4009(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = WorldMapEvent.method6969(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class305.method6834(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				UserComparator7.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				UserComparator7.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
				var9 = class305.method6834(var9, var5, var6);
				var7 = Client.method1134(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.method332(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = HttpMethod.method74(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = WidgetDefinition.method7496(var9, var4);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				var4 = -1;
				if (FriendSystem.isNumber(var3)) {
					var4 = EnumComposition.method4308(var3);
				}

				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-53"
	)
	static void method767(int var0, int var1, int var2, int var3) {
		Widget var4 = UrlRequester.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			PacketBufferNode.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		ModeWhere.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class337.selectedSpellFlags = var2;
		class89.invalidateWidget(var4);
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class255.scrollBarSprites[0].drawAt(var0, var1);
		class255.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field395);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field478);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field328);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field328);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field328);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field328);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field513);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field513);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field513);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field513);
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403996707"
	)
	static void method768() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (UrlRequester.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = UrlRequester.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = UrlRequester.widgetDefinition.method7476(var4);
					if (var5 != null) {
						class89.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
