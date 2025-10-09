import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class88 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1268;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1257;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1258;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1262;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1260;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1256;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1259;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1263;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1264;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1265;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1266;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1267;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1271;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("field1390")
	static final class88 field1390;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1270;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static final class88 field1261;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1715866995
	)
	int field1272;

	static {
		field1268 = new class88(0);
		field1257 = new class88(1);
		field1258 = new class88(2);
		field1262 = new class88(3);
		field1260 = new class88(4);
		field1256 = new class88(5);
		field1259 = new class88(6);
		field1263 = new class88(7);
		field1264 = new class88(8);
		field1265 = new class88(9);
		field1266 = new class88(10);
		field1267 = new class88(11);
		field1271 = new class88(12);
		field1390 = new class88(13);
		field1270 = new class88(14);
		field1261 = new class88(15);
	}

	class88(int var1) {
		this.field1272 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V",
		garbageValue = "1309410288"
	)
	public static void method2983(AbstractArchive var0, AbstractArchive var1) {
		GrandExchangeOfferNameComparator.NpcDefinition_archive = var0;
		NPCComposition.field2140 = var1;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "1"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = Message.fontPlain12.lineWidth(var0, 250);
			int var6 = Message.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
			Message.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var2 + var5;
			int var10 = var2 + var6 + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
					Client.validRootWidgets[var11] = true;
				}
			}

			if (var1) {
				class409.rasterProvider.drawFull(0, 0);
			} else {
				ScriptFrame.method738(var3, var4, var5, var6);
			}

		}
	}
}
