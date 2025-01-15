import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ad")
	static final Object field4883;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1072448991
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 49520447
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 246252667
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -119502557
	)
	static int field4885;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2009584221
	)
	static int field4880;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 86893819
	)
	static int field4895;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1006502431
	)
	static int field4888;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 49303355
	)
	static int field4891;
	@ObfuscatedName("af")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("aa")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("al")
	static byte[][] field4892;
	@ObfuscatedName("ai")
	static ArrayList field4887;

	static {
		field4883 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4885 = 0;
		field4880 = 1000;
		field4895 = 250;
		field4888 = 100;
		field4891 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4892 = new byte[50][];
		field4887 = new ArrayList();
		field4887.clear();
		field4887.add(100);
		field4887.add(5000);
		field4887.add(10000);
		field4887.add(30000);
		new HashMap();
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1433067969"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		PcmPlayer.updateItemPile2(class30.worldView, var0, var1, var2);
	}
}
