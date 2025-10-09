import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ab")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1621305589
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}
}
