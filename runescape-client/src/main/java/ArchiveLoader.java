import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field1065;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1986638769
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1086606507
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lpn;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397484392"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7592(var1) || this.archive.method7595(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "1949762729"
	)
	static final boolean method2415(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label70:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label70;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class177.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field583;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	static void method2416() {
		Client.field575 = true;
		if (class322.varcs != null && class322.varcs.hasUnwrittenChanges()) {
			class322.varcs.write();
		}

		ApproximateRouteStrategy.method1212();
		WorldMapRectangle.method6283();
		if (class178.mouseRecorder != null) {
			class178.mouseRecorder.isRunning = false;
		}

		class178.mouseRecorder = null;
		Client.packetWriter.close();
		if (GraphicsObject.taskHandler != null) {
			try {
				GraphicsObject.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GraphicsObject.taskHandler = null;
		class105.clear();
		class152.method3503();
		Client.worldViewManager.clear();
		class541.worldMap = null;
		class177.method3764(0, 0);
		class47.method860();
		Client.playingJingle = false;
		RouteStrategy.method5690();
		if (FloorDecoration.pcmPlayer1 != null) {
			FloorDecoration.pcmPlayer1.shutdown();
		}

		AsyncHttpResponse.field77.method7743();
		VertexNormal.method5432();
		if (Tiles.urlRequester != null) {
			Tiles.urlRequester.close();
		}

		TileItem.method5187();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class379.JagexCache_idxFiles = null;
		HttpRequestTask.method248();
		RouteStrategy.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field708 = 0;
		AsyncHttpResponse.field77 = new JagNetThread();
		Tiles.urlRequester = new SecureUrlRequester(class569.client.https, 229);

		try {
			Varps.method6860("oldschool", class154.field1752, class241.field2662.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		RouteStrategy.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GraphicsObject.taskHandler = new TaskHandler();
		class569.client.method606();
		WorldMapIcon_0.method6208(class94.field1161);
		class511.updateGameState(0);
	}
}
