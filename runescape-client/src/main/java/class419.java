import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class419 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class419 field4828;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class419 field4829;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class419 field4832;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class419 field4831;

	static {
		field4828 = new class419();
		field4829 = new class419();
		field4832 = new class419();
		field4831 = new class419();
	}

	class419() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "0"
	)
	static void method7999(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	public static int method8000(int var0) {
		return (var0 & class561.field5548) - 1;
	}
}
