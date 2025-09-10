import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	WorldView field693;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 402610731
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 293528773
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2021141769
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1096412731
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 859759075
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -703151279
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;

	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.animationSequence = new AnimationSequence();
		this.field693 = var1;
		this.id = var2;
		this.plane = var3;
		this.x = var4;
		this.y = var5;
		this.z = var6;
		this.cycleStart = var8 + var7;
		this.animationSequence.setSequence(ModeWhere.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	boolean method1874() {
		return !this.animationSequence.isActive();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.method1874()) {
			Client.field399.method10862(this.field693, this.x, this.y, false);
			int var2 = class145.method3747(this.animationSequence, var1, Client.field399);
			Client.field399.method10859();
			if ((var2 & 1) != 0) {
				this.animationSequence.reset();
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-1879635116"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9567(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = ModeWhere.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			return var2 == null ? null : var2;
		}
	}

	public GraphicsObject() {
	}
}
