import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ab")
	ArrayList field4884;

	@ObfuscatedSignature(
		descriptor = "(Lrg;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4884 = var2;
		super.field4876 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		for (int var1 = 0; var1 < this.field4884.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4884.get(var1);
			if (var2 == null) {
				this.field4884.remove(var1);
				--var1;
			} else if (var2.vmethod8722()) {
				if (var2.method8714()) {
					this.method8702(var2.method8700());
					this.field4884.clear();
					return true;
				}

				if (var2.method8715() != null) {
					this.field4884.add(var2.method8715());
				}

				super.field4879 = var2.field4879;
				this.field4884.remove(var1);
				--var1;
			}
		}

		if (this.field4884.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
