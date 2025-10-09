import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1385837663
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1078307221
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ag")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("aj")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "1840789530"
	)
	public static void method7407(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcj;",
		garbageValue = "30"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = ArchiveLoader.method2140(var1, var0);
		Script var4 = SecureUrlRequester.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = SecureUrlRequester.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				var3 = AbstractWorldMapData.method6829(var0);
				var4 = SecureUrlRequester.getScript(var3, var0);
				return var4 != null ? var4 : null;
			}
		}
	}
}
