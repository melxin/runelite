import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ou")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ac")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("ab")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "100"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-63"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "921858925"
	)
	static int method7444(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		}

		class178.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = AsyncHttpResponse.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
				var3.method7340(AsyncHttpResponse.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var3.field3932 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3932.method6916(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				if (var3.field3932 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3932.method6899(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var3.field3932 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3932.method6959(AsyncHttpResponse.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = WorldEntityCoord.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3917 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3917;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-9"
	)
	static final void method7439(String var0, int var1) {
		PacketBufferNode var2 = Message.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1710504943"
	)
	static void method7446(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}
}
