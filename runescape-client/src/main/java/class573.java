import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wl")
final class class573 implements class567 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-1304869252"
	)
	public void vmethod11207(Object var1, Buffer var2) {
		this.method11204((String)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "2047"
	)
	public Object vmethod11209(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lwj;S)V",
		garbageValue = "7166"
	)
	void method11204(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
