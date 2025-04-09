import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("ao")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("an")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("ae")
	@Export("start")
	public int start;
	@ObfuscatedName("af")
	@Export("end")
	int end;
	@ObfuscatedName("as")
	public boolean field243;
	@ObfuscatedName("aq")
	boolean field244;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field244 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field243 = var5;
		this.field244 = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lcc;)Lbj;"
	)
	@Export("resample")
	public RawSound resample(Decimator var1) {
		this.samples = var1.resample(this.samples);
		this.sampleRate = var1.scaleRate(this.sampleRate);
		if (this.start == this.end) {
			this.start = this.end = var1.scalePosition(this.start);
		} else {
			this.start = var1.scalePosition(this.start);
			this.end = var1.scalePosition(this.end);
			if (this.start == this.end) {
				--this.start;
			}
		}

		return this;
	}

	@ObfuscatedName("an")
	boolean method769() {
		return this.field244;
	}
}
