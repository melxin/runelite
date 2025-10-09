import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public class class35 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1762597700"
	)
	static final void method736() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (Client.cycle > var0.cycleEnd) {
				var0.remove();
			} else if (Client.cycle >= var0.cycleStart) {
				var0.setDestination(Client.worldViewManager, Client.cycle, Client.graphicsCycle);
				class547.topLevelWorldView.scene.drawEntity(var0.sourceLevel, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.orientation, -1L, false);
			}
		}

	}
}
