import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	static Model field5033;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ad")
	String field5029;
	@ObfuscatedName("ah")
	String field5028;
	@ObfuscatedName("ac")
	boolean field5031;
	@ObfuscatedName("ao")
	boolean field5032;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public abstract boolean vmethod8896();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method8880() {
		return this.field5031;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "33"
	)
	public boolean method8883() {
		return this.field5032;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1918329178"
	)
	public String method8870() {
		return "Error in task: " + this.field5028 + ", Error message: " + this.field5029;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lrt;",
		garbageValue = "961701471"
	)
	public SongTask method8874() {
		return this.songTask;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method8875(String var1) {
		this.field5031 = true;
		this.field5029 = var1;
	}
}
