import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ja")
public class class238 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static final class238 field2661;
	@ObfuscatedName("ag")
	Map field2665;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 376288709
	)
	int field2663;

	static {
		field2661 = new class238();
	}

	class238() {
		this.field2665 = new HashMap();
		this.field2663 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILei;I)V",
		garbageValue = "268666868"
	)
	void method5215(JSONObject var1, int var2, UrlRequester var3) {
		this.field2665.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2663 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method5216(var4.getJSONArray("crmcomponents"), this.field2663, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILei;B)V",
		garbageValue = "6"
	)
	void method5216(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class236 var7 = new class236();

						try {
							var7.method5186(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2644.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2665.put(var8, var7);
						}
					}
				}
			}

			this.field2665 = this.method5218();
			ParamComposition.method4708();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1280120940"
	)
	Map method5218() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2665.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class236)((Entry)var2.get(var7)).getValue()).method5167() > ((class236)((Entry)var2.get(var7 + 1)).getValue()).method5167()) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljk;",
		garbageValue = "321"
	)
	class236 method5220(String var1) {
		return (class236)this.field2665.get(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-88"
	)
	public static int method5229(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) - 512 & 2047;
	}
}
