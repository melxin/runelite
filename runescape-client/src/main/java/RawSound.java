import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("di")
@Implements("RawSound")
public class RawSound extends AbstractSound {
	@ObfuscatedName("ab")
	@Export("sampleRate")
	public int sampleRate;
	@ObfuscatedName("at")
	@Export("samples")
	public short[] samples;
	@ObfuscatedName("ag")
	@Export("start")
	public int start;
	@ObfuscatedName("aj")
	@Export("end")
	int end;
	@ObfuscatedName("ah")
	public boolean field1326;
	@ObfuscatedName("af")
	boolean field1327;

	RawSound(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
		this.field1327 = false;
		this.sampleRate = var1;
		this.samples = var2;
		this.start = var3;
		this.end = var4;
		this.field1326 = var5;
		this.field1327 = var6;
	}

	@ObfuscatedName("ab")
	boolean method3125() {
		return this.field1327;
	}
}
