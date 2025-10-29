import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("jj")
public class class234 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class234 field2612;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("nm")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("aj")
	final int field2625;
	@ObfuscatedName("ak")
	final int field2622;
	@ObfuscatedName("aw")
	String field2615;
	@ObfuscatedName("ap")
	String field2616;
	@ObfuscatedName("ay")
	String field2617;
	@ObfuscatedName("au")
	String field2618;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 5148152992387298957L
	)
	long field2614;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	AsyncRestClient field2620;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	AsyncHttpResponse field2621;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 961492723
	)
	int field2628;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 959207409
	)
	int field2623;
	@ObfuscatedName("ab")
	String field2624;
	@ObfuscatedName("ax")
	boolean field2631;

	static {
		field2612 = new class234();
	}

	class234() {
		this.field2625 = 1;
		this.field2622 = 2;
		this.field2615 = "";
		this.field2616 = "";
		this.field2617 = "";
		this.field2618 = "";
		this.field2614 = -1L;
		this.field2628 = 1;
		this.field2623 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1058808458"
	)
	public void method5143(int var1, String var2) {
		this.field2623 = var1;
		this.field2624 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-505140331"
	)
	public void method5129(boolean var1) {
		this.field2631 = var1;
		this.field2620 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-110"
	)
	void method5155(String var1, String var2, String var3) {
		if (this.field2628 != 2) {
			this.field2615 = var1;
			this.field2616 = var2;
			this.field2617 = var3;
			if (!this.field2615.endsWith("/")) {
				this.field2615 = this.field2615 + "/";
			}

			if (!this.field2616.equals("")) {
				String var4 = this.field2615;
				var4 = var4 + "session/open/" + this.field2616;
				if (this.field2617.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2617;

				try {
					this.field2621 = this.method5135(var4);
					this.field2614 = ParamComposition.method4708();
				} catch (IOException var6) {
					this.field2621 = null;
					this.field2616 = "";
					this.field2617 = "";
				}

			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1365444010"
	)
	public void method5131() {
		if (this.field2621 == null) {
			if (!this.field2618.isEmpty() && this.field2628 == 1) {
				long var1 = ParamComposition.method4708();
				long var3 = var1 - this.field2614;
				String var5 = this.field2615;
				var5 = var5 + "session/close/" + this.field2616 + "/" + this.field2618;
				if (this.field2617.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2617 + "&sessionDuration=" + var3;
				}

				try {
					this.field2621 = this.method5135(var5);
				} catch (IOException var7) {
					this.field2628 = 1;
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	public void method5132() {
		if (this.field2620 != null) {
			this.field2620.shutdown();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1326173517"
	)
	void method5145() {
		if (!this.field2618.isEmpty()) {
			String var1 = "";
			switch(this.field2623) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2624.isEmpty()) {
				String var2 = this.field2615;
				var2 = var2 + var1 + "/" + this.field2616 + "/" + this.field2618 + "/" + this.field2624 + "?userHash=" + this.field2617;

				try {
					this.field2621 = this.method5135(var2);
				} catch (IOException var4) {
					this.field2628 = 1;
				}

				this.field2628 = 1;
				this.field2623 = 0;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	public void method5134() {
		if (this.field2621 != null && this.field2621.hasFinished()) {
			if (this.field2621.hasFinished() && this.field2621.await().getResponseCode() == 200 && this.field2618.isEmpty()) {
				String var1 = this.field2621.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2618 = var1;
			}

			if (this.field2623 != 0) {
				this.method5145();
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "208000344"
	)
	public boolean method5130(String var1) {
		this.method5143(2, var1);
		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lar;",
		garbageValue = "67"
	)
	AsyncHttpResponse method5135(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2631);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2620.submitRequest(var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;I)[Lxt;",
		garbageValue = "-2085797468"
	)
	public static SpritePixels[] method5164(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class69.method2287(var0, var3, var4);
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "1886489086"
	)
	static void method5162(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				class31.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "758204542"
	)
	static final void method5133() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			SpriteBufferProperties.method45(var1);
		}

	}
}
