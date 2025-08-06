import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	WorldView field674;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -358370001
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -339062497
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1770756941
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1057464841
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 141424343
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1269406777
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("animationSequence")
	AnimationSequence animationSequence;

	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.animationSequence = new AnimationSequence();
		this.field674 = var1;
		this.id = var2;
		this.plane = var3;
		this.x = var4;
		this.y = var5;
		this.z = var6;
		this.cycleStart = var8 + var7;
		this.animationSequence.setSequence(Skeleton.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1211852050"
	)
	boolean method1853() {
		return !this.animationSequence.isActive();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "905631829"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.method1853()) {
			Client.field426.method10913(this.field674, this.x, this.y, false);
			int var2 = AttackOption.method2764(this.animationSequence, var1, Client.field426);
			Client.field426.method10914();
			if ((var2 & 1) != 0) {
				this.animationSequence.reset();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9601(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = Skeleton.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			return var2 == null ? null : var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "-49"
	)
	public static int method1842(CharSequence var0, int var1) {
		return MusicPatchPcmStream.method7324(var0, var1, true);
	}

	public GraphicsObject() {
	}
}
