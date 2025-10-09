import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ah")
	static final Object field5369;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -738120169
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1856904553
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -921267225
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2062895335
	)
	static int field5383;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1899880293
	)
	static int field5374;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1239909145
	)
	static int field5373;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1569550211
	)
	static int field5376;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -81958165
	)
	static int field5377;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("au")
	static byte[][] field5381;
	@ObfuscatedName("an")
	static ArrayList field5382;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static ClanSettings field5368;

	static {
		field5369 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5383 = 0;
		field5374 = 1000;
		field5373 = 250;
		field5376 = 100;
		field5377 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5381 = new byte[50][];
		field5382 = new ArrayList();
		new HashMap();
		field5382.clear();
		field5382.add(100);
		field5382.add(5000);
		field5382.add(10000);
		field5382.add(30000);
	}
}
