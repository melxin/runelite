import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	MidiRequest field4860;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 989740517
	)
	int field4862;

	@ObfuscatedSignature(
		descriptor = "(Lrh;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4860 = null;
		this.field4862 = 0;
		super.field4868 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3631.size()) {
				this.field4860 = (MidiRequest)class333.field3631.get(var2);
			} else if (!var3 && var2 < class333.midiRequests.size()) {
				this.field4860 = (MidiRequest)class333.midiRequests.get(var2);
			}

			this.field4862 = var4;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (this.field4860 != null && this.field4860.midiPcmStream != null) {
			this.field4860.field3745 = true;

			try {
				if (this.field4860.field3739 > 0.0F && this.field4860.midiPcmStream.isReady()) {
					float var1 = this.field4862 == 0 ? (float)this.field4862 : (float)this.field4860.musicTrackVolume / (float)this.field4862;
					MidiRequest var10000 = this.field4860;
					var10000.field3739 -= var1 == 0.0F ? (float)this.field4860.musicTrackVolume : var1;
					if (this.field4860.field3739 < 0.0F) {
						this.field4860.field3739 = 0.0F;
					}

					this.field4860.midiPcmStream.setPcmStreamVolume((int)this.field4860.field3739);
					return false;
				}
			} catch (Exception var3) {
				this.method8861(var3.getMessage());
				return true;
			}

			this.field4860.field3745 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljz;",
		garbageValue = "-56"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "842608515"
	)
	public static final void method8847(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field732[var4] = true;
			}
		}

	}
}
