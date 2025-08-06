import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("kg")
public class class263 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final class263 field3059;
	@ObfuscatedName("as")
	final int field3067;
	@ObfuscatedName("ah")
	final int field3058;
	@ObfuscatedName("ap")
	String field3060;
	@ObfuscatedName("am")
	String field3057;
	@ObfuscatedName("aj")
	String field3064;
	@ObfuscatedName("ag")
	String field3065;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -2951284067633946481L
	)
	long field3071;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	AsyncRestClient field3073;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	AsyncHttpResponse field3068;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 479328391
	)
	int field3069;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1670025807
	)
	int field3070;
	@ObfuscatedName("at")
	String field3062;
	@ObfuscatedName("ax")
	boolean field3072;

	static {
		field3059 = new class263();
	}

	class263() {
		this.field3067 = 1;
		this.field3058 = 2;
		this.field3060 = "";
		this.field3057 = "";
		this.field3064 = "";
		this.field3065 = "";
		this.field3071 = -1L;
		this.field3069 = 1;
		this.field3070 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-845766756"
	)
	public void method5945(int var1, String var2) {
		this.field3070 = var1;
		this.field3062 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "838107298"
	)
	public void method5937(boolean var1) {
		this.field3072 = var1;
		this.field3073 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1758595307"
	)
	void method5938(String var1, String var2, String var3) {
		if (this.field3069 != 2) {
			this.field3060 = var1;
			this.field3057 = var2;
			this.field3064 = var3;
			if (!this.field3060.endsWith("/")) {
				this.field3060 = this.field3060 + "/";
			}

			if (!this.field3057.equals("")) {
				String var4 = this.field3060;
				var4 = var4 + "session/open/" + this.field3057;
				if (this.field3064.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field3064;

				try {
					this.field3068 = this.method5944(var4);
					this.field3071 = UserComparator7.method3496();
				} catch (IOException var6) {
					this.field3068 = null;
					this.field3057 = "";
					this.field3064 = "";
				}

			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022406769"
	)
	public void method5940() {
		if (this.field3068 == null) {
			if (!this.field3065.isEmpty() && this.field3069 == 1) {
				long var1 = UserComparator7.method3496();
				long var3 = var1 - this.field3071;
				String var5 = this.field3060;
				var5 = var5 + "session/close/" + this.field3057 + "/" + this.field3065;
				if (this.field3064.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field3064 + "&sessionDuration=" + var3;
				}

				try {
					this.field3068 = this.method5944(var5);
				} catch (IOException var7) {
					this.field3069 = 1;
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	public void method5961() {
		if (this.field3073 != null) {
			this.field3073.shutdown();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2081795308"
	)
	void method5941() {
		if (!this.field3065.isEmpty()) {
			String var1 = "";
			switch(this.field3070) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field3062.isEmpty()) {
				String var2 = this.field3060;
				var2 = var2 + var1 + "/" + this.field3057 + "/" + this.field3065 + "/" + this.field3062 + "?userHash=" + this.field3064;

				try {
					this.field3068 = this.method5944(var2);
				} catch (IOException var4) {
					this.field3069 = 1;
				}

				this.field3069 = 1;
				this.field3070 = 0;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-286155393"
	)
	public void method5942() {
		if (this.field3068 != null && this.field3068.hasFinished()) {
			if (this.field3068.hasFinished() && this.field3068.await().getResponseCode() == 200 && this.field3065.isEmpty()) {
				String var1 = this.field3068.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field3065 = var1;
			}

			if (this.field3070 != 0) {
				this.method5941();
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "799359058"
	)
	public boolean method5939(String var1) {
		this.method5945(2, var1);
		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Laq;",
		garbageValue = "-3"
	)
	AsyncHttpResponse method5944(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field3072);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field3073.submitRequest(var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;FLkm;I)V",
		garbageValue = "657773853"
	)
	static void method5968(WorldEntityCoord var0, WorldEntityCoord var1, float var2, WorldEntityCoord var3) {
		var2 = SoundSystem.method3067(0.0F, 1.0F, var2);
		int var4 = var1.getX() - var0.getX();
		int var5 = var1.getY() - var0.getY();
		var4 = (int)((float)var4 * var2);
		var5 = (int)((float)var5 * var2);
		var3.method6256(var0.getX() + var4, var0.getY() + var5);
		int var7 = var0.getCurrentRotationAngle();
		int var8 = var1.getCurrentRotationAngle();
		int var9 = var8 - var7 & 2047;
		int var6;
		if (var9 > 1024) {
			var6 = -(2048 - var9);
		} else {
			var6 = var9;
		}

		var9 = (int)((float)var6 * var2);
		var3.setCurrentRotationAngle(var0.getCurrentRotationAngle() + var9);
	}
}
