import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class365 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	class460 field4119;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	class460 field4127;
	@ObfuscatedName("ax")
	boolean field4124;
	@ObfuscatedName("an")
	boolean field4125;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1490771469
	)
	int field4128;
	@ObfuscatedName("ai")
	boolean field4123;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 843629655
	)
	int field4120;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1439891741
	)
	int field4129;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1844712889
	)
	int field4130;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1449264343
	)
	int field4131;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -982840131
	)
	int field4132;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -834597659
	)
	int field4133;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -170428679
	)
	int field4134;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1673767427
	)
	int field4135;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 408086007
	)
	int field4136;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 861877933
	)
	int field4137;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -2136387551
	)
	int field4138;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -39205239
	)
	int field4122;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 931708063
	)
	int field4139;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	class356 field4143;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	class356 field4142;

	class365() {
		this.field4119 = new class460();
		this.field4127 = new class460();
		this.field4124 = false;
		this.field4125 = true;
		this.field4128 = 0;
		this.field4123 = false;
		this.field4120 = 0;
		this.field4129 = 0;
		this.field4130 = 0;
		this.field4131 = 0;
		this.field4132 = 0;
		this.field4133 = 0;
		this.field4134 = 0;
		this.field4135 = Integer.MAX_VALUE;
		this.field4136 = Integer.MAX_VALUE;
		this.field4137 = 0;
		this.field4138 = 0;
		this.field4122 = 0;
		this.field4139 = 0;
		this.field4119.method9362(1);
		this.field4127.method9362(1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	void method7611() {
		this.field4128 = (this.field4128 + 1) % 60;
		if (this.field4134 > 0) {
			--this.field4134;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1557970004"
	)
	public boolean method7883(boolean var1) {
		var1 = var1 && this.field4125;
		boolean var2 = this.field4124 != var1;
		this.field4124 = var1;
		if (!this.field4124) {
			this.method7718(this.field4131, this.field4131);
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "613372526"
	)
	public void method7732(boolean var1) {
		this.field4125 = var1;
		this.field4124 = var1 && this.field4124;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1548385085"
	)
	public boolean method7614(String var1) {
		String var2 = this.field4119.method9426();
		if (!var2.equals(var1)) {
			var1 = this.method7679(var1);
			this.field4119.method9346(var1);
			this.method7718(this.field4132, this.field4131);
			this.method7811(this.field4122, this.field4139);
			this.method7683();
			this.method7688();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1376387344"
	)
	boolean method7615(String var1) {
		this.field4127.method9346(var1);
		return true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)Z",
		garbageValue = "688559564"
	)
	boolean method7641(AbstractFont var1) {
		boolean var2 = !this.field4123;
		this.field4119.method9339(var1);
		this.field4127.method9339(var1);
		this.field4123 = true;
		var2 |= this.method7811(this.field4122, this.field4139);
		var2 |= this.method7718(this.field4132, this.field4131);
		if (this.method7683()) {
			this.method7688();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1453817202"
	)
	public boolean method7617(int var1, int var2) {
		boolean var3 = this.field4137 != var1 || var2 != this.field4138;
		this.field4137 = var1;
		this.field4138 = var2;
		var3 |= this.method7811(this.field4122, this.field4139);
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2144244891"
	)
	public boolean method7842(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field4119.method9408();
		this.field4119.method9367(var1);
		this.field4127.method9367(var1);
		if (this.method7683()) {
			this.method7688();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "162894654"
	)
	public boolean method7619(int var1) {
		this.field4119.method9360(var1);
		if (this.method7683()) {
			this.method7688();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1207584917"
	)
	public boolean method7620(int var1) {
		this.field4136 = var1;
		if (this.method7683()) {
			this.method7688();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1202663357"
	)
	public boolean method7811(int var1, int var2) {
		if (!this.method7664()) {
			this.field4122 = var1;
			this.field4139 = var2;
			return false;
		} else {
			int var3 = this.field4122;
			int var4 = this.field4139;
			int var5 = Math.max(0, this.field4119.method9355() - this.field4137 + 2);
			int var6 = Math.max(0, this.field4119.method9462() - this.field4138 + 1);
			this.field4122 = Math.max(0, Math.min(var5, var1));
			this.field4139 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field4122 || var4 != this.field4139;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-216570847"
	)
	public boolean method7729(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field4119.method9340(var1, var2) : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-944944630"
	)
	public void method7623(int var1) {
		this.field4119.method9341(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "68"
	)
	public boolean method7624(int var1) {
		this.field4130 = var1;
		String var2 = this.field4119.method9426();
		int var3 = var2.length();
		var2 = this.method7679(var2);
		if (var2.length() != var3) {
			this.field4119.method9346(var2);
			this.method7811(this.field4122, this.field4139);
			this.method7683();
			this.method7688();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1800595815"
	)
	public void method7625() {
		this.field4123 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1782338908"
	)
	public boolean method7612(int var1) {
		if (this.method7645(var1)) {
			this.method7631();
			class461 var2 = this.field4119.method9343((char)var1, this.field4131, this.field4135);
			this.method7718(var2.method9463(), var2.method9463());
			this.method7683();
			this.method7688();
		}

		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1634757614"
	)
	public void method7799() {
		if (!this.method7631() && this.field4131 > 0) {
			int var1 = this.field4119.method9348(this.field4131 - 1);
			this.method7688();
			this.method7718(var1, var1);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	public void method7686() {
		if (!this.method7631() && this.field4131 < this.field4119.method9437()) {
			int var1 = this.field4119.method9348(this.field4131);
			this.method7688();
			this.method7718(var1, var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	public void method7629() {
		if (!this.method7631() && this.field4131 > 0) {
			class555 var1 = this.method7681(this.field4131 - 1);
			int var2 = this.field4119.method9349((Integer)var1.field5821, this.field4131);
			this.method7688();
			this.method7718(var2, var2);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public void method7824() {
		if (!this.method7631() && this.field4131 < this.field4119.method9437()) {
			class555 var1 = this.method7681(this.field4131);
			int var2 = this.field4119.method9349(this.field4131, (Integer)var1.field5819);
			this.method7688();
			this.method7718(var2, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1949669765"
	)
	boolean method7631() {
		if (!this.method7678()) {
			return false;
		} else {
			int var1 = this.field4119.method9349(this.field4132, this.field4131);
			this.method7688();
			this.method7718(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26786"
	)
	public void method7632() {
		this.method7718(0, this.field4119.method9437());
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1965205006"
	)
	public boolean method7718(int var1, int var2) {
		if (!this.method7664()) {
			this.field4132 = var1;
			this.field4131 = var2;
			return false;
		} else {
			if (var1 > this.field4119.method9437()) {
				var1 = this.field4119.method9437();
			}

			if (var2 > this.field4119.method9437()) {
				var2 = this.field4119.method9437();
			}

			boolean var3 = this.field4132 != var1 || var2 != this.field4131;
			this.field4132 = var1;
			if (var2 != this.field4131) {
				this.field4131 = var2;
				this.field4128 = 0;
				this.method7861();
			}

			if (var3 && this.field4142 != null) {
				this.field4142.vmethod7479();
			}

			return var3;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1326197810"
	)
	public void method7668(boolean var1) {
		class555 var2 = this.method7682(this.field4131);
		this.method7684((Integer)var2.field5821, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "217"
	)
	public void method7635(boolean var1) {
		class555 var2 = this.method7682(this.field4131);
		this.method7684((Integer)var2.field5819, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "709781225"
	)
	public void method7857(boolean var1) {
		this.method7684(0, var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1305928075"
	)
	public void method7812(boolean var1) {
		this.method7684(this.field4119.method9437(), var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "231782525"
	)
	public void method7638(boolean var1) {
		if (this.method7678() && !var1) {
			this.method7684(Math.min(this.field4132, this.field4131), var1);
		} else if (this.field4131 > 0) {
			this.method7684(this.field4131 - 1, var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "15"
	)
	public void method7639(boolean var1) {
		if (this.method7678() && !var1) {
			this.method7684(Math.max(this.field4132, this.field4131), var1);
		} else if (this.field4131 < this.field4119.method9437()) {
			this.method7684(this.field4131 + 1, var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "777241267"
	)
	public void method7868(boolean var1) {
		if (this.field4131 > 0) {
			class555 var2 = this.method7681(this.field4131 - 1);
			this.method7684((Integer)var2.field5821, var1);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1512606011"
	)
	public void method7650(boolean var1) {
		if (this.field4131 < this.field4119.method9437()) {
			class555 var2 = this.method7681(this.field4131 + 1);
			this.method7684((Integer)var2.field5819, var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "401983710"
	)
	public void method7642(boolean var1) {
		if (this.field4131 > 0) {
			this.method7684(this.field4119.method9351(this.field4131, -1), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-506165677"
	)
	public void method7789(boolean var1) {
		if (this.field4131 < this.field4119.method9437()) {
			this.method7684(this.field4119.method9351(this.field4131, 1), var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1940390455"
	)
	public void method7644(boolean var1) {
		if (this.field4131 > 0) {
			int var2 = this.method7646();
			this.method7684(this.field4119.method9351(this.field4131, -var2), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1191926177"
	)
	public void method7791(boolean var1) {
		if (this.field4131 < this.field4119.method9437()) {
			int var2 = this.method7646();
			this.method7684(this.field4119.method9351(this.field4131, var2), var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7691(boolean var1) {
		class464 var2 = this.field4119.method9342(0, this.field4131);
		class555 var3 = var2.method9589();
		this.method7684(this.field4119.method9350((Integer)var3.field5821, this.field4139), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1439428075"
	)
	public void method7628(boolean var1) {
		class464 var2 = this.field4119.method9342(0, this.field4131);
		class555 var3 = var2.method9589();
		this.method7684(this.field4119.method9350((Integer)var3.field5821, this.field4138 + this.field4139), var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1266016689"
	)
	public void method7763(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class555 var6;
		int var8;
		if (!this.field4123) {
			var8 = 0;
		} else {
			var1 += this.field4122;
			var2 += this.field4139;
			var6 = this.method7690();
			var8 = this.field4119.method9350(var1 - (Integer)var6.field5821, var2 - (Integer)var6.field5819);
		}

		if (var3 && var4) {
			this.field4129 = 1;
			var6 = this.method7681(var8);
			class555 var7 = this.method7681(this.field4133);
			this.method7680(var7, var6);
		} else if (var3) {
			this.field4129 = 1;
			var6 = this.method7681(var8);
			this.method7718((Integer)var6.field5821, (Integer)var6.field5819);
			this.field4133 = (Integer)var6.field5821;
		} else if (var4) {
			this.method7718(this.field4133, var8);
		} else {
			if (this.field4134 > 0 && var8 == this.field4133) {
				if (this.field4131 == this.field4132) {
					this.field4129 = 1;
					var6 = this.method7681(var8);
					this.method7718((Integer)var6.field5821, (Integer)var6.field5819);
				} else {
					this.field4129 = 2;
					var6 = this.method7682(var8);
					this.method7718((Integer)var6.field5821, (Integer)var6.field5819);
				}
			} else {
				this.field4129 = 0;
				this.method7718(var8, var8);
				this.field4133 = var8;
			}

			this.field4134 = 25;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1635992865"
	)
	public void method7649(int var1, int var2) {
		if (this.field4123 && this.method7826()) {
			var1 += this.field4122;
			var2 += this.field4139;
			class555 var3 = this.method7690();
			int var4 = this.field4119.method9350(var1 - (Integer)var3.field5821, var2 - (Integer)var3.field5819);
			class555 var5;
			class555 var6;
			switch(this.field4129) {
			case 0:
				this.method7718(this.field4132, var4);
				break;
			case 1:
				var5 = this.method7681(this.field4133);
				var6 = this.method7681(var4);
				this.method7680(var5, var6);
				break;
			case 2:
				var5 = this.method7682(this.field4133);
				var6 = this.method7682(var4);
				this.method7680(var5, var6);
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "29"
	)
	public void method7670(Clipboard var1) {
		class464 var2 = this.field4119.method9342(this.field4132, this.field4131);
		if (!var2.method9591()) {
			String var3 = var2.method9583();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1205793005"
	)
	public void method7651(Clipboard var1) {
		if (this.method7678()) {
			this.method7670(var1);
			this.method7631();
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-10"
	)
	public void method7652(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7679((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7631();
				class461 var4 = this.field4119.method9344(var3, this.field4131, this.field4135);
				this.method7718(var4.method9463(), var4.method9463());
				this.method7683();
				this.method7688();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1661045649"
	)
	public void method7867() {
		this.field4139 = Math.max(0, this.field4139 - this.field4119.method9354());
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	public void method7653() {
		int var1 = Math.max(0, this.field4119.method9462() - this.field4138);
		this.field4139 = Math.min(var1, this.field4139 + this.field4119.method9354());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "1936140281"
	)
	public void method7654(class356 var1) {
		this.field4143 = var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)V",
		garbageValue = "1559734327"
	)
	public void method7752(class356 var1) {
		this.field4142 = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "1681487529"
	)
	public class460 method7656() {
		return this.field4119;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "1440991759"
	)
	public class460 method7665() {
		return this.field4127;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lru;",
		garbageValue = "-1439354146"
	)
	public class464 method7658() {
		return this.field4119.method9342(this.field4132, this.field4131);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	public boolean method7826() {
		return this.field4124;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "965187955"
	)
	public boolean method7660() {
		return this.field4125;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1433627925"
	)
	public boolean method7661() {
		return this.method7826() && this.field4128 % 60 < 30;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "498204160"
	)
	public int method7781() {
		return this.field4131;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "980546857"
	)
	public int method7647() {
		return this.field4132;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-85"
	)
	public boolean method7664() {
		return this.field4123;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-105"
	)
	public int method7873() {
		return this.field4122;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2136007985"
	)
	public int method7666() {
		return this.field4139;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2026655740"
	)
	public int method7667() {
		return this.field4119.method9408();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	public int method7758() {
		return this.field4119.method9359();
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	public int method7669() {
		return this.field4136;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-71"
	)
	public int method7659() {
		return this.field4120;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1314775972"
	)
	public void method7748(int var1) {
		this.field4120 = var1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "123493706"
	)
	public int method7672() {
		return this.field4119.method9382();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1938437027"
	)
	public void method7673(int var1) {
		this.field4119.method9362(var1);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "698575575"
	)
	public int method7689() {
		return this.field4130;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1674286448"
	)
	public int method7675() {
		return this.field4119.method9438();
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1854800404"
	)
	public void method7716(int var1) {
		this.field4119.method9338(var1);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	public boolean method7844() {
		return this.method7758() > 1;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method7678() {
		return this.field4132 != this.field4131;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2142577369"
	)
	String method7679(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7645(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lvn;Lvn;I)V",
		garbageValue = "-2123690216"
	)
	void method7680(class555 var1, class555 var2) {
		if ((Integer)var2.field5821 < (Integer)var1.field5821) {
			this.method7718((Integer)var1.field5819, (Integer)var2.field5821);
		} else {
			this.method7718((Integer)var1.field5821, (Integer)var2.field5819);
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)Lvn;",
		garbageValue = "-2025519807"
	)
	class555 method7681(int var1) {
		int var2 = this.field4119.method9437();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7687(this.field4119.method9368(var5 - 1).field5293)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7687(this.field4119.method9368(var5).field5293)) {
				var4 = var5;
				break;
			}
		}

		return new class555(var3, var4);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)Lvn;",
		garbageValue = "1232613773"
	)
	class555 method7682(int var1) {
		int var2 = this.field4119.method9437();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field4119.method9368(var5 - 1).field5293 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field4119.method9368(var5).field5293 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class555(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1158983234"
	)
	boolean method7683() {
		if (!this.method7664()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field4119.method9437() > this.field4136) {
				this.field4119.method9349(this.field4136, this.field4119.method9437());
				var1 = true;
			}

			int var2 = this.method7758();
			int var3;
			if (this.field4119.method9432() > var2) {
				var3 = this.field4119.method9351(0, var2) - 1;
				this.field4119.method9349(var3, this.field4119.method9437());
				var1 = true;
			}

			if (var1) {
				var3 = this.field4131;
				int var4 = this.field4132;
				int var5 = this.field4119.method9437();
				if (this.field4131 > var5) {
					var3 = var5;
				}

				if (this.field4132 > var5) {
					var4 = var5;
				}

				this.method7718(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-66"
	)
	void method7684(int var1, boolean var2) {
		if (var2) {
			this.method7718(this.field4132, var1);
		} else {
			this.method7718(var1, var1);
		}

	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1639027262"
	)
	int method7646() {
		return this.field4138 / this.field4119.method9354();
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "946217729"
	)
	void method7861() {
		class464 var1 = this.field4119.method9342(0, this.field4131);
		class555 var2 = var1.method9589();
		int var3 = this.field4119.method9354();
		int var4 = (Integer)var2.field5821 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5819 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field4122;
		int var9 = var8 + this.field4137;
		int var10 = this.field4139;
		int var11 = var10 + this.field4138;
		int var12 = this.field4122;
		int var13 = this.field4139;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field4137;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field4138;
		}

		this.method7811(var12, var13);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1881645652"
	)
	boolean method7687(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-186200641"
	)
	void method7688() {
		if (this.field4143 != null) {
			this.field4143.vmethod7479();
		}

	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "13897"
	)
	boolean method7645(int var1) {
		switch(this.field4130) {
		case 1:
			return class292.isAlphaNumeric((char)var1);
		case 2:
			return WorldMapLabel.isCharAlphabetic((char)var1);
		case 3:
			return class177.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class177.isDigit(var2)) {
				return true;
			} else {
				if (var2 != 'k' && var2 != 'K' && var2 != 'm' && var2 != 'M' && var2 != 'b' && var2 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)Lvn;",
		garbageValue = "-1306234141"
	)
	class555 method7690() {
		int var1 = this.field4119.method9364(this.field4137);
		int var2 = this.field4119.method9365(this.field4138);
		return new class555(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1214939338"
	)
	public static void method7886() {
		class190.field2023.clear();
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1945914705"
	)
	static int method7887(int var0, Script var1, boolean var2) {
		return 2;
	}
}
