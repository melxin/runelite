import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class179 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1915")
	public static EvictingDualNodeHashTable field1915;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhv;",
		garbageValue = "-1893198245"
	)
	static HorizontalAlignment[] method3972() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2015, HorizontalAlignment.field2009};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public static void method3971() {
		class190.field2023.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "1391144491"
	)
	static Object[] method3970() {
		String var0 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
		Object[] var1 = new Object[var0.length()];

		for (int var2 = var0.length() - 1; var2 >= 0; --var2) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			} else {
				var1[var2] = Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
			}
		}

		return var1;
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1339562175"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ClanChannelMember.scrollBarSprites[0].drawAt(var0, var1);
		ClanChannelMember.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field451);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field448);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field471);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field471);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field471);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field471);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field328);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field328);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field328);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field328);
	}
}
