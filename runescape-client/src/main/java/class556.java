import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vb")
final class class556 implements class551 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;B)V",
		garbageValue = "56"
	)
	public void vmethod10083(Object var1, Buffer var2) {
		this.method10079((String)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-1561644665"
	)
	public Object vmethod10078(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvy;I)V",
		garbageValue = "368244727"
	)
	void method10079(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;III)[Lwg;",
		garbageValue = "-1041865634"
	)
	public static SpritePixels[] method10080(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class478.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class36.method668();
	}
}
