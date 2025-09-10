import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -807040135
	)
	@Export("sourceLevel")
	int sourceLevel;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -610093909
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1875146207
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 131740357
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -576930567
	)
	@Export("sourceIndex")
	int sourceIndex;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 171313335
	)
	@Export("targetLevel")
	int targetLevel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 333834097
	)
	@Export("targetX")
	int targetX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1805859167
	)
	@Export("targetY")
	int targetY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1602948505
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1319368797
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1933970145
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -623557093
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -334808731
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1115395845
	)
	@Export("startPos")
	int startPos;
	@ObfuscatedName("ar")
	@Export("x")
	double x;
	@ObfuscatedName("ae")
	@Export("y")
	double y;
	@ObfuscatedName("ay")
	@Export("z")
	double z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 510141879
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1147751591
	)
	int field768;
	@ObfuscatedName("av")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ah")
	double field786;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1795799721
	)
	@Export("id")
	int id;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		this.isMoving = false;
		this.animationSequence = new AnimationSequence();
		this.sourceLevel = var1;
		this.sourceX = var2;
		this.sourceY = var3;
		this.startHeight = var4;
		this.sourceIndex = var5;
		this.targetLevel = var6;
		this.targetX = var7;
		this.targetY = var8;
		this.endHeight = var9;
		this.targetIndex = var10;
		this.id = var11;
		this.cycleStart = var12;
		this.cycleEnd = var13;
		this.slope = var14;
		this.startPos = var15;
		this.animationSequence.setSequence(ModeWhere.SpotAnimationDefinition_get(this.id).sequence);
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
			if (var2 == null) {
				return null;
			} else {
				var2.rotateZ(this.field768);
				return var2;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1344661650"
	)
	void method1972(int var1, int var2) {
		this.sourceX += var1;
		this.sourceY += var2;
		this.targetX += var1;
		this.targetY += var2;
		this.x += (double)Coord.method7417(var1);
		this.y += (double)Coord.method7417(var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lco;IIB)V",
		garbageValue = "20"
	)
	@Export("setDestination")
	void setDestination(WorldViewManager var1, int var2, int var3) {
		if (var2 >= this.cycleStart) {
			class452 var4 = PlayerComposition.method7565(this.targetIndex, this.targetX, this.targetY, this.targetLevel, var1);
			int var5 = (int)var4.field5175;
			int var6 = (int)var4.field5169;
			int var7 = (int)var4.field5176 - this.endHeight;
			var4.method8992();
			double var12;
			double var14;
			double var16;
			if (!this.isMoving) {
				class452 var8 = PlayerComposition.method7565(this.sourceIndex, this.sourceX, this.sourceY, this.sourceLevel, var1);
				int var9 = (int)var8.field5175;
				int var10 = (int)var8.field5169;
				int var11 = (int)var8.field5176 - this.startHeight;
				var8.method8992();
				var12 = (double)(var5 - var9);
				var14 = (double)(var6 - var10);
				var16 = Math.sqrt(var14 * var14 + var12 * var12);
				this.x = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : (double)this.startPos * var12 / var16 + (double)var9;
				this.y = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : (double)var10 + var14 * (double)this.startPos / var16;
				this.z = (double)var11;
			}

			double var18 = (double)(this.cycleEnd + 1 - var2);
			double var20 = ((double)var5 - this.x) / var18;
			var12 = ((double)var6 - this.y) / var18;
			var14 = Math.sqrt(var12 * var12 + var20 * var20);
			if (!this.isMoving) {
				this.field786 = -var14 * Math.tan((double)this.slope * 0.02454369D);
			}

			var16 = 2.0D * ((double)var7 - this.z - var18 * this.field786) / (var18 * var18);
			this.isMoving = true;
			this.x += var20 * (double)var3;
			this.y += var12 * (double)var3;
			this.z += (double)var3 * 0.5D * var16 * (double)var3 + this.field786 * (double)var3;
			this.field786 += (double)var3 * var16;
			this.orientation = (int)(Math.atan2(var20, var12) * 325.949D) + 1024 & 2047;
			this.field768 = (int)(Math.atan2(this.field786, var14) * 325.949D) & 2047;
			Client.field399.method10862(class333.topLevelWorldView, (int)this.x, (int)this.y, false);
			class145.method3747(this.animationSequence, var3, Client.field399);
			Client.field399.method10859();
		}
	}
}
