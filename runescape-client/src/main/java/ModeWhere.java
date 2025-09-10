import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5120("", 0, new class429[]{class429.field5087, class429.field5088}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5106("", 1, new class429[]{class429.field5086, class429.field5087, class429.field5088}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5118("", 2, new class429[]{class429.field5086, class429.field5085, class429.field5087}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5107("", 3, new class429[]{class429.field5086}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5108("", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5110("", 5, new class429[]{class429.field5086, class429.field5087}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5111("", 6, new class429[]{class429.field5087}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5112("", 8, new class429[]{class429.field5086, class429.field5087}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5113("", 9, new class429[]{class429.field5086, class429.field5085}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5114("", 10, new class429[]{class429.field5086}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5115("", 11, new class429[]{class429.field5086}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5109("", 12, new class429[]{class429.field5086, class429.field5087}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field5117("", 13, new class429[]{class429.field5086});

	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 785422869
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1423102717
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field5119;

	static {
		method8668();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqj;)V"
	)
	ModeWhere(String var3, int var4, class429[] var5) {
		this.field5119 = new HashSet();
		this.id = var4;
		class429[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class429 var8 = var6[var7];
			this.field5119.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field5119 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lib;",
		garbageValue = "1"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhn;",
		garbageValue = "-125"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.field2203.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqy;",
		garbageValue = "1391760667"
	)
	static ModeWhere[] method8668() {
		return new ModeWhere[]{field5114, field5120, field5112, field5118, field5110, field5107, field5117, field5108, field5115, field5113, field5109, field5106, field5111};
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lhw;I)V",
		garbageValue = "-860845225"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, class197 var1) {
		for (int var2 = 0; var2 < var0.field1161.method9790(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1161.method9787(var2));
			if (var3 != null && var3.isVisible() && var3.definition.field2154 == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size * -1542062016 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = UserComparator8.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = class255.method5812(var0, var3.x, var3.y, var4, var3.vmethod2763());
					var9 -= var3.method2417();
					int var10 = var3.size * 92278784 - 64 + 60;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
