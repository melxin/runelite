import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("AnimationSequence")
public class AnimationSequence {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 677279171
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1104781551
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2122494283
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 413280109
	)
	@Export("frameCount")
	int frameCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1629924213
	)
	@Export("loopCount")
	int loopCount;

	public AnimationSequence() {
		this.id = -1;
		this.sequenceDefinition = null;
		this.frame = -1;
		this.frameCount = 0;
		this.loopCount = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V",
		garbageValue = "1758418506"
	)
	@Export("setSequence")
	public void setSequence(AnimationSequence var1) {
		this.sequenceDefinition = var1.sequenceDefinition;
		this.id = var1.id;
		this.frameCycle = var1.frameCycle;
		this.frame = var1.frame;
		this.frameCount = var1.frameCount;
		this.loopCount = var1.loopCount;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-825469743"
	)
	@Export("reset")
	public void reset() {
		this.setSequence(-1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "171550454"
	)
	@Export("setSequence")
	public void setSequence(int var1) {
		if (var1 >= 0) {
			if (this.id != var1) {
				this.id = var1;
				this.sequenceDefinition = class171.SequenceDefinition_get(var1);
				this.loopCount = 0;
				if (this.frame == -1) {
					this.frame = 0;
				}
			}
		} else {
			this.id = -1;
			this.sequenceDefinition = null;
			this.frame = -1;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-893318477"
	)
	@Export("isActive")
	public boolean isActive() {
		return this.sequenceDefinition != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lit;",
		garbageValue = "-90648260"
	)
	@Export("getSequenceDefinition")
	public SequenceDefinition getSequenceDefinition() {
		return this.sequenceDefinition;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-53645754"
	)
	@Export("getFrame")
	public int getFrame() {
		return this.frame;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1217755275"
	)
	@Export("getFrameCycle")
	public int getFrameCycle() {
		return this.frameCycle;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "26651"
	)
	int method9629() {
		return this.frameCount;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "622597995"
	)
	public void method9630() {
		this.frame = 0;
		this.frameCycle = 0;
		this.frameCount = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "676952571"
	)
	public void method9678() {
		this.frameCount = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "114"
	)
	public int method9666() {
		return this.loopCount;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "86"
	)
	void method9633(int var1) {
		this.loopCount = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1839407032"
	)
	public boolean method9634(int var1) {
		return this.isActive() && this.loopCount > 0 && this.loopCount < var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method9635() {
		return this.sequenceDefinition == null || this.sequenceDefinition.method4856();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-429269582"
	)
	void method9636(int var1, int var2, int var3) {
		this.frame = var1;
		this.frameCycle = var2;
		this.frameCount = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-38"
	)
	void method9637(int var1, int var2) {
		this.frame = var1;
		this.frameCount = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1961194554"
	)
	public void method9638() {
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.frameCycle = (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			} else {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.getMayaAnimFrame());
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lxl;",
		garbageValue = "-1520553667"
	)
	public static SpritePixels[] method9685(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return HttpJsonRequestBody.method10636(var0, var3, var4);
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILny;ZB)V",
		garbageValue = "85"
	)
	static void method9649(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = ItemContainer.getWorldMap().getMapArea(var0);
		int var4 = class159.localPlayer.plane;
		int var5 = (class159.localPlayer.x >> 7) + class547.topLevelWorldView.baseX;
		int var6 = (class159.localPlayer.y >> 7) + class547.topLevelWorldView.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		ItemContainer.getWorldMap().method10800(var3, var7, var1, var2);
	}
}
