import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("WorldEntity")
public class WorldEntity extends Node implements Entity {
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = 748420733
	)
	static int field5170;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1838704789
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	public class254 field5163;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lsm;"
	)
	class493[] field5157;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 399244287
	)
	int field5166;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1002309457
	)
	public int field5162;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	class386 field5167;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	class494 field5168;
	@ObfuscatedName("al")
	boolean field5169;

	@ObfuscatedSignature(
		descriptor = "(ILdj;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5157 = new class493[10];
		this.field5166 = 0;
		this.field5162 = -1;
		this.field5167 = class386.field4571;
		this.field5168 = new class495();
		this.field5169 = false;
		this.plane = var1;
		this.worldView = var2;
		this.field5166 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5157[var3] = new class493();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-987830598"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		this.worldView.scene.Scene_plane = this.worldView.plane;
		if (var1) {
			this.worldView.scene.field2079 = false;
			this.worldView.scene.field2076 = -1200;
			this.worldView.scene.field2078 = 0.01F;
			this.worldView.scene.modelColorOverride.method4574((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.worldView.scene.field2079 = true;
			this.worldView.scene.field2076 = 0;
			this.worldView.scene.field2078 = 1.0F;
			this.worldView.scene.modelColorOverride.method4585();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-97"
	)
	public boolean method9347() {
		return 0.01F == this.worldView.scene.field2078;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1606470320"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method9346() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "43644612"
	)
	public WorldEntityCoord method9335() {
		return this.field5166 == 0 ? this.worldEntityCoord : this.field5157[0].field5171;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljc;I)V",
		garbageValue = "933055012"
	)
	public void method9336(class254 var1) {
		this.field5163 = var1;
		this.worldView.scene.field2075 = var1.method5289();
		this.worldView.scene.field2097 = var1.method5290();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "-428467716"
	)
	public class386 method9328() {
		return this.field5167;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "127327644"
	)
	public void method9338(class386 var1) {
		this.field5167 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method9339() {
		return this.worldView.sizeX * 64 + this.field5163.method5289();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "92"
	)
	public int method9337() {
		return this.worldView.sizeY * 64 + this.field5163.method5290();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "925392038"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5157.length; ++var3) {
			this.field5157[var3].field5171.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5168.vmethod9423(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "-520690635"
	)
	public final void method9342(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5157[0].field5171.getX();
			int var5 = var1.getY() - this.field5157[0].field5171.getY();
			this.method9372(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9343(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "1210659557"
	)
	public void method9343(WorldEntityCoord var1) {
		this.worldEntityCoord.method5807(var1);
		this.field5157[0].field5171.method5807(var1);
		this.field5166 = 0;
		this.field5169 = false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IIS)V",
		garbageValue = "18589"
	)
	void method9372(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5166 < 9) {
			++this.field5166;
		}

		for (int var4 = this.field5166; var4 > 0; --var4) {
			class493 var5 = this.field5157[var4];
			this.field5157[var4] = this.field5157[var4 - 1];
			this.field5157[var4 - 1] = var5;
		}

		this.field5157[0].field5171.method5807(var1);
		this.field5157[0].field5172 = Client.cycle;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1364310267"
	)
	public final void method9345(int var1) {
		if (this.field5166 == 0) {
			this.method9343(this.field5157[0].field5171);
		} else {
			if (!this.field5169) {
				this.field5168.vmethod9415(this.worldEntityCoord, this.field5157[0], var1);
				this.field5169 = true;
			}

			if (this.field5168.vmethod9414(this.worldEntityCoord, var1, this.field5166)) {
				--this.field5166;
				this.field5169 = false;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lrz;",
		garbageValue = "-112"
	)
	public class442 method9358(int var1, int var2) {
		class438 var3 = new class438();
		TransformationMatrix var4 = class331.method6572();
		var3.field4899.method8399(class47.method888(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4900.method8340((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method9339();
		var2 -= this.method9337();
		var4.method8435(var3);
		var3.method8292();
		class442 var5 = var4.method8442((float)var1, 0.0F, (float)var2);
		var4.method8500();
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lrz;",
		garbageValue = "-1602695766"
	)
	public class442 method9396(int var1, int var2) {
		class438 var3 = new class438();
		TransformationMatrix var4 = class331.method6572();
		var3.field4899.method8399(class47.method888(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4900.method8340((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method8435(var3);
		var4.method8439();
		var3.method8292();
		class442 var5 = var4.method8442((float)var1, 0.0F, (float)var2);
		var5.method8337((float)this.method9339(), 0.0F, (float)this.method9337());
		var4.method8500();
		return var5;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-77408734"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1259627089"
	)
	@Export("getX")
	public int getX() {
		if (this.field5162 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5162);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class509.topLevelWorldView.plane;
	}
}
