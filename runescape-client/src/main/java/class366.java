import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class366 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class462 field4108;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	class462 field4098;
	@ObfuscatedName("av")
	boolean field4099;
	@ObfuscatedName("ah")
	boolean field4100;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 488555555
	)
	int field4101;
	@ObfuscatedName("ax")
	boolean field4102;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1511235845
	)
	int field4103;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1477217099
	)
	int field4094;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1957466993
	)
	int field4105;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 2100154115
	)
	int field4106;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1938071929
	)
	int field4096;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 424954287
	)
	int field4117;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2008245585
	)
	int field4109;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1419482103
	)
	int field4097;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 526154253
	)
	int field4111;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1287946861
	)
	int field4112;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 80761291
	)
	int field4113;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1805138927
	)
	int field4107;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2136870005
	)
	int field4115;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class357 field4116;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	class357 field4092;

	class366() {
		this.field4108 = new class462();
		this.field4098 = new class462();
		this.field4099 = false;
		this.field4100 = true;
		this.field4101 = 0;
		this.field4102 = false;
		this.field4103 = 0;
		this.field4094 = 0;
		this.field4105 = 0;
		this.field4106 = 0;
		this.field4096 = 0;
		this.field4117 = 0;
		this.field4109 = 0;
		this.field4097 = Integer.MAX_VALUE;
		this.field4111 = Integer.MAX_VALUE;
		this.field4112 = 0;
		this.field4113 = 0;
		this.field4107 = 0;
		this.field4115 = 0;
		this.field4108.method9357(1);
		this.field4098.method9357(1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	void method7611() {
		this.field4101 = (this.field4101 + 1) % 60;
		if (this.field4109 > 0) {
			--this.field4109;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "2034168456"
	)
	public boolean method7605(boolean var1) {
		var1 = var1 && this.field4100;
		boolean var2 = this.field4099 != var1;
		this.field4099 = var1;
		if (!this.field4099) {
			this.method7604(this.field4106, this.field4106);
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1468537517"
	)
	public void method7606(boolean var1) {
		this.field4100 = var1;
		this.field4099 = var1 && this.field4099;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-1"
	)
	public boolean method7607(String var1) {
		String var2 = this.field4108.method9329();
		if (!var2.equals(var1)) {
			var1 = this.method7673(var1);
			this.field4108.method9380(var1);
			this.method7604(this.field4096, this.field4106);
			this.method7859(this.field4107, this.field4115);
			this.method7696();
			this.method7682();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "46"
	)
	boolean method7817(String var1) {
		this.field4098.method9380(var1);
		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)Z",
		garbageValue = "-1322911962"
	)
	boolean method7746(AbstractFont var1) {
		boolean var2 = !this.field4102;
		this.field4108.method9353(var1);
		this.field4098.method9353(var1);
		this.field4102 = true;
		var2 |= this.method7859(this.field4107, this.field4115);
		var2 |= this.method7604(this.field4096, this.field4106);
		if (this.method7696()) {
			this.method7682();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1768301892"
	)
	public boolean method7880(int var1, int var2) {
		boolean var3 = this.field4112 != var1 || var2 != this.field4113;
		this.field4112 = var1;
		this.field4113 = var2;
		var3 |= this.method7859(this.field4107, this.field4115);
		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-786117586"
	)
	public boolean method7832(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field4108.method9292();
		this.field4108.method9293(var1);
		this.field4098.method9293(var1);
		if (this.method7696()) {
			this.method7682();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public boolean method7612(int var1) {
		this.field4108.method9300(var1);
		if (this.method7696()) {
			this.method7682();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2034904218"
	)
	public boolean method7613(int var1) {
		this.field4111 = var1;
		if (this.method7696()) {
			this.method7682();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-21"
	)
	public boolean method7859(int var1, int var2) {
		if (!this.method7658()) {
			this.field4107 = var1;
			this.field4115 = var2;
			return false;
		} else {
			int var3 = this.field4107;
			int var4 = this.field4115;
			int var5 = Math.max(0, this.field4108.method9308() - this.field4112 + 2);
			int var6 = Math.max(0, this.field4108.method9288() - this.field4113 + 1);
			this.field4107 = Math.max(0, Math.min(var5, var1));
			this.field4115 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field4107 || var4 != this.field4115;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1440742051"
	)
	public boolean method7865(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field4108.method9275(var1, var2) : false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "38"
	)
	public void method7616(int var1) {
		this.field4108.method9276(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1118959947"
	)
	public boolean method7716(int var1) {
		this.field4105 = var1;
		String var2 = this.field4108.method9329();
		int var3 = var2.length();
		var2 = this.method7673(var2);
		if (var2.length() != var3) {
			this.field4108.method9380(var2);
			this.method7859(this.field4107, this.field4115);
			this.method7696();
			this.method7682();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1020582755"
	)
	public void method7618() {
		this.field4102 = false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "635454943"
	)
	public boolean method7619(int var1) {
		if (this.method7683(var1)) {
			this.method7624();
			class463 var2 = this.field4108.method9267((char)var1, this.field4106, this.field4097);
			this.method7604(var2.method9398(), var2.method9398());
			this.method7696();
			this.method7682();
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098154087"
	)
	public void method7620() {
		if (!this.method7624() && this.field4106 > 0) {
			int var1 = this.field4108.method9266(this.field4106 - 1);
			this.method7682();
			this.method7604(var1, var1);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public void method7621() {
		if (!this.method7624() && this.field4106 < this.field4108.method9375()) {
			int var1 = this.field4108.method9266(this.field4106);
			this.method7682();
			this.method7604(var1, var1);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103855859"
	)
	public void method7622() {
		if (!this.method7624() && this.field4106 > 0) {
			class557 var1 = this.method7653(this.field4106 - 1);
			int var2 = this.field4108.method9284((Integer)var1.field5757, this.field4106);
			this.method7682();
			this.method7604(var2, var2);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1930270542"
	)
	public void method7830() {
		if (!this.method7624() && this.field4106 < this.field4108.method9375()) {
			class557 var1 = this.method7653(this.field4106);
			int var2 = this.field4108.method9284(this.field4106, (Integer)var1.field5756);
			this.method7682();
			this.method7604(var2, var2);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1486368358"
	)
	boolean method7624() {
		if (!this.method7729()) {
			return false;
		} else {
			int var1 = this.field4108.method9284(this.field4096, this.field4106);
			this.method7682();
			this.method7604(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method7625() {
		this.method7604(0, this.field4108.method9375());
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2109781523"
	)
	public boolean method7604(int var1, int var2) {
		if (!this.method7658()) {
			this.field4096 = var1;
			this.field4106 = var2;
			return false;
		} else {
			if (var1 > this.field4108.method9375()) {
				var1 = this.field4108.method9375();
			}

			if (var2 > this.field4108.method9375()) {
				var2 = this.field4108.method9375();
			}

			boolean var3 = this.field4096 != var1 || var2 != this.field4106;
			this.field4096 = var1;
			if (var2 != this.field4106) {
				this.field4106 = var2;
				this.field4101 = 0;
				this.method7680();
			}

			if (var3 && this.field4092 != null) {
				this.field4092.vmethod7474();
			}

			return var3;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1862911269"
	)
	public void method7806(boolean var1) {
		class557 var2 = this.method7676(this.field4106);
		this.method7678((Integer)var2.field5757, var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1596957136"
	)
	public void method7628(boolean var1) {
		class557 var2 = this.method7676(this.field4106);
		this.method7678((Integer)var2.field5756, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1077868888"
	)
	public void method7664(boolean var1) {
		this.method7678(0, var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "255"
	)
	public void method7632(boolean var1) {
		this.method7678(this.field4108.method9375(), var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "64"
	)
	public void method7631(boolean var1) {
		if (this.method7729() && !var1) {
			this.method7678(Math.min(this.field4096, this.field4106), var1);
		} else if (this.field4106 > 0) {
			this.method7678(this.field4106 - 1, var1);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "69"
	)
	public void method7661(boolean var1) {
		if (this.method7729() && !var1) {
			this.method7678(Math.max(this.field4096, this.field4106), var1);
		} else if (this.field4106 < this.field4108.method9375()) {
			this.method7678(this.field4106 + 1, var1);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "683280644"
	)
	public void method7633(boolean var1) {
		if (this.field4106 > 0) {
			class557 var2 = this.method7653(this.field4106 - 1);
			this.method7678((Integer)var2.field5757, var1);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "87808905"
	)
	public void method7634(boolean var1) {
		if (this.field4106 < this.field4108.method9375()) {
			class557 var2 = this.method7653(this.field4106 + 1);
			this.method7678((Integer)var2.field5756, var1);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "35"
	)
	public void method7635(boolean var1) {
		if (this.field4106 > 0) {
			this.method7678(this.field4108.method9351(this.field4106, -1), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "760732685"
	)
	public void method7636(boolean var1) {
		if (this.field4106 < this.field4108.method9375()) {
			this.method7678(this.field4108.method9351(this.field4106, 1), var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-108915423"
	)
	public void method7838(boolean var1) {
		if (this.field4106 > 0) {
			int var2 = this.method7679();
			this.method7678(this.field4108.method9351(this.field4106, -var2), var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1972273666"
	)
	public void method7825(boolean var1) {
		if (this.field4106 < this.field4108.method9375()) {
			int var2 = this.method7679();
			this.method7678(this.field4108.method9351(this.field4106, var2), var1);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "308259660"
	)
	public void method7639(boolean var1) {
		class466 var2 = this.field4108.method9277(0, this.field4106);
		class557 var3 = var2.method9524();
		this.method7678(this.field4108.method9285((Integer)var3.field5757, this.field4115), var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1601872458"
	)
	public void method7772(boolean var1) {
		class466 var2 = this.field4108.method9277(0, this.field4106);
		class557 var3 = var2.method9524();
		this.method7678(this.field4108.method9285((Integer)var3.field5757, this.field4115 + this.field4113), var1);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "-55"
	)
	public void method7641(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class557 var6;
		int var8;
		if (!this.field4102) {
			var8 = 0;
		} else {
			var1 += this.field4107;
			var2 += this.field4115;
			var6 = this.method7684();
			var8 = this.field4108.method9285(var1 - (Integer)var6.field5757, var2 - (Integer)var6.field5756);
		}

		if (var3 && var4) {
			this.field4094 = 1;
			var6 = this.method7653(var8);
			class557 var7 = this.method7653(this.field4117);
			this.method7854(var7, var6);
		} else if (var3) {
			this.field4094 = 1;
			var6 = this.method7653(var8);
			this.method7604((Integer)var6.field5757, (Integer)var6.field5756);
			this.field4117 = (Integer)var6.field5757;
		} else if (var4) {
			this.method7604(this.field4117, var8);
		} else {
			if (this.field4109 > 0 && var8 == this.field4117) {
				if (this.field4106 == this.field4096) {
					this.field4094 = 1;
					var6 = this.method7653(var8);
					this.method7604((Integer)var6.field5757, (Integer)var6.field5756);
				} else {
					this.field4094 = 2;
					var6 = this.method7676(var8);
					this.method7604((Integer)var6.field5757, (Integer)var6.field5756);
				}
			} else {
				this.field4094 = 0;
				this.method7604(var8, var8);
				this.field4117 = var8;
			}

			this.field4109 = 25;
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-10"
	)
	public void method7642(int var1, int var2) {
		if (this.field4102 && this.method7839()) {
			var1 += this.field4107;
			var2 += this.field4115;
			class557 var3 = this.method7684();
			int var4 = this.field4108.method9285(var1 - (Integer)var3.field5757, var2 - (Integer)var3.field5756);
			class557 var5;
			class557 var6;
			switch(this.field4094) {
			case 0:
				this.method7604(this.field4096, var4);
				break;
			case 1:
				var5 = this.method7653(this.field4117);
				var6 = this.method7653(var4);
				this.method7854(var5, var6);
				break;
			case 2:
				var5 = this.method7676(this.field4117);
				var6 = this.method7676(var4);
				this.method7854(var5, var6);
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1785151938"
	)
	public void method7668(Clipboard var1) {
		class466 var2 = this.field4108.method9277(this.field4096, this.field4106);
		if (!var2.method9533()) {
			String var3 = var2.method9518();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "20"
	)
	public void method7644(Clipboard var1) {
		if (this.method7729()) {
			this.method7668(var1);
			this.method7624();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1452509408"
	)
	public void method7645(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7673((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7624();
				class463 var4 = this.field4108.method9279(var3, this.field4106, this.field4097);
				this.method7604(var4.method9398(), var4.method9398());
				this.method7696();
				this.method7682();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1975473423"
	)
	public void method7646() {
		this.field4115 = Math.max(0, this.field4115 - this.field4108.method9289());
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public void method7617() {
		int var1 = Math.max(0, this.field4108.method9288() - this.field4113);
		this.field4115 = Math.min(var1, this.field4115 + this.field4108.method9289());
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "1090330342"
	)
	public void method7648(class357 var1) {
		this.field4116 = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-2065463482"
	)
	public void method7677(class357 var1) {
		this.field4092 = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "-71289470"
	)
	public class462 method7650() {
		return this.field4108;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lrb;",
		garbageValue = "776524383"
	)
	public class462 method7651() {
		return this.field4098;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Lrh;",
		garbageValue = "-70721493"
	)
	public class466 method7796() {
		return this.field4108.method9277(this.field4096, this.field4106);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1740673703"
	)
	public boolean method7839() {
		return this.field4099;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1498673246"
	)
	public boolean method7654() {
		return this.field4100;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "479820445"
	)
	public boolean method7655() {
		return this.method7839() && this.field4101 % 60 < 30;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-38"
	)
	public int method7656() {
		return this.field4106;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	public int method7857() {
		return this.field4096;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "45"
	)
	public boolean method7658() {
		return this.field4102;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	public int method7792() {
		return this.field4107;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	public int method7660() {
		return this.field4115;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2063010611"
	)
	public int method7777() {
		return this.field4108.method9292();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	public int method7662() {
		return this.field4108.method9326();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	public int method7663() {
		return this.field4111;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1358302221"
	)
	public int method7783() {
		return this.field4103;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "449327088"
	)
	public void method7665(int var1) {
		this.field4103 = var1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1827649539"
	)
	public int method7666() {
		return this.field4108.method9296();
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1854008248"
	)
	public void method7667(int var1) {
		this.field4108.method9357(var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "152626288"
	)
	public int method7773() {
		return this.field4105;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1539418827"
	)
	public int method7689() {
		return this.field4108.method9287();
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1720869700"
	)
	public void method7670(int var1) {
		this.field4108.method9273(var1);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "845097221"
	)
	public boolean method7671() {
		return this.method7662() > 1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1783662101"
	)
	boolean method7729() {
		return this.field4106 != this.field4096;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-156524951"
	)
	String method7673(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7683(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lvt;Lvt;I)V",
		garbageValue = "-897946811"
	)
	void method7854(class557 var1, class557 var2) {
		if ((Integer)var2.field5757 < (Integer)var1.field5757) {
			this.method7604((Integer)var1.field5756, (Integer)var2.field5757);
		} else {
			this.method7604((Integer)var1.field5757, (Integer)var2.field5756);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvt;",
		garbageValue = "-24"
	)
	class557 method7653(int var1) {
		int var2 = this.field4108.method9375();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7681(this.field4108.method9382(var5 - 1).field5242)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7681(this.field4108.method9382(var5).field5242)) {
				var4 = var5;
				break;
			}
		}

		return new class557(var3, var4);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Lvt;",
		garbageValue = "-523109687"
	)
	class557 method7676(int var1) {
		int var2 = this.field4108.method9375();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field4108.method9382(var5 - 1).field5242 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field4108.method9382(var5).field5242 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class557(var3, var4);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1878975798"
	)
	boolean method7696() {
		if (!this.method7658()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field4108.method9375() > this.field4111) {
				this.field4108.method9284(this.field4111, this.field4108.method9375());
				var1 = true;
			}

			int var2 = this.method7662();
			int var3;
			if (this.field4108.method9365() > var2) {
				var3 = this.field4108.method9351(0, var2) - 1;
				this.field4108.method9284(var3, this.field4108.method9375());
				var1 = true;
			}

			if (var1) {
				var3 = this.field4106;
				int var4 = this.field4096;
				int var5 = this.field4108.method9375();
				if (this.field4106 > var5) {
					var3 = var5;
				}

				if (this.field4096 > var5) {
					var4 = var5;
				}

				this.method7604(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-779067246"
	)
	void method7678(int var1, boolean var2) {
		if (var2) {
			this.method7604(this.field4096, var1);
		} else {
			this.method7604(var1, var1);
		}

	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method7679() {
		return this.field4113 / this.field4108.method9289();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-541408715"
	)
	void method7680() {
		class466 var1 = this.field4108.method9277(0, this.field4106);
		class557 var2 = var1.method9524();
		int var3 = this.field4108.method9289();
		int var4 = (Integer)var2.field5757 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5756 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field4107;
		int var9 = var8 + this.field4112;
		int var10 = this.field4115;
		int var11 = var10 + this.field4113;
		int var12 = this.field4107;
		int var13 = this.field4115;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field4112;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field4113;
		}

		this.method7859(var12, var13);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "554143367"
	)
	boolean method7681(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "133937273"
	)
	void method7682() {
		if (this.field4116 != null) {
			this.field4116.vmethod7474();
		}

	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "128"
	)
	boolean method7683(int var1) {
		switch(this.field4105) {
		case 1:
			return ModelData0.isAlphaNumeric((char)var1);
		case 2:
			return class269.isCharAlphabetic((char)var1);
		case 3:
			return class406.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class406.isDigit(var2)) {
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

	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "(B)Lvt;",
		garbageValue = "9"
	)
	class557 method7684() {
		int var1 = this.field4108.method9299(this.field4112);
		int var2 = this.field4108.method9298(this.field4113);
		return new class557(var1, var2);
	}
}
