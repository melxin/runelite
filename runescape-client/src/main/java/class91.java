import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public enum class91 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1114(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1118(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1116(2, 7),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1117(3, 8),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1122(4, 9);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1973369583
	)
	final int field1115;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1854650019
	)
	final int field1120;

	class91(int var3, int var4) {
		this.field1115 = var3;
		this.field1120 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1120;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "1415983140"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		UserComparator3.method3214(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "-995591221"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Lnz;IIII)V",
		garbageValue = "-1225373961"
	)
	static final void method2459(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7308(class376.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class142.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
