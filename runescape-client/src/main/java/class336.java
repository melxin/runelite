import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
class class336 implements ThreadFactory {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lma;)V"
	)
	class336(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2132324260"
	)
	public static void method6883() {
		class231.field1913.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	static int method6884() {
		return Login.loginIndex;
	}
}
