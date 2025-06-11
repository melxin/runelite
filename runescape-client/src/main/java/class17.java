import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	class17(SecureRandomSSLSocket var1) {
		this.this$1 = var1;
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field55;
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}
}
