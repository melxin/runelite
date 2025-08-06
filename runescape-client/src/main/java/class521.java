import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
public class class521 implements class526 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	public final class555 field5444;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	class521(class556 var1) {
		this.field5444 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	public class521(class522 var1) {
		this(new class556(var1));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-805413338"
	)
	public int method10487(int var1) {
		return this.field5444.vmethod10928(var1);
	}
}
