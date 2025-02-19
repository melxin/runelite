import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("ab")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final HttpMethod field50;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ah")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("ac")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1481354131
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Las;Lsf;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method72()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.connection;
				if (SecureRandomSSLSocketFactory.INSTANCE == null) {
					SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
				}

				SecureRandomSSLSocketFactory var6 = SecureRandomSSLSocketFactory.INSTANCE;
				var5.setSSLSocketFactory(var6);
			}

			this.field50 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Las;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "-941648855"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "0"
	)
	@Export("setPayload")
	public void setPayload(HttpPayload var1) {
		if (!this.requestInitialized) {
			if (var1 == null) {
				this.httpHeaders.removeHeader("Content-Type");
				this.httpPayload = null;
			} else {
				this.httpPayload = var1;
				if (this.httpPayload.getContentType() != null) {
					this.httpHeaders.contentType(this.httpPayload.getContentType());
				} else {
					this.httpHeaders.removeContentType();
				}

			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-173259788"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field50.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field50.method70() && this.httpPayload != null) {
				this.connection.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.httpPayload.toBytes());
					var1.writeTo(this.connection.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.connection.setConnectTimeout(this.connectionTimeout);
			this.connection.setInstanceFollowRedirects(this.followRedirects);
			this.requestInitialized = true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Laq;",
		garbageValue = "-17"
	)
	@Export("getResponse")
	HttpResponse getResponse() {
		try {
			if (!this.requestInitialized || this.connection.getResponseCode() == -1) {
				return new HttpResponse("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.connection.disconnect();
			return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
		}

		HttpResponse var3;
		try {
			HttpResponse var1 = new HttpResponse(this.connection);
			return var1;
		} catch (IOException var8) {
			var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.connection.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "761848290"
	)
	static final void method99() {
		AsyncRestClient.method146("Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	static final void method98(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : HttpMethod.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3665()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class272.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + AsyncRestClient.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
