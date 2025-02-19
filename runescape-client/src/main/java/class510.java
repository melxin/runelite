import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public abstract class class510 extends class311 implements class577 {
	@ObfuscatedName("co")
	static String field5244;

	@ObfuscatedSignature(
		descriptor = "(Lot;Lqt;I)V"
	)
	protected class510(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "945027352"
	)
	protected abstract class512 vmethod10020(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1566810163"
	)
	public int method9535() {
		return super.field3355;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "2098029743"
	)
	public Object vmethod10577(int var1) {
		class512 var2 = this.vmethod10020(var1);
		return var2 != null && var2.method9555() ? var2.method9556() : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)Lwe;",
		garbageValue = "-1932327741"
	)
	public class578 method9534(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class512 var3 = this.vmethod10020(var2);
		class578 var4 = new class578(var2);
		Class var5 = var3.field5251.field5490;
		if (var5 == Integer.class) {
			var4.field5638 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field5638 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field5638 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class572.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class572 var6 = (class572)var5.newInstance();
				var6.method10533(var1);
				var4.field5638 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
