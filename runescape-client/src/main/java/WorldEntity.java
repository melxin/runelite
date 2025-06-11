import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("WorldEntity")
public class WorldEntity extends Node implements Entity {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -638841979
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	public class201 field5213;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lta;"
	)
	class496[] field5216;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 89997183
	)
	int field5214;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 119478677
	)
	public int field5206;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	class389 field5217;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	class497 field5218;
	@ObfuscatedName("az")
	boolean field5219;

	@ObfuscatedSignature(
		descriptor = "(ILdl;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5216 = new class496[10];
		this.field5214 = 0;
		this.field5206 = -1;
		this.field5217 = class389.field4605;
		this.field5218 = new class498();
		this.field5219 = false;
		this.plane = var1;
		this.worldView = var2;
		this.field5214 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5216[var3] = new class496();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1537061280"
	)
	@Export("getX")
	public int getX() {
		if (this.field5206 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5206);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return Sound.topLevelWorldView.plane;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "29"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		this.worldView.scene.Scene_plane = this.worldView.plane;
		if (var1) {
			this.worldView.scene.field2728 = false;
			this.worldView.scene.field2774 = -1200;
			this.worldView.scene.field2727 = 0.01F;
			this.worldView.scene.modelColorOverride.method5715((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.worldView.scene.field2728 = true;
			this.worldView.scene.field2774 = 0;
			this.worldView.scene.field2727 = 1.0F;
			this.worldView.scene.modelColorOverride.method5713();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1337003944"
	)
	public boolean method9727() {
		return this.worldView.scene.field2727 == 0.01F;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129373747"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "29186"
	)
	public int method9706() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "-2135313486"
	)
	public WorldEntityCoord method9746() {
		return this.field5214 == 0 ? this.worldEntityCoord : this.field5216[0].field5222;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "-1542390317"
	)
	public void method9708(class201 var1) {
		this.field5213 = var1;
		this.worldView.scene.field2777 = var1.method4285();
		this.worldView.scene.field2720 = var1.method4280();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)Loh;",
		garbageValue = "-32377"
	)
	public class389 method9709() {
		return this.field5217;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loh;I)V",
		garbageValue = "-569684891"
	)
	public void method9761(class389 var1) {
		this.field5217 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1023739192"
	)
	public int method9711() {
		return this.worldView.sizeX * 64 + this.field5213.method4285();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-679812455"
	)
	public int method9712() {
		return this.worldView.sizeY * 64 + this.field5213.method4280();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-107951070"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5216.length; ++var3) {
			this.field5216[var3].field5222.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5218.vmethod9787(var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "754562595"
	)
	public final void method9717(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5216[0].field5222.getX();
			int var5 = var1.getY() - this.field5216[0].field5222.getY();
			this.method9719(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9715(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-1309737626"
	)
	public void method9715(WorldEntityCoord var1) {
		this.worldEntityCoord.method6070(var1);
		this.field5216[0].field5222.method6070(var1);
		this.field5214 = 0;
		this.field5219 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lks;III)V",
		garbageValue = "139898017"
	)
	void method9719(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5214 < 9) {
			++this.field5214;
		}

		for (int var4 = this.field5214; var4 > 0; --var4) {
			class496 var5 = this.field5216[var4];
			this.field5216[var4] = this.field5216[var4 - 1];
			this.field5216[var4 - 1] = var5;
		}

		this.field5216[0].field5222.method6070(var1);
		this.field5216[0].field5220 = Client.cycle;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1421943498"
	)
	public final void method9701(int var1) {
		if (this.field5214 == 0) {
			this.method9715(this.field5216[0].field5222);
		} else {
			if (!this.field5219) {
				this.field5218.vmethod9786(this.worldEntityCoord, this.field5216[0], var1);
				this.field5219 = true;
			}

			if (this.field5218.vmethod9791(this.worldEntityCoord, var1, this.field5214)) {
				--this.field5214;
				this.field5219 = false;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lre;",
		garbageValue = "106"
	)
	public class445 method9718(int var1, int var2) {
		class441 var3 = new class441();
		TransformationMatrix var4 = class231.method4854();
		class446 var5 = var3.field4951;
		int var7 = this.worldEntityCoord.getCurrentRotationAngle();
		var7 &= 2047;
		float var6 = (float)((double)((float)var7 / 2048.0F) * 6.283185307179586D);
		var5.method8740(var6, 0.0F, 0.0F);
		var3.field4946.method8688((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method9711();
		var2 -= this.method9712();
		var4.method8791(var3);
		var3.method8634();
		class445 var8 = var4.method8790((float)var1, 0.0F, (float)var2);
		var4.method8772();
		return var8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lre;",
		garbageValue = "-1496178706"
	)
	public class445 method9757(int var1, int var2) {
		class441 var3 = new class441();
		TransformationMatrix var4 = class231.method4854();
		class446 var5 = var3.field4951;
		int var7 = this.worldEntityCoord.getCurrentRotationAngle();
		var7 &= 2047;
		float var6 = (float)(6.283185307179586D * (double)((float)var7 / 2048.0F));
		var5.method8740(var6, 0.0F, 0.0F);
		var3.field4946.method8688((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method8791(var3);
		var4.method8787();
		var3.method8634();
		class445 var8 = var4.method8790((float)var1, 0.0F, (float)var2);
		var8.method8694((float)this.method9711(), 0.0F, (float)this.method9712());
		var4.method8772();
		return var8;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2121730630"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltp;I)J",
		garbageValue = "-1378414686"
	)
	public static long method9740(class509 var0) {
		class563 var1 = class563.field5600;
		DelayFadeTask.method9245(var0, var1, false);
		int[] var2 = var0.method9965();
		int var3 = var0.method9937();
		long var4 = 0L;

		for (int var6 = 0; var6 < var3; ++var6) {
			var4 += (long)var2[var6];
		}

		return var4;
	}
}
