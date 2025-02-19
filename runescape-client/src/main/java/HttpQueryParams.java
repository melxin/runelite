import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("HttpQueryParams")
public class HttpQueryParams implements HttpPayload {
	@ObfuscatedName("ab")
	final Map field5263;

	public HttpQueryParams(Map var1) {
		this.field5263 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "1646819902"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "31815673"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.encode().getBytes("UTF-8");
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "145784259"
	)
	@Export("encode")
	public String encode() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field5263.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}
}
