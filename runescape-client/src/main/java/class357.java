import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class357 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public class359 field3801;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	class353 field3800;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	class27 field3799;
	@ObfuscatedName("ao")
	public Object[] field3802;
	@ObfuscatedName("ad")
	public Object[] field3803;
	@ObfuscatedName("an")
	public Object[] field3804;
	@ObfuscatedName("ae")
	public Object[] field3805;

	class357() {
		this.field3801 = new class359();
		this.field3800 = new class353();
		this.field3799 = new class27();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1716627366"
	)
	public static int method7049(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
