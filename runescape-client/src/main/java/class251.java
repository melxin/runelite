import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class251 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2681;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2679;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2680;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2683;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2682;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2685;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static final class251 field2684;
	@ObfuscatedName("ac")
	public static int[] field2687;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2028366493
	)
	public final int field2686;

	static {
		field2681 = new class251(0);
		field2679 = new class251(1);
		field2680 = new class251(2);
		field2683 = new class251(3);
		field2682 = new class251(4);
		field2685 = new class251(5);
		field2684 = new class251(6);
		field2687 = null;
	}

	class251(int var1) {
		this.field2686 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	public static void method5358() {
		class232.field1915.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1082550805"
	)
	public static int method5360(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122027600"
	)
	public static final void method5359() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
