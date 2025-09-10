import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class196 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field2100")
	static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lva;I)Ljava/lang/String;",
		garbageValue = "-1694582165"
	)
	public static String method4386(CharSequence var0, LoginType var1) {
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

			int var11 = var3 - var2;
			if (var11 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5775) {
					case 1:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var11 <= var6) {
					StringBuilder var10 = new StringBuilder(var11);

					for (int var12 = var2; var12 < var3; ++var12) {
						char var7 = var0.charAt(var12);
						if (class576.method11045(var7)) {
							char var8;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
							}

							if (var8 != 0) {
								var10.append(var8);
							}
						}
					}

					if (var10.length() == 0) {
						return null;
					}

					return var10.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-41"
	)
	public static boolean method4384() {
		return !class339.field3889.isEmpty();
	}
}
