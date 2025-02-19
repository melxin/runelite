import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable
{
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -956220971
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -476291279
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 457140355
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1317959927
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1719565105
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 324113643
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1317372139
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1900652113
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 119061181
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("as")
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
		int var8 = class176.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = WorldMapData_1.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133536490"
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

					MusicPatchPcmStream.method6807(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.getMayaAnimFrame()) {
					this.isFinished = true;
				} else {
					MusicPatchPcmStream.method6807(this.sequenceDefinition, this.frame, this.x, this.y, false);
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class176.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	static final boolean method2212() {
		return Client.isMenuOpen;
	}
}
