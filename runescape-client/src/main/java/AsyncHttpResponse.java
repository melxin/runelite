import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field84;
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ab")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("aw")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method254(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-75792843"
	)
	void method254(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1814945297"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1521612253"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2139381135"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lay;",
		garbageValue = "-16285821"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method254(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	static boolean method264() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "2009565481"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class379.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1092 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				WorldMapEvent.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = ClientPreferences.method2781(var7);
			}

			if (var13) {
				int var10 = Renderable.getWidgetFlags(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 + 1 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var0 == 1) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 2) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 3) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 4) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 5) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 6) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 7) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 8) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 9) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 10) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var5 != 0) {
						var12 = Message.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						var12.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var12);
					}

				}
			}
		}
	}
}
