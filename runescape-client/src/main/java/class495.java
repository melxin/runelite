import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class495 extends class494 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 993706947
	)
	static final int field5177;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	final WorldEntityCoord field5180;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	final WorldEntityCoord field5176;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1620791619
	)
	int field5179;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1468008399
	)
	int field5178;

	static {
		field5177 = Client.field645 + 3;
	}

	class495() {
		this.field5180 = new WorldEntityCoord();
		this.field5176 = new WorldEntityCoord();
		this.field5179 = 0;
		this.field5178 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lsm;IB)V",
		garbageValue = "1"
	)
	void vmethod9415(WorldEntityCoord var1, class493 var2, int var3) {
		this.field5180.method5807(var1);
		this.field5176.method5807(var2.field5171);
		this.field5179 = var3 - 1;
		this.field5178 = var2.field5172 + field5177;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)Z",
		garbageValue = "-86250779"
	)
	boolean vmethod9414(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5179 >= this.field5178) {
			var1.method5807(this.field5176);
			return true;
		} else {
			int var5 = this.field5179;
			int var6 = this.field5178;
			float var4 = (float)(var2 - var5) / (float)(var6 - var5);
			WorldEntityCoord var8 = this.field5180;
			WorldEntityCoord var9 = this.field5176;
			float var11 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var12 = var9.getX() - var8.getX();
			int var13 = var9.getY() - var8.getY();
			var12 = (int)(var11 * (float)var12);
			var13 = (int)((float)var13 * var11);
			var1.method5815(var8.getX() + var12, var8.getY() + var13);
			int var15 = var8.getCurrentRotationAngle();
			int var16 = var9.getCurrentRotationAngle();
			int var17 = var16 - var15 & 2047;
			int var14;
			if (var17 > 1024) {
				var14 = -(2048 - var17);
			} else {
				var14 = var17;
			}

			var17 = (int)((float)var14 * var11);
			var1.setCurrentRotationAngle(var8.getCurrentRotationAngle() + var17);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "24575"
	)
	void vmethod9423(int var1, int var2) {
		this.field5180.setDirection(var1, var2);
		this.field5176.setDirection(var1, var2);
	}
}
