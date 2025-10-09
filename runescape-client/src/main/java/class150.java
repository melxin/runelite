import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public abstract class class150 extends Node {
	class150() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	abstract void vmethod4162(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	abstract void vmethod4163(ClanSettings var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-473757165"
	)
	public static int method3908(int var0) {
		class145 var2 = (class145)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class145 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			var2 = class137.method3764(class255.SequenceDefinition_skeletonsArchive, class458.SpotAnimationDefinition_archive, var0);
			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3863() ? 0 : 1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIIII)Z",
		garbageValue = "-814091525"
	)
	static boolean method3907(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = HealthBarDefinition.field2044 - var6;
		int var13 = StructComposition.field2267 - var7;
		int var14 = class114.field1517 - var8;
		if (Math.abs(var12) > var9 + class139.field1691) {
			return false;
		} else if (Math.abs(var13) > var10 + LoginState.field291) {
			return false;
		} else if (Math.abs(var14) > var11 + class107.field1425) {
			return false;
		} else if (Math.abs(var14 * class82.field1206 - var13 * class182.field1981) > var10 * class107.field1425 + var11 * LoginState.field291) {
			return false;
		} else if (Math.abs(var12 * class182.field1981 - var14 * LoginType.field5842) > var9 * class107.field1425 + var11 * class139.field1691) {
			return false;
		} else {
			return Math.abs(var13 * LoginType.field5842 - var12 * class82.field1206) <= var10 * class139.field1691 + var9 * LoginState.field291;
		}
	}
}
