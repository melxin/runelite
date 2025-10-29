import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ai")
	HashSet field3539;
	@ObfuscatedName("as")
	HashSet field3537;
	@ObfuscatedName("ac")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Lxa;IZI)V",
		garbageValue = "1229241049"
	)
	void method7116(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method6621(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3539 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3539.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3537 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3537.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lxa;ZI)V",
		garbageValue = "-715824821"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419623560"
	)
	static void method7117() {
		class468.clientPreferences.method2662(Client.field330);
	}
}
