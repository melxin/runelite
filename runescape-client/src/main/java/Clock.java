import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static GameBuild field2520;

	Clock() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-51"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-360776082"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class378.logOut();
		switch(var0) {
		case 1:
			WorldMapLabelSize.method6173();
			break;
		case 2:
			FloatProjection.method5441();
		}

	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "663652645"
	)
	static void method4866(WorldView var0) {
		WorldEntity var1 = (WorldEntity)var0.worldEntities.get((long)Client.field337);
		if (var1 != null) {
			class202.method4298(var0, var1, false);
		}
	}
}
