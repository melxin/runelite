import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class280 {
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 225791087
	)
	static int field3067;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1327755477"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class149.World_request == null) {
				class149.World_request = urlRequester.request(new URL(class28.field121));
			} else if (class149.World_request.isDone()) {
				byte[] var0 = class149.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class159.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class149.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class149.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIII)V",
		garbageValue = "-1976368708"
	)
	static final void method5989(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Tiles.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var9 == var3 + var1 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var2 + var4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}
}
