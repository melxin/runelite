import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dg")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("al")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("ab")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("ac")
	@Export("start")
	public int start;
	@ObfuscatedName("av")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	public boolean field1300;
	@ObfuscatedName("as")
	boolean field1301;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field1301 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field1300 = var5;
		this.field1301 = var6;
	}

	@ObfuscatedName("al")
	boolean method2984() {
		return this.field1301;
	}
}
