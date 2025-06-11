import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1572634993
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("aj")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("an")
	final Map field86;
	@ObfuscatedName("ai")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field86 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field86 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "107"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1554875821"
	)
	public String method294() {
		return this.headerFields;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-547196643"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field86;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "274410126"
	)
	static boolean method308(int var0) {
		return (var0 & 128) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-90"
	)
	public static void method306(int var0, int var1) {
		class335.musicPlayerStatus = var0;
		class335.field3697 = var1;
		class335.field3702 = 0;
		class335.field3703 = 0;
		class335.field3698.clear();
		class335.field3699.clear();
		if (class335.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			WorldMapIcon_1.method6192();
		} else {
			class335.field3699.add(new DelayFadeTask((SongTask)null, class335.musicPlayerStatus));
			class335.field3699.add(new FadeOutTask((SongTask)null, 0, false, class335.field3697));
			ArrayList var2 = Player.method2208();
			class335.field3699.add(new class462((SongTask)null, var2));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lov;IB)V",
		garbageValue = "-37"
	)
	static void method305(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * -744024149 > -1) {
			if (var1 > var0.field4003) {
				var0.field4003 = var1;
			}

			if (var1 < var0.field4002) {
				var0.field4002 = var1;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-1505647590"
	)
	static int method298(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		}

		String var4 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
		int[] var5 = null;
		if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			switch(var4.charAt(var7 - 1)) {
			case 'W':
			case 'X':
			case 's':
				var9[var7] = Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
				break;
			default:
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
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
			var3.field4041 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field4100 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4088 = var9;
		} else if (var0 == 1430) {
			var3.field4023 = var9;
		} else if (var0 == 1431) {
			var3.field4097 = var9;
		} else if (var0 == 1434) {
			var3.field4005 = var9;
		} else if (var0 == 1435) {
			var3.field4092 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class365 var8 = var3.method7878();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3899 = var9;
				} else if (var0 == 1437) {
					var8.field3900 = var9;
				} else if (var0 == 1438) {
					var8.field3895 = var9;
				} else if (var0 == 1439) {
					var8.field3898 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "18606"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			ClientPacket.clientPreferences.updateRoofsHidden(!ClientPacket.clientPreferences.isRoofsHidden());
			if (ClientPacket.clientPreferences.isRoofsHidden()) {
				GrandExchangeOfferWorldComparator.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				GrandExchangeOfferWorldComparator.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class146.method3635(var0.substring(5).trim()) == 1;
			class36.client.method503(var1);
			Rasterizer3D.method4992(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			ClientPacket.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var4;
		if (var0.startsWith("setdrawdistance")) {
			var4 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var4[1]);
				ClientPacket.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var8) {
				GrandExchangeOfferWorldComparator.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var4[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var4 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var4[1]);
				Sound.topLevelWorldView.scene.method5409(class233.method4874()[var2]);
			} catch (NumberFormatException var7) {
				GrandExchangeOfferWorldComparator.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var4[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			GrandExchangeOfferWorldComparator.addGameMessage(99, "", String.format("%d", ClientPacket.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class338.worldMap.showCoord = !class338.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				ClientPacket.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				ClientPacket.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				VarpDefinition.method3991();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				HttpAuthenticationHeader.method9362();
			} else if (var0.equalsIgnoreCase("sfx8bit")) {
				ClientPacket.clientPreferences.method2436(true);
			} else if (var0.equalsIgnoreCase("sfx16bit")) {
				ClientPacket.clientPreferences.method2436(false);
			} else if (var0.startsWith("playsong ")) {
				String var9 = var0.substring("playsong ".length());

				try {
					if (ClientPacket.clientPreferences.getMusicVolume() == 0) {
						method306(0, 0);
					} else {
						var2 = ClientPacket.clientPreferences.getMusicVolume();
						method306(0, 0);
						ArrayList var3 = new ArrayList();
						var3.add(new MidiRequest(ModeWhere.field4905, var9, "", var2, false));
						class30.method451(var3, 0, 0, 0, 100, false);
					}
				} catch (Exception var6) {
					GrandExchangeOfferWorldComparator.addGameMessage(99, "", "Can't play the midi named " + var9);
				}
			} else if (var0.equalsIgnoreCase("stopsong")) {
				method306(0, 0);
			}
		}

		PacketBufferNode var10 = class139.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var10.packetBuffer.writeByte(var0.length() + 1);
		var10.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var10);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1537437174"
	)
	static final int method302(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
