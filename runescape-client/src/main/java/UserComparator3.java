import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2085681499
	)
	public static int field1521;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)I",
		garbageValue = "101208195"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhd;",
		garbageValue = "97"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1499375175"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "895126381"
	)
	static boolean method3412() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "-1913197673"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return GrandExchangeOfferOwnWorldComparator.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
