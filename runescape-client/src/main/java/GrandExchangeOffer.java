import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ab")
	@Export("state")
	byte state;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -713601137
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1180219239
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1083867971
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 877015717
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -332646289
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lvj;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "842313778"
	)
	void method7738(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-953143915"
	)
	void method7739(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("at")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class421.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "339111951"
	)
	static boolean method7736(int var0, int var1, int var2, int var3, int var4, int var5) {
		return class27.method398(Projection.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
