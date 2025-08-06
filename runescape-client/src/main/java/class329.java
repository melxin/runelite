import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class329 implements class324 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3724;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3726;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3729;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3718;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3727;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3720;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	static final class329 field3721;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public static final class329 field3722;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lmp;"
	)
	static final class329[] field3715;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("bj")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -1075704077
	)
	static int field3728;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 631195753
	)
	public final int field3716;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -99089821
	)
	public final int field3725;

	static {
		field3724 = new class329(14, 0);
		field3726 = new class329(15, 20);
		field3729 = new class329(16, -2);
		field3718 = new class329(18, -2);
		field3727 = new class329(19, -2);
		field3720 = new class329(21, 37);
		field3721 = new class329(27, 0);
		field3722 = new class329(32, 66);
		field3715 = new class329[33];
		class329[] var0 = new class329[]{field3729, field3720, field3727, field3722, field3724, field3726, field3718, field3721};
		class329[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3715[var1[var2].field3716] = var1[var2];
		}

	}

	class329(int var1, int var2) {
		this.field3716 = var1;
		this.field3725 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1351508771"
	)
	public static void method7033() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3997.clearFiles();
		PlayerComposition.field3998 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "51"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}
