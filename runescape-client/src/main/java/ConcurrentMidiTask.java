import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -854530909
	)
	static int field5357;
	@ObfuscatedName("ab")
	ArrayList field5356;

	@ObfuscatedSignature(
		descriptor = "(Lsw;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5356 = var2;
		super.field5350 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		for (int var1 = 0; var1 < this.field5356.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5356.get(var1);
			if (var2 == null) {
				this.field5356.remove(var1);
				--var1;
			} else if (var2.vmethod9763()) {
				if (var2.method9731()) {
					this.method9741(var2.method9729());
					this.field5356.clear();
					return true;
				}

				if (var2.method9745() != null) {
					this.field5356.add(var2.method9745());
				}

				super.field5351 = var2.field5351;
				this.field5356.remove(var1);
				--var1;
			}
		}

		if (this.field5356.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2145738371"
	)
	public static int method9757(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
