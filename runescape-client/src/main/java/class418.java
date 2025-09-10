import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class418 {
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field5030;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILco;I)Ldr;",
		garbageValue = "1173117859"
	)
	public static WorldView method8493(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		Player var4;
		do {
			if (!var2.hasNext()) {
				return var1.method2343();
			}

			var3 = (WorldView)var2.next();
			var4 = (Player)var3.players.get((long)var0);
		} while(var4 == null || var3.id == -1);

		return var3;
	}
}
