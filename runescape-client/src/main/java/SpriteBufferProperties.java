import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("az")
	static int[][] field24;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -948425081
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field28;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field26;
	@ObfuscatedName("ag")
	ExecutorService field19;
	@ObfuscatedName("aj")
	Future field20;

	@ObfuscatedSignature(
		descriptor = "(Lwj;Laj;)V"
	)
	public SpriteBufferProperties(Buffer var1, class3 var2) {
		this.field19 = Executors.newSingleThreadExecutor();
		this.field28 = var1;
		this.field26 = var2;
		this.method41();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "88"
	)
	public boolean method42() {
		return this.field20.isDone();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1687695813"
	)
	public void method40() {
		this.field19.shutdown();
		this.field19 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lwj;",
		garbageValue = "1251241349"
	)
	public Buffer method43() {
		try {
			return (Buffer)this.field20.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method41() {
		this.field20 = this.field19.submit(new class1(this, this.field28, this.field26));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;J)V"
	)
	static void method51(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrt;I)Lrt;",
		garbageValue = "-600444548"
	)
	static final class451 method54(class451 var0) {
		class451 var1 = class226.method5106(var0);
		var1.method9127();
		return var1;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "-1479716944"
	)
	public static IndexCheck method52() {
		return Client.indexCheck;
	}
}
