import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class53 extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	class47 field356;

	public class53() {
		this.field356 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcp;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field356 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbq;)V"
	)
	public class53(RawSound var1) {
		this.field356 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-17"
	)
	public boolean method1058() {
		return this.field356 == null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "1151027523"
	)
	public RawSound method1059() {
		if (this.field356 != null && this.field356.field323.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1060();
			} finally {
				this.field356.field323.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "-1496363387"
	)
	public RawSound method1065() {
		if (this.field356 != null) {
			this.field356.field323.lock();

			RawSound var1;
			try {
				var1 = this.method1060();
			} finally {
				this.field356.field323.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "-1391725642"
	)
	RawSound method1060() {
		if (this.field356.field322 == null) {
			this.field356.field322 = this.field356.field324.toRawSound((int[])null);
			this.field356.field324 = null;
		}

		return this.field356.field322;
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-864081460"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != AbstractWorldMapIcon.clientPreferences.getMusicVolume()) {
			if (AbstractWorldMapIcon.clientPreferences.getMusicVolume() == 0 && Skeleton.method4902()) {
				class219.method4457(EnumComposition.field2011, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				class177.method3764(0, 0);
				Client.playingJingle = false;
			} else {
				class433.method8178(var0);
			}

			AbstractWorldMapIcon.clientPreferences.updateMusicVolume(var0);
		}

	}
}
