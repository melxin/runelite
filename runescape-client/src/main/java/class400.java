import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class400 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	static final class400 field4680;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4662;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4663;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4664;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4682;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4674;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4667;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4668;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4669;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4661;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4671;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4672;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4673;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4683;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4686;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4665;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4677;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4678;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4679;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4670;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4681;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4666;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4675;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	public static final class400 field4684;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1454964213
	)
	static int field4676;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 821426081
	)
	public final int field4685;

	static {
		field4680 = new class400(255);
		field4662 = new class400(0);
		field4663 = new class400(1);
		field4664 = new class400(2);
		field4682 = new class400(3);
		field4674 = new class400(4);
		field4667 = new class400(5);
		field4668 = new class400(6);
		field4669 = new class400(7);
		field4661 = new class400(8);
		field4671 = new class400(9);
		field4672 = new class400(10);
		field4673 = new class400(11);
		field4683 = new class400(12);
		field4686 = new class400(13);
		field4665 = new class400(14);
		field4677 = new class400(15);
		field4678 = new class400(17);
		field4679 = new class400(18);
		field4670 = new class400(19);
		field4681 = new class400(20);
		field4666 = new class400(21);
		field4675 = new class400(22);
		field4684 = new class400(23);
	}

	class400(int var1) {
		this.field4685 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "1757555886"
	)
	static void method7627(ArrayList var0, boolean var1) {
		if (!var1) {
			class335.field3689.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MidiRequest var3 = (MidiRequest)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class335.field3689.add(var3);
				}

				class335.field3687.add(var3);
			}
		}

	}
}
