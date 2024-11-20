import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class216 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	class225 field2347;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	class227 field2351;
	@ObfuscatedName("ai")
	int field2352;
	@ObfuscatedName("al")
	String field2359;
	@ObfuscatedName("ar")
	String field2350;
	@ObfuscatedName("as")
	String field2353;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	UrlRequest field2356;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 272310243
	)
	int field2357;

	public class216() {
		this.field2352 = -261922735;
		this.field2357 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	public class216(class216 var1) {
		this.field2352 = -261922735;
		this.field2357 = 0;
		if (var1 != null) {
			this.field2347 = var1.field2347;
			this.field2351 = var1.field2351;
			this.field2352 = var1.field2352;
			this.field2359 = var1.field2359;
			this.field2350 = var1.field2350;
			this.field2353 = var1.field2353;
			this.field2356 = null;
			this.field2357 = var1.field2357;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1989756788"
	)
	public class225 method4366() {
		return this.field2347;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
		garbageValue = "332352349"
	)
	public boolean method4342(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4333();

				try {
					this.field2359 = var1;
					this.field2356 = var3.request(new URL(this.field2359));
					this.field2352 = 0;
				} catch (MalformedURLException var5) {
					this.method4333();
					this.field2352 = 1047690940;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2353 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2010217327"
	)
	public void method4330(String var1, String var2, String var3) {
		this.field2347 = Actor.method2671();
		this.field2350 = var1;
		this.field2347.method4474(this.field2350, var2, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-118566408"
	)
	public void method4356(UrlRequester var1) {
		switch(this.field2352 * 458102607) {
		case 0:
			this.method4332(var1);
			break;
		case 1:
			this.method4346();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	public int method4335() {
		return this.field2352 * 458102607;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2005295412"
	)
	public boolean method4336() {
		return this.field2351 != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-24177"
	)
	public int method4337(String var1) {
		return this.field2351.field2447.containsKey(var1) ? (Integer)this.field2351.field2447.get(var1) : -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1638714395"
	)
	public String method4338(String var1) {
		return (String)((String)(this.field2351.field2448.containsKey(var1) ? this.field2351.field2448.get(var1) : null));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1186730757"
	)
	public ArrayList method4339() {
		return this.field2351.field2443;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "130553331"
	)
	public ArrayList method4340() {
		return this.field2351.field2444;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1930146813"
	)
	public ArrayList method4381() {
		return this.field2351.field2442;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1532383156"
	)
	public String method4382() {
		return this.field2351.field2445;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1954339188"
	)
	public float[] method4364() {
		return this.field2351.field2446;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "712176299"
	)
	public String method4343() {
		return this.field2351.method4522();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1662107614"
	)
	void method4333() {
		this.field2356 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-1268349001"
	)
	void method4332(UrlRequester var1) {
		if (this.field2356 != null && this.field2356.isDone()) {
			byte[] var2 = this.field2356.getResponse();
			if (var2 == null) {
				this.method4333();
				this.field2352 = 1047690940;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2357 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4333();
						this.field2352 = 1571536410;
						return;
					}

					if (this.field2357 < 2) {
						if (!this.field2351.method4486(var4, this.field2357, var1)) {
							this.field2352 = 1571536410;
						}
					} else if (this.field2357 == 2) {
						class229 var5 = class229.field2466;
						var5.method4530(var4, this.field2357, var1);
						this.field2351 = var5.method4533(this.field2353);
						if (this.field2351 != null) {
							this.method4346();
							this.field2352 = 261922735;
						} else {
							this.field2352 = 1833459145;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4333();
					this.field2352 = 1571536410;
					return;
				}

				if (this.field2351 != null) {
					this.field2352 = (this.field2351.field2443.size() > 0 ? 1 : 2) * 261922735;
				}

				this.field2356 = null;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	void method4346() {
		Iterator var1 = this.field2351.field2443.iterator();

		class217 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2351.field2443.iterator();

				while (var1.hasNext()) {
					var2 = (class217)var1.next();
					if (var2.field2361 != null) {
						byte[] var3 = var2.field2361.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2352 = 523845470;
							return;
						}
					}
				}

				this.method4333();
				this.field2352 = 1309613675;
				return;
			}

			var2 = (class217)var1.next();
		} while(var2.field2361 == null || var2.field2361.isDone());

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)Z",
		garbageValue = "2"
	)
	public boolean method4344(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2357 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4333();
				this.field2352 = 1571536410;
				return false;
			}

			if (!this.field2351.method4486(var3, this.field2357, var2)) {
				this.field2352 = 1571536410;
			}

			this.field2352 = (this.field2351.field2443.size() > 0 ? 1 : 2) * 261922735;
		} catch (UnsupportedEncodingException var6) {
			this.field2352 = 1571536410;
		}

		return this.field2352 * 458102607 < 3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)[Loc;",
		garbageValue = "5727"
	)
	public static StudioGame[] method4384() {
		return new StudioGame[]{StudioGame.game3, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game5, StudioGame.runescape, StudioGame.game4};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1555276061"
	)
	static final void method4331() {
		HttpRequestTask.method269("Your friend list is full. Max of 200 for free users, and 400 for members");
	}
}
