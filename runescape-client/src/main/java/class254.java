import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("je")
public class class254 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	class263 field3007;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	class265 field3010;
	@ObfuscatedName("ay")
	int field3011;
	@ObfuscatedName("aa")
	String field3009;
	@ObfuscatedName("ai")
	String field3013;
	@ObfuscatedName("ak")
	String field3014;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	UrlRequest field3015;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1330287975
	)
	int field3016;

	public class254() {
		this.field3011 = 1977373437;
		this.field3016 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	public class254(class254 var1) {
		this.field3011 = 1977373437;
		this.field3016 = 0;
		if (var1 != null) {
			this.field3007 = var1.field3007;
			this.field3010 = var1.field3010;
			this.field3011 = var1.field3011;
			this.field3009 = var1.field3009;
			this.field3013 = var1.field3013;
			this.field3014 = var1.field3014;
			this.field3015 = null;
			this.field3016 = var1.field3016;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lkg;",
		garbageValue = "-922401686"
	)
	public class263 method5809() {
		return this.field3007;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Les;B)Z",
		garbageValue = "-34"
	)
	public boolean method5829(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method5864();

				try {
					this.field3009 = var1;
					this.field3015 = var3.request(new URL(this.field3009));
					this.field3011 = 0;
				} catch (MalformedURLException var5) {
					this.method5864();
					this.field3011 = 680440844;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field3014 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "327680"
	)
	public void method5811(String var1, String var2, String var3) {
		this.field3007 = class190.method4289();
		this.field3013 = var1;
		this.field3007.method5938(this.field3013, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Les;B)V",
		garbageValue = "-51"
	)
	public void method5871(UrlRequester var1) {
		switch(this.field3011 * -1274141269) {
		case 0:
			this.method5824(var1);
			break;
		case 1:
			this.method5825();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	public int method5813() {
		return this.field3011 * -1274141269;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1351091653"
	)
	public boolean method5814() {
		return this.field3010 != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1781859107"
	)
	public int method5808(String var1) {
		return this.field3010.field3083.containsKey(var1) ? (Integer)this.field3010.field3083.get(var1) : -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1719283334"
	)
	public String method5816(String var1) {
		return (String)((String)(this.field3010.field3089.containsKey(var1) ? this.field3010.field3089.get(var1) : null));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2051955939"
	)
	public ArrayList method5817() {
		return this.field3010.field3085;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1103199383"
	)
	public ArrayList method5818() {
		return this.field3010.field3090;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-88"
	)
	public ArrayList method5819() {
		return this.field3010.field3084;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "82"
	)
	public String method5815() {
		return this.field3010.field3087;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-308619707"
	)
	public float[] method5821() {
		return this.field3010.field3088;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1943865581"
	)
	public String method5822() {
		return this.field3010.method5970();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21345"
	)
	void method5864() {
		this.field3015 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Les;B)V",
		garbageValue = "45"
	)
	void method5824(UrlRequester var1) {
		if (this.field3015 != null && this.field3015.isDone()) {
			byte[] var2 = this.field3015.getResponse();
			if (var2 == null) {
				this.method5864();
				this.field3011 = 680440844;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field3016 = var4.getInt("version");
					} catch (Exception var7) {
						this.method5864();
						this.field3011 = 1020661266;
						return;
					}

					if (this.field3016 < 2) {
						if (!this.field3010.method5973(var4, this.field3016, var1)) {
							this.field3011 = 1020661266;
						}
					} else if (this.field3016 == 2) {
						class267 var5 = class267.field3105;
						var5.method6018(var4, this.field3016, var1);
						this.field3010 = var5.method6016(this.field3014);
						if (this.field3010 != null) {
							this.method5825();
							this.field3011 = -1977373437;
						} else {
							this.field3011 = -956712171;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method5864();
					this.field3011 = 1020661266;
					return;
				}

				if (this.field3010 != null) {
					this.field3011 = (!this.field3010.field3085.isEmpty() ? 1 : 2) * -1977373437;
				}

				this.field3015 = null;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2114855442"
	)
	void method5825() {
		Iterator var1 = this.field3010.field3085.iterator();

		class255 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field3010.field3085.iterator();

				while (var1.hasNext()) {
					var2 = (class255)var1.next();
					if (var2.field3018 != null) {
						byte[] var3 = var2.field3018.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field3011 = 340220422;
							return;
						}
					}
				}

				this.method5864();
				this.field3011 = -1296932593;
				return;
			}

			var2 = (class255)var1.next();
		} while(var2.field3018 == null || var2.field3018.isDone());

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;I)Z",
		garbageValue = "-928283909"
	)
	public boolean method5826(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field3016 = var3.getInt("version");
			} catch (Exception var5) {
				this.method5864();
				this.field3011 = 1020661266;
				return false;
			}

			if (!this.field3010.method5973(var3, this.field3016, var2)) {
				this.field3011 = 1020661266;
			}

			this.field3011 = (!this.field3010.field3085.isEmpty() ? 1 : 2) * -1977373437;
		} catch (UnsupportedEncodingException var6) {
			this.field3011 = 1020661266;
		}

		return this.field3011 * -1274141269 < 3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-624317361"
	)
	static void method5872(String var0, String var1, String var2) {
		DynamicObject.method1987(7);
		class460.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "1471801000"
	)
	static int method5842(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
			ViewportMouse.method5644(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "1092855817"
	)
	static final void method5807(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (AbstractWorldMapData.method6798(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
