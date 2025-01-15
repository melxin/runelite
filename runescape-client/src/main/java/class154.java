import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class154 extends class150 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -59590313
	)
	int field1700;
	@ObfuscatedName("ah")
	byte field1699;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class154(class153 var1) {
		this.this$0 = var1;
		this.field1700 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1700 = var1.readUnsignedShort();
		this.field1699 = var1.readByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3695(this.field1700, this.field1699);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-792671172"
	)
	public static final void method3627(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "27"
	)
	static boolean method3621(int var0, int var1, int var2, int var3, int var4, int var5) {
		return class323.method6619(class30.worldView.plane, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Ldx;IILkq;I)V",
		garbageValue = "-2028366493"
	)
	static final void method3629(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4) {
		int var5 = var1.pathX[0];
		int var6 = var1.pathY[0];
		int var7 = var1.transformedSize();
		CollisionMap var8 = var0.collisionMaps[var0.plane];
		if (var5 >= var7 && var5 < var8.xSize - var7 && var6 >= var7 && var6 < var8.ySize - var7) {
			if (var2 >= var7 && var2 < var8.xSize - var7 && var3 >= var7 && var3 < var8.ySize - var7) {
				int var9 = Client.field793.method5941(var5, var6, var1.transformedSize(), class231.method5129(var2, var3), var8, true, Client.field799, Client.field800);
				if (var9 >= 1) {
					for (int var10 = 0; var10 < var9 - 1; ++var10) {
						var1.method2678(Client.field799[var10], Client.field800[var10], var4);
					}

				}
			}
		}
	}
}
