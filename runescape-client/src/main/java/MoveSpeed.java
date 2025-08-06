import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3195((byte)-1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3192((byte)0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3194((byte)1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	field3197((byte)2);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("pcmPlayerProvider")
	public static class105 pcmPlayerProvider;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field3199;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("au")
	@Export("id")
	final byte id;

	MoveSpeed(byte var3) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lmb;",
		garbageValue = "-1466806946"
	)
	public static PacketBufferNode method6300() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIB)Ldh;",
		garbageValue = "60"
	)
	public static final PcmPlayer method6297(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1313 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 512) {
				var2 = 512;
			}

			try {
				PcmPlayer var3 = pcmPlayerProvider.player();
				var3.samples = new int[512 * (class475.PcmPlayer_stereo ? 2 : 1)];
				var3.field1319 = var2;
				var3.init();
				var3.capacity = (var2 & -2048) + 2048;
				if (var3.capacity > 32768) {
					var3.capacity = 32768;
				}

				var3.open(var3.capacity);
				if (AuthenticationScheme.field1584 > 0 && MusicPatchPcmStream.soundSystem == null) {
					MusicPatchPcmStream.soundSystem = new SoundSystem();
					class359.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class359.soundSystemExecutor.scheduleAtFixedRate(MusicPatchPcmStream.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (MusicPatchPcmStream.soundSystem != null) {
					if (MusicPatchPcmStream.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					MusicPatchPcmStream.soundSystem.players[var1] = var3;
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
