import java.io.File;
import java.io.IOException;
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

@ObfuscatedName("ix")
public class class225 {
	@ObfuscatedName("av")
	@Export("RunException_applet")
	public static URL RunException_applet;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static ClanChannel field2554;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	class234 field2546;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	class236 field2549;
	@ObfuscatedName("az")
	int field2547;
	@ObfuscatedName("ad")
	String field2545;
	@ObfuscatedName("ai")
	String field2544;
	@ObfuscatedName("as")
	String field2550;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	UrlRequest field2551;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2049988277
	)
	int field2552;

	public class225() {
		this.field2547 = -944674513;
		this.field2552 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	public class225(class225 var1) {
		this.field2547 = -944674513;
		this.field2552 = 0;
		if (var1 != null) {
			this.field2546 = var1.field2546;
			this.field2549 = var1.field2549;
			this.field2547 = var1.field2547;
			this.field2545 = var1.field2545;
			this.field2544 = var1.field2544;
			this.field2550 = var1.field2550;
			this.field2551 = null;
			this.field2552 = var1.field2552;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljj;",
		garbageValue = "33"
	)
	public class234 method5046() {
		return this.field2546;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;I)Z",
		garbageValue = "1665097058"
	)
	public boolean method5005(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method5018();

				try {
					this.field2545 = var1;
					this.field2551 = var3.request(new URL(this.field2545));
					this.field2547 = 0;
				} catch (MalformedURLException var5) {
					this.method5018();
					this.field2547 = -516269244;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2550 = var2;
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
		garbageValue = "-101184073"
	)
	public void method5006(String var1, String var2, String var3) {
		this.field2546 = WorldMapArea.method6664();
		this.field2544 = var1;
		this.field2546.method5155(this.field2544, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "-1589921768"
	)
	public void method5007(UrlRequester var1) {
		switch(this.field2547 * -1607499215) {
		case 0:
			this.method5019(var1);
			break;
		case 1:
			this.method5020();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "333565326"
	)
	public int method5043() {
		return this.field2547 * -1607499215;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public boolean method5009() {
		return this.field2549 != null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-263959236"
	)
	public int method5010(String var1) {
		return this.field2549.field2646.containsKey(var1) ? (Integer)this.field2549.field2646.get(var1) : -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "273409166"
	)
	public String method5011(String var1) {
		return (String)((String)(this.field2549.field2647.containsKey(var1) ? this.field2549.field2647.get(var1) : null));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1138993808"
	)
	public ArrayList method5033() {
		return this.field2549.field2642;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-831431038"
	)
	public ArrayList method5004() {
		return this.field2549.field2648;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-109514321"
	)
	public ArrayList method5014() {
		return this.field2549.field2641;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "65"
	)
	public String method5029() {
		return this.field2549.field2644;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1177334885"
	)
	public float[] method5016() {
		return this.field2549.field2645;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "25"
	)
	public String method5017() {
		return this.field2549.method5166();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1986121800"
	)
	void method5018() {
		this.field2551 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "340427984"
	)
	void method5019(UrlRequester var1) {
		if (this.field2551 != null && this.field2551.isDone()) {
			byte[] var2 = this.field2551.getResponse();
			if (var2 == null) {
				this.method5018();
				this.field2547 = -516269244;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2552 = var4.getInt("version");
					} catch (Exception var7) {
						this.method5018();
						this.field2547 = 1373079782;
						return;
					}

					if (this.field2552 < 2) {
						if (!this.field2549.method5186(var4, this.field2552, var1)) {
							this.field2547 = 1373079782;
						}
					} else if (this.field2552 == 2) {
						class238 var5 = class238.field2661;
						var5.method5215(var4, this.field2552, var1);
						this.field2549 = var5.method5220(this.field2550);
						if (this.field2549 != null) {
							this.method5020();
							this.field2547 = 944674513;
						} else {
							this.field2547 = -1977213001;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method5018();
					this.field2547 = 1373079782;
					return;
				}

				if (this.field2549 != null) {
					this.field2547 = (!this.field2549.field2642.isEmpty() ? 1 : 2) * 944674513;
				}

				this.field2551 = null;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1004715746"
	)
	void method5020() {
		Iterator var1 = this.field2549.field2642.iterator();

		class226 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2549.field2642.iterator();

				while (var1.hasNext()) {
					var2 = (class226)var1.next();
					if (var2.field2559 != null) {
						byte[] var3 = var2.field2559.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2547 = 1889349026;
							return;
						}
					}
				}

				this.method5018();
				this.field2547 = 428405269;
				return;
			}

			var2 = (class226)var1.next();
		} while(var2.field2559 == null || var2.field2559.isDone());

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lei;B)Z",
		garbageValue = "-96"
	)
	public boolean method5042(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2552 = var3.getInt("version");
			} catch (Exception var5) {
				this.method5018();
				this.field2547 = 1373079782;
				return false;
			}

			if (!this.field2549.method5186(var3, this.field2552, var2)) {
				this.field2547 = 1373079782;
			}

			this.field2547 = (!this.field2549.field2642.isEmpty() ? 1 : 2) * 944674513;
		} catch (UnsupportedEncodingException var6) {
			this.field2547 = 1373079782;
		}

		return this.field2547 * -1607499215 < 3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhy;",
		garbageValue = "12"
	)
	public static KitDefinition method5030(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-816742396"
	)
	public static int method5054(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1444084843"
	)
	static void method5013(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(SoundCache.field1347, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset * 2108391709);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}
}
