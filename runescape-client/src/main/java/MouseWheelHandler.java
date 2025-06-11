import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements MouseWheel, MouseWheelListener {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -234045725
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-68"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "36"
	)
	void method312(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "944308380"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation;
		this.rotation = 0;
		return var1;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation();
	}
}
