import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("AnimationSequence")
public class AnimationSequence {
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 645005819
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1901052507
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2116322795
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1890024059
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -189665363
	)
	@Export("frameCount")
	int frameCount;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1589498117
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrk;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	@Export("reset")
	public void reset() {
		this.setSequence(-1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1995"
	)
	@Export("setSequence")
	public void setSequence(int var1) {
		if (var1 >= 0) {
			if (this.id != var1) {
				this.id = var1;
				this.sequenceDefinition = AsyncHttpResponse.SequenceDefinition_get(var1);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-315094390"
	)
	@Export("isActive")
	public boolean isActive() {
		return this.sequenceDefinition != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Liz;",
		garbageValue = "-363043954"
	)
	@Export("getSequenceDefinition")
	public SequenceDefinition getSequenceDefinition() {
		return this.sequenceDefinition;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-114115329"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097232936"
	)
	@Export("getFrame")
	public int getFrame() {
		return this.frame;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-862288814"
	)
	@Export("getFrameCycle")
	public int getFrameCycle() {
		return this.frameCycle;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "632496179"
	)
	int method9578() {
		return this.frameCount;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-813460718"
	)
	public void method9576() {
		this.frame = 0;
		this.frameCycle = 0;
		this.frameCount = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1769156026"
	)
	public void method9577() {
		this.frameCount = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	public int method9597() {
		return this.loopCount;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1988885143"
	)
	void method9579(int var1) {
		this.loopCount = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "231"
	)
	public boolean method9601(int var1) {
		return this.isActive() && this.loopCount > 0 && this.loopCount < var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-195198945"
	)
	public boolean method9581() {
		return this.sequenceDefinition == null || this.sequenceDefinition.method4719();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1822121600"
	)
	void method9582(int var1, int var2, int var3) {
		this.frame = var1;
		this.frameCycle = var2;
		this.frameCount = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	void method9583(int var1, int var2) {
		this.frame = var1;
		this.frameCount = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-962847969"
	)
	public void method9613() {
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.frameCycle = (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			} else {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.getMayaAnimFrame());
			}
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-416265386"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class167.widgetDefinition.loadInterface(var0)) {
			class380.updateInterface(class167.widgetDefinition.Widget_interfaceComponents[var0], 0, class167.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
