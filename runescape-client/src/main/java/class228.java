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

@ObfuscatedName("io")
public class class228 {
	@ObfuscatedName("pe")
	static int[] field2491;
	@ObfuscatedName("aj")
	ArrayList field2490;
	@ObfuscatedName("an")
	ArrayList field2501;
	@ObfuscatedName("ai")
	ArrayList field2492;
	@ObfuscatedName("al")
	String field2497;
	@ObfuscatedName("ac")
	float[] field2495;
	@ObfuscatedName("aa")
	Map field2494;
	@ObfuscatedName("am")
	Map field2493;
	@ObfuscatedName("ah")
	String field2498;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 393041251
	)
	int field2499;

	class228() {
		this.field2490 = new ArrayList();
		this.field2501 = new ArrayList();
		this.field2492 = new ArrayList();
		this.field2497 = null;
		this.field2495 = new float[4];
		this.field2494 = new HashMap();
		this.field2493 = new HashMap();
		this.field2499 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1926869057"
	)
	String method4793() {
		return this.field2498;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1008888066"
	)
	int method4799() {
		return this.field2499;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	void method4792() {
		this.field2497 = null;
		this.field2495[0] = 0.0F;
		this.field2495[1] = 0.0F;
		this.field2495[2] = 1.0F;
		this.field2495[3] = 1.0F;
		this.field2490.clear();
		this.field2501.clear();
		this.field2492.clear();
		this.field2494.clear();
		this.field2493.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILes;B)Z",
		garbageValue = "-1"
	)
	boolean method4795(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4792();
				return false;
			}

			try {
				this.method4796(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2501.clear();
			}

			try {
				this.method4798(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2492.clear();
			}
		} else {
			try {
				this.method4797(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2501.clear();
			}

			try {
				this.method4826(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2492.clear();
			}
		}

		try {
			this.method4800(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2497 = null;
			this.field2495[0] = 0.0F;
			this.field2495[1] = 0.0F;
			this.field2495[2] = 1.0F;
			this.field2495[3] = 1.0F;
			this.field2490.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4801(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2494.clear();
			this.field2493.clear();
		}

		if (var2 == 2) {
			try {
				this.field2498 = var4.getString("id");
				this.field2499 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Les;I)V",
		garbageValue = "-755065702"
	)
	void method4796(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class218 var5 = new class218(this);
					var5.field2406 = var2.request(new URL(var4.getString("src")));
					var5.field2405 = class162.method3826(var4, "placement");
					this.field2501.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Les;S)V",
		garbageValue = "16256"
	)
	void method4797(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class218 var3 = new class218(this);
			var3.field2406 = var2.request(new URL(var1.getString("src")));
			var3.field2405 = class162.method3826(var1, "placement");
			this.field2501.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1029835248"
	)
	void method4798(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class229 var4 = new class229(this);
				var4.field2507 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field2506 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field2502 = var9;
				var4.field2504 = var3.getInt("font");
				var4.field2505 = class162.method3826(var3, "placement");
				this.field2492.add(var4);
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1522939766"
	)
	void method4826(JSONObject var1) throws JSONException {
		class229 var2 = new class229(this);
		var2.field2507 = var1.optString("text");
		String var5 = var1.optString("align_x");
		byte var4;
		if (var5.equals("centre")) {
			var4 = 1;
		} else if (!var5.equals("bottom") && !var5.equals("right")) {
			var4 = 0;
		} else {
			var4 = 2;
		}

		var2.field2506 = var4;
		String var8 = var1.optString("align_y");
		byte var7;
		if (var8.equals("centre")) {
			var7 = 1;
		} else if (!var8.equals("bottom") && !var8.equals("right")) {
			var7 = 0;
		} else {
			var7 = 2;
		}

		var2.field2502 = var7;
		var2.field2504 = var1.optInt("font");
		var2.field2505 = class162.method3826(var1, "placement");
		this.field2492.add(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1683829528"
	)
	void method4800(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2495 = class162.method3826(var1, "clickbounds");
			this.field2497 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2490.add(new class216(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2490.add(new class216(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2490.add(new class216(this, var2[var3], 0));
							} else {
								this.field2490.add(new class225(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "4"
	)
	void method4801(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2494.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2494.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2494.put(var2[var3], 0);
					} else {
						this.field2493.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lwx;B)V",
		garbageValue = "0"
	)
	static final void method4794(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		int var4;
		NPC var5;
		if (var2 < var0.field1147.method9429()) {
			for (var3 = var2; var3 < var0.field1147.method9429(); ++var3) {
				var4 = var0.field1147.method9430(var3);
				Client.field507[++Client.field506 - 1] = var4;
				var5 = (NPC)var0.npcs.get((long)var4);
				var5.field1168 = true;
			}
		}

		if (var2 > var0.field1147.method9429()) {
			throw new RuntimeException("");
		} else {
			var0.field1147.method9432();

			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.field1147.method9430(var3);
				var5 = (NPC)var0.npcs.get((long)var4);
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.field1147.method9428(var4);
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.field1147.method9428(var4);
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.field1147.method9428(var4);
							var8 = var1.readBits(3);
							var5.method2576(var8, MoveSpeed.field3118);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.field1147.method9428(var4);
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method2576(var8, MoveSpeed.field3119);
								var9 = var1.readBits(3);
								var5.method2576(var9, MoveSpeed.field3119);
							} else {
								var8 = var1.readBits(3);
								var5.method2576(var8, MoveSpeed.field3117);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field507[++Client.field506 - 1] = var4;
							var5.field1168 = true;
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lov;III)V",
		garbageValue = "1903158300"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width * -1805166981) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width * -1805166981 - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width * -1805166981) / 2;
		} else {
			var0.x = var1 - var0.width * -1805166981 - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height * -2133353239) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * -2133353239 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height * -2133353239) / 2;
		} else {
			var0.y = var2 - var0.height * -2133353239 - (var2 * var0.rawY >> 14);
		}

	}
}
