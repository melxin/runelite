import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ig")
public class class222 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static AbstractArchive field2495;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("an")
	ArrayList field2500;
	@ObfuscatedName("ae")
	ArrayList field2496;
	@ObfuscatedName("af")
	ArrayList field2497;
	@ObfuscatedName("as")
	String field2499;
	@ObfuscatedName("aq")
	float[] field2507;
	@ObfuscatedName("av")
	Map field2508;
	@ObfuscatedName("am")
	Map field2501;
	@ObfuscatedName("aa")
	String field2502;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 6880969
	)
	int field2503;

	class222() {
		this.field2500 = new ArrayList();
		this.field2496 = new ArrayList();
		this.field2497 = new ArrayList();
		this.field2499 = null;
		this.field2507 = new float[4];
		this.field2508 = new HashMap();
		this.field2501 = new HashMap();
		this.field2503 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-25"
	)
	String method4900() {
		return this.field2502;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1840425752"
	)
	int method4886() {
		return this.field2503;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060160378"
	)
	void method4926() {
		this.field2499 = null;
		this.field2507[0] = 0.0F;
		this.field2507[1] = 0.0F;
		this.field2507[2] = 1.0F;
		this.field2507[3] = 1.0F;
		this.field2500.clear();
		this.field2496.clear();
		this.field2497.clear();
		this.field2508.clear();
		this.field2501.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILep;I)Z",
		garbageValue = "-316456260"
	)
	boolean method4901(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4926();
				return false;
			}

			try {
				this.method4919(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2496.clear();
			}

			try {
				this.method4891(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2497.clear();
			}
		} else {
			try {
				this.method4890(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2496.clear();
			}

			try {
				this.method4889(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2497.clear();
			}
		}

		try {
			this.method4893(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2499 = null;
			this.field2507[0] = 0.0F;
			this.field2507[1] = 0.0F;
			this.field2507[2] = 1.0F;
			this.field2507[3] = 1.0F;
			this.field2500.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4894(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2508.clear();
			this.field2501.clear();
		}

		if (var2 == 2) {
			try {
				this.field2502 = var4.getString("id");
				this.field2503 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lep;I)V",
		garbageValue = "-303349014"
	)
	void method4919(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class212 var5 = new class212(this);
					var5.field2418 = var2.request(new URL(var4.getString("src")));
					var5.field2419 = class139.method3384(var4, "placement");
					this.field2496.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lep;I)V",
		garbageValue = "497689986"
	)
	void method4890(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class212 var3 = new class212(this);
			var3.field2418 = var2.request(new URL(var1.getString("src")));
			var3.field2419 = class139.method3384(var1, "placement");
			this.field2496.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-1752243552"
	)
	void method4891(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class223 var4 = new class223(this);
				var4.field2510 = var3.getString("text");
				var4.field2512 = PcmPlayer.method841(var3.getString("align_x"));
				var4.field2509 = PcmPlayer.method841(var3.getString("align_y"));
				var4.field2514 = var3.getInt("font");
				var4.field2519 = class139.method3384(var3, "placement");
				this.field2497.add(var4);
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "0"
	)
	void method4889(JSONObject var1) throws JSONException {
		class223 var2 = new class223(this);
		var2.field2510 = var1.optString("text");
		var2.field2512 = PcmPlayer.method841(var1.optString("align_x"));
		var2.field2509 = PcmPlayer.method841(var1.optString("align_y"));
		var2.field2514 = var1.optInt("font");
		var2.field2519 = class139.method3384(var1, "placement");
		this.field2497.add(var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "5"
	)
	void method4893(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2507 = class139.method3384(var1, "clickbounds");
			this.field2499 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2500.add(new class210(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2500.add(new class210(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2500.add(new class210(this, var2[var3], 0));
							} else {
								this.field2500.add(new class219(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1355529070"
	)
	void method4894(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2508.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2508.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2508.put(var2[var3], 0);
					} else {
						this.field2501.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILnh;IIIII[FI)Lnh;",
		garbageValue = "-1346357189"
	)
	static Widget method4934(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * 871583011;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)(var1.width * 624892547));
		var8.rawY = (int)((float)(var1.height * 1265510039) * var7[1]);
		var8.rawWidth = (int)((float)(var1.width * 624892547) * var7[2]);
		var8.rawHeight = (int)(var7[3] * (float)(var1.height * 1265510039));
		return var8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "494294801"
	)
	public static void method4933() {
		class250.field2022.clear();
	}
}
