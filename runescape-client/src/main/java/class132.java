import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class132 {
	@ObfuscatedName("ai")
	public static final float field1558;
	@ObfuscatedName("al")
	public static final float field1559;

	static {
		field1558 = Math.ulp(1.0F);
		field1559 = 2.0F * field1558;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lov;I[B[BI)V",
		garbageValue = "1777161449"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field4058 == null) {
			if (var2 == null) {
				return;
			}

			var0.field4058 = new byte[11][];
			var0.field4059 = new byte[11][];
			var0.field4060 = new int[11];
			var0.field4031 = new int[11];
		}

		var0.field4058[var1] = var2;
		if (var2 != null) {
			var0.field4057 = true;
		} else {
			var0.field4057 = false;

			for (int var4 = 0; var4 < var0.field4058.length; ++var4) {
				if (var0.field4058[var4] != null) {
					var0.field4057 = true;
					break;
				}
			}
		}

		var0.field4059[var1] = var3;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2047482711"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class139.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShort(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}
