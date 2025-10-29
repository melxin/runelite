import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ae")
	static final Object field5408;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2080909031
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 410827371
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1911186123
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -125656445
	)
	static int field5403;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -758437091
	)
	static int field5404;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1845078879
	)
	static int field5405;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1481942851
	)
	static int field5401;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1191692589
	)
	static int field5407;
	@ObfuscatedName("ai")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ac")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ab")
	static byte[][] field5411;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("al")
	public static ArrayList field5413;

	static {
		field5408 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5403 = 0;
		field5404 = 1000;
		field5405 = 250;
		field5401 = 100;
		field5407 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5411 = new byte[50][];
		field5413 = new ArrayList();
		new HashMap();
		class184.method4317();
	}
}
