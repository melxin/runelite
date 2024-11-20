import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("HttpQueryParams")
public class HttpQueryParams implements HttpPayload {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static WorldView field5137;
	@ObfuscatedName("ab")
	@Export("queryParameters")
	final Map queryParameters;

	public HttpQueryParams(Map var1) {
		this.queryParameters = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lto;",
		garbageValue = "1892648748"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1854248554"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.encode().getBytes("UTF-8");
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "11"
	)
	@Export("encode")
	public String encode() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.queryParameters.entrySet().iterator();

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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;I)V",
		garbageValue = "-64756694"
	)
	public static void method9395(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		class36.SpotAnimationDefinition_modelArchive = var1;
	}
}
