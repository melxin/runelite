import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class290 implements WorldMapSection {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 955485295
	)
	int field3239;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1110007873
	)
	int field3235;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 381258643
	)
	int field3243;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -572693509
	)
	int field3236;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -990644791
	)
	int field3238;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1636123673
	)
	int field3237;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1748152763
	)
	int field3240;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1103385191
	)
	int field3241;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1908524915
	)
	int field3242;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 881307469
	)
	int field3234;

	class290() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lli;B)V",
		garbageValue = "121"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3238) {
			var1.regionLowX = this.field3238;
		}

		if (var1.regionHighX < this.field3238) {
			var1.regionHighX = this.field3238;
		}

		if (var1.regionLowY > this.field3237) {
			var1.regionLowY = this.field3237;
		}

		if (var1.regionHighY < this.field3237) {
			var1.regionHighY = this.field3237;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3239 && var1 < this.field3235 + this.field3239) {
			return var2 >= (this.field3243 << 6) + (this.field3240 << 3) && var2 <= (this.field3243 << 6) + (this.field3240 << 3) + 7 && var3 >= (this.field3236 << 6) + (this.field3241 << 3) && var3 <= (this.field3236 << 6) + (this.field3241 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1479617515"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3238 << 6) + (this.field3242 << 3) && var1 <= (this.field3238 << 6) + (this.field3242 << 3) + 7 && var2 >= (this.field3237 << 6) + (this.field3234 << 3) && var2 <= (this.field3237 << 6) + (this.field3234 << 3) + 7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1854006794"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3238 * 64 - this.field3243 * 64 + var2 + (this.field3242 * 8 - this.field3240 * 8), var3 + (this.field3237 * 64 - this.field3236 * 64) + (this.field3234 * 8 - this.field3241 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Lnt;",
		garbageValue = "1321767121"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3243 * 64 - this.field3238 * 64 + (this.field3240 * 8 - this.field3242 * 8) + var1;
			int var4 = this.field3236 * 64 - this.field3237 * 64 + var2 + (this.field3241 * 8 - this.field3234 * 8);
			return new Coord(this.field3239, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "1096753286"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3239 = var1.readUnsignedByte();
		this.field3235 = var1.readUnsignedByte();
		this.field3243 = var1.readUnsignedShort();
		this.field3240 = var1.readUnsignedByte();
		this.field3236 = var1.readUnsignedShort();
		this.field3241 = var1.readUnsignedByte();
		this.field3238 = var1.readUnsignedShort();
		this.field3242 = var1.readUnsignedByte();
		this.field3237 = var1.readUnsignedShort();
		this.field3234 = var1.readUnsignedByte();
		this.method6227();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6227() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1164068852"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = EnumComposition.method5160(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class493.RunException_revision + "&cs=" + RunException.field5761 + "&u=" + RunException.field5759 + "&v1=" + TaskHandler.javaVendor + "&v2=" + class447.javaVersion + "&ct=" + RunException.field5762 + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}
}
