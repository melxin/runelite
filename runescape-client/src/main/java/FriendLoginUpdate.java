import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 35294047
	)
	public int field5182;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("an")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lxm;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5182 = (int)(class180.method3973() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1792896934"
	)
	static final String method9560(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}
}
