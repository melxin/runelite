import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("aj")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;I)V",
		garbageValue = "359534346"
	)
	public static void method9744(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2128 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-62429597"
	)
	static void method9745(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * 16384) {
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 16384) {
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) {
					var5 += var4.y * 16384 - var2;
				}

				var5 = Math.max(var5 - 64, 0);
				if (var5 < var4.field851 && SecureUrlRequester.clientPreferences.getAreaSoundEffectsVolume() != 0 && var0 == var4.plane) {
					float var6 = var4.field847 < var4.field851 ? Math.min(Math.max((float)(var4.field851 - var5) / (float)(var4.field851 - var4.field847), 0.0F), 1.0F) : 1.0F;
					int var7 = (int)(var6 * (float)SecureUrlRequester.clientPreferences.getAreaSoundEffectsVolume());
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var8 = SoundEffect.readSoundEffect(GraphicsObject.soundEffectsArchive, var4.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(SongTask.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								class53.pcmStreamMixer.addSubStream(var10);
								var4.stream1 = var10;
							}
						}
					} else {
						var4.stream1.method875(var7);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field840 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var13 = SoundEffect.readSoundEffect(GraphicsObject.soundEffectsArchive, var4.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(SongTask.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								class53.pcmStreamMixer.addSubStream(var11);
								var4.stream2 = var11;
								var4.field840 = var4.field846 + (int)(Math.random() * (double)(var4.field850 - var4.field846));
							}
						}
					} else {
						var4.stream2.method875(var7);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						class53.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						class53.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1247677323"
	)
	static final void method9746() {
		HttpRequestTask.method269("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "993609960"
	)
	static int method9743(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.indexCheck.method5574(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.indexCheck.method5576(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
