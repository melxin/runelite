import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;B)I",
		garbageValue = "24"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lcr;",
		garbageValue = "1793092062"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class526.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class526.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = UserComparator5.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	static void method3440() {
		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var0 = class139.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var0.packetBuffer.writeByte(DirectByteArrayCopier.getWindowedMode());
			var0.packetBuffer.writeShort(GameEngine.canvasWidth);
			var0.packetBuffer.writeShort(GameEngine.canvasHeight);
			Client.packetWriter.addNode(var0);
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ldl;III)V",
		garbageValue = "-1615969156"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		NpcOverrides.updateItemPile2(var0, var0.plane, var1, var2);
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1547492899"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
			class278.runComponentCloseListeners(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
