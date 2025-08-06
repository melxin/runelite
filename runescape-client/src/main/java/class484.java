import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class484 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	public static final class484 field5241;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final class484 field5242;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 702952629
	)
	final int field5243;

	static {
		field5241 = new class484(1);
		field5242 = new class484(0);
	}

	class484(int var1) {
		this.field5243 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)Lxa;",
		garbageValue = "681297179"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class522.method10495(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = BufferedNetSocket.method10250();
			}

			return var5;
		}
	}
}
