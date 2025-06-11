import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
public class class539 extends class541 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 221408973
	)
	int field5445;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -771800985
	)
	int field5440;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1763489345
	)
	int field5441;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1771360099
	)
	int field5439;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1695836109
	)
	int field5443;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1616583149
	)
	int field5442;

	public class539(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5445 = 0;
		this.field5440 = 0;
		this.field5441 = 0;
		this.field5439 = 0;
		this.field5443 = 0;
		this.field5442 = 0;
		this.field5445 = var1;
		this.field5440 = var2;
		this.field5441 = var3;
		this.field5439 = var4;
		this.field5443 = var5;
		this.field5442 = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133851745"
	)
	public int vmethod10247() {
		double var1 = this.method10259();
		return (int)Math.round((double)(this.field5439 - this.field5445) * var1 + (double)this.field5445);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2145780228"
	)
	public int vmethod10248() {
		double var1 = this.method10259();
		return (int)Math.round((double)this.field5440 + (double)(this.field5443 - this.field5440) * var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	public int vmethod10249() {
		double var1 = this.method10259();
		return (int)Math.round((double)this.field5441 + var1 * (double)(this.field5442 - this.field5441));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lwd;",
		garbageValue = "-1383531260"
	)
	static SpritePixels method10242(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var4 = (long)(var2 << 16 | var0 << 8 | var1);
		return (SpritePixels)var3.get(var4);
	}
}
