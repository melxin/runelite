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

@ObfuscatedName("kx")
public class class267 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class267 field3105;
	@ObfuscatedName("ac")
	Map field3104;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1242309167
	)
	int field3109;

	static {
		field3105 = new class267();
	}

	class267() {
		this.field3104 = new HashMap();
		this.field3109 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILes;I)V",
		garbageValue = "591957684"
	)
	void method6018(JSONObject var1, int var2, UrlRequester var3) {
		this.field3104.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field3109 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method6014(var4.getJSONArray("crmcomponents"), this.field3109, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILes;I)V",
		garbageValue = "895730775"
	)
	void method6014(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class265 var7 = new class265();

						try {
							var7.method5973(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field3087.isEmpty()) {
							String var8 = var5.getString("location");
							this.field3104.put(var8, var7);
						}
					}
				}
			}

			this.field3104 = this.method6015();
			UserComparator7.method3496();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1997662907"
	)
	Map method6015() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field3104.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class265)((Entry)var2.get(var7)).getValue()).method5971() > ((class265)((Entry)var2.get(var7 + 1)).getValue()).method5971()) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lku;",
		garbageValue = "-92"
	)
	class265 method6016(String var1) {
		return (class265)this.field3104.get(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "29421"
	)
	public static void method6028(int var0, int var1) {
		class166.method4014(var0, var1, 0, 0);
		class337.field3790.clear();
		class337.field3795.clear();
		if (class337.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			class82.method2752();
		} else {
			class337.field3795.add(new DelayFadeTask((SongTask)null, class337.musicPlayerStatus));
			class337.field3795.add(new FadeOutTask((SongTask)null, 0, false, class337.field3797));
			ArrayList var2 = AbstractWorldMapIcon.method6879();
			class337.field3795.add(new class468((SongTask)null, var2));
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method6027() {
		SoundSystem.otp.trim();
		if (SoundSystem.otp.length() != 6) {
			class460.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class563.otpMedium = Integer.parseInt(SoundSystem.otp);
			SoundSystem.otp = "";
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
			class460.setLoginResponseString("", "Connecting to server...", "");
			AuthenticationScheme.updateGameState(20);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Lvf;I)V",
		garbageValue = "-800452869"
	)
	static void method6013(class515 var0, class570 var1) {
		class150.method3792(var0, var1, false);
	}
}
