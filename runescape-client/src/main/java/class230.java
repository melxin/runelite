import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public abstract class class230 {
	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ae")
	String field2474;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lid;Ljava/lang/String;)V"
	)
	class230(class227 var1, String var2) {
		this.this$0 = var1;
		this.field2474 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8123"
	)
	public abstract int vmethod4561();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1745306065"
	)
	public int vmethod4550() {
		return -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2115621213"
	)
	public String vmethod4549() {
		return null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1931930358"
	)
	public String method4558() {
		return this.field2474;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcu;Lcu;IZIZB)I",
		garbageValue = "1"
	)
	static int method4564(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = NPCComposition.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = NPCComposition.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}
}
