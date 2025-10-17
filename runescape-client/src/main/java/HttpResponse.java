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

@ObfuscatedName("an")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2052036665
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("at")
	@Export("headerFields")
	final String headerFields;
	@ObfuscatedName("ag")
	final Map field86;
	@ObfuscatedName("aj")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = var1;
		this.field86 = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		this.headerFields = var1.getResponseMessage();
		this.field86 = var1.getHeaderFields();
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2048168811"
	)
	public String method291() {
		return this.headerFields;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-455912811"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.field86;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1699354534"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1039203613"
	)
	static int method303(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILcv;I)I",
		garbageValue = "1928530013"
	)
	static int method302(int var0, int var1, ObjectSound var2) {
		WorldView var3 = Client.worldViewManager.getWorldView(var2.plane);
		ProjectionCoord var4 = Varcs.method3022(var3, var2.y, var2.maxX);
		ProjectionCoord var5 = Varcs.method3022(var3, var2.maxY, var2.field973);
		int var6 = (int)var4.x;
		int var7 = (int)var4.y;
		int var8 = (int)var5.x;
		int var9 = (int)var5.y;
		var4.release();
		var5.release();
		int var11 = 0;
		if (var0 < var6) {
			var11 += var6 - var0;
		} else if (var0 > var8) {
			var11 += var0 - var8;
		}

		if (var1 < var7) {
			var11 += var7 - var1;
		} else if (var1 > var9) {
			var11 += var1 - var9;
		}

		var11 = Math.max(var11 - 64, 0);
		return var11;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "40"
	)
	static int method288(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return SpotAnimationDefinition.method4482(var0, var1, var2);
		} else if (var0 < 1100) {
			return class50.method1924(var0, var1, var2);
		} else if (var0 < 1200) {
			return class535.method10673(var0, var1, var2);
		} else if (var0 < 1300) {
			return KitDefinition.method4299(var0, var1, var2);
		} else if (var0 < 1400) {
			return class489.method9931(var0, var1, var2);
		} else if (var0 < 1500) {
			return class164.method4076(var0, var1, var2);
		} else if (var0 < 1600) {
			return World.method1549(var0, var1, var2);
		} else if (var0 < 1700) {
			return Interpreter.method1781(var0, var1, var2);
		} else if (var0 < 1800) {
			return class385.method8210(var0, var1, var2);
		} else if (var0 < 1900) {
			return class363.method7534(var0, var1, var2);
		} else if (var0 < 2000) {
			return SoundCache.method3224(var0, var1, var2);
		} else if (var0 < 2100) {
			return class50.method1924(var0, var1, var2);
		} else if (var0 < 2200) {
			return class535.method10673(var0, var1, var2);
		} else if (var0 < 2300) {
			return KitDefinition.method4299(var0, var1, var2);
		} else if (var0 < 2400) {
			return class489.method9931(var0, var1, var2);
		} else if (var0 < 2500) {
			return class164.method4076(var0, var1, var2);
		} else if (var0 < 2600) {
			return WorldMapSectionType.method6799(var0, var1, var2);
		} else if (var0 < 2700) {
			return Canvas.method325(var0, var1, var2);
		} else if (var0 < 2800) {
			return Huffman.method8137(var0, var1, var2);
		} else if (var0 < 2900) {
			return World.method1550(var0, var1, var2);
		} else if (var0 < 3000) {
			return SoundCache.method3224(var0, var1, var2);
		} else if (var0 < 3200) {
			return WorldMapData_0.method6388(var0, var1, var2);
		} else if (var0 < 3300) {
			return class280.method6345(var0, var1, var2);
		} else if (var0 < 3400) {
			return class147.method3884(var0, var1, var2);
		} else if (var0 < 3500) {
			return ObjectSound.method2359(var0, var1, var2);
		} else if (var0 < 3600) {
			return SpotAnimationDefinition.method4495(var0, var1, var2);
		} else if (var0 < 3700) {
			return WorldMapLabelSize.method6405(var0, var1, var2);
		} else if (var0 < 3800) {
			return BufferedNetSocket.method10318(var0, var1, var2);
		} else if (var0 < 3900) {
			return Huffman.method8139(var0, var1, var2);
		} else if (var0 < 4000) {
			return VarpDefinition.method4226(var0, var1, var2);
		} else if (var0 < 4100) {
			return Projection.method5509(var0, var1, var2);
		} else if (var0 < 4200) {
			return class572.method11194(var0, var1, var2);
		} else if (var0 < 4300) {
			return HttpRequest.method99(var0, var1, var2);
		} else if (var0 < 5100) {
			return InterfaceParent.method2166(var0, var1, var2);
		} else if (var0 < 5400) {
			return HealthBarConfig.method2766(var0, var1, var2);
		} else if (var0 < 5600) {
			return ModeWhere.method8727(var0, var1, var2);
		} else if (var0 < 5700) {
			return WallDecoration.method5849(var0, var1, var2);
		} else if (var0 < 6300) {
			return class550.method10765(var0, var1, var2);
		} else if (var0 < 6600) {
			return class199.method4475(var0, var1, var2);
		} else if (var0 < 6700) {
			return AuthenticationScheme.method3667(var0, var1, var2);
		} else if (var0 < 6800) {
			return class108.method3467(var0, var1, var2);
		} else if (var0 < 6900) {
			return StructComposition.method4612(var0, var1, var2);
		} else if (var0 < 7000) {
			return class365.method7887(var0, var1, var2);
		} else if (var0 < 7100) {
			return HttpAuthenticationHeader.method9827(var0, var1, var2);
		} else if (var0 < 7200) {
			return class66.method2187(var0, var1, var2);
		} else if (var0 < 7500) {
			return VarbitComposition.method4588(var0, var1, var2);
		} else if (var0 < 7600) {
			return class136.method3752(var0, var1, var2);
		} else if (var0 < 7700) {
			return class40.method775(var0, var1, var2);
		} else if (var0 < 8000) {
			return SoundSystem.method3200(var0, var1, var2);
		} else if (var0 < 8100) {
			return WorldMapSection1.method6874(var0, var1, var2);
		} else {
			return var0 >= 13000 && var0 < 14000 ? class187.method4328(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1549369615"
	)
	static final void method305() {
		for (PendingSpawn var0 = (PendingSpawn)class547.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class547.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class149.method3900(class547.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1236815053"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			class398.runComponentCloseListeners(class35.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
