import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public final class class73 extends TileItem {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -956220971
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -476291279
	)
	int field906;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 457140355
	)
	int field899;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1317959927
	)
	int field901;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1719565105
	)
	int field902;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 324113643
	)
	int field903;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1317372139
	)
	int field904;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	SequenceDefinition field905;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1900652113
	)
	int field908;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 119061181
	)
	int field907;
	@ObfuscatedName("as")
	boolean field900;

	class73(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field908 = 0;
		this.field907 = 0;
		this.field900 = false;
		this.field906 = var1;
		this.field901 = var2;
		this.field902 = var3;
		this.field903 = var4;
		this.field904 = var5;
		this.field899 = var7 + var6;
		int var8 = class176.method3761(this.field906).sequence;
		if (var8 != -1) {
			this.field900 = false;
			this.field905 = WorldMapData_1.SequenceDefinition_get(var8);
		} else {
			this.field900 = true;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133536490"
	)
	final void method2210(int var1) {
		if (!this.field900) {
			this.field907 += var1;
			if (!this.field905.isCachedModelIdSet()) {
				while (this.field907 > this.field905.frameLengths[this.field908]) {
					this.field907 -= this.field905.frameLengths[this.field908];
					++this.field908;
					if (this.field908 >= this.field905.frameIds.length) {
						this.field900 = true;
						break;
					}

					MusicPatchPcmStream.method6807(this.field905, this.field908, this.field902, this.field903, false);
				}
			} else {
				this.field908 += var1;
				if (this.field908 >= this.field905.getMayaAnimFrame()) {
					this.field900 = true;
				} else {
					MusicPatchPcmStream.method6807(this.field905, this.field908, this.field902, this.field903, false);
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class176.method3761(this.field906);
		Model var2;
		if (!this.field900) {
			var2 = var1.getModel(this.field908);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "79"
	)
	static final boolean method2212() {
		return Client.isMenuOpen;
	}
}
