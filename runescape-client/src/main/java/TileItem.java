import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -672817003
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -5181231
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 596598111
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1673794713
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -426251315
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ah")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1631400373
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	PlayerCompositionColorTextureOverride field1207;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1989335864"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-59"
	)
	boolean method2771(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = ObjectComposition.ItemDefinition_get(this.id);
		return this.field1207 == null ? var1.getModel(this.quantity) : var1.method4623(this.field1207);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lgi;",
		garbageValue = "1736826557"
	)
	PlayerCompositionColorTextureOverride method2769() {
		return this.field1207;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "2010721181"
	)
	void method2770(PlayerCompositionColorTextureOverride var1) {
		this.field1207 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1247452480"
	)
	void method2780() {
		this.field1207 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "69797891"
	)
	public static final void method2783(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field1313 = var0;
			class475.PcmPlayer_stereo = var1;
			AuthenticationScheme.field1584 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-214622737"
	)
	static int method2782(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			ObjectComposition var4 = SpriteMask.getObjectDefinition(var3);
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
