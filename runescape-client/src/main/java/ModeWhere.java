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
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4858("", 0, new class419[]{class419.field4831, class419.field4828}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4861("", 1, new class419[]{class419.field4832, class419.field4831, class419.field4828}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4848("", 2, new class419[]{class419.field4832, class419.field4829, class419.field4831}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4849("", 3, new class419[]{class419.field4832}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4850("", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4856("", 5, new class419[]{class419.field4832, class419.field4831}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4852("", 6, new class419[]{class419.field4831}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4853("", 8, new class419[]{class419.field4832, class419.field4831}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4846("", 9, new class419[]{class419.field4832, class419.field4829}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4855("", 10, new class419[]{class419.field4832}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4863("", 11, new class419[]{class419.field4832}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4851("", 12, new class419[]{class419.field4832, class419.field4831}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	field4847("", 13, new class419[]{class419.field4832});

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1151786059
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aj")
	final Set field4857;

	static {
		method8024();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqj;)V"
	)
	ModeWhere(String var3, int var4, class419[] var5) {
		this.field4857 = new HashSet();
		this.id = var4;
		class419[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class419 var8 = var6[var7];
			this.field4857.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4857 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqp;",
		garbageValue = "-1662651033"
	)
	static ModeWhere[] method8024() {
		return new ModeWhere[]{field4856, field4849, field4863, field4852, field4853, field4847, field4858, field4848, field4846, field4855, field4850, field4851, field4861};
	}
}
