import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class173 extends class149 {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 409837471
	)
	int field1872;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -3973325281832991069L
	)
	long field1869;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class173(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1872 = var1.readInt();
		this.field1869 = var1.readLong();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3758(this.field1872, this.field1869);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lks;Lks;FLks;I)V",
		garbageValue = "-1666698759"
	)
	static void method3918(WorldEntityCoord var0, WorldEntityCoord var1, float var2, WorldEntityCoord var3) {
		float var4 = Math.max(0.0F, Math.min(var2, 1.0F));
		int var5 = var1.getX() - var0.getX();
		int var6 = var1.getY() - var0.getY();
		var5 = (int)(var4 * (float)var5);
		var6 = (int)(var4 * (float)var6);
		var3.method6057(var0.getX() + var5, var0.getY() + var6);
		int var8 = var0.getCurrentRotationAngle();
		int var9 = var1.getCurrentRotationAngle();
		int var10 = var9 - var8 & 2047;
		int var7;
		if (var10 > 1024) {
			var7 = -(2048 - var10);
		} else {
			var7 = var10;
		}

		var10 = (int)((float)var7 * var4);
		var3.setCurrentRotationAngle(var0.getCurrentRotationAngle() + var10);
	}
}
