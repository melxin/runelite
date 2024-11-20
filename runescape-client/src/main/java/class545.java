import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
final class class545 implements class540 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvj;I)V",
		garbageValue = "1774358962"
	)
	public void vmethod9971(Object var1, Buffer var2) {
		this.method9970((String)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Ljava/lang/Object;",
		garbageValue = "59393473"
	)
	public Object vmethod9969(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvj;I)V",
		garbageValue = "220990662"
	)
	void method9970(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
