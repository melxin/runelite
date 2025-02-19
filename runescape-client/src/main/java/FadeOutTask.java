import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -532734427
	)
	static int field5023;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5021;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -555632447
	)
	int field5022;

	@ObfuscatedSignature(
		descriptor = "(Lrt;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5021 = null;
		this.field5022 = 0;
		super.field5028 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3687.size()) {
				this.field5021 = (MidiRequest)class335.field3687.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5021 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5022 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		if (this.field5021 != null && this.field5021.midiPcmStream != null) {
			this.field5021.field3807 = true;

			try {
				if (this.field5021.field3803 > 0.0F && this.field5021.midiPcmStream.isReady()) {
					float var1 = this.field5022 == 0 ? (float)this.field5022 : (float)this.field5021.musicTrackVolume / (float)this.field5022;
					MidiRequest var10000 = this.field5021;
					var10000.field3803 -= 0.0F == var1 ? (float)this.field5021.musicTrackVolume : var1;
					if (this.field5021.field3803 < 0.0F) {
						this.field5021.field3803 = 0.0F;
					}

					this.field5021.midiPcmStream.setPcmStreamVolume((int)this.field5021.field3803);
					return false;
				}
			} catch (Exception var3) {
				this.method8875(var3.getMessage());
				return true;
			}

			this.field5021.field3807 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071049895"
	)
	static void method8862() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-740548657"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
