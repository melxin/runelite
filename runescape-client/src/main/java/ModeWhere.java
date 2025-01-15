import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4684("", 0, new class403[]{class403.field4660, class403.field4658}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4680("", 1, new class403[]{class403.field4659, class403.field4660, class403.field4658}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4685("", 2, new class403[]{class403.field4659, class403.field4661, class403.field4660}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4681("", 3, new class403[]{class403.field4659}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4678("", 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4683("", 5, new class403[]{class403.field4659, class403.field4660}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4688("", 6, new class403[]{class403.field4660}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4682("", 8, new class403[]{class403.field4659, class403.field4660}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4686("", 9, new class403[]{class403.field4659, class403.field4661}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4687("", 10, new class403[]{class403.field4659}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4679("", 11, new class403[]{class403.field4659}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4689("", 12, new class403[]{class403.field4659, class403.field4660}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	field4690("", 13, new class403[]{class403.field4659});

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -398111645
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aa")
	final Set field4692;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpo;)V"
	)
	ModeWhere(String var3, int var4, class403[] var5) {
		this.field4692 = new HashSet();
		this.id = var4;
		class403[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class403 var8 = var6[var7];
			this.field4692.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4692 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
