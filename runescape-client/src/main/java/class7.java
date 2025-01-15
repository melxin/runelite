import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class7 {
	@ObfuscatedName("af")
	public static short[][] field30;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -199280175
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ay")
	ExecutorService field23;
	@ObfuscatedName("ah")
	Future field28;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field24;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class3 field25;

	@ObfuscatedSignature(
		descriptor = "(Lvy;Lao;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field23 = Executors.newSingleThreadExecutor();
		this.field24 = var1;
		this.field25 = var2;
		this.method49();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1847674213"
	)
	public boolean method46() {
		return this.field28.isDone();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	public void method47() {
		this.field23.shutdown();
		this.field23 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lvy;",
		garbageValue = "1592185690"
	)
	public Buffer method57() {
		try {
			return (Buffer)this.field28.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1268155503"
	)
	void method49() {
		this.field28 = this.field23.submit(new class1(this, this.field24, this.field25));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "111"
	)
	public static void method50(class339 var0) {
		if (!class333.field3627.contains(var0)) {
			class333.field3627.add(var0);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1908195796"
	)
	static final void method58() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		Interpreter.addGameMessage(30, "", var0);
	}
}
