import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class392 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1767929617
	)
	int field4841;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -883261445
	)
	int field4842;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 674999191
	)
	int field4843;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 334577551
	)
	int field4844;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2034889953
	)
	int field4845;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2066425043
	)
	int field4835;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 921756565
	)
	int field4839;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	public void method8228() {
		this.field4841 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-804930991"
	)
	public boolean method8229() {
		return this.field4841 != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-26080"
	)
	public int method8230() {
		return this.field4841;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	public int method8231() {
		return this.field4842;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1282567917"
	)
	public int method8250() {
		return this.field4843;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "835459243"
	)
	public int method8235() {
		return this.field4844;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	public int method8232() {
		return this.field4845;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-978517788"
	)
	public int method8234() {
		return this.field4835;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1238636034"
	)
	public int method8246() {
		return this.field4839;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1015716018"
	)
	public void method8236(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		switch(var2) {
		case 1:
			this.field4841 = 1;
			break;
		case 2:
			this.field4845 = 64;
			this.field4835 = 64;
			this.field4841 = 2;
			break;
		case 3:
			this.field4845 = 0;
			this.field4835 = 64;
			this.field4841 = 2;
			break;
		case 4:
			this.field4845 = 128;
			this.field4835 = 64;
			this.field4841 = 2;
			break;
		case 5:
			this.field4845 = 64;
			this.field4835 = 0;
			this.field4841 = 2;
			break;
		case 6:
			this.field4845 = 64;
			this.field4835 = 128;
			this.field4841 = 2;
		case 7:
		case 8:
		case 9:
		default:
			break;
		case 10:
			this.field4841 = 3;
			break;
		case 11:
			this.field4841 = 4;
		}

		switch(this.field4841) {
		case 0:
			break;
		case 1:
		case 3:
			this.field4842 = var1.readUnsignedShort();
			break;
		case 2:
			this.field4843 = var1.readUnsignedShort();
			this.field4844 = var1.readUnsignedShort();
			this.field4839 = var1.readUnsignedByte();
			break;
		case 4:
			this.field4842 = var1.readUnsignedShort();
			this.field4839 = var1.readMedium();
			break;
		default:
			throw new RuntimeException("");
		}

	}
}
