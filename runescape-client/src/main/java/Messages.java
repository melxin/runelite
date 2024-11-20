import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("ab")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1994601205
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("gr")
	static String field1445;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}
}
