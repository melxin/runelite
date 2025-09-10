import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dv")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("af")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("aw")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("at")
	@Export("start")
	public int start;
	@ObfuscatedName("ac")
	@Export("end")
	int end;
	@ObfuscatedName("ap")
	public boolean field1321;
	@ObfuscatedName("aq")
	boolean field1324;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field1324 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field1321 = var5;
		this.field1324 = var6;
	}

	@ObfuscatedName("af")
	boolean method3026() {
		return this.field1324;
	}
}
