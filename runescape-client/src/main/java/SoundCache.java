import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	AbstractArchive field307;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	NodeHashTable field308;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field308 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field307 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbi;",
		garbageValue = "-1223941102"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method839(var1, var2, false);
		class53 var6 = (class53)this.field308.get(var4);
		if (var6 != null) {
			return var6.method1060();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field308.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lct;",
		garbageValue = "-12"
	)
	class53 method836(int var1, int var2) {
		long var3 = this.method839(var1, var2, true);
		class53 var5 = (class53)this.field308.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field307, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field308.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Lbi;",
		garbageValue = "106"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lct;",
		garbageValue = "-123"
	)
	public class53 method841(int var1) {
		if (this.field307.getGroupCount() == 1) {
			return this.method836(0, var1);
		} else if (this.field307.getGroupFileCount(var1) == 1) {
			return this.method836(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbi;",
		garbageValue = "-84"
	)
	public RawSound method855(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1745451376"
	)
	long method839(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-127"
	)
	static void method844(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var1.key >> 48 & 65535L) == (long)var0) {
				var1.remove();
			}
		}

	}
}
