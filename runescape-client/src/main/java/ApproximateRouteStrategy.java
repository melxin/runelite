import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ci")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILku;B)Z",
		garbageValue = "-42"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-62"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method1254(String var0) {
		Language.field4674 = var0;

		try {
			String var1 = Client.client.getParameter(Integer.toString(18));
			String var2 = Client.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + HttpRequest.method113(ReflectionCheck.method724() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			Client var4 = Client.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}

	}
}
