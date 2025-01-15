import java.security.SecureRandom;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1131317725
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 360387456
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1696715089
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1635286519
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 941532923
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -975525999
	)
	int field840;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -798105153
	)
	int field841;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 40578233
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1328904845
	)
	int field844;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -553453707
	)
	int field845;
	@ObfuscatedName("aq")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 408592797
	)
	int field847;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1849624967"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field840 = var2.int7 * 128;
			this.field841 = var2.int8 * 16384;
			this.field844 = var2.int5;
			this.field845 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field840 = 0;
			this.field841 = 0;
			this.field844 = 0;
			this.field845 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			UserList.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkn;",
		garbageValue = "1572526147"
	)
	static class271[] method2105() {
		return new class271[]{class271.field3008, class271.field3017, class271.field3016, class271.field3005, class271.field3011, class271.field3010, class271.field3018};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "21906822"
	)
	static SecureRandom method2103() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
	)
	public static void method2104() {
		Arrays.fill(Varps.Varps_temp, 0);
		Arrays.fill(Varps.Varps_main, 0);
	}
}
