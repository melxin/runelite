import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class226 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class226 field2465;
	@ObfuscatedName("iy")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field2467;
	@ObfuscatedName("ac")
	final int field2466;
	@ObfuscatedName("aa")
	final int field2464;
	@ObfuscatedName("am")
	String field2468;
	@ObfuscatedName("ah")
	String field2476;
	@ObfuscatedName("ag")
	String field2469;
	@ObfuscatedName("au")
	String field2471;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -6268055012529139293L
	)
	long field2472;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	AsyncRestClient field2473;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	AsyncHttpResponse field2474;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -827713761
	)
	int field2475;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 638506557
	)
	int field2461;
	@ObfuscatedName("aw")
	String field2477;
	@ObfuscatedName("at")
	boolean field2478;

	static {
		field2465 = new class226();
	}

	class226() {
		this.field2466 = 1;
		this.field2464 = 2;
		this.field2468 = "";
		this.field2476 = "";
		this.field2469 = "";
		this.field2471 = "";
		this.field2472 = -1L;
		this.field2475 = 1;
		this.field2461 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "93"
	)
	public void method4767(int var1, String var2) {
		this.field2461 = var1;
		this.field2477 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "709603283"
	)
	public void method4761(boolean var1) {
		this.field2478 = var1;
		this.field2473 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-22"
	)
	void method4762(String var1, String var2, String var3) {
		if (this.field2475 != 2) {
			this.field2468 = var1;
			this.field2476 = var2;
			this.field2469 = var3;
			if (!this.field2468.endsWith("/")) {
				this.field2468 = this.field2468 + "/";
			}

			if (!this.field2476.equals("")) {
				String var4 = this.field2468;
				var4 = var4 + "session/open/" + this.field2476;
				if (this.field2469.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2469;

				try {
					this.field2474 = this.method4768(var4);
					this.field2472 = class180.method3973();
				} catch (IOException var6) {
					this.field2474 = null;
					this.field2476 = "";
					this.field2469 = "";
				}

			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1907213508"
	)
	public void method4763() {
		if (this.field2474 == null) {
			if (!this.field2471.isEmpty() && this.field2475 == 1) {
				long var1 = class180.method3973();
				long var3 = var1 - this.field2472;
				String var5 = this.field2468;
				var5 = var5 + "session/close/" + this.field2476 + "/" + this.field2471;
				if (this.field2469.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2469 + "&sessionDuration=" + var3;
				}

				try {
					this.field2474 = this.method4768(var5);
				} catch (IOException var7) {
					this.field2475 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "355831671"
	)
	public void method4764() {
		if (this.field2473 != null) {
			this.field2473.shutdown();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "252186789"
	)
	void method4765() {
		if (!this.field2471.isEmpty()) {
			String var1 = "";
			switch(this.field2461) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2477.isEmpty()) {
				String var2 = this.field2468;
				var2 = var2 + var1 + "/" + this.field2476 + "/" + this.field2471 + "/" + this.field2477 + "?userHash=" + this.field2469;

				try {
					this.field2474 = this.method4768(var2);
				} catch (IOException var4) {
					this.field2475 = 1;
				}

				this.field2475 = 1;
				this.field2461 = 0;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1297857970"
	)
	public void method4766() {
		if (this.field2474 != null && this.field2474.hasFinished()) {
			if (this.field2474.hasFinished() && this.field2474.await().getResponseCode() == 200 && this.field2471.isEmpty()) {
				String var1 = this.field2474.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2471 = var1;
			}

			if (this.field2461 != 0) {
				this.method4765();
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-2070695575"
	)
	public boolean method4759(String var1) {
		this.method4767(2, var1);
		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Lae;",
		garbageValue = "154"
	)
	AsyncHttpResponse method4768(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2478);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2473.submitRequest(var3);
	}
}
