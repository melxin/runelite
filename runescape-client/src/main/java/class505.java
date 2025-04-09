import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public enum class505 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	field5238(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	field5237(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	field5239(2, 2);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1018430967
	)
	final int field5240;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 441166407
	)
	final int field5241;

	class505(int var3, int var4) {
		this.field5240 = var3;
		this.field5241 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5241;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1961411043"
	)
	static void method9568() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.field1352.method9060(); ++var2) {
				int var3 = var1.field1352.method9056(var2);
				WorldEntity var4 = (WorldEntity)var1.worldEntities.get((long)var3);
				if (var4 != null) {
					var4.method9345(Client.cycle);
				}
			}
		}

	}
}
