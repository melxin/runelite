import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 111494813
	)
	public static int field2505;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static AbstractSocket field2508;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1927519643
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1557444195
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "830553942"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				this.method5138();
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1188566166"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2088614685"
	)
	void method5138() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-130295306"
	)
	static String method5158() {
		StringBuilder var0 = new StringBuilder();
		MoveSpeed[] var1 = MoveSpeed.field3053;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var0.append(var3.id);
			var0.append(", ");
		}

		String var4 = var0.toString();
		return var4.substring(0, var4.length() - 2);
	}
}
