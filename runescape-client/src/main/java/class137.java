import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class137 {
	@ObfuscatedName("ab")
	boolean field1673;
	@ObfuscatedName("at")
	boolean field1652;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	class135 field1653;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	class135 field1654;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lfj;"
	)
	class132[] field1655;
	@ObfuscatedName("af")
	boolean field1651;
	@ObfuscatedName("ae")
	float field1656;
	@ObfuscatedName("aq")
	float field1661;
	@ObfuscatedName("ac")
	float field1664;
	@ObfuscatedName("aa")
	float field1657;
	@ObfuscatedName("ap")
	float field1667;
	@ObfuscatedName("ad")
	float field1662;
	@ObfuscatedName("av")
	float field1663;
	@ObfuscatedName("as")
	float field1659;
	@ObfuscatedName("ar")
	float field1665;
	@ObfuscatedName("az")
	float field1666;
	@ObfuscatedName("au")
	boolean field1670;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 75871431
	)
	int field1658;
	@ObfuscatedName("ao")
	float[] field1669;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1883813531
	)
	int field1660;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1200055583
	)
	int field1671;
	@ObfuscatedName("aw")
	float field1672;
	@ObfuscatedName("ai")
	float field1668;

	class137() {
		this.field1670 = true;
		this.field1658 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)I",
		garbageValue = "89"
	)
	int method3758(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		RouteStrategy.method6242(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class135 var6 = (class135)ScriptFrame.findEnumerated(UserComparator3.method3626(), var5);
		if (var6 == null) {
			var6 = class135.field1636;
		}

		this.field1653 = var6;
		int var7 = var1.readUnsignedByte();
		class135 var8 = (class135)ScriptFrame.findEnumerated(UserComparator3.method3626(), var7);
		if (var8 == null) {
			var8 = class135.field1636;
		}

		this.field1654 = var8;
		this.field1673 = var1.readUnsignedByte() != 0;
		this.field1655 = new class132[var3];
		class132 var11 = null;

		for (int var9 = 0; var9 < var3; ++var9) {
			class132 var10 = new class132();
			var10.method3669(var1, var2);
			this.field1655[var9] = var10;
			if (var11 != null) {
				var11.field1613 = var10;
			}

			var11 = var10;
		}

		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1569788937"
	)
	void method3767() {
		this.field1660 = this.field1655[0].field1607;
		this.field1671 = this.field1655[this.method3766() - 1].field1607;
		this.field1669 = new float[this.method3782() + 1];

		for (int var1 = this.method3761(); var1 <= this.method3762(); ++var1) {
			this.field1669[var1 - this.method3761()] = Skills.method8170(this, (float)var1);
		}

		this.field1655 = null;
		this.field1672 = Skills.method8170(this, (float)(this.method3761() - 1));
		this.field1668 = Skills.method8170(this, (float)(this.method3762() + 1));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-16"
	)
	public float method3760(int var1) {
		if (var1 < this.method3761()) {
			return this.field1672;
		} else {
			return var1 > this.method3762() ? this.field1668 : this.field1669[var1 - this.method3761()];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	int method3761() {
		return this.field1660;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method3762() {
		return this.field1671;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1318854135"
	)
	int method3782() {
		return this.method3762() - this.method3761();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1146714930"
	)
	int method3795(float var1) {
		if (this.field1658 < 0 || (float)this.field1655[this.field1658].field1607 > var1 || this.field1655[this.field1658].field1613 != null && (float)this.field1655[this.field1658].field1613.field1607 <= var1) {
			if (var1 >= (float)this.method3761() && var1 <= (float)this.method3762()) {
				int var2 = this.method3766();
				int var3 = this.field1658;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1655[var6].field1607) {
							if (var1 > (float)this.field1655[var6 - 1].field1607) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1655[var6].field1607) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1655[var6 + 1].field1607) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1658) {
					this.field1658 = var3;
					this.field1670 = true;
				}

				return this.field1658;
			} else {
				return -1;
			}
		} else {
			return this.field1658;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfj;",
		garbageValue = "1301261004"
	)
	class132 method3765(float var1) {
		int var2 = this.method3795(var1);
		return var2 >= 0 && var2 < this.field1655.length ? this.field1655[var2] : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	int method3766() {
		return this.field1655 == null ? 0 : this.field1655.length;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;II)Lfz;",
		garbageValue = "508475801"
	)
	public static class145 method3764(AbstractArchive var0, AbstractArchive var1, int var2) {
		boolean var3 = ClientPreferences.method2733(var0, var1, var2);
		if (!var3) {
			return null;
		} else {
			if (class30.field134 == null) {
				class145.field1728 = Runtime.getRuntime().availableProcessors();
				class30.field134 = new ThreadPoolExecutor(0, class145.field1728, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class145.field1728 * 100 + 100), new class144());
			}

			try {
				return new class145(var0, var1, var2);
			} catch (Exception var5) {
				return null;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "159157862"
	)
	static int method3788(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-833736859"
	)
	static void method3794() {
		class154.clientPreferences.method2615(Client.field368);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-60"
	)
	static void method3793(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
