import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class431 {
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1229920563
	)
	@Export("worldPort")
	static int worldPort;

	static {
		new HashMap();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "6"
	)
	static final void method8647(String var0) {
		VarbitComposition.method4512(var0 + " is already on your friend list");
	}
}
