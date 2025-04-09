import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -2058293025
	)
	static int field4632;
	@ObfuscatedName("ao")
	public boolean field4623;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -8123434036764047831L
	)
	long field4621;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -5928836985852209117L
	)
	long field4631;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8089670649597283123L
	)
	long field4624;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 8289283320194896247L
	)
	long field4625;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -5694339163060503825L
	)
	long field4626;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1177980541
	)
	int field4622;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 526590561
	)
	int field4628;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -507171841
	)
	int field4629;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1370311787
	)
	int field4630;

	public Timer() {
		this.field4623 = false;
		this.field4621 = -1L;
		this.field4631 = -1L;
		this.field4624 = 0L;
		this.field4625 = 0L;
		this.field4626 = 0L;
		this.field4622 = 0;
		this.field4628 = 0;
		this.field4629 = 0;
		this.field4630 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1589430599"
	)
	public void method7592() {
		this.field4621 = class282.method5908();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1117480608"
	)
	public void method7591() {
		if (-1L != this.field4621) {
			this.field4625 = class282.method5908() - this.field4621;
			this.field4621 = -1L;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	public void method7590(int var1) {
		this.field4631 = class282.method5908();
		this.field4622 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1292201576"
	)
	public void method7593() {
		if (-1L != this.field4631) {
			this.field4624 = class282.method5908() - this.field4631;
			this.field4631 = -1L;
		}

		++this.field4629;
		this.field4623 = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2032915408"
	)
	public void method7606() {
		this.field4623 = false;
		this.field4628 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method7595() {
		this.method7593();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "341203163"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4625;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4624;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4626;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4622);
		var1.writeShort(this.field4628);
		var1.writeShort(this.field4629);
		var1.writeShort(this.field4630);
	}
}
