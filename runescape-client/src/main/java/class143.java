import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class143 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1097451871
	)
	public static int field1665;
	@ObfuscatedName("aj")
	public static ThreadPoolExecutor field1670;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 443485331
	)
	int field1666;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[[Lfg;"
	)
	public class136[][] field1667;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfg;"
	)
	class136[][] field1673;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public Skeleton field1669;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1119140629
	)
	int field1668;
	@ObfuscatedName("am")
	boolean field1671;
	@ObfuscatedName("ah")
	Future field1672;
	@ObfuscatedName("ag")
	List field1664;

	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;I)V"
	)
	public class143(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1667 = null;
		this.field1673 = null;
		this.field1668 = 0;
		this.field1666 = var3;
		byte[] var4 = var1.takeFile(this.field1666 >> 16 & 65535, this.field1666 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1669 = new Skeleton(var7, var8);
		this.field1664 = new ArrayList();
		this.field1672 = field1670.submit(new class140(this, var5, var6));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "2055032565"
	)
	void method3608(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1668 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1673 = new class136[this.field1669.method5173().method5100()][];
		this.field1667 = new class136[this.field1669.method5172()][];
		class135[] var4 = new class135[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class137 var12 = class182.method3993(var1.readUnsignedByte());
			var7 = var1.readUShortSmart();
			class138 var13 = class321.method6828(var1.readUnsignedByte());
			class136 var14 = new class136();
			var14.method3527(var1, var2);
			var4[var5] = new class135(this, var14, var12, var13, var7);
			int var10 = var12.method3555();
			class136[][] var15;
			if (var12 == class137.field1621) {
				var15 = this.field1673;
			} else {
				var15 = this.field1667;
			}

			if (var15[var7] == null) {
				var15[var7] = new class136[var10];
			}

			if (var12 == class137.field1616) {
				this.field1671 = true;
			}
		}

		var5 = var3 / field1665;
		int var6 = var3 % field1665;
		int var8 = 0;

		for (int var9 = 0; var9 < field1665; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1664.add(field1670.submit(new class142(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-13974"
	)
	public boolean method3594() {
		if (this.field1672 == null && this.field1664 == null) {
			return true;
		} else {
			if (this.field1672 != null) {
				if (!this.field1672.isDone()) {
					return false;
				}

				this.field1672 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1664.size(); ++var2) {
				if (!((Future)this.field1664.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1664.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1664 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public int method3592() {
		return this.field1668;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	public boolean method3596() {
		return this.field1671;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILfk;IIS)V",
		garbageValue = "24034"
	)
	public void method3597(int var1, class133 var2, int var3, int var4) {
		TransformationMatrix var5 = class231.method4854();
		this.method3606(var5, var3, var2, var1);
		this.method3600(var5, var3, var2, var1);
		this.method3599(var5, var3, var2, var1);
		var2.method3480(var5);
		var5.method8772();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfk;II)V",
		garbageValue = "-2052596678"
	)
	void method3606(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3483(this.field1668);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1673[var2] != null) {
			class136 var9 = this.field1673[var2][0];
			class136 var10 = this.field1673[var2][1];
			class136 var11 = this.field1673[var2][2];
			if (var9 != null) {
				var6 = var9.method3526(var4);
			}

			if (var10 != null) {
				var7 = var10.method3526(var4);
			}

			if (var11 != null) {
				var8 = var11.method3526(var4);
			}
		}

		class446 var16 = GrandExchangeEvent.method8240();
		var16.method8770(1.0F, 0.0F, 0.0F, var6);
		class446 var14 = GrandExchangeEvent.method8240();
		var14.method8770(0.0F, 1.0F, 0.0F, var7);
		class446 var15 = GrandExchangeEvent.method8240();
		var15.method8770(0.0F, 0.0F, 1.0F, var8);
		class446 var12 = GrandExchangeEvent.method8240();
		var12.method8743(var15);
		var12.method8743(var16);
		var12.method8743(var14);
		TransformationMatrix var13 = class231.method4854();
		var13.method8784(var12);
		var1.method8782(var13);
		var16.method8769();
		var14.method8769();
		var15.method8769();
		var12.method8769();
		var13.method8772();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfk;II)V",
		garbageValue = "1349366762"
	)
	void method3599(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3509(this.field1668);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1673[var2] != null) {
			class136 var9 = this.field1673[var2][3];
			class136 var10 = this.field1673[var2][4];
			class136 var11 = this.field1673[var2][5];
			if (var9 != null) {
				var6 = var9.method3526(var4);
			}

			if (var10 != null) {
				var7 = var10.method3526(var4);
			}

			if (var11 != null) {
				var8 = var11.method3526(var4);
			}
		}

		var1.field4984[12] = var6;
		var1.field4984[13] = var7;
		var1.field4984[14] = var8;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfk;II)V",
		garbageValue = "2098070867"
	)
	void method3600(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3489(this.field1668);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1673[var2] != null) {
			class136 var9 = this.field1673[var2][6];
			class136 var10 = this.field1673[var2][7];
			class136 var11 = this.field1673[var2][8];
			if (var9 != null) {
				var6 = var9.method3526(var4);
			}

			if (var10 != null) {
				var7 = var10.method3526(var4);
			}

			if (var11 != null) {
				var8 = var11.method3526(var4);
			}
		}

		TransformationMatrix var12 = class231.method4854();
		var12.method8780(var6, var7, var8);
		var1.method8782(var12);
		var12.method8772();
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "42"
	)
	static void method3620(int var0, int var1) {
		if (ClientPacket.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(class217.archive6, var0, 0, ClientPacket.clientPreferences.getMusicVolume(), false));
			class30.method451(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
