import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class208 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -130506163
	)
	public int field2218;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1564917819
	)
	public int field2215;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1584666637
	)
	public int field2216;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -158409537
	)
	public int field2217;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2056787783
	)
	public int field2214;

	class208(int var1, int var2, int var3, int var4, int var5) {
		this.field2218 = 0;
		this.field2215 = 1;
		this.field2216 = 0;
		this.field2217 = 0;
		this.field2214 = 0;
		this.field2218 = var1;
		this.field2215 = var2;
		this.field2216 = var3;
		this.field2217 = var4;
		this.field2214 = var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "753881490"
	)
	static boolean method4150(int var0) {
		return (var0 & 128) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrp;Lrp;I)Lrp;",
		garbageValue = "-1986813370"
	)
	public static final class442 method4151(class442 var0, class442 var1) {
		class442 var2 = WorldMapDecoration.method6284(var0);
		var2.method8322(var1);
		return var2;
	}
}
