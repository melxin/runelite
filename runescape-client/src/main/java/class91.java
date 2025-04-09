import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public enum class91 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1110(0, -1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1112(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1105(2, 7),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1107(3, 8),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1108(4, 9);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1952042991
	)
	final int field1109;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -442384511
	)
	final int field1104;

	class91(int var3, int var4) {
		this.field1109 = var3;
		this.field1104 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1104;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "837749277"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
