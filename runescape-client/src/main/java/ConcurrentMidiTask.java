import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 2069856621
	)
	static int field5095;
	@ObfuscatedName("ap")
	ArrayList field5093;

	@ObfuscatedSignature(
		descriptor = "(Lrh;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5093 = var2;
		super.field5090 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		for (int var1 = 0; var1 < this.field5093.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5093.get(var1);
			if (var2 == null) {
				this.field5093.remove(var1);
				--var1;
			} else if (var2.vmethod9290()) {
				if (var2.method9265()) {
					this.method9268(var2.method9266());
					this.field5093.clear();
					return true;
				}

				if (var2.method9267() != null) {
					this.field5093.add(var2.method9267());
				}

				super.field5089 = var2.field5089;
				this.field5093.remove(var1);
				--var1;
			}
		}

		if (this.field5093.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	public static void method9288() {
		ClanSettings.KitDefinition_archive = null;
		class63.KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}
}
