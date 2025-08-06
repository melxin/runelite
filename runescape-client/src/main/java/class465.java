import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class465 {
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 645005819
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1901052507
	)
	int field5159;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	SequenceDefinition field5160;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2116322795
	)
	int field5158;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1890024059
	)
	int field5162;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -189665363
	)
	int field5166;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1589498117
	)
	int field5161;

	public class465() {
		this.field5159 = -1;
		this.field5160 = null;
		this.field5162 = -1;
		this.field5166 = 0;
		this.field5161 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrk;B)V",
		garbageValue = "0"
	)
	public void method9591(class465 var1) {
		this.field5160 = var1.field5160;
		this.field5159 = var1.field5159;
		this.field5158 = var1.field5158;
		this.field5162 = var1.field5162;
		this.field5166 = var1.field5166;
		this.field5161 = var1.field5161;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	public void method9604() {
		this.method9569(-1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "1995"
	)
	public void method9569(int var1) {
		if (var1 >= 0) {
			if (this.field5159 != var1) {
				this.field5159 = var1;
				this.field5160 = AsyncHttpResponse.SequenceDefinition_get(var1);
				this.field5161 = 0;
				if (this.field5162 == -1) {
					this.field5162 = 0;
				}
			}
		} else {
			this.field5159 = -1;
			this.field5160 = null;
			this.field5162 = -1;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-315094390"
	)
	public boolean method9570() {
		return this.field5160 != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Liz;",
		garbageValue = "-363043954"
	)
	public SequenceDefinition method9571() {
		return this.field5160;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-114115329"
	)
	public int method9595() {
		return this.field5159;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097232936"
	)
	public int method9573() {
		return this.field5162;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-862288814"
	)
	public int method9574() {
		return this.field5158;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "632496179"
	)
	int method9578() {
		return this.field5166;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-813460718"
	)
	public void method9576() {
		this.field5162 = 0;
		this.field5158 = 0;
		this.field5166 = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1769156026"
	)
	public void method9577() {
		this.field5166 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	public int method9597() {
		return this.field5161;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1988885143"
	)
	void method9579(int var1) {
		this.field5161 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "231"
	)
	public boolean method9601(int var1) {
		return this.method9570() && this.field5161 > 0 && this.field5161 < var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-195198945"
	)
	public boolean method9581() {
		return this.field5160 == null || this.field5160.method4719();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1822121600"
	)
	void method9582(int var1, int var2, int var3) {
		this.field5162 = var1;
		this.field5158 = var2;
		this.field5166 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	void method9583(int var1, int var2) {
		this.field5162 = var1;
		this.field5166 = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-962847969"
	)
	public void method9613() {
		if (this.field5160 != null) {
			if (!this.field5160.isCachedModelIdSet()) {
				this.field5162 = (int)(Math.random() * (double)this.field5160.frameIds.length);
				this.field5158 = (int)(Math.random() * (double)this.field5160.frameLengths[this.field5162]);
			} else {
				this.field5162 = (int)(Math.random() * (double)this.field5160.getMayaAnimFrame());
			}
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-416265386"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class167.widgetDefinition.loadInterface(var0)) {
			class380.updateInterface(class167.widgetDefinition.Widget_interfaceComponents[var0], 0, class167.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
