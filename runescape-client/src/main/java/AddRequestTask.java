import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("az")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5028 = "AddRequestTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		while (!class335.field3687.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class335.field3687.peek();
			if (var1 == null) {
				class335.field3687.pop();
			} else {
				var1.midiPcmStream = this.method8833();
				class335.midiRequests.add(var1);
				class335.field3687.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lmp;",
		garbageValue = "1278490453"
	)
	MidiPcmStream method8833() {
		MidiPcmStream var1 = null;
		Iterator var2 = class335.field3696.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3728;
							if (var1.method6608() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6619();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3728 <= var3.field3728 && (var3.method6608() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lku;IIB)V",
		garbageValue = "18"
	)
	public static void method8839(Buffer var0, WorldEntityCoord var1, int var2, int var3) {
		int var5 = var2 << 7;
		int var8 = var3 << 7;
		var1.method5748(var5, var8);
		var1.setZ(0);
		var1.setCurrentRotationAngle(0);
		class133.method3329(var0, var1);
	}
}
