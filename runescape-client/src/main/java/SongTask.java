import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("ao")
	String field4867;
	@ObfuscatedName("ad")
	String field4868;
	@ObfuscatedName("an")
	boolean field4869;
	@ObfuscatedName("ae")
	boolean field4870;

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public abstract boolean vmethod8883();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-99"
	)
	public boolean method8855() {
		return this.field4869;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-306886513"
	)
	public boolean method8858() {
		return this.field4870;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-239741006"
	)
	public String method8870() {
		return "Error in task: " + this.field4868 + ", Error message: " + this.field4867;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)Lrh;",
		garbageValue = "-7939"
	)
	public SongTask method8860() {
		return this.songTask;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1426819065"
	)
	void method8861(String var1) {
		this.field4869 = true;
		this.field4867 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;I)V",
		garbageValue = "1515042012"
	)
	public static void method8875(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		class430.field4779 = var1;
	}
}
