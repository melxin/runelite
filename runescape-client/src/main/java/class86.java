import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
final class class86 implements class369 {
	@ObfuscatedName("ag")
	public static short[] field1212;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lwq;"
	)
	static class580 field1210;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lof;)V"
	)
	class86(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void vmethod7725() {
		if (this.val$item.method8197().field4138 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2184(this.val$item);
			var1.setArgs(this.val$item.method8197().field4138);
			HttpQueryParams.method10865().addFirst(var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;B)V",
		garbageValue = "-53"
	)
	public static void method2933(AbstractArchive var0) {
		class177.field1946 = var0;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIB)Lrx;",
		garbageValue = "123"
	)
	static ProjectionCoord method2932(WorldView var0, int var1, int var2) {
		if (var0 != null && Occluder.topLevelWorldView != var0) {
			WorldEntity var3 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? FaceNormal.method5848((float)var1, 0.0F, (float)var2) : var3.method10509(var1, var2);
		} else {
			return FaceNormal.method5848((float)var1, 0.0F, (float)var2);
		}
	}
}
