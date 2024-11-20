import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -703588259
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -916090713
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1810763207
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1492174717
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -662666185
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 653999619
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1173344349
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2006105319
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1067030143
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -611703967
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1119785035
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 911250173
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1652061521
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 903674161
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-1753900965"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "58"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "719649251"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-439069343"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lny;",
		garbageValue = "-17070"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2089662585"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-2062931049"
	)
	public static void method6185(AbstractArchive var0, int var1) {
		if (!class333.field3626.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class333.field3626.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3743 = false;
				var4.field3741 = false;
				var4.field3742 = false;
				var4.field3735 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3739 = 0.0F;
				var2.add(var4);
			}

			UrlRequester.method3175(var2, class333.musicPlayerStatus, class333.field3630, class333.field3622, class333.field3632, false);
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "18"
	)
	static void method6174(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Projection.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id) {
					var6.setFlag(var4);
					break;
				}
			}
		}

	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(Lwv;I)V",
		garbageValue = "-1673792766"
	)
	static final void method6160(Menu var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.menuOptionsCount - 1; ++var2) {
				if (var0.menuOpcodes[var2] < 1000 && var0.menuOpcodes[var2 + 1] > 1000) {
					String var3 = var0.menuTargets[var2];
					var0.menuTargets[var2] = var0.menuTargets[var2 + 1];
					var0.menuTargets[var2 + 1] = var3;
					String var4 = var0.menuActions[var2];
					var0.menuActions[var2] = var0.menuActions[var2 + 1];
					var0.menuActions[var2 + 1] = var4;
					Menu var5 = var0.subMenus[var2];
					var0.subMenus[var2] = var0.subMenus[var2 + 1];
					var0.subMenus[var2 + 1] = var5;
					int var6 = var0.menuOpcodes[var2];
					var0.menuOpcodes[var2] = var0.menuOpcodes[var2 + 1];
					var0.menuOpcodes[var2 + 1] = var6;
					var6 = var0.menuArguments1[var2];
					var0.menuArguments1[var2] = var0.menuArguments1[var2 + 1];
					var0.menuArguments1[var2 + 1] = var6;
					var6 = var0.menuArguments2[var2];
					var0.menuArguments2[var2] = var0.menuArguments2[var2 + 1];
					var0.menuArguments2[var2 + 1] = var6;
					var6 = var0.menuIdentifiers[var2];
					var0.menuIdentifiers[var2] = var0.menuIdentifiers[var2 + 1];
					var0.menuIdentifiers[var2 + 1] = var6;
					var6 = var0.menuItemIds[var2];
					var0.menuItemIds[var2] = var0.menuItemIds[var2 + 1];
					var0.menuItemIds[var2 + 1] = var6;
					var6 = var0.menuWorldViewIds[var2];
					var0.menuWorldViewIds[var2] = var0.menuWorldViewIds[var2 + 1];
					var0.menuWorldViewIds[var2 + 1] = var6;
					boolean var7 = var0.menuShiftClick[var2];
					var0.menuShiftClick[var2] = var0.menuShiftClick[var2 + 1];
					var0.menuShiftClick[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}
}
