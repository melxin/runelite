import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class495 extends class494 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -823595953
	)
	static final int field5162;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final WorldEntityCoord field5160;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final WorldEntityCoord field5161;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1496919941
	)
	int field5159;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -402679797
	)
	int field5163;

	static {
		field5162 = Client.field741 + 3;
	}

	class495() {
		this.field5160 = new WorldEntityCoord();
		this.field5161 = new WorldEntityCoord();
		this.field5159 = 0;
		this.field5163 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lsl;II)V",
		garbageValue = "-80024626"
	)
	void vmethod9375(WorldEntityCoord var1, class493 var2, int var3) {
		this.field5160.method5747(var1);
		this.field5161.method5747(var2.field5158);
		this.field5159 = var3 - 1;
		this.field5163 = var2.field5157 + field5162;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIB)Z",
		garbageValue = "-59"
	)
	boolean vmethod9371(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5159 >= this.field5163) {
			var1.method5747(this.field5161);
			return true;
		} else {
			float var4 = class112.method3030(var2, this.field5159, this.field5163);
			WorldEntityCoord var5 = this.field5160;
			WorldEntityCoord var6 = this.field5161;
			float var7 = class555.method10077(0.0F, 1.0F, var4);
			int var8 = var6.getX() - var5.getX();
			int var9 = var6.getY() - var5.getY();
			var8 = (int)((float)var8 * var7);
			var9 = (int)(var7 * (float)var9);
			var1.method5748(var5.getX() + var8, var5.getY() + var9);
			int var11 = var5.getCurrentRotationAngle();
			int var12 = var6.getCurrentRotationAngle();
			int var13 = var12 - var11 & 2047;
			int var10;
			if (var13 > 1024) {
				var10 = -(2048 - var13);
			} else {
				var10 = var13;
			}

			var13 = (int)((float)var10 * var7);
			var1.setCurrentRotationAngle(var5.getCurrentRotationAngle() + var13);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1107559269"
	)
	void vmethod9370(int var1, int var2) {
		this.field5160.setDirection(var1, var2);
		this.field5161.setDirection(var1, var2);
	}
}
