import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ab")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ay")
	boolean field1092;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 341076935
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 253429233
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1344241487
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 26174277
	)
	int field1091;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 696019371
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -796864669
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ae")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1449170451
	)
	int field1102;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -507232351
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-420974854"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-212097211"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "-1052584533"
	)
	public void method2439(Widget var1) {
		this.widget = var1;
	}
}
