import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ab")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1945847785
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1332217981
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("ae")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class426 field2895;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1733465581
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("az")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field2903;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		field2895 = new class426();
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-1515975993"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-711791942"
	)
	static String method5417() {
		StringBuilder var0 = new StringBuilder();
		MoveSpeed[] var1 = MoveSpeed.field3065;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var0.append(var3.id);
			var0.append(", ");
		}

		String var4 = var0.toString();
		return var4.substring(0, var4.length() - 2);
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Lcj;B)V",
		garbageValue = "0"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (FloorOverlayDefinition.loginState != var0) {
			FloorOverlayDefinition.loginState = var0;
		}
	}
}
