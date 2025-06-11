import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2128121917
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -783328143
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -766714879
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2130412817
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 644585335
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("aa")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2055362143
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	PlayerCompositionColorTextureOverride field1206;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-729609244"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = SceneTilePaint.ItemDefinition_get(this.id);
		return this.field1206 == null ? var1.getModel(this.quantity) : var1.method4455(this.field1206);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1508702421"
	)
	boolean method2666(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lgi;",
		garbageValue = "26"
	)
	PlayerCompositionColorTextureOverride method2668() {
		return this.field1206;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "-1190605996"
	)
	void method2669(PlayerCompositionColorTextureOverride var1) {
		this.field1206 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-828541258"
	)
	void method2670() {
		this.field1206 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "-2145441165"
	)
	public static KitDefinition method2686(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (ClanSettings.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = ClanSettings.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "-96111231"
	)
	public static int[] method2683(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] >= class603.field5864.length) {
					return null;
				}

				var1[var2] = class603.field5864[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}
}
