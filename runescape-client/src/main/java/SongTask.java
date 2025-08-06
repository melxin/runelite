import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("ac")
	boolean field5188;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("au")
	String field5190;
	@ObfuscatedName("as")
	String field5191;
	@ObfuscatedName("ah")
	boolean field5192;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public abstract boolean vmethod9672();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1667357506"
	)
	public boolean method9650() {
		return this.field5192;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1614298445"
	)
	public boolean method9655() {
		return this.field5188;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "38"
	)
	public String method9667() {
		return "Error in task: " + this.field5191 + ", Error message: " + this.field5190;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lsj;",
		garbageValue = "87"
	)
	public SongTask method9653() {
		return this.songTask;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-630239630"
	)
	void method9654(String var1) {
		this.field5192 = true;
		this.field5190 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILwt;I)Z",
		garbageValue = "782641090"
	)
	public static boolean method9668(int var0, class578 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}
}
