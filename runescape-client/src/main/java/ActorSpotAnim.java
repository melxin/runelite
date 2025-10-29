import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1003297275
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("animationSequence")
	public final AnimationSequence animationSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1097832863
	)
	public int field5559;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1008557345
	)
	@Export("height")
	public int height;

	public ActorSpotAnim(int var1, int var2, int var3) {
		this.id = -1;
		this.animationSequence = new AnimationSequence();
		this.field5559 = 0;
		this.height = 0;
		this.id = var1;
		this.height = var2;
		this.field5559 = var3;
		if (this.id >= 0) {
			this.animationSequence.setSequence(class181.SpotAnimationDefinition_get(this.id).sequence);
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIZS)V",
		garbageValue = "3935"
	)
	static final void method10602(int var0, int var1, int var2, boolean var3) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			class452.resizeInterface(class226.widgetDefinition.Widget_interfaceComponents[var0], 0, class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3);
		}
	}
}
