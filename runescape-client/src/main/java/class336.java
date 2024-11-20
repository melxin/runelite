import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
class class336 implements ThreadFactory {
	@ObfuscatedName("bv")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
	)
	class336(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
