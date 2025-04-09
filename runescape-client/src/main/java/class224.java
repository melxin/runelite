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

@ObfuscatedName("ih")
public class class224 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final class224 field2520;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	public static class413 field2524;
	@ObfuscatedName("ae")
	Map field2525;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1176353997
	)
	int field2522;

	static {
		field2520 = new class224();
	}

	class224() {
		this.field2525 = new HashMap();
		this.field2522 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILep;B)V",
		garbageValue = "-12"
	)
	void method4942(JSONObject var1, int var2, UrlRequester var3) {
		this.field2525.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2522 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4938(var4.getJSONArray("crmcomponents"), this.field2522, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILep;I)V",
		garbageValue = "-726880911"
	)
	void method4938(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class222 var7 = new class222();

						try {
							var7.method4901(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2499.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2525.put(var8, var7);
						}
					}
				}
			}

			this.field2525 = this.method4939();
			class282.method5908();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "-1"
	)
	Map method4939() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2525.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class222)((Entry)var2.get(var7)).getValue()).method4886() > ((class222)((Entry)var2.get(var7 + 1)).getValue()).method4886()) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lig;",
		garbageValue = "1068184557"
	)
	class222 method4940(String var1) {
		return (class222)this.field2525.get(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfy;",
		garbageValue = "-104"
	)
	static class142 method4945(int var0) {
		class142 var2 = class87.method2465(var0);
		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3397() ? 0 : 1;
		}

		return var1 != 0 ? null : class87.method2465(var0);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;I)V",
		garbageValue = "-1491359268"
	)
	static void method4952(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field794 += var2.groupCount;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "2132311855"
	)
	static final void method4943(WorldView var0) {
		for (PendingSpawn var1 = (PendingSpawn)var0.pendingSpawns.last(); var1 != null; var1 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var1.hitpoints > 0) {
				--var1.hitpoints;
			}

			if (var1.hitpoints == 0) {
				if (var1.objectId < 0 || class27.method432(var1.objectId, var1.field1199)) {
					class561.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.objectId, var1.field1198, var1.field1199, var1.field1207);
					var1.remove();
				}
			} else {
				if (var1.delay > 0) {
					--var1.delay;
				}

				if (var1.delay == 0 && var1.x >= 1 && var1.y >= 1 && var1.x <= 102 && var1.y <= 102 && (var1.field1200 < 0 || class27.method432(var1.field1200, var1.field1204))) {
					class561.addPendingSpawnToScene(var0, var1.plane, var1.type, var1.x, var1.y, var1.field1200, var1.field1201, var1.field1204, var1.field1207);
					var1.delay = -1;
					if (var1.objectId == var1.field1200 && var1.objectId == -1) {
						var1.remove();
					} else if (var1.field1200 == var1.objectId && var1.field1201 == var1.field1198 && var1.field1204 == var1.field1199) {
						var1.remove();
					}
				}
			}
		}

	}
}
