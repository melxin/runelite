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

@ObfuscatedName("al")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("ab")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("at")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1652111879
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("aj")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1092358971"
	)
	@Export("init")
	public void init() {
		this.format = new AudioFormat(22050.0F, 16, DelayFadeTask.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[512 << (DelayFadeTask.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "219"
	)
	@Export("open")
	public void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (DelayFadeTask.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (WorldMapScaleHandler.method6971(var1) != 1) {
				this.open(ConcurrentMidiTask.method9757(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "57"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (DelayFadeTask.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() {
		int var1 = 512;
		if (DelayFadeTask.PcmPlayer_stereo) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
