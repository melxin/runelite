import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class33 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -623349441
	)
	int field151;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -307672855
	)
	int field155;

	class33(int var1, int var2) {
		this.field151 = var1;
		this.field155 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbw;I)Z",
		garbageValue = "1865794432"
	)
	boolean method520(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field151) {
			case 1:
				return var1.vmethod6086(this.field155);
			case 2:
				return var1.vmethod6087(this.field155);
			case 3:
				return var1.vmethod6088((char)this.field155);
			case 4:
				return var1.vmethod6112(this.field155 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "20288"
	)
	public static void method522(int var0, int var1) {
		Iterator var2 = class337.field3799.iterator();

		while (var2.hasNext()) {
			class343 var3 = (class343)var2.next();
			var3.vmethod7316(var0, var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1329065212"
	)
	static void method525(boolean var0) {
		if (var0) {
			class82.method2752();
		} else {
			for (int var1 = 0; var1 < class337.midiRequests.size(); ++var1) {
				MidiRequest var2 = (MidiRequest)class337.midiRequests.get(var1);
				if (var2 == null) {
					class337.midiRequests.remove(var1);
					--var1;
				} else if (var2.field3918) {
					if (var2.midiPcmStream.field3806 > 0) {
						--var2.midiPcmStream.field3806;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method7210();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class337.midiRequests.remove(var1);
					--var1;
				} else {
					var2.field3918 = true;
				}
			}
		}

	}
}
