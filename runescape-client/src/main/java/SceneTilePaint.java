import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 838003661
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1394344111
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1086879889
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -242187243
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 503396139
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("as")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1600769329
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464421927"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = HttpResponse.getPreferencesFile("", class36.field227.name, true);
			Buffer var1 = FriendSystem.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lvy;I)Ljava/lang/String;",
		garbageValue = "-1495901682"
	)
	public static String method5664(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var10 = var3 - var2;
			if (var10 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5673) {
					case 1:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var10 <= var6) {
					StringBuilder var9 = new StringBuilder(var10);

					for (int var11 = var2; var11 < var3; ++var11) {
						char var7 = var0.charAt(var11);
						if (class114.method3402(var7)) {
							char var8 = class155.method3843(var7);
							if (var8 != 0) {
								var9.append(var8);
							}
						}
					}

					if (var9.length() == 0) {
						return null;
					}

					return var9.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IS)[B",
		garbageValue = "22509"
	)
	public static byte[] method5667(int var0) {
		return class386.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1798669190"
	)
	static void method5663() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-67"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
