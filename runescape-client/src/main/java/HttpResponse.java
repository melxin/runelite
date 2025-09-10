import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2064132583
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("aw")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("at")
	final Map field84;
	@ObfuscatedName("ac")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field84 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field84 = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "51700832"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "79"
	)
	public String method302() {
		return this.headerFields;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-2022393815"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field84;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-88997212"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "353989651"
	)
	static final int method306() {
		if (class36.clientPreferences.isRoofsHidden()) {
			return class333.topLevelWorldView.plane;
		} else {
			int var0 = 3;
			int var1 = Client.field552 >> 7;
			int var2 = Client.field337 >> 7;
			if (class401.cameraPitch < 310) {
				int var3;
				int var4;
				if (Client.oculusOrbState == 1) {
					var3 = class172.oculusOrbFocalPointX >> 7;
					var4 = BuddyRankComparator.oculusOrbFocalPointY >> 7;
				} else {
					var3 = var1;
					var4 = var2;
				}

				int var5 = HealthBarDefinition.cameraX >> 7;
				int var6 = HttpRequest.cameraZ >> 7;
				if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
					return class333.topLevelWorldView.plane;
				}

				if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
					return class333.topLevelWorldView.plane;
				}

				if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var5][var6] & 4) != 0) {
					var0 = class333.topLevelWorldView.plane;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				if (var4 > var6) {
					var8 = var4 - var6;
				} else {
					var8 = var6 - var4;
				}

				int var9;
				int var10;
				if (var7 > var8) {
					var9 = var8 * 65536 / var7;
					var10 = 32768;

					while (var5 != var3) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class333.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var6 < var4) {
								++var6;
							} else if (var6 > var4) {
								--var6;
							}

							if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class333.topLevelWorldView.plane;
							}
						}
					}
				} else if (var8 > 0) {
					var9 = var7 * 65536 / var8;
					var10 = 32768;

					while (var4 != var6) {
						if (var6 < var4) {
							++var6;
						} else if (var6 > var4) {
							--var6;
						}

						if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class333.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class333.topLevelWorldView.plane;
							}
						}
					}
				}
			}

			if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
				if ((class333.topLevelWorldView.tileSettings[class333.topLevelWorldView.plane][var1][var2] & 4) != 0) {
					var0 = class333.topLevelWorldView.plane;
				}

				return var0;
			} else {
				return class333.topLevelWorldView.plane;
			}
		}
	}
}
