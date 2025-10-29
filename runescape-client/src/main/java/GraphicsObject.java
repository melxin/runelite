import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1887074611
	)
	static int field645;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1593954547
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 51530303
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 423981473
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1678897417
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 297135035
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 480104681
	)
	@Export("z")
	int z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 265510711
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;

	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.animationSequence = new AnimationSequence();
		this.worldView = var1;
		this.id = var2;
		this.plane = var3;
		this.x = var4;
		this.y = var5;
		this.z = var6;
		this.cycleStart = var8 + var7;
		this.animationSequence.setSequence(class181.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2001675472"
	)
	boolean method1920() {
		return !this.animationSequence.isActive();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-648834334"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.method1920()) {
			Client.field315.method11277(this.worldView, this.x, this.y, false);
			int var2 = GrandExchangeOfferUnitPriceComparator.method8811(this.animationSequence, var1, Client.field315);
			Client.field315.method11278();
			if ((var2 & 1) != 0) {
				this.animationSequence.reset();
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9876(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			return var2 == null ? null : var2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4938(this.animationSequence.getFrame())) {
			return true;
		} else {
			SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.method4564();
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903085797"
	)
	protected int vmethod5827() {
		return this.animationSequence.isActive() ? this.animationSequence.getSequenceDefinition().animationHeightOffset : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpm;",
		garbageValue = "-76"
	)
	public static StudioGame[] method1937() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.oldscape};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1871042313"
	)
	static void method1934() {
		class30.method484(24);
		class525.setLoginResponseString("", "You were disconnected from the server.", "");
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "61"
	)
	static int method1936(int var0) {
		return var0 * 3 + 600;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwu;",
		garbageValue = "-62"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class136.field1619, Buddy.method10379(var0), class236.method5199(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}

	public GraphicsObject() {
	}
}
