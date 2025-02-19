import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class493 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final WorldEntityCoord field5158;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 941685501
	)
	int field5157;

	class493() {
		this.field5158 = new WorldEntityCoord();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILvi;B)Z",
		garbageValue = "1"
	)
	public static boolean method9356(int var0, class563 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}
}
