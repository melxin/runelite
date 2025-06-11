import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ap")
	public boolean field4652;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -5186246260006454517L
	)
	long field4650;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2756715986817579717L
	)
	long field4651;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 8339549994759054999L
	)
	long field4658;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -1824326462402132639L
	)
	long field4653;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 2555429578384353639L
	)
	long field4654;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 418938787
	)
	int field4655;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 455389409
	)
	int field4656;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -766636587
	)
	int field4659;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -913599717
	)
	int field4649;

	public Timer() {
		this.field4652 = false;
		this.field4650 = -1L;
		this.field4651 = -1L;
		this.field4658 = 0L;
		this.field4653 = 0L;
		this.field4654 = 0L;
		this.field4655 = 0;
		this.field4656 = 0;
		this.field4659 = 0;
		this.field4649 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2025248835"
	)
	public void method7999() {
		this.field4650 = class180.method3973();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1306984710"
	)
	public void method7986() {
		if (-1L != this.field4650) {
			this.field4653 = class180.method3973() - this.field4650;
			this.field4650 = -1L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	public void method7985(int var1) {
		this.field4651 = class180.method3973();
		this.field4655 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-108"
	)
	public void method7988() {
		if (-1L != this.field4651) {
			this.field4658 = class180.method3973() - this.field4651;
			this.field4651 = -1L;
		}

		++this.field4659;
		this.field4652 = true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method7990() {
		this.field4652 = false;
		this.field4656 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	public void method7984() {
		this.method7988();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-998878413"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4653;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4658;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4654;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4655);
		var1.writeShort(this.field4656);
		var1.writeShort(this.field4659);
		var1.writeShort(this.field4649);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1008171208"
	)
	static char method8004(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1290024262"
	)
	static final void method8005(int var0, int var1) {
		int[] var2 = new int[Client.worldViewManager.method2227()];
		float[] var3 = new float[Client.worldViewManager.method2227()];
		int var4 = 0;

		for (Iterator var5 = Client.worldViewManager.iterator(); var5.hasNext(); ++var4) {
			WorldView var21 = (WorldView)var5.next();
			var2[var4] = var21.id;
			var3[var4] = var21.scene.field2731;
		}

		WorldMapLabel.method6622(var3, var2);
		HashMap var23 = new HashMap();

		for (var4 = var2.length - 1; var4 >= 0; --var4) {
			if (var3[var4] > 0.0F || var2[var4] == -1) {
				class508 var22 = Client.worldViewManager.method2231(var2[var4]);
				if (!var23.containsKey(var22)) {
					var23.put(var22, var2[var4]);
				}
			}
		}

		for (var4 = 0; var4 < var2.length; ++var4) {
			int var6 = var2[var4];
			class508 var7 = Client.worldViewManager.method2231(var6);
			Integer var8 = (Integer)var23.get(var7);
			if (var8 != null && var8.equals(var6)) {
				if (var7 == class508.field5283) {
					GrandExchangeOfferOwnWorldComparator.insertMenuItem("Walk here", "", 23, 0, var0, var1, 0, false, var6);
				} else if (var7 == class508.field5284) {
					class445 var9 = class63.method2104(Sound.topLevelWorldView.scene, Client.field429, class6.cameraX, ClientPreferences.cameraY, GrandExchangeOfferAgeComparator.cameraZ);
					if (var9 != null) {
						class445 var10 = class47.method1781((float)Client.field527, (float)Client.field429, (float)Client.field387);
						class445 var12 = SecureRandomCallable.method2080(var9);
						var12.method8695(var10);
						class445 var14 = class445.field4964;
						class445 var15 = SecureRandomCallable.method2080(var14);
						var15.method8728(var12);
						float var16 = (float)Math.atan2((double)class101.method3009(var15, class445.field4965), (double)class101.method3009(class445.field4964, var12));
						int var17 = (int)((double)var16 / 6.283185307179586D * 2048.0D) & 2047;
						int var20 = var17 + 64;
						int var19 = (var20 & 2047) / 128;
						GrandExchangeOfferOwnWorldComparator.insertMenuItem("Set heading", "", 60, var19, 0, 0, 0, false, var6);
						var10.method8687();
						var12.method8687();
						var15.method8687();
						var9.method8687();
					}
				}
			}
		}

	}
}
