import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lsz;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5378 = "AddRequestTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		while (!class345.field3933.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class345.field3933.peek();
			if (var1 == null) {
				class345.field3933.pop();
			} else {
				var1.midiPcmStream = this.method9916();
				class345.midiRequests.add(var1);
				class345.field3933.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lnc;",
		garbageValue = "2147411660"
	)
	MidiPcmStream method9916() {
		MidiPcmStream var1 = null;
		Iterator var2 = class345.field3924.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3948;
							if (var1.method7366() == 0 && var1.isReady()) {
								var1.clear();
								var1.method7462();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3948 <= var3.field3948 && (var3.method7366() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
