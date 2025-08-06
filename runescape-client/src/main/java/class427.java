import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class427 {
	@ObfuscatedName("aw")
	static String[] field4969;

	static {
		new HashMap();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "1754648988"
	)
	@Export("SpotAnimationDefinition_get")
	public static FloorUnderlayDefinition SpotAnimationDefinition_get(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class572.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltx;",
		garbageValue = "1915183740"
	)
	public static class514[] method8684() {
		return new class514[]{class514.field5396, class514.field5394, class514.field5397};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1244590585"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return Ignored.method10078(var0, 10, true);
	}
}
