import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ab")
	public boolean field4902;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 9205739636436403675L
	)
	long field4900;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5803151783778028485L
	)
	long field4899;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 9141419936713101391L
	)
	long field4907;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 7355786561009496577L
	)
	long field4901;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 5457139412027203611L
	)
	long field4904;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1406850395
	)
	int field4903;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -221260815
	)
	int field4906;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1238632317
	)
	int field4905;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -763217861
	)
	int field4908;

	public Timer() {
		this.field4902 = false;
		this.field4900 = -1L;
		this.field4899 = -1L;
		this.field4907 = 0L;
		this.field4901 = 0L;
		this.field4904 = 0L;
		this.field4903 = 0;
		this.field4906 = 0;
		this.field4905 = 0;
		this.field4908 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	public void method8297() {
		this.field4900 = class281.method6373();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1326664460"
	)
	public void method8292() {
		if (-1L != this.field4900) {
			this.field4901 = class281.method6373() - this.field4900;
			this.field4900 = -1L;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "261844263"
	)
	public void method8295(int var1) {
		this.field4899 = class281.method6373();
		this.field4903 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method8296() {
		if (this.field4899 != -1L) {
			this.field4907 = class281.method6373() - this.field4899;
			this.field4899 = -1L;
		}

		++this.field4905;
		this.field4902 = true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-315836812"
	)
	public void method8294() {
		this.field4902 = false;
		this.field4906 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-360607729"
	)
	public void method8301() {
		this.method8296();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-98"
	)
	@Export("write")
	public void write(Buffer var1) {
		SpriteBufferProperties.method51(var1, this.field4901);
		SpriteBufferProperties.method51(var1, this.field4907);
		SpriteBufferProperties.method51(var1, this.field4904);
		var1.writeShort(this.field4903);
		var1.writeShort(this.field4906);
		var1.writeShort(this.field4905);
		var1.writeShort(this.field4908);
	}
}
