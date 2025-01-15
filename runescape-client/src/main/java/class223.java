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

@ObfuscatedName("ic")
public class class223 {
	@ObfuscatedName("ah")
	String field2437;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 632143365
	)
	int field2438;
	@ObfuscatedName("ao")
	ArrayList field2440;
	@ObfuscatedName("ad")
	ArrayList field2444;
	@ObfuscatedName("an")
	ArrayList field2442;
	@ObfuscatedName("ae")
	String field2443;
	@ObfuscatedName("ax")
	float[] field2439;
	@ObfuscatedName("at")
	Map field2441;
	@ObfuscatedName("ac")
	Map field2446;

	class223() {
		this.field2438 = 0;
		this.field2440 = new ArrayList();
		this.field2444 = new ArrayList();
		this.field2442 = new ArrayList();
		this.field2443 = null;
		this.field2439 = new float[4];
		this.field2441 = new HashMap();
		this.field2446 = new HashMap();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2061482577"
	)
	String method5006() {
		return this.field2437;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "382594970"
	)
	int method5016() {
		return this.field2438;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-785708555"
	)
	void method5009() {
		this.field2443 = null;
		this.field2439[0] = 0.0F;
		this.field2439[1] = 0.0F;
		this.field2439[2] = 1.0F;
		this.field2439[3] = 1.0F;
		this.field2440.clear();
		this.field2444.clear();
		this.field2442.clear();
		this.field2441.clear();
		this.field2446.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILez;B)Z",
		garbageValue = "-10"
	)
	boolean method5007(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method5009();
				return false;
			}

			try {
				this.method5011(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2444.clear();
			}

			try {
				this.method5013(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2442.clear();
			}
		} else {
			try {
				this.method5012(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2444.clear();
			}

			try {
				this.method5014(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2442.clear();
			}
		}

		try {
			this.method5015(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2443 = null;
			this.field2439[0] = 0.0F;
			this.field2439[1] = 0.0F;
			this.field2439[2] = 1.0F;
			this.field2439[3] = 1.0F;
			this.field2440.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method5024(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2441.clear();
			this.field2446.clear();
		}

		if (var2 == 2) {
			try {
				this.field2437 = var4.getString("id");
				this.field2438 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lez;I)V",
		garbageValue = "2088947389"
	)
	void method5011(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class213 var5 = new class213(this);
					var5.field2373 = var2.request(new URL(var4.getString("src")));
					var5.field2372 = Decimator.method1176(var4, "placement");
					this.field2444.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lez;B)V",
		garbageValue = "25"
	)
	void method5012(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class213 var3 = new class213(this);
			var3.field2373 = var2.request(new URL(var1.getString("src")));
			var3.field2372 = Decimator.method1176(var1, "placement");
			this.field2444.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "4"
	)
	void method5013(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class224 var4 = new class224(this);
				var4.field2450 = var3.getString("text");
				var4.field2451 = class153.method3617(var3.getString("align_x"));
				var4.field2453 = class153.method3617(var3.getString("align_y"));
				var4.field2454 = var3.getInt("font");
				var4.field2447 = Decimator.method1176(var3, "placement");
				this.field2442.add(var4);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "20564214"
	)
	void method5014(JSONObject var1) throws JSONException {
		class224 var2 = new class224(this);
		var2.field2450 = var1.optString("text");
		var2.field2451 = class153.method3617(var1.optString("align_x"));
		var2.field2453 = class153.method3617(var1.optString("align_y"));
		var2.field2454 = var1.optInt("font");
		var2.field2447 = Decimator.method1176(var1, "placement");
		this.field2442.add(var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1908279385"
	)
	void method5015(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2439 = Decimator.method1176(var1, "clickbounds");
			this.field2443 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2440.add(new class211(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2440.add(new class211(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2440.add(new class211(this, var2[var3], 0));
							} else {
								this.field2440.add(new class220(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "93"
	)
	void method5024(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2441.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2441.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2441.put(var2[var3], 0);
					} else {
						this.field2446.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFB)F",
		garbageValue = "36"
	)
	public static float method5043(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var1 - var7) * (var4 - var3) + (var6 - var7) * (var0 - var4)) / var11;
		float var13 = (float)((var1 - var7) * (var2 - var4) + (var7 - var5) * (var0 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var14 * var10 + var9 * var13 + var8 * var12;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqh;S)Lqh;",
		garbageValue = "301"
	)
	public static final class426 method5044(class426 var0, class426 var1) {
		class426 var2;
		synchronized(class426.field4746) {
			if (class426.field4742 == 0) {
				var2 = new class426(var0);
			} else {
				class426.field4746[--class426.field4742].method8316(var0);
				var2 = class426.field4746[class426.field4742];
			}
		}

		var2.method8291(var1);
		return var2;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lvv;I)V",
		garbageValue = "2135107044"
	)
	static final void method5008(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < var0.npcCount) {
			for (var3 = var2; var3 < var0.npcCount; ++var3) {
				Client.field537[++Client.field635 - 1] = var0.npcIndices[var3];
			}
		}

		if (var2 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			for (var3 = 0; var3 < var2; ++var3) {
				int var4 = var0.npcIndices[var3];
				NPC var5 = var0.npcs[var4];
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var4;
					var5.npcCycle = Client.cycle;
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							var8 = var1.readBits(3);
							var5.method3012(var8, MoveSpeed.field3045);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method3012(var8, MoveSpeed.field3046);
								var9 = var1.readBits(3);
								var5.method3012(var9, MoveSpeed.field3046);
							} else {
								var8 = var1.readBits(3);
								var5.method3012(var8, MoveSpeed.field3044);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field537[++Client.field635 - 1] = var4;
						}
					}
				}
			}

		}
	}
}
