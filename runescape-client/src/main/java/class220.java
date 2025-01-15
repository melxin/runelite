import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class220 extends class226 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ay")
	String field2409;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class223 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class220(class223 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2409 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-681041604"
	)
	public int vmethod5060() {
		return 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "2048"
	)
	public String vmethod5061() {
		return this.field2409;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-1699747546"
	)
	public static void method4973(ArrayList var0, int var1, int var2, int var3, int var4) {
		class333.field3626.clear();
		class333.field3626.addAll(var0);
		class333.musicPlayerStatus = var1;
		class333.field3632 = var2;
		class333.field3633 = var3;
		class333.field3634 = var4;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lbn;I)V",
		garbageValue = "-2006610283"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
