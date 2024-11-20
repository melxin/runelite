import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2095853159
	)
	@Export("group")
	int group;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -207588877
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	boolean field1074;

	InterfaceParent() {
		this.field1074 = false;
	}
}
