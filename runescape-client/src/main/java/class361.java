import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class361 {
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -167064761
	)
	static int field3904;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	class452 field3915;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	class452 field3901;
	@ObfuscatedName("ag")
	boolean field3920;
	@ObfuscatedName("ai")
	boolean field3903;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1229852865
	)
	int field3919;
	@ObfuscatedName("ah")
	boolean field3905;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -245706557
	)
	int field3906;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 558324383
	)
	int field3907;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -246662799
	)
	int field3908;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1649332565
	)
	int field3909;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2133956231
	)
	int field3902;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 10165359
	)
	int field3911;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -818099707
	)
	int field3912;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1547861321
	)
	int field3900;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1179114785
	)
	int field3914;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1070716707
	)
	int field3910;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1992134023
	)
	int field3916;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -55221445
	)
	int field3921;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -196577819
	)
	int field3918;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class353 field3913;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	class353 field3893;

	class361() {
		this.field3915 = new class452();
		this.field3901 = new class452();
		this.field3920 = false;
		this.field3903 = true;
		this.field3919 = 0;
		this.field3905 = false;
		this.field3906 = 0;
		this.field3907 = 0;
		this.field3908 = 0;
		this.field3909 = 0;
		this.field3902 = 0;
		this.field3911 = 0;
		this.field3912 = 0;
		this.field3900 = Integer.MAX_VALUE;
		this.field3914 = Integer.MAX_VALUE;
		this.field3910 = 0;
		this.field3916 = 0;
		this.field3921 = 0;
		this.field3918 = 0;
		this.field3915.method8621(1);
		this.field3901.method8621(1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1808422921"
	)
	void method7064() {
		this.field3919 = (this.field3919 + 1) % 60;
		if (this.field3912 > 0) {
			--this.field3912;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1033712177"
	)
	public boolean method7111(boolean var1) {
		var1 = var1 && this.field3903;
		boolean var2 = this.field3920 != var1;
		this.field3920 = var1;
		if (!this.field3920) {
			this.method7251(this.field3909, this.field3909);
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "251997028"
	)
	public void method7231(boolean var1) {
		this.field3903 = var1;
		this.field3920 = var1 && this.field3920;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	public boolean method7250(String var1) {
		String var2 = this.field3915.method8658();
		if (!var2.equals(var1)) {
			var1 = this.method7133(var1);
			this.field3915.method8605(var1);
			this.method7251(this.field3902, this.field3909);
			this.method7124(this.field3921, this.field3918);
			this.method7137();
			this.method7085();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1649163165"
	)
	boolean method7068(String var1) {
		this.field3901.method8605(var1);
		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)Z",
		garbageValue = "-520409834"
	)
	boolean method7069(AbstractFont var1) {
		boolean var2 = !this.field3905;
		this.field3915.method8684(var1);
		this.field3901.method8684(var1);
		this.field3905 = true;
		var2 |= this.method7124(this.field3921, this.field3918);
		var2 |= this.method7251(this.field3902, this.field3909);
		if (this.method7137()) {
			this.method7085();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2066494245"
	)
	public boolean method7183(int var1, int var2) {
		boolean var3 = this.field3910 != var1 || var2 != this.field3916;
		this.field3910 = var1;
		this.field3916 = var2;
		var3 |= this.method7124(this.field3921, this.field3918);
		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "68"
	)
	public boolean method7144(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field3915.method8616();
		this.field3915.method8617(var1);
		this.field3901.method8617(var1);
		if (this.method7137()) {
			this.method7085();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1060610739"
	)
	public boolean method7072(int var1) {
		this.field3915.method8713(var1);
		if (this.method7137()) {
			this.method7085();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method7218(int var1) {
		this.field3914 = var1;
		if (this.method7137()) {
			this.method7085();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "328846401"
	)
	public boolean method7124(int var1, int var2) {
		if (!this.method7118()) {
			this.field3921 = var1;
			this.field3918 = var2;
			return false;
		} else {
			int var3 = this.field3921;
			int var4 = this.field3918;
			int var5 = Math.max(0, this.field3915.method8611() - this.field3910 + 2);
			int var6 = Math.max(0, this.field3915.method8652() - this.field3916 + 1);
			this.field3921 = Math.max(0, Math.min(var5, var1));
			this.field3918 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field3921 || var4 != this.field3918;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "41"
	)
	public boolean method7075(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field3915.method8599(var1, var2) : false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1371791541"
	)
	public void method7076(int var1) {
		this.field3915.method8606(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-125"
	)
	public boolean method7305(int var1) {
		this.field3908 = var1;
		String var2 = this.field3915.method8658();
		int var3 = var2.length();
		var2 = this.method7133(var2);
		if (var2.length() != var3) {
			this.field3915.method8605(var2);
			this.method7124(this.field3921, this.field3918);
			this.method7137();
			this.method7085();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1276208485"
	)
	public void method7078() {
		this.field3905 = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "81"
	)
	public boolean method7265(int var1) {
		if (this.method7143(var1)) {
			this.method7084();
			class453 var2 = this.field3915.method8602((char)var1, this.field3909, this.field3900);
			this.method7251(var2.method8723(), var2.method8723());
			this.method7137();
			this.method7085();
		}

		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-463817013"
	)
	public void method7080() {
		if (!this.method7084() && this.field3909 > 0) {
			int var1 = this.field3915.method8607(this.field3909 - 1);
			this.method7085();
			this.method7251(var1, var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method7171() {
		if (!this.method7084() && this.field3909 < this.field3915.method8598()) {
			int var1 = this.field3915.method8607(this.field3909);
			this.method7085();
			this.method7251(var1, var1);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-526306881"
	)
	public void method7082() {
		if (!this.method7084() && this.field3909 > 0) {
			class541 var1 = this.method7090(this.field3909 - 1);
			int var2 = this.field3915.method8608((Integer)var1.field5466, this.field3909);
			this.method7085();
			this.method7251(var2, var2);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1502324669"
	)
	public void method7083() {
		if (!this.method7084() && this.field3909 < this.field3915.method8598()) {
			class541 var1 = this.method7090(this.field3909);
			int var2 = this.field3915.method8608(this.field3909, (Integer)var1.field5467);
			this.method7085();
			this.method7251(var2, var2);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-34"
	)
	boolean method7084() {
		if (!this.method7132()) {
			return false;
		} else {
			int var1 = this.field3915.method8608(this.field3902, this.field3909);
			this.method7085();
			this.method7251(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	public void method7315() {
		this.method7251(0, this.field3915.method8598());
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "74"
	)
	public boolean method7251(int var1, int var2) {
		if (!this.method7118()) {
			this.field3902 = var1;
			this.field3909 = var2;
			return false;
		} else {
			if (var1 > this.field3915.method8598()) {
				var1 = this.field3915.method8598();
			}

			if (var2 > this.field3915.method8598()) {
				var2 = this.field3915.method8598();
			}

			boolean var3 = this.field3902 != var1 || var2 != this.field3909;
			this.field3902 = var1;
			if (var2 != this.field3909) {
				this.field3909 = var2;
				this.field3919 = 0;
				this.method7282();
			}

			if (var3 && this.field3893 != null) {
				this.field3893.vmethod6948();
			}

			return var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "92"
	)
	public void method7087(boolean var1) {
		class541 var2 = this.method7136(this.field3909);
		this.method7138((Integer)var2.field5466, var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7070(boolean var1) {
		class541 var2 = this.method7136(this.field3909);
		this.method7138((Integer)var2.field5467, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1273465279"
	)
	public void method7089(boolean var1) {
		this.method7138(0, var1);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2109986342"
	)
	public void method7079(boolean var1) {
		this.method7138(this.field3915.method8598(), var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1353696098"
	)
	public void method7091(boolean var1) {
		if (this.method7132() && !var1) {
			this.method7138(Math.min(this.field3902, this.field3909), var1);
		} else if (this.field3909 > 0) {
			this.method7138(this.field3909 - 1, var1);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-457600316"
	)
	public void method7092(boolean var1) {
		if (this.method7132() && !var1) {
			this.method7138(Math.max(this.field3902, this.field3909), var1);
		} else if (this.field3909 < this.field3915.method8598()) {
			this.method7138(this.field3909 + 1, var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-564384179"
	)
	public void method7310(boolean var1) {
		if (this.field3909 > 0) {
			class541 var2 = this.method7090(this.field3909 - 1);
			this.method7138((Integer)var2.field5466, var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1915681219"
	)
	public void method7289(boolean var1) {
		if (this.field3909 < this.field3915.method8598()) {
			class541 var2 = this.method7090(this.field3909 + 1);
			this.method7138((Integer)var2.field5467, var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "112"
	)
	public void method7095(boolean var1) {
		if (this.field3909 > 0) {
			this.method7138(this.field3915.method8610(this.field3909, -1), var1);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-45"
	)
	public void method7096(boolean var1) {
		if (this.field3909 < this.field3915.method8598()) {
			this.method7138(this.field3915.method8610(this.field3909, 1), var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-17"
	)
	public void method7097(boolean var1) {
		if (this.field3909 > 0) {
			int var2 = this.method7139();
			this.method7138(this.field3915.method8610(this.field3909, -var2), var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-979268237"
	)
	public void method7296(boolean var1) {
		if (this.field3909 < this.field3915.method8598()) {
			int var2 = this.method7139();
			this.method7138(this.field3915.method8610(this.field3909, var2), var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "448732779"
	)
	public void method7067(boolean var1) {
		class456 var2 = this.field3915.method8619(0, this.field3909);
		class541 var3 = var2.method8853();
		this.method7138(this.field3915.method8609((Integer)var3.field5466, this.field3918), var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-11"
	)
	public void method7168(boolean var1) {
		class456 var2 = this.field3915.method8619(0, this.field3909);
		class541 var3 = var2.method8853();
		this.method7138(this.field3915.method8609((Integer)var3.field5466, this.field3916 + this.field3918), var1);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1998260510"
	)
	public void method7101(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class541 var6;
		int var8;
		if (!this.field3905) {
			var8 = 0;
		} else {
			var1 += this.field3921;
			var2 += this.field3918;
			var6 = this.method7249();
			var8 = this.field3915.method8609(var1 - (Integer)var6.field5466, var2 - (Integer)var6.field5467);
		}

		if (var3 && var4) {
			this.field3907 = 1;
			var6 = this.method7090(var8);
			class541 var7 = this.method7090(this.field3911);
			this.method7179(var7, var6);
		} else if (var3) {
			this.field3907 = 1;
			var6 = this.method7090(var8);
			this.method7251((Integer)var6.field5466, (Integer)var6.field5467);
			this.field3911 = (Integer)var6.field5466;
		} else if (var4) {
			this.method7251(this.field3911, var8);
		} else {
			if (this.field3912 > 0 && var8 == this.field3911) {
				if (this.field3909 == this.field3902) {
					this.field3907 = 1;
					var6 = this.method7090(var8);
					this.method7251((Integer)var6.field5466, (Integer)var6.field5467);
				} else {
					this.field3907 = 2;
					var6 = this.method7136(var8);
					this.method7251((Integer)var6.field5466, (Integer)var6.field5467);
				}
			} else {
				this.field3907 = 0;
				this.method7251(var8, var8);
				this.field3911 = var8;
			}

			this.field3912 = 25;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "190"
	)
	public void method7102(int var1, int var2) {
		if (this.field3905 && this.method7113()) {
			var1 += this.field3921;
			var2 += this.field3918;
			class541 var3 = this.method7249();
			int var4 = this.field3915.method8609(var1 - (Integer)var3.field5466, var2 - (Integer)var3.field5467);
			class541 var5;
			class541 var6;
			switch(this.field3907) {
			case 0:
				this.method7251(this.field3902, var4);
				break;
			case 1:
				var5 = this.method7090(this.field3911);
				var6 = this.method7090(var4);
				this.method7179(var5, var6);
				break;
			case 2:
				var5 = this.method7136(this.field3911);
				var6 = this.method7136(var4);
				this.method7179(var5, var6);
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "16711935"
	)
	public void method7103(Clipboard var1) {
		class456 var2 = this.field3915.method8619(this.field3902, this.field3909);
		if (!var2.method8856()) {
			String var3 = var2.method8854();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-2142617037"
	)
	public void method7066(Clipboard var1) {
		if (this.method7132()) {
			this.method7103(var1);
			this.method7084();
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "38"
	)
	public void method7105(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7133((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7084();
				class453 var4 = this.field3915.method8603(var3, this.field3909, this.field3900);
				this.method7251(var4.method8723(), var4.method8723());
				this.method7137();
				this.method7085();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1432399138"
	)
	public void method7106() {
		this.field3918 = Math.max(0, this.field3918 - this.field3915.method8613());
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2078586594"
	)
	public void method7107() {
		int var1 = Math.max(0, this.field3915.method8652() - this.field3916);
		this.field3918 = Math.min(var1, this.field3918 + this.field3915.method8613());
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-85348646"
	)
	public void method7108(class353 var1) {
		this.field3913 = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "171066744"
	)
	public void method7088(class353 var1) {
		this.field3893 = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "430218523"
	)
	public class452 method7110() {
		return this.field3915;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1053804460"
	)
	public class452 method7201() {
		return this.field3901;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lrl;",
		garbageValue = "78"
	)
	public class456 method7112() {
		return this.field3915.method8619(this.field3902, this.field3909);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1513433440"
	)
	public boolean method7113() {
		return this.field3920;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "113"
	)
	public boolean method7240() {
		return this.field3903;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-929258673"
	)
	public boolean method7115() {
		return this.method7113() && this.field3919 % 60 < 30;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1974240261"
	)
	public int method7116() {
		return this.field3909;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1714278737"
	)
	public int method7129() {
		return this.field3902;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public boolean method7118() {
		return this.field3905;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	public int method7119() {
		return this.field3921;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1711647789"
	)
	public int method7120() {
		return this.field3918;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1967925264"
	)
	public int method7121() {
		return this.field3915.method8616();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	public int method7122() {
		return this.field3915.method8650();
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "566093280"
	)
	public int method7181() {
		return this.field3914;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1090417512"
	)
	public int method7291() {
		return this.field3906;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-230973202"
	)
	public void method7125(int var1) {
		this.field3906 = var1;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "235920991"
	)
	public int method7126() {
		return this.field3915.method8612();
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1553469057"
	)
	public void method7280(int var1) {
		this.field3915.method8621(var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1231833770"
	)
	public int method7213() {
		return this.field3908;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1896655019"
	)
	public int method7202() {
		return this.field3915.method8622();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method7130(int var1) {
		this.field3915.method8597(var1);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16384"
	)
	public boolean method7131() {
		return this.method7122() > 1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	boolean method7132() {
		return this.field3909 != this.field3902;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1484324009"
	)
	String method7133(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7143(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lug;Lug;B)V",
		garbageValue = "110"
	)
	void method7179(class541 var1, class541 var2) {
		if ((Integer)var2.field5466 < (Integer)var1.field5466) {
			this.method7251((Integer)var1.field5467, (Integer)var2.field5466);
		} else {
			this.method7251((Integer)var1.field5466, (Integer)var2.field5467);
		}

	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)Lug;",
		garbageValue = "123"
	)
	class541 method7090(int var1) {
		int var2 = this.field3915.method8598();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7141(this.field3915.method8627(var5 - 1).field4990)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7141(this.field3915.method8627(var5).field4990)) {
				var4 = var5;
				break;
			}
		}

		return new class541(var3, var4);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)Lug;",
		garbageValue = "-482426012"
	)
	class541 method7136(int var1) {
		int var2 = this.field3915.method8598();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field3915.method8627(var5 - 1).field4990 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field3915.method8627(var5).field4990 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class541(var3, var4);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1087881694"
	)
	boolean method7137() {
		if (!this.method7118()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field3915.method8598() > this.field3914) {
				this.field3915.method8608(this.field3914, this.field3915.method8598());
				var1 = true;
			}

			int var2 = this.method7122();
			int var3;
			if (this.field3915.method8614() > var2) {
				var3 = this.field3915.method8610(0, var2) - 1;
				this.field3915.method8608(var3, this.field3915.method8598());
				var1 = true;
			}

			if (var1) {
				var3 = this.field3909;
				int var4 = this.field3902;
				int var5 = this.field3915.method8598();
				if (this.field3909 > var5) {
					var3 = var5;
				}

				if (this.field3902 > var5) {
					var4 = var5;
				}

				this.method7251(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1453649024"
	)
	void method7138(int var1, boolean var2) {
		if (var2) {
			this.method7251(this.field3902, var1);
		} else {
			this.method7251(var1, var1);
		}

	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1638513091"
	)
	int method7139() {
		return this.field3916 / this.field3915.method8613();
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "468838444"
	)
	void method7282() {
		class456 var1 = this.field3915.method8619(0, this.field3909);
		class541 var2 = var1.method8853();
		int var3 = this.field3915.method8613();
		int var4 = (Integer)var2.field5466 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5467 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field3921;
		int var9 = var8 + this.field3910;
		int var10 = this.field3918;
		int var11 = var10 + this.field3916;
		int var12 = this.field3921;
		int var13 = this.field3918;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field3910;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field3916;
		}

		this.method7124(var12, var13);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-825213715"
	)
	boolean method7141(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	void method7085() {
		if (this.field3913 != null) {
			this.field3913.vmethod6948();
		}

	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "277735148"
	)
	boolean method7143(int var1) {
		switch(this.field3908) {
		case 1:
			return DynamicObject.isAlphaNumeric((char)var1);
		case 2:
			return class228.isCharAlphabetic((char)var1);
		case 3:
			return WorldMapData_0.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (WorldMapData_0.isDigit(var2)) {
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

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "(I)Lug;",
		garbageValue = "-550833988"
	)
	class541 method7249() {
		int var1 = this.field3915.method8623(this.field3910);
		int var2 = this.field3915.method8648(this.field3916);
		return new class541(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIILkd;S)V",
		garbageValue = "191"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = class162.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var11][var14] + var15[var12][var13] + var15[var11][var13] + var15[var12][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = LoginPacket.calculateTag(var1, var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class195.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method4062(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = Varps.field3836[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1037[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3] = 50;
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Varps.field3836[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Varps.field3836[var1][var2];
								var10000[1 + var3] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Varps.field3836[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3] = 50;
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = Varps.field3836[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5732(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method4260(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1035[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5732(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field1037[var5], Tiles.field1037[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = Varps.field3836[var1][var2];
									var10000[var3] |= 585;
									var10000 = Varps.field3836[var1][var2];
									var10000[1 + var3] |= 1170;
								} else if (var5 == 1) {
									var10000 = Varps.field3836[var1][var2];
									var10000[var3 + 1] |= 1170;
									var10000 = Varps.field3836[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = Varps.field3836[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = Varps.field3836[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = Varps.field3836[var1][var2];
									var10000[var3] |= 1170;
									var10000 = Varps.field3836[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5732(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4260(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1035[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									DevicePcmPlayerProvider.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									DevicePcmPlayerProvider.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5732(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method4062(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4260(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1037[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (var24 != 0L) {
									var23 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field1037[var5], 0, var23 * Tiles.field1038[var5], var23 * Tiles.field1041[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1039[var5], var23 * Tiles.field1040[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1039[var5], var23 * Tiles.field1040[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method4062(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method4505() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > DevicePcmPlayerProvider.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									DevicePcmPlayerProvider.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}
}
