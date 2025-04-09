import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -193229029
	)
	static int field5020;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -878385799
	)
	static int field5021;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5039 = "AddRequestTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		while (!class335.field3694.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class335.field3694.peek();
			if (var1 == null) {
				class335.field3694.pop();
			} else {
				var1.midiPcmStream = this.method8880();
				class335.midiRequests.add(var1);
				class335.field3694.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "50"
	)
	MidiPcmStream method8880() {
		MidiPcmStream var1 = null;
		Iterator var2 = class335.field3697.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3708;
							if (var1.method6633() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6637();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3708 <= var3.field3708 && (var3.method6633() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
