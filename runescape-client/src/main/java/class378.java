import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class378 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class470 field4170;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	class470 field4167;
	@ObfuscatedName("ah")
	boolean field4172;
	@ObfuscatedName("al")
	boolean field4181;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 480497051
	)
	int field4174;
	@ObfuscatedName("am")
	boolean field4175;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2025484615
	)
	int field4188;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 740051357
	)
	int field4177;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1818353789
	)
	int field4178;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -178140633
	)
	int field4187;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1141616381
	)
	int field4163;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -622649611
	)
	int field4164;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1304772649
	)
	int field4182;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1011709939
	)
	int field4183;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -751218173
	)
	int field4176;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -669313229
	)
	int field4179;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 940467603
	)
	int field4186;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1159242269
	)
	int field4184;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1144344585
	)
	int field4185;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	class369 field4189;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	class369 field4190;

	class378() {
		this.field4170 = new class470();
		this.field4167 = new class470();
		this.field4172 = false;
		this.field4181 = true;
		this.field4174 = 0;
		this.field4175 = false;
		this.field4188 = 0;
		this.field4177 = 0;
		this.field4178 = 0;
		this.field4187 = 0;
		this.field4163 = 0;
		this.field4164 = 0;
		this.field4182 = 0;
		this.field4183 = Integer.MAX_VALUE;
		this.field4176 = Integer.MAX_VALUE;
		this.field4179 = 0;
		this.field4186 = 0;
		this.field4184 = 0;
		this.field4185 = 0;
		this.field4170.method9677(1);
		this.field4167.method9677(1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "876669541"
	)
	void method8097() {
		this.field4174 = (this.field4174 + 1) % 60;
		if (this.field4182 > 0) {
			--this.field4182;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1485355144"
	)
	public boolean method7840(boolean var1) {
		var1 = var1 && this.field4181;
		boolean var2 = this.field4172 != var1;
		this.field4172 = var1;
		if (!this.field4172) {
			this.method7861(this.field4187, this.field4187);
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1084889504"
	)
	public void method7841(boolean var1) {
		this.field4181 = var1;
		this.field4172 = var1 && this.field4172;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-553575018"
	)
	public boolean method7842(String var1) {
		String var2 = this.field4170.method9578();
		if (!var2.equals(var1)) {
			var1 = this.method7908(var1);
			this.field4170.method9591(var1);
			this.method7861(this.field4163, this.field4187);
			this.method7849(this.field4184, this.field4185);
			this.method7912();
			this.method7916();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-299558079"
	)
	boolean method7843(String var1) {
		this.field4167.method9591(var1);
		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsl;B)Z",
		garbageValue = "-3"
	)
	boolean method7844(AbstractFont var1) {
		boolean var2 = !this.field4175;
		this.field4170.method9595(var1);
		this.field4167.method9595(var1);
		this.field4175 = true;
		var2 |= this.method7849(this.field4184, this.field4185);
		var2 |= this.method7861(this.field4163, this.field4187);
		if (this.method7912()) {
			this.method7916();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "353138520"
	)
	public boolean method7880(int var1, int var2) {
		boolean var3 = this.field4179 != var1 || var2 != this.field4186;
		this.field4179 = var1;
		this.field4186 = var2;
		var3 |= this.method7849(this.field4184, this.field4185);
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1560077076"
	)
	public boolean method7846(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var2 = var1 == this.field4170.method9598();
		this.field4170.method9599(var1);
		this.field4167.method9599(var1);
		if (this.method7912()) {
			this.method7916();
			var2 = true;
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1088391311"
	)
	public boolean method8042(int var1) {
		this.field4170.method9601(var1);
		if (this.method7912()) {
			this.method7916();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "650447443"
	)
	public boolean method8070(int var1) {
		this.field4176 = var1;
		if (this.method7912()) {
			this.method7916();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-786766434"
	)
	public boolean method7849(int var1, int var2) {
		if (!this.method8105()) {
			this.field4184 = var1;
			this.field4185 = var2;
			return false;
		} else {
			int var3 = this.field4184;
			int var4 = this.field4185;
			int var5 = Math.max(0, this.field4170.method9593() - this.field4179 + 2);
			int var6 = Math.max(0, this.field4170.method9594() - this.field4186 + 1);
			this.field4184 = Math.max(0, Math.min(var5, var1));
			this.field4185 = Math.max(0, Math.min(var6, var2));
			return var3 != this.field4184 || var4 != this.field4185;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2033556037"
	)
	public boolean method7850(int var1, int var2) {
		boolean var3 = true;
		if (var1 < 0 || var1 > 2) {
			var3 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var3 = false;
		}

		return var3 ? this.field4170.method9656(var1, var2) : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "418519100"
	)
	public void method7962(int var1) {
		this.field4170.method9582(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1677752388"
	)
	public boolean method7931(int var1) {
		this.field4178 = var1;
		String var2 = this.field4170.method9578();
		int var3 = var2.length();
		var2 = this.method7908(var2);
		if (var2.length() != var3) {
			this.field4170.method9591(var2);
			this.method7849(this.field4184, this.field4185);
			this.method7912();
			this.method7916();
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-49005836"
	)
	public void method8025() {
		this.field4175 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1503787921"
	)
	public boolean method7854(int var1) {
		if (this.method7896(var1)) {
			this.method7859();
			class471 var2 = this.field4170.method9584((char)var1, this.field4187, this.field4183);
			this.method7861(var2.method9717(), var2.method9717());
			this.method7912();
			this.method7916();
		}

		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	public void method7855() {
		if (!this.method7859() && this.field4187 > 0) {
			int var1 = this.field4170.method9589(this.field4187 - 1);
			this.method7916();
			this.method7861(var1, var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101183389"
	)
	public void method7856() {
		if (!this.method7859() && this.field4187 < this.field4170.method9660()) {
			int var1 = this.field4170.method9589(this.field4187);
			this.method7916();
			this.method7861(var1, var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	public void method7949() {
		if (!this.method7859() && this.field4187 > 0) {
			class569 var1 = this.method7910(this.field4187 - 1);
			int var2 = this.field4170.method9590((Integer)var1.field5876, this.field4187);
			this.method7916();
			this.method7861(var2, var2);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1492606201"
	)
	public void method7879() {
		if (!this.method7859() && this.field4187 < this.field4170.method9660()) {
			class569 var1 = this.method7910(this.field4187);
			int var2 = this.field4170.method9590(this.field4187, (Integer)var1.field5875);
			this.method7916();
			this.method7861(var2, var2);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1189133353"
	)
	boolean method7859() {
		if (!this.method8076()) {
			return false;
		} else {
			int var1 = this.field4170.method9590(this.field4163, this.field4187);
			this.method7916();
			this.method7861(var1, var1);
			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1492942189"
	)
	public void method7860() {
		this.method7861(0, this.field4170.method9660());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "825251314"
	)
	public boolean method7861(int var1, int var2) {
		if (!this.method8105()) {
			this.field4163 = var1;
			this.field4187 = var2;
			return false;
		} else {
			if (var1 > this.field4170.method9660()) {
				var1 = this.field4170.method9660();
			}

			if (var2 > this.field4170.method9660()) {
				var2 = this.field4170.method9660();
			}

			boolean var3 = this.field4163 != var1 || var2 != this.field4187;
			this.field4163 = var1;
			if (var2 != this.field4187) {
				this.field4187 = var2;
				this.field4174 = 0;
				this.method7914();
			}

			if (var3 && this.field4190 != null) {
				this.field4190.vmethod7725();
			}

			return var3;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1674472240"
	)
	public void method7862(boolean var1) {
		class569 var2 = this.method7911(this.field4187);
		this.method7913((Integer)var2.field5876, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1480375003"
	)
	public void method7863(boolean var1) {
		class569 var2 = this.method7911(this.field4187);
		this.method7913((Integer)var2.field5875, var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "832672929"
	)
	public void method7864(boolean var1) {
		this.method7913(0, var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1509478464"
	)
	public void method7865(boolean var1) {
		this.method7913(this.field4170.method9660(), var1);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1612551013"
	)
	public void method7866(boolean var1) {
		if (this.method8076() && !var1) {
			this.method7913(Math.min(this.field4163, this.field4187), var1);
		} else if (this.field4187 > 0) {
			this.method7913(this.field4187 - 1, var1);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-327983032"
	)
	public void method7867(boolean var1) {
		if (this.method8076() && !var1) {
			this.method7913(Math.max(this.field4163, this.field4187), var1);
		} else if (this.field4187 < this.field4170.method9660()) {
			this.method7913(this.field4187 + 1, var1);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-900931832"
	)
	public void method7868(boolean var1) {
		if (this.field4187 > 0) {
			class569 var2 = this.method7910(this.field4187 - 1);
			this.method7913((Integer)var2.field5876, var1);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1145064746"
	)
	public void method8018(boolean var1) {
		if (this.field4187 < this.field4170.method9660()) {
			class569 var2 = this.method7910(this.field4187 + 1);
			this.method7913((Integer)var2.field5875, var1);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "75"
	)
	public void method7870(boolean var1) {
		if (this.field4187 > 0) {
			this.method7913(this.field4170.method9592(this.field4187, -1), var1);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-680518357"
	)
	public void method7839(boolean var1) {
		if (this.field4187 < this.field4170.method9660()) {
			this.method7913(this.field4170.method9592(this.field4187, 1), var1);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-52"
	)
	public void method7988(boolean var1) {
		if (this.field4187 > 0) {
			int var2 = this.method7857();
			this.method7913(this.field4170.method9592(this.field4187, -var2), var1);
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2014172463"
	)
	public void method7873(boolean var1) {
		if (this.field4187 < this.field4170.method9660()) {
			int var2 = this.method7857();
			this.method7913(this.field4170.method9592(this.field4187, var2), var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-20"
	)
	public void method7874(boolean var1) {
		class474 var2 = this.field4170.method9655(0, this.field4187);
		class569 var3 = var2.method9855();
		this.method7913(this.field4170.method9659((Integer)var3.field5876, this.field4185), var1);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-92"
	)
	public void method7875(boolean var1) {
		class474 var2 = this.field4170.method9655(0, this.field4187);
		class569 var3 = var2.method9855();
		this.method7913(this.field4170.method9659((Integer)var3.field5876, this.field4185 + this.field4186), var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1718147780"
	)
	public void method8075(int var1, int var2, boolean var3, boolean var4) {
		boolean var5 = false;
		class569 var6;
		int var8;
		if (!this.field4175) {
			var8 = 0;
		} else {
			var1 += this.field4184;
			var2 += this.field4185;
			var6 = this.method7918();
			var8 = this.field4170.method9659(var1 - (Integer)var6.field5876, var2 - (Integer)var6.field5875);
		}

		if (var3 && var4) {
			this.field4177 = 1;
			var6 = this.method7910(var8);
			class569 var7 = this.method7910(this.field4164);
			this.method7909(var7, var6);
		} else if (var3) {
			this.field4177 = 1;
			var6 = this.method7910(var8);
			this.method7861((Integer)var6.field5876, (Integer)var6.field5875);
			this.field4164 = (Integer)var6.field5876;
		} else if (var4) {
			this.method7861(this.field4164, var8);
		} else {
			if (this.field4182 > 0 && var8 == this.field4164) {
				if (this.field4187 == this.field4163) {
					this.field4177 = 1;
					var6 = this.method7910(var8);
					this.method7861((Integer)var6.field5876, (Integer)var6.field5875);
				} else {
					this.field4177 = 2;
					var6 = this.method7911(var8);
					this.method7861((Integer)var6.field5876, (Integer)var6.field5875);
				}
			} else {
				this.field4177 = 0;
				this.method7861(var8, var8);
				this.field4164 = var8;
			}

			this.field4182 = 25;
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-658285040"
	)
	public void method8022(int var1, int var2) {
		if (this.field4175 && this.method7888()) {
			var1 += this.field4184;
			var2 += this.field4185;
			class569 var3 = this.method7918();
			int var4 = this.field4170.method9659(var1 - (Integer)var3.field5876, var2 - (Integer)var3.field5875);
			class569 var5;
			class569 var6;
			switch(this.field4177) {
			case 0:
				this.method7861(this.field4163, var4);
				break;
			case 1:
				var5 = this.method7910(this.field4164);
				var6 = this.method7910(var4);
				this.method7909(var5, var6);
				break;
			case 2:
				var5 = this.method7911(this.field4164);
				var6 = this.method7911(var4);
				this.method7909(var5, var6);
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-24"
	)
	public void method7878(Clipboard var1) {
		class474 var2 = this.field4170.method9655(this.field4163, this.field4187);
		if (!var2.method9836()) {
			String var3 = var2.method9830();
			if (!var3.isEmpty()) {
				var1.setContents(new StringSelection(var3), (ClipboardOwner)null);
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;B)V",
		garbageValue = "-45"
	)
	public void method7871(Clipboard var1) {
		if (this.method8076()) {
			this.method7878(var1);
			this.method7859();
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/datatransfer/Clipboard;I)V",
		garbageValue = "1205453202"
	)
	public void method7952(Clipboard var1) {
		Transferable var2 = var1.getContents((Object)null);
		if (var2 != null && var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var3 = this.method7908((String)var2.getTransferData(DataFlavor.stringFlavor));
				this.method7859();
				class471 var4 = this.field4170.method9671(var3, this.field4187, this.field4183);
				this.method7861(var4.method9717(), var4.method9717());
				this.method7912();
				this.method7916();
			} catch (Exception var5) {
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	public void method8079() {
		this.field4185 = Math.max(0, this.field4185 - this.field4170.method9629());
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1108154501"
	)
	public void method7892() {
		int var1 = Math.max(0, this.field4170.method9594() - this.field4186);
		this.field4185 = Math.min(var1, this.field4185 + this.field4170.method9629());
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "1169539275"
	)
	public void method7883(class369 var1) {
		this.field4189 = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lor;B)V",
		garbageValue = "-92"
	)
	public void method7884(class369 var1) {
		this.field4190 = var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "-431965519"
	)
	public class470 method7885() {
		return this.field4170;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "-999315124"
	)
	public class470 method7886() {
		return this.field4167;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lsi;",
		garbageValue = "-467707491"
	)
	public class474 method8023() {
		return this.field4170.method9655(this.field4163, this.field4187);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7888() {
		return this.field4172;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-54689902"
	)
	public boolean method7889() {
		return this.field4181;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1987300362"
	)
	public boolean method7890() {
		return this.method7888() && this.field4174 % 60 < 30;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1757525191"
	)
	public int method8082() {
		return this.field4187;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-10"
	)
	public int method7848() {
		return this.field4163;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method8105() {
		return this.field4175;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-69"
	)
	public int method7894() {
		return this.field4184;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-16777216"
	)
	public int method7895() {
		return this.field4185;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1759209871"
	)
	public int method7919() {
		return this.field4170.method9598();
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1661104908"
	)
	public int method7852() {
		return this.field4170.method9600();
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	public int method7845() {
		return this.field4176;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	public int method8012() {
		return this.field4188;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "193"
	)
	public void method7900(int var1) {
		this.field4188 = var1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2042530632"
	)
	public int method7901() {
		return this.field4170.method9614();
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	public void method7902(int var1) {
		this.field4170.method9677(var1);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public int method8051() {
		return this.field4178;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2067649854"
	)
	public int method7904() {
		return this.field4170.method9604();
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-10267897"
	)
	public void method7905(int var1) {
		this.field4170.method9572(var1);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024894629"
	)
	public boolean method7906() {
		return this.method7852() > 1;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1339616614"
	)
	boolean method8076() {
		return this.field4187 != this.field4163;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "39"
	)
	String method7908(String var1) {
		StringBuilder var2 = new StringBuilder(var1.length());

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			char var4 = var1.charAt(var3);
			if (this.method7896(var4)) {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Lvp;Lvp;I)V",
		garbageValue = "1577288369"
	)
	void method7909(class569 var1, class569 var2) {
		if ((Integer)var2.field5876 < (Integer)var1.field5876) {
			this.method7861((Integer)var1.field5875, (Integer)var2.field5876);
		} else {
			this.method7861((Integer)var1.field5876, (Integer)var2.field5875);
		}

	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)Lvp;",
		garbageValue = "-1780201923"
	)
	class569 method7910(int var1) {
		int var2 = this.field4170.method9660();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.method7915(this.field4170.method9573(var5 - 1).field5322)) {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.method7915(this.field4170.method9573(var5).field5322)) {
				var4 = var5;
				break;
			}
		}

		return new class569(var3, var4);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvp;",
		garbageValue = "0"
	)
	class569 method7911(int var1) {
		int var2 = this.field4170.method9660();
		int var3 = 0;
		int var4 = var2;

		int var5;
		for (var5 = var1; var5 > 0; --var5) {
			if (this.field4170.method9573(var5 - 1).field5322 == '\n') {
				var3 = var5;
				break;
			}
		}

		for (var5 = var1; var5 < var2; ++var5) {
			if (this.field4170.method9573(var5).field5322 == '\n') {
				var4 = var5;
				break;
			}
		}

		return new class569(var3, var4);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "119"
	)
	boolean method7912() {
		if (!this.method8105()) {
			return false;
		} else {
			boolean var1 = false;
			if (this.field4170.method9660() > this.field4176) {
				this.field4170.method9590(this.field4176, this.field4170.method9660());
				var1 = true;
			}

			int var2 = this.method7852();
			int var3;
			if (this.field4170.method9596() > var2) {
				var3 = this.field4170.method9592(0, var2) - 1;
				this.field4170.method9590(var3, this.field4170.method9660());
				var1 = true;
			}

			if (var1) {
				var3 = this.field4187;
				int var4 = this.field4163;
				int var5 = this.field4170.method9660();
				if (this.field4187 > var5) {
					var3 = var5;
				}

				if (this.field4163 > var5) {
					var4 = var5;
				}

				this.method7861(var4, var3);
			}

			return var1;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "512"
	)
	void method7913(int var1, boolean var2) {
		if (var2) {
			this.method7861(this.field4163, var1);
		} else {
			this.method7861(var1, var1);
		}

	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "536027292"
	)
	int method7857() {
		return this.field4186 / this.field4170.method9629();
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	void method7914() {
		class474 var1 = this.field4170.method9655(0, this.field4187);
		class569 var2 = var1.method9855();
		int var3 = this.field4170.method9629();
		int var4 = (Integer)var2.field5876 - 10;
		int var5 = var4 + 20;
		int var6 = (Integer)var2.field5875 - 3;
		int var7 = var6 + var3 + 6;
		int var8 = this.field4184;
		int var9 = var8 + this.field4179;
		int var10 = this.field4185;
		int var11 = var10 + this.field4186;
		int var12 = this.field4184;
		int var13 = this.field4185;
		if (var4 < var8) {
			var12 = var4;
		} else if (var5 > var9) {
			var12 = var5 - this.field4179;
		}

		if (var6 < var10) {
			var13 = var6;
		} else if (var7 > var11) {
			var13 = var7 - this.field4186;
		}

		this.method7849(var12, var13);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1109300748"
	)
	boolean method7915(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method7916() {
		if (this.field4189 != null) {
			this.field4189.vmethod7725();
		}

	}

	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-945420230"
	)
	boolean method7896(int var1) {
		switch(this.field4178) {
		case 1:
			return class189.isAlphaNumeric((char)var1);
		case 2:
			return ServerPacket.isCharAlphabetic((char)var1);
		case 3:
			return class341.isDigit((char)var1);
		case 4:
			char var2 = (char)var1;
			if (class341.isDigit(var2)) {
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

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(I)Lvp;",
		garbageValue = "-857058962"
	)
	class569 method7918() {
		int var1 = this.field4170.method9649(this.field4179);
		int var2 = this.field4170.method9606(this.field4186);
		return new class569(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;B)V",
		garbageValue = "-56"
	)
	public static void method7970(AbstractArchive var0) {
		class190.ParamDefinition_archive = var0;
	}
}
