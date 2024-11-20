import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ao")
	static final Object field4897;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1743000459
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1970175465
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -68216371
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1842818021
	)
	static int field4910;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -484580477
	)
	static int field4895;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -311290167
	)
	static int field4907;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1534603573
	)
	static int field4908;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1564218121
	)
	static int field4905;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ak")
	static byte[][] field4909;
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ay")
	public static ArrayList field4911;

	static {
		field4897 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4910 = 0;
		field4895 = 1000;
		field4907 = 250;
		field4908 = 100;
		field4905 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4909 = new byte[50][];
		field4911 = new ArrayList();
		field4911.clear();
		field4911.add(100);
		field4911.add(5000);
		field4911.add(10000);
		field4911.add(30000);
		new HashMap();
	}
}
