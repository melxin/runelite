import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
class class341 implements ThreadFactory {
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnj;)V"
	)
	class341(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
