import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1090320351
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -298618439
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1242172849
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1442836949
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1536138809
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ac")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2079319485
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	PlayerCompositionColorTextureOverride field1394;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-11"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1277724399"
	)
	boolean method2993(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "957031193"
	)
	void method2995(PlayerCompositionColorTextureOverride var1) {
		this.field1394 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "110822388"
	)
	PlayerCompositionColorTextureOverride method2996() {
		return this.field1394;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1284117432"
	)
	void method2997() {
		this.field1394 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = WorldEntityCoord.ItemDefinition_get(this.id);
		return this.field1394 == null ? var1.getModel(this.quantity) : var1.method4167(this.field1394);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILvj;B)Lgk;",
		garbageValue = "113"
	)
	public static PlayerCompositionColorTextureOverride method3008(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		boolean var5 = (var2 & 4) != 0;
		boolean var6 = (var2 & 8) != 0;
		PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
		int var8;
		int[] var9;
		boolean var10;
		int var11;
		short var12;
		if (var3) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRecolorTo != null && var9.length == var7.playerCompositionRecolorTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRecolorTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var4) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRetextureTo != null && var9.length == var7.playerCompositionRetextureTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRetextureTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var5) {
			var7.field1836 = var1.readUnsignedShort();
			var7.field1842 = var1.readUnsignedShort();
		}

		if (var6) {
			var7.field1840 = var1.readUnsignedShort();
			var7.field1839 = var1.readUnsignedShort();
		}

		return var7;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "262162667"
	)
	static void method3015(WorldView var0) {
		int var1 = class217.method4387();
		if (HttpRequest.topLevelWorldView == var0 && var1 >= 0 && Client.menu.menuOpcodes[var1] == 60) {
			int var2 = Client.menu.menuIdentifiers[var1] * 128;
			boolean var3 = true;
			int var4 = Math.max(384, 2000 - Client.viewportZoom * 2);
			int var5 = HttpResponse.entity.getX() - (int)(class173.method3686(var2) * (double)var4);
			int var6 = HttpResponse.entity.getY();
			int var9 = class507.field5149[var2 & 2047];
			double var7 = (double)var9 / 65536.0D;
			var9 = var6 - (int)((double)var4 * var7);
			int var10 = class77.getTileHeight(var0, HttpResponse.entity.getX(), HttpResponse.entity.getY(), HttpResponse.entity.getPlane());
			var0.scene.drawEntity(var0.plane, var5, var9, var10, 60, Occluder.field2779, var2, 0L, false);
		}

	}
}
