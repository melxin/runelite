import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("WorldEntity")
public class WorldEntity extends Node implements Entity {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 96143285
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public class201 field5320;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	class502[] field5321;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1270356363
	)
	int field5322;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1162347163
	)
	public int field5324;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	class391 field5312;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	class503 field5325;
	@ObfuscatedName("ar")
	boolean field5326;

	@ObfuscatedSignature(
		descriptor = "(ILdj;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5321 = new class502[10];
		this.field5322 = 0;
		this.field5324 = -1;
		this.field5312 = class391.field4700;
		this.field5325 = new class504();
		this.field5326 = false;
		this.plane = var1;
		this.worldView = var2;
		this.field5322 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5321[var3] = new class502();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261334993"
	)
	@Export("getX")
	public int getX() {
		if (this.field5324 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5324);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return class7.topLevelWorldView.plane;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1871513373"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		this.worldView.scene.Scene_plane = this.worldView.plane;
		if (var1) {
			this.worldView.scene.field2666 = false;
			this.worldView.scene.field2663 = -1200;
			this.worldView.scene.field2665 = 0.01F;
			this.worldView.scene.modelColorOverride.method5658((byte)38, (byte)2, (byte)20, (byte)127);
		} else {
			this.worldView.scene.field2666 = true;
			this.worldView.scene.field2663 = 0;
			this.worldView.scene.field2665 = 1.0F;
			this.worldView.scene.modelColorOverride.method5652();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "629319418"
	)
	public boolean method10138() {
		return 0.01F == this.worldView.scene.field2665;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "9"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "584871381"
	)
	public int method10098() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "1904559776"
	)
	public WorldEntityCoord method10099() {
		return this.field5322 == 0 ? this.worldEntityCoord : this.field5321[0].field5331;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V",
		garbageValue = "1409299948"
	)
	public void method10100(class201 var1) {
		this.field5320 = var1;
		this.worldView.scene.field2703 = var1.method4439();
		this.worldView.scene.field2664 = var1.method4441();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lpq;",
		garbageValue = "1618682339"
	)
	public class391 method10101() {
		return this.field5312;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "-1738804664"
	)
	public void method10102(class391 var1) {
		this.field5312 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "498667193"
	)
	public int method10091() {
		return this.worldView.sizeX * 64 + this.field5320.method4439();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1172488082"
	)
	public int method10154() {
		return this.worldView.sizeY * 64 + this.field5320.method4441();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2133095573"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5321.length; ++var3) {
			this.field5321[var3].field5331.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5325.vmethod10175(var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkm;B)V",
		garbageValue = "58"
	)
	public final void method10137(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5321[0].field5331.getX();
			int var5 = var1.getY() - this.field5321[0].field5331.getY();
			this.method10108(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method10107(var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkm;S)V",
		garbageValue = "-256"
	)
	public void method10107(WorldEntityCoord var1) {
		this.worldEntityCoord.method6255(var1);
		this.field5321[0].field5331.method6255(var1);
		this.field5322 = 0;
		this.field5326 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkm;IIB)V",
		garbageValue = "63"
	)
	void method10108(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5322 < 9) {
			++this.field5322;
		}

		for (int var4 = this.field5322; var4 > 0; --var4) {
			class502 var5 = this.field5321[var4];
			this.field5321[var4] = this.field5321[var4 - 1];
			this.field5321[var4 - 1] = var5;
		}

		this.field5321[0].field5331.method6255(var1);
		this.field5321[0].field5328 = Client.cycle;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2100920520"
	)
	public final void method10148(int var1) {
		if (this.field5322 == 0) {
			this.method10107(this.field5321[0].field5331);
		} else {
			if (!this.field5326) {
				this.field5325.vmethod10176(this.worldEntityCoord, this.field5321[0], var1);
				this.field5326 = true;
			}

			if (this.field5325.vmethod10174(this.worldEntityCoord, var1, this.field5322)) {
				--this.field5322;
				this.field5326 = false;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lrm;",
		garbageValue = "2136749503"
	)
	public class448 method10109(int var1, int var2) {
		class444 var3 = new class444();
		TransformationMatrix var4 = class166.method4019();
		var3.field5037.method9078(class31.method501(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5038.method9022((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method10091();
		var2 -= this.method10154();
		var4.method9115(var3);
		var3.method8965();
		class448 var5 = var4.method9122((float)var1, 0.0F, (float)var2);
		var4.method9104();
		return var5;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lrm;",
		garbageValue = "2120498940"
	)
	public class448 method10110(int var1, int var2) {
		class444 var3 = new class444();
		TransformationMatrix var4 = class166.method4019();
		var3.field5037.method9078(class31.method501(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5038.method9022((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method9115(var3);
		var4.method9119();
		var3.method8965();
		class448 var5 = var4.method9122((float)var1, 0.0F, (float)var2);
		var5.method9044((float)this.method10091(), 0.0F, (float)this.method10154());
		var4.method9104();
		return var5;
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1626965421"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)[Lxa;",
		garbageValue = "1175007091"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class522.method10495(var0, var3, var4)) {
				var5 = null;
			} else {
				IndexedSprite[] var7 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

				for (int var8 = 0; var8 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var8) {
					IndexedSprite var9 = var7[var8] = new IndexedSprite();
					var9.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
					var9.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
					var9.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var8];
					var9.yOffset = class440.SpriteBuffer_yOffsets[var8];
					var9.subWidth = class333.SpriteBuffer_spriteWidths[var8];
					var9.subHeight = Buffer.SpriteBuffer_spriteHeights[var8];
					var9.palette = class113.SpriteBuffer_spritePalette;
					var9.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var8];
				}

				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				class440.SpriteBuffer_yOffsets = null;
				class333.SpriteBuffer_spriteWidths = null;
				Buffer.SpriteBuffer_spriteHeights = null;
				class113.SpriteBuffer_spritePalette = null;
				SpriteBufferProperties.SpriteBuffer_pixels = null;
				var5 = var7;
			}

			return var5;
		}
	}
}
