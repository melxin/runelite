import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrg;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4876 = "AddRequestTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		while (!class333.field3624.isEmpty()) {
			MusicSong var1 = (MusicSong)class333.field3624.peek();
			if (var1 == null) {
				class333.field3624.pop();
			} else {
				var1.midiPcmStream = this.method8669();
				class333.musicSongs.add(var1);
				class333.field3624.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "-1837879931"
	)
	MidiPcmStream method8669() {
		MidiPcmStream var1 = null;
		Iterator var2 = class333.field3635.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3667;
							if (var1.method6629() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6594();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3667 <= var3.field3667 && (var3.method6629() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lva;",
		garbageValue = "-26"
	)
	@Export("FillMode_values")
	public static class568[] FillMode_values() {
		return new class568[]{class568.SOLID, class568.field5550, class568.field5551};
	}
}
