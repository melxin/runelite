import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("InvDefinition_cached")
	public static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1935930757
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1764341119"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1696268480"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhm;",
		garbageValue = "-1894269736"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lin;III)Ldc;",
		garbageValue = "-786099370"
	)
	public static final PcmPlayer method3961(TaskHandler var0, int var1, int var2) {
		if (UserComparator3.field1521 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = HealthBarDefinition.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field1313 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (Language.field4892 > 0 && class209.soundSystem == null) {
					class209.soundSystem = new SoundSystem();
					BuddyRankComparator.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					BuddyRankComparator.soundSystemExecutor.scheduleAtFixedRate(class209.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class209.soundSystem != null) {
					if (class209.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class209.soundSystem.players[var1] = var3;
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
