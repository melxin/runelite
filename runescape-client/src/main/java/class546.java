import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public class class546 extends class549 {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 479160497
	)
	int field5714;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1920423609
	)
	int field5715;
	@ObfuscatedName("ag")
	double field5721;
	@ObfuscatedName("aj")
	double field5717;
	@ObfuscatedName("ah")
	double field5718;
	@ObfuscatedName("af")
	double field5719;
	@ObfuscatedName("ae")
	double field5716;

	public class546(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5714 = 0;
		this.field5715 = 0;
		this.field5721 = 0.0D;
		this.field5717 = 0.0D;
		this.field5718 = 0.0D;
		this.field5719 = 0.0D;
		this.field5716 = 0.0D;
		this.field5714 = var3;
		this.field5715 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5721 = (double)var4;
			this.field5717 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
			this.field5721 = (var17 + (var11 * var19 - var21 * var15) - var13) / (var19 - var21);
			this.field5717 = var19 * (this.field5721 - var11) + var13;
			this.field5718 = Math.sqrt(Math.pow(this.field5721 - (double)var1, 2.0D) + Math.pow(this.field5717 - (double)var2, 2.0D));
			this.field5719 = Math.atan2((double)var2 - this.field5717, (double)var1 - this.field5721);
			double var23 = Math.atan2((double)var8 - this.field5717, (double)var7 - this.field5721);
			this.field5716 = Math.atan2((double)var5 - this.field5717, (double)var4 - this.field5721);
			boolean var25 = this.field5719 <= var23 && var23 <= this.field5716 || this.field5716 <= var23 && var23 <= this.field5719;
			if (!var25) {
				this.field5716 += 3.141592653589793D * (double)(this.field5719 - this.field5716 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1365294516"
	)
	public int vmethod10764() {
		double var1 = this.method10766();
		double var3 = this.field5719 + (this.field5716 - this.field5719) * var1;
		return (int)Math.round(this.field5721 + this.field5718 * Math.cos(var3));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int vmethod10755() {
		double var1 = this.method10766();
		double var3 = this.field5719 + (this.field5716 - this.field5719) * var1;
		return (int)Math.round(this.field5717 + this.field5718 * Math.sin(var3));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	public int vmethod10756() {
		double var1 = this.method10766();
		return (int)Math.round(var1 * (double)(this.field5715 - this.field5714) + (double)this.field5714);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lbv;",
		garbageValue = "2058485213"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}
}
