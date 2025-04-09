import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class509 implements class514 {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("topLevelWorldView")
	public static WorldView topLevelWorldView;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	public final class542 field5268;

	@ObfuscatedSignature(
		descriptor = "(Luf;)V"
	)
	class509(class543 var1) {
		this.field5268 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Ltj;)V"
	)
	public class509(class510 var1) {
		this(new class543(var1));
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "7"
	)
	public int method9578(int var1) {
		return this.field5268.vmethod10021(var1);
	}
}
