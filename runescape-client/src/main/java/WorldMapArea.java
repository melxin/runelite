import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2020064807
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("at")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 542629785
	)
	int field3121;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2040553571
	)
	int field3119;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -141191163
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1371315677
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -640463959
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 47934993
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1932457463
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ai")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("al")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field3121 = -1;
		this.field3119 = -16777216;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "123"
	)
	public void method5839(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.field3121 = var1.readInt();
		this.field3119 = var1.readInt();
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Llj;",
		garbageValue = "1928399822"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)ScriptEvent.findEnumerated(WorldMapSectionType.method6193(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new WorldMapSection1();
			break;
		case 1:
			var4 = new class288();
			break;
		case 2:
			var4 = new WorldMapSection2();
			break;
		case 3:
			var4 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1);
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "47"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "3548"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "138273554"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lny;",
		garbageValue = "-252372749"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5097"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "605668919"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-386831387"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-794926442"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-64"
	)
	int method5850() {
		return this.field3121;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-13658152"
	)
	int method5851() {
		return this.field3119;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2085530860"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1993858964"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-831048222"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1831324336"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2130945994"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "123"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-601044825"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "22"
	)
	public static String method5908(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lcu;",
		garbageValue = "-988592586"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class142.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1932399545"
	)
	static void method5906(String var0, String var1, String var2) {
		class329.updateLoginIndex(7);
		class106.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1343281841"
	)
	static void method5907(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Projection.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class173.updateItemPile(var0, var1, var2);
		}

	}
}
