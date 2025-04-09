import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ln")
	static String field5130;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1346167821
	)
	public int field5127;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ae")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lwp;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field5127 = (int)(class282.method5908() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Ltm;",
		garbageValue = "-628454480"
	)
	public static AbstractSocket method9178(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-2081306636"
	)
	public static char method9179(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class433.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}
}
