import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
public class class573 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	public static final class573 field5654;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	public static final class573 field5652;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	static final class573 field5659;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	static final class573 field5653;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	static final class573 field5655;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	static final class573 field5657;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1889853591
	)
	final int field5658;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1665606373
	)
	final int field5656;

	static {
		field5654 = new class573(5, 0);
		field5652 = new class573(3, 2);
		field5659 = new class573(2, 5);
		field5653 = new class573(4, 6);
		field5655 = new class573(0, 7);
		field5657 = new class573(1, 8);
	}

	class573(int var1, int var2) {
		this.field5658 = var1;
		this.field5656 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5656;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	public boolean method10602() {
		return this == field5652;
	}
}
