import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1358494763
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 607420591
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1631115417
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1958998367
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1048650215
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1276208485
	)
	int field844;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1741254413
	)
	int field838;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1001677625
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -903653197
	)
	int field848;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1485963561
	)
	int field849;
	@ObfuscatedName("ar")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1454533057
	)
	int field854;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-285639697"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field844 = var2.int7 * 16384;
			this.field838 = var2.int8 * 128;
			this.field848 = var2.int5;
			this.field849 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field844 = 0;
			this.field838 = 0;
			this.field848 = 0;
			this.field849 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			BufferedSink.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}
}
