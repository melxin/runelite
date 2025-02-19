import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public final class class414 implements Iterable {
	@ObfuscatedName("ab")
	int field4785;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	Renderable[] field4783;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	Renderable field4784;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class417 field4786;

	public class414(int var1) {
		this.field4785 = var1;
		this.field4783 = new Renderable[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Renderable var3 = this.field4783[var2] = new Renderable();
			var3.field5291 = var3;
			var3.field5292 = var3;
		}

		this.field4786 = new class417(this);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(J)Lut;"
	)
	public Renderable method7890(long var1) {
		Renderable var3 = this.field4783[(int)(var1 & (long)(this.field4785 - 1))];

		for (this.field4784 = var3.field5291; var3 != this.field4784; this.field4784 = this.field4784.field5291) {
			if (this.field4784.field5293 == var1) {
				Renderable var4 = this.field4784;
				this.field4784 = this.field4784.field5291;
				return var4;
			}
		}

		this.field4784 = null;
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lut;J)V"
	)
	public void method7884(Renderable var1, long var2) {
		if (var1.field5292 != null) {
			var1.method9623();
		}

		Renderable var4 = this.field4783[(int)(var2 & (long)(this.field4785 - 1))];
		var1.field5292 = var4.field5292;
		var1.field5291 = var4;
		var1.field5292.field5291 = var1;
		var1.field5291.field5292 = var1;
		var1.field5293 = var2;
	}

	@ObfuscatedName("au")
	public void method7885() {
		for (int var1 = 0; var1 < this.field4785; ++var1) {
			Renderable var2 = this.field4783[var1];

			while (true) {
				Renderable var3 = var2.field5291;
				if (var3 == var2) {
					break;
				}

				var3.method9623();
			}
		}

		this.field4784 = null;
	}

	public Iterator iterator() {
		this.field4786.method7943();
		return this.field4786;
	}
}
