import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public class class462 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	class458 field5152;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2032191563
	)
	int field5151;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219177175
	)
	int field5153;

	@ObfuscatedSignature(
		descriptor = "(Lrx;II)V"
	)
	class462(class458 var1, int var2, int var3) {
		this.field5151 = 0;
		this.field5153 = 0;
		this.field5152 = var1;
		this.field5151 = var2;
		this.field5153 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2115348481"
	)
	public String method9531() {
		if (this.method9533()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method9534());

			for (int var2 = this.field5151; var2 < this.field5153; ++var2) {
				class460 var3 = this.field5152.method9260(var2);
				var1.append(var3.field5125);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1308057029"
	)
	boolean method9551(int var1) {
		return this.field5152.method9388() == 2 || this.field5152.method9388() == 1 && (!this.field5152.field5108 || this.field5153 - 1 != var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-251418078"
	)
	public boolean method9533() {
		return this.field5151 == this.field5153;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2110607692"
	)
	public int method9534() {
		return this.field5153 - this.field5151;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrn;I)Z",
		garbageValue = "-602712499"
	)
	boolean method9555(class460 var1) {
		if (this.field5152.field5114 == 2) {
			return true;
		} else if (this.field5152.field5114 == 0) {
			return false;
		} else {
			return this.field5152.method9261() != var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	int method9536() {
		if (this.method9533()) {
			return 0;
		} else {
			class460 var1 = this.field5152.method9260(this.field5153 - 1);
			if (var1.field5125 == '\n') {
				return 0;
			} else if (this.method9555(var1)) {
				return this.field5152.field5107.advances[42];
			} else {
				int var2 = this.field5152.field5107.advances[var1.field5125];
				if (var2 == 0) {
					return var1.field5125 == '\t' ? this.field5152.field5107.advances[32] * 3 : this.field5152.field5107.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lvk;",
		garbageValue = "13"
	)
	public class553 method9537() {
		if (this.method9533()) {
			return new class553(0, 0);
		} else {
			class460 var1 = this.field5152.method9260(this.field5153 - 1);
			return new class553(var1.field5124 + this.method9536(), var1.field5126);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lrn;",
		garbageValue = "-16711936"
	)
	public class460 method9546(int var1) {
		return var1 >= 0 && var1 < this.method9534() ? this.field5152.method9260(this.field5151 + var1) : null;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ILjx;I)V",
		garbageValue = "-1373589485"
	)
	static void method9530(WorldView var0, int var1, Model var2) {
		boolean var3 = true;
		float var4 = (float)Client.viewportHeight / 334.0F;
		float var5 = (float)Client.viewportZoom * 4.0F / var4;
		int var6 = Math.max(512, (int)(1400.0F - var5));
		int var7 = Client.field581;
		int var10 = class532.field5477[var1 & 2047];
		double var8 = (double)var10 / 65536.0D;
		var10 = var7 - (int)(var8 * (double)var6);
		int var11 = Client.field492;
		double var12 = (double)WorldMapLabel.method6812(var1) / 65536.0D;
		int var14 = var11 - (int)((double)var6 * var12);
		long var15 = Skills.calculateTag(var0.plane, Coord.method7394(var10), Coord.method7394(var14), 5, false, -1, var0.id);
		var0.scene.drawEntity(var0.plane, var10, var14, Client.field352, 60, var2, var1, var15, false);
	}
}
