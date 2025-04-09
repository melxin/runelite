import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -1338435615
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -430705209
	)
	static int field2331;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -401608449
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1204512953
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2008812151
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1001865991
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1784135893
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aq")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -179143249
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-16257"
	)
	static String method4586(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}
}
