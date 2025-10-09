import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class206 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive2")
	static Archive archive2;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfu;FS)F",
		garbageValue = "-5131"
	)
	static float method4593(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1656;
			return ((var2 * var0.field1664 + var0.field1657) * var2 + var0.field1667) * var2 + var0.field1662;
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIB)V",
		garbageValue = "0"
	)
	static void method4592(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.method2884();
					break;
				}
			}

			class172.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-365885718"
	)
	static final void method4591() {
		PacketBufferNode var0 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field641 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class136.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class154.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field641 = false;
	}
}
