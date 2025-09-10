import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wv")
public class class574 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	public static final class574 field5820;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	public static final class574 field5816;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	public static final class574 field5824;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	static final class574 field5818;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -903577569
	)
	public final int field5819;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -678886767
	)
	public final int field5815;
	@ObfuscatedName("ao")
	public final Class field5821;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	final class569 field5822;

	static {
		field5820 = new class574(0, 0, Integer.class, new class570());
		field5816 = new class574(3, 1, Long.class, new class573());
		field5824 = new class574(1, 2, String.class, new class575());
		field5818 = new class574(2, 5, DynamicArray.class, new class571());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lve;)V"
	)
	class574(int var1, int var2, Class var3, class569 var4) {
		this.field5819 = var1;
		this.field5815 = var2;
		this.field5821 = var3;
		this.field5822 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5815;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Ljava/lang/Object;",
		garbageValue = "-2141742803"
	)
	public Object method11020(Buffer var1) {
		return this.field5822.vmethod11037(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lws;",
		garbageValue = "0"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class489.field5355.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method11047(new Buffer(var2));
			}

			var1.method11048();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lwv;",
		garbageValue = "-1415623497"
	)
	public static class574[] method11023() {
		return new class574[]{field5816, field5824, field5818, field5820};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lwv;",
		garbageValue = "-632171995"
	)
	public static class574 method11012(Class var0) {
		class574[] var1 = method11023();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class574 var3 = var1[var2];
			if (var3.field5821 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "112"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class36.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && class58.soundEffectCount < 50) {
			JagexCache.method5932(-1, var0, 0, 0, 0, 0, var1, var2, false);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwb;B)V",
		garbageValue = "18"
	)
	public static void method11013(Object var0, Buffer var1) {
		class569 var2 = method11024(var0.getClass());
		var2.vmethod11041(var0, var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lve;",
		garbageValue = "572903098"
	)
	static class569 method11024(Class var0) {
		class574 var1 = method11012(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field5822;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lct;B)V",
		garbageValue = "-18"
	)
	static final void method11034(Actor var0) {
		int var1 = Math.max(1, var0.spotAnimation - Client.cycle);
		int var2 = var0.size * 92278784 + var0.field1089 * 128;
		int var3 = var0.size * 92278784 + var0.field1091 * 128;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1104 = 0;
		var0.orientation = var0.field1095;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "321726628"
	)
	static void method11011(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
