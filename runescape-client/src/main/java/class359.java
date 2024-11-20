import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public class class359 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class436 field3838;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class436 field3824;
	@ObfuscatedName("ad")
	boolean field3825;
	@ObfuscatedName("ay")
	boolean field3823;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1115098701
	)
	int field3827;
	@ObfuscatedName("aa")
	boolean field3828;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 685642501
	)
	int field3834;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1719927357
	)
	int field3830;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1863654861
	)
	int field3831;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -609335495
	)
	int field3832;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1656809823
	)
	int field3839;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 578313231
	)
	int field3826;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1117288253
	)
	int field3820;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2035976989
	)
	int field3836;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 809248193
	)
	int field3837;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1368159229
	)
	int field3833;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 240387129
	)
	int field3843;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 285449385
	)
	int field3835;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -984624167
	)
	int field3841;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class351 field3842;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class351 field3829;

	class359() {
		this.field3838 = new class436();
		this.field3824 = new class436();
		this.field3825 = false;
		this.field3823 = true;
		this.field3827 = 0;
		this.field3828 = false;
		this.field3834 = 0;
		this.field3830 = 0;
		this.field3831 = 0;
		this.field3832 = 0;
		this.field3839 = 0;
		this.field3826 = 0;
		this.field3820 = 0;
		this.field3836 = Integer.MAX_VALUE;
		this.field3837 = Integer.MAX_VALUE;
		this.field3833 = 0;
		this.field3843 = 0;
		this.field3835 = 0;
		this.field3841 = 0;
		this.field3838.method8478(1);
		this.field3824.method8478(1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1024"
	)
	void method6978() {
		this.field3827 = (this.field3827 + 1) % 60;
		if (this.field3820 > 0) {
			--this.field3820;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-67"
	)
	public boolean method7057(boolean var1) {
		var1 = var1 && this.field3823;
		boolean var2 = this.field3825 != var1;
		this.field3825 = var1;
		if (!this.field3825) {
			this.method7003(this.field3832, this.field3832);
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1965915111"
	)
	public void method6980(boolean var1) {
		this.field3823 = var1;
		this.field3825 = var1 && this.field3825;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1581384920"
	)
	public boolean method6981(String var1) {
		String var2 = this.field3838.method8383();
		if (!var2.equals(var1)) {
			var1 = this.method7144(var1);
			this.field3838.method8395(var1);
			this.method7003(this.field3839, this.field3832);
			this.method7114(this.field3835, this.field3841);
			this.method7137();
			this.method7056();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "70"
	)
	boolean method7199(String var1) {
		this.field3824.method8395(var1);
		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)Z",
		garbageValue = "-921045271"
	)
	boolean method7128(AbstractFont var1) {
		boolean var2 = !this.field3828;
		this.field3838.method8387(var1);
		this.field3824.method8387(var1);
		this.field3828 = true;
		var2 |= this.method7114(this.field3835, this.field3841);
		var2 |= this.method7003(this.field3839, this.field3832);
		if (this.method7137()) {
			this.method7056();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1115998579"
	)
	public boolean method6984(int var1, int var2) {
		boolean var3 = this.field3833 != var1 || var2 != this.field3843;
		this.field3833 = var1;
		this.field3843 = var2;
		var3 |= this.method7114(this.field3835, this.field3841);
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "2"
	)
	public boolean method6985(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3838.method8406();
		this.field3838.method8384(var1);
		this.field3824.method8384(var1);
		if (this.method7137()) {
			this.method7056();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "46986933"
	)
	public boolean method6986(int var1) {
		this.field3838.method8507(var1);
		if (this.method7137()) {
			this.method7056();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "465417059"
	)
	public boolean method6987(int var1) {
		this.field3837 = var1;
		if (this.method7137()) {
			this.method7056();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "2"
	)
	public boolean method7114(int var1, int var2) {
		if (!this.method7035()) {
			this.field3835 = var1;
			this.field3841 = var2;
			return false;
		} else {
			int var3 = this.field3835;
			int var4 = this.field3841;
			int var5 = Math.max(0, this.field3838.method8401() - this.field3833 + 2);
			int var6 = Math.max(0, this.field3838.method8402() - this.field3843 + 1);
			this.field3835 = Math.max(0, Math.min(var5, var1));
			this.field3841 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3835 || var4 != this.field3841;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "43"
	)
	public boolean method6989(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3838.method8389(var1, var2) : false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method6992(int var1) {
		this.field3838.method8390(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	public void method7103(int var1) {
		this.field3834 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "392077657"
	)
	public void method6979(int var1) {
		this.field3838.method8478(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "458728828"
	)
	public void method6993(int var1) {
		this.field3838.method8386(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "75"
	)
	public boolean method6994(int var1) {
		this.field3831 = var1;
		String var2 = this.field3838.method8383();
		int var3 = var2.length();
		var2 = this.method7144(var2);
		if (var2.length() != var3) {
			this.field3838.method8395(var2);
			this.method7114(this.field3835, this.field3841);
			this.method7137();
			this.method7056();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15410114"
	)
	public void method7106() {
		this.field3828 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "78"
	)
	public boolean method6996(int var1) {
		if (this.method7189(var1)) {
			this.method7116();
			class437 var2 = this.field3838.method8392((char)var1, this.field3832, this.field3836);
			this.method7003(var2.method8522(), var2.method8522());
			this.method7137();
			this.method7056();
		}

		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1084835512"
	)
	public void method6997() {
		if (!this.method7116() && this.field3832 > 0) {
			int var1 = this.field3838.method8397(this.field3832 - 1);
			this.method7056();
			this.method7003(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1586778374"
	)
	public void method6998() {
		if (!this.method7116() && this.field3832 < this.field3838.method8382()) {
			int var1 = this.field3838.method8397(this.field3832);
			this.method7056();
			this.method7003(var1, var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public void method6999() {
		if (!this.method7116() && this.field3832 > 0) {
			class527 var1 = this.method7049(this.field3832 - 1);
			int var2 = this.field3838.method8398((Integer)var1.field5325, this.field3832);
			this.method7056();
			this.method7003(var2, var2);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	public void method7031() {
		if (!this.method7116() && this.field3832 < this.field3838.method8382()) {
			class527 var1 = this.method7049(this.field3832);
			int var2 = this.field3838.method8398(this.field3832, (Integer)var1.field5323);
			this.method7056();
			this.method7003(var2, var2);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1488105351"
	)
	boolean method7116() {
		if (!this.method7115()) {
			return false;
		} else {
			int var1 = this.field3838.method8398(this.field3839, this.field3832);
			this.method7056();
			this.method7003(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public void method7081() {
		this.method7003(0, this.field3838.method8382());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2110357042"
	)
	public boolean method7003(int var1, int var2) {
		if (!this.method7035()) {
			this.field3839 = var1;
			this.field3832 = var2;
			return false;
		} else {
			if (var1 > this.field3838.method8382()) {
				var1 = this.field3838.method8382();
			}

			if (var2 > this.field3838.method8382()) {
				var2 = this.field3838.method8382();
			}

			boolean var3 = this.field3839 != var1 || var2 != this.field3832;
			this.field3839 = var1;
			if (var2 != this.field3832) {
				this.field3832 = var2;
				this.field3827 = 0;
				this.method7054();
			}

			if (var3 && this.field3829 != null) {
				this.field3829.vmethod6864();
			}

			return var3;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-10020"
	)
	public void method7004(boolean var1) {
		class527 var2 = this.method7065(this.field3832);
		this.method7052((Integer)var2.field5325, var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "65"
	)
	public void method7005(boolean var1) {
		class527 var2 = this.method7065(this.field3832);
		this.method7052((Integer)var2.field5323, var1);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "723632929"
	)
	public void method7006(boolean var1) {
		this.method7052(0, var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method7041(boolean var1) {
		this.method7052(this.field3838.method8382(), var1);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "99"
	)
	public void method7008(boolean var1) {
		if (this.method7115() && !var1) {
			this.method7052(Math.min(this.field3839, this.field3832), var1);
		} else if (this.field3832 > 0) {
			this.method7052(this.field3832 - 1, var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	public void method7078(boolean var1) {
		if (this.method7115() && !var1) {
			this.method7052(Math.max(this.field3839, this.field3832), var1);
		} else if (this.field3832 < this.field3838.method8382()) {
			this.method7052(this.field3832 + 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1039985937"
	)
	public void method7178(boolean var1) {
		if (this.field3832 > 0) {
			class527 var2 = this.method7049(this.field3832 - 1);
			this.method7052((Integer)var2.field5325, var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "118"
	)
	public void method7165(boolean var1) {
		if (this.field3832 < this.field3838.method8382()) {
			class527 var2 = this.method7049(this.field3832 + 1);
			this.method7052((Integer)var2.field5323, var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "67"
	)
	public void method7012(boolean var1) {
		if (this.field3832 > 0) {
			this.method7052(this.field3838.method8428(this.field3832, -1), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-734418958"
	)
	public void method7013(boolean var1) {
		if (this.field3832 < this.field3838.method8382()) {
			this.method7052(this.field3838.method8428(this.field3832, 1), var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "25958"
	)
	public void method7014(boolean var1) {
		if (this.field3832 > 0) {
			int var2 = this.method7053();
			this.method7052(this.field3838.method8428(this.field3832, -var2), var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "16"
	)
	public void method7146(boolean var1) {
		if (this.field3832 < this.field3838.method8382()) {
			int var2 = this.method7053();
			this.method7052(this.field3838.method8428(this.field3832, var2), var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2055501996"
	)
	public void method7016(boolean var1) {
		class440 var2 = this.field3838.method8391(0, this.field3832);
		class527 var3 = var2.method8661();
		this.method7052(this.field3838.method8407((Integer)var3.field5325, this.field3841), var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1280538952"
	)
	public void method7017(boolean var1) {
		class440 var2 = this.field3838.method8391(0, this.field3832);
		class527 var3 = var2.method8661();
		this.method7052(this.field3838.method8407((Integer)var3.field5325, this.field3841 + this.field3843), var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "855978780"
	)
	public void method7029(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class527 var6;
		int var8;
		if (!this.field3828) {
			var8 = 0;
		} else {
			var1 += this.field3835;
			var2 += this.field3841;
			var6 = this.method7201();
			var8 = this.field3838.method8407(var1 - (Integer)var6.field5325, var2 - (Integer)var6.field5323);
		}

		if (var3 && var4) {
			this.field3830 = 1;
			var6 = this.method7049(var8);
			class527 var7 = this.method7049(this.field3826);
			this.method7048(var7, var6);
		} else if (var3) {
			this.field3830 = 1;
			var6 = this.method7049(var8);
			this.method7003((Integer)var6.field5325, (Integer)var6.field5323);
			this.field3826 = (Integer)var6.field5325;
		} else if (var4) {
			this.method7003(this.field3826, var8);
		} else {
			if (this.field3820 > 0 && var8 == this.field3826) {
				if (this.field3839 == this.field3832) {
					this.field3830 = 1;
					var6 = this.method7049(var8);
					this.method7003((Integer)var6.field5325, (Integer)var6.field5323);
				} else {
					this.field3830 = 2;
					var6 = this.method7065(var8);
					this.method7003((Integer)var6.field5325, (Integer)var6.field5323);
				}
			} else {
				this.field3830 = 0;
				this.method7003(var8, var8);
				this.field3826 = var8;
			}

			this.field3820 = 25;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1052028233"
	)
	public void method7019(int var1, int var2) {
		if (this.field3828 && this.method7030()) {
			var1 += this.field3835;
			var2 += this.field3841;
			class527 var3 = this.method7201();
			int var4 = this.field3838.method8407(var1 - (Integer)var3.field5325, var2 - (Integer)var3.field5323);
			class527 var5;
			class527 var6;
			switch(this.field3830) {
			case 0:
				this.method7003(this.field3839, var4);
				break;
			case 1:
				var5 = this.method7049(this.field3826);
				var6 = this.method7049(var4);
				this.method7048(var5, var6);
				break;
			case 2:
				var5 = this.method7065(this.field3826);
				var6 = this.method7065(var4);
				this.method7048(var5, var6);
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1133636675"
	)
	public void method7020(Clipboard var1) {
		class440 var2 = this.field3838.method8391(this.field3839, this.field3832);
		if (!var2.method8652()) {
			String var3 = var2.method8643();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2136771131"
	)
	public void method7068(Clipboard var1) {
		if (this.method7115()) {
			this.method7020(var1);
			this.method7116();
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-648109303"
	)
	public void method7202(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7144((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7116();
				class437 var4 = this.field3838.method8393(var3, this.field3832, this.field3836);
				this.method7003(var4.method8522(), var4.method8522());
				this.method7137();
				this.method7056();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1367289660"
	)
	public void method7021() {
		this.field3841 = Math.max(0, this.field3841 - this.field3838.method8432());
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1271182999"
	)
	public void method7024() {
		int var1 = Math.max(0, this.field3838.method8402() - this.field3843);
		this.field3841 = Math.min(var1, this.field3841 + this.field3838.method8432());
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "1618170888"
	)
	public void method7025(class351 var1) {
		this.field3842 = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-2137729761"
	)
	public void method7026(class351 var1) {
		this.field3829 = var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lqj;",
		garbageValue = "76"
	)
	public class436 method7216() {
		return this.field3838;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "565732990"
	)
	public class436 method7028() {
		return this.field3824;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "828485903"
	)
	public class440 method6977() {
		return this.field3838.method8391(this.field3839, this.field3832);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1786859550"
	)
	public boolean method7030() {
		return this.field3825;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1390057579"
	)
	public boolean method7139() {
		return this.field3823;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "96"
	)
	public boolean method7032() {
		return this.method7030() && this.field3827 % 60 < 30;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-284785976"
	)
	public int method7033() {
		return this.field3832;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1097057175"
	)
	public int method7104() {
		return this.field3839;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1099063334"
	)
	public boolean method7035() {
		return this.field3828;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1874888538"
	)
	public int method7179() {
		return this.field3835;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	public int method7037() {
		return this.field3841;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1066346447"
	)
	public int method7038() {
		return this.field3838.method8406();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1971035176"
	)
	public int method7039() {
		return this.field3838.method8517();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1546339694"
	)
	public int method7040() {
		return this.field3837;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-200329593"
	)
	public int method7015() {
		return this.field3834;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	public int method7042() {
		return this.field3838.method8408();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	public int method7043() {
		return this.field3831;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1881163197"
	)
	public int method7044() {
		return this.field3838.method8409();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1171290833"
	)
	public boolean method7045() {
		return this.method7039() > 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "657656730"
	)
	boolean method7115() {
		return this.field3839 != this.field3832;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-68216371"
	)
	String method7144(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7189(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Lup;Lup;B)V",
		garbageValue = "1"
	)
	void method7048(class527 var1, class527 var2) {
		if ((Integer)var2.field5325 < (Integer)var1.field5325) {
			this.method7003((Integer)var1.field5323, (Integer)var2.field5325);
		} else {
			this.method7003((Integer)var1.field5325, (Integer)var2.field5323);
		}

	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Lup;",
		garbageValue = "79836296"
	)
	class527 method7049(int var1) {
		int var2 = this.field3838.method8382();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7055(this.field3838.method8378(var5 - 1).field4825)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7055(this.field3838.method8378(var5).field4825)) {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Lup;",
		garbageValue = "2007936120"
	)
	class527 method7065(int var1) {
		int var2 = this.field3838.method8382();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3838.method8378(var5 - 1).field4825 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3838.method8378(var5).field4825 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1760721309"
	)
	boolean method7137() {
		if (!this.method7035()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3838.method8382() > this.field3837) {
				this.field3838.method8398(this.field3837, this.field3838.method8382());
				var1 = true;
			}

			int var2 = this.method7039();
			int var3;
			if (this.field3838.method8461() > var2) {
				var3 = this.field3838.method8428(0, var2) - 1;
				this.field3838.method8398(var3, this.field3838.method8382());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3832;
				int var4 = this.field3839;
				int var5 = this.field3838.method8382();
				if (this.field3832 > var5) {
					var3 = var5;
				}

				if (this.field3839 > var5) {
					var4 = var5;
				}

				this.method7003(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "708872715"
	)
	void method7052(int var1, boolean var2) {
		if (var2) {
			this.method7003(this.field3839, var1);
		} else {
			this.method7003(var1, var1);
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	int method7053() {
		return this.field3843 / this.field3838.method8432();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	void method7054() {
		class440 var1 = this.field3838.method8391(0, this.field3832);
		class527 var2 = var1.method8661();
		int var3 = this.field3838.method8432();
		int var4 = (Integer)var2.field5325 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5323 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3835;
		int var9 = var8 + this.field3833;
		int var10 = this.field3841;
		int var11 = var10 + this.field3843;
		int var12 = this.field3835;
		int var13 = this.field3841;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3833;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3843;
		}

		this.method7114(var12, var13);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1892609628"
	)
	boolean method7055(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1885342444"
	)
	void method7056() {
		if (this.field3842 != null) {
			this.field3842.vmethod6864();
		}

	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-59"
	)
	boolean method7189(int var1) {
		switch(this.field3831) {
		case 1:
			return class329.isAlphaNumeric((char)var1);
		case 2:
			return class96.isCharAlphabetic((char)var1);
		case 3:
			return SoundSystem.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (SoundSystem.isDigit(var2)) {
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

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(B)Lup;",
		garbageValue = "91"
	)
	class527 method7201() {
		int var1 = this.field3838.method8399(this.field3833);
		int var2 = this.field3838.method8411(this.field3843);
		return new class527(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-13"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class7.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1523314604"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = Message.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
