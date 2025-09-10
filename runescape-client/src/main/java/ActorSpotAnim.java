import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1603361179
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("animationSequence")
	public final AnimationSequence animationSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 760365491
	)
	public int field5444;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1521026729
	)
	@Export("height")
	public int height;

	public ActorSpotAnim(int var1, int var2, int var3) {
		this.id = -1;
		this.animationSequence = new AnimationSequence();
		this.field5444 = 0;
		this.height = 0;
		this.id = var1;
		this.height = var2;
		this.field5444 = var3;
		if (this.id >= 0) {
			this.animationSequence.setSequence(ModeWhere.SpotAnimationDefinition_get(this.id).sequence);
		}

	}
}
