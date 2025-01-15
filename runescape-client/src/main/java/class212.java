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

@ObfuscatedName("ii")
public class class212 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class221 field2361;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	class223 field2369;
	@ObfuscatedName("as")
	int field2368;
	@ObfuscatedName("aq")
	String field2359;
	@ObfuscatedName("af")
	String field2365;
	@ObfuscatedName("aa")
	String field2363;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	UrlRequest field2367;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 771654159
	)
	int field2354;

	public class212() {
		this.field2368 = 1436922261;
		this.field2354 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lii;)V"
	)
	public class212(class212 var1) {
		this.field2368 = 1436922261;
		this.field2354 = 0;
		if (var1 != null) {
			this.field2361 = var1.field2361;
			this.field2369 = var1.field2369;
			this.field2368 = var1.field2368;
			this.field2359 = var1.field2359;
			this.field2365 = var1.field2365;
			this.field2363 = var1.field2363;
			this.field2367 = null;
			this.field2354 = var1.field2354;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "1449451292"
	)
	public class221 method4873() {
		return this.field2361;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lez;I)Z",
		garbageValue = "-545197436"
	)
	public boolean method4862(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4854();

				try {
					this.field2359 = var1;
					this.field2367 = var3.request(new URL(this.field2359));
					this.field2368 = 0;
				} catch (MalformedURLException var5) {
					this.method4854();
					this.field2368 = -1452721748;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2363 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "437756040"
	)
	public void method4842(String var1, String var2, String var3) {
		this.field2361 = class143.method3517();
		this.field2365 = var1;
		this.field2361.method4975(this.field2365, var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lez;B)V",
		garbageValue = "-49"
	)
	public void method4843(UrlRequester var1) {
		switch(this.field2368 * 1910697539) {
		case 0:
			this.method4855(var1);
			break;
		case 1:
			this.method4872();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method4903() {
		return this.field2368 * 1910697539;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-106981991"
	)
	public boolean method4845() {
		return this.field2369 != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "89"
	)
	public int method4846(String var1) {
		return this.field2369.field2441.containsKey(var1) ? (Integer)this.field2369.field2441.get(var1) : -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1417697798"
	)
	public String method4848(String var1) {
		return (String)((String)(this.field2369.field2446.containsKey(var1) ? this.field2369.field2446.get(var1) : null));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1990120736"
	)
	public ArrayList method4902() {
		return this.field2369.field2444;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2070590612"
	)
	public ArrayList method4840() {
		return this.field2369.field2442;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "5"
	)
	public ArrayList method4850() {
		return this.field2369.field2440;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1997297098"
	)
	public String method4856() {
		return this.field2369.field2443;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-31"
	)
	public float[] method4852() {
		return this.field2369.field2439;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "96"
	)
	public String method4853() {
		return this.field2369.method5006();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "275632040"
	)
	void method4854() {
		this.field2367 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1659335661"
	)
	void method4855(UrlRequester var1) {
		if (this.field2367 != null && this.field2367.isDone()) {
			byte[] var2 = this.field2367.getResponse();
			if (var2 == null) {
				this.method4854();
				this.field2368 = -1452721748;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2354 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4854();
						this.field2368 = -31598974;
						return;
					}

					if (this.field2354 < 2) {
						if (!this.field2369.method5007(var4, this.field2354, var1)) {
							this.field2368 = -31598974;
						}
					} else if (this.field2354 == 2) {
						class225 var5 = class225.field2458;
						var5.method5051(var4, this.field2354, var1);
						this.field2369 = var5.method5047(this.field2363);
						if (this.field2369 != null) {
							this.method4872();
							this.field2368 = -1436922261;
						} else {
							this.field2368 = -1468521235;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4854();
					this.field2368 = -31598974;
					return;
				}

				if (this.field2369 != null) {
					this.field2368 = (this.field2369.field2444.size() > 0 ? 1 : 2) * -1436922261;
				}

				this.field2367 = null;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1762713959"
	)
	void method4872() {
		Iterator var1 = this.field2369.field2444.iterator();

		class213 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2369.field2444.iterator();

				while (var1.hasNext()) {
					var2 = (class213)var1.next();
					if (var2.field2373 != null) {
						byte[] var3 = var2.field2373.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2368 = 1421122774;
							return;
						}
					}
				}

				this.method4854();
				this.field2368 = 1405323287;
				return;
			}

			var2 = (class213)var1.next();
		} while(var2.field2373 == null || var2.field2373.isDone());

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lez;I)Z",
		garbageValue = "2043188933"
	)
	public boolean method4857(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2354 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4854();
				this.field2368 = -31598974;
				return false;
			}

			if (!this.field2369.method5007(var3, this.field2354, var2)) {
				this.field2368 = -31598974;
			}

			this.field2368 = (this.field2369.field2444.size() > 0 ? 1 : 2) * -1436922261;
		} catch (UnsupportedEncodingException var6) {
			this.field2368 = -31598974;
		}

		return this.field2368 * 1910697539 < 3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1891123145"
	)
	static final boolean method4905(int var0) {
		return var0 == 1 || var0 == 2 || var0 >= 3 && var0 <= 6 || var0 == 1001;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1684634399"
	)
	static final String method4858(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2113223016"
	)
	static void method4849() {
		if (class280.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-309856839"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ScriptEvent.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntIME(var0);
		var2.packetBuffer.writeShortAddLE(var1);
		Client.packetWriter.addNode(var2);
	}
}
