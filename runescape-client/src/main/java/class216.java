import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class216 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static final class216 field2497;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static final class216 field2496;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static final class216 field2503;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2498;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2499;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2502;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2501;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2495;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2506;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2504;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2505;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	public static final class216 field2500;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static final class216 field2507;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	static final class216 field2508;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2114137589
	)
	public final int field2509;

	static {
		field2497 = new class216(0);
		field2496 = new class216(1);
		field2503 = new class216(2);
		field2498 = new class216(3);
		field2499 = new class216(4);
		field2502 = new class216(5);
		field2501 = new class216(6);
		field2495 = new class216(7);
		field2506 = new class216(8);
		field2504 = new class216(9);
		field2505 = new class216(10);
		field2500 = new class216(11);
		field2507 = new class216(12);
		field2508 = new class216(13);
	}

	class216(int var1) {
		this.field2509 = var1;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1043580216"
	)
	static final int method4818(int var0) {
		return Math.abs(var0 - WorldMapLabel.cameraYaw) > 1024 ? 2048 * (var0 < WorldMapLabel.cameraYaw ? 1 : -1) + var0 : var0;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1785669250"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
