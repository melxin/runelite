import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	/*final*/ WorldView field700;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1242994835
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1342436349
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 970777365
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -164806355
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1188767781
	)
	@Export("z")
	int z;
	@ObfuscatedName("aa")
	@Export("isFinished")
	boolean isFinished;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1625796813
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -513314587
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1393685745
	)
	@Export("frameCycle")
	int frameCycle;

	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIII)V"
	)
	GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		this.isFinished = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.field700 = var1;
		this.id = var2;
		this.plane = var3;
		this.x = var4;
		this.y = var5;
		this.z = var6;
		this.cycleStart = var8 + var7;
		int var9 = class386.SpotAnimationDefinition_get(this.id).sequence;
		if (var9 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = VarpDefinition.SequenceDefinition_get(var9);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "65536"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}

					class203.method4299(this.field700, this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.getMayaAnimFrame()) {
					this.isFinished = true;
				} else {
					class203.method4299(this.field700, this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class386.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "1255062600"
	)
	public static void method1854(String[] var0, short[] var1) {
		class368.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lcp;IIB)V",
		garbageValue = "103"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = VarpDefinition.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1066 = 0;
			}

			if (var3 == 2) {
				var0.field1066 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || VarpDefinition.SequenceDefinition_get(var1).field2360 >= VarpDefinition.SequenceDefinition_get(var0.sequence).field2360) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1066 = 0;
			var0.field1048 = var0.pathLength;
		}

	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIB)V",
		garbageValue = "0"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = DevicePcmPlayerProvider.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= class6.cameraX;
			var6 -= ClientPreferences.cameraY;
			var2 -= GrandExchangeOfferAgeComparator.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[WorldMapData_1.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[WorldMapData_1.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[class455.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class455.cameraYaw];
			int var11 = var9 * var2 + var10 * var1 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var8 * var6 - var7 * var2 >> 16;
			var2 = var7 * var6 + var8 * var2 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	public GraphicsObject() {
	}
}
