import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class167 extends class149 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2085519445
	)
	int field1872;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -943952655
	)
	int field1871;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class167(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1872 = var1.readInt();
		this.field1871 = var1.readInt();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3906(this.field1872, this.field1871);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([II)Ltn;",
		garbageValue = "-1496702489"
	)
	public static class515 method4020(int[] var0) {
		class515 var1 = new class515(class570.field5721, true);
		var1.field5404 = var0;
		var1.field5401 = var0.length * 1527641021;
		var1.field5402 = var0.length;
		return var1;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "46602164"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class570.updateItemPile2(class81.worldView, var0, var1, var2);
	}
}
