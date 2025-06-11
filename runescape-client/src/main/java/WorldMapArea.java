import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field3181;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 657134055
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("an")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1946219077
	)
	int field3175;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1311042089
	)
	int field3169;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 247026207
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 368158575
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 693973791
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 222590089
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -407700871
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ar")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ad")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field3175 = -1;
		this.field3169 = -16777216;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1971410382"
	)
	public void method6225(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.field3175 = var1.readInt();
		this.field3169 = var1.readInt();
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)Llm;",
		garbageValue = "-790153497"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)class175.findEnumerated(WorldMapSectionType.method6574(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new WorldMapSection2();
			break;
		case 1:
			var4 = new class290();
			break;
		case 2:
			var4 = new WorldMapSection0();
			break;
		case 3:
			var4 = new WorldMapSection1();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1);
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "507996719"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-86"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1804150712"
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
		descriptor = "(IIB)Lnp;",
		garbageValue = "-85"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1694597061"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "31058"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1059744868"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "268028725"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1211693481"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1023999147"
	)
	int method6237() {
		return this.field3175;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-553046087"
	)
	int method6265() {
		return this.field3169;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "193696442"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1779909907"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1788370831"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-736031892"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "109"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1231203644"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3838"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lnp;",
		garbageValue = "-12"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1813253151"
	)
	static void method6241() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2533().last(); var2 != null; var2 = (ObjectSound)var1.method2533().previous()) {
				var2.method1593();
				var2.method1555();
			}

			var1.method2533().method8404();
		}

	}
}
