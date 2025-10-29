import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
class class195 implements ThreadFactory {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -82823117
	)
	static int field2078;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	final SequenceDefinition this$0;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	class195(SequenceDefinition var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "658814083"
	)
	static Object[] method4454() {
		String var0 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
		Object[] var1 = new Object[var0.length()];

		for (int var2 = var0.length() - 1; var2 >= 0; --var2) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			} else {
				var1[var2] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			}
		}

		return var1;
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2089018130"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ReflectionCheck.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
