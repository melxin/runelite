import java.awt.FontMetrics;
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

@ObfuscatedName("id")
public class class227 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("bt")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aw")
	String field2441;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1424994069
	)
	int field2439;
	@ObfuscatedName("ae")
	ArrayList field2442;
	@ObfuscatedName("ao")
	ArrayList field2443;
	@ObfuscatedName("ac")
	ArrayList field2444;
	@ObfuscatedName("aj")
	String field2445;
	@ObfuscatedName("av")
	float[] field2446;
	@ObfuscatedName("au")
	Map field2447;
	@ObfuscatedName("an")
	Map field2448;

	class227() {
		this.field2439 = 0;
		this.field2442 = new ArrayList();
		this.field2443 = new ArrayList();
		this.field2444 = new ArrayList();
		this.field2445 = null;
		this.field2446 = new float[4];
		this.field2447 = new HashMap();
		this.field2448 = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2125312583"
	)
	String method4522() {
		return this.field2441;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "949770490"
	)
	int method4484() {
		return this.field2439;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "961213065"
	)
	void method4485() {
		this.field2445 = null;
		this.field2446[0] = 0.0F;
		this.field2446[1] = 0.0F;
		this.field2446[2] = 1.0F;
		this.field2446[3] = 1.0F;
		this.field2442.clear();
		this.field2443.clear();
		this.field2444.clear();
		this.field2447.clear();
		this.field2448.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
		garbageValue = "1352548712"
	)
	boolean method4486(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4485();
				return false;
			}

			try {
				this.method4487(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2443.clear();
			}

			try {
				this.method4488(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2444.clear();
			}
		} else {
			try {
				this.method4507(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2443.clear();
			}

			try {
				this.method4496(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2444.clear();
			}
		}

		try {
			this.method4490(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2445 = null;
			this.field2446[0] = 0.0F;
			this.field2446[1] = 0.0F;
			this.field2446[2] = 1.0F;
			this.field2446[3] = 1.0F;
			this.field2442.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4491(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2447.clear();
			this.field2448.clear();
		}

		if (var2 == 2) {
			try {
				this.field2441 = var4.getString("id");
				this.field2439 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "71151614"
	)
	void method4487(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class217 var5 = new class217(this);
					var5.field2361 = var2.request(new URL(var4.getString("src")));
					var5.field2362 = ScriptFrame.method1169(var4, "placement");
					this.field2443.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lel;B)V",
		garbageValue = "57"
	)
	void method4507(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class217 var3 = new class217(this);
			var3.field2361 = var2.request(new URL(var1.getString("src")));
			var3.field2362 = ScriptFrame.method1169(var1, "placement");
			this.field2443.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "76"
	)
	void method4488(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class228 var4 = new class228(this);
				var4.field2455 = var3.getString("text");
				var4.field2452 = class416.method7986(var3.getString("align_x"));
				var4.field2457 = class416.method7986(var3.getString("align_y"));
				var4.field2458 = var3.getInt("font");
				var4.field2461 = ScriptFrame.method1169(var3, "placement");
				this.field2444.add(var4);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "1"
	)
	void method4496(JSONObject var1) throws JSONException {
		class228 var2 = new class228(this);
		var2.field2455 = var1.optString("text");
		var2.field2452 = class416.method7986(var1.optString("align_x"));
		var2.field2457 = class416.method7986(var1.optString("align_y"));
		var2.field2458 = var1.optInt("font");
		var2.field2461 = ScriptFrame.method1169(var1, "placement");
		this.field2444.add(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "2"
	)
	void method4490(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2446 = ScriptFrame.method1169(var1, "clickbounds");
			this.field2445 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2442.add(new class215(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2442.add(new class215(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2442.add(new class215(this, var2[var3], 0));
							} else {
								this.field2442.add(new class224(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "66"
	)
	void method4491(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2447.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2447.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2447.put(var2[var3], 0);
					} else {
						this.field2448.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)[I",
		garbageValue = "1128242618"
	)
	static int[] method4499(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class53.method1066(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class53.method1066(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class53.method1066(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class53.method1066(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "94"
	)
	public static void method4524(class339 var0) {
		if (!class333.field3628.contains(var0)) {
			class333.field3628.add(var0);
		}

	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1428001244"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
