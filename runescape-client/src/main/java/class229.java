import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class229 extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1823911169
	)
	public int field2457;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 625220569
	)
	public int field2460;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1779630249
	)
	public int field2458;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public Widget field2459;

	@ObfuscatedSignature(
		descriptor = "(IIILnb;)V"
	)
	public class229(int var1, int var2, int var3, Widget var4) {
		this.field2458 = var1;
		this.field2457 = var2;
		this.field2460 = var3;
		this.field2459 = var4;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-11"
	)
	static final void method4408(class101 var0) {
		for (int var1 = 0; var1 < var0.field1344; ++var1) {
			int var2 = var0.field1345[var1];
			class103 var3 = var0.field1343[var2];
			if (var3 != null) {
				GrandExchangeOfferOwnWorldComparator.method1212(var0, var3, var3.field1359.size);
			}
		}

	}
}
