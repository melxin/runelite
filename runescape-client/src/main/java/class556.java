import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
final class class556 implements class551 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lve;B)V",
		garbageValue = "-59"
	)
	public void vmethod10161(Object var1, Buffer var2) {
		this.method10159((String)var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Ljava/lang/Object;",
		garbageValue = "-651548546"
	)
	public Object vmethod10160(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lve;I)V",
		garbageValue = "-430151294"
	)
	void method10159(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
