import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("al")
	@Export("text")
	String text;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1655134729
	)
	@Export("width")
	int width;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2090456849
	)
	@Export("height")
	int height;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkj;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1762117251"
	)
	public static int method6812(int var0) {
		return class532.field5476[var0 & 2047];
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-824986452"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class152.fontPlain12.lineWidth(var0, 250);
			int var6 = class152.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
			class152.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			AsyncHttpResponse.method297(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
			if (var1) {
				Interpreter.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
						Client.field545[var11] = true;
					}
				}
			}

		}
	}
}
