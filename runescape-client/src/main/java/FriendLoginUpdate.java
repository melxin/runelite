import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1337791449
	)
	public int field5001;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("at")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwo;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5001 = (int)(class59.method1150() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
