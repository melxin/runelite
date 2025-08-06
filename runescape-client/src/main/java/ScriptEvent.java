import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field871;
	@ObfuscatedName("al")
	boolean field875;
	@ObfuscatedName("ab")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -907405385
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -838475017
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1315775245
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1464958167
	)
	int field877;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1036845819
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -187588349
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ag")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -268357469
	)
	int field876;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1350749231
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1728407459"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-12932"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)V",
		garbageValue = "751684833"
	)
	public void method2124(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "91"
	)
	static int method2125(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}
