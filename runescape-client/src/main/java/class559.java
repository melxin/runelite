import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vy")
final class class559 implements class558 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static AbstractArchive field5585;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -296751613
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwt;I)V",
		garbageValue = "872276318"
	)
	public void vmethod10652(Object var1, Buffer var2) {
		this.method10611((Integer)var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/Object;",
		garbageValue = "-108"
	)
	public Object vmethod10657(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lwt;I)V",
		garbageValue = "-1559092440"
	)
	void method10611(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
