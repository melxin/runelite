import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class203 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	static EvictingDualNodeHashTable field2237;
	@ObfuscatedName("ah")
	public String field2233;
	@ObfuscatedName("ab")
	public String[] field2234;
	@ObfuscatedName("ax")
	public boolean field2245;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -136691131
	)
	int field2236;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2019168977
	)
	int field2230;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1832927731
	)
	int field2238;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -695348019
	)
	int field2239;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1523041975
	)
	int field2240;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1189323439
	)
	int field2241;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	class586 field2242;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lwm;"
	)
	class586[] field2235;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -389978943
	)
	int field2244;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1668257149
	)
	int field2222;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class398 field2232;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	class380 field2247;

	static {
		field2237 = new EvictingDualNodeHashTable(64);
	}

	class203() {
		this.field2233 = "null";
		this.field2234 = new String[5];
		this.field2245 = false;
		this.field2236 = 0;
		this.field2230 = 0;
		this.field2238 = 0;
		this.field2239 = 0;
		this.field2240 = 0;
		this.field2241 = 0;
		this.field2235 = new class586[4];
		this.field2244 = -1;
		this.field2222 = 0;
		this.field2232 = class398.field4838;
		this.field2247 = class380.field4371;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "948630271"
	)
	public int method4447() {
		return this.field2244;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "1"
	)
	void method4448(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4449(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "1350581480"
	)
	void method4449(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2222 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		case 21:
		case 22:
		default:
			break;
		case 4:
			this.field2236 = var1.readShort();
			break;
		case 5:
			this.field2230 = var1.readShort();
			break;
		case 6:
			this.field2238 = var1.readShort();
			break;
		case 7:
			this.field2239 = var1.readShort();
			break;
		case 8:
			this.field2240 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2241 = var1.readUnsignedShort();
			break;
		case 12:
			this.field2233 = var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2245 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var4 = var2 - 15;
			this.field2234[var4] = var1.readStringCp1252NullTerminated();
			if (this.field2234[var4].equalsIgnoreCase("Hidden")) {
				this.field2234[var4] = null;
			}

			this.field2245 = true;
			break;
		case 20:
			var1.readUnsignedShort();
			break;
		case 23:
			this.field2232 = (class398)class173.findEnumerated(class381.method8177(), var1.readUnsignedByte());
			break;
		case 24:
			class380[] var3 = new class380[]{class380.field4374, class380.field4378, class380.field4373};
			this.field2247 = (class380)class173.findEnumerated(var3, var1.readUnsignedByte());
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1211747536"
	)
	void method4473() {
		this.field2242 = new class586(this.field2240, this.field2241, this.field2238, this.field2239);
		this.method4451();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2111540176"
	)
	void method4451() {
		short var1 = 256;
		this.field2235[0] = new class586(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2239);
		var1 = 362;
		this.field2235[2] = new class586(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2239);
		var1 = 334;
		this.field2235[1] = new class586(var1 + this.field2240, var1 + this.field2241, this.field2238, this.field2239);
		this.field2235[3] = this.field2235[1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	public int method4452() {
		return this.field2222;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "274341573"
	)
	public int method4453() {
		return this.field2236;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	public int method4454() {
		return this.field2230;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lwm;",
		garbageValue = "1887393618"
	)
	public class586 method4455() {
		return this.field2242;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "-111713135"
	)
	public class398 method4456() {
		return this.field2232;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Loh;",
		garbageValue = "-213606601"
	)
	public class380 method4457() {
		return this.field2247;
	}
}
