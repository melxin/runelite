import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("an")
	boolean field5089;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("al")
	String field5088;
	@ObfuscatedName("ac")
	String field5090;
	@ObfuscatedName("aa")
	boolean field5092;

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public abstract boolean vmethod9290();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-68"
	)
	public boolean method9265() {
		return this.field5092;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1131207223"
	)
	public boolean method9283() {
		return this.field5089;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "613479130"
	)
	public String method9266() {
		return "Error in task: " + this.field5090 + ", Error message: " + this.field5088;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lrh;",
		garbageValue = "-1526635376"
	)
	public SongTask method9267() {
		return this.songTask;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-59"
	)
	void method9268(String var1) {
		this.field5092 = true;
		this.field5088 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltp;III)V",
		garbageValue = "-1542008390"
	)
	public static void method9272(class509 var0, int var1, int var2) {
		if (var0 != null && var0.method9937() > 1) {
			class573.method10775(var0);
			if (var0.field5288 == class563.field5600) {
				class470.method9327(var0.method9965(), var0.method9937(), var1, var2);
			} else if (var0.field5288 == class563.field5594) {
				class470.method9336(var0.method9973(), var0.method9937(), var1, var2);
			} else {
				class470.method9309(var0.method9936(), var0.method9937(), var1, var2);
			}

		}
	}
}
