import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = -312656337
	)
	static int field5334;

	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5350 = "AddRequestTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		while (!class338.field3893.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class338.field3893.peek();
			if (var1 == null) {
				class338.field3893.pop();
			} else {
				var1.midiPcmStream = this.method9688();
				class338.midiRequests.add(var1);
				class338.field3893.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lnj;",
		garbageValue = "306415952"
	)
	MidiPcmStream method9688() {
		MidiPcmStream var1 = null;
		Iterator var2 = class338.field3900.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3910;
							if (var1.method7150() == 0 && var1.isReady()) {
								var1.clear();
								var1.method7225();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3910 <= var3.field3910 && (var3.method7150() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lwm;",
		garbageValue = "-1696582180"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class443.field5181.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method11245(new Buffer(var2));
			}

			var1.method11242();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
