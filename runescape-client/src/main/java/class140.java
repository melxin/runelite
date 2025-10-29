import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class140 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1678;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1673;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1674;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1672;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1675;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class140 field1676;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -997953055
	)
	final int field1677;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1796020541
	)
	final int field1679;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1142185869
	)
	final int field1671;

	static {
		field1678 = new class140(0, 0, (String)null, 0);
		field1673 = new class140(1, 1, (String)null, 9);
		field1674 = new class140(2, 2, (String)null, 3);
		field1672 = new class140(3, 3, (String)null, 6);
		field1675 = new class140(4, 4, (String)null, 1);
		field1676 = new class140(5, 5, (String)null, 3);
	}

	class140(int var1, int var2, String var3, int var4) {
		this.field1677 = var1;
		this.field1679 = var2;
		this.field1671 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1679;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	int method3864() {
		return this.field1671;
	}
}
