import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public class class454 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ab")
	public char field4974;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -348772593
	)
	public int field4972;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1932845171
	)
	public int field4971;

	class454() {
		this.field4972 = 0;
		this.field4971 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lqr;II)Lqr;",
		garbageValue = "-1177936005"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
