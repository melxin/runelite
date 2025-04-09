import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field5037;
	@ObfuscatedName("ae")
	boolean field5036;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("as")
	String field5038;
	@ObfuscatedName("aq")
	String field5039;
	@ObfuscatedName("av")
	boolean field5040;

	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public abstract boolean vmethod8938();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1450797150"
	)
	public boolean method8916() {
		return this.field5040;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1626153076"
	)
	public boolean method8917() {
		return this.field5036;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-236665682"
	)
	public String method8918() {
		return "Error in task: " + this.field5039 + ", Error message: " + this.field5038;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lro;",
		garbageValue = "-41"
	)
	public SongTask method8930() {
		return this.songTask;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1670137914"
	)
	void method8920(String var1) {
		this.field5040 = true;
		this.field5038 = var1;
	}
}
