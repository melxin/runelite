import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1998519921
	)
	static int field309;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	static class377 field311;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	AbstractArchive field312;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	NodeHashTable field308;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field308 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field312 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lbq;",
		garbageValue = "-79"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method835(var1, var2, false);
		class53 var6 = (class53)this.field308.get(var4);
		if (var6 != null) {
			return var6.method1065();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcd;",
		garbageValue = "80"
	)
	class53 method846(int var1, int var2) {
		long var3 = this.method835(var1, var2, true);
		class53 var5 = (class53)this.field308.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field312, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field308.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbq;",
		garbageValue = "39731668"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "32327301"
	)
	public class53 method853(int var1) {
		if (this.field312.getGroupCount() == 1) {
			return this.method846(0, var1);
		} else if (this.field312.getGroupFileCount(var1) == 1) {
			return this.method846(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lbq;",
		garbageValue = "-2138216227"
	)
	public RawSound method839(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-1877958709"
	)
	long method835(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}
}
