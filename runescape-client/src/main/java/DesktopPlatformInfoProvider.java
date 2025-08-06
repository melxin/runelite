import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class543 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -799001147
	)
	int field5505;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1871714381
	)
	int field5509;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -757534981
	)
	int field5508;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lut;",
		garbageValue = "1078448057"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (HorizontalAlignment.osNameLowercase.startsWith("win")) {
			var1 = 1;
		} else if (HorizontalAlignment.osNameLowercase.startsWith("mac")) {
			var1 = 2;
		} else if (HorizontalAlignment.osNameLowercase.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var34) {
			var2 = "";
		}

		String var4;
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var33) {
			var4 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var32) {
			var3 = "";
		}

		String var5 = "Unknown";
		String var6 = "1.1";

		try {
			var5 = System.getProperty("java.vendor");
			var6 = System.getProperty("java.version");
		} catch (Exception var31) {
		}

		boolean var30;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var30 = false;
		} else {
			var30 = true;
		}

		byte var8 = 0;
		if (var1 == 1) {
			if (var3.indexOf("4.0") != -1) {
				var8 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var8 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var8 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var8 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var8 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var8 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var8 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var8 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var8 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var8 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				if (var4.indexOf("11") != -1) {
					var8 = 12;
				} else {
					var8 = 11;
				}
			} else if (var3.indexOf("11.0") != -1) {
				var8 = 12;
			}
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var8 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var8 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var8 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var8 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var8 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var8 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var8 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var8 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var8 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var8 = 29;
			} else if (var3.indexOf("10.14") != -1) {
				var8 = 30;
			} else if (var3.indexOf("10.15") != -1) {
				var8 = 31;
			} else if (var3.indexOf("11.") != -1) {
				var8 = 32;
			} else if (var3.indexOf("12.") != -1) {
				var8 = 33;
			} else if (var3.indexOf("13.") != -1) {
				var8 = 34;
			} else if (var3.indexOf("14.") != -1) {
				var8 = 35;
			}
		}

		byte var9;
		if (var5.toLowerCase().indexOf("sun") != -1) {
			var9 = 1;
		} else if (var5.toLowerCase().indexOf("microsoft") != -1) {
			var9 = 2;
		} else if (var5.toLowerCase().indexOf("apple") != -1) {
			var9 = 3;
		} else if (var5.toLowerCase().indexOf("oracle") != -1) {
			var9 = 5;
		} else {
			var9 = 4;
		}

		this.method10606(var6);
		boolean var10 = false;
		int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var12;
		if (this.field5505 > 3) {
			var12 = Runtime.getRuntime().availableProcessors();
		} else {
			var12 = 0;
		}

		byte var13 = 0;
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		String var19 = "";
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		boolean var23 = false;
		int[] var24 = new int[3];
		boolean var25 = false;
		String var26 = "";
		String var27 = "";
		String var28 = "";
		boolean var29 = false;
		return new PlatformInfo(var1, var30, var8, var9, this.field5505, this.field5509, this.field5508, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "", "", var28);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-278600206"
	)
	void method10606(String var1) {
		if (var1.startsWith("1.")) {
			this.method10601(var1);
		} else {
			this.method10599(var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "771373613"
	)
	void method10601(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field5505 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field5509 = Integer.parseInt(var2[0]);
			this.field5508 = Integer.parseInt(var2[1]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-282454261"
	)
	void method10599(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field5505 = Integer.parseInt(var2[0]);
			this.field5509 = Integer.parseInt(var2[1]);
			this.field5508 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1775443399"
	)
	static final void method10613() {
		PacketBufferNode var0 = class291.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field645 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				WorldMapCacheName.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			ApproximateRouteStrategy.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field645 = false;
	}
}
