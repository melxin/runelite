import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tz")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2103479793
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 970153113
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -68782909
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 394761217
	)
	public int field5168;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1704105887
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5168 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5168 = var3;
		this.spotAnimationFrame = var4;
	}
}
