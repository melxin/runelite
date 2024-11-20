import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public class class507 {
	@ObfuscatedName("al")
	static final int[] field5153;
	@ObfuscatedName("ar")
	public static final int[] field5149;

	static {
		field5153 = new int[2048];
		field5149 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5153[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5149[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIB)V",
		garbageValue = "42"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7256(class379.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var4 * var8 + var5 * var7 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = HttpResponse.entity.getX() + var9 >> 7;
					int var12 = HttpResponse.entity.getY() - var10 >> 7;
					PacketBufferNode var13 = Message.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortAddLE(var12 + HttpRequest.topLevelWorldView.baseY);
					var13.packetBuffer.writeShortAdd(var11 + HttpRequest.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(AsyncHttpResponse.localPlayer.x);
					var13.packetBuffer.writeShort(AsyncHttpResponse.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
