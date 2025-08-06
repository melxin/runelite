import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1351977063
	)
	final int field3218;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 578325675
	)
	final int field3223;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1385641651
	)
	final int field3220;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3218 = var1;
		this.field3223 = var2;
		this.field3220 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1494382114"
	)
	boolean method6365(float var1) {
		return var1 >= (float)this.field3220;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkj;",
		garbageValue = "-1011261633"
	)
	static WorldMapLabelSize[] method6363() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_small, WorldMapLabelSize_large};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lkj;",
		garbageValue = "483268899"
	)
	static WorldMapLabelSize method6364(int var0) {
		WorldMapLabelSize[] var1 = method6363();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field3223) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-540565877"
	)
	static int method6369(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-85"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class267.method6028(0, 0);
			} else if (var5 != -1 && !class238.method5426(var5) && FriendSystem.clientPreferences.getMusicVolume() != 0) {
				ArrayList var6 = new ArrayList();

				for (int var7 = 0; var7 < var0.size(); ++var7) {
					var6.add(new MidiRequest(MoveSpeed.field3199, (Integer)var0.get(var7), 0, FriendSystem.clientPreferences.getMusicVolume(), false));
				}

				if (Client.playingJingle) {
					class161.method3963(var6, var1, var2, var3, var4);
				} else {
					class30.method486(var6, var1, var2, var3, var4, false);
				}
			}

		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2052970485"
	)
	static final boolean method6370(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
