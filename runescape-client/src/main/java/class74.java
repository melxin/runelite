import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class74 {
	@ObfuscatedName("ah")
	static final BigInteger field916;
	@ObfuscatedName("ac")
	static final BigInteger field921;

	static {
		field916 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field921 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lka;",
		garbageValue = "106"
	)
	static class272[] method2213() {
		return new class272[]{class272.field3088, class272.field3093, class272.field3090, class272.field3091, class272.field3095, class272.field3092, class272.field3097};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "535962382"
	)
	public static void method2219() {
		class196.field2022.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lck;",
		garbageValue = "-28"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}
}
