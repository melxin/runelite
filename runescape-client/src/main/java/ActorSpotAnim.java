import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sz")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1632738935
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -777602935
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2061850211
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -447132779
	)
	public int field5053;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1217640643
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5053 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5053 = var3;
		this.spotAnimationFrame = var4;
	}
}
