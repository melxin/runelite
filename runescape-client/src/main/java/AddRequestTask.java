import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4868 = "AddRequestTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		while (!class333.field3631.isEmpty()) {
			MusicSong var1 = (MusicSong)class333.field3631.peek();
			if (var1 == null) {
				class333.field3631.pop();
			} else {
				var1.midiPcmStream = this.method8817();
				class333.musicSongs.add(var1);
				class333.field3631.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lma;",
		garbageValue = "-1744048906"
	)
	MidiPcmStream method8817() {
		MidiPcmStream var1 = null;
		Iterator var2 = class333.field3625.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3668;
							if (var1.method6710() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6714();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3668 <= var3.field3668 && (var3.method6710() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
