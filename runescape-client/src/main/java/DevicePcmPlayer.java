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

@ObfuscatedName("ab")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("ay")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("ah")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -325651531
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("ao")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-934813238"
	)
	@Export("init")
	protected void init() {
		this.format = new AudioFormat((float)PcmPlayer.field257, 16, PcmPlayer.PcmPlayer_stereo ? 2 : 1, true, false);
		this.byteSamples = new byte[256 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2008767536"
	)
	@Export("open")
	protected void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
			this.line = (SourceDataLine)AudioSystem.getLine(var2);
			this.line.open();
			this.line.start();
			this.capacity2 = var1;
		} catch (LineUnavailableException var3) {
			if (BoundaryObject.method4809(var1) != 1) {
				this.open(class357.method7049(var1));
			} else {
				this.line = null;
				throw var3;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1560665771"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (PcmPlayer.PcmPlayer_stereo ? 2 : 1));
	}

	@ObfuscatedName("ao")
	@Export("write")
	protected void write() {
		int var1 = 256;
		if (PcmPlayer.PcmPlayer_stereo) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) {
			this.line.close();
			this.line = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-376770394"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush();
	}
}
