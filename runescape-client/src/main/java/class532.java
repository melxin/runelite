import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
public class class532 extends class535 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 54809139
	)
	int field5369;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1397780337
	)
	int field5365;
	@ObfuscatedName("ae")
	double field5370;
	@ObfuscatedName("af")
	double field5367;
	@ObfuscatedName("as")
	double field5368;
	@ObfuscatedName("aq")
	double field5364;
	@ObfuscatedName("av")
	double field5366;

	public class532(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5369 = 0;
		this.field5365 = 0;
		this.field5370 = 0.0D;
		this.field5367 = 0.0D;
		this.field5368 = 0.0D;
		this.field5364 = 0.0D;
		this.field5366 = 0.0D;
		this.field5369 = var3;
		this.field5365 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5370 = (double)var4;
			this.field5367 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5370 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field5367 = var19 * (this.field5370 - var11) + var13;
			this.field5368 = Math.sqrt(Math.pow(this.field5370 - (double)var1, 2.0D) + Math.pow(this.field5367 - (double)var2, 2.0D));
			this.field5364 = Math.atan2((double)var2 - this.field5367, (double)var1 - this.field5370);
			double var23 = Math.atan2((double)var8 - this.field5367, (double)var7 - this.field5370);
			this.field5366 = Math.atan2((double)var5 - this.field5367, (double)var4 - this.field5370);
			boolean var25 = this.field5364 <= var23 && var23 <= this.field5366 || this.field5366 <= var23 && var23 <= this.field5364;
			if (!var25) {
				this.field5366 += 3.141592653589793D * (double)(this.field5364 - this.field5366 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133258747"
	)
	public int vmethod9768() {
		double var1 = this.method9776();
		double var3 = this.field5364 + (this.field5366 - this.field5364) * var1;
		return (int)Math.round(this.field5370 + this.field5368 * Math.cos(var3));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1239347117"
	)
	public int vmethod9763() {
		double var1 = this.method9776();
		double var3 = (this.field5366 - this.field5364) * var1 + this.field5364;
		return (int)Math.round(this.field5367 + this.field5368 * Math.sin(var3));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int vmethod9764() {
		double var1 = this.method9776();
		return (int)Math.round((double)(this.field5365 - this.field5369) * var1 + (double)this.field5369);
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-43"
	)
	static void method9742(String var0, int var1) {
		MenuAction.method2254(0, 0);
		ArrayList var2 = new ArrayList();
		var2.add(new MidiRequest(class133.field1576, var0, "", var1, false));
		MouseHandler.method665(var2, 0, 0, 0, 100, false);
	}
}
