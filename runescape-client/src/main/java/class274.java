import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class274 {
	@ObfuscatedName("ao")
	final int[][] field3113;
	@ObfuscatedName("an")
	final int[][] field3112;
	@ObfuscatedName("ae")
	final int[] field3117;
	@ObfuscatedName("af")
	final int[] field3114;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1197246965
	)
	final int field3116;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 108450499
	)
	int field3111;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1083973627
	)
	int field3115;

	class274(int var1, int var2) {
		this.field3113 = new int[var1][var2];
		this.field3112 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = WorldMapLabelSize.method5922(var3 / 4);
		this.field3117 = new int[var4];
		this.field3114 = new int[var4];
		this.field3116 = var4 - 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32488257"
	)
	void method5759() {
		for (int var1 = 0; var1 < this.field3113.length; ++var1) {
			for (int var2 = 0; var2 < this.field3113[var1].length; ++var2) {
				this.field3113[var1][var2] = 0;
				this.field3112[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2145354872"
	)
	void method5760(int var1, int var2) {
		this.field3111 = var1;
		this.field3115 = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	int method5761() {
		return this.field3111;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	int method5762() {
		return this.field3115;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2093126016"
	)
	int method5763() {
		return this.field3113.length;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "160487849"
	)
	int method5758() {
		return this.field3113[0].length;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1716771985"
	)
	int[][] method5765() {
		return this.field3113;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1659787689"
	)
	int[][] method5766() {
		return this.field3112;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2000576485"
	)
	int[] method5767() {
		return this.field3117;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1775960474"
	)
	int[] method5768() {
		return this.field3114;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1192821148"
	)
	int method5769() {
		return this.field3116;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1579917893"
	)
	public static void method5798() {
		synchronized(ArchiveDiskActionHandler.field4664) {
			if (ArchiveDiskActionHandler.field4668 != 0) {
				ArchiveDiskActionHandler.field4668 = 1;

				try {
					ArchiveDiskActionHandler.field4664.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.clear();
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.clear();
		}
	}
}
