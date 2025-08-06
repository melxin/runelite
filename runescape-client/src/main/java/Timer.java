import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ar")
	static int[][] field4752;
	@ObfuscatedName("al")
	public boolean field4748;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -7445399682987254329L
	)
	long field4743;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -729746941421479871L
	)
	long field4742;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5695096056904187087L
	)
	long field4745;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -1908743626393324691L
	)
	long field4746;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -4435548914025393789L
	)
	long field4749;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 923897285
	)
	int field4747;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1211476705
	)
	int field4744;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1499919753
	)
	int field4750;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1671662321
	)
	int field4751;

	public Timer() {
		this.field4748 = false;
		this.field4743 = -1L;
		this.field4742 = -1L;
		this.field4745 = 0L;
		this.field4746 = 0L;
		this.field4749 = 0L;
		this.field4747 = 0;
		this.field4744 = 0;
		this.field4750 = 0;
		this.field4751 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1334641211"
	)
	public void method8243() {
		this.field4743 = UserComparator7.method3496();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1135163806"
	)
	public void method8245() {
		if (this.field4743 != -1L) {
			this.field4746 = UserComparator7.method3496() - this.field4743;
			this.field4743 = -1L;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1113588887"
	)
	public void method8246(int var1) {
		this.field4742 = UserComparator7.method3496();
		this.field4747 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553349015"
	)
	public void method8247() {
		if (-1L != this.field4742) {
			this.field4745 = UserComparator7.method3496() - this.field4742;
			this.field4742 = -1L;
		}

		++this.field4750;
		this.field4748 = true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-611970177"
	)
	public void method8248() {
		this.field4748 = false;
		this.field4744 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public void method8249() {
		this.method8247();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-109868908"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4746;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4745;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4749;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4747);
		var1.writeShort(this.field4744);
		var1.writeShort(this.field4750);
		var1.writeShort(this.field4751);
	}
}
