import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1722877969
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1193099465
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 575643989
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 427306615
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -497321537
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 254483309
	)
	int field976;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1462361989
	)
	int field977;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1293863003
	)
	int field986;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1879074667
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -292547781
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1936614933
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 413374389
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -812581315
	)
	int field997;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1600208809
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aj")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("al")
	@Export("x")
	double x;
	@ObfuscatedName("ac")
	@Export("y")
	double y;
	@ObfuscatedName("ay")
	@Export("z")
	double z;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1550523203
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1946268447
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1051607675
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ah")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("az")
	@Export("speed")
	double speed;
	@ObfuscatedName("at")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ab")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 915881501
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1225695711
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = ArchiveLoader.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class91.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field997 = var10;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "65"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field976 = var1;
		this.field977 = var2;
		this.field986 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field976 - this.sourceX);
			double var7 = (double)(this.field977 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = Math.abs(var9) < 0.009999999776482582D ? (double)this.sourceX : (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = Math.abs(var9) < 0.009999999776482582D ? (double)this.sourceY : (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field976 - this.x) / var5;
		this.speedY = ((double)this.field977 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field986 - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1407261867"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveLoader.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1838007020"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + (double)var1 * this.accelerationZ * 0.5D * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.getMayaAnimFrame();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lqf;I)Lqf;",
		garbageValue = "-291076855"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = WorldMapLabelSize.method5922(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}
}
