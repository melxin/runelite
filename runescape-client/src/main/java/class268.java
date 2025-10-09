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

@ObfuscatedName("kk")
public class class268 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static final class268 field3190;
	@ObfuscatedName("ag")
	Map field3187;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -743178549
	)
	int field3188;

	static {
		field3190 = new class268();
	}

	class268() {
		this.field3187 = new HashMap();
		this.field3188 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeu;I)V",
		garbageValue = "1597248298"
	)
	void method6058(JSONObject var1, int var2, UrlRequester var3) {
		this.field3187.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field3188 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method6057(var4.getJSONArray("crmcomponents"), this.field3188, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILeu;I)V",
		garbageValue = "564183819"
	)
	void method6057(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class266 var7 = new class266();

						try {
							var7.method6017(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field3174.isEmpty()) {
							String var8 = var5.getString("location");
							this.field3187.put(var8, var7);
						}
					}
				}
			}

			this.field3187 = this.method6056();
			class281.method6373();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1511365254"
	)
	Map method6056() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field3187.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class266)((Entry)var2.get(var7)).getValue()).method6021() > ((class266)((Entry)var2.get(var7 + 1)).getValue()).method6021()) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lkt;",
		garbageValue = "1795555270"
	)
	class266 method6055(String var1) {
		return (class266)this.field3187.get(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([J[IIIS)V",
		garbageValue = "-6080"
	)
	public static void method6067(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var6 + (long)(var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method6067(var0, var1, var2, var5 - 1);
			method6067(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldm;Lcd;B)V",
		garbageValue = "-83"
	)
	static final void method6066(WorldView var0, Actor var1) {
		int var5;
		if (var1.targetIndex != -1) {
			WorldView var2 = null;
			Actor var3 = null;
			int var4 = 65536;
			WorldViewManager var7;
			Iterator var8;
			WorldView var9;
			if (var1.targetIndex < var4) {
				int var11 = var1.targetIndex;
				var7 = Client.worldViewManager;
				var8 = var7.iterator();

				WorldView var12;
				while (true) {
					if (var8.hasNext()) {
						var9 = (WorldView)var8.next();
						if (var9.npcs.get((long)var11) == null) {
							continue;
						}

						var12 = var9;
						break;
					}

					var12 = var7.method2366();
					break;
				}

				var2 = var12;
				var3 = (Actor)var12.npcs.get((long)var1.targetIndex);
			} else {
				var5 = var1.targetIndex - var4;
				var7 = Client.worldViewManager;
				var8 = var7.iterator();

				WorldView var6;
				while (true) {
					if (var8.hasNext()) {
						var9 = (WorldView)var8.next();
						Player var10 = (Player)var9.players.get((long)var5);
						if (var10 == null || var9.id == -1) {
							continue;
						}

						var6 = var9;
						break;
					}

					var6 = var7.method2366();
					break;
				}

				var2 = var6;
				var3 = (Actor)var6.players.get((long)var5);
			}

			if (var3 != null) {
				class450 var23 = IndexCheck.method6169((float)var1.x, 0.0F, (float)var1.y);
				class450 var18;
				if (var0.id != var2.id) {
					WorldEntity var19;
					if (var0.id == -1) {
						var19 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var2.id);
						var18 = var19.method10213(var3.x, var3.y);
					} else if (var2.id == -1) {
						var19 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var0.id);
						var18 = var19.method10199(var3.x, var3.y);
					} else {
						var19 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var2.id);
						WorldEntity var20 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var0.id);
						class450 var21 = var19.method10213(var3.x, var3.y);
						var18 = var20.method10199((int)var21.field5216, (int)var21.field5219);
						var21.method9065();
					}
				} else {
					var18 = IndexCheck.method6169((float)var3.x, 0.0F, (float)var3.y);
				}

				int var13 = (int)(var23.field5216 - var18.field5216);
				int var14 = (int)(var23.field5219 - var18.field5219);
				if (var13 != 0 || var14 != 0) {
					var1.orientation = FontName.method11001(var13, var14);
				}

				var23.method9065();
				var18.method9065();
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var15;
		if (var1.pathLength == 0 || var1.field1093 > 0) {
			var15 = -1;
			if (var1.field1075 != -1) {
				var15 = var1.field1075;
			}

			if (var15 != -1) {
				var1.orientation = var15;
				if (var1.field1039) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2460();
		}

		var15 = var1.orientation - var1.rotation & 2047;
		if (var15 != 0) {
			boolean var16 = true;
			boolean var17 = true;
			++var1.field1087;
			var5 = var15 > 1024 ? -1 : 1;
			var1.rotation += var5 * var1.field1088;
			boolean var22 = true;
			if (var15 < var1.field1088 || var15 > 2048 - var1.field1088) {
				var1.rotation = var1.orientation;
				var22 = false;
			}

			if (var1.field1088 > 0 && var1.method2442() == var1.idleSequence && (var1.field1087 > 25 || var22)) {
				if (var5 == -1 && var1.turnLeftSequence != -1) {
					var1.method2508(var1.turnLeftSequence);
				} else if (var5 == 1 && var1.turnRightSequence != -1) {
					var1.method2508(var1.turnRightSequence);
				} else {
					var1.method2508(var1.walkSequence);
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1087 = 0;
		}

	}
}
