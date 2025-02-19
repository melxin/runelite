import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ir")
public class class225 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2465;
	@ObfuscatedName("ab")
	String field2469;
	@ObfuscatedName("ay")
	String field2456;
	@ObfuscatedName("au")
	String field2457;
	@ObfuscatedName("ad")
	String field2458;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 6093779114052399183L
	)
	long field2459;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	AsyncRestClient field2460;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	AsyncHttpResponse field2464;
	@ObfuscatedName("af")
	final int field2462;
	@ObfuscatedName("aa")
	final int field2463;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 550170313
	)
	int field2461;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1068682273
	)
	int field2455;
	@ObfuscatedName("av")
	String field2466;
	@ObfuscatedName("ag")
	boolean field2468;

	static {
		field2465 = new class225();
	}

	class225() {
		this.field2469 = "";
		this.field2456 = "";
		this.field2457 = "";
		this.field2458 = "";
		this.field2459 = -1L;
		this.field2462 = 1;
		this.field2463 = 2;
		this.field2461 = 1;
		this.field2455 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "26984"
	)
	public void method4531(int var1, String var2) {
		this.field2455 = var1;
		this.field2466 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1884463056"
	)
	public void method4515(boolean var1) {
		this.field2468 = var1;
		this.field2460 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2094749228"
	)
	void method4516(String var1, String var2, String var3) {
		if (this.field2461 != 2) {
			this.field2469 = var1;
			this.field2456 = var2;
			this.field2457 = var3;
			if (!this.field2469.endsWith("/")) {
				this.field2469 = this.field2469 + "/";
			}

			if (!this.field2456.equals("")) {
				String var4 = this.field2469;
				var4 = var4 + "session/open/" + this.field2456;
				if (this.field2457.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2457;

				try {
					this.field2464 = this.method4522(var4);
					this.field2459 = InterfaceParent.method2434();
				} catch (IOException var6) {
					this.field2464 = null;
					this.field2456 = "";
					this.field2457 = "";
				}

			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "268259479"
	)
	public void method4517() {
		if (this.field2464 == null) {
			if (!this.field2458.isEmpty() && this.field2461 == 1) {
				long var1 = InterfaceParent.method2434();
				long var3 = var1 - this.field2459;
				String var5 = this.field2469;
				var5 = var5 + "session/close/" + this.field2456 + "/" + this.field2458;
				if (this.field2457.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2457 + "&sessionDuration=" + var3;
				}

				try {
					this.field2464 = this.method4522(var5);
				} catch (IOException var7) {
					this.field2461 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method4518() {
		if (this.field2460 != null) {
			this.field2460.shutdown();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2088091332"
	)
	void method4519() {
		if (!this.field2458.isEmpty()) {
			String var1 = "";
			switch(this.field2455) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2466.isEmpty()) {
				String var2 = this.field2469;
				var2 = var2 + var1 + "/" + this.field2456 + "/" + this.field2458 + "/" + this.field2466 + "?userHash=" + this.field2457;

				try {
					this.field2464 = this.method4522(var2);
				} catch (IOException var4) {
					this.field2461 = 1;
				}

				this.field2461 = 1;
				this.field2455 = 0;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "387002123"
	)
	public void method4520() {
		if (this.field2464 != null && this.field2464.hasFinished()) {
			if (this.field2464.hasFinished() && this.field2464.await().getResponseCode() == 200 && this.field2458.isEmpty()) {
				String var1 = this.field2464.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2458 = var1;
			}

			if (this.field2455 != 0) {
				this.method4519();
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1771182516"
	)
	public boolean method4546(String var1) {
		this.method4531(2, var1);
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Laz;",
		garbageValue = "1949261915"
	)
	AsyncHttpResponse method4522(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2468);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2460.submitRequest(var3);
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "([Lnz;IB)V",
		garbageValue = "91"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !PendingSpawn.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && PendingSpawn.isComponentHidden(var3) && var3 != class27.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class279.method5831(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = class60.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = WorldMapData_1.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; MilliClock.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.getMayaAnimFrame();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								MilliClock.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3988 != 0 && !var3.isIf3) {
						int var9 = var3.field3988 >> 16;
						var5 = var3.field3988 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						MilliClock.invalidateWidget(var3);
					}
				}
			}
		}

	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class272.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
