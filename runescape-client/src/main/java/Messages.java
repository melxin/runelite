import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("af")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1463291147
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("pj")
	static int[] field1281;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}
}
