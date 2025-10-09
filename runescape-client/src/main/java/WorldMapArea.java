import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field3339;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1420339373
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ag")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 419652441
	)
	int field3329;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 656268217
	)
	int field3341;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 426489431
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 822660215
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1378092379
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 836128169
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1671048075
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ad")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("av")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.field3329 = -1;
		this.field3341 = -16777216;
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
		descriptor = "(Lwj;II)V",
		garbageValue = "704227641"
	)
	public void method6483(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.method11575());
		this.field3329 = var1.method11575();
		this.field3341 = var1.method11575();
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)Llg;",
		garbageValue = "-54"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0};
		WorldMapSectionType var4 = (WorldMapSectionType)ScriptFrame.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new class292();
			break;
		case 1:
			var5 = new WorldMapSection1();
			break;
		case 2:
			var5 = new WorldMapSection0();
			break;
		case 3:
			var5 = new WorldMapSection2();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "111"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "75"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "900469946"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lny;",
		garbageValue = "1"
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
		garbageValue = "-2081775138"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "967525208"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "12"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-672240155"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method6532() {
		return this.field3329;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-459246024"
	)
	int method6497() {
		return this.field3341;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1466197801"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1069480630"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "306838242"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "616024198"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1067881787"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "734572149"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1271202841"
	)
	public static void method6506() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-20655290"
	)
	public static boolean method6503() {
		boolean var0 = false;
		boolean var1 = false;
		if (!class338.field3897.isEmpty()) {
			SongTask var2 = (SongTask)class338.field3897.get(0);
			if (var2 == null) {
				class338.field3897.remove(0);
			} else if (var2.vmethod9763()) {
				if (var2.method9731()) {
					System.out.println("Error in midimanager.service: " + var2.method9729());
					var0 = true;
				} else {
					if (var2.method9745() != null) {
						class338.field3897.add(1, var2.method9745());
					}

					var1 = var2.method9732();
				}

				class338.field3897.remove(0);
			} else {
				var1 = var2.method9732();
			}
		}

		if (var0) {
			class338.field3897.clear();
			Iterator var8 = class338.midiRequests.iterator();

			while (true) {
				MidiRequest var3;
				do {
					if (!var8.hasNext()) {
						class338.midiRequests.clear();
						return var1;
					}

					var3 = (MidiRequest)var8.next();
				} while(var3 == null);

				var3.midiPcmStream.clear();
				var3.midiPcmStream.method7225();
				var3.midiPcmStream.setPcmStreamVolume(0);
				var3.midiPcmStream.field3910 = 0;
				int var4 = var3.musicTrackGroupId;
				int var5 = var3.musicTrackFileId;
				Iterator var6 = class338.field3892.iterator();

				while (var6.hasNext()) {
					class344 var7 = (class344)var6.next();
					var7.vmethod7348(var4, var5);
				}
			}
		} else {
			return var1;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2071730058"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
