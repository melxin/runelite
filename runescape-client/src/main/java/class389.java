import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public enum class389 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4605(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	field4601(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("TOKEN")
	TOKEN(2, 2);

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	static class515 field4604;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1330904487
	)
	final int field4603;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1995982963
	)
	final int field4600;

	class389(int var3, int var4) {
		this.field4603 = var3;
		this.field4600 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4600;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lif;",
		garbageValue = "143150502"
	)
	public static FloorOverlayDefinition method7962(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltp;III)V",
		garbageValue = "-1023999147"
	)
	public static void method7955(class509 var0, int var1, int var2) {
		class573.method10775(var0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.field5287 * 935110769 && var1 >= 0 && var2 + var1 <= var0.field5287 * 935110769) {
				if (var2 < var0.field5287 * 935110769 - var1) {
					ClanChannel.method3879(var0, var2 + var1, var0, var2, var0.field5287 * 935110769 - (var2 + var1));
				}

				var0.method9944(var0.field5287 * 935110769 - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
