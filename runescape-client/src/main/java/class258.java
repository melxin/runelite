import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class258 {
	@ObfuscatedName("ab")
	byte field2968;
	@ObfuscatedName("ay")
	byte field2967;
	@ObfuscatedName("au")
	byte field2969;
	@ObfuscatedName("ad")
	byte field2970;

	public class258() {
		this.field2968 = -1;
		this.field2967 = -1;
		this.field2969 = -1;
		this.field2970 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljb;)V"
	)
	void method5434(class258 var1) {
		this.field2968 = var1.field2968;
		this.field2967 = var1.field2967;
		this.field2969 = var1.field2969;
		this.field2970 = var1.field2970;
	}

	@ObfuscatedName("ay")
	public void method5435(byte var1, byte var2, byte var3, byte var4) {
		this.field2968 = var1;
		this.field2967 = var2;
		this.field2969 = var3;
		this.field2970 = var4;
	}

	@ObfuscatedName("au")
	public void method5436() {
		this.field2968 = -1;
		this.field2967 = -1;
		this.field2969 = -1;
		this.field2970 = 0;
	}

	@ObfuscatedName("ad")
	public boolean method5437() {
		return this.field2970 > 0;
	}
}
