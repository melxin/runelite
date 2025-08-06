import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("al")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lto;Lto;I)I",
		garbageValue = "1952908541"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-803418968"
	)
	public static final synchronized long method3496() {
		long var0 = System.currentTimeMillis();
		if (var0 < class332.field3738) {
			class332.field3736 += class332.field3738 - var0;
		}

		class332.field3738 = var0;
		return class332.field3736 + var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfe;",
		garbageValue = "-2141190015"
	)
	static class145[] method3500() {
		return new class145[]{class145.field1729, class145.field1719, class145.field1718, class145.field1721, class145.field1724, class145.field1723, class145.field1720, class145.field1725, class145.field1722};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcp;",
		garbageValue = "-507016441"
	)
	static class67[] method3492() {
		return new class67[]{class67.field907, class67.field905, class67.field910, class67.field904, class67.field908, class67.field909, class67.field913};
	}
}
