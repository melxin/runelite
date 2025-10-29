import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ag")
	boolean field5379;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ae")
	String field5381;
	@ObfuscatedName("aj")
	String field5378;
	@ObfuscatedName("ak")
	boolean field5382;

	@ObfuscatedSignature(
		descriptor = "(Lsz;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public abstract boolean vmethod9974();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1958046830"
	)
	public boolean method9961() {
		return this.field5382;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1899370864"
	)
	public boolean method9958() {
		return this.field5379;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "24882"
	)
	public String method9948() {
		return "Error in task: " + this.field5378 + ", Error message: " + this.field5381;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lsz;",
		garbageValue = "-62"
	)
	public SongTask method9949() {
		return this.songTask;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-13"
	)
	void method9950(String var1) {
		this.field5382 = true;
		this.field5381 = var1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lof;S)V",
		garbageValue = "1847"
	)
	static void method9962(Widget var0) {
		var0.method8193();
		var0.method8194().method7884(new class85(var0));
		var0.method8194().method7883(new class86(var0));
	}
}
