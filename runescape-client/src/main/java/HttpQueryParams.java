import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
@Implements("HttpQueryParams")
public class HttpQueryParams implements HttpPayload {
	@ObfuscatedName("ap")
	final Map field5352;

	public HttpQueryParams(Map var1) {
		this.field5352 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lup;",
		garbageValue = "329585455"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2037324047"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.encode().getBytes("UTF-8");
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "421839214"
	)
	@Export("encode")
	public String encode() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field5352.entrySet().iterator();

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
