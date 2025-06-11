import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public enum class391 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4617(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4614(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4613(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	field4616(3);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -421975081
	)
	public final int field4619;

	class391(int var3) {
		this.field4619 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4619;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1758844007"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = Tile.fontPlain12.lineWidth(var0, 250);
			int var6 = Tile.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
			Tile.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			Language.method8379(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
			if (var1) {
				ArchiveDiskActionHandler.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
						Client.field558[var11] = true;
					}
				}
			}

		}
	}
}
