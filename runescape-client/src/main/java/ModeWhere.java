import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4839("", 0, new class419[]{class419.field4808, class419.field4809}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4844("", 1, new class419[]{class419.field4805, class419.field4808, class419.field4809}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4832("", 2, new class419[]{class419.field4805, class419.field4807, class419.field4808}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4834("", 3, new class419[]{class419.field4805}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4835("", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4836("", 5, new class419[]{class419.field4805, class419.field4808}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4837("", 6, new class419[]{class419.field4808}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4838("", 8, new class419[]{class419.field4805, class419.field4808}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4847("", 9, new class419[]{class419.field4805, class419.field4807}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4840("", 10, new class419[]{class419.field4805}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4841("", 11, new class419[]{class419.field4805}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4842("", 12, new class419[]{class419.field4805, class419.field4808}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4831("", 13, new class419[]{class419.field4805});

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	static ClanChannel field4846;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 914374273
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aj")
	final Set field4833;

	static {
		method7980();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqu;)V"
	)
	ModeWhere(String var3, int var4, class419[] var5) {
		this.field4833 = new HashSet();
		this.id = var4;
		class419[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class419 var8 = var6[var7];
			this.field4833.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4833 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "-396239743"
	)
	public static void method7985(AbstractArchive var0) {
		class593.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[Lqp;",
		garbageValue = "3"
	)
	static ModeWhere[] method7980() {
		return new ModeWhere[]{field4842, field4847, field4839, field4840, field4832, field4836, field4841, field4831, field4838, field4835, field4844, field4834, field4837};
	}
}
