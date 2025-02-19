import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class132 {
	@ObfuscatedName("ad")
	public static final float field1572;
	@ObfuscatedName("ah")
	public static final float field1573;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1104233675
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("gb")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	static {
		field1572 = Math.ulp(1.0F);
		field1573 = field1572 * 2.0F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1823150489"
	)
	public static void method3286() {
		DbTableType.DBTableType_cache.clear();
	}
}
