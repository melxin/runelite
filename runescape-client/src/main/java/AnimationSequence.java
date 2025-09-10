import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("AnimationSequence")
public class AnimationSequence {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1441367935
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -633146343
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -871398721
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 156740599
	)
	@Export("frameCount")
	int frameCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 162051097
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsp;S)V",
		garbageValue = "31263"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1978885966"
	)
	@Export("reset")
	public void reset() {
		this.setSequence(-1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1341537387"
	)
	@Export("setSequence")
	public void setSequence(int var1) {
		if (var1 >= 0) {
			if (this.id != var1) {
				this.id = var1;
				this.sequenceDefinition = InvDefinition.SequenceDefinition_get(var1);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1533193335"
	)
	@Export("isActive")
	public boolean isActive() {
		return this.sequenceDefinition != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "-1813894053"
	)
	@Export("getSequenceDefinition")
	public SequenceDefinition getSequenceDefinition() {
		return this.sequenceDefinition;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1795699949"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getFrame")
	public int getFrame() {
		return this.frame;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2079636691"
	)
	@Export("getFrameCycle")
	public int getFrameCycle() {
		return this.frameCycle;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	int method9620() {
		return this.frameCount;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2036563251"
	)
	public void method9572() {
		this.frame = 0;
		this.frameCycle = 0;
		this.frameCount = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public void method9589() {
		this.frameCount = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1064142164"
	)
	public int method9574() {
		return this.loopCount;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	void method9575(int var1) {
		this.loopCount = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "227"
	)
	public boolean method9567(int var1) {
		return this.isActive() && this.loopCount > 0 && this.loopCount < var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-1796"
	)
	public boolean method9577() {
		return this.sequenceDefinition == null || this.sequenceDefinition.method4791();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-996881736"
	)
	void method9624(int var1, int var2, int var3) {
		this.frame = var1;
		this.frameCycle = var2;
		this.frameCount = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-4"
	)
	void method9579(int var1, int var2) {
		this.frame = var1;
		this.frameCount = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-467112557"
	)
	public void method9580() {
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
