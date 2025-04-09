import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class366 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("br")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
}
