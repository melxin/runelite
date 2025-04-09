import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ak")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ao")
	boolean field1090;
	@ObfuscatedName("an")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 218014165
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 623851745
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -94575799
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1403627161
	)
	int field1091;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1383173327
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1255308771
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ax")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1077849677
	)
	int field1094;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1572569935
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "363978399"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1724563557"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "-911678271"
	)
	public void method2471(Widget var1) {
		this.widget = var1;
	}
}
