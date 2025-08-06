import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ku")
public class class265 {
	@ObfuscatedName("ab")
	ArrayList field3084;
	@ObfuscatedName("ac")
	ArrayList field3085;
	@ObfuscatedName("av")
	ArrayList field3090;
	@ObfuscatedName("au")
	String field3087;
	@ObfuscatedName("as")
	float[] field3088;
	@ObfuscatedName("ah")
	Map field3083;
	@ObfuscatedName("ap")
	Map field3089;
	@ObfuscatedName("am")
	String field3091;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2000336693
	)
	int field3092;

	class265() {
		this.field3084 = new ArrayList();
		this.field3085 = new ArrayList();
		this.field3090 = new ArrayList();
		this.field3087 = null;
		this.field3088 = new float[4];
		this.field3083 = new HashMap();
		this.field3089 = new HashMap();
		this.field3092 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "40"
	)
	String method5970() {
		return this.field3091;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "623272231"
	)
	int method5971() {
		return this.field3092;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method5972() {
		this.field3087 = null;
		this.field3088[0] = 0.0F;
		this.field3088[1] = 0.0F;
		this.field3088[2] = 1.0F;
		this.field3088[3] = 1.0F;
		this.field3084.clear();
		this.field3085.clear();
		this.field3090.clear();
		this.field3083.clear();
		this.field3089.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILes;B)Z",
		garbageValue = "45"
	)
	boolean method5973(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method5972();
				return false;
			}

			try {
				this.method5974(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field3085.clear();
			}

			try {
				this.method5982(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field3090.clear();
			}
		} else {
			try {
				this.method5975(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field3085.clear();
			}

			try {
				this.method5977(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field3090.clear();
			}
		}

		try {
			this.method5978(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field3087 = null;
			this.field3088[0] = 0.0F;
			this.field3088[1] = 0.0F;
			this.field3088[2] = 1.0F;
			this.field3088[3] = 1.0F;
			this.field3084.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method5979(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field3083.clear();
			this.field3089.clear();
		}

		if (var2 == 2) {
			try {
				this.field3091 = var4.getString("id");
				this.field3092 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Les;I)V",
		garbageValue = "-1225722232"
	)
	void method5974(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class255 var5 = new class255(this);
					var5.field3018 = var2.request(new URL(var4.getString("src")));
					var5.field3019 = ClanMate.method9941(var4, "placement");
					this.field3085.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Les;I)V",
		garbageValue = "2007194752"
	)
	void method5975(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class255 var3 = new class255(this);
			var3.field3018 = var2.request(new URL(var1.getString("src")));
			var3.field3019 = ClanMate.method9941(var1, "placement");
			this.field3085.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2005576990"
	)
	void method5982(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class266 var4 = new class266(this);
				var4.field3097 = var3.getString("text");
				var4.field3095 = HttpRequestTask.method302(var3.getString("align_x"));
				var4.field3096 = HttpRequestTask.method302(var3.getString("align_y"));
				var4.field3101 = var3.getInt("font");
				var4.field3098 = ClanMate.method9941(var3, "placement");
				this.field3090.add(var4);
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-2088865141"
	)
	void method5977(JSONObject var1) throws JSONException {
		class266 var2 = new class266(this);
		var2.field3097 = var1.optString("text");
		var2.field3095 = HttpRequestTask.method302(var1.optString("align_x"));
		var2.field3096 = HttpRequestTask.method302(var1.optString("align_y"));
		var2.field3101 = var1.optInt("font");
		var2.field3098 = ClanMate.method9941(var1, "placement");
		this.field3090.add(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "686766221"
	)
	void method5978(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field3088 = ClanMate.method9941(var1, "clickbounds");
			this.field3087 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field3084.add(new class253(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field3084.add(new class253(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field3084.add(new class253(this, var2[var3], 0));
							} else {
								this.field3084.add(new class262(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1117081380"
	)
	void method5979(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field3083.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field3083.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field3083.put(var2[var3], 0);
					} else {
						this.field3089.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-17"
	)
	public static boolean method6011(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
