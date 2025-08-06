import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wp")
public class class591 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	public static final class591 field5873;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	public static final class591 field5874;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	static final class591 field5872;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	static final class591 field5876;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	static final class591 field5871;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	static final class591 field5875;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1547889715
	)
	final int field5870;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1074596669
	)
	final int field5877;

	static {
		field5873 = new class591(4, 0);
		field5874 = new class591(3, 2);
		field5872 = new class591(2, 5);
		field5876 = new class591(5, 6);
		field5871 = new class591(0, 7);
		field5875 = new class591(1, 8);
	}

	class591(int var1, int var2) {
		this.field5870 = var1;
		this.field5877 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2065947643"
	)
	public boolean method11517() {
		return this == field5874;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5877;
	}
}
