import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class168 extends class150 {
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 1376394099
	)
	static int field1907;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1680151671
	)
	int field1905;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -626737527
	)
	int field1903;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class168(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1905 = var1.readInt();
		this.field1903 = var1.readInt();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3996(this.field1905, this.field1903);
	}
}
