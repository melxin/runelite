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

@ObfuscatedName("is")
public class class217 {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class226 field2395;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	class228 field2396;
	@ObfuscatedName("ar")
	int field2394;
	@ObfuscatedName("ad")
	String field2391;
	@ObfuscatedName("af")
	String field2399;
	@ObfuscatedName("ak")
	String field2400;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	UrlRequest field2401;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 195764803
	)
	int field2397;

	public class217() {
		this.field2394 = 876180149;
		this.field2397 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lis;)V"
	)
	public class217(class217 var1) {
		this.field2394 = 876180149;
		this.field2397 = 0;
		if (var1 != null) {
			this.field2395 = var1.field2395;
			this.field2396 = var1.field2396;
			this.field2394 = var1.field2394;
			this.field2391 = var1.field2391;
			this.field2399 = var1.field2399;
			this.field2400 = var1.field2400;
			this.field2401 = null;
			this.field2397 = var1.field2397;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-713405175"
	)
	public class226 method4636() {
		return this.field2395;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Les;I)Z",
		garbageValue = "-1592321374"
	)
	public boolean method4637(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4650();

				try {
					this.field2391 = var1;
					this.field2401 = var3.request(new URL(this.field2391));
					this.field2394 = 0;
				} catch (MalformedURLException var5) {
					this.method4650();
					this.field2394 = 790246700;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2400 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-52542663"
	)
	public void method4688(String var1, String var2, String var3) {
		this.field2395 = VarcInt.method4037();
		this.field2399 = var1;
		this.field2395.method4762(this.field2399, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Les;I)V",
		garbageValue = "1579559358"
	)
	public void method4647(UrlRequester var1) {
		switch(this.field2394 * 211326051) {
		case 0:
			this.method4651(var1);
			break;
		case 1:
			this.method4652();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1121085973"
	)
	public int method4640() {
		return this.field2394 * 211326051;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-340483143"
	)
	public boolean method4681() {
		return this.field2396 != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-715660522"
	)
	public int method4648(String var1) {
		return this.field2396.field2494.containsKey(var1) ? (Integer)this.field2396.field2494.get(var1) : -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "918884352"
	)
	public String method4660(String var1) {
		return (String)((String)(this.field2396.field2493.containsKey(var1) ? this.field2396.field2493.get(var1) : null));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "106"
	)
	public ArrayList method4644() {
		return this.field2396.field2501;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "706895180"
	)
	public ArrayList method4645() {
		return this.field2396.field2492;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1850027091"
	)
	public ArrayList method4646() {
		return this.field2396.field2490;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-452937850"
	)
	public String method4670() {
		return this.field2396.field2497;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1280226072"
	)
	public float[] method4673() {
		return this.field2396.field2495;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "17"
	)
	public String method4678() {
		return this.field2396.method4793();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16780"
	)
	void method4650() {
		this.field2401 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Les;I)V",
		garbageValue = "1587902701"
	)
	void method4651(UrlRequester var1) {
		if (this.field2401 != null && this.field2401.isDone()) {
			byte[] var2 = this.field2401.getResponse();
			if (var2 == null) {
				this.method4650();
				this.field2394 = 790246700;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2397 = var4.getInt("version");
					} catch (Exception var6) {
						this.method4650();
						this.field2394 = -962113598;
						return;
					}

					if (this.field2397 < 2) {
						if (!this.field2396.method4795(var4, this.field2397, var1)) {
							this.field2394 = -962113598;
						}
					} else if (this.field2397 == 2) {
						class230 var5 = class144.method3627();
						var5.method4847(var4, this.field2397, var1);
						this.field2396 = var5.method4831(this.field2400);
						if (this.field2396 != null) {
							this.method4652();
							this.field2394 = -876180149;
						} else {
							this.field2394 = -1838293747;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method4650();
					this.field2394 = -962113598;
					return;
				}

				if (this.field2396 != null) {
					this.field2394 = (!this.field2396.field2501.isEmpty() ? 1 : 2) * -876180149;
				}

				this.field2401 = null;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-985247295"
	)
	void method4652() {
		Iterator var1 = this.field2396.field2501.iterator();

		class218 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2396.field2501.iterator();

				while (var1.hasNext()) {
					var2 = (class218)var1.next();
					if (var2.field2406 != null) {
						byte[] var3 = var2.field2406.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2394 = -1752360298;
							return;
						}
					}
				}

				this.method4650();
				this.field2394 = -85933449;
				return;
			}

			var2 = (class218)var1.next();
		} while(var2.field2406 == null || var2.field2406.isDone());

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;I)Z",
		garbageValue = "2147088926"
	)
	public boolean method4642(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2397 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4650();
				this.field2394 = -962113598;
				return false;
			}

			if (!this.field2396.method4795(var3, this.field2397, var2)) {
				this.field2394 = -962113598;
			}

			this.field2394 = (!this.field2396.field2501.isEmpty() ? 1 : 2) * -876180149;
		} catch (UnsupportedEncodingException var6) {
			this.field2394 = -962113598;
		}

		return this.field2394 * 211326051 < 3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-609126342"
	)
	public static int method4697(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "-14"
	)
	static void method4696(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = (var0[1] - 2.0F) * var0[1] + (var0[1] + (var0[0] - 2.0F)) * var0[0] + 1.0F;
			if (class132.field1558 + var1 > 0.0F) {
				PcmPlayer.method2962(var0);
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "3"
	)
	static final void method4695(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method5136();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var14 = Message.method738(var11, var8, var1, var0);
			int var15 = UserComparator8.method3395(var11, var8, var1, var0);
			var11 = var14;
			var14 = Message.method738(var13, var9, var1, var0);
			var9 = UserComparator8.method3395(var13, var9, var1, var0);
			var13 = var14;
			var14 = class230.method4848(var10, var15, var3, var2);
			var15 = WorldMapLabelSize.method6163(var10, var15, var3, var2);
			var10 = var14;
			var14 = class230.method4848(var12, var9, var3, var2);
			var9 = WorldMapLabelSize.method6163(var12, var9, var3, var2);
			class188.method4104(var10, var11, var15, var14, var13, var9);
		}
	}
}
