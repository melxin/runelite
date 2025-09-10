import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class350 implements Comparator {
	class350() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnb;Lnb;I)I",
		garbageValue = "-1348600189"
	)
	int method7377(class343 var1, class343 var2) {
		return var1.field3949 - var2.field3949;
	}

	public int compare(Object var1, Object var2) {
		return this.method7377((class343)var1, (class343)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcl;",
		garbageValue = "-20243175"
	)
	static class67[] method7378() {
		return new class67[]{class67.field914, class67.field916, class67.field922, class67.field920, class67.field915};
	}
}
