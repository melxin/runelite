import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
final class class175 implements ThreadFactory {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field1928;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)Lvi;",
		garbageValue = "-1338865856"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Skills.worldMap;
	}
}
