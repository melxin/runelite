import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("ap")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("aj")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("an")
	@Export("start")
	public int start;
	@ObfuscatedName("ai")
	@Export("end")
	int end;
	@ObfuscatedName("al")
	public boolean field1292;
	@ObfuscatedName("ac")
	boolean field1291;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field1291 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field1292 = var5;
		this.field1291 = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lel;)Lds;"
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

	@ObfuscatedName("aj")
	boolean method2890() {
		return this.field1291;
	}
}
