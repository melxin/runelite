import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	MidiRequest field5348;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1875606157
	)
	int field5349;

	@ObfuscatedSignature(
		descriptor = "(Lsw;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5348 = null;
		this.field5349 = 0;
		super.field5350 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class338.field3893.size()) {
				this.field5348 = (MidiRequest)class338.field3893.get(var2);
			} else if (!var3 && var2 < class338.midiRequests.size()) {
				this.field5348 = (MidiRequest)class338.midiRequests.get(var2);
			}

			this.field5349 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		if (this.field5348 != null && this.field5348.midiPcmStream != null) {
			this.field5348.field4023 = true;

			try {
				if (this.field5348.field4019 < (float)this.field5348.musicTrackVolume && this.field5348.midiPcmStream.isReady()) {
					float var1 = this.field5349 == 0 ? (float)this.field5349 : (float)this.field5348.musicTrackVolume / (float)this.field5349;
					MidiRequest var10000 = this.field5348;
					var10000.field4019 += var1 == 0.0F ? (float)this.field5348.musicTrackVolume : var1;
					if (this.field5348.field4019 > (float)this.field5348.musicTrackVolume) {
						this.field5348.field4019 = (float)this.field5348.musicTrackVolume;
					}

					this.field5348.midiPcmStream.setPcmStreamVolume((int)this.field5348.field4019);
					return false;
				}
			} catch (Exception var3) {
				this.method9741(var3.getMessage());
				return true;
			}

			this.field5348.field4023 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1990543198"
	)
	public static String method9723(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Projectile.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
