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

@ObfuscatedName("kt")
public class class266 {
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 864859617
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("at")
	ArrayList field3161;
	@ObfuscatedName("ag")
	ArrayList field3162;
	@ObfuscatedName("aj")
	ArrayList field3167;
	@ObfuscatedName("ah")
	String field3174;
	@ObfuscatedName("af")
	float[] field3165;
	@ObfuscatedName("ae")
	Map field3164;
	@ObfuscatedName("aq")
	Map field3173;
	@ObfuscatedName("ac")
	String field3168;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2095355023
	)
	int field3166;

	class266() {
		this.field3161 = new ArrayList();
		this.field3162 = new ArrayList();
		this.field3167 = new ArrayList();
		this.field3174 = null;
		this.field3165 = new float[4];
		this.field3164 = new HashMap();
		this.field3173 = new HashMap();
		this.field3166 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2087866826"
	)
	String method6014() {
		return this.field3168;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method6021() {
		return this.field3166;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	void method6033() {
		this.field3174 = null;
		this.field3165[0] = 0.0F;
		this.field3165[1] = 0.0F;
		this.field3165[2] = 1.0F;
		this.field3165[3] = 1.0F;
		this.field3161.clear();
		this.field3162.clear();
		this.field3167.clear();
		this.field3164.clear();
		this.field3173.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeu;I)Z",
		garbageValue = "1467057881"
	)
	boolean method6017(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method6033();
				return false;
			}

			try {
				this.method6018(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field3162.clear();
			}

			try {
				this.method6015(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field3167.clear();
			}
		} else {
			try {
				this.method6019(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field3162.clear();
			}

			try {
				this.method6020(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field3167.clear();
			}
		}

		try {
			this.method6022(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field3174 = null;
			this.field3165[0] = 0.0F;
			this.field3165[1] = 0.0F;
			this.field3165[2] = 1.0F;
			this.field3165[3] = 1.0F;
			this.field3161.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method6030(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field3164.clear();
			this.field3173.clear();
		}

		if (var2 == 2) {
			try {
				this.field3168 = var4.getString("id");
				this.field3166 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Leu;I)V",
		garbageValue = "-773195787"
	)
	void method6018(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class256 var5 = new class256(this);
					var5.field3091 = var2.request(new URL(var4.getString("src")));
					var5.field3085 = HorizontalAlignment.method4374(var4, "placement");
					this.field3162.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Leu;B)V",
		garbageValue = "0"
	)
	void method6019(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class256 var3 = new class256(this);
			var3.field3091 = var2.request(new URL(var1.getString("src")));
			var3.field3085 = HorizontalAlignment.method4374(var1, "placement");
			this.field3162.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1599103739"
	)
	void method6015(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class267 var4 = new class267(this);
				var4.field3184 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field3178 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field3181 = var9;
				var4.field3182 = var3.getInt("font");
				var4.field3179 = HorizontalAlignment.method4374(var3, "placement");
				this.field3167.add(var4);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "9"
	)
	void method6020(JSONObject var1) throws JSONException {
		class267 var2 = new class267(this);
		var2.field3184 = var1.optString("text");
		String var5 = var1.optString("align_x");
		byte var4;
		if (var5.equals("centre")) {
			var4 = 1;
		} else if (!var5.equals("bottom") && !var5.equals("right")) {
			var4 = 0;
		} else {
			var4 = 2;
		}

		var2.field3178 = var4;
		String var8 = var1.optString("align_y");
		byte var7;
		if (var8.equals("centre")) {
			var7 = 1;
		} else if (!var8.equals("bottom") && !var8.equals("right")) {
			var7 = 0;
		} else {
			var7 = 2;
		}

		var2.field3181 = var7;
		var2.field3182 = var1.optInt("font");
		var2.field3179 = HorizontalAlignment.method4374(var1, "placement");
		this.field3167.add(var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "745398851"
	)
	void method6022(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field3165 = HorizontalAlignment.method4374(var1, "clickbounds");
			this.field3174 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field3161.add(new class254(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field3161.add(new class254(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field3161.add(new class254(this, var2[var3], 0));
							} else {
								this.field3161.add(new class263(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1089007097"
	)
	void method6030(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field3164.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field3164.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field3164.put(var2[var3], 0);
					} else {
						this.field3173.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}
}
