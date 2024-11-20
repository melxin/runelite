import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldEntityCoord")
public class WorldEntityCoord {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 730453569
	)
	@Export("currentRotationAngle")
	int currentRotationAngle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1116351229
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1564216165
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 248144009
	)
	@Export("z")
	int z;

	public WorldEntityCoord() {
		this.currentRotationAngle = 0;
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1237438283"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1283398017"
	)
	@Export("getZ")
	public int getZ() {
		return this.z;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1786884447"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-39"
	)
	@Export("getTileX")
	public int getTileX() {
		return this.x >> 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-585325414"
	)
	@Export("getTileY")
	public int getTileY() {
		return this.y >> 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1120335112"
	)
	@Export("getCurrentRotationAngle")
	public int getCurrentRotationAngle() {
		return this.currentRotationAngle;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "-5"
	)
	public void method5695(WorldEntityCoord var1) {
		this.currentRotationAngle = var1.currentRotationAngle;
		this.x = var1.x;
		this.z = var1.z;
		this.y = var1.y;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-50"
	)
	public void method5696(int var1, int var2) {
		this.x = var1;
		this.y = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-2"
	)
	public void method5697(int var1, int var2) {
		this.x = Coord.method6825(var1) + 64;
		this.y = Coord.method6825(var2) + 64;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1392225251"
	)
	@Export("setCurrentRotationAngle")
	public void setCurrentRotationAngle(int var1) {
		this.currentRotationAngle = var1 & 2047;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1735742043"
	)
	@Export("setZ")
	public void setZ(int var1) {
		this.z = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "714413663"
	)
	@Export("setDirection")
	public void setDirection(int var1, int var2) {
		this.x += var1;
		this.y += var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1285076419"
	)
	public void method5689(int var1, int var2, int var3, int var4) {
		this.x += var1;
		this.z += var2;
		this.y += var3;
		this.setCurrentRotationAngle(var4 + this.currentRotationAngle);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkq;",
		garbageValue = "-1"
	)
	public static MoveSpeed[] method5731() {
		return new MoveSpeed[]{MoveSpeed.field3073, MoveSpeed.field3074, MoveSpeed.field3072, MoveSpeed.field3066, MoveSpeed.field3067, MoveSpeed.field3070, MoveSpeed.field3069, MoveSpeed.field3068, MoveSpeed.field3071};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "-1698358080"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class374.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						if (var1.field2249 != null) {
							var1.field2249[var3] = null;
						}

						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = ClanChannelMember.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
