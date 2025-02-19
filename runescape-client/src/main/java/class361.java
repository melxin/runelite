import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class361 {
	@ObfuscatedName("bc")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field3909;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	class452 field3905;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	class452 field3889;
	@ObfuscatedName("am")
	boolean field3881;
	@ObfuscatedName("aq")
	boolean field3893;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -570166575
	)
	int field3908;
	@ObfuscatedName("an")
	boolean field3886;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1082811105
	)
	int field3894;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2002808435
	)
	int field3895;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 738903361
	)
	int field3896;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -828534379
	)
	int field3890;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -550848931
	)
	int field3892;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 122128277
	)
	int field3885;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 559803159
	)
	int field3900;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -372972099
	)
	int field3901;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -355668689
	)
	int field3898;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -756790201
	)
	int field3903;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1883125719
	)
	int field3904;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 491828433
	)
	int field3899;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2000448647
	)
	int field3906;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	class353 field3907;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	class353 field3902;

	class361() {
		this.field3905 = new class452();
		this.field3889 = new class452();
		this.field3881 = false;
		this.field3893 = true;
		this.field3908 = 0;
		this.field3886 = false;
		this.field3894 = 0;
		this.field3895 = 0;
		this.field3896 = 0;
		this.field3890 = 0;
		this.field3892 = 0;
		this.field3885 = 0;
		this.field3900 = 0;
		this.field3901 = Integer.MAX_VALUE;
		this.field3898 = Integer.MAX_VALUE;
		this.field3903 = 0;
		this.field3904 = 0;
		this.field3899 = 0;
		this.field3906 = 0;
		this.field3905.method8562(1);
		this.field3889.method8562(1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7090() {
		this.field3908 = (this.field3908 + 1) % 60;
		if (this.field3900 > 0) {
			--this.field3900;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "7"
	)
	public boolean method7021(boolean var1) {
		var1 = var1 && this.field3893;
		boolean var2 = this.field3881 != var1;
		this.field3881 = var1;
		if (!this.field3881) {
			this.method7213(this.field3890, this.field3890);
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7022(boolean var1) {
		this.field3893 = var1;
		this.field3881 = var1 && this.field3881;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-26"
	)
	public boolean method7112(String var1) {
		String var2 = this.field3905.method8601();
		if (!var2.equals(var1)) {
			var1 = this.method7091(var1);
			this.field3905.method8674(var1);
			this.method7213(this.field3892, this.field3890);
			this.method7030(this.field3899, this.field3906);
			this.method7263();
			this.method7098();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Z",
		garbageValue = "13345"
	)
	boolean method7052(String var1) {
		this.field3889.method8674(var1);
		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)Z",
		garbageValue = "-1719564172"
	)
	boolean method7025(AbstractFont var1) {
		boolean var2 = !this.field3886;
		this.field3905.method8583(var1);
		this.field3889.method8583(var1);
		this.field3886 = true;
		var2 |= this.method7030(this.field3899, this.field3906);
		var2 |= this.method7213(this.field3892, this.field3890);
		if (this.method7263()) {
			this.method7098();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "53"
	)
	public boolean method7026(int var1, int var2) {
		boolean var3 = this.field3903 != var1 || var2 != this.field3904;
		this.field3903 = var1;
		this.field3904 = var2;
		var3 |= this.method7030(this.field3899, this.field3906);
		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "10"
	)
	public boolean method7128(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3905.method8580();
		this.field3905.method8558(var1);
		this.field3889.method8558(var1);
		if (this.method7263()) {
			this.method7098();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1163966484"
	)
	public boolean method7028(int var1) {
		this.field3905.method8556(var1);
		if (this.method7263()) {
			this.method7098();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1207086180"
	)
	public boolean method7029(int var1) {
		this.field3898 = var1;
		if (this.method7263()) {
			this.method7098();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "547053107"
	)
	public boolean method7030(int var1, int var2) {
		if (!this.method7077()) {
			this.field3899 = var1;
			this.field3906 = var2;
			return false;
		} else {
			int var3 = this.field3899;
			int var4 = this.field3906;
			int var5 = Math.max(0, this.field3905.method8575() - this.field3903 + 2);
			int var6 = Math.max(0, this.field3905.method8576() - this.field3904 + 1);
			this.field3899 = Math.max(0, Math.min(var5, var1));
			this.field3906 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3899 || var4 != this.field3906;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1489748148"
	)
	public boolean method7031(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3905.method8554(var1, var2) : false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1845346408"
	)
	public void method7032(int var1) {
		this.field3905.method8564(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	public void method7033(int var1) {
		this.field3894 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1434256392"
	)
	public void method7034(int var1) {
		this.field3905.method8562(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method7220(int var1) {
		this.field3905.method8585(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1457699220"
	)
	public boolean method7036(int var1) {
		this.field3896 = var1;
		String var2 = this.field3905.method8601();
		int var3 = var2.length();
		var2 = this.method7091(var2);
		if (var2.length() != var3) {
			this.field3905.method8674(var2);
			this.method7030(this.field3899, this.field3906);
			this.method7263();
			this.method7098();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1394876874"
	)
	public void method7037() {
		this.field3886 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1374369666"
	)
	public boolean method7038(int var1) {
		if (this.method7133(var1)) {
			this.method7043();
			class453 var2 = this.field3905.method8566((char)var1, this.field3890, this.field3901);
			this.method7213(var2.method8678(), var2.method8678());
			this.method7263();
			this.method7098();
		}

		return true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1523314796"
	)
	public void method7141() {
		if (!this.method7043() && this.field3890 > 0) {
			int var1 = this.field3905.method8571(this.field3890 - 1);
			this.method7098();
			this.method7213(var1, var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1739305121"
	)
	public void method7040() {
		if (!this.method7043() && this.field3890 < this.field3905.method8563()) {
			int var1 = this.field3905.method8571(this.field3890);
			this.method7098();
			this.method7213(var1, var1);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method7219() {
		if (!this.method7043() && this.field3890 > 0) {
			class541 var1 = this.method7023(this.field3890 - 1);
			int var2 = this.field3905.method8572((Integer)var1.field5443, this.field3890);
			this.method7098();
			this.method7213(var2, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	public void method7042() {
		if (!this.method7043() && this.field3890 < this.field3905.method8563()) {
			class541 var1 = this.method7023(this.field3890);
			int var2 = this.field3905.method8572(this.field3890, (Integer)var1.field5444);
			this.method7098();
			this.method7213(var2, var2);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-101366825"
	)
	boolean method7043() {
		if (!this.method7088()) {
			return false;
		} else {
			int var1 = this.field3905.method8572(this.field3892, this.field3890);
			this.method7098();
			this.method7213(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1749312222"
	)
	public void method7044() {
		this.method7213(0, this.field3905.method8563());
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-376245658"
	)
	public boolean method7213(int var1, int var2) {
		if (!this.method7077()) {
			this.field3892 = var1;
			this.field3890 = var2;
			return false;
		} else {
			if (var1 > this.field3905.method8563()) {
				var1 = this.field3905.method8563();
			}

			if (var2 > this.field3905.method8563()) {
				var2 = this.field3905.method8563();
			}

			boolean var3 = this.field3892 != var1 || var2 != this.field3890;
			this.field3892 = var1;
			if (var2 != this.field3890) {
				this.field3890 = var2;
				this.field3908 = 0;
				this.method7254();
			}

			if (var3 && this.field3902 != null) {
				this.field3902.vmethod6917();
			}

			return var3;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1936391005"
	)
	public void method7055(boolean var1) {
		class541 var2 = this.method7092(this.field3890);
		this.method7094((Integer)var2.field5443, var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1983755582"
	)
	public void method7047(boolean var1) {
		class541 var2 = this.method7092(this.field3890);
		this.method7094((Integer)var2.field5444, var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-59"
	)
	public void method7048(boolean var1) {
		this.method7094(0, var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1761183398"
	)
	public void method7164(boolean var1) {
		this.method7094(this.field3905.method8563(), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-987028326"
	)
	public void method7027(boolean var1) {
		if (this.method7088() && !var1) {
			this.method7094(Math.min(this.field3892, this.field3890), var1);
		} else if (this.field3890 > 0) {
			this.method7094(this.field3890 - 1, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1086779029"
	)
	public void method7102(boolean var1) {
		if (this.method7088() && !var1) {
			this.method7094(Math.max(this.field3892, this.field3890), var1);
		} else if (this.field3890 < this.field3905.method8563()) {
			this.method7094(this.field3890 + 1, var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-4195"
	)
	public void method7256(boolean var1) {
		if (this.field3890 > 0) {
			class541 var2 = this.method7023(this.field3890 - 1);
			this.method7094((Integer)var2.field5443, var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "721853021"
	)
	public void method7053(boolean var1) {
		if (this.field3890 < this.field3905.method8563()) {
			class541 var2 = this.method7023(this.field3890 + 1);
			this.method7094((Integer)var2.field5444, var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "779898305"
	)
	public void method7054(boolean var1) {
		if (this.field3890 > 0) {
			this.method7094(this.field3905.method8618(this.field3890, -1), var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-87"
	)
	public void method7099(boolean var1) {
		if (this.field3890 < this.field3905.method8563()) {
			this.method7094(this.field3905.method8618(this.field3890, 1), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2145548934"
	)
	public void method7056(boolean var1) {
		if (this.field3890 > 0) {
			int var2 = this.method7148();
			this.method7094(this.field3905.method8618(this.field3890, -var2), var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "102"
	)
	public void method7057(boolean var1) {
		if (this.field3890 < this.field3905.method8563()) {
			int var2 = this.method7148();
			this.method7094(this.field3905.method8618(this.field3890, var2), var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2137825532"
	)
	public void method7058(boolean var1) {
		class456 var2 = this.field3905.method8553(0, this.field3890);
		class541 var3 = var2.method8808();
		this.method7094(this.field3905.method8573((Integer)var3.field5443, this.field3906), var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1042656691"
	)
	public void method7059(boolean var1) {
		class456 var2 = this.field3905.method8553(0, this.field3890);
		class541 var3 = var2.method8808();
		this.method7094(this.field3905.method8573((Integer)var3.field5443, this.field3904 + this.field3906), var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-44"
	)
	public void method7178(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class541 var6;
		int var8;
		if (!this.field3886) {
			var8 = 0;
		} else {
			var1 += this.field3899;
			var2 += this.field3906;
			var6 = this.method7100();
			var8 = this.field3905.method8573(var1 - (Integer)var6.field5443, var2 - (Integer)var6.field5444);
		}

		if (var3 && var4) {
			this.field3895 = 1;
			var6 = this.method7023(var8);
			class541 var7 = this.method7023(this.field3885);
			this.method7046(var7, var6);
		} else if (var3) {
			this.field3895 = 1;
			var6 = this.method7023(var8);
			this.method7213((Integer)var6.field5443, (Integer)var6.field5444);
			this.field3885 = (Integer)var6.field5443;
		} else if (var4) {
			this.method7213(this.field3885, var8);
		} else {
			if (this.field3900 > 0 && var8 == this.field3885) {
				if (this.field3890 == this.field3892) {
					this.field3895 = 1;
					var6 = this.method7023(var8);
					this.method7213((Integer)var6.field5443, (Integer)var6.field5444);
				} else {
					this.field3895 = 2;
					var6 = this.method7092(var8);
					this.method7213((Integer)var6.field5443, (Integer)var6.field5444);
				}
			} else {
				this.field3895 = 0;
				this.method7213(var8, var8);
				this.field3885 = var8;
			}

			this.field3900 = 25;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1785836501"
	)
	public void method7061(int var1, int var2) {
		if (this.field3886 && this.method7072()) {
			var1 += this.field3899;
			var2 += this.field3906;
			class541 var3 = this.method7100();
			int var4 = this.field3905.method8573(var1 - (Integer)var3.field5443, var2 - (Integer)var3.field5444);
			class541 var5;
			class541 var6;
			switch(this.field3895) {
			case 0:
				this.method7213(this.field3892, var4);
				break;
			case 1:
				var5 = this.method7023(this.field3885);
				var6 = this.method7023(var4);
				this.method7046(var5, var6);
				break;
			case 2:
				var5 = this.method7092(this.field3885);
				var6 = this.method7092(var4);
				this.method7046(var5, var6);
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-278182791"
	)
	public void method7062(Clipboard var1) {
		class456 var2 = this.field3905.method8553(this.field3892, this.field3890);
		if (!var2.method8805()) {
			String var3 = var2.method8803();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2086707147"
	)
	public void method7188(Clipboard var1) {
		if (this.method7088()) {
			this.method7062(var1);
			this.method7043();
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1405828515"
	)
	public void method7064(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7091((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7043();
				class453 var4 = this.field3905.method8567(var3, this.field3890, this.field3901);
				this.method7213(var4.method8678(), var4.method8678());
				this.method7263();
				this.method7098();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public void method7065() {
		this.field3906 = Math.max(0, this.field3906 - this.field3905.method8577());
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1487088664"
	)
	public void method7066() {
		int var1 = Math.max(0, this.field3905.method8576() - this.field3904);
		this.field3906 = Math.min(var1, this.field3906 + this.field3905.method8577());
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "-86543178"
	)
	public void method7067(class353 var1) {
		this.field3907 = var1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "1837074940"
	)
	public void method7182(class353 var1) {
		this.field3902 = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lrn;",
		garbageValue = "-1672233203"
	)
	public class452 method7069() {
		return this.field3905;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lrn;",
		garbageValue = "1768634767"
	)
	public class452 method7070() {
		return this.field3889;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "-1905471453"
	)
	public class456 method7107() {
		return this.field3905.method8553(this.field3892, this.field3890);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "128"
	)
	public boolean method7072() {
		return this.field3881;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method7073() {
		return this.field3893;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-14"
	)
	public boolean method7074() {
		return this.method7072() && this.field3908 % 60 < 30;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-900306911"
	)
	public int method7075() {
		return this.field3890;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2146391516"
	)
	public int method7076() {
		return this.field3892;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-128"
	)
	public boolean method7077() {
		return this.field3886;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method7078() {
		return this.field3899;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292135772"
	)
	public int method7079() {
		return this.field3906;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-103"
	)
	public int method7208() {
		return this.field3905.method8580();
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	public int method7149() {
		return this.field3905.method8581();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int method7237() {
		return this.field3898;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	public int method7205() {
		return this.field3894;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1174510883"
	)
	public int method7290() {
		return this.field3905.method8590();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-639436996"
	)
	public int method7163() {
		return this.field3896;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1318684841"
	)
	public int method7143() {
		return this.field3905.method8655();
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2088668202"
	)
	public boolean method7041() {
		return this.method7149() > 1;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	boolean method7088() {
		return this.field3892 != this.field3890;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1646642222"
	)
	String method7091(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7133(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Luv;Luv;I)V",
		garbageValue = "986376064"
	)
	void method7046(class541 var1, class541 var2) {
		if ((Integer)var2.field5443 < (Integer)var1.field5443) {
			this.method7213((Integer)var1.field5444, (Integer)var2.field5443);
		} else {
			this.method7213((Integer)var1.field5443, (Integer)var2.field5444);
		}

	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "1131028076"
	)
	class541 method7023(int var1) {
		int var2 = this.field3905.method8563();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7097(this.field3905.method8552(var5 - 1).field4974)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7097(this.field3905.method8552(var5).field4974)) {
				var4 = var5;
				break;
			}
		}

		return new class541(var3, var4);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "-1110090863"
	)
	class541 method7092(int var1) {
		int var2 = this.field3905.method8563();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3905.method8552(var5 - 1).field4974 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3905.method8552(var5).field4974 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class541(var3, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "74170315"
	)
	boolean method7263() {
		if (!this.method7077()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3905.method8563() > this.field3898) {
				this.field3905.method8572(this.field3898, this.field3905.method8563());
				var1 = true;
			}

			int var2 = this.method7149();
			int var3;
			if (this.field3905.method8578() > var2) {
				var3 = this.field3905.method8618(0, var2) - 1;
				this.field3905.method8572(var3, this.field3905.method8563());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3890;
				int var4 = this.field3892;
				int var5 = this.field3905.method8563();
				if (this.field3890 > var5) {
					var3 = var5;
				}

				if (this.field3892 > var5) {
					var4 = var5;
				}

				this.method7213(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "243581729"
	)
	void method7094(int var1, boolean var2) {
		if (var2) {
			this.method7213(this.field3892, var1);
		} else {
			this.method7213(var1, var1);
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	int method7148() {
		return this.field3904 / this.field3905.method8577();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-601367652"
	)
	void method7254() {
		class456 var1 = this.field3905.method8553(0, this.field3890);
		class541 var2 = var1.method8808();
		int var3 = this.field3905.method8577();
		int var4 = (Integer)var2.field5443 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5444 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3899;
		int var9 = var8 + this.field3903;
		int var10 = this.field3906;
		int var11 = var10 + this.field3904;
		int var12 = this.field3899;
		int var13 = this.field3906;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3903;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3904;
		}

		this.method7030(var12, var13);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "497904011"
	)
	boolean method7097(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	void method7098() {
		if (this.field3907 != null) {
			this.field3907.vmethod6917();
		}

	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-790967094"
	)
	boolean method7133(int var1) {
		switch(this.field3896) {
		case 1:
			return class178.isAlphaNumeric((char)var1);
		case 2:
			return class196.isCharAlphabetic((char)var1);
		case 3:
			return FriendsList.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (FriendsList.isDigit(var2)) {
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

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(B)Luv;",
		garbageValue = "-92"
	)
	class541 method7100() {
		int var1 = this.field3905.method8569(this.field3903);
		int var2 = this.field3905.method8633(this.field3904);
		return new class541(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-358972194"
	)
	public static final void method7291(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field284 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			MouseRecorder.field1106 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
