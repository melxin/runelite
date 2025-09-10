import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class305 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-107"
	)
	public static void method6838(int var0) {
		if (!class339.midiRequests.isEmpty()) {
			Iterator var1 = class339.midiRequests.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MidiRequest var3 = (MidiRequest)class339.midiRequests.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field4010) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field4002 = (float)var0;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1440103269"
	)
	public static int method6834(int var0, int var1, int var2) {
		int var3 = Client.method1134(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIILrj;IIIB)Z",
		garbageValue = "-8"
	)
	static final boolean method6837(Model var0, int var1, int var2, int var3, int var4, TransformationMatrix var5, int var6, int var7, int var8) {
		boolean var9 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var9) {
			return false;
		} else {
			Clock.method6079(var5, var6, var7, var8);
			return class429.method8641(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;IB)V",
		garbageValue = "15"
	)
	public static void method6836(DynamicArray var0, DynamicArray var1, int var2) {
		class374.method8144(var0);
		class328.method7046(var1, var0.field5504);
		if (var2 >= 0 && var2 <= var0.size * -1549457881) {
			if (var1.size * -1549457881 != 0) {
				var0.method10355(var1.size * -1549457881 + var0.size * -1549457881);
				if (var2 < var0.size * -1549457881) {
					class82.method2773(var0, var2, var0, var1.size * -1549457881 + var2, var0.size * -1549457881 - var2);
				}

				class82.method2773(var1, 0, var0, var2, var1.size * -1549457881);
				var0.size += var1.size;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
