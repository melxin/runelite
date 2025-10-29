import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class200 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("ad")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;IB)Lnw;",
		garbageValue = "-96"
	)
	static MusicPatch method4539(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2031508620"
	)
	static final void method4538() {
		SwapSongTask.method9921("You can't add yourself to your own friend list");
	}
}
