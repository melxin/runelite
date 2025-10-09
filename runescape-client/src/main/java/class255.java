import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("jy")
public class class255 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	class264 field3073;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	class266 field3075;
	@ObfuscatedName("ad")
	int field3076;
	@ObfuscatedName("av")
	String field3077;
	@ObfuscatedName("as")
	String field3078;
	@ObfuscatedName("ar")
	String field3082;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field3080;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -280667347
	)
	int field3068;

	public class255() {
		this.field3076 = 813444669;
		this.field3068 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljy;)V"
	)
	public class255(class255 var1) {
		this.field3076 = 813444669;
		this.field3068 = 0;
		if (var1 != null) {
			this.field3073 = var1.field3073;
			this.field3075 = var1.field3075;
			this.field3076 = var1.field3076;
			this.field3077 = var1.field3077;
			this.field3078 = var1.field3078;
			this.field3082 = var1.field3082;
			this.field3080 = null;
			this.field3068 = var1.field3068;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)Lkb;",
		garbageValue = "6213"
	)
	public class264 method5916() {
		return this.field3073;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leu;I)Z",
		garbageValue = "-386916517"
	)
	public boolean method5871(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method5883();

				try {
					this.field3077 = var1;
					this.field3080 = var3.request(new URL(this.field3077));
					this.field3076 = 0;
				} catch (MalformedURLException var5) {
					this.method5883();
					this.field3076 = 1041188620;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field3082 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-809804111"
	)
	public void method5896(String var1, String var2, String var3) {
		this.field3073 = class32.method493();
		this.field3078 = var1;
		this.field3073.method5987(this.field3078, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)V",
		garbageValue = "872305391"
	)
	public void method5873(UrlRequester var1) {
		switch(this.field3076 * 1853794027) {
		case 0:
			this.method5913(var1);
			break;
		case 1:
			this.method5886();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1661581634"
	)
	public int method5874() {
		return this.field3076 * 1853794027;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1686268983"
	)
	public boolean method5875() {
		return this.field3075 != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2000641747"
	)
	public int method5901(String var1) {
		return this.field3075.field3164.containsKey(var1) ? (Integer)this.field3075.field3164.get(var1) : -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-53"
	)
	public String method5877(String var1) {
		return (String)((String)(this.field3075.field3173.containsKey(var1) ? this.field3075.field3173.get(var1) : null));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-341733085"
	)
	public ArrayList method5904() {
		return this.field3075.field3162;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "57"
	)
	public ArrayList method5919() {
		return this.field3075.field3167;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2011749831"
	)
	public ArrayList method5879() {
		return this.field3075.field3161;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "21"
	)
	public String method5880() {
		return this.field3075.field3174;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "144451328"
	)
	public float[] method5881() {
		return this.field3075.field3165;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "43"
	)
	public String method5891() {
		return this.field3075.method6014();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "76628131"
	)
	void method5883() {
		this.field3080 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Leu;B)V",
		garbageValue = "-17"
	)
	void method5913(UrlRequester var1) {
		if (this.field3080 != null && this.field3080.isDone()) {
			byte[] var2 = this.field3080.getResponse();
			if (var2 == null) {
				this.method5883();
				this.field3076 = 1041188620;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field3068 = var4.getInt("version");
					} catch (Exception var6) {
						this.method5883();
						this.field3076 = -585700718;
						return;
					}

					if (this.field3068 < 2) {
						if (!this.field3075.method6017(var4, this.field3068, var1)) {
							this.field3076 = -585700718;
						}
					} else if (this.field3068 == 2) {
						class268 var5 = FileSystem.method5953();
						var5.method6058(var4, this.field3068, var1);
						this.field3075 = var5.method6055(this.field3082);
						if (this.field3075 != null) {
							this.method5886();
							this.field3076 = -813444669;
						} else {
							this.field3076 = -1399145387;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method5883();
					this.field3076 = -585700718;
					return;
				}

				if (this.field3075 != null) {
					this.field3076 = (!this.field3075.field3162.isEmpty() ? 1 : 2) * -813444669;
				}

				this.field3080 = null;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1229800183"
	)
	void method5886() {
		Iterator var1 = this.field3075.field3162.iterator();

		class256 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field3075.field3162.iterator();

				while (var1.hasNext()) {
					var2 = (class256)var1.next();
					if (var2.field3091 != null) {
						byte[] var3 = var2.field3091.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field3076 = -1626889338;
							return;
						}
					}
				}

				this.method5883();
				this.field3076 = 227743951;
				return;
			}

			var2 = (class256)var1.next();
		} while(var2.field3091 == null || var2.field3091.isDone());

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leu;B)Z",
		garbageValue = "-87"
	)
	public boolean method5911(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field3068 = var3.getInt("version");
			} catch (Exception var5) {
				this.method5883();
				this.field3076 = -585700718;
				return false;
			}

			if (!this.field3075.method6017(var3, this.field3068, var2)) {
				this.field3076 = -585700718;
			}

			this.field3076 = (!this.field3075.field3162.isEmpty() ? 1 : 2) * -813444669;
		} catch (UnsupportedEncodingException var6) {
			this.field3076 = -585700718;
		}

		return this.field3076 * 1853794027 < 3;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "559880157"
	)
	static void method5920(int var0, int var1, int var2, int var3, int var4) {
		GrandExchangeOfferOwnWorldComparator.method790(class32.worldView, var0, var1, var2, var3, var4);
	}
}
