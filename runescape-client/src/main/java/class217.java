import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class217 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("bi")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 896618819
	)
	public int field2326;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1913625419
	)
	public int field2325;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1235349515
	)
	public int field2331;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2052898063
	)
	public int field2327;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1277556611
	)
	public int field2328;

	class217(int var1, int var2, int var3, int var4, int var5) {
		this.field2326 = 0;
		this.field2325 = 1;
		this.field2331 = 0;
		this.field2327 = 0;
		this.field2328 = 0;
		this.field2326 = var1;
		this.field2325 = var2;
		this.field2331 = var3;
		this.field2327 = var4;
		this.field2328 = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lbn;",
		garbageValue = "-1691355241"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}
}
