import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -28988175
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2074563529
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1777377981
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2114848861
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILke;B)Z",
		garbageValue = "43"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1786873094"
	)
	static void method6246() {
		synchronized(ArchiveDiskActionHandler.field4931) {
			if (ArchiveDiskActionHandler.field4932 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4932 = 600;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "-123305827"
	)
	static class146 method6242(int var0) {
		class146 var1 = (class146)ScriptFrame.findEnumerated(Varcs.method3018(), var0);
		if (var1 == null) {
			var1 = class146.field1747;
		}

		return var1;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	static final void method6248() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			Iterator var2 = var1.npcs.iterator();

			while (var2.hasNext()) {
				NPC var3 = (NPC)var2.next();
				if (var3 != null) {
					HealthBarConfig.updateActorSequence(var1, var3, var3.definition.size);
				}
			}
		}

	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2108856085"
	)
	static boolean method6247() {
		return class154.clientPreferences.getEULA() >= Client.field368;
	}
}
