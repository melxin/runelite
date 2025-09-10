import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("af")
	ArrayList field5308;

	@ObfuscatedSignature(
		descriptor = "(Lsi;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5308 = var2;
		super.field5303 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		for (int var1 = 0; var1 < this.field5308.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5308.get(var1);
			if (var2 == null) {
				this.field5308.remove(var1);
				--var1;
			} else if (var2.vmethod9673()) {
				if (var2.method9658()) {
					this.method9659(var2.method9662());
					this.field5308.clear();
					return true;
				}

				if (var2.method9664() != null) {
					this.field5308.add(var2.method9664());
				}

				super.field5301 = var2.field5301;
				this.field5308.remove(var1);
				--var1;
			}
		}

		if (this.field5308.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
