import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("HttpAuthenticationHeader")
public class HttpAuthenticationHeader {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("BASIC")
	static final HttpAuthenticationHeader BASIC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("BEARER")
	static final HttpAuthenticationHeader BEARER;
	@ObfuscatedName("an")
	@Export("key")
	final String key;

	static {
		BASIC = new HttpAuthenticationHeader("Basic");
		BEARER = new HttpAuthenticationHeader("Bearer");
	}

	HttpAuthenticationHeader(String var1) {
		this.key = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2136719529"
	)
	@Export("getKey")
	String getKey() {
		return this.key;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltp;IIIII)V",
		garbageValue = "1087577696"
	)
	public static void method9363(class509 var0, int var1, int var2, int var3, int var4) {
		class563 var5 = class563.field5600;
		DelayFadeTask.method9245(var0, var5, true);
		if (var3 < 0) {
			var3 = 0;
		}

		int var6 = var3 + var4;
		if (var4 < 0 || var6 < 0 || var6 > var0.method9937()) {
			var6 = var0.method9937();
		}

		int[] var7 = var0.method9965();
		int var8 = var1;

		for (int var9 = var3; var9 < var6; ++var9) {
			var7[var9] = var8;
			var8 += var2;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldl;[BIII)V",
		garbageValue = "1859958391"
	)
	static final void method9364(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readShortSmartSub();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					class86.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2054952981"
	)
	static void method9362() {
		Client.field444 = true;
		if (class339.varcs != null && class339.varcs.hasUnwrittenChanges()) {
			class339.varcs.write();
		}

		BoundaryObject.method5840();
		class6.method40();
		if (class328.mouseRecorder != null) {
			class328.mouseRecorder.isRunning = false;
		}

		class328.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		UrlRequest.clear();
		class396.method8006();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method8404();
		class338.worldMap = null;
		HttpResponse.method306(0, 0);
		class153.method3696();
		Client.playingJingle = false;
		WorldMapArea.method6241();
		if (ClientPreferences.pcmPlayer1 != null) {
			ClientPreferences.pcmPlayer1.shutdown();
		}

		class330.field3669.method8174();
		class300.method6624();
		if (class167.urlRequester != null) {
			class167.urlRequester.close();
		}

		class172.method3903();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		JagexCache.JagexCache_idxFiles = null;
		class162.method3823();
		Varps.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field309 = 0;
		class330.field3669 = new JagNetThread();
		class167.urlRequester = new SecureUrlRequester(class36.client.https, 231);

		try {
			class201.method4294("oldschool", class399.field4678, Clock.field2520.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		Varps.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		GameEngine.taskHandler = new TaskHandler();
		class36.client.method507();
		InterfaceParent.method2108(class70.field978);
		HealthBarConfig.updateGameState(0);
	}
}
