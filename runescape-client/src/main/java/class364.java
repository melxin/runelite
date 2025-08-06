import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class364 {
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1314718997
	)
	static int field4029;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	class458 field4019;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	class458 field4032;
	@ObfuscatedName("ao")
	boolean field4013;
	@ObfuscatedName("az")
	boolean field4018;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -347335307
	)
	int field4023;
	@ObfuscatedName("aw")
	boolean field4024;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 147841567
	)
	int field4025;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 66982515
	)
	int field4026;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2055224283
	)
	int field4027;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 187195165
	)
	int field4028;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1490520249
	)
	int field4021;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1541995483
	)
	int field4030;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -2042855855
	)
	int field4016;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -288605165
	)
	int field4022;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1005190957
	)
	int field4033;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1136692745
	)
	int field4020;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1239414447
	)
	int field4035;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 512023293
	)
	int field4036;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2104112029
	)
	int field4037;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	class355 field4038;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	class355 field4039;

	class364() {
		this.field4019 = new class458();
		this.field4032 = new class458();
		this.field4013 = false;
		this.field4018 = true;
		this.field4023 = 0;
		this.field4024 = false;
		this.field4025 = 0;
		this.field4026 = 0;
		this.field4027 = 0;
		this.field4028 = 0;
		this.field4021 = 0;
		this.field4030 = 0;
		this.field4016 = 0;
		this.field4022 = Integer.MAX_VALUE;
		this.field4033 = Integer.MAX_VALUE;
		this.field4020 = 0;
		this.field4035 = 0;
		this.field4036 = 0;
		this.field4037 = 0;
		this.field4019.method9326(1);
		this.field4032.method9326(1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	void method7691() {
		this.field4023 = (this.field4023 + 1) % 60;
		if (this.field4016 > 0) {
			--this.field4016;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-4"
	)
	public boolean method7580(boolean var1) {
		var1 = var1 && this.field4018;
		boolean var2 = this.field4013 != var1;
		this.field4013 = var1;
		if (!this.field4013) {
			this.method7601(this.field4028, this.field4028);
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-888165727"
	)
	public void method7581(boolean var1) {
		this.field4018 = var1;
		this.field4013 = var1 && this.field4013;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "615952085"
	)
	public boolean method7582(String var1) {
		String var2 = this.field4019.method9267();
		if (!var2.equals(var1)) {
			var1 = this.method7813(var1);
			this.field4019.method9352(var1);
			this.method7601(this.field4021, this.field4028);
			this.method7589(this.field4036, this.field4037);
			this.method7723();
			this.method7656();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "634588055"
	)
	boolean method7583(String var1) {
		this.field4032.method9352(var1);
		return true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)Z",
		garbageValue = "825160067"
	)
	boolean method7584(AbstractFont var1) {
		boolean var2 = !this.field4024;
		this.field4019.method9330(var1);
		this.field4032.method9330(var1);
		this.field4024 = true;
		var2 |= this.method7589(this.field4036, this.field4037);
		var2 |= this.method7601(this.field4021, this.field4028);
		if (this.method7723()) {
			this.method7656();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "24"
	)
	public boolean method7585(int var1, int var2) {
		boolean var3 = this.field4020 != var1 || var2 != this.field4035;
		this.field4020 = var1;
		this.field4035 = var2;
		var3 |= this.method7589(this.field4036, this.field4037);
		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-251899561"
	)
	public boolean method7586(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field4019.method9373();
		this.field4019.method9286(var1);
		this.field4032.method9286(var1);
		if (this.method7723()) {
			this.method7656();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1257895453"
	)
	public boolean method7829(int var1) {
		this.field4019.method9288(var1);
		if (this.method7723()) {
			this.method7656();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "18"
	)
	public boolean method7588(int var1) {
		this.field4033 = var1;
		if (this.method7723()) {
			this.method7656();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2147322453"
	)
	public boolean method7589(int var1, int var2) {
		if (!this.method7797()) {
			this.field4036 = var1;
			this.field4037 = var2;
			return false;
		} else {
			int var3 = this.field4036;
			int var4 = this.field4037;
			int var5 = Math.max(0, this.field4019.method9280() - this.field4020 + 2);
			int var6 = Math.max(0, this.field4019.method9350() - this.field4035 + 1);
			this.field4036 = Math.max(0, Math.min(var5, var1));
			this.field4037 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field4036 || var4 != this.field4037;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-770649771"
	)
	public boolean method7590(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field4019.method9268(var1, var2) : false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1457507081"
	)
	public void method7591(int var1) {
		this.field4019.method9269(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1777404381"
	)
	public boolean method7592(int var1) {
		this.field4027 = var1;
		String var2 = this.field4019.method9267();
		int var3 = var2.length();
		var2 = this.method7813(var2);
		if (var2.length() != var3) {
			this.field4019.method9352(var2);
			this.method7589(this.field4036, this.field4037);
			this.method7723();
			this.method7656();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1817685062"
	)
	public void method7688() {
		this.field4024 = false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1223245402"
	)
	public boolean method7594(int var1) {
		if (this.method7657(var1)) {
			this.method7599();
			class459 var2 = this.field4019.method9367((char)var1, this.field4028, this.field4022);
			this.method7601(var2.method9411(), var2.method9411());
			this.method7723();
			this.method7656();
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "203750089"
	)
	public void method7595() {
		if (!this.method7599() && this.field4028 > 0) {
			int var1 = this.field4019.method9276(this.field4028 - 1);
			this.method7656();
			this.method7601(var1, var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "829548908"
	)
	public void method7596() {
		if (!this.method7599() && this.field4028 < this.field4019.method9264()) {
			int var1 = this.field4019.method9276(this.field4028);
			this.method7656();
			this.method7601(var1, var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2019478119"
	)
	public void method7597() {
		if (!this.method7599() && this.field4028 > 0) {
			class553 var1 = this.method7649(this.field4028 - 1);
			int var2 = this.field4019.method9277((Integer)var1.field5652, this.field4028);
			this.method7656();
			this.method7601(var2, var2);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1514732049"
	)
	public void method7824() {
		if (!this.method7599() && this.field4028 < this.field4019.method9264()) {
			class553 var1 = this.method7649(this.field4028);
			int var2 = this.field4019.method9277(this.field4028, (Integer)var1.field5651);
			this.method7656();
			this.method7601(var2, var2);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "36595032"
	)
	boolean method7599() {
		if (!this.method7646()) {
			return false;
		} else {
			int var1 = this.field4019.method9277(this.field4021, this.field4028);
			this.method7656();
			this.method7601(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1752759867"
	)
	public void method7600() {
		this.method7601(0, this.field4019.method9264());
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1194855101"
	)
	public boolean method7601(int var1, int var2) {
		if (!this.method7797()) {
			this.field4021 = var1;
			this.field4028 = var2;
			return false;
		} else {
			if (var1 > this.field4019.method9264()) {
				var1 = this.field4019.method9264();
			}

			if (var2 > this.field4019.method9264()) {
				var2 = this.field4019.method9264();
			}

			boolean var3 = this.field4021 != var1 || var2 != this.field4028;
			this.field4021 = var1;
			if (var2 != this.field4028) {
				this.field4028 = var2;
				this.field4023 = 0;
				this.method7654();
			}

			if (var3 && this.field4039 != null) {
				this.field4039.vmethod7454();
			}

			return var3;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1273914963"
	)
	public void method7787(boolean var1) {
		class553 var2 = this.method7842(this.field4028);
		this.method7652((Integer)var2.field5652, var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-23994"
	)
	public void method7834(boolean var1) {
		class553 var2 = this.method7842(this.field4028);
		this.method7652((Integer)var2.field5651, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "121246742"
	)
	public void method7603(boolean var1) {
		this.method7652(0, var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1740984817"
	)
	public void method7738(boolean var1) {
		this.method7652(this.field4019.method9264(), var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-341512513"
	)
	public void method7641(boolean var1) {
		if (this.method7646() && !var1) {
			this.method7652(Math.min(this.field4021, this.field4028), var1);
		} else if (this.field4028 > 0) {
			this.method7652(this.field4028 - 1, var1);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1219669228"
	)
	public void method7606(boolean var1) {
		if (this.method7646() && !var1) {
			this.method7652(Math.max(this.field4021, this.field4028), var1);
		} else if (this.field4028 < this.field4019.method9264()) {
			this.method7652(this.field4028 + 1, var1);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-81418096"
	)
	public void method7607(boolean var1) {
		if (this.field4028 > 0) {
			class553 var2 = this.method7649(this.field4028 - 1);
			this.method7652((Integer)var2.field5652, var1);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "120"
	)
	public void method7608(boolean var1) {
		if (this.field4028 < this.field4019.method9264()) {
			class553 var2 = this.method7649(this.field4028 + 1);
			this.method7652((Integer)var2.field5651, var1);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "908269233"
	)
	public void method7609(boolean var1) {
		if (this.field4028 > 0) {
			this.method7652(this.field4019.method9279(this.field4028, -1), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "150716395"
	)
	public void method7610(boolean var1) {
		if (this.field4028 < this.field4019.method9264()) {
			this.method7652(this.field4019.method9279(this.field4028, 1), var1);
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1679017136"
	)
	public void method7763(boolean var1) {
		if (this.field4028 > 0) {
			int var2 = this.method7653();
			this.method7652(this.field4019.method9279(this.field4028, -var2), var1);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1530249351"
	)
	public void method7612(boolean var1) {
		if (this.field4028 < this.field4019.method9264()) {
			int var2 = this.method7653();
			this.method7652(this.field4019.method9279(this.field4028, var2), var1);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1908310262"
	)
	public void method7613(boolean var1) {
		class462 var2 = this.field4019.method9378(0, this.field4028);
		class553 var3 = var2.method9537();
		this.method7652(this.field4019.method9278((Integer)var3.field5652, this.field4037), var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-769708368"
	)
	public void method7693(boolean var1) {
		class462 var2 = this.field4019.method9378(0, this.field4028);
		class553 var3 = var2.method9537();
		this.method7652(this.field4019.method9278((Integer)var3.field5652, this.field4037 + this.field4035), var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "95"
	)
	public void method7615(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class553 var6;
		int var8;
		if (!this.field4024) {
			var8 = 0;
		} else {
			var1 += this.field4036;
			var2 += this.field4037;
			var6 = this.method7658();
			var8 = this.field4019.method9278(var1 - (Integer)var6.field5652, var2 - (Integer)var6.field5651);
		}

		if (var3 && var4) {
			this.field4026 = 1;
			var6 = this.method7649(var8);
			class553 var7 = this.method7649(this.field4030);
			this.method7648(var7, var6);
		} else if (var3) {
			this.field4026 = 1;
			var6 = this.method7649(var8);
			this.method7601((Integer)var6.field5652, (Integer)var6.field5651);
			this.field4030 = (Integer)var6.field5652;
		} else if (var4) {
			this.method7601(this.field4030, var8);
		} else {
			if (this.field4016 > 0 && var8 == this.field4030) {
				if (this.field4028 == this.field4021) {
					this.field4026 = 1;
					var6 = this.method7649(var8);
					this.method7601((Integer)var6.field5652, (Integer)var6.field5651);
				} else {
					this.field4026 = 2;
					var6 = this.method7842(var8);
					this.method7601((Integer)var6.field5652, (Integer)var6.field5651);
				}
			} else {
				this.field4026 = 0;
				this.method7601(var8, var8);
				this.field4030 = var8;
			}

			this.field4016 = 25;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-28"
	)
	public void method7616(int var1, int var2) {
		if (this.field4024 && this.method7753()) {
			var1 += this.field4036;
			var2 += this.field4037;
			class553 var3 = this.method7658();
			int var4 = this.field4019.method9278(var1 - (Integer)var3.field5652, var2 - (Integer)var3.field5651);
			class553 var5;
			class553 var6;
			switch(this.field4026) {
			case 0:
				this.method7601(this.field4021, var4);
				break;
			case 1:
				var5 = this.method7649(this.field4030);
				var6 = this.method7649(var4);
				this.method7648(var5, var6);
				break;
			case 2:
				var5 = this.method7842(this.field4030);
				var6 = this.method7842(var4);
				this.method7648(var5, var6);
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "-1660040033"
	)
	public void method7820(Clipboard var1) {
		class462 var2 = this.field4019.method9378(this.field4021, this.field4028);
		if (!var2.method9533()) {
			String var3 = var2.method9531();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-8"
	)
	public void method7739(Clipboard var1) {
		if (this.method7646()) {
			this.method7820(var1);
			this.method7599();
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "108"
	)
	public void method7619(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7813((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7599();
				class459 var4 = this.field4019.method9363(var3, this.field4028, this.field4022);
				this.method7601(var4.method9411(), var4.method9411());
				this.method7723();
				this.method7656();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1150733838"
	)
	public void method7620() {
		this.field4037 = Math.max(0, this.field4037 - this.field4019.method9353());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	public void method7621() {
		int var1 = Math.max(0, this.field4019.method9350() - this.field4035);
		this.field4037 = Math.min(var1, this.field4037 + this.field4019.method9353());
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnf;B)V",
		garbageValue = "5"
	)
	public void method7790(class355 var1) {
		this.field4038 = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)V",
		garbageValue = "-917941380"
	)
	public void method7747(class355 var1) {
		this.field4039 = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-1126371035"
	)
	public class458 method7624() {
		return this.field4019;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "1500592321"
	)
	public class458 method7664() {
		return this.field4032;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lrh;",
		garbageValue = "-1315513750"
	)
	public class462 method7626() {
		return this.field4019.method9378(this.field4021, this.field4028);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "37"
	)
	public boolean method7753() {
		return this.field4013;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-44"
	)
	public boolean method7611() {
		return this.field4018;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1773528845"
	)
	public boolean method7629() {
		return this.method7753() && this.field4023 % 60 < 30;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1647484601"
	)
	public int method7630() {
		return this.field4028;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "236684267"
	)
	public int method7631() {
		return this.field4021;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-122731800"
	)
	public boolean method7797() {
		return this.field4024;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	public int method7767() {
		return this.field4036;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	public int method7717() {
		return this.field4037;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	public int method7635() {
		return this.field4019.method9373();
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "433447528"
	)
	public int method7636() {
		return this.field4019.method9287();
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1499356776"
	)
	public int method7637() {
		return this.field4033;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	public int method7795() {
		return this.field4025;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1017874152"
	)
	public void method7628(int var1) {
		this.field4025 = var1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "9991678"
	)
	public int method7640() {
		return this.field4019.method9303();
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	public void method7729(int var1) {
		this.field4019.method9326(var1);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1824749367"
	)
	public int method7642() {
		return this.field4027;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574254523"
	)
	public int method7639() {
		return this.field4019.method9388();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-286155393"
	)
	public void method7644(int var1) {
		this.field4019.method9266(var1);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-923342161"
	)
	public boolean method7694() {
		return this.method7636() > 1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	boolean method7646() {
		return this.field4021 != this.field4028;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2025845133"
	)
	String method7813(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7657(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lvk;Lvk;B)V",
		garbageValue = "-54"
	)
	void method7648(class553 var1, class553 var2) {
		if ((Integer)var2.field5652 < (Integer)var1.field5652) {
			this.method7601((Integer)var1.field5651, (Integer)var2.field5652);
		} else {
			this.method7601((Integer)var1.field5652, (Integer)var2.field5651);
		}

	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Lvk;",
		garbageValue = "142798728"
	)
	class553 method7649(int var1) {
		int var2 = this.field4019.method9264();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7638(this.field4019.method9260(var5 - 1).field5125)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7638(this.field4019.method9260(var5).field5125)) {
				var4 = var5;
				break;
			}
		}

		return new class553(var3, var4);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvk;",
		garbageValue = "1575821571"
	)
	class553 method7842(int var1) {
		int var2 = this.field4019.method9264();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field4019.method9260(var5 - 1).field5125 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field4019.method9260(var5).field5125 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class553(var3, var4);
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	boolean method7723() {
		if (!this.method7797()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field4019.method9264() > this.field4033) {
				this.field4019.method9277(this.field4033, this.field4019.method9264());
				var1 = true;
			}

			int var2 = this.method7636();
			int var3;
			if (this.field4019.method9283() > var2) {
				var3 = this.field4019.method9279(0, var2) - 1;
				this.field4019.method9277(var3, this.field4019.method9264());
				var1 = true;
			}

			if (var1) {
				var3 = this.field4028;
				int var4 = this.field4021;
				int var5 = this.field4019.method9264();
				if (this.field4028 > var5) {
					var3 = var5;
				}

				if (this.field4021 > var5) {
					var4 = var5;
				}

				this.method7601(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1372679672"
	)
	void method7652(int var1, boolean var2) {
		if (var2) {
			this.method7601(this.field4021, var1);
		} else {
			this.method7601(var1, var1);
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2008161514"
	)
	int method7653() {
		return this.field4035 / this.field4019.method9353();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	void method7654() {
		class462 var1 = this.field4019.method9378(0, this.field4028);
		class553 var2 = var1.method9537();
		int var3 = this.field4019.method9353();
		int var4 = (Integer)var2.field5652 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5651 - 3;
		int var7 = var3 + var6 + 6;
		int var8 = this.field4036;
		int var9 = var8 + this.field4020;
		int var10 = this.field4037;
		int var11 = var10 + this.field4035;
		int var12 = this.field4036;
		int var13 = this.field4037;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field4020;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field4035;
		}

		this.method7589(var12, var13);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1909779531"
	)
	boolean method7638(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2045920204"
	)
	void method7656() {
		if (this.field4038 != null) {
			this.field4038.vmethod7454();
		}

	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "696462709"
	)
	boolean method7657(int var1) {
		switch(this.field4027) {
		case 1:
			return class359.isAlphaNumeric((char)var1);
		case 2:
			return SpotAnimationDefinition.isCharAlphabetic((char)var1);
		case 3:
			return class312.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class312.isDigit(var2)) {
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

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(B)Lvk;",
		garbageValue = "63"
	)
	class553 method7658() {
		int var1 = this.field4019.method9306(this.field4020);
		int var2 = this.field4019.method9293(this.field4035);
		return new class553(var1, var2);
	}
}
