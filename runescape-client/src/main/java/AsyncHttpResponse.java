import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 634158813
	)
	static int field79;
	@ObfuscatedName("gv")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class539 field75;
	@ObfuscatedName("ay")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("ah")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method277(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2043229210"
	)
	void method277(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1897963977"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1635286519"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "11366892"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lai;",
		garbageValue = "-128"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method277(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Luo;I)Ljava/lang/String;",
		garbageValue = "512695713"
	)
	public static String method270(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var14 = var3 - var2;
			if (var14 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5357) {
					case 7:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var14 <= var6) {
					StringBuilder var12 = new StringBuilder(var14);

					for (int var15 = var2; var15 < var3; ++var15) {
						char var7 = var0.charAt(var15);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (WorldEntityCoord.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class535.field5359;
							int var10 = 0;

							label102:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class535.field5360;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label102;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var7 == var11) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13 = class323.method6620(var7);
							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1536678022"
	)
	public static void method275() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)V",
		garbageValue = "2"
	)
	static final void method284(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field621 == -1) {
				Client.field621 = var0.spriteId2;
				Client.field783 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field621;
			} else {
				var0.spriteId2 = Client.field783;
			}

		} else if (var1 == 325) {
			if (Client.field621 == -1) {
				Client.field621 = var0.spriteId2;
				Client.field783 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field783;
			} else {
				var0.spriteId2 = Client.field621;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
