import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ab")
	boolean field875;
	@ObfuscatedName("at")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 147879895
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1481451189
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1003661435
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1675152925
	)
	int field876;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1666913007
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1259045377
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ap")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2033458985
	)
	int field871;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -775355841
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1548564794"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "-1628583094"
	)
	public void method2172(Widget var1) {
		this.widget = var1;
	}
}
