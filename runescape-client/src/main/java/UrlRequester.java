import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("pi")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("af")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("aw")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("at")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1423151599
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "20500778"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "58"
	)
	int method3500(URLConnection var1) {
		int var2 = UrlRequest.field1558;
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "1572386255"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lea;I)V",
		garbageValue = "101863613"
	)
	void method3488(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class137.method3661(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				WorldMapSection1.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1557 = this.method3500(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;S)Lea;",
		garbageValue = "-5373"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9205"
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
				class508.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "353452298"
	)
	static final void method3491() {
		int[] var0 = Client.playerUpdateManager.playerIndices;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();

			for (int var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
				Player var4 = (Player)var2.players.get((long)var0[var3]);
				if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
					--var4.overheadTextCyclesRemaining;
					if (var4.overheadTextCyclesRemaining == 0) {
						var4.overheadText = null;
					}
				}
			}

			Iterator var5 = var2.npcs.iterator();

			while (var5.hasNext()) {
				NPC var6 = (NPC)var5.next();
				if (var6 != null && var6.overheadTextCyclesRemaining > 0) {
					--var6.overheadTextCyclesRemaining;
					if (var6.overheadTextCyclesRemaining == 0) {
						var6.overheadText = null;
					}
				}
			}
		}

	}
}
