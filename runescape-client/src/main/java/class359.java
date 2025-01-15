import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class359 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	class436 field3850;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	class436 field3829;
	@ObfuscatedName("aw")
	boolean field3844;
	@ObfuscatedName("ai")
	boolean field3835;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -741942325
	)
	int field3836;
	@ObfuscatedName("am")
	boolean field3834;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2059293545
	)
	int field3833;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 425299993
	)
	int field3839;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1649693963
	)
	int field3840;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -455222829
	)
	int field3841;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1797435683
	)
	int field3842;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1357046699
	)
	int field3843;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -699182233
	)
	int field3838;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1889856721
	)
	int field3845;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 181061069
	)
	int field3846;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2091447531
	)
	int field3823;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -682041293
	)
	int field3848;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -170108995
	)
	int field3849;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2005463583
	)
	int field3824;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class351 field3851;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class351 field3852;

	class359() {
		this.field3850 = new class436();
		this.field3829 = new class436();
		this.field3844 = false;
		this.field3835 = true;
		this.field3836 = 0;
		this.field3834 = false;
		this.field3833 = 0;
		this.field3839 = 0;
		this.field3840 = 0;
		this.field3841 = 0;
		this.field3842 = 0;
		this.field3843 = 0;
		this.field3838 = 0;
		this.field3845 = Integer.MAX_VALUE;
		this.field3846 = Integer.MAX_VALUE;
		this.field3823 = 0;
		this.field3848 = 0;
		this.field3849 = 0;
		this.field3824 = 0;
		this.field3850.method8602(1);
		this.field3829.method8602(1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779052711"
	)
	void method7315() {
		this.field3836 = (this.field3836 + 1) % 60;
		if (this.field3838 > 0) {
			--this.field3838;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "16"
	)
	public boolean method7129(boolean var1) {
		var1 = var1 && this.field3835;
		boolean var2 = this.field3844 != var1;
		this.field3844 = var1;
		if (!this.field3844) {
			this.method7285(this.field3841, this.field3841);
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1592935546"
	)
	public void method7128(boolean var1) {
		this.field3835 = var1;
		this.field3844 = var1 && this.field3844;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-223717769"
	)
	public boolean method7131(String var1) {
		String var2 = this.field3850.method8533();
		if (!var2.equals(var1)) {
			var1 = this.method7197(var1);
			this.field3850.method8545(var1);
			this.method7285(this.field3842, this.field3841);
			this.method7138(this.field3849, this.field3824);
			this.method7236();
			this.method7206();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1585388802"
	)
	boolean method7298(String var1) {
		this.field3829.method8545(var1);
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)Z",
		garbageValue = "1527867212"
	)
	boolean method7242(AbstractFont var1) {
		boolean var2 = !this.field3834;
		this.field3850.method8663(var1);
		this.field3829.method8663(var1);
		this.field3834 = true;
		var2 |= this.method7138(this.field3849, this.field3824);
		var2 |= this.method7285(this.field3842, this.field3841);
		if (this.method7236()) {
			this.method7206();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-6"
	)
	public boolean method7134(int var1, int var2) {
		boolean var3 = this.field3823 != var1 || var2 != this.field3848;
		this.field3823 = var1;
		this.field3848 = var2;
		var3 |= this.method7138(this.field3849, this.field3824);
		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "407542733"
	)
	public boolean method7212(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3850.method8627();
		this.field3850.method8534(var1);
		this.field3829.method8534(var1);
		if (this.method7236()) {
			this.method7206();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1982663663"
	)
	public boolean method7136(int var1) {
		this.field3850.method8662(var1);
		if (this.method7236()) {
			this.method7206();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "119134741"
	)
	public boolean method7379(int var1) {
		this.field3846 = var1;
		if (this.method7236()) {
			this.method7206();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "58"
	)
	public boolean method7138(int var1, int var2) {
		if (!this.method7276()) {
			this.field3849 = var1;
			this.field3824 = var2;
			return false;
		} else {
			int var3 = this.field3849;
			int var4 = this.field3824;
			int var5 = Math.max(0, this.field3850.method8535() - this.field3823 + 2);
			int var6 = Math.max(0, this.field3850.method8555() - this.field3848 + 1);
			this.field3849 = Math.max(0, Math.min(var5, var1));
			this.field3824 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3849 || var4 != this.field3824;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	public boolean method7345(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3850.method8539(var1, var2) : false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	public void method7311(int var1) {
		this.field3850.method8540(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "341938854"
	)
	public void method7141(int var1) {
		this.field3833 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	public void method7142(int var1) {
		this.field3850.method8602(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "863388330"
	)
	public void method7143(int var1) {
		this.field3850.method8581(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1302974713"
	)
	public boolean method7144(int var1) {
		this.field3840 = var1;
		String var2 = this.field3850.method8533();
		int var3 = var2.length();
		var2 = this.method7197(var2);
		if (var2.length() != var3) {
			this.field3850.method8545(var2);
			this.method7138(this.field3849, this.field3824);
			this.method7236();
			this.method7206();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1952270718"
	)
	public void method7145() {
		this.field3834 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "801820776"
	)
	public boolean method7146(int var1) {
		if (this.method7207(var1)) {
			this.method7151();
			class437 var2 = this.field3850.method8543((char)var1, this.field3841, this.field3845);
			this.method7285(var2.method8668(), var2.method8668());
			this.method7236();
			this.method7206();
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1533053203"
	)
	public void method7228() {
		if (!this.method7151() && this.field3841 > 0) {
			int var1 = this.field3850.method8547(this.field3841 - 1);
			this.method7206();
			this.method7285(var1, var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	public void method7281() {
		if (!this.method7151() && this.field3841 < this.field3850.method8532()) {
			int var1 = this.field3850.method8547(this.field3841);
			this.method7206();
			this.method7285(var1, var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366873260"
	)
	public void method7201() {
		if (!this.method7151() && this.field3841 > 0) {
			class527 var1 = this.method7199(this.field3841 - 1);
			int var2 = this.field3850.method8548((Integer)var1.field5326, this.field3841);
			this.method7206();
			this.method7285(var2, var2);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	public void method7150() {
		if (!this.method7151() && this.field3841 < this.field3850.method8532()) {
			class527 var1 = this.method7199(this.field3841);
			int var2 = this.field3850.method8548(this.field3841, (Integer)var1.field5327);
			this.method7206();
			this.method7285(var2, var2);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1917012645"
	)
	boolean method7151() {
		if (!this.method7196()) {
			return false;
		} else {
			int var1 = this.field3850.method8548(this.field3842, this.field3841);
			this.method7206();
			this.method7285(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	public void method7152() {
		this.method7285(0, this.field3850.method8532());
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-14268"
	)
	public boolean method7285(int var1, int var2) {
		if (!this.method7276()) {
			this.field3842 = var1;
			this.field3841 = var2;
			return false;
		} else {
			if (var1 > this.field3850.method8532()) {
				var1 = this.field3850.method8532();
			}

			if (var2 > this.field3850.method8532()) {
				var2 = this.field3850.method8532();
			}

			boolean var3 = this.field3842 != var1 || var2 != this.field3841;
			this.field3842 = var1;
			if (var2 != this.field3841) {
				this.field3841 = var2;
				this.field3836 = 0;
				this.method7204();
			}

			if (var3 && this.field3852 != null) {
				this.field3852.vmethod7020();
			}

			return var3;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "130295381"
	)
	public void method7332(boolean var1) {
		class527 var2 = this.method7200(this.field3841);
		this.method7202((Integer)var2.field5326, var1);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1558820978"
	)
	public void method7155(boolean var1) {
		class527 var2 = this.method7200(this.field3841);
		this.method7202((Integer)var2.field5327, var1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-276372919"
	)
	public void method7290(boolean var1) {
		this.method7202(0, var1);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "8"
	)
	public void method7137(boolean var1) {
		this.method7202(this.field3850.method8532(), var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-31"
	)
	public void method7220(boolean var1) {
		if (this.method7196() && !var1) {
			this.method7202(Math.min(this.field3842, this.field3841), var1);
		} else if (this.field3841 > 0) {
			this.method7202(this.field3841 - 1, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "4651"
	)
	public void method7194(boolean var1) {
		if (this.method7196() && !var1) {
			this.method7202(Math.max(this.field3842, this.field3841), var1);
		} else if (this.field3841 < this.field3850.method8532()) {
			this.method7202(this.field3841 + 1, var1);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1318482631"
	)
	public void method7160(boolean var1) {
		if (this.field3841 > 0) {
			class527 var2 = this.method7199(this.field3841 - 1);
			this.method7202((Integer)var2.field5326, var1);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1104639542"
	)
	public void method7161(boolean var1) {
		if (this.field3841 < this.field3850.method8532()) {
			class527 var2 = this.method7199(this.field3841 + 1);
			this.method7202((Integer)var2.field5327, var1);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1651896224"
	)
	public void method7162(boolean var1) {
		if (this.field3841 > 0) {
			this.method7202(this.field3850.method8603(this.field3841, -1), var1);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1741633644"
	)
	public void method7163(boolean var1) {
		if (this.field3841 < this.field3850.method8532()) {
			this.method7202(this.field3850.method8603(this.field3841, 1), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2113041042"
	)
	public void method7164(boolean var1) {
		if (this.field3841 > 0) {
			int var2 = this.method7203();
			this.method7202(this.field3850.method8603(this.field3841, -var2), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1616171133"
	)
	public void method7165(boolean var1) {
		if (this.field3841 < this.field3850.method8532()) {
			int var2 = this.method7203();
			this.method7202(this.field3850.method8603(this.field3841, var2), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "373836384"
	)
	public void method7166(boolean var1) {
		class440 var2 = this.field3850.method8629(0, this.field3841);
		class527 var3 = var2.method8792();
		this.method7202(this.field3850.method8549((Integer)var3.field5326, this.field3824), var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "830330005"
	)
	public void method7260(boolean var1) {
		class440 var2 = this.field3850.method8629(0, this.field3841);
		class527 var3 = var2.method8792();
		this.method7202(this.field3850.method8549((Integer)var3.field5326, this.field3848 + this.field3824), var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "40"
	)
	public void method7317(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class527 var6;
		int var8;
		if (!this.field3834) {
			var8 = 0;
		} else {
			var1 += this.field3849;
			var2 += this.field3824;
			var6 = this.method7208();
			var8 = this.field3850.method8549(var1 - (Integer)var6.field5326, var2 - (Integer)var6.field5327);
		}

		if (var3 && var4) {
			this.field3839 = 1;
			var6 = this.method7199(var8);
			class527 var7 = this.method7199(this.field3843);
			this.method7133(var7, var6);
		} else if (var3) {
			this.field3839 = 1;
			var6 = this.method7199(var8);
			this.method7285((Integer)var6.field5326, (Integer)var6.field5327);
			this.field3843 = (Integer)var6.field5326;
		} else if (var4) {
			this.method7285(this.field3843, var8);
		} else {
			if (this.field3838 > 0 && var8 == this.field3843) {
				if (this.field3842 == this.field3841) {
					this.field3839 = 1;
					var6 = this.method7199(var8);
					this.method7285((Integer)var6.field5326, (Integer)var6.field5327);
				} else {
					this.field3839 = 2;
					var6 = this.method7200(var8);
					this.method7285((Integer)var6.field5326, (Integer)var6.field5327);
				}
			} else {
				this.field3839 = 0;
				this.method7285(var8, var8);
				this.field3843 = var8;
			}

			this.field3838 = 25;
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-103"
	)
	public void method7169(int var1, int var2) {
		if (this.field3834 && this.method7221()) {
			var1 += this.field3849;
			var2 += this.field3824;
			class527 var3 = this.method7208();
			int var4 = this.field3850.method8549(var1 - (Integer)var3.field5326, var2 - (Integer)var3.field5327);
			class527 var5;
			class527 var6;
			switch(this.field3839) {
			case 0:
				this.method7285(this.field3842, var4);
				break;
			case 1:
				var5 = this.method7199(this.field3843);
				var6 = this.method7199(var4);
				this.method7133(var5, var6);
				break;
			case 2:
				var5 = this.method7200(this.field3843);
				var6 = this.method7200(var4);
				this.method7133(var5, var6);
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-579443652"
	)
	public void method7170(Clipboard var1) {
		class440 var2 = this.field3850.method8629(this.field3842, this.field3841);
		if (!var2.method8788()) {
			String var3 = var2.method8809();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "0"
	)
	public void method7171(Clipboard var1) {
		if (this.method7196()) {
			this.method7170(var1);
			this.method7151();
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "290156297"
	)
	public void method7172(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7197((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7151();
				class437 var4 = this.field3850.method8601(var3, this.field3841, this.field3845);
				this.method7285(var4.method8668(), var4.method8668());
				this.method7236();
				this.method7206();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	public void method7173() {
		this.field3824 = Math.max(0, this.field3824 - this.field3850.method8552());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1933317560"
	)
	public void method7174() {
		int var1 = Math.max(0, this.field3850.method8555() - this.field3848);
		this.field3824 = Math.min(var1, this.field3824 + this.field3850.method8552());
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "68"
	)
	public void method7175(class351 var1) {
		this.field3851 = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "110"
	)
	public void method7176(class351 var1) {
		this.field3852 = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "7"
	)
	public class436 method7331() {
		return this.field3850;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "1"
	)
	public class436 method7363() {
		return this.field3829;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lqk;",
		garbageValue = "688799447"
	)
	public class440 method7179() {
		return this.field3850.method8629(this.field3842, this.field3841);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
	)
	public boolean method7221() {
		return this.field3844;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "618604110"
	)
	public boolean method7181() {
		return this.field3835;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1666922979"
	)
	public boolean method7182() {
		return this.method7221() && this.field3836 % 60 < 30;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1412363426"
	)
	public int method7259() {
		return this.field3841;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	public int method7184() {
		return this.field3842;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-946540333"
	)
	public boolean method7276() {
		return this.field3834;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	public int method7167() {
		return this.field3849;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7187() {
		return this.field3824;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	public int method7188() {
		return this.field3850.method8627();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "773127273"
	)
	public int method7189() {
		return this.field3850.method8556();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1032306936"
	)
	public int method7190() {
		return this.field3846;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int method7191() {
		return this.field3833;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "102709807"
	)
	public int method7157() {
		return this.field3850.method8553();
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1000"
	)
	public int method7193() {
		return this.field3840;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1831508539"
	)
	public int method7371() {
		return this.field3850.method8536();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "932495240"
	)
	public boolean method7195() {
		return this.method7189() > 1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1394085711"
	)
	boolean method7196() {
		return this.field3841 != this.field3842;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-826053742"
	)
	String method7197(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7207(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lug;Lug;B)V",
		garbageValue = "-6"
	)
	void method7133(class527 var1, class527 var2) {
		if ((Integer)var2.field5326 < (Integer)var1.field5326) {
			this.method7285((Integer)var1.field5327, (Integer)var2.field5326);
		} else {
			this.method7285((Integer)var1.field5326, (Integer)var2.field5327);
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IB)Lug;",
		garbageValue = "16"
	)
	class527 method7199(int var1) {
		int var2 = this.field3850.method8532();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7205(this.field3850.method8528(var5 - 1).field4824)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7205(this.field3850.method8528(var5).field4824)) {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)Lug;",
		garbageValue = "-109"
	)
	class527 method7200(int var1) {
		int var2 = this.field3850.method8532();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3850.method8528(var5 - 1).field4824 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3850.method8528(var5).field4824 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class527(var3, var4);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2135983083"
	)
	boolean method7236() {
		if (!this.method7276()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3850.method8532() > this.field3846) {
				this.field3850.method8548(this.field3846, this.field3850.method8532());
				var1 = true;
			}

			int var2 = this.method7189();
			int var3;
			if (this.field3850.method8530() > var2) {
				var3 = this.field3850.method8603(0, var2) - 1;
				this.field3850.method8548(var3, this.field3850.method8532());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3841;
				int var4 = this.field3842;
				int var5 = this.field3850.method8532();
				if (this.field3841 > var5) {
					var3 = var5;
				}

				if (this.field3842 > var5) {
					var4 = var5;
				}

				this.method7285(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1767877734"
	)
	void method7202(int var1, boolean var2) {
		if (var2) {
			this.method7285(this.field3842, var1);
		} else {
			this.method7285(var1, var1);
		}

	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1247723734"
	)
	int method7203() {
		return this.field3848 / this.field3850.method8552();
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1584174140"
	)
	void method7204() {
		class440 var1 = this.field3850.method8629(0, this.field3841);
		class527 var2 = var1.method8792();
		int var3 = this.field3850.method8552();
		int var4 = (Integer)var2.field5326 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5327 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3849;
		int var9 = var8 + this.field3823;
		int var10 = this.field3824;
		int var11 = var10 + this.field3848;
		int var12 = this.field3849;
		int var13 = this.field3824;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3823;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3848;
		}

		this.method7138(var12, var13);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1592153882"
	)
	boolean method7205(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "540972933"
	)
	void method7206() {
		if (this.field3851 != null) {
			this.field3851.vmethod7020();
		}

	}

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-93"
	)
	boolean method7207(int var1) {
		switch(this.field3840) {
		case 1:
			return WorldEntityCoord.isAlphaNumeric((char)var1);
		case 2:
			return class167.isCharAlphabetic((char)var1);
		case 3:
			return Huffman.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (Huffman.isDigit(var2)) {
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

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)Lug;",
		garbageValue = "2041424888"
	)
	class527 method7208() {
		int var1 = this.field3850.method8559(this.field3823);
		int var2 = this.field3850.method8560(this.field3848);
		return new class527(var1, var2);
	}
}
