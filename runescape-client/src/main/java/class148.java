import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class148 extends class149 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1602031717
	)
	int field1718;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class148(class152 var1) {
		this.this$0 = var1;
		this.field1718 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1718 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3554(this.field1718);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lro;",
		garbageValue = "-5"
	)
	public static TransformationMatrix method3476() {
		synchronized(TransformationMatrix.field4915) {
			if (TransformationMatrix.field4912 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4915[--TransformationMatrix.field4912].method8393();
				return TransformationMatrix.field4915[TransformationMatrix.field4912];
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1106797431"
	)
	static final float method3471(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}
}
