import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public class class492 extends Node implements Entity {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -495100189
	)
	public int field5147;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	public WorldView field5148;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public class200 field5149;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public final WorldEntityCoord field5150;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lsl;"
	)
	class493[] field5153;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 895214581
	)
	int field5152;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	class494 field5151;
	@ObfuscatedName("ak")
	boolean field5154;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	class386 field5155;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1792723987
	)
	public int field5156;

	@ObfuscatedSignature(
		descriptor = "(ILdp;)V"
	)
	public class492(int var1, WorldView var2) {
		this.field5147 = 0;
		this.field5150 = new WorldEntityCoord();
		this.field5153 = new class493[10];
		this.field5152 = 0;
		this.field5151 = new class495();
		this.field5154 = false;
		this.field5155 = class386.field4552;
		this.field5156 = -1;
		this.field5147 = var1;
		this.field5148 = var2;
		this.field5152 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5153[var3] = new class493();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2105541256"
	)
	public void method9284(boolean var1) {
		this.field5148.scene.Scene_plane = this.field5148.plane;
		if (var1) {
			this.field5148.scene.field2684 = false;
			this.field5148.scene.cycle = -1200;
			this.field5148.scene.field2722 = 0.01F;
			this.field5148.scene.field2724.method5435((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.field5148.scene.field2684 = true;
			this.field5148.scene.cycle = 0;
			this.field5148.scene.field2722 = 1.0F;
			this.field5148.scene.field2724.method5436();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "762956699"
	)
	public boolean method9285() {
		return this.field5148.scene.field2722 == 0.01F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "796912020"
	)
	public int method9322() {
		return this.field5150.getZ();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1671020497"
	)
	public int method9290() {
		return this.field5150.getCurrentRotationAngle();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lku;",
		garbageValue = "56"
	)
	public WorldEntityCoord method9342() {
		return this.field5152 == 0 ? this.field5150 : this.field5153[0].field5158;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhy;I)V",
		garbageValue = "-798608175"
	)
	public void method9292(class200 var1) {
		this.field5149 = var1;
		this.field5148.scene.baseX = var1.method4031();
		this.field5148.scene.field2686 = var1.method4032();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1936965888"
	)
	public void method9293(class386 var1) {
		this.field5155 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lof;",
		garbageValue = "-2033553145"
	)
	public class386 method9294() {
		return this.field5155;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method9295() {
		return this.field5148.sizeX * 64 + this.field5149.method4031();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "830173085"
	)
	public int method9348() {
		return this.field5148.sizeY * 64 + this.field5149.method4032();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1008517110"
	)
	public void method9297(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5153.length; ++var3) {
			this.field5153[var3].field5158.setDirection(var1, var2);
		}

		this.field5150.setDirection(var1, var2);
		this.field5151.vmethod9370(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "-858284110"
	)
	public final void method9303(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5153[0].field5158.getX();
			int var5 = var1.getY() - this.field5153[0].field5158.getY();
			this.method9300(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9299(var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "395531029"
	)
	public void method9299(WorldEntityCoord var1) {
		this.field5150.method5747(var1);
		this.field5153[0].field5158.method5747(var1);
		this.field5152 = 0;
		this.field5154 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIB)V",
		garbageValue = "20"
	)
	void method9300(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5152 < 9) {
			++this.field5152;
		}

		for (int var4 = this.field5152; var4 > 0; --var4) {
			class493 var5 = this.field5153[var4];
			this.field5153[var4] = this.field5153[var4 - 1];
			this.field5153[var4 - 1] = var5;
		}

		this.field5153[0].field5158.method5747(var1);
		this.field5153[0].field5157 = Client.cycle;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-528723826"
	)
	public final void method9301(int var1) {
		if (this.field5152 == 0) {
			this.method9299(this.field5153[0].field5158);
		} else {
			if (!this.field5154) {
				this.field5151.vmethod9375(this.field5150, this.field5153[0], var1);
				this.field5154 = true;
			}

			if (this.field5151.vmethod9371(this.field5150, var1, this.field5152)) {
				--this.field5152;
				this.field5154 = false;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Lrp;",
		garbageValue = "208337786"
	)
	public class442 method9302(int var1, int var2) {
		class438 var3 = new class438();
		TransformationMatrix var4 = class148.method3476();
		var3.field4882.method8363(class138.method3387(this.field5150.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4881.method8296((float)this.field5150.getX(), 0.0F, (float)this.field5150.getY());
		var1 -= this.method9295();
		var2 -= this.method9348();
		var4.method8435(var3);
		var3.method8243();
		class442 var5 = var4.method8440((float)var1, 0.0F, (float)var2);
		var4.method8413();
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Lrp;",
		garbageValue = "-1905471453"
	)
	public class442 method9347(int var1, int var2) {
		class438 var3 = new class438();
		TransformationMatrix var4 = class148.method3476();
		var3.field4882.method8363(class138.method3387(this.field5150.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4881.method8296((float)this.field5150.getX(), 0.0F, (float)this.field5150.getY());
		var4.method8435(var3);
		var4.method8419();
		var3.method8243();
		class442 var5 = var4.method8440((float)var1, 0.0F, (float)var2);
		var5.method8302((float)this.method9295(), 0.0F, (float)this.method9348());
		var4.method8413();
		return var5;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-74"
	)
	@Export("getX")
	public int getX() {
		return this.field5150.getX();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1017918393"
	)
	@Export("getY")
	public int getY() {
		return this.field5150.getY();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "640118507"
	)
	@Export("getPlane")
	public int getPlane() {
		if (this.field5156 != -1) {
			WorldView var1 = Client.worldViewManager.method2546(this.field5156);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class200.topLevelWorldView.plane;
	}
}
