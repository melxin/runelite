import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class169 extends class151 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2068949517
	)
	int field1893;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -998490199
	)
	int field1892;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class169(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1893 = var1.readInt();
		this.field1892 = var1.readInt();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4066(this.field1893, this.field1892);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;I)V",
		garbageValue = "-718309399"
	)
	public static void method4185(AbstractArchive var0, AbstractArchive var1) {
		class209.WorldMapElement_archive = var1;
		WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
		WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			byte[] var3 = var0.takeFile(35, var2);
			WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
			if (var3 != null) {
				WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
				WorldMapElement.WorldMapElement_cached[var2].method4323();
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "515068648"
	)
	public static int method4184(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1888941255"
	)
	public static int method4186(String var0) {
		return var0.length() + 2;
	}
}
