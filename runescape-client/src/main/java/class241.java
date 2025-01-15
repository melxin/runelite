import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class241 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1218941172"
	)
	public static int method5261(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "878177340"
	)
	public static void method5257() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lix;IIB)Lbq;",
		garbageValue = "0"
	)
	public static final PcmPlayer method5262(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class355.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field263 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (class328.field3605 > 0 && DefaultsGroup.soundSystem == null) {
					DefaultsGroup.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(DefaultsGroup.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (DefaultsGroup.soundSystem != null) {
					if (DefaultsGroup.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					DefaultsGroup.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
