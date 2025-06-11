import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("pb")
public enum class390 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	field4610(-1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	field4608(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	field4611(1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	field4612(2);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1888819729
	)
	final int field4607;

	class390(int var3) {
		this.field4607 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4607;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "564155374"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-210350458"
	)
	static final String method7964(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
