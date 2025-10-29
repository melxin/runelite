import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class226 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field2558;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	public UrlRequest field2559;
	@ObfuscatedName("at")
	public float[] field2557;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	final class236 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljk;)V"
	)
	class226(class236 var1) {
		this.this$0 = var1;
		this.field2557 = new float[4];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "4921053"
	)
	static final void method5058(String var0) {
		SwapSongTask.method9921(var0 + " is already on your friend list");
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "1579557349"
	)
	static final void method5057(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
