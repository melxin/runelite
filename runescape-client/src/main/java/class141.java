import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class141 implements class131 {
	@ObfuscatedName("ae")
	static File field1631;
	@ObfuscatedName("cl")
	static String field1630;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-54867755"
	)
	public static int method3391(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldn;",
		garbageValue = "401395720"
	)
	static class92[] method3392() {
		return new class92[]{class92.field1109, class92.field1105, class92.field1108, class92.field1106, class92.field1107};
	}
}
