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

@ObfuscatedName("ez")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2081606281
	)
	static int field1461;
	@ObfuscatedName("ay")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ah")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("az")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -731538215
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1821014649"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "-1"
	)
	int method3272(URLConnection var1) {
		int var2 = UrlRequest.field1474;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "22"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Len;I)V",
		garbageValue = "1573162555"
	)
	void method3289(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = PacketWriter.method3251(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				WorldMapArea.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1476 = this.method3272(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Len;",
		garbageValue = "-108"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-184934019"
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
				class255.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "-1781265223"
	)
	public static void method3282(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-94"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = ClanChannel.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1081 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				Friend.runScriptEvent(var8);
			}

			boolean var10 = true;
			if (var7.contentType > 0) {
				var10 = FriendsList.method9092(var7);
			}

			if (var10) {
				if (class250.method5357(class232.getWidgetFlags(var7), var6 - 1)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 2) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 3) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 4) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 5) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 6) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 7) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 8) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 9) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var0 == 10) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}

					if (var5 != 0) {
						var9 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						var9.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var9);
					}

				}
			}
		}
	}
}
