import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class227 {
	@ObfuscatedName("wy")
	static List field2490;
	@ObfuscatedName("ay")
	String field2482;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -251584285
	)
	int field2480;
	@ObfuscatedName("ad")
	ArrayList field2487;
	@ObfuscatedName("ah")
	ArrayList field2479;
	@ObfuscatedName("ac")
	ArrayList field2478;
	@ObfuscatedName("ao")
	String field2484;
	@ObfuscatedName("af")
	float[] field2485;
	@ObfuscatedName("aa")
	Map field2486;
	@ObfuscatedName("as")
	Map field2483;

	class227() {
		this.field2480 = 0;
		this.field2487 = new ArrayList();
		this.field2479 = new ArrayList();
		this.field2478 = new ArrayList();
		this.field2484 = null;
		this.field2485 = new float[4];
		this.field2486 = new HashMap();
		this.field2483 = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-91"
	)
	String method4553() {
		return this.field2482;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1322484488"
	)
	int method4574() {
		return this.field2480;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	void method4555() {
		this.field2484 = null;
		this.field2485[0] = 0.0F;
		this.field2485[1] = 0.0F;
		this.field2485[2] = 1.0F;
		this.field2485[3] = 1.0F;
		this.field2487.clear();
		this.field2479.clear();
		this.field2478.clear();
		this.field2486.clear();
		this.field2483.clear();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILec;I)Z",
		garbageValue = "2099102672"
	)
	boolean method4556(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4555();
				return false;
			}

			try {
				this.method4557(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2479.clear();
			}

			try {
				this.method4569(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2478.clear();
			}
		} else {
			try {
				this.method4558(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2479.clear();
			}

			try {
				this.method4585(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2478.clear();
			}
		}

		try {
			this.method4561(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2484 = null;
			this.field2485[0] = 0.0F;
			this.field2485[1] = 0.0F;
			this.field2485[2] = 1.0F;
			this.field2485[3] = 1.0F;
			this.field2487.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4562(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2486.clear();
			this.field2483.clear();
		}

		if (var2 == 2) {
			try {
				this.field2482 = var4.getString("id");
				this.field2480 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lec;B)V",
		garbageValue = "94"
	)
	void method4557(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class217 var5 = new class217(this);
					var5.field2414 = var2.request(new URL(var4.getString("src")));
					var5.field2415 = HttpMethod.method62(var4, "placement");
					this.field2479.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lec;I)V",
		garbageValue = "949081412"
	)
	void method4558(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class217 var3 = new class217(this);
			var3.field2414 = var2.request(new URL(var1.getString("src")));
			var3.field2415 = HttpMethod.method62(var1, "placement");
			this.field2479.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "891932584"
	)
	void method4569(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class228 var4 = new class228(this);
				var4.field2494 = var3.getString("text");
				var4.field2496 = UserComparator5.method3202(var3.getString("align_x"));
				var4.field2497 = UserComparator5.method3202(var3.getString("align_y"));
				var4.field2498 = var3.getInt("font");
				var4.field2495 = HttpMethod.method62(var3, "placement");
				this.field2478.add(var4);
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "0"
	)
	void method4585(JSONObject var1) throws JSONException {
		class228 var2 = new class228(this);
		var2.field2494 = var1.optString("text");
		var2.field2496 = UserComparator5.method3202(var1.optString("align_x"));
		var2.field2497 = UserComparator5.method3202(var1.optString("align_y"));
		var2.field2498 = var1.optInt("font");
		var2.field2495 = HttpMethod.method62(var1, "placement");
		this.field2478.add(var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-76"
	)
	void method4561(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2485 = HttpMethod.method62(var1, "clickbounds");
			this.field2484 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2487.add(new class215(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2487.add(new class215(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2487.add(new class215(this, var2[var3], 0));
							} else {
								this.field2487.add(new class224(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1732558071"
	)
	void method4562(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2486.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2486.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2486.put(var2[var3], 0);
					} else {
						this.field2483.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}
}
