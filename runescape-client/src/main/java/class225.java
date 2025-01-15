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

@ObfuscatedName("ij")
public class class225 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final class225 field2458;
	@ObfuscatedName("aw")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ah")
	Map field2462;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 903243181
	)
	int field2456;

	static {
		field2458 = new class225();
	}

	class225() {
		this.field2462 = new HashMap();
		this.field2456 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILez;I)V",
		garbageValue = "325593091"
	)
	void method5051(JSONObject var1, int var2, UrlRequester var3) {
		this.field2462.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2456 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method5050(var4.getJSONArray("crmcomponents"), this.field2456, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILez;I)V",
		garbageValue = "-531552182"
	)
	void method5050(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class223 var7 = new class223();

						try {
							var7.method5007(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2443.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2462.put(var8, var7);
						}
					}
				}
			}

			this.field2462 = this.method5049();
			ReflectionCheck.method724();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "18"
	)
	Map method5049() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2462.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class223)((Entry)var2.get(var7)).getValue()).method5016() > ((class223)((Entry)var2.get(var7 + 1)).getValue()).method5016()) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lic;",
		garbageValue = "42"
	)
	class223 method5047(String var1) {
		return (class223)this.field2462.get(var1);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)Ltp;",
		garbageValue = "-919439345"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class437.platformInfo;
	}
}
