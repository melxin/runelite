import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class81 {
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "-2070581221"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferNameComparator.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lvt;B)Ljava/lang/String;",
		garbageValue = "8"
	)
	public static String method2855(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && HorizontalAlignment.method4376(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && HorizontalAlignment.method4376(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= class333.method7072(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (class267.method6054(var7)) {
						char var8 = class519.method10547(var7);
						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}
}
