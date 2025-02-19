import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class213 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2386;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2377;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2391;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class213 field2379;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2380;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class213 field2381;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2382;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2383;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2385;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2392;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2376;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	public static final class213 field2389;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2388;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class213 field2384;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 51702413
	)
	public final int field2390;

	static {
		field2386 = new class213(0);
		field2377 = new class213(1);
		field2391 = new class213(2);
		field2379 = new class213(3);
		field2380 = new class213(4);
		field2381 = new class213(5);
		field2382 = new class213(6);
		field2383 = new class213(7);
		field2385 = new class213(8);
		field2392 = new class213(9);
		field2376 = new class213(10);
		field2389 = new class213(11);
		field2388 = new class213(12);
		field2384 = new class213(13);
	}

	class213(int var1) {
		this.field2390 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-403349237"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = class59.method1137(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + class176.RunException_revision + "&cs=" + RunException.field5742 + "&u=" + RunException.field5741 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5743 + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "354696238"
	)
	static int method4365(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
