import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class1 implements Callable {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -145746093
	)
	static int field4;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	final Buffer field3;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field5;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lam;Lwt;Lai;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field3 = var2;
		this.field5 = var3;
	}

	public Object call() {
		return this.field5.vmethod9(this.field3);
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1771689453"
	)
	static final boolean method8(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1256300723"
	)
	static void method7(int var0) {
		Client.oculusOrbState = var0;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "103"
	)
	static boolean method6() {
		return ClientPacket.clientPreferences.getEULA() >= Client.field379;
	}
}
