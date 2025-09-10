import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONObject;

@ObfuscatedName("jo")
public class class256 {
	@ObfuscatedName("ad")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static class525 field3085;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	class265 field3084;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	class267 field3076;
	@ObfuscatedName("aa")
	int field3077;
	@ObfuscatedName("am")
	String field3081;
	@ObfuscatedName("an")
	String field3078;
	@ObfuscatedName("ar")
	String field3080;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field3082;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 440288245
	)
	int field3069;

	public class256() {
		this.field3077 = -960936447;
		this.field3069 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljo;)V"
	)
	public class256(class256 var1) {
		this.field3077 = -960936447;
		this.field3069 = 0;
		if (var1 != null) {
			this.field3084 = var1.field3084;
			this.field3076 = var1.field3076;
			this.field3077 = var1.field3077;
			this.field3081 = var1.field3081;
			this.field3078 = var1.field3078;
			this.field3080 = var1.field3080;
			this.field3082 = null;
			this.field3069 = var1.field3069;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lkd;",
		garbageValue = "552921592"
	)
	public class265 method5816() {
		return this.field3084;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
		garbageValue = "-156026336"
	)
	public boolean method5872(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method5835();

				try {
					this.field3081 = var1;
					this.field3082 = var3.request(new URL(this.field3081));
					this.field3077 = 0;
				} catch (MalformedURLException var5) {
					this.method5835();
					this.field3077 = -451221508;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field3080 = var2;
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
		garbageValue = "-1047333848"
	)
	public void method5818(String var1, String var2, String var3) {
		this.field3084 = class259.method5905();
		this.field3078 = var1;
		this.field3084.method5964(this.field3078, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lel;S)V",
		garbageValue = "-16654"
	)
	public void method5819(UrlRequester var1) {
		switch(this.field3077 * 1603618303) {
		case 0:
			this.method5830(var1);
			break;
		case 1:
			this.method5831();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	public int method5853() {
		return this.field3077 * 1603618303;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-28"
	)
	public boolean method5821() {
		return this.field3076 != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "234030589"
	)
	public int method5828(String var1) {
		return this.field3076.field3160.containsKey(var1) ? (Integer)this.field3076.field3160.get(var1) : -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1553583606"
	)
	public String method5873(String var1) {
		return (String)((String)(this.field3076.field3169.containsKey(var1) ? this.field3076.field3169.get(var1) : null));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-38"
	)
	public ArrayList method5824() {
		return this.field3076.field3165;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "9"
	)
	public ArrayList method5817() {
		return this.field3076.field3163;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1345785871"
	)
	public ArrayList method5820() {
		return this.field3076.field3162;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method5827() {
		return this.field3076.field3164;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	public float[] method5844() {
		return this.field3076.field3171;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1796113041"
	)
	public String method5825() {
		return this.field3076.method5996();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1562701157"
	)
	void method5835() {
		this.field3082 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-639285166"
	)
	void method5830(UrlRequester var1) {
		if (this.field3082 != null && this.field3082.isDone()) {
			byte[] var2 = this.field3082.getResponse();
			if (var2 == null) {
				this.method5835();
				this.field3077 = -451221508;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field3069 = var4.getInt("version");
					} catch (Exception var7) {
						this.method5835();
						this.field3077 = 1470651386;
						return;
					}

					if (this.field3069 < 2) {
						if (!this.field3076.method5999(var4, this.field3069, var1)) {
							this.field3077 = 1470651386;
						}
					} else if (this.field3069 == 2) {
						class269 var5 = class269.field3180;
						var5.method6046(var4, this.field3069, var1);
						this.field3076 = var5.method6048(this.field3080);
						if (this.field3076 != null) {
							this.method5831();
							this.field3077 = 960936447;
						} else {
							this.field3077 = -1863379463;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method5835();
					this.field3077 = 1470651386;
					return;
				}

				if (this.field3076 != null) {
					this.field3077 = (!this.field3076.field3165.isEmpty() ? 1 : 2) * 960936447;
				}

				this.field3082 = null;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1790959850"
	)
	void method5831() {
		Iterator var1 = this.field3076.field3165.iterator();

		class257 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field3076.field3165.iterator();

				while (var1.hasNext()) {
					var2 = (class257)var1.next();
					if (var2.field3088 != null) {
						byte[] var3 = var2.field3088.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field3077 = 1921872894;
							return;
						}
					}
				}

				this.method5835();
				this.field3077 = 509714939;
				return;
			}

			var2 = (class257)var1.next();
		} while(var2.field3088 == null || var2.field3088.isDone());

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "-1064658402"
	)
	public boolean method5832(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field3069 = var3.getInt("version");
			} catch (Exception var5) {
				this.method5835();
				this.field3077 = 1470651386;
				return false;
			}

			if (!this.field3076.method5999(var3, this.field3069, var2)) {
				this.field3077 = 1470651386;
			}

			this.field3077 = (!this.field3076.field3165.isEmpty() ? 1 : 2) * 960936447;
		} catch (UnsupportedEncodingException var6) {
			this.field3077 = 1470651386;
		}

		return this.field3077 * 1603618303 < 3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "-7"
	)
	static int method5829(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			UserComparator7.Interpreter_intStackSize -= 2;
			Client.field367 = (short)class4.method16(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]);
			if (Client.field367 <= 0) {
				Client.field367 = 256;
			}

			Client.field368 = (short)class4.method16(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
			if (Client.field368 <= 0) {
				Client.field368 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			UserComparator7.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			UserComparator7.Interpreter_intStackSize -= 4;
			Client.field371 = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			if (Client.field371 <= 0) {
				Client.field371 = 1;
			}

			Client.field364 = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			if (Client.field364 <= 0) {
				Client.field364 = 32767;
			} else if (Client.field364 < Client.field371) {
				Client.field364 = Client.field371;
			}

			Client.field419 = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			if (Client.field419 <= 0) {
				Client.field419 = 1;
			}

			Client.field382 = (short)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3];
			if (Client.field382 <= 0) {
				Client.field382 = 32767;
			} else if (Client.field382 < Client.field419) {
				Client.field382 = Client.field419;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				WorldMapSectionType.setViewportShape(0, 0, Client.viewportWidget.width * 469894397, Client.viewportWidget.height * 1156037777, false);
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class456.method9206(Client.field367);
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class456.method9206(Client.field368);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class396.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
