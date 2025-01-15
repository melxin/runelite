import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	static ClanSettings field3082;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1750753491
	)
	final int field3078;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1318030643
	)
	final int field3081;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -164667467
	)
	final int field3079;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3078 = var1;
		this.field3081 = var2;
		this.field3079 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-394087721"
	)
	boolean method5991(float var1) {
		return var1 >= (float)this.field3079;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lkz;",
		garbageValue = "-1934432977"
	)
	static WorldMapLabelSize method5992(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field3081) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lcx;",
		garbageValue = "-86"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class329.getNextWorldListWorld();
	}
}
