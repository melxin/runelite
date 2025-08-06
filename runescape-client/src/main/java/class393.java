import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public enum class393 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4711(0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4708(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4709(2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4710(3);

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1686817903
	)
	public final int field4707;

	class393(int var3) {
		this.field4707 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4707;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrm;Lrm;B)Lrm;",
		garbageValue = "-49"
	)
	public static final class448 method8230(class448 var0, class448 var1) {
		class448 var2 = class85.method2788(var0);
		var2.method9058(var1);
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "103"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class195.method4372(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)I",
		garbageValue = "-1806669307"
	)
	static int method8231(Widget var0) {
		if (var0.type != 11) {
			--SecureRandomFuture.Interpreter_objectStackSize;
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var0.method7918(var1);
			return 1;
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static final void method8228(int var0, int var1, int var2, int var3) {
		Client.field432 = 0;
		int var4 = (class27.localPlayer.x >> 7) + class7.topLevelWorldView.baseX;
		int var5 = (class27.localPlayer.y >> 7) + class7.topLevelWorldView.baseY;
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field432 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field432 = 1;
		}

		if (Client.field432 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field432 = 0;
		}

	}
}
