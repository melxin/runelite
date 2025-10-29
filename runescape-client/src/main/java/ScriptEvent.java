import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("av")
	boolean field862;
	@ObfuscatedName("at")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1567081689
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1332622121
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2029362027
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 715272521
	)
	int field852;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1798396775
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 837595959
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1784233687
	)
	int field857;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1166617615
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1276808227"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-83"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lof;S)V",
		garbageValue = "5200"
	)
	public void method2184(Widget var1) {
		this.widget = var1;
	}
}
