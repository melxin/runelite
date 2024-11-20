import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("ab")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("aw")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 998049661
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("ae")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)(DbTableType.field5406 * 1168272912), 16, ItemContainer.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (ItemContainer.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "379101543"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (ItemContainer.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (WorldMapData_1.method6089(var1) != 1) {
				this.open(ServerPacket.method6470(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1474606388"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (ItemContainer.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("ae")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (ItemContainer.PcmPlayer_stereo) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.samples[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8);
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16);
		}

		this.line.write(this.byteSamples, 0, var1 << 1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2140754315"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
