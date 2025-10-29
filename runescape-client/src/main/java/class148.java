import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class148 extends class151 {
	@ObfuscatedName("af")
	static int[][][] field1747;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1695010775
	)
	static int field1744;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("on")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -220039851
	)
	int field1748;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1566755721
	)
	int field1742;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1294523919
	)
	int field1743;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -149476597
	)
	int field1745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class148(class154 var1) {
		this.this$0 = var1;
		this.field1748 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1748 = var1.readUnsignedShort();
		this.field1742 = var1.readInt();
		this.field1743 = var1.readUnsignedByte();
		this.field1745 = var1.readUnsignedByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4065(this.field1748, this.field1742, this.field1743, this.field1745);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "65"
	)
	static void method3945(Buffer var0) {
		while (true) {
			int var1 = var0.readUnsignedShort();
			if (var1 != 0) {
				if (var1 != 1) {
					if (var1 <= 49) {
						var0.readShort();
					}
					continue;
				}

				var0.readUnsignedByte();
			}

			return;
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-423241027"
	)
	static void method3950(String var0, int var1) {
		class167.method4167(0, 0);
		ArrayList var2 = new ArrayList();
		var2.add(new MidiRequest(GrandExchangeOfferOwnWorldComparator.field248, var0, "", var1, false));
		class113.method3574(var2, 0, 0, 0, 100, false);
	}
}
