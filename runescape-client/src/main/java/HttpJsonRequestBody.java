import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tx")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("ah")
	@Export("body")
	@ObfuscatedSignature(
		descriptor = "Lorg/json/JSONObject;"
	)
	JSONObject body;

	public HttpJsonRequestBody(byte[] var1) throws UnsupportedEncodingException {
		this.bodyFromBytes(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	public HttpJsonRequestBody(JSONObject var1) {
		this.body = var1;
	}

	public HttpJsonRequestBody(String var1) throws UnsupportedEncodingException {
		this.setBodyFromString(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-546778474"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "613600609"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "106"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1089631791"
	)
	@Export("setBodyFromString")
	void setBodyFromString(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.body = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.body = new JSONObject();
				this.body.setProperty("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "1844308788"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "2"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
