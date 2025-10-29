import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("AnimationSequence")
public class AnimationSequence {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1870316967
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1148754599
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1756992279
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2012240059
	)
	@Export("frameCount")
	int frameCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -862834637
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsj;I)V",
		garbageValue = "2052308201"
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
		garbageValue = "1429364861"
	)
	@Export("reset")
	public void reset() {
		this.setSequence(-1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1053133018"
	)
	@Export("setSequence")
	public void setSequence(int var1) {
		if (var1 >= 0) {
			if (this.id != var1) {
				this.id = var1;
				this.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-831296794"
	)
	@Export("isActive")
	public boolean isActive() {
		return this.sequenceDefinition != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Liw;",
		garbageValue = "-1406073841"
	)
	@Export("getSequenceDefinition")
	public SequenceDefinition getSequenceDefinition() {
		return this.sequenceDefinition;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "101022773"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-609025707"
	)
	@Export("getFrame")
	public int getFrame() {
		return this.frame;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "859206463"
	)
	@Export("getFrameCycle")
	public int getFrameCycle() {
		return this.frameCycle;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "45053939"
	)
	int method9871() {
		return this.frameCount;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	public void method9872() {
		this.frame = 0;
		this.frameCycle = 0;
		this.frameCount = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	public void method9890() {
		this.frameCount = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1958668357"
	)
	public int method9874() {
		return this.loopCount;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-174161386"
	)
	void method9902(int var1) {
		this.loopCount = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1002405506"
	)
	public boolean method9876(int var1) {
		return this.isActive() && this.loopCount > 0 && this.loopCount < var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "803258749"
	)
	public boolean method9905() {
		return this.sequenceDefinition == null || this.sequenceDefinition.method4925();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "53"
	)
	void method9883(int var1, int var2, int var3) {
		this.frame = var1;
		this.frameCycle = var2;
		this.frameCount = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "125"
	)
	void method9879(int var1, int var2) {
		this.frame = var1;
		this.frameCount = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15167"
	)
	public void method9880() {
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.frameCycle = (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			} else {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.getMayaAnimFrame());
			}
		}

	}
}
