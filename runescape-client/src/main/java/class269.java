import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("kk")
public class class269 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static final class269 field3180;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 2139751461
	)
	static int field3187;
	@ObfuscatedName("at")
	Map field3185;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1981232327
	)
	int field3183;

	static {
		field3180 = new class269();
	}

	class269() {
		this.field3185 = new HashMap();
		this.field3183 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)V",
		garbageValue = "1218361557"
	)
	void method6046(JSONObject var1, int var2, UrlRequester var3) {
		this.field3185.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field3183 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method6054(var4.getJSONArray("crmcomponents"), this.field3183, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILel;B)V",
		garbageValue = "36"
	)
	void method6054(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class267 var7 = new class267();

						try {
							var7.method5999(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field3164.isEmpty()) {
							String var8 = var5.getString("location");
							this.field3185.put(var8, var7);
						}
					}
				}
			}

			this.field3185 = this.method6047();
			class189.method4284();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-211888981"
	)
	Map method6047() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field3185.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class267)((Entry)var2.get(var7)).getValue()).method6005() > ((class267)((Entry)var2.get(var7 + 1)).getValue()).method6005()) {
					Entry var4 = (Entry)var2.get(var7);
					var2.set(var7, var2.get(var7 + 1));
					var2.set(var7 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var5 = var2.iterator();

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lkm;",
		garbageValue = "1046954420"
	)
	class267 method6048(String var1) {
		return (class267)this.field3185.get(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[IIS)V",
		garbageValue = "-2723"
	)
	static void method6052(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = class524.method10438(var3);
			if (var4 != null && !var4.nonSelectable && var4.method4222(var2, var0)) {
				if (class200.field2182 == null) {
					class200.field2182 = new int[7];
					class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
					class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
					class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
					class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
					class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
					class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
					class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
				}

				int var6 = class200.field2182[var2];
				var1[var6] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1743090944"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
