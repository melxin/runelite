import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sd")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ah")
	static final Object field5049;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 237801707
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -856372841
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1408306677
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 222488991
	)
	static int field5046;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 591135077
	)
	static int field5053;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1466734031
	)
	static int field5054;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 365834727
	)
	static int field5055;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1992145521
	)
	static int field5056;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("aj")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("av")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ar")
	static byte[][] field5061;
	@ObfuscatedName("aq")
	public static ArrayList field5052;

	static {
		field5049 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field5046 = 0;
		field5053 = 1000;
		field5054 = 250;
		field5055 = 100;
		field5056 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field5061 = new byte[50][];
		field5052 = new ArrayList();
		field5052.clear();
		field5052.add(100);
		field5052.add(5000);
		field5052.add(10000);
		field5052.add(30000);
		new HashMap();
	}
}
