import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dq")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("av")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("at")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("ag")
	@Export("start")
	public int start;
	@ObfuscatedName("an")
	@Export("end")
	int end;
	@ObfuscatedName("ae")
	public boolean field1297;
	@ObfuscatedName("aj")
	boolean field1292;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field1292 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field1297 = var5;
		this.field1292 = var6;
	}

	@ObfuscatedName("av")
	boolean method3138() {
		return this.field1292;
	}
}
