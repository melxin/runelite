import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)I",
		garbageValue = "-461915513"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "1819732120"
	)
	static class134 method3382(int var0) {
		class134 var1 = (class134)class175.findEnumerated(class70.method2209(), var0);
		if (var1 == null) {
			var1 = class134.field1581;
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ltp;",
		garbageValue = "-1412760912"
	)
	static class509 method3385(int var0, Object var1) {
		class509 var2 = (class509)var1;
		if (var2 == null) {
			throw new RuntimeException();
		} else {
			return var2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfj;",
		garbageValue = "1"
	)
	static class143 method3387(int var0) {
		class143 var1 = (class143)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = class230.SequenceDefinition_skeletonsArchive;
			AbstractArchive var4 = WorldMapSection1.SpotAnimationDefinition_archive;
			boolean var5 = EnumComposition.method4121(var3, var4, var0);
			class143 var2;
			if (!var5) {
				var2 = null;
			} else {
				if (class143.field1670 == null) {
					class143.field1665 = Runtime.getRuntime().availableProcessors();
					class143.field1670 = new ThreadPoolExecutor(0, class143.field1665, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class143.field1665 * 100 + 100), new class175());
				}

				try {
					var2 = new class143(var3, var4, var0);
				} catch (Exception var7) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
