import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class class268 extends Node {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	static GraphicsDefaults field2990;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1193462827
	)
	public int field2985;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -505473307
	)
	public int field2987;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1826435451
	)
	public int field2983;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public Widget field2988;

	@ObfuscatedSignature(
		descriptor = "(IIILnp;)V"
	)
	public class268(int var1, int var2, int var3, Widget var4) {
		this.field2983 = var1;
		this.field2985 = var2;
		this.field2987 = var3;
		this.field2988 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldt;",
		garbageValue = "83"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class450.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class153.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	static void method5565() {
		class277.Tiles_underlays = null;
		ModelData0.Tiles_overlays = null;
		class110.Tiles_shapes = null;
		Tiles.field1038 = null;
		UserComparator2.field5534 = null;
		DirectByteArrayCopier.Tiles_underlays2 = null;
		class416.field4723 = null;
		HttpRequestTask.Tiles_hue = null;
		class208.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class376.Tiles_hueMultiplier = null;
		class229.field2468 = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019166441"
	)
	public static void method5563() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}
}
