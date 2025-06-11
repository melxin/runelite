import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class367 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	class455 field3943;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	class455 field3935;
	@ObfuscatedName("av")
	boolean field3933;
	@ObfuscatedName("ao")
	boolean field3930;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -413217807
	)
	int field3931;
	@ObfuscatedName("ax")
	boolean field3926;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1079495313
	)
	int field3937;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 142900113
	)
	int field3938;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1940174109
	)
	int field3927;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1436928611
	)
	int field3949;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1575115033
	)
	int field3941;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1765707803
	)
	int field3942;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2134121275
	)
	int field3934;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1009254775
	)
	int field3939;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 687514827
	)
	int field3945;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1873479497
	)
	int field3946;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -835445405
	)
	int field3947;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 260151395
	)
	int field3948;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -511517567
	)
	int field3944;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	class359 field3950;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	class359 field3951;

	class367() {
		this.field3943 = new class455();
		this.field3935 = new class455();
		this.field3933 = false;
		this.field3930 = true;
		this.field3931 = 0;
		this.field3926 = false;
		this.field3937 = 0;
		this.field3938 = 0;
		this.field3927 = 0;
		this.field3949 = 0;
		this.field3941 = 0;
		this.field3942 = 0;
		this.field3934 = 0;
		this.field3939 = Integer.MAX_VALUE;
		this.field3945 = Integer.MAX_VALUE;
		this.field3946 = 0;
		this.field3947 = 0;
		this.field3948 = 0;
		this.field3944 = 0;
		this.field3943.method8954(1);
		this.field3935.method8954(1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	void method7400() {
		this.field3931 = (this.field3931 + 1) % 60;
		if (this.field3934 > 0) {
			--this.field3934;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "1"
	)
	public boolean method7515(boolean var1) {
		var1 = var1 && this.field3930;
		boolean var2 = this.field3933 != var1;
		this.field3933 = var1;
		if (!this.field3933) {
			this.method7435(this.field3949, this.field3949);
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2100731413"
	)
	public void method7584(boolean var1) {
		this.field3930 = var1;
		this.field3933 = var1 && this.field3933;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "1"
	)
	public boolean method7462(String var1) {
		String var2 = this.field3943.method9021();
		if (!var2.equals(var1)) {
			var1 = this.method7469(var1);
			this.field3943.method8956(var1);
			this.method7435(this.field3941, this.field3949);
			this.method7410(this.field3948, this.field3944);
			this.method7577();
			this.method7541();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1702902865"
	)
	boolean method7573(String var1) {
		this.field3935.method8956(var1);
		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)Z",
		garbageValue = "-1642228275"
	)
	boolean method7405(AbstractFont var1) {
		boolean var2 = !this.field3926;
		this.field3943.method8949(var1);
		this.field3935.method8949(var1);
		this.field3926 = true;
		var2 |= this.method7410(this.field3948, this.field3944);
		var2 |= this.method7435(this.field3941, this.field3949);
		if (this.method7577()) {
			this.method7541();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1753491469"
	)
	public boolean method7406(int var1, int var2) {
		boolean var3 = this.field3946 != var1 || var2 != this.field3947;
		this.field3946 = var1;
		this.field3947 = var2;
		var3 |= this.method7410(this.field3948, this.field3944);
		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1797318116"
	)
	public boolean method7407(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3943.method8967();
		this.field3943.method9075(var1);
		this.field3935.method9075(var1);
		if (this.method7577()) {
			this.method7541();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-616747997"
	)
	public boolean method7408(int var1) {
		this.field3943.method8950(var1);
		if (this.method7577()) {
			this.method7541();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1239557663"
	)
	public boolean method7409(int var1) {
		this.field3945 = var1;
		if (this.method7577()) {
			this.method7541();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1386554360"
	)
	public boolean method7410(int var1, int var2) {
		if (!this.method7454()) {
			this.field3948 = var1;
			this.field3944 = var2;
			return false;
		} else {
			int var3 = this.field3948;
			int var4 = this.field3944;
			int var5 = Math.max(0, this.field3943.method8962() - this.field3946 + 2);
			int var6 = Math.max(0, this.field3943.method8963() - this.field3947 + 1);
			this.field3948 = Math.max(0, Math.min(var5, var1));
			this.field3944 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3948 || var4 != this.field3944;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2092305030"
	)
	public boolean method7411(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3943.method8942(var1, var2) : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-499799565"
	)
	public void method7412(int var1) {
		this.field3943.method8951(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1834016315"
	)
	public boolean method7413(int var1) {
		this.field3927 = var1;
		String var2 = this.field3943.method9021();
		int var3 = var2.length();
		var2 = this.method7469(var2);
		if (var2.length() != var3) {
			this.field3943.method8956(var2);
			this.method7410(this.field3948, this.field3944);
			this.method7577();
			this.method7541();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	public void method7414() {
		this.field3926 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-588414067"
	)
	public boolean method7415(int var1) {
		if (this.method7479(var1)) {
			this.method7420();
			class456 var2 = this.field3943.method8953((char)var1, this.field3949, this.field3939);
			this.method7435(var2.method9081(), var2.method9081());
			this.method7577();
			this.method7541();
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	public void method7611() {
		if (!this.method7420() && this.field3949 > 0) {
			int var1 = this.field3943.method9045(this.field3949 - 1);
			this.method7541();
			this.method7435(var1, var1);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "73104931"
	)
	public void method7417() {
		if (!this.method7420() && this.field3949 < this.field3943.method8946()) {
			int var1 = this.field3943.method9045(this.field3949);
			this.method7541();
			this.method7435(var1, var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "510585660"
	)
	public void method7418() {
		if (!this.method7420() && this.field3949 > 0) {
			class547 var1 = this.method7471(this.field3949 - 1);
			int var2 = this.field3943.method8959((Integer)var1.field5539, this.field3949);
			this.method7541();
			this.method7435(var2, var2);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "375710087"
	)
	public void method7596() {
		if (!this.method7420() && this.field3949 < this.field3943.method8946()) {
			class547 var1 = this.method7471(this.field3949);
			int var2 = this.field3943.method8959(this.field3949, (Integer)var1.field5538);
			this.method7541();
			this.method7435(var2, var2);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-67"
	)
	boolean method7420() {
		if (!this.method7437()) {
			return false;
		} else {
			int var1 = this.field3943.method8959(this.field3941, this.field3949);
			this.method7541();
			this.method7435(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2141211753"
	)
	public void method7532() {
		this.method7435(0, this.field3943.method8946());
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "491546083"
	)
	public boolean method7435(int var1, int var2) {
		if (!this.method7454()) {
			this.field3941 = var1;
			this.field3949 = var2;
			return false;
		} else {
			if (var1 > this.field3943.method8946()) {
				var1 = this.field3943.method8946();
			}

			if (var2 > this.field3943.method8946()) {
				var2 = this.field3943.method8946();
			}

			boolean var3 = this.field3941 != var1 || var2 != this.field3949;
			this.field3941 = var1;
			if (var2 != this.field3949) {
				this.field3949 = var2;
				this.field3931 = 0;
				this.method7476();
			}

			if (var3 && this.field3951 != null) {
				this.field3951.vmethod7284();
			}

			return var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7423(boolean var1) {
		class547 var2 = this.method7448(this.field3949);
		this.method7620((Integer)var2.field5539, var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "49"
	)
	public void method7576(boolean var1) {
		class547 var2 = this.method7448(this.field3949);
		this.method7620((Integer)var2.field5538, var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2078190668"
	)
	public void method7425(boolean var1) {
		this.method7620(0, var1);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	public void method7426(boolean var1) {
		this.method7620(this.field3943.method8946(), var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-158017368"
	)
	public void method7427(boolean var1) {
		if (this.method7437() && !var1) {
			this.method7620(Math.min(this.field3941, this.field3949), var1);
		} else if (this.field3949 > 0) {
			this.method7620(this.field3949 - 1, var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "974803781"
	)
	public void method7428(boolean var1) {
		if (this.method7437() && !var1) {
			this.method7620(Math.max(this.field3941, this.field3949), var1);
		} else if (this.field3949 < this.field3943.method8946()) {
			this.method7620(this.field3949 + 1, var1);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-96"
	)
	public void method7655(boolean var1) {
		if (this.field3949 > 0) {
			class547 var2 = this.method7471(this.field3949 - 1);
			this.method7620((Integer)var2.field5539, var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "93"
	)
	public void method7430(boolean var1) {
		if (this.field3949 < this.field3943.method8946()) {
			class547 var2 = this.method7471(this.field3949 + 1);
			this.method7620((Integer)var2.field5538, var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "8220"
	)
	public void method7498(boolean var1) {
		if (this.field3949 > 0) {
			this.method7620(this.field3943.method8961(this.field3949, -1), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-766864718"
	)
	public void method7432(boolean var1) {
		if (this.field3949 < this.field3943.method8946()) {
			this.method7620(this.field3943.method8961(this.field3949, 1), var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1664348731"
	)
	public void method7478(boolean var1) {
		if (this.field3949 > 0) {
			int var2 = this.method7475();
			this.method7620(this.field3943.method8961(this.field3949, -var2), var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1189458116"
	)
	public void method7589(boolean var1) {
		if (this.field3949 < this.field3943.method8946()) {
			int var2 = this.method7475();
			this.method7620(this.field3943.method8961(this.field3949, var2), var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-34"
	)
	public void method7685(boolean var1) {
		class459 var2 = this.field3943.method9058(0, this.field3949);
		class547 var3 = var2.method9204();
		this.method7620(this.field3943.method8960((Integer)var3.field5539, this.field3944), var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "636097359"
	)
	public void method7436(boolean var1) {
		class459 var2 = this.field3943.method9058(0, this.field3949);
		class547 var3 = var2.method9204();
		this.method7620(this.field3943.method8960((Integer)var3.field5539, this.field3944 + this.field3947), var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "3"
	)
	public void method7467(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class547 var6;
		int var8;
		if (!this.field3926) {
			var8 = 0;
		} else {
			var1 += this.field3948;
			var2 += this.field3944;
			var6 = this.method7480();
			var8 = this.field3943.method8960(var1 - (Integer)var6.field5539, var2 - (Integer)var6.field5538);
		}

		if (var3 && var4) {
			this.field3938 = 1;
			var6 = this.method7471(var8);
			class547 var7 = this.method7471(this.field3942);
			this.method7470(var7, var6);
		} else if (var3) {
			this.field3938 = 1;
			var6 = this.method7471(var8);
			this.method7435((Integer)var6.field5539, (Integer)var6.field5538);
			this.field3942 = (Integer)var6.field5539;
		} else if (var4) {
			this.method7435(this.field3942, var8);
		} else {
			if (this.field3934 > 0 && var8 == this.field3942) {
				if (this.field3941 == this.field3949) {
					this.field3938 = 1;
					var6 = this.method7471(var8);
					this.method7435((Integer)var6.field5539, (Integer)var6.field5538);
				} else {
					this.field3938 = 2;
					var6 = this.method7448(var8);
					this.method7435((Integer)var6.field5539, (Integer)var6.field5538);
				}
			} else {
				this.field3938 = 0;
				this.method7435(var8, var8);
				this.field3942 = var8;
			}

			this.field3934 = 25;
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "122315677"
	)
	public void method7438(int var1, int var2) {
		if (this.field3926 && this.method7449()) {
			var1 += this.field3948;
			var2 += this.field3944;
			class547 var3 = this.method7480();
			int var4 = this.field3943.method8960(var1 - (Integer)var3.field5539, var2 - (Integer)var3.field5538);
			class547 var5;
			class547 var6;
			switch(this.field3938) {
			case 0:
				this.method7435(this.field3941, var4);
				break;
			case 1:
				var5 = this.method7471(this.field3942);
				var6 = this.method7471(var4);
				this.method7470(var5, var6);
				break;
			case 2:
				var5 = this.method7448(this.field3942);
				var6 = this.method7448(var4);
				this.method7470(var5, var6);
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1474840361"
	)
	public void method7439(Clipboard var1) {
		class459 var2 = this.field3943.method9058(this.field3941, this.field3949);
		if (!var2.method9200()) {
			String var3 = var2.method9215();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-861855548"
	)
	public void method7403(Clipboard var1) {
		if (this.method7437()) {
			this.method7439(var1);
			this.method7420();
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "695037232"
	)
	public void method7619(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7469((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7420();
				class456 var4 = this.field3943.method9028(var3, this.field3949, this.field3939);
				this.method7435(var4.method9081(), var4.method9081());
				this.method7577();
				this.method7541();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "560851405"
	)
	public void method7442() {
		this.field3944 = Math.max(0, this.field3944 - this.field3943.method9036());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "143282957"
	)
	public void method7443() {
		int var1 = Math.max(0, this.field3943.method8963() - this.field3947);
		this.field3944 = Math.min(var1, this.field3944 + this.field3943.method9036());
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "-268200157"
	)
	public void method7444(class359 var1) {
		this.field3950 = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "-18"
	)
	public void method7445(class359 var1) {
		this.field3951 = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lrk;",
		garbageValue = "-1949710914"
	)
	public class455 method7446() {
		return this.field3943;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lrk;",
		garbageValue = "-679100358"
	)
	public class455 method7447() {
		return this.field3935;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "863558138"
	)
	public class459 method7421() {
		return this.field3943.method9058(this.field3941, this.field3949);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-391484751"
	)
	public boolean method7449() {
		return this.field3933;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-549852146"
	)
	public boolean method7450() {
		return this.field3930;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	public boolean method7451() {
		return this.method7449() && this.field3931 % 60 < 30;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2146645496"
	)
	public int method7452() {
		return this.field3949;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "22090"
	)
	public int method7615() {
		return this.field3941;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7454() {
		return this.field3926;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1541480169"
	)
	public int method7559() {
		return this.field3948;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-88"
	)
	public int method7456() {
		return this.field3944;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	public int method7457() {
		return this.field3943.method8967();
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method7458() {
		return this.field3943.method8969();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1936318916"
	)
	public int method7459() {
		return this.field3945;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "7015"
	)
	public int method7617() {
		return this.field3937;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "118"
	)
	public void method7540(int var1) {
		this.field3937 = var1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "88"
	)
	public int method7513() {
		return this.field3943.method8971();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1148713934"
	)
	public void method7463(int var1) {
		this.field3943.method8954(var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1002910562"
	)
	public int method7464() {
		return this.field3927;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1306191244"
	)
	public int method7473() {
		return this.field3943.method8964();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	public void method7466(int var1) {
		this.field3943.method8948(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	public boolean method7570() {
		return this.method7458() > 1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method7437() {
		return this.field3941 != this.field3949;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-8"
	)
	String method7469(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7479(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lvk;Lvk;B)V",
		garbageValue = "54"
	)
	void method7470(class547 var1, class547 var2) {
		if ((Integer)var2.field5539 < (Integer)var1.field5539) {
			this.method7435((Integer)var1.field5538, (Integer)var2.field5539);
		} else {
			this.method7435((Integer)var1.field5539, (Integer)var2.field5538);
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)Lvk;",
		garbageValue = "-741688852"
	)
	class547 method7471(int var1) {
		int var2 = this.field3943.method8946();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7554(this.field3943.method9067(var5 - 1).field5045)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7554(this.field3943.method9067(var5).field5045)) {
				var4 = var5;
				break;
			}
		}

		return new class547(var3, var4);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Lvk;",
		garbageValue = "193062210"
	)
	class547 method7448(int var1) {
		int var2 = this.field3943.method8946();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3943.method9067(var5 - 1).field5045 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3943.method9067(var5).field5045 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class547(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "43093045"
	)
	boolean method7577() {
		if (!this.method7454()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3943.method8946() > this.field3945) {
				this.field3943.method8959(this.field3945, this.field3943.method8946());
				var1 = true;
			}

			int var2 = this.method7458();
			int var3;
			if (this.field3943.method8965() > var2) {
				var3 = this.field3943.method8961(0, var2) - 1;
				this.field3943.method8959(var3, this.field3943.method8946());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3949;
				int var4 = this.field3941;
				int var5 = this.field3943.method8946();
				if (this.field3949 > var5) {
					var3 = var5;
				}

				if (this.field3941 > var5) {
					var4 = var5;
				}

				this.method7435(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "25462484"
	)
	void method7620(int var1, boolean var2) {
		if (var2) {
			this.method7435(this.field3941, var1);
		} else {
			this.method7435(var1, var1);
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133150839"
	)
	int method7475() {
		return this.field3947 / this.field3943.method9036();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3212"
	)
	void method7476() {
		class459 var1 = this.field3943.method9058(0, this.field3949);
		class547 var2 = var1.method9204();
		int var3 = this.field3943.method9036();
		int var4 = (Integer)var2.field5539 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5538 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field3948;
		int var9 = var8 + this.field3946;
		int var10 = this.field3944;
		int var11 = var10 + this.field3947;
		int var12 = this.field3948;
		int var13 = this.field3944;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3946;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3947;
		}

		this.method7410(var12, var13);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-79"
	)
	boolean method7554(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	void method7541() {
		if (this.field3950 != null) {
			this.field3950.vmethod7284();
		}

	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1927082854"
	)
	boolean method7479(int var1) {
		switch(this.field3927) {
		case 1:
			return SoundCache.isAlphaNumeric((char)var1);
		case 2:
			return TaskHandler.isCharAlphabetic((char)var1);
		case 3:
			return class195.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class195.isDigit(var2)) {
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

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(B)Lvk;",
		garbageValue = "-15"
	)
	class547 method7480() {
		int var1 = this.field3943.method8974(this.field3946);
		int var2 = this.field3943.method8991(this.field3947);
		return new class547(var1, var2);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lve;Ljava/lang/Object;B)V",
		garbageValue = "98"
	)
	static void method7650(class563 var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5596) {
			case 0:
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var1;
				break;
			case 3:
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
			}

		}
	}
}
