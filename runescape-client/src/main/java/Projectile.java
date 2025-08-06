import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1587784387
	)
	@Export("sourceLevel")
	int sourceLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 90650517
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 513637745
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -821503195
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1871374375
	)
	@Export("sourceIndex")
	int sourceIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1422699951
	)
	@Export("targetLevel")
	int targetLevel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -709220025
	)
	@Export("targetX")
	int targetX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -385973739
	)
	@Export("targetY")
	int targetY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1175626559
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1130927365
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -541523095
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -694640509
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -808003329
	)
	int field756;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1116324847
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ak")
	@Export("x")
	double x;
	@ObfuscatedName("ar")
	@Export("y")
	double y;
	@ObfuscatedName("at")
	double field760;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -749596241
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2069231773
	)
	int field765;
	@ObfuscatedName("ao")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("az")
	double field764;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 467802363
	)
	int field753;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	final class465 field766;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		this.isMoving = false;
		this.field766 = new class465();
		this.sourceLevel = var1;
		this.sourceX = var2;
		this.sourceY = var3;
		this.startHeight = var4;
		this.sourceIndex = var5;
		this.targetLevel = var6;
		this.targetX = var7;
		this.targetY = var8;
		this.endHeight = var9;
		this.targetIndex = var10;
		this.field753 = var11;
		this.cycleStart = var12;
		this.cycleEnd = var13;
		this.field756 = var14;
		this.slope = var15;
		this.field766.method9569(Skeleton.method5071(this.field753).sequence);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.field766.method9601(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = Skeleton.method5071(this.field753);
			Model var2 = var1.getModel(this.field766.method9573());
			if (var2 == null) {
				return null;
			} else {
				var2.rotateZ(this.field765);
				return var2;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-69"
	)
	void method1937(int var1, int var2) {
		this.sourceX += var1;
		this.sourceY += var2;
		this.targetX += var1;
		this.targetY += var2;
		this.x += (double)Coord.method7393(var1);
		this.y += (double)Coord.method7393(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lcw;III)V",
		garbageValue = "1286843870"
	)
	@Export("setDestination")
	void setDestination(WorldViewManager var1, int var2, int var3) {
		if (var2 >= this.cycleStart) {
			class448 var4 = class548.method10668(this.targetIndex, this.targetX, this.targetY, this.targetLevel, var1);
			int var5 = (int)var4.field5059;
			int var6 = (int)var4.field5054;
			int var7 = (int)var4.field5060 - this.endHeight;
			var4.method9038();
			double var12;
			double var14;
			double var16;
			if (!this.isMoving) {
				class448 var8 = class548.method10668(this.sourceIndex, this.sourceX, this.sourceY, this.sourceLevel, var1);
				int var9 = (int)var8.field5059;
				int var10 = (int)var8.field5054;
				int var11 = (int)var8.field5060 - this.startHeight;
				var8.method9038();
				var12 = (double)(var5 - var9);
				var14 = (double)(var6 - var10);
				var16 = Math.sqrt(var14 * var14 + var12 * var12);
				this.x = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : (double)this.slope * var12 / var16 + (double)var9;
				this.y = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : var14 * (double)this.slope / var16 + (double)var10;
				this.field760 = (double)var11;
			}

			double var18 = (double)(this.cycleEnd + 1 - var2);
			double var20 = ((double)var5 - this.x) / var18;
			var12 = ((double)var6 - this.y) / var18;
			var14 = Math.sqrt(var12 * var12 + var20 * var20);
			if (!this.isMoving) {
				this.field764 = -var14 * Math.tan((double)this.field756 * 0.02454369D);
			}

			var16 = 2.0D * ((double)var7 - this.field760 - var18 * this.field764) / (var18 * var18);
			this.isMoving = true;
			this.x += var20 * (double)var3;
			this.y += (double)var3 * var12;
			this.field760 += (double)var3 * this.field764 + (double)var3 * (double)var3 * var16 * 0.5D;
			this.field764 += (double)var3 * var16;
			this.orientation = (int)(Math.atan2(var20, var12) * 325.949D) + 1024 & 2047;
			this.field765 = (int)(Math.atan2(this.field764, var14) * 325.949D) & 2047;
			Client.field426.method10913(class7.topLevelWorldView, (int)this.x, (int)this.y, false);
			AttackOption.method2764(this.field766, var3, Client.field426);
			Client.field426.method10914();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;IB)Z",
		garbageValue = "51"
	)
	public static boolean method1952(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var3 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var3 == null) {
			return false;
		} else {
			int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
			byte[] var5 = var1.getFile(var4, 0);
			return var5 != null;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "42"
	)
	static void method1932(Buffer var0) {
		while (true) {
			int var1 = var0.readUnsignedShort();
			if (var1 != 0) {
				if (var1 != 1) {
					if (var1 <= 49) {
						var0.readShort();
					}
					continue;
				}

				var0.readUnsignedByte();
			}

			return;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrr;IIII)V",
		garbageValue = "505314781"
	)
	static void method1950(TransformationMatrix var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var4 = 50;
			int var5 = AbstractRasterizer.method5026();
			int var6 = (ViewportMouse.ViewportMouse_x - var1) * var4 / var3;
			int var7 = (ViewportMouse.ViewportMouse_y - var2) * var4 / var3;
			int var8 = (ViewportMouse.ViewportMouse_x - var1) * var5 / var3;
			int var9 = (ViewportMouse.ViewportMouse_y - var2) * var5 / var3;
			TransformationMatrix var10;
			synchronized(TransformationMatrix.field5073) {
				if (class359.field3967 == 0) {
					var10 = new TransformationMatrix(var0);
				} else {
					TransformationMatrix.field5073[--class359.field3967].method9110(var0);
					var10 = TransformationMatrix.field5073[class359.field3967];
				}
			}

			var10.method9119();
			float[] var12 = new float[3];
			var10.transformPoint((float)var6, (float)var7, (float)var4, var12);
			var6 = (int)var12[0];
			var7 = (int)var12[1];
			int var14 = (int)var12[2];
			var10.transformPoint((float)var8, (float)var9, (float)var5, var12);
			var8 = (int)var12[0];
			var9 = (int)var12[1];
			var5 = (int)var12[2];
			var10.method9104();
			FriendSystem.method1578(var6, var7, var14, var8, var9, var5);
		}
	}
}
