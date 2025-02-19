import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
@Implements("Renderable")
public class Renderable extends DualNode {
	@ObfuscatedName("ed")
	public long field5293;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	public Renderable field5291;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	public Renderable field5292;

	@ObfuscatedName("kd")
	public void method9623() {
		if (this.field5292 != null) {
			this.field5292.field5291 = this.field5291;
			this.field5291.field5292 = this.field5292;
			this.field5291 = null;
			this.field5292 = null;
		}
	}
}
