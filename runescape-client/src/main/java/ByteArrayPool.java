import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sj")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("al")
	static final Object field5107;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1650397127
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1068326063
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 296986553
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1218932761
	)
	static int field5111;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1599303199
	)
	static int field5109;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1689755879
	)
	static int field5121;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1508534143
	)
	static int field5112;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2114509807
	)
	static int field5115;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aw")
	static byte[][] field5119;
	@ObfuscatedName("ao")
	public static ArrayList field5120;

	static {
		field5107 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5111 = 0;
		field5109 = 1000;
		field5121 = 250;
		field5112 = 100;
		field5115 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5119 = new byte[50][];
		field5120 = new ArrayList();
		new HashMap();
		class329.method6845();
	}
}
