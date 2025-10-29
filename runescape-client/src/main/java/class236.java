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

@ObfuscatedName("jk")
public class class236 {
	@ObfuscatedName("at")
	ArrayList field2641;
	@ObfuscatedName("ag")
	ArrayList field2642;
	@ObfuscatedName("an")
	ArrayList field2648;
	@ObfuscatedName("ae")
	String field2644;
	@ObfuscatedName("aj")
	float[] field2645;
	@ObfuscatedName("ak")
	Map field2646;
	@ObfuscatedName("aw")
	Map field2647;
	@ObfuscatedName("ap")
	String field2640;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 666181425
	)
	int field2643;

	class236() {
		this.field2641 = new ArrayList();
		this.field2642 = new ArrayList();
		this.field2648 = new ArrayList();
		this.field2644 = null;
		this.field2645 = new float[4];
		this.field2646 = new HashMap();
		this.field2647 = new HashMap();
		this.field2643 = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2111887724"
	)
	String method5166() {
		return this.field2640;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	int method5167() {
		return this.field2643;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method5168() {
		this.field2644 = null;
		this.field2645[0] = 0.0F;
		this.field2645[1] = 0.0F;
		this.field2645[2] = 1.0F;
		this.field2645[3] = 1.0F;
		this.field2641.clear();
		this.field2642.clear();
		this.field2648.clear();
		this.field2646.clear();
		this.field2647.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILei;B)Z",
		garbageValue = "-62"
	)
	boolean method5186(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method5168();
				return false;
			}

			try {
				this.method5210(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2642.clear();
			}

			try {
				this.method5172(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2648.clear();
			}
		} else {
			try {
				this.method5180(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2642.clear();
			}

			try {
				this.method5173(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2648.clear();
			}
		}

		try {
			this.method5174(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2644 = null;
			this.field2645[0] = 0.0F;
			this.field2645[1] = 0.0F;
			this.field2645[2] = 1.0F;
			this.field2645[3] = 1.0F;
			this.field2641.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method5175(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2646.clear();
			this.field2647.clear();
		}

		if (var2 == 2) {
			try {
				this.field2640 = var4.getString("id");
				this.field2643 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lei;I)V",
		garbageValue = "-97247135"
	)
	void method5210(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class226 var5 = new class226(this);
					var5.field2559 = var2.request(new URL(var4.getString("src")));
					var5.field2557 = MouseHandler.method703(var4, "placement");
					this.field2642.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lei;B)V",
		garbageValue = "21"
	)
	void method5180(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class226 var3 = new class226(this);
			var3.field2559 = var2.request(new URL(var1.getString("src")));
			var3.field2557 = MouseHandler.method703(var1, "placement");
			this.field2642.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "482080231"
	)
	void method5172(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class237 var4 = new class237(this);
				var4.field2652 = var3.getString("text");
				var4.field2654 = AbstractArchive.method8677(var3.getString("align_x"));
				var4.field2656 = AbstractArchive.method8677(var3.getString("align_y"));
				var4.field2657 = var3.getInt("font");
				var4.field2651 = MouseHandler.method703(var3, "placement");
				this.field2648.add(var4);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1985429154"
	)
	void method5173(JSONObject var1) throws JSONException {
		class237 var2 = new class237(this);
		var2.field2652 = var1.optString("text");
		var2.field2654 = AbstractArchive.method8677(var1.optString("align_x"));
		var2.field2656 = AbstractArchive.method8677(var1.optString("align_y"));
		var2.field2657 = var1.optInt("font");
		var2.field2651 = MouseHandler.method703(var1, "placement");
		this.field2648.add(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "21"
	)
	void method5174(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2645 = MouseHandler.method703(var1, "clickbounds");
			this.field2644 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2641.add(new class224(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2641.add(new class224(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2641.add(new class224(this, var2[var3], 0));
							} else {
								this.field2641.add(new class233(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-35"
	)
	void method5175(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2646.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2646.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2646.put(var2[var3], 0);
					} else {
						this.field2647.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "36"
	)
	public static int method5199(int var0) {
		return var0 >>> 4 & class592.field5963;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIZIII)J",
		garbageValue = "-1329739818"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1998174652"
	)
	static final int method5170(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Projection.method5894(var3, var5);
		int var8 = Projection.method5894(var3 + 1, var5);
		int var9 = Projection.method5894(var3, var5 + 1);
		int var10 = Projection.method5894(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
		return var15;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lut;II)I",
		garbageValue = "-965381295"
	)
	public static int method5212(DynamicArray var0, int var1) {
		ProjectionCoord.method9359(var0, class586.field5937);
		if (var1 >= 0) {
			int[] var2 = var0.method10650();
			int var3 = var0.method10652();

			for (int var4 = 0; var4 < var3; ++var4) {
				if (var1 < var2[var4]) {
					return var4;
				}

				var1 -= var2[var4];
			}
		}

		return -1;
	}
}
