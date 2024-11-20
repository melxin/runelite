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

@ObfuscatedName("il")
public class class229 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class229 field2466;
	@ObfuscatedName("ai")
	static int[] field2468;
	@ObfuscatedName("aw")
	Map field2470;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -142927011
	)
	int field2465;

	static {
		field2466 = new class229();
	}

	class229() {
		this.field2470 = new HashMap();
		this.field2465 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;S)V",
		garbageValue = "-8201"
	)
	void method4530(JSONObject var1, int var2, UrlRequester var3) {
		this.field2470.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2465 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4531(var4.getJSONArray("crmcomponents"), this.field2465, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILel;I)V",
		garbageValue = "-1072035027"
	)
	void method4531(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class227 var7 = new class227();

						try {
							var7.method4486(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2445.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2470.put(var8, var7);
						}
					}
				}
			}

			this.field2470 = this.method4532();
			class59.method1150();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "62"
	)
	Map method4532() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2470.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class227)((Entry)var2.get(var7)).getValue()).method4484() > ((class227)((Entry)var2.get(var7 + 1)).getValue()).method4484()) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lid;",
		garbageValue = "-1125790881"
	)
	class227 method4533(String var1) {
		return (class227)this.field2470.get(var1);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2072270632"
	)
	static void method4534(int var0, int var1, int var2, int var3) {
		Widget var4 = class379.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			WorldMapEvent.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		Clock.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class202.selectedSpellFlags = var2;
		class178.invalidateWidget(var4);
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIIILvr;Lna;B)V",
		garbageValue = "62"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var3 * var8 + var9 * var2 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class162.redHintArrowSprite.method10626(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class167.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
