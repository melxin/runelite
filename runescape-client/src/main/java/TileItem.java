import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("as")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1012313495
	)
	static int field1203;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 782226465
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1247866467
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1285003875
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1748897679
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1140757547
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ak")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1939050291
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	PlayerCompositionColorTextureOverride field1202;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	ProjectionCoord field1196;

	TileItem() {
		this.flag = 31;
		this.field1196 = ProjectionCoord.field5242;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "244325165"
	)
	boolean method2902(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = class150.ItemDefinition_get(this.id);
		Model var2 = this.field1202 == null ? var1.getModel(this.quantity) : var1.method4833(this.field1202);
		if (var2 == null) {
			return null;
		} else {
			Model var3 = null;
			if (this.field1196 != ProjectionCoord.field5242) {
				class461 var4 = class151.method3974();
				var4.method9368(ProjectionCoord.field5237, this.field1196);
				var4.method9371();
				var3 = var2.toSharedSequenceModel(false);
				var3.method6034(var4);
				var4.method9362();
			}

			return var3 == null ? var2 : var3;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		ItemComposition var1 = class150.ItemDefinition_get(this.id);
		Model var2 = this.field1202 == null ? var1.getModel(this.quantity) : var1.method4833(this.field1202);
		return var2 != null && var2.faceAlphas != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lgx;",
		garbageValue = "1883102579"
	)
	PlayerCompositionColorTextureOverride method2905() {
		return this.field1202;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgx;B)V",
		garbageValue = "0"
	)
	void method2906(PlayerCompositionColorTextureOverride var1) {
		this.field1202 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1990983405"
	)
	void method2907() {
		this.field1202 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrx;B)V",
		garbageValue = "76"
	)
	void method2908(ProjectionCoord var1) {
		this.field1196 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "982962312"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
