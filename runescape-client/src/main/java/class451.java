import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class451 {
	@ObfuscatedName("av")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;B)Lrx;",
		garbageValue = "1"
	)
	public static final ProjectionCoord method9146(ProjectionCoord var0, ProjectionCoord var1) {
		ProjectionCoord var2 = class30.method486(var0);
		var2.method9304(var1);
		return var2;
	}
}
