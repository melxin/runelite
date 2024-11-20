import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 8740198902398601825L
	)
	long field4923;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5525479116423553851L
	)
	long field4916;
	@ObfuscatedName("at")
	public boolean field4917;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -4654319740903492217L
	)
	long field4918;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 1712516129536061157L
	)
	long field4919;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 4014843272021666207L
	)
	long field4924;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2105491661
	)
	int field4921;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -938565185
	)
	int field4922;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -959541441
	)
	int field4915;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -371783077
	)
	int field4920;

	public Timer() {
		this.field4923 = -1L;
		this.field4916 = -1L;
		this.field4917 = false;
		this.field4918 = 0L;
		this.field4919 = 0L;
		this.field4924 = 0L;
		this.field4921 = 0;
		this.field4922 = 0;
		this.field4915 = 0;
		this.field4920 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "837831878"
	)
	public void method8792() {
		this.field4923 = class59.method1150();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2110288891"
	)
	public void method8783() {
		if (-1L != this.field4923) {
			this.field4919 = class59.method1150() - this.field4923;
			this.field4923 = -1L;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-678156497"
	)
	public void method8801(int var1) {
		this.field4916 = class59.method1150();
		this.field4921 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	public void method8789() {
		if (this.field4916 != -1L) {
			this.field4918 = class59.method1150() - this.field4916;
			this.field4916 = -1L;
		}

		++this.field4915;
		this.field4917 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public void method8786() {
		this.field4917 = false;
		this.field4922 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1189653721"
	)
	public void method8787() {
		this.method8789();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-1652755474"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4919;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4918;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4924;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4921);
		var1.writeShort(this.field4922);
		var1.writeShort(this.field4915);
		var1.writeShort(this.field4920);
	}
}
