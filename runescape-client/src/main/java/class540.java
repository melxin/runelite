import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class540 extends class542 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -405435121
	)
	int field5446;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -832331107
	)
	int field5447;

	public class540(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5446 = 0;
		this.field5447 = 0;
		this.field5446 = var1;
		this.field5447 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-316731460"
	)
	public int method10243() {
		double var1 = this.method10259();
		return (int)Math.round((double)this.field5446 + (double)(this.field5447 - this.field5446) * var1);
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != ClientPacket.clientPreferences.getMusicVolume()) {
			if (ClientPacket.clientPreferences.getMusicVolume() == 0 && Interpreter.method1758()) {
				class205.method4315(ModeWhere.field4905, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				HttpResponse.method306(0, 0);
				Client.playingJingle = false;
			} else {
				SoundCache.method3005(var0);
			}

			ClientPacket.clientPreferences.updateMusicVolume(var0);
		}

	}
}
