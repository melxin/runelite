import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("jz")
	static int[] field109;
	@ObfuscatedName("ab")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lql;",
		garbageValue = "-1248393266"
	)
	public static final class426 method308(int var0, int var1, int var2, int var3) {
		float var4 = 1.0E-5F;
		class426 var5 = PlayerCompositionColorTextureOverride.method3722((float)var1, (float)var2, (float)var3);
		class426 var6 = PlayerCompositionColorTextureOverride.method3722(0.0F, (float)var0, 0.0F);
		class426 var7 = PlayerCompositionColorTextureOverride.method3722(0.0F, 1.0F, 0.0F);
		class426 var9 = ViewportMouse.field2895;
		float var8 = var7.method8114(var9);
		if (Math.abs(var8) < 1.0E-5F) {
			return null;
		} else {
			class426 var11 = GameEngine.method639(var5, var6);
			float var12 = var7.method8114(var11);
			float var13 = -var12 / var8;
			if (var13 < 0.0F) {
				return null;
			} else {
				var5.method8136();
				var6.method8136();
				var7.method8136();
				var11.method8136();
				class426 var15 = class31.method438(ViewportMouse.field2895, var13);
				class426 var16 = RouteStrategy.method5650(var5);
				var16.method8108(var15);
				return var16;
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	protected static final void method310() {
		class425.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-10"
	)
	public static final void method311(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}
}
