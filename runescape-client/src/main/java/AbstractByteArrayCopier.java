import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "100"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-63"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FS)F",
		garbageValue = "-29667"
	)
	static float method7435(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1576;
			return var2 * ((var0.field1587 * var2 + var0.field1579) * var2 + var0.field1580) + var0.field1588;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1061931063"
	)
	public static boolean method7434() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class333.field3627.isEmpty()) {
			SongTask var2 = (SongTask)class333.field3627.get(0);
			if (var2 == null) {
				class333.field3627.remove(0);
			} else if (var2.vmethod8722()) {
				if (var2.method8714()) {
					System.out.println("Error in midimanager.service: " + var2.method8700());
					var0 = true;
				} else {
					if (var2.method8715() != null) {
						class333.field3627.add(1, var2.method8715());
					}

					var1 = var2.method8699();
				}

				class333.field3627.remove(0);
			} else {
				var1 = var2.method8699();
			}
		}

		if (var0) {
			class333.field3627.clear();
			class136.method3325();
		}

		return var1;
	}
}
