import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public class class521 extends class520 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -556599363
	)
	static final int field5551;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	final WorldEntityCoord field5550;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	final WorldEntityCoord field5548;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1476725613
	)
	int field5549;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 98305895
	)
	int field5552;

	static {
		field5551 = Client.revision + 3;
	}

	class521() {
		this.field5550 = new WorldEntityCoord();
		this.field5548 = new WorldEntityCoord();
		this.field5549 = 0;
		this.field5552 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lto;II)V",
		garbageValue = "-1824890420"
	)
	void vmethod10584(WorldEntityCoord var1, class519 var2, int var3) {
		this.field5550.method6455(var1);
		this.field5548.method6455(var2.field5545);
		this.field5549 = var3 - 1;
		this.field5552 = var2.field5542 + field5551;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIB)Z",
		garbageValue = "99"
	)
	boolean vmethod10595(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5549 >= this.field5552) {
			var1.method6455(this.field5548);
			return true;
		} else {
			int var5 = this.field5549;
			int var6 = this.field5552;
			float var4 = (float)(var2 - var5) / (float)(var6 - var5);
			WorldEntityCoord var8 = this.field5550;
			WorldEntityCoord var9 = this.field5548;
			float var10 = GameEngine.method701(0.0F, 1.0F, var4);
			int var11 = var9.getX() - var8.getX();
			int var12 = var9.getY() - var8.getY();
			var11 = (int)((float)var11 * var10);
			var12 = (int)((float)var12 * var10);
			var1.method6487(var8.getX() + var11, var8.getY() + var12);
			int var13 = WorldMapRegion.method6823(var8.getCurrentRotationAngle(), var9.getCurrentRotationAngle());
			var13 = (int)(var10 * (float)var13);
			var1.setCurrentRotationAngle(var8.getCurrentRotationAngle() + var13);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "56"
	)
	void vmethod10586(int var1, int var2) {
		this.field5550.setDirection(var1, var2);
		this.field5548.setDirection(var1, var2);
	}
}
