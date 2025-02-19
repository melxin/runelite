import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
class class338 implements ThreadFactory {
	@ObfuscatedName("ar")
	static String[] field3747;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmp;)V"
	)
	class338(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "-1307109066"
	)
	public static void method6782(class341 var0) {
		if (!class335.field3691.contains(var0)) {
			class335.field3691.add(var0);
		}

	}
}
