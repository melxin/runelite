import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("WorldEntity")
public class WorldEntity extends Node implements Entity {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1135520641
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	public WorldView field5483;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public class202 field5482;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Ltx;"
	)
	class504[] field5484;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -42403791
	)
	int field5475;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 251123639
	)
	public int field5487;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	class391 field5491;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -931259577
	)
	int field5489;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	class505 field5490;
	@ObfuscatedName("ak")
	boolean field5478;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	public AnimationSequence field5492;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	public AnimationSequence field5493;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1520716977
	)
	public int field5494;

	@ObfuscatedSignature(
		descriptor = "(ILdm;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5484 = new class504[10];
		this.field5475 = 0;
		this.field5487 = -1;
		this.field5491 = class391.field4828;
		this.field5489 = 31;
		this.field5490 = new class506();
		this.field5478 = false;
		this.field5492 = new AnimationSequence();
		this.field5493 = new AnimationSequence();
		this.field5494 = 0;
		this.plane = var1;
		this.field5483 = var2;
		this.field5475 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5484[var3] = new class504();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565244070"
	)
	@Export("getX")
	public int getX() {
		if (this.field5487 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5487);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class547.topLevelWorldView.plane;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;",
		garbageValue = "1604372687"
	)
	AnimationSequence method10175() {
		return this.field5494 == 0 && this.field5493.isActive() && this.field5493.getSequenceDefinition().method4856() ? this.field5493 : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "88"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		AnimationSequence var2 = this.method10175();
		AnimationSequence var3 = var2 != null ? var2 : this.field5492;
		this.field5483.scene.field2690.method9175();
		if (var3 != null && var3.getId() != -1 && var3.method9635() && var3.getSequenceDefinition().isCachedModelIdSet()) {
			class145 var4 = var3.getSequenceDefinition().method4881();
			class226 var5 = var4.field1731.method5147();
			class134 var6 = var5.method5090(0);
			if (var6 != null) {
				var5.method5103(var4, var3.getFrame());
				this.field5483.scene.field2690.method9187(var6.method3694());
				this.field5483.scene.field2690.field5229[13] = -this.field5483.scene.field2690.field5229[13];
			}
		}

		this.field5483.scene.Scene_plane = this.field5483.plane;
		if (var1) {
			this.field5483.scene.field2716 = -1200;
			this.field5483.scene.field2718 = 0.01F;
			this.field5483.scene.modelColorOverride.method5729((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.field5483.scene.field2716 = 0;
			this.field5483.scene.field2718 = 1.0F;
			this.field5483.scene.modelColorOverride.method5728();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-18801"
	)
	public boolean method10243() {
		return 0.01F == this.field5483.scene.field2718;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-299531812"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2098160488"
	)
	public int method10204() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lkg;",
		garbageValue = "1"
	)
	public WorldEntityCoord method10186() {
		return this.field5475 == 0 ? this.worldEntityCoord : this.field5484[0].field5495;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhz;I)V",
		garbageValue = "20277678"
	)
	public void method10184(class202 var1) {
		this.field5482 = var1;
		this.field5483.scene.field2715 = var1.method4520();
		this.field5483.scene.field2717 = var1.method4521();
		this.method10192(var1.method4522());
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)Lps;",
		garbageValue = "128"
	)
	public class391 method10185() {
		return this.field5491;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lph;",
		garbageValue = "-16"
	)
	public class396 method10206(boolean var1) {
		return var1 ? class396.field4882 : this.field5482.method4524();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "-2115564436"
	)
	public void method10181(class391 var1) {
		this.field5491 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "63"
	)
	public void method10188(int var1) {
		this.field5489 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method10187(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field5489 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	public int method10190() {
		return this.field5483.sizeX * 64 + this.field5482.method4520();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method10191() {
		return this.field5483.sizeY * 64 + this.field5482.method4521();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1231314047"
	)
	void method10192(int var1) {
		this.field5492.setSequence(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-793219816"
	)
	public int method10183() {
		return this.field5493.getId();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "140499425"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5484.length; ++var3) {
			this.field5484[var3].field5495.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5490.vmethod10279(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkg;B)V",
		garbageValue = "52"
	)
	public final void method10254(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5484[0].field5495.getX();
			int var5 = var1.getY() - this.field5484[0].field5495.getY();
			this.method10200(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method10174(var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkg;I)V",
		garbageValue = "194976153"
	)
	public void method10174(WorldEntityCoord var1) {
		this.worldEntityCoord.method6291(var1);
		this.field5484[0].field5495.method6291(var1);
		this.field5475 = 0;
		this.field5478 = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkg;IIB)V",
		garbageValue = "-42"
	)
	void method10200(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5475 < 9) {
			++this.field5475;
		}

		for (int var4 = this.field5475; var4 > 0; --var4) {
			class504 var5 = this.field5484[var4];
			this.field5484[var4] = this.field5484[var4 - 1];
			this.field5484[var4 - 1] = var5;
		}

		this.field5484[0].field5495.method6291(var1);
		this.field5484[0].field5496 = Client.cycle;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1406840285"
	)
	public final void method10198(int var1) {
		if (this.field5475 == 0) {
			this.method10174(this.field5484[0].field5495);
		} else {
			if (!this.field5478) {
				this.field5490.vmethod10277(this.worldEntityCoord, this.field5484[0], var1);
				this.field5478 = true;
			}

			if (this.field5490.vmethod10285(this.worldEntityCoord, var1, this.field5475)) {
				--this.field5475;
				this.field5478 = false;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lre;",
		garbageValue = "1857034742"
	)
	public class450 method10213(int var1, int var2) {
		class446 var3 = ModeWhere.method8730();
		TransformationMatrix var4 = AbstractArchive.method8450();
		class451 var5 = var3.field5197;
		int var7 = this.worldEntityCoord.getCurrentRotationAngle();
		var7 &= 2047;
		float var6 = (float)((double)((float)var7 / 2048.0F) * 6.283185307179586D);
		var5.method9130(var6, 0.0F, 0.0F);
		var3.field5193.method9066((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method10190();
		var2 -= this.method10191();
		var4.method9182(var3);
		var3.method9005();
		class450 var8 = var4.method9201((float)var1, 0.0F, (float)var2);
		var4.method9171();
		return var8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lre;",
		garbageValue = "-2128921582"
	)
	public class450 method10199(int var1, int var2) {
		class446 var3 = ModeWhere.method8730();
		TransformationMatrix var4 = AbstractArchive.method8450();
		class451 var5 = var3.field5197;
		int var7 = this.worldEntityCoord.getCurrentRotationAngle();
		var7 &= 2047;
		float var6 = (float)(6.283185307179586D * (double)((float)var7 / 2048.0F));
		var5.method9130(var6, 0.0F, 0.0F);
		var3.field5193.method9066((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method9182(var3);
		var4.method9174();
		var3.method9005();
		class450 var8 = var4.method9201((float)var1, 0.0F, (float)var2);
		var8.method9072((float)this.method10190(), 0.0F, (float)this.method10191());
		var4.method9171();
		return var8;
	}

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1225897704"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1777919612"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIII[Ljava/lang/String;III)V",
		garbageValue = "391973894"
	)
	static void method10263(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1009 = -1;
			class149.method3900(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1025 = var5;
		var13.field1015 = var6;
		var13.field1019 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2427(var8);
		var13.method2426(var9);
	}
}
