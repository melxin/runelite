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
	final WorldView field674;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -358370001
	)
	int field673;
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
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1057464841
	)
	int field669;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 141424343
	)
	int field668;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1269406777
	)
	int field675;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	final class465 field670;

	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.field670 = new class465();
		this.field674 = var1;
		this.field675 = var2;
		this.plane = var3;
		this.cycleStart = var4;
		this.field669 = var5;
		this.field668 = var6;
		this.field673 = var8 + var7;
		this.field670.method9569(Skeleton.method5071(this.field675).sequence);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1211852050"
	)
	boolean method1853() {
		return !this.field670.method9570();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "905631829"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.method1853()) {
			Client.field426.method10913(this.field674, this.cycleStart, this.field669, false);
			int var2 = AttackOption.method2764(this.field670, var1, Client.field426);
			Client.field426.method10914();
			if ((var2 & 1) != 0) {
				this.field670.method9604();
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
		if (this.field670.method9601(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = Skeleton.method5071(this.field675);
			Model var2 = var1.getModel(this.field670.method9573());
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
