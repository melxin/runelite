import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field2452;
	@ObfuscatedName("ab")
	long[] field2449;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1206329351
	)
	int field2446;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -570444977
	)
	int field2445;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -3326574965577555163L
	)
	long field2448;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1914213707
	)
	int field2451;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2055417121
	)
	int field2450;

	public MilliClock() {
		this.field2449 = new long[10];
		this.field2446 = 256;
		this.field2445 = 1;
		this.field2451 = 0;
		this.field2448 = InterfaceParent.method2434();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2449[var1] = this.field2448;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-528687795"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2449[var1] = 0L;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1298387428"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2446;
		int var4 = this.field2445;
		this.field2446 = 300;
		this.field2445 = 1;
		this.field2448 = InterfaceParent.method2434();
		if (0L == this.field2449[this.field2450]) {
			this.field2446 = var3;
			this.field2445 = var4;
		} else if (this.field2448 > this.field2449[this.field2450]) {
			this.field2446 = (int)((long)(var1 * 2560) / (this.field2448 - this.field2449[this.field2450]));
		}

		if (this.field2446 < 25) {
			this.field2446 = 25;
		}

		if (this.field2446 > 256) {
			this.field2446 = 256;
			this.field2445 = (int)((long)var1 - (this.field2448 - this.field2449[this.field2450]) / 10L);
		}

		if (this.field2445 > var1) {
			this.field2445 = var1;
		}

		this.field2449[this.field2450] = this.field2448;
		this.field2450 = (this.field2450 + 1) % 10;
		int var5;
		if (this.field2445 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2449[var5]) {
					this.field2449[var5] += (long)this.field2445;
				}
			}
		}

		if (this.field2445 < var2) {
			this.field2445 = var2;
		}

		IntProjection.method4837((long)this.field2445);

		for (var5 = 0; this.field2451 < 256; this.field2451 += this.field2446) {
			++var5;
		}

		this.field2451 &= 255;
		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)V",
		garbageValue = "-1729524571"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class72.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "91"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "-1654950209"
	)
	static class145 method4494(int var0) {
		class145 var1 = (class145)class454.findEnumerated(InvDefinition.method3760(), var0);
		if (var1 == null) {
			var1 = class145.field1695;
		}

		return var1;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "-129926357"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field740) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
