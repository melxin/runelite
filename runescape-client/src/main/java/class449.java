import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class449 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	class450 field4942;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1042656691
	)
	int field4941;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1317206213
	)
	int field4940;

	@ObfuscatedSignature(
		descriptor = "(Lrx;)V"
	)
	class449(class450 var1) {
		this.field4941 = 0;
		this.field4940 = this.field4942.field4948;
		this.field4942 = var1;
	}

	public boolean hasNext() {
		return this.field4941 < this.field4942.field4946;
	}

	public Object next() {
		if (this.field4942.field4948 != this.field4940) {
			throw new ConcurrentModificationException();
		} else if (this.field4941 < this.field4942.field4946) {
			Object var1 = this.field4942.field4951[this.field4941].field4938;
			++this.field4941;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-79"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class376.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1091 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				MilliClock.runScriptEvent(var8);
			}

			boolean var10 = true;
			if (var7.contentType > 0) {
				var10 = class272.method5683(var7);
			}

			if (var10) {
				if (HitSplatDefinition.method4135(class441.getWidgetFlags(var7), var6 - 1)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 2) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 3) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 4) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 5) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 6) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 7) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 8) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 9) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 10) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var5 != 0) {
						var9 = class272.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						var9.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var9);
					}

				}
			}
		}
	}
}
