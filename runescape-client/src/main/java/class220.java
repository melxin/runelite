import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ik")
public class class220 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static final class220 field2472;
	@ObfuscatedName("aq")
	final int field2473;
	@ObfuscatedName("av")
	final int field2474;
	@ObfuscatedName("am")
	String field2480;
	@ObfuscatedName("aa")
	String field2476;
	@ObfuscatedName("ap")
	String field2475;
	@ObfuscatedName("ax")
	String field2478;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 3513501456862000723L
	)
	long field2479;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	AsyncRestClient field2481;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	AsyncHttpResponse field2471;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -954880521
	)
	int field2483;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1255801913
	)
	int field2469;
	@ObfuscatedName("ac")
	String field2484;
	@ObfuscatedName("ay")
	boolean field2482;

	static {
		field2472 = new class220();
	}

	class220() {
		this.field2473 = 1;
		this.field2474 = 2;
		this.field2480 = "";
		this.field2476 = "";
		this.field2475 = "";
		this.field2478 = "";
		this.field2479 = -1L;
		this.field2483 = 1;
		this.field2469 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2050781355"
	)
	public void method4847(int var1, String var2) {
		this.field2469 = var1;
		this.field2484 = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2123405715"
	)
	public void method4873(boolean var1) {
		this.field2482 = var1;
		this.field2481 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-374893917"
	)
	void method4849(String var1, String var2, String var3) {
		if (this.field2483 != 2) {
			this.field2480 = var1;
			this.field2476 = var2;
			this.field2475 = var3;
			if (!this.field2480.endsWith("/")) {
				this.field2480 = this.field2480 + "/";
			}

			if (!this.field2476.equals("")) {
				String var4 = this.field2480;
				var4 = var4 + "session/open/" + this.field2476;
				if (this.field2475.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2475;

				try {
					this.field2471 = this.method4855(var4);
					this.field2479 = class282.method5908();
				} catch (IOException var6) {
					this.field2471 = null;
					this.field2476 = "";
					this.field2475 = "";
				}

			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4850() {
		if (this.field2471 == null) {
			if (!this.field2478.isEmpty() && this.field2483 == 1) {
				long var1 = class282.method5908();
				long var3 = var1 - this.field2479;
				String var5 = this.field2480;
				var5 = var5 + "session/close/" + this.field2476 + "/" + this.field2478;
				if (this.field2475.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2475 + "&sessionDuration=" + var3;
				}

				try {
					this.field2471 = this.method4855(var5);
				} catch (IOException var7) {
					this.field2483 = 1;
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4882() {
		if (this.field2481 != null) {
			this.field2481.shutdown();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2013331709"
	)
	void method4852() {
		if (!this.field2478.isEmpty()) {
			String var1 = "";
			switch(this.field2469) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2484.isEmpty()) {
				String var2 = this.field2480;
				var2 = var2 + var1 + "/" + this.field2476 + "/" + this.field2478 + "/" + this.field2484 + "?userHash=" + this.field2475;

				try {
					this.field2471 = this.method4855(var2);
				} catch (IOException var4) {
					this.field2483 = 1;
				}

				this.field2483 = 1;
				this.field2469 = 0;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097219947"
	)
	public void method4853() {
		if (this.field2471 != null && this.field2471.hasFinished()) {
			if (this.field2471.hasFinished() && this.field2471.await().getResponseCode() == 200 && this.field2478.isEmpty()) {
				String var1 = this.field2471.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2478 = var1;
			}

			if (this.field2469 != 0) {
				this.method4852();
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "796784521"
	)
	public boolean method4854(String var1) {
		this.method4847(2, var1);
		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lak;",
		garbageValue = "-1387516213"
	)
	AsyncHttpResponse method4855(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2482);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2481.submitRequest(var3);
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ZB)V",
		garbageValue = "-43"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class232.widgetDefinition.method6954(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var4.key >> 48 & 65535L) == (long)var2) {
				var4.remove();
			}
		}

		Widget var5 = class232.widgetDefinition.method6951(var3);
		if (var5 != null) {
			class139.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			MoveSpeed.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
