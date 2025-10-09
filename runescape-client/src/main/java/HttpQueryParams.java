import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
@Implements("HttpQueryParams")
public class HttpQueryParams implements HttpPayload {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ab")
	final Map field5632;

	public HttpQueryParams(Map var1) {
		this.field5632 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Luw;",
		garbageValue = "48"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-807473489"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.encode().getBytes("UTF-8");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-155499346"
	)
	@Export("encode")
	public String encode() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field5632.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1713442777"
	)
	static final void method10639() {
		int var0;
		int var1;
		int var2;
		if (!Client.field559) {
			var0 = Coord.method7425(AddRequestTask.field5334);
			var1 = Coord.method7425(WorldMapSectionType.field3426);
			var2 = class280.getTileHeight(class547.topLevelWorldView, var0, var1, class547.topLevelWorldView.plane) - UserComparator10.field1585;
			WorldMapRenderer.method6699(var0, var2, var1);
		} else if (Client.field494 != null) {
			Huffman.cameraX = Client.field494.vmethod10764();
			ChatChannel.cameraZ = Client.field494.vmethod10755();
			if (Client.field561) {
				class514.cameraY = Client.field494.vmethod10756();
			} else {
				class514.cameraY = class280.getTileHeight(class547.topLevelWorldView, Huffman.cameraX, ChatChannel.cameraZ, class547.topLevelWorldView.plane) - Client.field494.vmethod10756();
			}

			Client.field494.method10770();
		}

		if (!Client.field560) {
			var0 = Coord.method7425(class168.field1907);
			var1 = Coord.method7425(PlayerComposition.field4113);
			var2 = class280.getTileHeight(class547.topLevelWorldView, var0, var1, class547.topLevelWorldView.plane) - ConcurrentMidiTask.field5357;
			int var3 = var0 - Huffman.cameraX;
			int var4 = var2 - class514.cameraY;
			int var5 = var1 - ChatChannel.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			class281.method6350(var7, var8);
		} else {
			if (Client.field564 != null) {
				class386.cameraPitch = Client.field564.method10748();
				class386.cameraPitch = Math.min(Math.max(class386.cameraPitch, 128), 383);
				Client.field564.method10770();
			}

			if (Client.field378 != null) {
				SpriteBufferProperties.cameraYaw = Client.field378.method10748() & 2047;
				Client.field378.method10770();
			}
		}

	}
}
