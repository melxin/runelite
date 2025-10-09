import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vr")
public class class547 extends class549 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("topLevelWorldView")
	public static WorldView topLevelWorldView;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1609115437
	)
	int field5729;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -918855803
	)
	int field5723;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1210898035
	)
	int field5727;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2109945897
	)
	int field5725;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1477783865
	)
	int field5724;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1407948839
	)
	int field5722;

	public class547(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5729 = 0;
		this.field5723 = 0;
		this.field5727 = 0;
		this.field5725 = 0;
		this.field5724 = 0;
		this.field5722 = 0;
		this.field5729 = var1;
		this.field5723 = var2;
		this.field5727 = var3;
		this.field5725 = var4;
		this.field5724 = var5;
		this.field5722 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1365294516"
	)
	public int vmethod10764() {
		double var1 = this.method10766();
		return (int)Math.round((double)this.field5729 + (double)(this.field5725 - this.field5729) * var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int vmethod10755() {
		double var1 = this.method10766();
		return (int)Math.round((double)this.field5723 + var1 * (double)(this.field5724 - this.field5723));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	public int vmethod10756() {
		double var1 = this.method10766();
		return (int)Math.round((double)this.field5727 + (double)(this.field5722 - this.field5727) * var1);
	}
}
