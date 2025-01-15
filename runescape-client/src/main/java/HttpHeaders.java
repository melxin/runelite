import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("HttpHeaders")
public class HttpHeaders {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ao")
	@Export("headers")
	final Map headers;
	@ObfuscatedName("ad")
	@Export("acceptHeaderValues")
	final Map acceptHeaderValues;
	@ObfuscatedName("an")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpHeaders() {
		this.headers = new HashMap();
		this.acceptHeaderValues = new HashMap();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "-1689943110"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection var1) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-1327601977"
	)
	@Export("getHeaders")
	public Map getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2117518336"
	)
	@Export("header")
	public void header(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-693629445"
	)
	@Export("removeHeader")
	public void removeHeader(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.remove(var1);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrt;Ljava/lang/String;I)V",
		garbageValue = "-1600766546"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader var1, String var2) {
		String var3 = String.format("%s %s", var1.getKey(), var2);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1997463583"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "688799447"
	)
	@Export("bearerToken")
	public void bearerToken(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltw;B)V",
		garbageValue = "0"
	)
	@Export("contentType")
	public void contentType(HttpContentType var1) {
		this.headers.put("Content-Type", var1.getValue());
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltw;I)V",
		garbageValue = "162620677"
	)
	@Export("accept")
	public void accept(HttpContentType var1) {
		this.acceptWithFactor(var1, 1.0F);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltw;FB)V",
		garbageValue = "58"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType var1, float var2) {
		this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "126936831"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "824234098"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class462(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((HttpContentType)var4.getKey()).getValue());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.decimalFormat.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
