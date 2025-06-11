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

@ObfuscatedName("sx")
@Implements("HttpHeaders")
public class HttpHeaders {
	@ObfuscatedName("ai")
	@Export("headers")
	final Map headers;
	@ObfuscatedName("al")
	@Export("acceptHeaderValues")
	final Map acceptHeaderValues;
	@ObfuscatedName("ac")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpHeaders() {
		this.headers = new HashMap();
		this.acceptHeaderValues = new HashMap();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "1913214346"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection var1) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "-40"
	)
	@Export("getHeaders")
	public Map getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1881492234"
	)
	@Export("header")
	public void header(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-176325771"
	)
	@Export("removeHeader")
	public void removeHeader(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.remove(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsn;Ljava/lang/String;B)V",
		garbageValue = "31"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader var1, String var2) {
		String var3 = String.format("%s %s", var1.getKey(), var2);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-7020"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "142155465"
	)
	@Export("bearerToken")
	public void bearerToken(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lup;I)V",
		garbageValue = "-1311761417"
	)
	@Export("contentType")
	public void contentType(HttpContentType var1) {
		this.headers.put("Content-Type", var1.getValue());
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1932829702"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lup;S)V",
		garbageValue = "-6038"
	)
	@Export("accept")
	public void accept(HttpContentType var1) {
		this.acceptWithFactor(var1, 1.0F);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lup;FS)V",
		garbageValue = "32086"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType var1, float var2) {
		this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1099128642"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class475(this));
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2141398380"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class86.sortWorlds(class547.World_worlds, 0, class547.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}
}
