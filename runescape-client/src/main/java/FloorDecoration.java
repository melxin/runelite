import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -621260543
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1174008128
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 28581227
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -2688195952529453661L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2030050993
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-118"
	)
	static final void method3989(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		Interpreter.addGameMessage(30, "", var1);
	}
}
