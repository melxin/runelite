import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class330 implements class325 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3820;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3815;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3819;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3817;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3814;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3818;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static final class330 field3816;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class330 field3821;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lmv;"
	)
	static final class330[] field3822;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -72141241
	)
	public final int field3823;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 388735737
	)
	public final int field3824;

	static {
		field3820 = new class330(14, 0);
		field3815 = new class330(15, 20);
		field3819 = new class330(16, -2);
		field3817 = new class330(18, -2);
		field3814 = new class330(19, -2);
		field3818 = new class330(21, 37);
		field3816 = new class330(27, 0);
		field3821 = new class330(32, 66);
		field3822 = new class330[33];
		class330[] var0 = class351.method7401();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3822[var0[var1].field3823] = var0[var1];
		}

	}

	class330(int var1, int var2) {
		this.field3823 = var1;
		this.field3824 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljn;",
		garbageValue = "683696801"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = class139.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class458.SpotAnimationDefinition_archive;
			boolean var5 = true;
			int var6 = -1;
			int[] var7 = var3.getGroupFileIds(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var3.getFile(var0, var7[var8]);
				if (var9 == null) {
					var5 = false;
				} else if (var6 == -1) {
					var6 = (var9[0] & 255) << 8 | var9[1] & 255;
				}
			}

			if (var6 != -1) {
				byte[] var10 = var4.getFile(var6, 0);
				if (var10 == null) {
					var5 = false;
				}
			} else {
				var5 = false;
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0);
				} catch (Exception var11) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ltl;",
		garbageValue = "2071617737"
	)
	static DynamicArray method7060(int var0, Object var1) {
		DynamicArray var2 = (DynamicArray)var1;
		if (var2 == null) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}
}
