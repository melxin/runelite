import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class483 extends class482 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 511137801
	)
	static final int field5045;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1809519995
	)
	static int field5046;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5042;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5043;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1218565273
	)
	int field5041;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 434863069
	)
	int field5044;

	static {
		field5045 = Client.field695 + 3;
	}

	class483() {
		this.field5042 = new WorldEntityCoord();
		this.field5043 = new WorldEntityCoord();
		this.field5041 = 0;
		this.field5044 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lks;Lsm;II)V",
		garbageValue = "-1318895003"
	)
	void vmethod9368(WorldEntityCoord var1, class481 var2, int var3) {
		this.field5042.method5899(var1);
		this.field5043.method5899(var2.field5037);
		this.field5041 = var3 - 1;
		this.field5044 = var2.field5038 + field5045;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lks;IIB)Z",
		garbageValue = "-65"
	)
	boolean vmethod9369(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5041 >= this.field5044) {
			var1.method5899(this.field5043);
			return true;
		} else {
			float var4 = class33.method521(var2, this.field5041, this.field5044);
			WorldEntityCoord var5 = this.field5042;
			WorldEntityCoord var6 = this.field5043;
			float var7 = Frames.method4470(0.0F, 1.0F, var4);
			int var8 = var6.getX() - var5.getX();
			int var9 = var6.getY() - var5.getY();
			var8 = (int)(var7 * (float)var8);
			var9 = (int)((float)var9 * var7);
			var1.method5902(var5.getX() + var8, var5.getY() + var9);
			int var10 = BuddyRankComparator.method3362(var5.getCurrentRotationAngle(), var6.getCurrentRotationAngle());
			var10 = (int)(var7 * (float)var10);
			var1.setCurrentRotationAngle(var5.getCurrentRotationAngle() + var10);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1212488341"
	)
	void vmethod9367(int var1, int var2) {
		this.field5042.setDirection(var1, var2);
		this.field5043.setDirection(var1, var2);
	}
}
