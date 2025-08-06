import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("al")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ab")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ac")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 656273093
	)
	@Export("clientRevision")
	int clientRevision;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.requestThread = new Thread(this);
		this.requestThread.setPriority(1);
		this.requestThread.start();
		this.clientRevision = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)V",
		garbageValue = "2043617507"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "272061531"
	)
	int method3425(URLConnection var1) {
		int var2 = UrlRequest.field1535;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-2120062495"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Leu;B)V",
		garbageValue = "-122"
	)
	void method3429(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = SceneTilePaint.method5667(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				class470.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1536 = this.method3425(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Leu;",
		garbageValue = "301697495"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2009968182"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.requestThread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.openConnection(var1);
			} catch (Exception var7) {
				class559.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfa;",
		garbageValue = "-1028985220"
	)
	static class138[] method3446() {
		return new class138[]{class138.field1664, class138.field1663, class138.field1666, class138.field1662, class138.field1659, class138.field1661};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-972178847"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-372118387"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = class7.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var14;
		int var15;
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var12 = 0L != var6 && !Varcs.method2848(var6);
			if (var12) {
				var11 = var4;
			}

			int[] var13 = Script.sceneMinimapSprite.pixels;
			var14 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = class70.Entity_unpackID(var6);
			ObjectComposition var16 = SpriteMask.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = Bounds.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 1) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 3] = var11;
						var13[var14 + 512 + 3] = var11;
						var13[var14 + 1024 + 3] = var11;
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[var14 + 1536 + 2] = var11;
						var13[var14 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var13[var14] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
						var13[var14 + 512 + 3] = var11;
						var13[var14 + 1024 + 3] = var11;
						var13[var14 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[var14 + 1536 + 2] = var11;
						var13[var14 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class70.Entity_unpackID(var6);
			ObjectComposition var20 = SpriteMask.getObjectDefinition(var11);
			if (var20.mapSceneId != -1) {
				IndexedSprite var27 = Bounds.mapSceneSprites[var20.mapSceneId];
				if (var27 != null) {
					var14 = (var20.sizeX * 4 - var27.subWidth) / 2;
					var15 = (var20.sizeY * 4 - var27.subHeight) / 2;
					var27.drawAt(var1 * 4 + var14 + 48, var15 + (104 - var2 - var20.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				int var21 = 15658734;
				boolean var28 = 0L != var6 && !Varcs.method2848(var6);
				if (var28) {
					var21 = 15597568;
				}

				int[] var22 = Script.sceneMinimapSprite.pixels;
				int var23 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var22[var23] = var21;
					var22[var23 + 1 + 512] = var21;
					var22[var23 + 1024 + 2] = var21;
					var22[var23 + 1536 + 3] = var21;
				} else {
					var22[var23 + 1536] = var21;
					var22[var23 + 1 + 1024] = var21;
					var22[var23 + 512 + 2] = var21;
					var22[var23 + 3] = var21;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class70.Entity_unpackID(var6);
			ObjectComposition var24 = SpriteMask.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = Bounds.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var26 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var1 * 4 + var11 + 48, var26 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
