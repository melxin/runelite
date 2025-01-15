import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ay")
	ArrayList field4871;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4871 = var2;
		super.field4868 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		for (int var1 = 0; var1 < this.field4871.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4871.get(var1);
			if (var2 == null) {
				this.field4871.remove(var1);
				--var1;
			} else if (var2.vmethod8883()) {
				if (var2.method8855()) {
					this.method8861(var2.method8870());
					this.field4871.clear();
					return true;
				}

				if (var2.method8860() != null) {
					this.field4871.add(var2.method8860());
				}

				super.field4870 = var2.field4870;
				this.field4871.remove(var1);
				--var1;
			}
		}

		if (this.field4871.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
