import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static final DefaultsGroup field5308;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static final DefaultsGroup field5309;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 749709939
	)
	@Export("group")
	final int group;

	static {
		field5308 = new DefaultsGroup(1);
		field5309 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "504277750"
	)
	public static int method10049(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-19949134"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field398 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (DirectByteArrayCopier.getWindowedMode() == 1) {
			class36.client.setMaxCanvasSize(765, 503);
		} else {
			class36.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			UserComparator10.method3440();
		}

	}
}
