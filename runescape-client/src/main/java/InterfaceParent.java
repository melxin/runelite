import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static GraphicsDefaults field870;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -993511513
	)
	@Export("group")
	int group;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1973101899
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	boolean field867;

	InterfaceParent() {
		this.field867 = false;
	}
}
