import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class139 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1685;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1682;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1684;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1683;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1687;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	static final class139 field1692;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2000306577
	)
	final int field1688;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -207817479
	)
	final int field1689;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1276918827
	)
	final int field1690;

	static {
		field1685 = new class139(0, 0, (String)null, 0);
		field1682 = new class139(1, 1, (String)null, 9);
		field1684 = new class139(2, 2, (String)null, 3);
		field1683 = new class139(3, 3, (String)null, 6);
		field1687 = new class139(4, 4, (String)null, 1);
		field1692 = new class139(5, 5, (String)null, 3);
	}

	class139(int var1, int var2, String var3, int var4) {
		this.field1688 = var1;
		this.field1689 = var2;
		this.field1690 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1689;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2063114454"
	)
	int method3707() {
		return this.field1690;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V",
		garbageValue = "1821465736"
	)
	public static void method3713(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		class150.field1767 = var1;
	}
}
