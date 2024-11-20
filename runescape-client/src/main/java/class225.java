import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ip")
public class class225 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static final class225 field2425;
	@ObfuscatedName("gl")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("ab")
	String field2428;
	@ObfuscatedName("aw")
	String field2415;
	@ObfuscatedName("at")
	String field2417;
	@ObfuscatedName("ae")
	String field2419;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 5347270581744846395L
	)
	long field2427;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	AsyncRestClient field2418;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	AsyncHttpResponse field2421;
	@ObfuscatedName("av")
	final int field2420;
	@ObfuscatedName("au")
	final int field2423;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 393954651
	)
	int field2422;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -325933243
	)
	int field2426;
	@ObfuscatedName("az")
	String field2416;
	@ObfuscatedName("ap")
	boolean field2429;

	static {
		field2425 = new class225();
	}

	class225() {
		this.field2428 = "";
		this.field2415 = "";
		this.field2417 = "";
		this.field2419 = "";
		this.field2427 = -1L;
		this.field2420 = 1;
		this.field2423 = 2;
		this.field2422 = 1;
		this.field2426 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "35"
	)
	public void method4450(int var1, String var2) {
		this.field2426 = var1;
		this.field2416 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-192090075"
	)
	public void method4464(boolean var1) {
		this.field2429 = var1;
		this.field2418 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-29"
	)
	void method4474(String var1, String var2, String var3) {
		if (this.field2422 != 2) {
			this.field2428 = var1;
			this.field2415 = var2;
			this.field2417 = var3;
			if (!this.field2428.endsWith("/")) {
				this.field2428 = this.field2428 + "/";
			}

			if (!this.field2415.equals("")) {
				String var4 = this.field2428;
				var4 = var4 + "session/open/" + this.field2415;
				if (this.field2417.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2417;

				try {
					this.field2421 = this.method4457(var4);
					this.field2427 = class59.method1150();
				} catch (IOException var6) {
					this.field2421 = null;
					this.field2415 = "";
					this.field2417 = "";
				}

			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1121010855"
	)
	public void method4475() {
		if (this.field2421 == null) {
			if (!this.field2419.isEmpty() && this.field2422 == 1) {
				long var1 = class59.method1150();
				long var3 = var1 - this.field2427;
				String var5 = this.field2428;
				var5 = var5 + "session/close/" + this.field2415 + "/" + this.field2419;
				if (this.field2417.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2417 + "&sessionDuration=" + var3;
				}

				try {
					this.field2421 = this.method4457(var5);
				} catch (IOException var7) {
					this.field2422 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "393149252"
	)
	public void method4463() {
		if (this.field2418 != null) {
			this.field2418.shutdown();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method4454() {
		if (!this.field2419.isEmpty()) {
			String var1 = "";
			switch(this.field2426) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2416.isEmpty()) {
				String var2 = this.field2428;
				var2 = var2 + var1 + "/" + this.field2415 + "/" + this.field2419 + "/" + this.field2416 + "?userHash=" + this.field2417;

				try {
					this.field2421 = this.method4457(var2);
				} catch (IOException var4) {
					this.field2422 = 1;
				}

				this.field2422 = 1;
				this.field2426 = 0;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	public void method4479() {
		if (this.field2421 != null && this.field2421.hasFinished()) {
			if (this.field2421.hasFinished() && this.field2421.await().getResponseCode() == 200 && this.field2419.isEmpty()) {
				String var1 = this.field2421.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2419 = var1;
			}

			if (this.field2426 != 0) {
				this.method4454();
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1624742792"
	)
	public boolean method4456(String var1) {
		this.method4450(2, var1);
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lah;",
		garbageValue = "-448280273"
	)
	AsyncHttpResponse method4457(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2429);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2418.submitRequest(var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvj;S)Lii;",
		garbageValue = "-9621"
	)
	static class208 method4452(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			boolean var2 = true;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.readUnsignedShort();
			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			int var9 = var0.readUnsignedByte();
			int var10 = var0.readUnsignedByte();
			if (var6 >= 1 && var8 >= 1 && var9 >= 0 && var10 >= 0) {
				return new class208(var6, var7, var8, var9, var10);
			}
		}

		return null;
	}
}
