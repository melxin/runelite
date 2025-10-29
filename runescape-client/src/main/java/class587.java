import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wf")
final class class587 implements class581 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxa;I)V",
		garbageValue = "-1722278579"
	)
	public void vmethod11455(Object var1, Buffer var2) {
		this.method11453((String)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)Ljava/lang/Object;",
		garbageValue = "-20"
	)
	public Object vmethod11459(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lxa;I)V",
		garbageValue = "124046343"
	)
	void method11453(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
