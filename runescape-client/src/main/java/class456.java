import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class456 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lrf;"
	)
	static final class456[] field5217;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311941883
	)
	static final int field5218;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -691516217
	)
	static int field5222;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	public class461 field5219;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public ProjectionCoord field5215;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	public ProjectionCoord field5216;

	static {
		field5222 = 0;
		field5218 = 16;
		field5217 = new class456[field5218];
	}

	class456() {
		this.field5219 = new class461();
		this.field5215 = new ProjectionCoord();
		this.field5216 = new ProjectionCoord(1.0F, 1.0F, 1.0F);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16834"
	)
	public void method9216() {
		synchronized(field5217) {
			if (field5222 < field5218) {
				field5217[++field5222 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1433454718"
	)
	void method9217() {
		this.field5219.method9369();
		this.field5215.method9349();
		this.field5216.x = 1.0F;
		this.field5216.z = 1.0F;
		this.field5216.y = 1.0F;
	}

	public String toString() {
		return "[" + this.field5219.toString() + "|" + this.field5215.toString() + "|" + this.field5216.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class456)) {
			return false;
		} else {
			class456 var2 = (class456)var1;
			return this.field5219.equals(var2.field5219) && this.field5215.method9298(var2.field5215) && this.field5216.method9298(var2.field5216);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field5219.hashCode();
		var3 = var3 * 31 + this.field5215.hashCode();
		var3 = var3 * 31 + this.field5216.hashCode();
		return var3;
	}
}
