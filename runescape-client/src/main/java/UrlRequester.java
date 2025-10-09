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

@ObfuscatedName("eu")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ab")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("at")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ag")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -327261475
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-2003495708"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "62"
	)
	int method3566(URLConnection var1) {
		int var2 = UrlRequest.field1554;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "613793787"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lez;I)V",
		garbageValue = "16711935"
	)
	void method3556(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = GrandExchangeOffer.ByteArrayPool_getArrayBool(5000, false);
				byte[] var7 = var6;

				for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
					byte[] var9 = new byte[var4.length + var8];
					System.arraycopy(var4, 0, var9, 0, var4.length);
					System.arraycopy(var7, 0, var9, var4.length, var8);
					var4 = var9;
				}

				WorldMapID.ByteArrayPool_release(var7);
			}

			var2.response0 = var4;
		} catch (IOException var15) {
			var2.response0 = null;
		} finally {
			var2.field1559 = this.method3566(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lez;",
		garbageValue = "-1750629389"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1060901814"
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
				ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7);
			}
		}

	}
}
