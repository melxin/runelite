import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class438 {
	@ObfuscatedName("ab")
	public char field4825;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -284920139
	)
	public int field4824;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1757550375
	)
	public int field4826;

	class438() {
		this.field4824 = 0;
		this.field4826 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1209944427"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;Ljava/lang/String;B)[Lvy;",
		garbageValue = "-6"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class278.method5770(var0, var3, var4);
		}
	}
}
