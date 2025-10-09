import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	final WorldView field659;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -778085129
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -882546973
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -973146235
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1431899355
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1279095981
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2053750813
	)
	@Export("id")
	int id;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;

	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.animationSequence = new AnimationSequence();
		this.field659 = var1;
		this.id = var2;
		this.plane = var3;
		this.x = var4;
		this.y = var5;
		this.z = var6;
		this.cycleStart = var8 + var7;
		this.animationSequence.setSequence(class535.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-21"
	)
	boolean method1896() {
		return !this.animationSequence.isActive();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "106"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.method1896()) {
			Client.field472.method11014(this.field659, this.x, this.y, false);
			int var2 = CollisionMap.method6234(this.animationSequence, var1, Client.field472);
			Client.field472.method11013();
			if ((var2 & 1) != 0) {
				this.animationSequence.reset();
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9634(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = class535.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			return var2 == null ? null : var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4823(this.animationSequence.getFrame())) {
			return true;
		} else {
			SpotAnimationDefinition var1 = class535.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.method4480();
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V",
		garbageValue = "-1703930821"
	)
	public static void method1911(AbstractArchive var0, AbstractArchive var1) {
		class335.KitDefinition_archive = var0;
		Sound.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = class335.KitDefinition_archive.getGroupFileCount(3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-723332793"
	)
	static String method1900() {
		return class154.clientPreferences.isUsernameHidden() ? class280.method6344(Login.Login_username) : Login.Login_username;
	}

	public GraphicsObject() {
	}
}
