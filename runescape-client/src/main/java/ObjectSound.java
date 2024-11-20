import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1823484197
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1135924963
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1617938843
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 920811693
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 885273791
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 548135775
	)
	int field851;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 697067505
	)
	int field847;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1416577995
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -677361979
	)
	int field846;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2124273621
	)
	int field850;
	@ObfuscatedName("al")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -523496377
	)
	int field840;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "52747222"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field851 = var2.int7 * 128;
			this.field847 = var2.int8 * 16384;
			this.field846 = var2.int5;
			this.field850 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field851 = 0;
			this.field847 = 0;
			this.field846 = 0;
			this.field850 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class53.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "954710882"
	)
	public static HitSplatDefinition method1997(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
