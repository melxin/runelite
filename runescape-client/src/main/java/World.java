import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
@Implements("World")
public class World {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2087819689
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -986806563
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("aq")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ac")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 257709395
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1218634635
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 370777827
	)
	@Export("population")
	int population;
	@ObfuscatedName("as")
	@Export("host")
	String host;
	@ObfuscatedName("ar")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1320725991
	)
	@Export("location")
	int location;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1931802301
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	String field596;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-144200269"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class580.field5925.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class580.field5929.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "715532833"
	)
	boolean method1505() {
		return (class580.field5914.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2080685337"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class580.field5920.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	boolean method1507() {
		return (class580.field5916.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-832249449"
	)
	boolean method1508() {
		return (class580.field5942.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-2"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class580.field5932.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1148538927"
	)
	boolean method1510() {
		return (class580.field5944.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "333655116"
	)
	boolean method1513() {
		return (class580.field5927.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1789512406"
	)
	boolean method1511() {
		return (class580.field5913.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)[I",
		garbageValue = "765550403"
	)
	static int[] method1512(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = InterfaceParent.method2165(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = InterfaceParent.method2165(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = InterfaceParent.method2165(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = InterfaceParent.method2165(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1760316311"
	)
	public static PacketBufferNode method1552() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1704151992"
	)
	static int method1549(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.height * -171267385;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else if (var0 != 1506) {
			return 2;
		} else {
			int var4 = var3.parentId;
			if (var4 == -1) {
				for (InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.first(); var5 != null; var5 = (InterfaceParent)Client.interfaceParents.next()) {
					if (var3.id >> 16 == var5.group) {
						var4 = (int)var5.key;
						break;
					}
				}
			}

			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4;
			return 1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)I",
		garbageValue = "11"
	)
	static int method1553(Widget var0) {
		if (var0.type != 11) {
			--Message.Interpreter_objectStackSize;
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var0.method7995(var1);
			return 1;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1046057119"
	)
	static int method1550(int var0, Script var1, boolean var2) {
		Widget var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = AsyncRestClient.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}
}
