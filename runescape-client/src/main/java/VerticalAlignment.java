import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	field2673(2, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	field2670(0, 2);

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static Fonts field2674;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -761626247
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1236815397
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "801639333"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-445996510"
	)
	static int method5355(int var0, Script var1, boolean var2) {
		return 2;
	}
}
