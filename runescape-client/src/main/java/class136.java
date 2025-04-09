import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class136 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1613;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1609;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1617;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1610;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1611;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class136 field1612;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1732097381
	)
	final int field1608;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -342959767
	)
	final int field1614;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1331588017
	)
	final int field1615;

	static {
		field1613 = new class136(0, 0, (String)null, 0);
		field1609 = new class136(1, 1, (String)null, 9);
		field1617 = new class136(2, 2, (String)null, 3);
		field1610 = new class136(3, 3, (String)null, 6);
		field1611 = new class136(4, 4, (String)null, 1);
		field1612 = new class136(5, 5, (String)null, 3);
	}

	class136(int var1, int var2, String var3, int var4) {
		this.field1608 = var1;
		this.field1614 = var2;
		this.field1615 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1614;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "211033770"
	)
	int method3352() {
		return this.field1615;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "7"
	)
	public static HealthBarDefinition method3355(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field2641 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lms;",
		garbageValue = "-282456144"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3641, ServerPacket.field3512, ServerPacket.field3513, ServerPacket.field3522, ServerPacket.field3515, ServerPacket.field3595, ServerPacket.field3541, ServerPacket.field3593, ServerPacket.field3519, ServerPacket.field3520, ServerPacket.field3521, ServerPacket.field3576, ServerPacket.field3523, ServerPacket.field3551, ServerPacket.field3547, ServerPacket.field3566, ServerPacket.field3527, ServerPacket.field3565, ServerPacket.field3529, ServerPacket.field3618, ServerPacket.field3531, ServerPacket.field3586, ServerPacket.field3635, ServerPacket.field3534, ServerPacket.field3535, ServerPacket.field3573, ServerPacket.field3537, ServerPacket.field3637, ServerPacket.field3539, ServerPacket.field3590, ServerPacket.field3628, ServerPacket.field3542, ServerPacket.field3543, ServerPacket.field3544, ServerPacket.field3545, ServerPacket.field3552, ServerPacket.field3574, ServerPacket.field3548, ServerPacket.field3549, ServerPacket.field3550, ServerPacket.field3575, ServerPacket.field3524, ServerPacket.field3553, ServerPacket.field3554, ServerPacket.field3555, ServerPacket.field3514, ServerPacket.field3557, ServerPacket.field3558, ServerPacket.field3559, ServerPacket.field3560, ServerPacket.field3561, ServerPacket.field3569, ServerPacket.field3563, ServerPacket.field3643, ServerPacket.field3533, ServerPacket.field3538, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.field3598, ServerPacket.field3577, ServerPacket.field3571, ServerPacket.field3572, ServerPacket.field3556, ServerPacket.field3609, ServerPacket.field3528, ServerPacket.field3540, ServerPacket.field3629, ServerPacket.field3578, ServerPacket.field3579, ServerPacket.field3580, ServerPacket.field3581, ServerPacket.field3582, ServerPacket.field3583, ServerPacket.field3584, ServerPacket.field3585, ServerPacket.field3530, ServerPacket.field3587, ServerPacket.field3511, ServerPacket.field3546, ServerPacket.field3620, ServerPacket.field3638, ServerPacket.field3592, ServerPacket.field3516, ServerPacket.field3532, ServerPacket.field3640, ServerPacket.field3596, ServerPacket.field3597, ServerPacket.field3518, ServerPacket.field3599, ServerPacket.field3600, ServerPacket.field3601, ServerPacket.field3602, ServerPacket.field3645, ServerPacket.field3604, ServerPacket.field3605, ServerPacket.field3606, ServerPacket.field3607, ServerPacket.field3608, ServerPacket.field3517, ServerPacket.field3610, ServerPacket.field3611, ServerPacket.field3612, ServerPacket.field3613, ServerPacket.field3614, ServerPacket.field3615, ServerPacket.field3616, ServerPacket.field3591, ServerPacket.field3621, ServerPacket.field3619, ServerPacket.field3589, ServerPacket.field3526, ServerPacket.field3617, ServerPacket.field3623, ServerPacket.field3624, ServerPacket.field3625, ServerPacket.field3626, ServerPacket.field3627, ServerPacket.field3639, ServerPacket.field3603, ServerPacket.field3630, ServerPacket.field3631, ServerPacket.field3632, ServerPacket.field3633, ServerPacket.field3634, ServerPacket.field3536, ServerPacket.field3636, ServerPacket.field3562, ServerPacket.field3570, ServerPacket.field3588, ServerPacket.field3622, ServerPacket.field3564, ServerPacket.field3642, ServerPacket.field3594, ServerPacket.field3644, ServerPacket.field3525};
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "853802620"
	)
	static void method3366(class94 var0) {
		if (Client.field611 != var0) {
			Client.field611 = var0;
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIII)V",
		garbageValue = "-1177740039"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = GraphicsObject.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= MusicPatchNode2.cameraX;
			var6 -= TaskHandler.cameraY;
			var2 -= SceneTilePaint.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[class258.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class258.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[AsyncHttpResponse.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[AsyncHttpResponse.cameraYaw];
			int var11 = var10 * var1 + var9 * var2 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var8 * var2 + var7 * var6 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
