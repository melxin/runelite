import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("lc")
	static String field1371;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "35"
	)
	static int method3200(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Client.field364 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.field364;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-71"
	)
	static void method3199(int var0, int var1) {
		if (class154.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(GrandExchangeOffer.archive6, var0, 0, class154.clientPreferences.getMusicVolume(), false));
			TextureProvider.method5489(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
