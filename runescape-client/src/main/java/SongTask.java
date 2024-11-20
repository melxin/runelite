import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	static Widget field4882;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ae")
	String field4880;
	@ObfuscatedName("ao")
	String field4876;
	@ObfuscatedName("ac")
	boolean field4878;
	@ObfuscatedName("aj")
	boolean field4879;

	@ObfuscatedSignature(
		descriptor = "(Lrg;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public abstract boolean vmethod8722();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-113"
	)
	public boolean method8714() {
		return this.field4878;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2089730111"
	)
	public boolean method8699() {
		return this.field4879;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-30"
	)
	public String method8700() {
		return "Error in task: " + this.field4876 + ", Error message: " + this.field4880;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lrg;",
		garbageValue = "337303127"
	)
	public SongTask method8715() {
		return this.songTask;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1461848317"
	)
	void method8702(String var1) {
		this.field4878 = true;
		this.field4880 = var1;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-53"
	)
	static final boolean method8716(int var0) {
		if (var0 >= 2000) {
			var0 -= 2000;
		}

		return var0 == 1007;
	}
}
