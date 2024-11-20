import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class202 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class202 field2093;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class202 field2092;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class202 field2094;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class202 field2095;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class202 field2096;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1677013351
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field2093 = new class202(0);
		field2092 = new class202(1);
		field2094 = new class202(2);
		field2095 = new class202(3);
		field2096 = new class202(4);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	class202(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhu;",
		garbageValue = "-104"
	)
	public static VarbitComposition method4010(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;ZLqu;I)V",
		garbageValue = "-388457935"
	)
	public static void method4012(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class374.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		ItemComposition.ItemDefinition_inMembersWorld = var2;
		class31.ItemDefinition_fileCount = class374.ItemDefinition_archive.getGroupFileCount(10);
		ItemContainer.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "54"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILir;IB)V",
		garbageValue = "111"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field851 = var3.int7 * 128;
		var5.field847 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field846 = var3.int5;
		var5.field850 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field840 = var5.field846 + (int)(Math.random() * (double)(var5.field850 - var5.field846));
		}

	}
}
