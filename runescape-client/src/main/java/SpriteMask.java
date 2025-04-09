import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1833279057
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -463817013
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ae")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("af")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "932777880"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;I)V",
		garbageValue = "-556174471"
	)
	public static void method6879(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		class435.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Lrz;I)Lrz;",
		garbageValue = "-924095736"
	)
	public static final class442 method6872(class442 var0, class442 var1) {
		class442 var2;
		synchronized(class442.field4917) {
			if (class442.field4920 == 0) {
				var2 = new class442(var0);
			} else {
				class442.field4917[--class442.field4920].method8341(var0);
				var2 = class442.field4917[class442.field4920];
			}
		}

		var2.method8346(var1);
		return var2;
	}
}
