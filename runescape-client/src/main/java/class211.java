import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ij")
public class class211 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	class220 field2409;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	class222 field2410;
	@ObfuscatedName("aw")
	int field2407;
	@ObfuscatedName("ar")
	String field2412;
	@ObfuscatedName("au")
	String field2413;
	@ObfuscatedName("aj")
	String field2414;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field2415;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1720933185
	)
	int field2406;

	public class211() {
		this.field2407 = 873252263;
		this.field2406 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lij;)V"
	)
	public class211(class211 var1) {
		this.field2407 = 873252263;
		this.field2406 = 0;
		if (var1 != null) {
			this.field2409 = var1.field2409;
			this.field2410 = var1.field2410;
			this.field2407 = var1.field2407;
			this.field2412 = var1.field2412;
			this.field2413 = var1.field2413;
			this.field2414 = var1.field2414;
			this.field2415 = null;
			this.field2406 = var1.field2406;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lik;",
		garbageValue = "-1105722482"
	)
	public class220 method4719() {
		return this.field2409;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lep;B)Z",
		garbageValue = "92"
	)
	public boolean method4720(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4767();

				try {
					this.field2412 = var1;
					this.field2415 = var3.request(new URL(this.field2412));
					this.field2407 = 0;
				} catch (MalformedURLException var5) {
					this.method4767();
					this.field2407 = 801958244;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2414 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1234871730"
	)
	public void method4765(String var1, String var2, String var3) {
		this.field2409 = BoundaryObject.method4686();
		this.field2413 = var1;
		this.field2409.method4849(this.field2413, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "-55769394"
	)
	public void method4748(UrlRequester var1) {
		switch(this.field2407 * 1158180329) {
		case 0:
			this.method4734(var1);
			break;
		case 1:
			this.method4735();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	public int method4723() {
		return this.field2407 * 1158180329;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-483001097"
	)
	public boolean method4724() {
		return this.field2410 != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1936165380"
	)
	public int method4755(String var1) {
		return this.field2410.field2508.containsKey(var1) ? (Integer)this.field2410.field2508.get(var1) : -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1890211195"
	)
	public String method4777(String var1) {
		return (String)((String)(this.field2410.field2501.containsKey(var1) ? this.field2410.field2501.get(var1) : null));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-65"
	)
	public ArrayList method4727() {
		return this.field2410.field2496;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-83"
	)
	public ArrayList method4761() {
		return this.field2410.field2497;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1390709494"
	)
	public ArrayList method4729() {
		return this.field2410.field2500;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1010587657"
	)
	public String method4730() {
		return this.field2410.field2499;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1614790105"
	)
	public float[] method4769() {
		return this.field2410.field2507;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-829589199"
	)
	public String method4732() {
		return this.field2410.method4900();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1934278939"
	)
	void method4767() {
		this.field2415 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "-727754131"
	)
	void method4734(UrlRequester var1) {
		if (this.field2415 != null && this.field2415.isDone()) {
			byte[] var2 = this.field2415.getResponse();
			if (var2 == null) {
				this.method4767();
				this.field2407 = 801958244;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2406 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4767();
						this.field2407 = -944546282;
						return;
					}

					if (this.field2406 < 2) {
						if (!this.field2410.method4901(var4, this.field2406, var1)) {
							this.field2407 = -944546282;
						}
					} else if (this.field2406 == 2) {
						class224 var5 = class224.field2520;
						var5.method4942(var4, this.field2406, var1);
						this.field2410 = var5.method4940(this.field2414);
						if (this.field2410 != null) {
							this.method4735();
							this.field2407 = -873252263;
						} else {
							this.field2407 = -1817798545;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4767();
					this.field2407 = -944546282;
					return;
				}

				if (this.field2410 != null) {
					this.field2407 = (!this.field2410.field2496.isEmpty() ? 1 : 2) * -873252263;
				}

				this.field2415 = null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1467222920"
	)
	void method4735() {
		Iterator var1 = this.field2410.field2496.iterator();

		class212 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2410.field2496.iterator();

				while (var1.hasNext()) {
					var2 = (class212)var1.next();
					if (var2.field2418 != null) {
						byte[] var3 = var2.field2418.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2407 = -1746504526;
							return;
						}
					}
				}

				this.method4767();
				this.field2407 = -71294019;
				return;
			}

			var2 = (class212)var1.next();
		} while(var2.field2418 == null || var2.field2418.isDone());

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lep;I)Z",
		garbageValue = "-1611081584"
	)
	public boolean method4736(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2406 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4767();
				this.field2407 = -944546282;
				return false;
			}

			if (!this.field2410.method4901(var3, this.field2406, var2)) {
				this.field2407 = -944546282;
			}

			this.field2407 = (!this.field2410.field2496.isEmpty() ? 1 : 2) * -873252263;
		} catch (UnsupportedEncodingException var6) {
			this.field2407 = -944546282;
		}

		return this.field2407 * 1158180329 < 3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2085572697"
	)
	static int method4779() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-830281969"
	)
	public static void method4778() {
		class255.field2136.clear();
	}
}
