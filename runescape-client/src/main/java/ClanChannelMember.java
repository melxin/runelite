import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ay")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1001783433
	)
	@Export("world")
	public int world;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "43"
	)
	static void method3609(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}
}
