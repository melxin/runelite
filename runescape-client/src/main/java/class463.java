import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class463 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	public static final class463 field4954;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	static final class463 field4953;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2066207141
	)
	final int field4952;

	static {
		field4954 = new class463(0);
		field4953 = new class463(1);
	}

	class463(int var1) {
		this.field4952 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lwk;",
		garbageValue = "1773166265"
	)
	public static PrivateChatMode method9025(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5632, PrivateChatMode.field5631, PrivateChatMode.field5630};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5629) {
				return var4;
			}
		}

		return null;
	}
}
