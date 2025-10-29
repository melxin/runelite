import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ldm;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
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
			PlayerType.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2127187032"
	)
	static String method3226(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1151648316"
	)
	static void method3227() {
		Tiles.Tiles_minPlane = 99;
		class33.Tiles_underlays = new short[4][104][104];
		class623.Tiles_overlays = new short[4][104][104];
		class200.Tiles_shapes = new byte[4][104][104];
		HttpRequest.field49 = new byte[4][104][104];
		class148.field1747 = new int[4][105][105];
		Tiles.Tiles_underlays2 = new byte[4][105][105];
		MouseRecorder.field868 = new int[105][105];
		WorldMapSectionType.Tiles_hue = new int[104];
		class565.Tiles_saturation = new int[104];
		class67.Tiles_lightness = new int[104];
		class161.Tiles_hueMultiplier = new int[104];
		class154.field1785 = new int[104];
	}
}
