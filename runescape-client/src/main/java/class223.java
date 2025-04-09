import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class223 {
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	static class550 field2517;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("af")
	public String field2510;
	@ObfuscatedName("as")
	public float[] field2519;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1924129009
	)
	public int field2512;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 464552071
	)
	public int field2509;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -501230375
	)
	public int field2514;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	final class222 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lig;)V"
	)
	class223(class222 var1) {
		this.this$0 = var1;
		this.field2519 = new float[4];
		this.field2512 = 1;
		this.field2509 = 1;
		this.field2514 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;III)[Lws;",
		garbageValue = "2092269794"
	)
	public static IndexedSprite[] method4935(AbstractArchive var0, int var1, int var2) {
		return !class362.method7335(var0, var1, var2) ? null : PlayerType.method7579();
	}
}
