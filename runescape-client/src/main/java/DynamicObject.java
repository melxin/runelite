import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1843633419
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1965532721
	)
	@Export("type")
	final int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -31819065
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 771919331
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1159185785
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1838693777
	)
	@Export("y")
	final int y;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	final AnimationSequence field775;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 944706933
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIZLjz;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		this.field775 = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		if (var8 != -1) {
			this.field775.setSequence(var8);
			this.animationSequence.setSequence(var8);
			SequenceDefinition var11 = this.field775.getSequenceDefinition();
			this.cycleStart = Client.cycle - 1;
			if (var9 && var11.frameCount != -1) {
				this.field775.method9880();
			}

			if (var10 instanceof DynamicObject) {
				DynamicObject var12 = (DynamicObject)var10;
				if (var12.field775.getId() == var8) {
					if (var11.restartMode == 0) {
						this.field775.setSequence(var12.field775);
						this.cycleStart = var12.cycleStart;
					}

					this.animationSequence.setSequence(var12.animationSequence);
				} else if (!var12.field775.method9905()) {
					this.animationSequence.setSequence(var12.animationSequence);
				} else {
					this.animationSequence.setSequence(var12.field775);
				}
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
		ObjectComposition var1 = AsyncHttpResponse.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			int var12 = Client.cycle - this.cycleStart;
			this.cycleStart = Client.cycle;
			Client.field315.method11277(this.worldView, var10, var11, false);
			int var13 = GrandExchangeOfferUnitPriceComparator.method8811(this.field775, var12, Client.field315);
			Client.field315.method11278();
			if ((var13 & 1) != 0 && (var13 & 8) != 0) {
				this.field775.reset();
			}

			if (this.field775.method9876(30)) {
				if (this.animationSequence.isActive()) {
					int var14 = GrandExchangeOfferUnitPriceComparator.method8811(this.animationSequence, var12, (class476)null);
					if ((var14 & 1) != 0 && (var14 & 8) != 0) {
						this.animationSequence.reset();
					}

					if (!this.animationSequence.method9876(30)) {
						return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.animationSequence.getSequenceDefinition(), this.animationSequence.getFrame());
					}
				}

				return null;
			} else {
				return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.field775.getSequenceDefinition(), this.field775.getFrame());
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		ObjectComposition var1 = AsyncHttpResponse.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return false;
		} else if (this.field775.isActive() && this.field775.getSequenceDefinition().method4938(this.field775.getFrame())) {
			return true;
		} else if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4938(this.animationSequence.getFrame())) {
			return true;
		} else {
			Model var2 = var1.getModelDynamic(this.type, this.orientation, (int[][])null, 0, 0, 0, (SequenceDefinition)null, -1);
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903085797"
	)
	protected int vmethod5827() {
		AnimationSequence var1 = this.field775;
		if (var1 == null) {
			var1 = this.animationSequence;
		}

		if (var1 == null) {
			return 0;
		} else {
			return var1.isActive() ? var1.getSequenceDefinition().animationHeightOffset : 0;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIII)V",
		garbageValue = "-2022892612"
	)
	static final void method2054(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}
}
