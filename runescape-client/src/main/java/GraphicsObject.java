import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1789390543
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1926961565
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2147325297
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1275497143
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -89883695
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1175477221
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 337630113
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -362503139
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ac")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = ObjectComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class33.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-437976859"
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

					class271.method5839(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.getMayaAnimFrame()) {
					this.isFinished = true;
				} else {
					class271.method5839(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ObjectComposition.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	public static void method2356(Applet var0, String var1) {
		class31.field138 = var0;
		if (var1 != null) {
			class31.field137 = var1;
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2082786972"
	)
	static void method2357(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-846140912"
	)
	static final void method2358(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class159.cameraPitch < var0) {
			class159.cameraPitch = (var0 - class159.cameraPitch) * HttpQueryParams.field5142 / 1000 + class159.cameraPitch + class383.field4491;
			if (class159.cameraPitch > var0) {
				class159.cameraPitch = var0;
			}
		} else if (class159.cameraPitch > var0) {
			class159.cameraPitch -= (class159.cameraPitch - var0) * HttpQueryParams.field5142 / 1000 + class383.field4491;
			if (class159.cameraPitch < var0) {
				class159.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - IntProjection.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			IntProjection.cameraYaw = var2 * HttpQueryParams.field5142 / 1000 + IntProjection.cameraYaw + class383.field4491;
			IntProjection.cameraYaw &= 2047;
		} else if (var2 < 0) {
			IntProjection.cameraYaw -= -var2 * HttpQueryParams.field5142 / 1000 + class383.field4491;
			IntProjection.cameraYaw &= 2047;
		}

		int var3 = var1 - IntProjection.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			IntProjection.cameraYaw = var1;
		}

	}

	public GraphicsObject() {
	}
}
