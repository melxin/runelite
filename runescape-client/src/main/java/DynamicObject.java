import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	static class568 field817;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1564169963
	)
	@Export("id")
	final int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2042063485
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2073905721
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 676697373
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1909063007
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2014238423
	)
	@Export("y")
	final int y;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	final AnimationSequence field818;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1824128041
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIIZLiz;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		this.field818 = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		if (var8 != -1) {
			this.field818.setSequence(var8);
			this.animationSequence.setSequence(var8);
			SequenceDefinition var11 = this.field818.getSequenceDefinition();
			this.cycleStart = Client.cycle - 1;
			if (var9 && var11.frameCount != -1) {
				this.field818.method9580();
			}

			if (var10 instanceof DynamicObject) {
				DynamicObject var12 = (DynamicObject)var10;
				if (var12.field818.getId() == var8) {
					if (var11.restartMode == 0) {
						this.field818.setSequence(var12.field818);
						this.cycleStart = var12.cycleStart;
					}

					this.animationSequence.setSequence(var12.animationSequence);
				} else if (!var12.field818.method9577()) {
					this.animationSequence.setSequence(var12.animationSequence);
				} else {
					this.animationSequence.setSequence(var12.field818);
				}
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
		ObjectComposition var1 = ModeWhere.getObjectDefinition(this.id);
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
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			int var12 = Client.cycle - this.cycleStart;
			this.cycleStart = Client.cycle;
			Client.field399.method10862(this.worldView, var10, var11, false);
			int var13 = class145.method3747(this.field818, var12, Client.field399);
			Client.field399.method10859();
			if ((var13 & 1) != 0 && (var13 & 8) != 0) {
				this.field818.reset();
			}

			if (this.field818.method9567(30)) {
				if (this.animationSequence.isActive()) {
					int var14 = class145.method3747(this.animationSequence, var12, (class468)null);
					if ((var14 & 1) != 0 && (var14 & 8) != 0) {
						this.animationSequence.reset();
					}

					if (!this.animationSequence.method9567(30)) {
						return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.animationSequence.getSequenceDefinition(), this.animationSequence.getFrame());
					}
				}

				return null;
			} else {
				return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.field818.getSequenceDefinition(), this.field818.getFrame());
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldo;I)I",
		garbageValue = "-610071463"
	)
	static int method2007(RawPcmStream var0) {
		return var0 != null ? var0.method3175() : 0;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldr;III)Lre;",
		garbageValue = "1180540034"
	)
	static class452 method2010(WorldView var0, int var1, int var2) {
		if (var0 != null && class333.topLevelWorldView != var0) {
			WorldEntity var3 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? WorldMapSection0.method6761((float)var1, 0.0F, (float)var2) : var3.method10084(var1, var2);
		} else {
			return WorldMapSection0.method6761((float)var1, 0.0F, (float)var2);
		}
	}
}
