import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class426 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public static final class426 field4761;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public static final class426 field4760;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	static class426[] field4765;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 451668497
	)
	static int field4767;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1022055261
	)
	static int field4762;
	@ObfuscatedName("ac")
	public float field4764;
	@ObfuscatedName("aj")
	float field4763;
	@ObfuscatedName("av")
	public float field4766;

	static {
		new class426(0.0F, 0.0F, 0.0F);
		new class426(1.0F, 1.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		field4761 = new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		new class426(1.0F, 0.0F, 0.0F);
		new class426(-1.0F, 0.0F, 0.0F);
		new class426(0.0F, 0.0F, 1.0F);
		field4760 = new class426(0.0F, 0.0F, -1.0F);
		new class426(0.0F, 1.0F, 0.0F);
		new class426(0.0F, -1.0F, 0.0F);
		field4765 = new class426[0];
		AsyncRestClient.method168(100);
	}

	public class426(float var1, float var2, float var3) {
		this.field4764 = var1;
		this.field4763 = var2;
		this.field4766 = var3;
	}

	public class426() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	class426(class426 var1) {
		this.field4764 = var1.field4764;
		this.field4763 = var1.field4763;
		this.field4766 = var1.field4766;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-224519009"
	)
	public void method8136() {
		synchronized(field4765) {
			if (field4762 < field4767 - 1) {
				field4765[++field4762 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-260561048"
	)
	public void method8103(float var1, float var2, float var3) {
		this.field4764 = var1;
		this.field4763 = var2;
		this.field4766 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lql;S)V",
		garbageValue = "454"
	)
	void method8104(class426 var1) {
		this.method8103(var1.field4764, var1.field4763, var1.field4766);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method8159() {
		this.field4766 = 0.0F;
		this.field4763 = 0.0F;
		this.field4764 = 0.0F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)Z",
		garbageValue = "1645147965"
	)
	boolean method8106(class426 var1) {
		return this.field4764 == var1.field4764 && this.field4763 == var1.field4763 && this.field4766 == var1.field4766;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-227328486"
	)
	public final void method8107() {
		float var1 = 1.0F / this.method8112();
		this.field4764 *= var1;
		this.field4763 *= var1;
		this.field4766 *= var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lql;B)V",
		garbageValue = "14"
	)
	public final void method8108(class426 var1) {
		this.field4764 += var1.field4764;
		this.field4763 += var1.field4763;
		this.field4766 += var1.field4766;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)V",
		garbageValue = "2020772863"
	)
	final void method8109(class426 var1) {
		this.field4764 -= var1.field4764;
		this.field4763 -= var1.field4763;
		this.field4766 -= var1.field4766;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)F",
		garbageValue = "440618851"
	)
	public final float method8114(class426 var1) {
		return this.field4766 * var1.field4766 + var1.field4763 * this.field4763 + var1.field4764 * this.field4764;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lql;B)V",
		garbageValue = "0"
	)
	public final void method8152(class426 var1) {
		this.method8103(this.field4763 * var1.field4766 - var1.field4763 * this.field4766, this.field4766 * var1.field4764 - this.field4764 * var1.field4766, var1.field4763 * this.field4764 - var1.field4764 * this.field4763);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "957174769"
	)
	final float method8112() {
		return (float)Math.sqrt((double)(this.field4763 * this.field4763 + this.field4764 * this.field4764 + this.field4766 * this.field4766));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-734486630"
	)
	final void method8113(float var1) {
		this.field4764 *= var1;
		this.field4763 *= var1;
		this.field4766 *= var1;
	}

	public String toString() {
		return this.field4764 + ", " + this.field4763 + ", " + this.field4766;
	}
}
