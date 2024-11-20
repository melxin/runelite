import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("WorldEntity")
public class WorldEntity implements Entity {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -348522459
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1363904165
	)
	public int field5028;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1667092467
	)
	int field5031;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 586006411
	)
	int field5032;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lsl;"
	)
	class481[] field5027;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1299129605
	)
	int field5034;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	class482 field5035;
	@ObfuscatedName("an")
	boolean field5029;

	@ObfuscatedSignature(
		descriptor = "(ILdm;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.plane = 0;
		this.worldEntityCoord = new WorldEntityCoord();
		this.field5031 = 0;
		this.field5032 = 0;
		this.field5027 = new class481[10];
		this.field5034 = 0;
		this.field5035 = new class483();
		this.field5029 = false;
		this.worldView = var2;
		this.field5034 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5027[var3] = new class481();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("getX")
	public int getX() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-399095249"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.plane;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "619893494"
	)
	@Export("initScenePlane")
	public void initScenePlane() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1791732586"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1397338597"
	)
	public int method9139() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1629872329"
	)
	public int method9140() {
		return Math.max(this.worldView.sizeX, this.worldView.sizeY) * 128;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lkj;",
		garbageValue = "234277501"
	)
	public WorldEntityCoord method9141() {
		return this.field5034 == 0 ? this.worldEntityCoord : this.field5027[0].field5038;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "76"
	)
	public void method9187(int var1, int var2) {
		this.field5031 = var1;
		this.field5032 = var2;
		this.worldView.scene.field2676 = var1;
		this.worldView.scene.field2677 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "991503757"
	)
	public int method9143() {
		return this.worldView.sizeX * 64 - this.field5031;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1377543044"
	)
	public int method9138() {
		return this.worldView.sizeY * 64 - this.field5032;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1391090453"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5027.length; ++var3) {
			this.field5027[var3].field5038.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5035.vmethod9206(var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-522836085"
	)
	public final void method9146(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5027[0].field5038.getX();
			int var5 = var1.getY() - this.field5027[0].field5038.getY();
			this.method9148(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9147(var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "0"
	)
	public void method9147(WorldEntityCoord var1) {
		this.worldEntityCoord.method5695(var1);
		this.field5027[0].field5038.method5695(var1);
		this.field5034 = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkj;III)V",
		garbageValue = "-632037646"
	)
	void method9148(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5034 < 9) {
			++this.field5034;
		}

		for (int var4 = this.field5034; var4 > 0; --var4) {
			class481 var5 = this.field5027[var4];
			this.field5027[var4] = this.field5027[var4 - 1];
			this.field5027[var4 - 1] = var5;
		}

		this.field5027[0].field5038.method5695(var1);
		this.field5027[0].field5037 = Client.cycle;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1011779362"
	)
	public final void method9149(int var1) {
		if (this.field5034 == 0) {
			this.method9147(this.field5027[0].field5038);
		} else {
			if (!this.field5029) {
				this.field5035.vmethod9208(this.worldEntityCoord, this.field5027[0], var1);
				this.field5029 = true;
			}

			if (this.field5035.vmethod9214(this.worldEntityCoord, var1, this.field5034)) {
				--this.field5034;
				this.field5029 = false;
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lql;",
		garbageValue = "109"
	)
	public class426 method9150(int var1, int var2) {
		class422 var3 = new class422();
		TransformationMatrix var4 = MidiPcmStream.method6684();
		class427 var5 = var3.field4744;
		int var7 = this.worldEntityCoord.getCurrentRotationAngle();
		var7 &= 2047;
		float var6 = (float)((double)((float)var7 / 2048.0F) * 6.283185307179586D);
		var5.method8164(var6, 0.0F, 0.0F);
		var3.field4745.method8103((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method9143();
		var2 -= this.method9143();
		var4.method8217(var3);
		var3.method8054();
		class426 var8 = var4.method8224((float)var1, 0.0F, (float)var2);
		var4.method8266();
		return var8;
	}
}
