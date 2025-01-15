import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -937097891
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -278757699
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1989211229
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1335130825
	)
	public int field5051;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1740359659
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5051 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5051 = var3;
		this.spotAnimationFrame = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2122686881"
	)
	public static int method9377(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
