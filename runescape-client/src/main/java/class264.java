import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("kb")
public class class264 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final class264 field3137;
	@ObfuscatedName("af")
	final int field3138;
	@ObfuscatedName("ae")
	final int field3139;
	@ObfuscatedName("aq")
	String field3140;
	@ObfuscatedName("ac")
	String field3135;
	@ObfuscatedName("aa")
	String field3141;
	@ObfuscatedName("ap")
	String field3142;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 8133006569314021235L
	)
	long field3144;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	AsyncRestClient field3145;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	AsyncHttpResponse field3146;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 559398845
	)
	int field3147;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1280363009
	)
	int field3148;
	@ObfuscatedName("au")
	String field3149;
	@ObfuscatedName("ak")
	boolean field3134;

	static {
		field3137 = new class264();
	}

	class264() {
		this.field3138 = 1;
		this.field3139 = 2;
		this.field3140 = "";
		this.field3135 = "";
		this.field3141 = "";
		this.field3142 = "";
		this.field3144 = -1L;
		this.field3147 = 1;
		this.field3148 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-891315907"
	)
	public void method6001(int var1, String var2) {
		this.field3148 = var1;
		this.field3149 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2051039574"
	)
	public void method5986(boolean var1) {
		this.field3134 = var1;
		this.field3145 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-161779827"
	)
	void method5987(String var1, String var2, String var3) {
		if (this.field3147 != 2) {
			this.field3140 = var1;
			this.field3135 = var2;
			this.field3141 = var3;
			if (!this.field3140.endsWith("/")) {
				this.field3140 = this.field3140 + "/";
			}

			if (!this.field3135.equals("")) {
				String var4 = this.field3140;
				var4 = var4 + "session/open/" + this.field3135;
				if (this.field3141.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field3141;

				try {
					this.field3146 = this.method6011(var4);
					this.field3144 = class281.method6373();
				} catch (IOException var6) {
					this.field3146 = null;
					this.field3135 = "";
					this.field3141 = "";
				}

			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	public void method5988() {
		if (this.field3146 == null) {
			if (!this.field3142.isEmpty() && this.field3147 == 1) {
				long var1 = class281.method6373();
				long var3 = var1 - this.field3144;
				String var5 = this.field3140;
				var5 = var5 + "session/close/" + this.field3135 + "/" + this.field3142;
				if (this.field3141.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field3141 + "&sessionDuration=" + var3;
				}

				try {
					this.field3146 = this.method6011(var5);
				} catch (IOException var7) {
					this.field3147 = 1;
				}
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-53822348"
	)
	public void method5989() {
		if (this.field3145 != null) {
			this.field3145.shutdown();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1279411597"
	)
	void method5990() {
		if (!this.field3142.isEmpty()) {
			String var1 = "";
			switch(this.field3148) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field3149.isEmpty()) {
				String var2 = this.field3140;
				var2 = var2 + var1 + "/" + this.field3135 + "/" + this.field3142 + "/" + this.field3149 + "?userHash=" + this.field3141;

				try {
					this.field3146 = this.method6011(var2);
				} catch (IOException var4) {
					this.field3147 = 1;
				}

				this.field3147 = 1;
				this.field3148 = 0;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public void method5991() {
		if (this.field3146 != null && this.field3146.hasFinished()) {
			if (this.field3146.hasFinished() && this.field3146.await().getResponseCode() == 200 && this.field3142.isEmpty()) {
				String var1 = this.field3146.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field3142 = var1;
			}

			if (this.field3148 != 0) {
				this.method5990();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1245684529"
	)
	public boolean method5992(String var1) {
		this.method6001(2, var1);
		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lao;",
		garbageValue = "1432930643"
	)
	AsyncHttpResponse method6011(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3134);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field3145.submitRequest(var3);
	}
}
