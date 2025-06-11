import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class332 {
	@ObfuscatedName("al")
	@Export("javaVersion")
	public static String javaVersion;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltr;IIIII)V",
		garbageValue = "-461920171"
	)
	static void method6853(WorldEntity var0, int var1, int var2, int var3, int var4) {
		Iterator var5 = Client.worldViewManager.iterator();

		while (var5.hasNext()) {
			WorldView var6 = (WorldView)var5.next();

			for (ObjectSound var7 = (ObjectSound)var6.method2533().last(); var7 != null; var7 = (ObjectSound)var6.method2533().previous()) {
				if (var7.soundEffectId != -1 || var7.soundEffectIds != null) {
					WorldEntity var8 = Client.worldViewManager.method2261(var7.plane);
					int var10 = var7.x;
					boolean var9;
					if (var8 == var0) {
						var9 = var10 == var1;
					} else if (var0 != null && var8 == null) {
						var9 = var0.field5213.method4291() == var1 && var0.getX() == var10;
					} else {
						var9 = false;
					}

					if (!var9) {
						var7.method1593();
						var7.method1555();
					} else {
						WorldView var11 = Client.worldViewManager.getWorldView(var7.plane);
						class445 var12 = IgnoreList.method9505(var11, var7.y, var7.maxX);
						class445 var13 = IgnoreList.method9505(var11, var7.maxY, var7.field645);
						int var14 = (int)var12.field4967;
						int var15 = (int)var12.field4969;
						int var16 = (int)var13.field4967;
						int var17 = (int)var13.field4969;
						var12.method8687();
						var13.method8687();
						int var18 = 0;
						if (var2 > var16) {
							var18 += var2 - var16;
						} else if (var2 < var14) {
							var18 += var14 - var2;
						}

						if (var3 > var17) {
							var18 += var3 - var17;
						} else if (var3 < var15) {
							var18 += var15 - var3;
						}

						var18 = Math.max(var18 - 64, 0);
						if (var18 < var7.field646 && ClientPacket.clientPreferences.getAreaSoundEffectsVolume() != 0) {
							float var19 = var7.field647 < var7.field646 ? Math.min(Math.max((float)(var7.field646 - var18) / (float)(var7.field646 - var7.field647), 0.0F), 1.0F) : 1.0F;
							int var20 = (int)(var19 * (float)ClientPacket.clientPreferences.getAreaSoundEffectsVolume());
							if (var7.stream1 == null) {
								if (var7.soundEffectId >= 0) {
									SoundEffect var21 = SoundEffect.readSoundEffect(WorldMapRectangle.field3283, var7.soundEffectId, 0);
									if (var21 != null) {
										RawSound var22 = var21.toRawSound().resample(class6.decimator);
										RawPcmStream var23 = RawPcmStream.createRawPcmStream(var22, 100, var20);
										var23.setNumLoops(-1);
										UserComparator6.pcmStreamMixer.addSubStream(var23);
										var7.stream1 = var23;
									}
								}
							} else {
								var7.stream1.method3039(var20);
							}

							if (var7.stream2 == null) {
								if (var7.soundEffectIds != null && (var7.field650 -= var4) <= 0) {
									int var25 = (int)(Math.random() * (double)var7.soundEffectIds.length);
									SoundEffect var26 = SoundEffect.readSoundEffect(WorldMapRectangle.field3283, var7.soundEffectIds[var25], 0);
									if (var26 != null) {
										RawSound var27 = var26.toRawSound().resample(class6.decimator);
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var27, 100, var20);
										var24.setNumLoops(0);
										UserComparator6.pcmStreamMixer.addSubStream(var24);
										var7.stream2 = var24;
										var7.field650 = var7.field643 + (int)(Math.random() * (double)(var7.field651 - var7.field643));
									}
								}
							} else {
								var7.stream2.method3039(var20);
								if (!var7.stream2.hasNext()) {
									var7.stream2 = null;
								}
							}
						} else {
							var7.method1593();
							var7.method1555();
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1479444493"
	)
	static String method6860(String var0) {
		PlayerType[] var1 = MusicPatchNode2.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(TextureProvider.method5483(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
