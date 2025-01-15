import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("WorldEntity")
public class WorldEntity implements Entity {
	@ObfuscatedName("ch")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 539044777
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1131649629
	)
	public int field5027;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1859350753
	)
	int field5030;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 11080905
	)
	int field5031;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lsm;"
	)
	class481[] field5032;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1637372317
	)
	int field5033;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	class482 field5034;
	@ObfuscatedName("ac")
	boolean field5026;

	@ObfuscatedSignature(
		descriptor = "(ILdz;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.plane = 0;
		this.worldEntityCoord = new WorldEntityCoord();
		this.field5030 = 0;
		this.field5031 = 0;
		this.field5032 = new class481[10];
		this.field5033 = 0;
		this.field5034 = new class483();
		this.field5026 = false;
		this.worldView = var2;
		this.field5033 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5032[var3] = new class481();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "392218032"
	)
	@Export("getX")
	public int getX() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "251050381"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "105"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.plane;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-582612716"
	)
	@Export("initScenePlane")
	public void initScenePlane() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2121537640"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "149257279"
	)
	public int method9291() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "826749675"
	)
	public int method9315() {
		return Math.max(this.worldView.sizeX, this.worldView.sizeY) * 128;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lks;",
		garbageValue = "1274992386"
	)
	public WorldEntityCoord method9293() {
		return this.field5033 == 0 ? this.worldEntityCoord : this.field5032[0].field5037;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-57784512"
	)
	public void method9334(int var1, int var2) {
		this.field5030 = var1;
		this.field5031 = var2;
		this.worldView.scene.field2002 = var1;
		this.worldView.scene.field2040 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int method9287() {
		return this.worldView.sizeX * 64 - this.field5030;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-66460165"
	)
	public int method9296() {
		return this.worldView.sizeY * 64 - this.field5031;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5032.length; ++var3) {
			this.field5032[var3].field5037.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5034.vmethod9367(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V",
		garbageValue = "-1554046541"
	)
	public final void method9298(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5032[0].field5037.getX();
			int var5 = var1.getY() - this.field5032[0].field5037.getY();
			this.method9300(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method9316(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lks;B)V",
		garbageValue = "79"
	)
	public void method9316(WorldEntityCoord var1) {
		this.worldEntityCoord.method5899(var1);
		this.field5032[0].field5037.method5899(var1);
		this.field5033 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lks;IIB)V",
		garbageValue = "-88"
	)
	void method9300(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5033 < 9) {
			++this.field5033;
		}

		for (int var4 = this.field5033; var4 > 0; --var4) {
			class481 var5 = this.field5032[var4];
			this.field5032[var4] = this.field5032[var4 - 1];
			this.field5032[var4 - 1] = var5;
		}

		this.field5032[0].field5037.method5899(var1);
		this.field5032[0].field5038 = Client.cycle;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-23"
	)
	public final void method9301(int var1) {
		if (this.field5033 == 0) {
			this.method9316(this.field5032[0].field5037);
		} else {
			if (!this.field5026) {
				this.field5034.vmethod9368(this.worldEntityCoord, this.field5032[0], var1);
				this.field5026 = true;
			}

			if (this.field5034.vmethod9369(this.worldEntityCoord, var1, this.field5033)) {
				--this.field5033;
				this.field5026 = false;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lqh;",
		garbageValue = "-1684593861"
	)
	public class426 method9302(int var1, int var2) {
		class422 var3 = new class422();
		TransformationMatrix var4 = AbstractWorldMapData.method6389();
		var3.field4728.method8332(class172.method3867(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field4729.method8285((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method9287();
		var2 -= this.method9287();
		var4.method8379(var3);
		var3.method8253();
		class426 var5 = var4.method8386((float)var1, 0.0F, (float)var2);
		var4.method8373();
		return var5;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2044167266"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMapSection2.scrollBarSprites[0].drawAt(var0, var1);
		WorldMapSection2.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field582);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field550);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field550);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field550);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field550);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field584);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field584);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field584);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field584);
	}
}
