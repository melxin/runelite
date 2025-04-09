import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("si")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("as")
	static final Object field5056;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -754181821
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -737040499
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1841325841
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1432711337
	)
	static int field5059;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1489306665
	)
	static int field5061;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 646134101
	)
	static int field5063;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -65551583
	)
	static int field5060;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -110394135
	)
	static int field5064;
	@ObfuscatedName("au")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("aj")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("al")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ac")
	static byte[][] field5068;
	@ObfuscatedName("ai")
	static ArrayList field5069;

	static {
		field5056 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5059 = 0;
		field5061 = 1000;
		field5063 = 250;
		field5060 = 100;
		field5064 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5068 = new byte[50][];
		field5069 = new ArrayList();
		new HashMap();
		field5069.clear();
		field5069.add(100);
		field5069.add(5000);
		field5069.add(10000);
		field5069.add(30000);
	}
}
