import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ak")
	HashSet field3346;
	@ObfuscatedName("aj")
	HashSet field3344;
	@ObfuscatedName("av")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lvy;IZB)V",
		garbageValue = "52"
	)
	void method6378(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method5909(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3346 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3346.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3344 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3344.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lvy;ZI)V",
		garbageValue = "-1949347260"
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
}
