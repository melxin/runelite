import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class405 {
	@ObfuscatedName("pt")
	@Export("regions")
	static int[] regions;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqm;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1620759139"
	)
	static String method8274(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
	)
	static void method8273(int var0, int var1, int var2, int var3, int var4, int var5) {
		SpotAnimationDefinition.field2208 = (var3 + var0) / 2;
		class204.field2248 = (var4 + var1) / 2;
		class179.field1967 = (var5 + var2) / 2;
		class450.field5166 = (var3 - var0) / 2;
		class179.field1965 = (var4 - var1) / 2;
		UserComparator6.field1591 = (var5 - var2) / 2;
		HealthBarUpdate.field1113 = Math.abs(class450.field5166);
		FontName.field5750 = Math.abs(class179.field1965);
		WorldMapCacheName.field3500 = Math.abs(UserComparator6.field1591);
		ViewportMouse.field2962.method8993((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
		ViewportMouse.field2962.method9042();
		ViewportMouse.ViewportMouse_false0 = true;
	}
}
