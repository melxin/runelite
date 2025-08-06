import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	AbstractArchive field1350;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	NodeHashTable field1352;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field1352 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field1350 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[II)Ldg;",
		garbageValue = "-359035993"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method3074(var1, var2, false);
		class107 var6 = (class107)this.field1352.get(var4);
		if (var6 != null) {
			return var6.method3305();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.method2972(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field1352.put(new class107(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lej;",
		garbageValue = "-1786104228"
	)
	class107 method3090(int var1, int var2) {
		long var3 = this.method3074(var1, var2, true);
		class107 var5 = (class107)this.field1352.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field1350, var1, var2);
			if (var6 == null) {
				return new class107();
			} else {
				class107 var7 = new class107(var6);
				this.field1352.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[II)Ldg;",
		garbageValue = "361382036"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 1) {
			return this.getSoundEffect0(var1, 1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) - 1 == 0) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lej;",
		garbageValue = "1495631465"
	)
	public class107 method3072(int var1) {
		if (this.field1350.getGroupCount() == 1) {
			return this.method3090(0, var1);
		} else if (this.field1350.getGroupFileCount(var1) == 1) {
			return this.method3090(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ldg;",
		garbageValue = "-2103967996"
	)
	public RawSound method3073(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "-83"
	)
	long method3074(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnw;IIIIB)Lnw;",
		garbageValue = "-121"
	)
	public static class357 method3092(class357 var0, int var1, int var2, int var3, int var4) {
		class357 var5 = var0;

		class357 var6;
		for (var6 = null; var5 != null; var5 = var5.field3959) {
			if (var5.field3957 >= var1 && var5.field3956 <= var2) {
				if (var6 != null) {
					var6.field3959 = var5.field3959;
				} else {
					var0 = var5.field3959;
				}

				class357 var7;
				if (var5.field3956 < var1) {
					var7 = new class357(var5.field3956, var1 - 1, var5.field3958, var5.field3955);
					if (var6 != null) {
						var7.field3959 = var6.field3959;
					} else {
						var7.field3959 = var0;
					}

					if (var6 != null) {
						var6.field3959 = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.field3957 > var2) {
					var7 = new class357(var2 + 1, var5.field3957, var5.field3958, var5.field3955);
					if (var6 != null) {
						var7.field3959 = var6.field3959;
					} else {
						var7.field3959 = var0;
					}

					if (var6 != null) {
						var6.field3959 = var7;
					} else {
						var0 = var7;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (var6 = var0; var6 != null && var6.field3956 <= var1; var6 = var6.field3959) {
			var5 = var6;
		}

		var6 = new class357(var1, var2, var3, var4);
		if (var5 != null) {
			var6.field3959 = var5.field3959;
		} else {
			var6.field3959 = var0;
		}

		if (var5 != null) {
			var5.field3959 = var6;
		} else {
			var0 = var6;
		}

		return var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "-1641555727"
	)
	static Object[] method3093() {
		String var0 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
		Object[] var1 = new Object[var0.length()];

		for (int var2 = var0.length() - 1; var2 >= 0; --var2) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			} else {
				var1[var2] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			}
		}

		return var1;
	}
}
