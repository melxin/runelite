import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	static ClanChannel field4045;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "14"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1288883946"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-1650010421"
	)
	static class134 method7582(int var0) {
		class134[] var1 = new class134[]{class134.field1561, class134.field1557, class134.field1559, class134.field1560, class134.field1563};
		class134 var2 = (class134)StructComposition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class134.field1561;
		}

		return var2;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	static final void method7584() {
		PacketBufferNode var0 = ScriptEvent.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field862 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				NPCComposition.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field862 = false;
	}
}
