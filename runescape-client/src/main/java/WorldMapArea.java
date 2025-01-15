import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1318861981
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("az")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 34779515
	)
	int field3108;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -316135669
	)
	int field3115;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -366932217
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -706980989
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1436587615
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1400082121
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1496544063
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("as")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("aq")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field3108 = -1;
		this.field3115 = -16777216;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1084362175"
	)
	public void method6033(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.field3108 = var1.readInt();
		this.field3115 = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Llb;",
		garbageValue = "64957886"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE3};
		WorldMapSectionType var4 = (WorldMapSectionType)StructComposition.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new WorldMapSection2();
			break;
		case 1:
			var5 = new WorldMapSection0();
			break;
		case 2:
			var5 = new class288();
			break;
		case 3:
			var5 = new WorldMapSection1();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2114827468"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "7"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-21"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lnz;",
		garbageValue = "255"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-533653807"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "737441105"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1003881370"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1516921793"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-95461746"
	)
	int method6044() {
		return this.field3108;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907957900"
	)
	int method6045() {
		return this.field3115;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1606431166"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1769521116"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1701617392"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "587959186"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1028869615"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lnz;",
		garbageValue = "326"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-6"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4883) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4880) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4895) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4888) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4885 < ByteArrayPool.field4891) {
				ByteArrayPool.field4892[++ByteArrayPool.field4885 - 1] = var0;
			} else {
				if (class225.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class580.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class580.ByteArrayPool_alternativeSizes[var2] && KitDefinition.ByteArrayPool_altSizeArrayCounts[var2] < class225.ByteArrayPool_arrays[var2].length) {
							class225.ByteArrayPool_arrays[var2][KitDefinition.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
