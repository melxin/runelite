import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
final class class545 implements class540 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvy;I)V",
		garbageValue = "-1394480464"
	)
	public void vmethod10147(Object var1, Buffer var2) {
		this.method10139((String)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Ljava/lang/Object;",
		garbageValue = "-95091658"
	)
	public Object vmethod10140(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvy;I)V",
		garbageValue = "-1668245202"
	)
	void method10139(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
