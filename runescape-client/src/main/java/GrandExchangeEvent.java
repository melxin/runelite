import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pk")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -7077137
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 6927094414770334667L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ae")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ao")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lvj;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method7738(2);
		this.grandExchangeOffer.method7739(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-14"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "2"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	static void method7730() {
		Tiles.Tiles_minPlane = 99;
		class277.Tiles_underlays = new short[4][104][104];
		ModelData0.Tiles_overlays = new short[4][104][104];
		class110.Tiles_shapes = new byte[4][104][104];
		Tiles.field1038 = new byte[4][104][104];
		UserComparator2.field5534 = new int[4][105][105];
		DirectByteArrayCopier.Tiles_underlays2 = new byte[4][105][105];
		class416.field4723 = new int[105][105];
		HttpRequestTask.Tiles_hue = new int[104];
		class208.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class376.Tiles_hueMultiplier = new int[104];
		class229.field2468 = new int[104];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1811124589"
	)
	static int method7734(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
		if (var7 != -1) {
			var9[0] = new Integer(var7);
		} else {
			var9 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var9;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var9;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var9;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) {
			var3.field3991 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3984 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3965 = var9;
		} else if (var0 == 1430) {
			var3.field3980 = var9;
		} else if (var0 == 1431) {
			var3.field3981 = var9;
		} else if (var0 == 1434) {
			var3.field3992 = var9;
		} else if (var0 == 1435) {
			var3.field3976 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class357 var8 = var3.method7281();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3800 = var9;
				} else if (var0 == 1437) {
					var8.field3799 = var9;
				} else if (var0 == 1438) {
					var8.field3801 = var9;
				} else if (var0 == 1439) {
					var8.field3802 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1915519075"
	)
	static final void method7729() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = HttpRequest.topLevelWorldView.players[Client.playerUpdateManager.playerIndices[var2]];
				if (var3 != null) {
					var3.method2530();
				}
			}
		}

	}
}
