import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class323 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3420;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3423;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3421;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3427;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3419;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3424;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3425;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3422;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3429;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3428;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3433;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3430;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3431;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public static final class323 field3432;

	static {
		field3420 = new class323(7);
		field3423 = new class323(4);
		field3421 = new class323(14);
		field3427 = new class323(2);
		field3419 = new class323(5);
		field3424 = new class323(7);
		field3425 = new class323(-2);
		field3422 = new class323(14);
		field3429 = new class323(7);
		field3428 = new class323(20);
		field3433 = new class323(11);
		field3430 = new class323(4);
		field3431 = new class323(17);
		field3432 = new class323(6);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "7"
	)
	class323(int var1) {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1526949369"
	)
	static char method6620(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
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
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
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
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2114364667"
	)
	static void method6617(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class30.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method3106();
					break;
				}
			}

			ByteArrayPool.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-2123451935"
	)
	static boolean method6619(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class30.worldView.scene;
		int var9;
		if (var5 == class384.field4498.field4495) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class360.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4070.id) {
					var8.renderable1 = new DynamicObject(class30.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class30.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class30.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class384.field4494.field4495) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class360.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4071.id && var3 != WorldMapDecorationType.field4072.id) {
					if (var3 == WorldMapDecorationType.field4069.id) {
						var10.renderable1 = new DynamicObject(class30.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4090.id) {
						var10.renderable1 = new DynamicObject(class30.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4075.id) {
						var10.renderable1 = new DynamicObject(class30.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class30.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class30.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class384.field4496.field4495) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4082.id) {
				var3 = WorldMapDecorationType.field4086.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class30.worldView, class360.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class384.field4497.field4495) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class30.worldView, class360.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
