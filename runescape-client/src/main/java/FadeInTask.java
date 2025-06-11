import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ax")
	static String[] field5086;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	MidiRequest field5085;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -606630201
	)
	int field5084;

	@ObfuscatedSignature(
		descriptor = "(Lrh;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5085 = null;
		this.field5084 = 0;
		super.field5090 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3704.size()) {
				this.field5085 = (MidiRequest)class335.field3704.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5085 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5084 = var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		if (this.field5085 != null && this.field5085.midiPcmStream != null) {
			this.field5085.field3818 = true;

			try {
				if (this.field5085.field3814 < (float)this.field5085.musicTrackVolume && this.field5085.midiPcmStream.isReady()) {
					float var1 = this.field5084 == 0 ? (float)this.field5084 : (float)this.field5085.musicTrackVolume / (float)this.field5084;
					MidiRequest var10000 = this.field5085;
					var10000.field3814 += 0.0F == var1 ? (float)this.field5085.musicTrackVolume : var1;
					if (this.field5085.field3814 > (float)this.field5085.musicTrackVolume) {
						this.field5085.field3814 = (float)this.field5085.musicTrackVolume;
					}

					this.field5085.midiPcmStream.setPcmStreamVolume((int)this.field5085.field3814);
					return false;
				}
			} catch (Exception var3) {
				this.method9268(var3.getMessage());
				return true;
			}

			this.field5085.field3818 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "32745861"
	)
	public static long method9262(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0];
	}
}
