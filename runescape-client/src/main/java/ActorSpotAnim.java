import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1372363555
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("animationSequence")
	public final AnimationSequence animationSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 821279425
	)
	public int field5510;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1694685743
	)
	@Export("height")
	public int height;

	public ActorSpotAnim(int var1, int var2, int var3) {
		this.id = -1;
		this.animationSequence = new AnimationSequence();
		this.field5510 = 0;
		this.height = 0;
		this.id = var1;
		this.height = var2;
		this.field5510 = var3;
		if (this.id >= 0) {
			this.animationSequence.setSequence(class535.SpotAnimationDefinition_get(this.id).sequence);
		}

	}
}
