import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("uq")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("at")
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Luw;",
		garbageValue = "48"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-807473489"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BS)V",
		garbageValue = "255"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-119"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "120767190"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IIS)[Lxl;",
		garbageValue = "4377"
	)
	public static SpritePixels[] method10636(AbstractArchive var0, int var1, int var2) {
		if (!Friend.method10009(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class604.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class604.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = class604.SpriteBuffer_spriteWidth;
				var6.height = class604.SpriteBuffer_spriteHeight;
				var6.xOffset = class604.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class604.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class604.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = ItemContainer.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subHeight * var6.subWidth;
				byte[] var8 = class604.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					int var10 = var8[var9] & 255;
					var6.pixels[var9] = class604.SpriteBuffer_spritePalette[var10];
				}
			}

			class366.method7888();
			return var4;
		}
	}
}
