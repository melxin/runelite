import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class254 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "-2020315960"
	)
	public static FloorUnderlayDefinition method5238(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)Lvy;",
		garbageValue = "67253210"
	)
	public static IndexedSprite method5239(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			class95.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : SecureRandomCallable.method2433();
	}
}
