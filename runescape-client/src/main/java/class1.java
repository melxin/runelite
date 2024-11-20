import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class1 implements Callable {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1780120563
	)
	static int field5;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field0;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	final Buffer field7;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final class3 field2;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lav;Lvj;Lae;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field7 = var2;
		this.field2 = var3;
	}

	public Object call() {
		return this.field2.vmethod13(this.field7);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1664377448"
	)
	static String method9() {
		String var0;
		if (SecureUrlRequester.clientPreferences.isUsernameHidden()) {
			String var2 = Login.Login_username;
			String var1 = Occluder.method5164('*', var2.length());
			var0 = var1;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1880445056"
	)
	static Date method12() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}
}
