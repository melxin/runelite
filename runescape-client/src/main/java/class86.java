import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
final class class86 implements class355 {
	@ObfuscatedName("pj")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lox;)V"
	)
	class86(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845830227"
	)
	public void vmethod7454() {
		if (this.val$item.method7931().field3987 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2124(this.val$item);
			var1.setArgs(this.val$item.method7931().field3987);
			HttpJsonRequestBody.method10535().addFirst(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwf;",
		garbageValue = "41"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5741.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method11105(new Buffer(var2));
			}

			var1.method11108();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lbg;",
		garbageValue = "126"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}
}
