import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class445 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class445 field4965;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class445 field4964;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lre;"
	)
	static class445[] field4963;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -147855743
	)
	static int field4966;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	static ClanSettings field4970;
	@ObfuscatedName("ac")
	public float field4967;
	@ObfuscatedName("aa")
	public float field4971;
	@ObfuscatedName("am")
	public float field4969;

	static {
		new class445(0.0F, 0.0F, 0.0F);
		new class445(1.0F, 1.0F, 1.0F);
		new class445(1.0F, 0.0F, 0.0F);
		field4965 = new class445(0.0F, 1.0F, 0.0F);
		new class445(0.0F, 0.0F, 1.0F);
		new class445(1.0F, 0.0F, 0.0F);
		new class445(-1.0F, 0.0F, 0.0F);
		new class445(0.0F, 0.0F, 1.0F);
		field4964 = new class445(0.0F, 0.0F, -1.0F);
		new class445(0.0F, 1.0F, 0.0F);
		new class445(0.0F, -1.0F, 0.0F);
		field4963 = new class445[0];
		NpcOverrides.method4147(16);
	}

	public class445() {
	}

	class445(float var1, float var2, float var3) {
		this.field4967 = var1;
		this.field4971 = var2;
		this.field4969 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	class445(class445 var1) {
		this.field4967 = var1.field4967;
		this.field4971 = var1.field4971;
		this.field4969 = var1.field4969;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1911388082"
	)
	public void method8687() {
		synchronized(field4963) {
			if (GrandExchangeOfferNameComparator.field4812 < field4966) {
				field4963[++GrandExchangeOfferNameComparator.field4812 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "252102386"
	)
	public void method8688(float var1, float var2, float var3) {
		this.field4967 = var1;
		this.field4971 = var2;
		this.field4969 = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-287243538"
	)
	void method8689(class445 var1) {
		this.method8688(var1.field4967, var1.field4971, var1.field4969);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	final void method8690() {
		this.field4969 = 0.0F;
		this.field4971 = 0.0F;
		this.field4967 = 0.0F;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)Z",
		garbageValue = "750979643"
	)
	boolean method8691(class445 var1) {
		return this.field4967 == var1.field4967 && this.field4971 == var1.field4971 && var1.field4969 == this.field4969;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1388656432"
	)
	public final void method8697() {
		float var1 = 1.0F / this.method8720();
		this.field4967 *= var1;
		this.field4971 *= var1;
		this.field4969 *= var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-1275301079"
	)
	public final void method8725(class445 var1) {
		this.field4967 += var1.field4967;
		this.field4971 += var1.field4971;
		this.field4969 += var1.field4969;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1023999147"
	)
	public final void method8694(float var1, float var2, float var3) {
		this.field4967 += var1;
		this.field4971 += var2;
		this.field4969 += var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "48971614"
	)
	public final void method8695(class445 var1) {
		this.field4967 -= var1.field4967;
		this.field4971 -= var1.field4971;
		this.field4969 -= var1.field4969;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)F",
		garbageValue = "12"
	)
	final float method8702(class445 var1) {
		return this.field4971 * var1.field4971 + var1.field4967 * this.field4967 + this.field4969 * var1.field4969;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lre;B)V",
		garbageValue = "52"
	)
	public final void method8728(class445 var1) {
		this.method8688(var1.field4969 * this.field4971 - var1.field4971 * this.field4969, this.field4969 * var1.field4967 - this.field4967 * var1.field4969, var1.field4971 * this.field4967 - this.field4971 * var1.field4967);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "1"
	)
	final float method8720() {
		return (float)Math.sqrt((double)(this.field4969 * this.field4969 + this.field4971 * this.field4971 + this.field4967 * this.field4967));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-14"
	)
	public final void method8699(float var1) {
		this.field4967 *= var1;
		this.field4971 *= var1;
		this.field4969 *= var1;
	}

	public String toString() {
		return this.field4967 + ", " + this.field4971 + ", " + this.field4969;
	}
}
